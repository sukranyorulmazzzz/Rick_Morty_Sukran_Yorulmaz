package com.example.rickandmortybysukranyorulmaz.Activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rickandmortybysukranyorulmaz.R;
import com.squareup.picasso.Picasso;

public class CharacterDetailActivity extends AppCompatActivity {

    TextView nametext,statustext,speciestext,locationnametext,locationtypetext,locationdimensiontext;
    ImageView imagecharacter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_detail);
        imagecharacter=findViewById(R.id.imagecharacter);
        nametext=findViewById(R.id.textname);
        statustext=findViewById(R.id.textstatus);
        locationnametext=findViewById(R.id.locationnametext);
        speciestext=findViewById(R.id.textspecies);
        locationtypetext=findViewById(R.id.locationtypetext);
        locationdimensiontext=findViewById(R.id.locationdimensiontext);

        String name="name";
        String status="status";
        String species="species";
        String image="image";
        String locationtype="locationtype";
        String locationname="locationtype";
        String locationdimension="locationdimension";
        Bundle extras=getIntent().getExtras();
        if (extras!=null){
            name=extras.getString("name");
            status=extras.getString("status");
            species=extras.getString("species");
            image=extras.getString("image");
            locationtype=extras.getString("locationtype");
            locationname=extras.getString("locationname");
            locationdimension=extras.getString("locationdimension");
            Picasso.get().load(image).into(imagecharacter);
            nametext.setText(name);
            statustext.setText(status);
            speciestext.setText(species);
            locationtypetext.setText(locationtype);
            locationdimensiontext.setText(locationdimension);
            locationnametext.setText(locationname);

        }
    }
}