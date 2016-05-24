package com.example.android.waoojobs;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.android.waoojobs.AgentActivity;
import com.example.android.waoojobs.AusActivity;
import com.example.android.waoojobs.EngineerActivity;
import com.example.android.waoojobs.MediaActivity;
import com.example.android.waoojobs.MusicActivity;
import com.example.android.waoojobs.PhotoActivity;
import com.example.android.waoojobs.R;
import com.example.android.waoojobs.WriterActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton bMm,bAg,bPh,bMu,bWr,bEn,bAu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bMm= (ImageButton) findViewById(R.id.media1);
        bAg= (ImageButton) findViewById(R.id.agent1);
        bPh= (ImageButton) findViewById(R.id.photo1);
        bMu= (ImageButton) findViewById(R.id.music1);
        bWr= (ImageButton) findViewById(R.id.writer1);
        bEn= (ImageButton) findViewById(R.id.engine1);
        bAu=(ImageButton) findViewById(R.id.aus1);
        bMm.setOnClickListener(this);
        bAg.setOnClickListener(this);
        bPh.setOnClickListener(this);
        bMu.setOnClickListener(this);
        bWr.setOnClickListener(this);
        bEn.setOnClickListener(this);
        bAu.setOnClickListener(this);



    }
//directs to different intent when the image button is clicked according to users choice
    public void onClick (View v)
    {
        switch (v.getId())
        {
            case R.id.media1:
                Intent MyIntent = new Intent(getApplicationContext(), MediaActivity.class);
                MyIntent.putExtra("LABEL", 1);
                startActivity(MyIntent);
                break;
            case R.id.agent1:
                Intent MyIntent2 = new Intent(getApplicationContext(), AgentActivity.class);
                MyIntent2.putExtra("LABEL", 2);
                startActivity(MyIntent2);
                break;
            case R.id.photo1:
                Intent MyIntent3 = new Intent(getApplicationContext(), PhotoActivity.class);
                MyIntent3.putExtra("LABEL", 3);
                startActivity(MyIntent3);
                break;
            case R.id.music1:
                Intent MyIntent4 = new Intent(getApplicationContext(), MusicActivity.class);
                MyIntent4.putExtra("LABEL", 4);
                startActivity(MyIntent4);
                break;
            case R.id.engine1:
                Intent MyIntent5 = new Intent(getApplicationContext(), EngineerActivity.class);
                MyIntent5.putExtra("LABEL", 5);
                startActivity(MyIntent5);
                break;
            case R.id.writer1:
                Intent MyIntent6 = new Intent(getApplicationContext(), WriterActivity.class);
                MyIntent6.putExtra("LABEL", 6);
                startActivity(MyIntent6);
                break;
            case R.id.aus1:
                Intent MyIntent7 = new Intent(getApplicationContext(), AusActivity.class);
                MyIntent7.putExtra("LABEL", 7);
                startActivity(MyIntent7);
                break;
            default:
                System.out.println("invalid");
        }


    }




}
