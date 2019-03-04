package com.example.lenovo.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Math.random;

public class GameActivity extends AppCompatActivity {

    int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void clickCut(View view){
        ImageView ivCondition = ((ImageView)findViewById(R.id.imageView2));
        ivCondition.setBackgroundResource(R.drawable.cut);

        ImageView iv = ((ImageView)findViewById(R.id.imageView1));
        int ImageView[] = {R.drawable.cut,R.drawable.stone,R.drawable.cloth};
        int i = ImageView[(int) (random() * 3)];
        iv.setBackgroundResource(i);

        if(i == R.drawable.cloth)
        {
            x = x + 1;
            String s = Integer.toString(x);
            ((TextView) findViewById(R.id.score)).setText(s);
        }
        else if(i == R.drawable.stone){
            x = x - 1;
            String s = Integer.toString(x);
            ((TextView) findViewById(R.id.score)).setText(s);
        }
        else if(i == R.drawable.cut){
            String s = Integer.toString(x);
            ((TextView) findViewById(R.id.score)).setText(s);
        }

    }

    public void clickStone(View view){
        ImageView ivCondition = ((ImageView)findViewById(R.id.imageView2));
        ivCondition.setBackgroundResource(R.drawable.stone);

        ImageView iv = ((ImageView)findViewById(R.id.imageView1));
        int ImageView[] = {R.drawable.cut,R.drawable.stone,R.drawable.cloth};
        int i = ImageView[(int) (random() * 3)];
        iv.setBackgroundResource(i);

        if(i == R.drawable.cloth)
        {
            x = x - 1;
            String s = Integer.toString(x);
            ((TextView) findViewById(R.id.score)).setText(s);
        }
        else if(i == R.drawable.stone){
            String s = Integer.toString(x);
            ((TextView) findViewById(R.id.score)).setText(s);
        }
        else if(i == R.drawable.cut){
            x = x + 1;
            String s = Integer.toString(x);
            ((TextView) findViewById(R.id.score)).setText(s);
        }
    }

    public void clickCloth(View view){
        ImageView ivCondition = ((ImageView)findViewById(R.id.imageView2));
        ivCondition.setBackgroundResource(R.drawable.cloth);

        ImageView iv = ((ImageView)findViewById(R.id.imageView1));
        int ImageView[] = {R.drawable.cut,R.drawable.stone,R.drawable.cloth};
        int i = ImageView[(int) (random() * 3)];
        iv.setBackgroundResource(i);

        if(i == R.drawable.cloth)
        {
            String s = Integer.toString(x);
            ((TextView) findViewById(R.id.score)).setText(s);
        }
        else if(i == R.drawable.stone){
            x = x + 1;
            String s = Integer.toString(x);
            ((TextView) findViewById(R.id.score)).setText(s);
        }
        else if(i == R.drawable.cut){
            x = x - 1;
            String s = Integer.toString(x);
            ((TextView) findViewById(R.id.score)).setText(s);
        }
    }

}
