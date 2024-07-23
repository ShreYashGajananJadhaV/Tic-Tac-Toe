package com.example.my_game.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

public class Problem extends AppCompatActivity {

    static void play(int cell) {
        if (MainActivity.player2.chance) {
            MainActivity.player2.chance = false;
            MainActivity.player1.chance = true;
            if (!MainActivity.player2.arr.contains(cell)){
                MainActivity.player2.arr.add(cell);
            }
            check_if_wins(MainActivity.player2, cell);
        } else {
            MainActivity.player2.chance = true;
            MainActivity.player1.chance = false;
            if (!MainActivity.player1.arr.contains(cell)){
                MainActivity.player1.arr.add(cell);
            }
            check_if_wins(MainActivity.player1, cell);
        }
    }
    static void check_if_wins(Player player, int cell) {
        if (cell == 2 || cell == 8 || cell == 4 || cell == 6) {
            int[] array = player.hashmap.get(cell);

            for (int i = 0; i < array.length; i++) {
                if (i > 0 && (i + 1) % 2 == 0 && player.arr.contains(array[i - 1]) && player.arr.contains(array[i])) {
                    player.status = true;
                    return;
                }
            }
        }
        if (cell == 5) {
            int[] array = player.hashmap.get(cell);
            for (int i = 0; i < array.length; i++) {
                if (i > 0 && (i + 1) % 2 == 0 && player.arr.contains(array[i - 1]) && player.arr.contains(array[i])) {
                    player.status = true;
                    return;
                }
            }
        }
        if (cell == 1 || cell == 3 || cell == 9 || cell == 7) {
            int[] array = player.hashmap.get(cell);
            for (int i = 0; i < array.length; i++) {
                if (i > 0 && (i + 1) % 2 == 0 && player.arr.contains(array[i - 1]) && player.arr.contains(array[i])) {
                    player.status = true;
                    return;
                }
            }
        }
    }

}
