package com.example.android.waoojobs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 15-05-2016.
 */
public class EngineerActivity extends MainActivity implements View.OnClickListener
{
    TextView tve;
    ImageView ive,b1;
    Button b2,b3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.engineer);
        tve=(TextView)findViewById(R.id.word);
        ive=(ImageView) findViewById(R.id.compic);
        b1=(ImageView) findViewById(R.id.Bextra);
        b2=(Button)findViewById(R.id.Bcource);
        b3=(Button)findViewById(R.id.Beligible);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }
    public void onClick(View v)
    {
        v.getId();
        switch(v.getId()){
            //directs to links providing extra information
            case R.id.Bextra:Uri uri = Uri.parse("https://www.youtube.com/watch?v=DGmIkYw19gg"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            //directs to link providing course details to be taken care of
            case R.id.Bcource:Uri uri2 = Uri.parse("https://targetstudy.com/courses/engineering/"); // missing 'http://' will cause crashed
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;
            //opens a new intent to check eligibility for the course/job opted for
            case R.id.Beligible:
                Intent MyIntent5 = new Intent(getApplicationContext(), ButtonActivity.class);
                MyIntent5.putExtra("LABEL",5 );
                startActivity(MyIntent5);
                break;

        }
    }
}
