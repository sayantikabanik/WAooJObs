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
public class WriterActivity extends MainActivity implements View.OnClickListener
{
    TextView tvw;
    ImageView ivw;
    Button b1,b2,b3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writer);
        tvw=(TextView)findViewById(R.id.word);
        ivw=(ImageView) findViewById(R.id.compic);
        b1=(Button)findViewById(R.id.Bextra);
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
            case R.id.Bextra:Uri uri = Uri.parse("http://www.sinsaya.blogspot.in"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            //directs to link providing course details to be taken care of
            case R.id.Bcource:Uri uri2 = Uri.parse("http://study.com/articles/How_to_Become_a_Professional_Writer_Step-by-Step_Career_Guide.html"); // missing 'http://' will cause crashed
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;
            //opens a new intent to check eligibility for the course/job opted for
            case R.id.Beligible:
                Intent MyIntent6 = new Intent(getApplicationContext(), ButtonActivity.class);
                MyIntent6.putExtra("LABEL",6 );
                startActivity(MyIntent6);
                break;

        }
    }
}
