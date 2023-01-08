package TaskManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppF extends JFrame {
    private TitleBar title;
    private List list;
    private Panel buttonPanel;

    private JButton addTask;
    private JButton clear;


    AppF() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        title = new TitleBar();
        list = new List();
        buttonPanel = new Panel();
        this.add(title, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(list,BorderLayout.CENTER);

        addTask = buttonPanel.getAddTask();
        clear = buttonPanel.getClear();

        addListeners();

    }

    public void addListeners(){
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);

                list.updateNumbers();
                task.getDone().addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }
                });
                revalidate();
            }
        });
    }
}
