package com.example.arduinolock;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class Main2Activity extends AppCompatActivity {
    private static final int REQUEST_ENABLE_BT=0;
    private static final int REQUEST_DISABLE_BT=1;
    private static final int REQUEST_DISCOVERABLE_BT=1;





    Button b1,b2,b3,b4;
    BluetoothAdapter mBluetoothAdapter;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        t1=findViewById(R.id.t1);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);

        mBluetoothAdapter=BluetoothAdapter.getDefaultAdapter();
        if(mBluetoothAdapter == null)
        {
            t1.setText("");
            t1.setText("Bluetooth is not available");

        }
        else
        {
            t1.setText("Bluetooth is available");

        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!mBluetoothAdapter.isEnabled()) {
                    t1.setText("");
                    t1.setText("Turned on");
                    Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(intent,REQUEST_ENABLE_BT);
                }
                else
                {

                    t1.setText("Bluetooth is already on");

                }

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBluetoothAdapter.isEnabled()) {
                    Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                    startActivityForResult(intent,REQUEST_DISCOVERABLE_BT);



                }
                else
                {


                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBluetoothAdapter.isEnabled())
                {
                    try {





                        Set<BluetoothDevice> devices = mBluetoothAdapter.getBondedDevices();
                        for (BluetoothDevice device : devices) {
                            t1.setText(device.getName()+","+device);
                        }
                    }
                    catch (Exception e)
                    {e.printStackTrace();}
                }

                else
                {
                    t1.setText("NO ANY DEVICE PAIRED");
                }
            }

        });
            t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(i);
            }
        });
    }

}
