package com.example.prjjogodedos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button btnSortear;
    ImageView imgV;
    int vetorImagem[];
    int num;
    Random rand;
    int soma = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSortear = findViewById(R.id.btnSortear);
        imgV = findViewById(R.id.imgV);


        vetorImagem = new int[]{
                R.drawable.dedo_0,
                R.drawable.dedo_1,
                R.drawable.dedo_2,
                R.drawable.dedo_3,
                R.drawable.dedo_4,
                R.drawable.dedo_5
        };

        imgV.setImageResource(R.drawable.dedo_semvalor);


    }

    public void sortear(){
        rand = new Random();

        num = rand.nextInt(6);
    }

    public void mudar(View v){
        sortear();
        imgV.setImageResource(vetorImagem[num]);

        //soma += num; forma reduzida

        if(num == 1)
        {
            soma = soma + 1;
        }
        else if(num == 2)
        {
            soma = soma + 2;
        }
        else if(num == 3)
        {
            soma = soma + 3;
        }
        else if(num == 4)
        {
            soma = soma + 4;
        }
        else if (num == 5)
        {
            soma = soma + 5;
        }


        if (soma > 49)
        {
            Toast.makeText(this, "Você atingiu o limite", Toast.LENGTH_LONG).show();
            soma = 0;
        }
    }


}