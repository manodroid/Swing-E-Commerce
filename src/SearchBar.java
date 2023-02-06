import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class SearchBar extends JEditorPane {

    public SearchBar() {
        JButton searchBtn = new JButton("lol");
        searchBtn.setBackground(Color.black);
        setText("What do you want ?");
        searchBtn.setVisible(true);
        setBorder(BorderFactory.createLoweredBevelBorder());
        add(searchBtn);
        // try {
        //    Image img = ImageIO.read(getClass().getResource(""));
        //} catch ();
        initializeElements();
    }

    protected void initializeElements(){
        // action listener for enter button and for the button itself
        // filtering method
    }
}

