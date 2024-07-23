package com.example.my_game.myapplication.app;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
public class Player extends AppCompatActivity {
    ArrayList<Integer> arr;
    boolean status;
    boolean chance;
    String name;
    final HashMap<Integer, int[]> hashmap = new HashMap<Integer, int[]>();public Player(String name){
        this.hashmap.put(2, new int[]{1, 3, 5, 8});
        this.hashmap.put(4, new int[]{1, 7, 5, 6});
        this.hashmap.put(8, new int[]{7,9,5,2});
        this.hashmap.put(6, new int[]{3,9,4,5});
        this.hashmap.put(5, new int[]{2,8,4,6,1,9,7,3});
        this.hashmap.put(1, new int[]{2,3,5,9,4,7});
        this.hashmap.put(3, new int[]{1,2,6,9,7,5});
        this.hashmap.put(9, new int[]{3,6,7,8,1,5});
        this.hashmap.put(7, new int[]{1,4,5,3,8,9});
        arr = new ArrayList<Integer>();
        this.name = name;
        this.status = false;
        this.chance = false;
    }
}
