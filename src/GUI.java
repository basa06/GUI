import javax.swing.*;
import java.awt.*;

import javax.swing.*;
        import java.awt.FlowLayout;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.time.LocalTime;

// gui extends frame and inherits all its methods (e.g., for setting
// size, adding components)

public class GUI extends JFrame {
    // constructor will create all GUI components and set their properties
    public GUI() {
        super("A simple GUI demo");

        // frame properties
        setSize(400, 300);
        setLayout(new FlowLayout());
        setVisible(true);
        JMenuBar menuBar;

        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener((ActionEvent e) ->
                System.exit(0));
        fileMenu.add(quitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        String[] choices = { "first", "second", "third"};

//Create the combo box, select item at index 4.
//Indices start at 0, so 4 specifies the pig.
        JComboBox  choice_list = new JComboBox(choices);
        choice_list.setSelectedIndex(0);
        choice_list.addActionListener( (ActionEvent e)->{

        });
        menuBar.add(choice_list);
        System.out.println(choice_list.getSelectedItem());

    }
}