package com.example.finalproject.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.example.finalproject.Method.EvidenceAc;
import com.example.finalproject.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProcessActivity extends BaseActivity {

    private String inputUrl;
    private Boolean done = false;
    private FirebaseDatabase mFirebaseDB = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);

        Intent i = getIntent();
        inputUrl = i.getExtras().getString("url");
/*
        DatabaseReference dbRef = mFirebaseDB.getReference();
        dbRef.child("url").setValue("diaryofagameaddict.com\n",1);
        dbRef.child("url").setValue("espdesign.com.au\n",1);*/
        //compDB();

        //method 끝나고 갯수 return 해야함 (아직 구현 안됨)
        EvidenceAc evidenceAc = new EvidenceAc(inputUrl);

        Intent intent = new Intent(getBaseContext(), ResultActivity.class);
        startActivity(intent);

        finish();
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
