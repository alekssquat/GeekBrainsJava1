package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(500, 100, 300, 200);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel=new JPanel(new GridLayout(1,2));

        JLabel label=new JLabel();

        JTextField textField = new JTextField("Введи ответ");
        add(textField, BorderLayout.CENTER);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        });

        JButton btn1=new JButton("Жми");
        panel.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        JButton btn2=new JButton("Выходи");
        panel.add(btn2);
        btn2.addActionListener(new CloseActionListener());

        add(panel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
