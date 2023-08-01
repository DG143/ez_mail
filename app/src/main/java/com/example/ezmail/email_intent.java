package com.example.ezmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class email_intent extends AppCompatActivity {

    EditText sub,msg;
    TextView mail;
    Button sendemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_intent);
        getSupportActionBar().hide();
        //mail=findViewById(R.id.recepient);
        sub=findViewById(R.id.subject);
        msg=findViewById(R.id.message);
        sendemail=findViewById(R.id.sendemailbtn);

        sendemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                String recepient = intent.getExtras().getString("email");
                String subject = sub.getText().toString().trim();
                String message = msg.getText().toString().trim();


                sendemail(recepient,subject,message);

            }
        });
    }
    private void sendemail(String recepient, String subject, String message) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{recepient});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT,message);

        try {
            startActivity(Intent.createChooser(emailIntent,"choose an email client"));

        }
        catch (Exception e ){
            //if anything goes wrong like internet issue or anything
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}