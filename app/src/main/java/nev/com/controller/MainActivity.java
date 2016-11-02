package nev.com.controller;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button accelerate,right,left,reverse,settings;
    private BluetoothAdapter blueth;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accelerate = (Button)findViewById( R.id.accelerate);
        right = (Button)findViewById(R.id.right);
        left = (Button)findViewById(R.id.left);
        reverse = (Button)findViewById(R.id.reverse);
        tb = (ToggleButton)findViewById(R.id.toggleButton) ;
        settings = (Button)findViewById(R.id.settings);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true){
                    ;

                        Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(turnOn,0);
                        Toast.makeText(getApplicationContext(),"Turned ON",Toast.LENGTH_SHORT).show();

                    } else{
                        Toast.makeText(getApplicationContext(),"Turned OFF",Toast.LENGTH_SHORT).show();

                    }
                }


        });



    }
}
