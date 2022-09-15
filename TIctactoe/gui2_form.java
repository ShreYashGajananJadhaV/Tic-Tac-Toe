package com.TIctactoe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class gui2_form {
    static Scanner scan ;
    private JPanel panel;
    private JButton a1Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a2Button;
    private JButton a9Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a7Button;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton submitButton;
    private JButton submitButton1;
    private JTextField textField4;
    private JButton submitButton2;
    static JFrame frame;
    static int blank_spaces;
    private static Player player1;
    private static Player player2;
    static int cell;
    public static void main(String[] args) {
        blank_spaces = 9;
        player1 = new Player(1,"NO NAME");
        player2 = new Player("NO NAME");
        scan = new Scanner(System.in);
        frame = new JFrame("Tictactoe");
        frame.setBounds(400, 400, 400, 400);
        frame.setContentPane(new gui2_form().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        cell = 0;
    }
    public gui2_form() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cell = 1;
                if (blank_spaces < 2){
                    textField3.setText("MATCH IS TIE");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (!textField4.getText().equals("Do you want to play again")){
                    if (player1.chance && !a1Button.getText().equals("O") && !a1Button.getText().equals("X")) {
                        a1Button.setText("X");
                        a1Button.setForeground(Color.red);
                        a1Button.setBackground(Color.yellow);
                        a1Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }
                    else if (player2.chance && !a1Button.getText().equals("X") && !a1Button.getText().equals("O")){
                        a1Button.setText("O");
                        a1Button.setForeground(Color.blue);
                        a1Button.setBackground(Color.cyan);
                        a1Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }
                }
                if (player1.status){
                    textField3.setText(player1.name + " won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (player2.status){
                    textField3.setText(player2.name+" won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cell = 2;
                if (blank_spaces < 2){
                    textField3.setText("MATCH IS TIE");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (!textField4.getText().equals("Do you want to play again")){
                    if (player1.chance && !a2Button.getText().equals("O") && !a2Button.getText().equals("X")) {
                        a2Button.setText("X");
                        a2Button.setForeground(Color.red);
                        a2Button.setBackground(Color.yellow);
                        a2Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    } else if (player2.chance && !a2Button.getText().equals("X") && !a2Button.getText().equals("O")) {
                        a2Button.setText("O");
                        a2Button.setForeground(Color.blue);
                        a2Button.setBackground(Color.cyan);
                        a2Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }

                }
                if (player1.status){
                    textField3.setText(player1.name + " won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (player2.status){
                    textField3.setText(player2.name+" won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cell = 3;
                if (blank_spaces < 2){
                    textField3.setText("MATCH IS TIE");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (!textField4.getText().equals("Do you want to play again")){
                    if (player1.chance&& !a3Button.getText().equals("O") && !a3Button.getText().equals("X")) {
                        a3Button.setText("X");
                        a3Button.setForeground(Color.red);
                        a3Button.setBackground(Color.yellow);
                        a3Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }else if (player2.chance && !a3Button.getText().equals("X") && !a3Button.getText().equals("O")){
                        a3Button.setText("O");
                        a3Button.setForeground(Color.blue);
                        a3Button.setBackground(Color.cyan);
                        a3Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }
                }
                if (player1.status){
                    textField3.setText(player1.name + " won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (player2.status){
                    textField3.setText(player2.name+" won the game");
                    textField4.setText("Do you want to play again");
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cell = 4;
                if (blank_spaces < 2){
                    textField3.setText("MATCH IS TIE");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (!textField4.getText().equals("Do you want to play again")){
                    if (player1.chance&& !a4Button.getText().equals("O") && !a4Button.getText().equals("X")) {
                        a4Button.setText("X");
                        a4Button.setForeground(Color.red);
                        a4Button.setBackground(Color.yellow);
                        a4Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    } else if (player2.chance && !a4Button.getText().equals("X") && !a4Button.getText().equals("O")) {
                        a4Button.setText("O");
                        a4Button.setForeground(Color.blue);
                        a4Button.setBackground(Color.cyan);
                        a4Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                    }

                }
                if (player1.status){
                    textField3.setText(player1.name + " won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (player2.status){
                    textField3.setText(player2.name+" won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cell = 5;
                if (blank_spaces < 2){
                    textField3.setText("MATCH IS TIE");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (!textField4.getText().equals("Do you want to play again")){
                    if (player1.chance&& !a5Button.getText().equals("O") && !a5Button.getText().equals("X")) {
                        a5Button.setText("X");
                        a5Button.setForeground(Color.red);
                        a5Button.setBackground(Color.yellow);
                        a5Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    } else if (player2.chance && !a5Button.getText().equals("X") && !a5Button.getText().equals("O")) {
                        a5Button.setText("O");
                        a5Button.setForeground(Color.blue);
                        a5Button.setBackground(Color.cyan);
                        a5Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }

                }
                if (player1.status){
                    textField3.setText(player1.name + " won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (player2.status){
                    textField3.setText(player2.name+" won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cell = 6;
                if (blank_spaces < 2){
                    textField3.setText("MATCH IS TIE");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (!textField4.getText().equals("Do you want to play again")){
                    if (player1.chance && !a6Button.getText().equals("O") && !a6Button.getText().equals("X")) {
                        a6Button.setText("X");
                        a6Button.setForeground(Color.red);
                        a6Button.setBackground(Color.yellow);
                        a6Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }else if (player2.chance && !a6Button.getText().equals("X") && !a6Button.getText().equals("O")){
                        a6Button.setText("O");
                        a6Button.setForeground(Color.blue);
                        a6Button.setBackground(Color.cyan);
                        a6Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }

                }
                if (player1.status){
                    textField3.setText(player1.name + " won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (player2.status){
                    textField3.setText(player2.name+" won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cell = 7;
                if (blank_spaces < 2){
                    textField3.setText("MATCH IS TIE");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (!textField4.getText().equals("Do you want to play again")){
                    if (player1.chance&& !a7Button.getText().equals("O") && !a7Button.getText().equals("X")) {
                        a7Button.setText("X");
                        a7Button.setForeground(Color.red);
                        a7Button.setBackground(Color.yellow);
                        a7Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    } else if (player2.chance && !a7Button.getText().equals("X") && !a7Button.getText().equals("O")) {
                        a7Button.setText("O");
                        a7Button.setForeground(Color.blue);
                        a7Button.setBackground(Color.cyan);
                        a7Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }

                }
                if (player1.status){
                    textField3.setText(player1.name + " won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (player2.status){
                    textField3.setText(player2.name+" won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cell = 8;
                if (blank_spaces < 2){
                    textField3.setText("MATCH IS TIE");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (!textField4.getText().equals("Do you want to play again")){
                    if (player1.chance&& !a8Button.getText().equals("O") && !a8Button.getText().equals("X")) {
                        a8Button.setText("X");
                        a8Button.setForeground(Color.red);
                        a8Button.setBackground(Color.yellow);
                        a8Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    } else if (player2.chance && !a8Button.getText().equals("X") && !a8Button.getText().equals("O")) {
                        a8Button.setText("O");
                        a8Button.setForeground(Color.blue);
                        a8Button.setBackground(Color.cyan);
                        a8Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }

                }
                if (player1.status){
                    textField3.setText(player1.name + " won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (player2.status){
                    textField3.setText(player2.name+" won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cell = 9;
                if (blank_spaces < 2){
                    textField3.setText("MATCH IS TIE");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (!textField4.getText().equals("Do you want to play again")){
                    if (player1.chance && !a9Button.getText().equals("O") && !a9Button.getText().equals("X")) {
                        a9Button.setText("X");
                        a9Button.setForeground(Color.red);
                        a9Button.setBackground(Color.yellow);
                        a9Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    } else if (player2.chance && !a9Button.getText().equals("X") && !a9Button.getText().equals("O")) {
                        a9Button.setText("O");
                        a9Button.setForeground(Color.blue);
                        a9Button.setBackground(Color.cyan);
                        a9Button.setFont(new Font("Arial", Font.PLAIN, 25));
                        blank_spaces--;
                        play();
                    }

                }
                if (player1.status){
                    textField3.setText(player1.name + " won the game");
                    textField4.setText("Do you want to play again");
                    return;
                }
                if (player2.status){
                    textField3.setText(player2.name+" won the game");
                    textField4.setText("Do you want to play again");
                }
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submitButton){
                    textField1.setText(textField1.getText());
                }
                player1.name = textField1.getText();
            }
        });
        submitButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submitButton1){
                    textField2.setText(textField2.getText());
                }
                player2.name = textField2.getText();
            }
        });
        submitButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submitButton2){
                    textField4.setText(textField4.getText());
                }
                if (textField4.getText().equals("yes")){
                    frame.setVisible(false);
                    main(null);
                }
                else {
                    textField4.setText("THANKS FOR PLAYING");
                }
            }
        });
    }
    static void play() {
        if (player2.chance) {
            player2.chance = false;
            player1.chance = true;
            if (!player2.arr.contains(cell)){
                player2.arr.add(cell);
            }
            check_if_wins(player2, cell);
        } else {
            player1.chance = false;
            player2.chance = true;
            if (!player1.arr.contains(cell)){
                player1.arr.add(cell);
            }
            check_if_wins(player1, cell);
        }
    }
    static void check_if_wins(Player player, int cell) {
        if (cell == 2 || cell == 8 || cell == 4 || cell == 6) {
            int[] array = player.hashmap.get(cell);

            for (int i = 0; i < array.length; i++) {
                if (i > 0 && (i + 1) % 2 == 0 && player.arr.contains(array[i - 1]) && player.arr.contains(array[i])) {
                    player.status = true;
                    break;
                }
            }
            return;
        }
        if (cell == 5) {
            int[] array = player.hashmap.get(cell);
            for (int i = 0; i < array.length; i++) {
                if (i > 0 && (i + 1) % 2 == 0 && player.arr.contains(array[i - 1]) && player.arr.contains(array[i])) {
                    player.status = true;
                    break;
                }
            }
            return;
        }
        if (cell == 1 || cell == 3 || cell == 9 || cell == 7) {
            int[] array = player.hashmap.get(cell);
            for (int i = 0; i < array.length; i++) {
                if (i > 0 && (i + 1) % 2 == 0 && player.arr.contains(array[i - 1]) && player.arr.contains(array[i])) {
                    player.status = true;
                    break;
                }
            }
        }
    }
}
