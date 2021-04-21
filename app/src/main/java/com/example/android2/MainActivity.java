package com.example.android2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    boolean isCat,isDog,isSquirrel;
    Button catBtn,dogBtn,squirrelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.animal_image);
        initViews();
        initClickers();

    }
    public void toast(){
        Toast.makeText(MainActivity.this, "Вы угадали", Toast.LENGTH_SHORT).show();
    }
    public void toastSecond(){
        Toast.makeText(MainActivity.this, "Вы не угадали", Toast.LENGTH_SHORT).show();
    }

    private void initClickers() {
        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCat){
                toast();
                }else {
                    toastSecond();
                }
            }
        });
        dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (isDog){
                toast();
            }else {
                toastSecond();
            }
            }

        });
        squirrelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSquirrel){
                    toast();
                }else {
                    toastSecond();
                }

            }
        });
    }

    private  void initViews(){
        imageView=findViewById(R.id.animal_image);
        catBtn=findViewById(R.id.cat_button);
        dogBtn=findViewById(R.id.dog_botton);
        squirrelBtn=findViewById(R.id.squirrel_button);
    }

    @SuppressLint("NonConstantResourceId")
    public void changeimage(View view) {
        switch (view.getId()){
            case R.id.image_first_button:
                imageView.setImageResource(R.drawable.img1);
                isSquirrel=true;
                isCat=false;
                isDog=false;

                break;
            case R.id.image_second_button:
                imageView.setImageResource(R.drawable.img2);
                isDog=true;
                isCat=false;
                isSquirrel=false;
                break;
            case R.id.image_third_button:
                imageView.setImageResource(R.drawable.img3);
                isCat=true;
                isDog=false;
                isSquirrel=false;
                break;
        }

    }

}