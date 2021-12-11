package com.example.bluetooth1;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.b1);
        Button btn2 = (Button) findViewById(R.id.b2);
        Button btn3 = (Button) findViewById(R.id.b3);
        TextView tv = (TextView) findViewById(R.id.tv2);

        BluetoothAdapter bAdapter = BluetoothAdapter.getDefaultAdapter();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bAdapter == null){
                    Toast.makeText(MainActivity.this, "Bluetooth not supported", Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(!bAdapter.isEnabled()){
                    Intent bintent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                     startActivity(bintent);
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bAdapter.disable();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bAdapter == null){
                    Toast.makeText(MainActivity.this, "Bluetooth not supported", Toast.LENGTH_LONG).show();
                }
                else{
                    final Set<BluetoothDevice> pairedDevices = bAdapter.getBondedDevices();
                    if(pairedDevices.size() > 0){
                        for (BluetoothDevice device: pairedDevices){
                            String Address = device.getAddress();
                            String name = device.getName();
                            tv.setText("Name of the Device: " + name + " Address of the Device " + Address);
                        }
                    }
                }
            }
        });
    }
}