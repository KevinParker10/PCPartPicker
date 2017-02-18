package com.example.kevinparker.pcpartpicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button cpuBtn;
    public void createCPUBtn(){
        cpuBtn = (Button) findViewById(R.id.cpu_btn);
        final Intent startActivityIntent = new Intent(MainActivity.this, CPUActivity.class);//needs to be final for some stupid fucking reason
        cpuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Starting CPU activity", Toast.LENGTH_SHORT).show();
                MainActivity.this.startActivity(startActivityIntent);
            }
        });
    }
    //
    Button cpuCoolerBtn;
    public void createCPUCoolerBtn(){
        cpuCoolerBtn = (Button)findViewById(R.id.cooler_btn);
        final Intent startActivityIntent = new Intent(MainActivity.this, CPUCoolerActivity.class);
        cpuCoolerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Starting CPU Cooler activity", Toast.LENGTH_SHORT).show();
                MainActivity.this.startActivity(startActivityIntent);
            }
        });
    }

    Button motherBoardBtn;
    public void createMotherboardBtn(){
        motherBoardBtn = (Button)findViewById(R.id.motherb_btn);
        final Intent startActivityIntent = new Intent(MainActivity.this, MotherboardActivity.class);
        motherBoardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Starting Motherboard activity", Toast.LENGTH_SHORT).show();
                MainActivity.this.startActivity(startActivityIntent);
            }
        });

    }

    Button memoryBtn;
    public void createMemoryBtn(){
        memoryBtn = (Button)findViewById(R.id.memory_btn);
        final Intent startActivityIntent = new Intent(MainActivity.this, MemoryActivity.class);
        memoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Starting Memory Activity", Toast.LENGTH_SHORT).show();
                MainActivity.this.startActivity(startActivityIntent);
            }
        });
    }

    Button gpuBtn;
    public void createVideoCardBtn(){}

    Button oDriveBtn;
    public void createOpticalDriveBtn(){}

    Button monitorBtn;
    public void createMonitorBtn(){}

    Button peripheralsBtn;
    public void createPeripheralsBtn(){}

    Button osBtn;
    public void createOperatingSystemBtn(){}

    Button storageBtn;
    public void createStorageBtn(){}

    Button caseBtn;
    public void createCaseBtn(){}

    Button softwareBtn;
    public void createSoftwareBtn(){}

    Button externalStorageBtn;
    public void createExternalStorageBtn(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createCPUBtn();
        createCPUCoolerBtn();
        createMotherboardBtn();
        createMemoryBtn();
    }
}
