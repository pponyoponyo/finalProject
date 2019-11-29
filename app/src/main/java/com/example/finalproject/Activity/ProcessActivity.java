package com.example.finalproject.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.R;

public class ProcessActivity extends AppCompatActivity {

    private String inputUrl;
    private Boolean done = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);

        Intent i = getIntent();
        inputUrl = i.getExtras().getString("url");

        //compDB();

    }
/*
    public void compDB(){

        mFirebaseDB.getReference().child("url").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot : dataSnapshot.getChildren()){

                    UrlBean urlComp = snapshot.getValue(UrlBean.class);
                    String url = snapshot.getKey();

                    if(url.equals(inputUrl)){
                        Bundle data = new Bundle();
                        data.putString("reason",urlComp.reason);
                        data.putInt("percent",urlComp.percent);

                        Intent intent = new Intent(getBaseContext(), ResultActivity.class);
                        intent.putExtras(data);

                        startActivity(intent);
                        done = true;
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
    }*/
}
