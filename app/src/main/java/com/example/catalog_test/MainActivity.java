package com.example.catalog_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
// ckecking
public class MainActivity extends AppCompatActivity {
    private ImageButton mens_wear1 , womens_wear1 ;
    //private ImageView mens_wear2 , womens_wear2;
    //private ImageView mobile1 , tablets1;
   // private ImageView headsets1, laptops1;
   // private ImageView grocery1;
    //private String CategoryName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mens_wear1 = (ImageButton) findViewById(R.id.mens_wear1);
       womens_wear1 = (ImageButton) findViewById(R.id.womens_wear1);
        /*womens_wear2 = (ImageView) findViewById(R.id.womens_wear2);
        mens_wear2 = (ImageView) findViewById(R.id.mens_wear2);
        mobile1 = (ImageView) findViewById(R.id.mobile1);
        tablets1 = (ImageView) findViewById(R.id.tablets1);
        headsets1 = (ImageView) findViewById(R.id.headsets1);
        laptops1 = (ImageView) findViewById(R.id.laptops1);
        grocery1 = (ImageView) findViewById(R.id.grocery1);*/

        mens_wear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("category", "menswear");
                startActivity(intent);
            }
        });

       womens_wear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);

                intent.putExtra("category", "womenswear");
                startActivity(intent);
            }
        });

       /* mens_wear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);

                intent.putExtra("category","menshoes");
                startActivity(intent);
            }
        });

        womens_wear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);

                intent.putExtra("category", "womensfootwear");
                startActivity(intent);
            }
        });

        mobile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);

                intent.putExtra("category", "menshoes");
                startActivity(intent);
            }
        });

        tablets1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);

                intent.putExtra("category", "tablets");
                startActivity(intent);
            }
        });

        headsets1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);

                intent.putExtra("category", "headsets");
                startActivity(intent);
            }
        });

        laptops1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);

                intent.putExtra("category", "laptops");
                startActivity(intent);
            }
        });

        grocery1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);

                intent.putExtra("category", "grocery");
                startActivity(intent);
            }
        });*/

        //CategoryName = getIntent().getExtras().get("category").toString();
        //Toast.makeText(this, CategoryName, Toast.LENGTH_SHORT).show();

    }
}