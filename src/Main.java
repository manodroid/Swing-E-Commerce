import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("unnamed");
        // menu kategorit / deals / ---- search bar ---- / account / cart
        Account account = new Account();
        JEditorPane searchBar = new SearchBar();
        JMenu deals = new JMenu("Deals");
        JMenu categories = new JMenu("Categories");
        JMenu cart = new JMenu("Cart");
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(categories);
        menuBar.add(deals);
        menuBar.add(searchBar);
        menuBar.add(account);
        menuBar.add(cart);


        // jpanel which will hold all the products
        JPanel products =  new JPanel();
        products.setVisible(true);
        //products.setBackground();
        frame.add(products);

        //create frame
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(menuBar);
        frame.setJMenuBar(menuBar);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setVisible(true);
    }
}