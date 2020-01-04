import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.File;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        JFrame window = new JFrame("Sercurity Program");
        window.setVisible(true);
        window.setSize(500,300);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        window.add(panel);

        JButton button = new JButton("Encryptor");
        button.setBounds(120,80,100,30);
        panel.add(button);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Encryptor");
                Encryptor en = Encryptor.getEncrypter(true);
                File src = new File("C:\\test");
                en.encrypt(src, src);

            }
        });

        JButton button111 = new JButton("Decryptor");
        button111.setBounds(260,80,100,30);
        panel.add(button111);
        button111.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {


                System.out.println("Decryptor");
                Decryptor de = Decryptor.getDecrypter(true);
                File src = new File("C:\\test");
                de.decrypt(src, src);
            }
        });


    }
}