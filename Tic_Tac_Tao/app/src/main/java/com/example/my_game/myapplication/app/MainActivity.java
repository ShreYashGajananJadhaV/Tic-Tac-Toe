package com.example.my_game.myapplication.app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    static MediaPlayer player;
    static Player player1;
    static Player player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (EditText) findViewById(R.id.edittext1);
        text2 = (EditText) findViewById(R.id.edittext2);
        player = MediaPlayer.create(this, R.raw.music);
        player.start();
        player.setLooping(true);
        player.setVolume(1,100);
        Button button10 = (Button) findViewById(R.id.button10);
        player1 = new Player("player1");
        player2 = new Player("player2");
        player1.chance = true;
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity_2.blank_spaces = 9;
                if (text1.getText().toString().length() > 0){
                    player1.name = text1.getText().toString();
                }
                if (text2.getText().toString().length() > 0){
                    player2.name = text2.getText().toString();
                }
                another_layout();
            }
        });
    }
    public void another_layout(){
        Intent intent = new Intent(this, Activity_2.class);
        startActivity(intent);
    }
}