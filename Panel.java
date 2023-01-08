package TaskManager;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Panel extends JPanel {

    private JButton add;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();
    Panel(){

        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(Color.red);

        add = new JButton("Add task");
        add.setBorder(emptyBorder);
        add.setFont(new Font("Sans-serif", Font.PLAIN,20));

        this.add(add);

        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Clear");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif",Font.PLAIN, 20));
        this.add(clear);
    }
    public JButton getAddTask(){

        return add;
    }
    public JButton getClear(){

        return clear;
    }
}
