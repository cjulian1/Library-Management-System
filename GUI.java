package booksort;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI implements ActionListener {
    
    JButton sbt = new JButton("Sort By Title");
    JButton sba = new JButton("Sort By Author");
    JButton sbc = new JButton("Sort By Genre");
    JButton sbl = new JButton("Sort By ISBN");
    JButton sbp = new JButton("Sort By Availability");
    JButton addb = new JButton("Add Book");
    JButton remb = new JButton("Remove Book");
    JButton retb = new JButton("Retrieve Book");
    JButton updb = new JButton("Update Book");
    JButton slhb = new JButton("Sort Low -> High");
    JButton shlb = new JButton("Sort High -> Low");
    JTextField titleField = new JTextField("");
    JTextField authorField = new JTextField("");
    JTextField genreField = new JTextField("");
    JTextField ISBNField = new JTextField("");
    JTextField availabilityField = new JTextField("");
    JLabel titleText = new JLabel("Title:");
    JLabel authorText = new JLabel("Author:");
    JLabel genreText = new JLabel("Genre:");
    JLabel ISBNText = new JLabel("ISBN:");
    JLabel availabilityText = new JLabel("Availability:");
    
    JButton addu = new JButton("Add User");
    JButton remu = new JButton("Remove User");
    JButton retu = new JButton("Retrieve User");
    JButton updu = new JButton("Update User");
    Sorting sort2 = new Sorting();
    
    JLabel usernameText = new JLabel("  Username:  ");
    JTextField usernameField = new JTextField("");
    JLabel contactInfoText = new JLabel("Contact Info:");
    JTextField contactInfoField = new JTextField("");
    JLabel borrowedBooksText = new JLabel("Borrowed Books:");
    JTextField borrowedBooksField = new JTextField("");
    
    JButton rul = new JButton("Refresh User List");
    
    GUI() {
        String[] emptyArray = {};
        JFrame frame1 = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        
        Sorting sort1 = new Sorting();
        
        JList<String> list = new JList<>(emptyArray);
        list.setBounds(100, 100, 100, 100);
        JScrollPane sp1 = new JScrollPane(list);
        
        ActionListener a = null;
        sbt.addActionListener(e -> list.setListData(sort1.sortTitle()));
        sbt.addActionListener(e -> displaySortedInTerminal(sort1.sortTitle()));
        
        sba.addActionListener(e -> list.setListData(sort1.sortAuthor()));
        sba.addActionListener(e -> displaySortedInTerminal(sort1.sortAuthor()));
        
        sbc.addActionListener(e -> list.setListData(sort1.sortGenre()));
        sbc.addActionListener(e -> displaySortedInTerminal(sort1.sortGenre()));
        
        sbl.addActionListener(e -> list.setListData(sort1.sortISBN()));
        sbl.addActionListener(e -> displaySortedInTerminal(sort1.sortISBN()));
        
        sbp.addActionListener(e -> list.setListData(sort1.sortAvailability()));
        sbp.addActionListener(e -> displaySortedInTerminal(sort1.sortAvailability()));
        
        addb.addActionListener(e -> Database.addBook(titleField.getText(), authorField.getText(), genreField.getText(), ISBNField.getText(), availabilityField.getText()));
        remb.addActionListener(e -> Database.removeBook(list.getSelectedValue()));
        retb.addActionListener(e -> getBook(list.getSelectedValue()));
        updb.addActionListener(e -> updateBook(list.getSelectedValue()));
        shlb.addActionListener(e -> Sorting.sortHighToLow("True"));
        slhb.addActionListener(e -> Sorting.sortHighToLow("False"));
        
        //panel1.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        //panel1.setLayout(new GridLayout(3, 3, 10, 10));
        
        panel1.add(sbt);
        panel1.add(sba);
        panel1.add(sbc);
        panel1.add(sbl);
        panel1.add(sbp);
        panel1.add(addb);
        panel1.add(remb);
        panel1.add(retb);
        panel1.add(updb);
        
        panel2.add(sp1);
        list.setPreferredSize(new Dimension(200, 200));
        
        panel3.add(titleText);
        panel3.add(titleField);
        titleField.setPreferredSize(new Dimension(200, 30));
        panel3.add(authorText);
        panel3.add(authorField);
        authorField.setPreferredSize(new Dimension(200, 30));
        panel3.add(genreText);
        panel3.add(genreField);
        genreField.setPreferredSize(new Dimension(200, 30));
        panel3.add(ISBNText);
        panel3.add(ISBNField);
        ISBNField.setPreferredSize(new Dimension(200, 30));
        panel3.add(availabilityText);
        panel3.add(availabilityField);
        availabilityField.setPreferredSize(new Dimension(200, 30));
        
        panel3.add(slhb);
        panel3.add(shlb);
        
        
        JList<String> list2 = new JList<>(emptyArray);
        list2.setBounds(100, 100, 100, 100);
        list2.setPreferredSize(new Dimension(200, 200));
        JScrollPane sp2 = new JScrollPane(list2);
        panel4.add(sp2);
        panel4.add(addu);
        panel4.add(remu);
        panel4.add(retu);
        panel4.add(updu);
        list2.setListData(sort2.sortUsers());
        panel5.add(usernameText);
        panel5.add(usernameField);
        usernameField.setPreferredSize(new Dimension(200, 30));
        panel5.add(contactInfoText);
        panel5.add(contactInfoField);
        contactInfoField.setPreferredSize(new Dimension(200, 30));
        panel5.add(borrowedBooksText);
        panel5.add(borrowedBooksField);
        borrowedBooksField.setPreferredSize(new Dimension(200, 30));
        panel5.add(rul);

        addu.addActionListener(e -> Database.addUser(usernameField.getText(), contactInfoField.getText(), borrowedBooksField.getText()));
        remu.addActionListener(e -> Database.removeUser(list2.getSelectedValue()));
        retu.addActionListener(e -> getUser(list2.getSelectedValue()));
        updu.addActionListener(e -> updateUser(list2.getSelectedValue()));
        rul.addActionListener(e -> list2.setListData(sort2.sortUsers()));
        
        
        
        frame1.add(panel1);
        frame1.add(panel2);
        frame1.add(panel3);
        frame1.add(panel4);
        frame1.add(panel5);
        frame1.setLayout(new GridLayout(2,3));
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setTitle("Main Window");
        frame1.setSize(850,500);
        frame1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void getBook(String title){
        titleField.setText(Database.retrieveBook(title)[0]);
        authorField.setText(Database.retrieveBook(title)[1]);
        genreField.setText(Database.retrieveBook(title)[2]);
        ISBNField.setText(Database.retrieveBook(title)[3]);
        availabilityField.setText(Database.retrieveBook(title)[4]);
    }
    
    public void updateBook(String title){
        Sorting.setBookProperties(title, titleField.getText(), authorField.getText(), genreField.getText(), ISBNField.getText(), availabilityField.getText());
    }
    
    public void getUser(String username){
        usernameField.setText(Database.retrieveUser(username)[0]);
        contactInfoField.setText(Database.retrieveUser(username)[1]);
        borrowedBooksField.setText(Database.retrieveUser(username)[2]);
    }
    
    public void updateUser(String username){
        Sorting.setUserProperties(username, usernameField.getText(), contactInfoField.getText(), borrowedBooksField.getText());
    }
    
    public void displaySortedInTerminal(String[] arr1){
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
