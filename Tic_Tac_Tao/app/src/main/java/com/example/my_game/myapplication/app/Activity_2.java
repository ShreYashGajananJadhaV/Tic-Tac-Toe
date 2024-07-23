package com.example.my_game.myapplication.app;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;
public class Activity_2 extends AppCompatActivity {
    static int blank_spaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView text1 = (TextView) findViewById(R.id.textView2);
        Button button11 = (Button) this.<View>findViewById(R.id.button11);
        Button button12 = (Button) this.<View>findViewById(R.id.button12);
        text1.setVisibility(View.INVISIBLE);
        button11.setVisibility(View.INVISIBLE);
        button12.setVisibility(View.INVISIBLE);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blank_spaces=9;
                MainActivity.player1 = new Player(MainActivity.player1.name);
                MainActivity.player2 = new Player(MainActivity.player2.name);
                MainActivity.player1.chance = true;
                another_layout();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {text1.setText("THANKS FOR PLAYING");
            }
        });
//Real buttons start from here
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank_spaces <= 1 && !MainActivity.player1.status && !MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText("MATCH IS TIE");
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (!MainActivity.player1.status && !MainActivity.player2.status){
                    if (MainActivity.player1.chance && !button1.getText().equals("X") && !button1.getText().equals("O")){
                        button1.setText("X");
                        blank_spaces--;
                        Problem.play(1);
                    }
                    else if (!button1.getText().equals("X") && !button1.getText().equals("O")){
                        button1.setText("O");
                        blank_spaces--;
                        Problem.play(1);
                    }
                }
                if (MainActivity.player1.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player1.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player2.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank_spaces <= 1 && !MainActivity.player1.status && !MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText("MATCH IS TIE");
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (!MainActivity.player1.status && !MainActivity.player2.status){
                    if (MainActivity.player1.chance && !button2.getText().equals("X") && !button2.getText().equals("O")){
                        button2.setText("X");
                        blank_spaces--;
                        Problem.play(2);
                    }
                    else if (!button2.getText().equals("X") && !button2.getText().equals("O")){
                        button2.setText("O");
                        blank_spaces--;
                        Problem.play(2);
                    }
                }
                if (MainActivity.player1.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the gam", MainActivity.player1.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player2.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank_spaces <= 1 && !MainActivity.player1.status && !MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText("MATCH IS TIE");
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (!MainActivity.player1.status && !MainActivity.player2.status){
                    if (MainActivity.player1.chance && !button3.getText().equals("X") && !button3.getText().equals("O")){
                        button3.setText("X");
                        blank_spaces--;
                        Problem.play(3);
                    }
                    else if (!button3.getText().equals("X") && !button3.getText().equals("O")){
                        button3.setText("O");
                        blank_spaces--;
                        Problem.play(3);
                    }
                }
                if (MainActivity.player1.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player1.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player2.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank_spaces <= 1 && !MainActivity.player1.status && !MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    button11.setVisibility(View.VISIBLE);
                    text1.setText("MATCH IS TIE");
                    button12.setVisibility(View.VISIBLE);
                }
                if (!MainActivity.player1.status && !MainActivity.player2.status){
                    if (MainActivity.player1.chance && !button4.getText().equals("X") && !button4.getText().equals("O")){
                        button4.setText("X");
                        blank_spaces--;
                        Problem.play(4);
                    }
                    else if (!button4.getText().equals("X") && !button4.getText().equals("O")){
                        button4.setText("O");
                        blank_spaces--;
                        Problem.play(4);
                    }
                }
                if (MainActivity.player1.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player1.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player2.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
            }
        });
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank_spaces <= 1 && !MainActivity.player1.status && !MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    button11.setVisibility(View.VISIBLE);
                    text1.setText("MATCH IS TIE");
                    button12.setVisibility(View.VISIBLE);
                }
                if (!MainActivity.player1.status && !MainActivity.player2.status){
                    if (MainActivity.player1.chance && !button5.getText().equals("X") && !button5.getText().equals("O")){
                        button5.setText("X");
                        blank_spaces--;
                        Problem.play(5);
                    }
                    else if (!button5.getText().equals("X") && !button5.getText().equals("O")){
                        button5.setText("O");
                        blank_spaces--;
                        Problem.play(5);
                    }
                }
                if (MainActivity.player1.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player1.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player2.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
            }
        });
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank_spaces <= 1 && !MainActivity.player1.status && !MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText("MATCH IS TIE");
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (!MainActivity.player1.status && !MainActivity.player2.status){
                    if (MainActivity.player1.chance && !button6.getText().equals("X") && !button6.getText().equals("O")){
                        button6.setText("X");
                        blank_spaces--;
                        Problem.play(6);
                    }
                    else if (!button6.getText().equals("X") && !button6.getText().equals("O")){
                        button6.setText("O");
                        blank_spaces--;
                        Problem.play(6);
                    }
                }
                if (MainActivity.player1.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player1.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player2.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
            }
        });
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank_spaces <= 1 && !MainActivity.player1.status && !MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText("MATCH IS TIE");
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (!MainActivity.player1.status && !MainActivity.player2.status){
                    if (MainActivity.player1.chance && !button7.getText().equals("X") && !button7.getText().equals("O")){
                        button7.setText("X");
                        blank_spaces--;
                        Problem.play(7);
                    }
                    else if (!button7.getText().equals("X") && !button7.getText().equals("O")){
                        button7.setText("O");
                        blank_spaces--;
                        Problem.play(7);
                    }
                }
                if (MainActivity.player1.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player1.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player2.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
            }
        });
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank_spaces <= 1 && !MainActivity.player1.status && !MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText("MATCH IS TIE");
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (!MainActivity.player1.status && !MainActivity.player2.status){
                    if (MainActivity.player1.chance && !button8.getText().equals("X") && !button8.getText().equals("O")){
                        button8.setText("X");
                        blank_spaces--;
                        Problem.play(8);
                    }
                    else if (!button8.getText().equals("X") && !button8.getText().equals("O")){
                        button8.setText("O");
                        blank_spaces--;
                        Problem.play(8);
                    }
                }
                if (MainActivity.player1.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player1.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player2.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
            }
        });
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank_spaces <= 1 && !MainActivity.player1.status && !MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText("MATCH IS TIE");
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (!MainActivity.player1.status && !MainActivity.player2.status){
                    if (MainActivity.player1.chance && !button9.getText().equals("X") && !button9.getText().equals("O")){
                        button9.setText("X");
                        blank_spaces--;
                        Problem.play(9);
                    }
                    else if (!button9.getText().equals("X") && !button9.getText().equals("O")){
                        button9.setText("O");
                        blank_spaces--;
                        Problem.play(9);
                    }
                }
                if (MainActivity.player1.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player1.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
                if (MainActivity.player2.status){
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(String.format("%s won the game", MainActivity.player2.name));
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                }
            }
        });
    }
    public void another_layout(){
        Intent intent = new Intent(this, Activity_2.class);
        startActivity(intent);

    }
}
