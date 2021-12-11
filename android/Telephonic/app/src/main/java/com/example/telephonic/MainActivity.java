package com.example.telephonic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvv = (TextView) findViewById(R.id.tv1);
        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        String networkCountrycode = tm.getNetworkCountryIso();
        String SIMCountry = tm.getSimCountryIso();

        int phonetype = tm.getPhoneType();
        String phntype = "";
        switch (phonetype){
            case (TelephonyManager.PHONE_TYPE_CDMA):
            phntype = "CDMA";
            break;

            case(TelephonyManager.PHONE_TYPE_GSM):
                phntype = "GSM";
                break;
        }
        boolean isRoaming = tm.isNetworkRoaming();
        String information = "Phone Details\n";
        information +="\nNetwork Country Code ISO:"+networkCountrycode;
        information +="\nNetwork Sim Country ISO:"+SIMCountry;
        information +="\nIf Roaming ? :"+isRoaming;
        information +="\nPhone Type :"+phntype;
        tvv.setText(information);



    }
}