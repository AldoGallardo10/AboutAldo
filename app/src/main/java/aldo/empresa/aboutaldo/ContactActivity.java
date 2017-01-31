package aldo.empresa.aboutaldo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    TextView callTv;
    TextView linkTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        linkTV = (TextView) findViewById(R.id.linkTv);
        callTv = (TextView) findViewById(R.id.callTv);


        linkTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse("https://cl.linkedin.com/in/aldoagallardo"));
                startActivity(linkedinIntent);
            }
        });


        callTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel: +569 588622725"));
                startActivity(callIntent);
            }
        });



    }
}
