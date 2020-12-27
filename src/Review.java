// package src;

// import javax.swing.*;
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

// public class Review extends JFrame{
//     private String usernameString, dateString, commentString;
//     private int starInt;

//     public Review() {
//         super("Review");
//         initComponents();
//     }

//     private JLabel title = new JLabel("Car Rent");
//     private JPanel panel1 = new JPanel();
//     private JLabel username = new JLabel("Ahmad");
//     private JLabel star = new JLabel("★★★★☆");
//     private JLabel date = new JLabel("22 Dec 2020");
//     private JTextPane comment;
//     private JScrollPane scrollPane = new JScrollPane();

//     // Creating GUI
//     private void initComponents() {

//         comment.setText("Saya suka app ini!");
//         comment.setFocusable(false); 
//     }

//     public String getUsername() {
//         return username;
//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public String getDate() {
//         return date;
//     }

//     public void setDate() {
//         LocalDate dateObj = LocalDate.now();
//         dateString = dateObj.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
//     }

//     public String getComment() {
//         return comment;
//     }

//     public void setComment(String comment) {
//         this.comment = comment;
//     }

//     public int getStar() {
//         return starInt;
//     }

//     public void setStar(int star) {
//         this.star = star;
//     }
// }