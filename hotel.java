/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;
/*
Reference
https://www.geeksforgeeks.org/gui-application-for-the-student-management-system/

*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.Color;

public class hotel extends JFrame{
    
    
abstract class close{
abstract void close();
}

class Booking extends close { // creating class for booking

private JLabel l1, l2,l3, l4,
l5, l6, l7, l8,    
l9, l10, l12,l11,l13,l14, l15,L20; 

private JTextField tf1, tf2, tf3,
tf4, tf5, tf6,tf7,tf8, tf9,
tf10;

private JTextArea area2, area1;

private JRadioButton rb1, rb2, rb3,
rb4, rb5, rb6,
rb7; 


private JFileChooser f1;



// Default constructor to
// initialize the parameters
Booking()
{

L20 = new JLabel("RESERVATION FORM");
L20.setBounds(400,25,490,50);
L20.setFont(new Font("SERIF",Font.BOLD,37));
L20.setForeground(Color.WHITE);



l1 = new JLabel("Payment Method");
l1.setBounds(550, 120, 250, 20);
l1.setForeground(Color.WHITE);

l2 = new JLabel(
"Name of the Customer:");
l2.setBounds(50, 150, 250, 20);
l2.setForeground(Color.WHITE);

tf1 = new JTextField();
tf1.setBounds(250, 150, 250, 20);
l3 = new JLabel(
"Email ID:");
l3.setForeground(Color.WHITE);
l3.setBounds(50, 200, 250, 20);

tf2 = new JTextField();
tf2.setBounds(250, 200, 250, 20);

l4 = new JLabel("Contact Number:");
l4.setForeground(Color.WHITE);
l4.setBounds(50, 250, 250, 20);

tf3 = new JTextField();
tf3.setBounds(250, 250, 250, 20);

l5 = new JLabel("City");
l5.setForeground(Color.WHITE);
l5.setBounds(50, 300, 250, 20);

tf4 = new JTextField();
tf4.setBounds(250, 300, 250, 20);

l6 = new JLabel("Nationality:");
l6.setForeground(Color.WHITE);
l6.setBounds(50, 350, 250, 20);

tf5 = new JTextField();
tf5.setBounds(250, 350, 250, 20);

l7 = new JLabel("Address:");
l7.setForeground(Color.WHITE);
l7.setBounds(50, 400, 250, 20);

area1 = new JTextArea();
area1.setBounds(250, 400, 250, 90);

l9 = new JLabel("Gender:");
l9.setForeground(Color.WHITE);
l9.setBounds(50, 500, 250, 20);

JRadioButton r5
= new JRadioButton(" Male");
JRadioButton r6
= new JRadioButton(" Female");

r5.setBounds(250, 500, 100, 30);
r6.setBounds(350, 500, 100, 30);

ButtonGroup bg = new ButtonGroup();
bg.add(r5);
bg.add(r6);

l10 = new JLabel("Room Number:");
l10.setForeground(Color.WHITE);
l10.setBounds(50, 550, 250, 20);
String num[]
= { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15" };//combobox for room no

final JComboBox room_num
= new JComboBox(num);

room_num.setBounds(250, 550, 250, 20);

l11 = new JLabel(
"Room Type");
l11.setForeground(Color.WHITE);
l11.setBounds(50, 600, 250, 20);
//creating combobox for room type
String rooms[]
= { "Luxury Duoble Room", "Deluxe Double Room", "Luxury Single Room","Deluxe Single Room" };

final JComboBox cb1
= new JComboBox(rooms);

cb1.setBounds(250, 600, 90, 20);
cb1.setSize(250, 25);

l12 = new JLabel(
"Room View");
l12.setForeground(Color.WHITE);
l12.setBounds(50, 650, 250, 20);
//combobox for room view
String view[]
= { "Pool side", "Garden side","Road Side" };

l13 = new JLabel(
"Number of Adults:");
l13.setForeground(Color.WHITE);
l13.setBounds(50, 700, 250, 20);

tf7 = new JTextField();
tf7.setBounds(250, 700, 250, 20);

l14 = new JLabel("Number of Kids (If there are any):");
l14.setForeground(Color.WHITE);
l14.setBounds(50, 750, 250, 20);

tf8 = new JTextField();
tf8.setBounds(250, 750, 250, 20);

ImageIcon i2 = new ImageIcon("2.png");
JLabel l15
= new JLabel("", i2, JLabel.CENTER);

l15.setBounds(900, 50, 600, 200);

final JComboBox cb2
= new JComboBox(view);

cb2.setBounds(250, 650, 90, 20);
l8 = new JLabel(
"Arrival Date:");
l8.setForeground(Color.WHITE);
l8.setBounds(800, 170, 250, 20);

rb1 = new JRadioButton("Check");
rb1.setBounds(550, 150, 100, 30);

rb2 = new JRadioButton("Paypal");
rb2.setBounds(650, 150, 100, 30);

rb3 = new JRadioButton("Cash");
rb3.setBounds(550, 200, 100, 30);

rb4 = new JRadioButton("Credit Card");
rb4.setBounds(650, 200, 120, 30);
ButtonGroup bg1 = new ButtonGroup();

bg1.add(rb1);
bg1.add(rb2);
bg1.add(rb3);
bg1.add(rb4);
 DateFormat dateFormat = new SimpleDateFormat("dd MMM YYYY");
 JFormattedTextField today = new JFormattedTextField(dateFormat);
today.setBounds(800, 200, 90, 20);

final JLabel label
= new JLabel();
label.setBounds(600, 430, 500, 30);
JButton b = new JButton("Show");//button will display selected item from list
b.setBounds(950, 435, 80, 30);
 b.setBackground(Color.WHITE);

final DefaultListModel<String> li1
= new DefaultListModel<>(); //creating list for room package

li1.addElement("LDR (20, 000)");
li1.addElement("DDR (10, 000)");
li1.addElement("LSR (10, 000)");
li1.addElement("DSR (5, 000)");


final JList<String> list1
= new JList<>(li1);

list1.setBounds(600, 300, 125, 125);

DefaultListModel<String> li2
= new DefaultListModel<>();//creating list for selecting days

li2.addElement(
"2 days");
li2.addElement(
"3 days");
li2.addElement(
"4 days");
li2.addElement(
"5 days");
li2.addElement(
"6 days");

final JList<String> list2
= new JList<>(li2);
list2.setBounds(
800, 300, 125, 125);

JButton Receipt
= new JButton("Generate Receipt");// this button will generate recipt
Receipt.setBounds(600, 490, 150, 30);
Receipt.setBackground(Color.WHITE);
JButton b2 = new JButton("Reset");//this button will reset recipt
b2.setBounds(750, 490, 150, 30);
 b2.setBackground(Color.WHITE);
JButton Print = new JButton("Print");//this button will print recipt
Print.setBounds(900, 490, 150, 30);
 Print.setBackground(Color.WHITE);
area2 = new JTextArea();// text area for displaying recipt
area2.setBounds(600, 540, 450, 240);

add(L20);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(l14);
add(tf1);
add(tf2);
add(tf3);
add(tf4);
add(tf5);
add(room_num);
add(tf7);
add(tf8);
add(area1);
add(area2);
add(l15);
add(rb1);
add(rb2);
add(rb3);
add(rb4);
add(r5);
add(r6);
add(today);
add(cb1);
add(cb2);
add(list1);
add(list2);
add(b);
add(label);             
add(Receipt);
add(b2);
add(Print);

b.addActionListener(new ActionListener() {

// Method to display the data selected from list

@Override
public void actionPerformed(ActionEvent e)
{
    
String data = "";
if (list1.getSelectedIndex() != -1) {
data = "You had selected the Package:"
+ list1.getSelectedValue();
label.setText(data); 
label.setForeground(Color.WHITE);
}
if (list2.getSelectedIndex() != -1) {
data += " for: ";

for (Object frame :
list2.getSelectedValues()) {
data += frame + " ";
}
}
label.setText(data);
}
});

// Reset the text fields
b2.addActionListener(
new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{
area2.setText("");
area1.setText(" ");
tf1.setText("");
tf2.setText("");
tf3.setText("");
tf4.setText("");
tf5.setText("");
}
});

// Implementing the Print action
Print.addActionListener(new ActionListener() {
public void actionPerformed(
ActionEvent e)
{
try {
area2.print();
}
catch (java.awt.print.PrinterException a) {
System.err.format("NoPrinter Found",
a.getMessage());
}
}
});

// Generating the receipt
Receipt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{

area2.setText(
"--------------------------------"
+ "-----------BOOKING RECEIPT----"
+ "--------------------------"
+ "--------------------------"
+ "-------------------\n");

area2.setText(area2.getText()
+ "Customer Name: "
+ tf1.getText()  // display name of customer
+ "\n");
area2.setText(area2.getText()
+ "Email ID: "
+ tf2.getText() // display customer email
+ "\n");
area2.setText(area2.getText()
+ "Contact Number: "
+ tf3.getText()    // display customer contact
+ "\n");
area2.setText(area2.getText()
+ "City: "           // display customer city
+ tf4.getText()
+ "\n");
area2.setText(area2.getText()
+ "Nationality: "
+ tf5.getText()           // display customer nationality
+ "\n");
area2.setText(area2.getText()
+ "Arrival Date: "
+today.getText()  // display arival date
.toString()
+ "\n");
area2.setText(area2.getText()
+ "Room number: "
+room_num.getSelectedItem()     // display room no. selested from combobox
.toString()
+ "\n");
area2.setText(area2.getText()
+ "Room Type: "
+cb1.getSelectedItem() // display room type selested from combobox
.toString()
+ "\n");
area2.setText(area2.getText()
+ "Room View: "
+cb2.getSelectedItem()    // display room view selested from combobox
.toString()
+ "\n");

if (rb1.isSelected()) {     //checking condition for payment method
area2.setText(area2.getText()
+ "Wants to pay through Check \n");
}
if (rb2.isSelected()) {
area2.setText(area2.getText()
+ "Wants to pay through Paypal\n");
}
if (rb3.isSelected()) {
area2.setText(area2.getText()
+ "Wants to pay through Cash \n");
}
if (rb4.isSelected()) {
area2.setText(area2.getText()
+ "Wants to pay through Credit Card \n");
}
area2.setText(area2.getText()
+ "Had chosen: "
+ list1.getSelectedValue()
.toString()
+ "\n");
area2.setText(area2.getText()
+ "Had chosen: "
+ list2.getSelectedValue()
.toString()
+ "\n");

int index1=list1.getSelectedIndex(); // give total amount according to room package and no. of days selected from list
int index2 = list2.getSelectedIndex();
if ((index1 == 0)&&(index2==0)){ 
area2.setText(area2.getText()+ "Total amount to be paid is 40 Thousand \n");
}

if ((index1 == 1)&&(index2==0)) {
area2.setText(area2.getText()+ "Total amount to be paid is 20 Thousand \n");
}

if ((index1 == 2)&&(index2==0)) {
area2.setText(area2.getText()+ "Total amount to be paid is 20 Thousand \n");
}

if ((index1 == 3)&&(index2==0)) {
area2.setText(area2.getText()+ "Total amount to be paid is 10 Thousand\n");
}

if ((index1 == 0)&&(index2==1)) {
area2.setText(area2.getText()+"Total amount to be paid is 60 Thousand \n");
}

if ((index1 == 1)&&(index2==1)) {
area2.setText(area2.getText()+ "Total amount to be paid is 30 Thousand \n");
}

if ((index1 == 2)&&(index2==1)) {
area2.setText(area2.getText()+ "Total amount to be paid is 30 Thousand \n");
}

if ((index1 == 3)&&(index2==1)) {
area2.setText(area2.getText()+ "Total amount to be paid is 15 Thousand \n");
}

if ((index1 == 0)&&(index2==2)) {
area2.setText(area2.getText()+"Total amount to be paid is 80 Thousand \n");
}

if ((index1 == 1)&&(index2==2)) {
area2.setText(area2.getText()+"Total amount to be paid is 40 Thousand \n");
}

if ((index1 == 2)&&(index2==2)) {
area2.setText(area2.getText()+ "Total amount to be paid is 40 Thousand \n");
}

if ((index1 == 3)&&(index2==2)) {
area2.setText(area2.getText()+"Total amount to be paid is 20 Thousand \n");
}

if ((index1 == 0)&&(index2==3)) {
area2.setText(area2.getText()+"Total amount to be paid is 1 Lakh \n");
}

if ((index1 == 1)&&(index2==3)) {
area2.setText(area2.getText()+"Total amount to be paid is 50 Thousand \n");
}

if ((index1 == 2)&&(index2==3)) {
area2.setText(area2.getText()+"Total amount to be paid is 50 Thousand \n");
}

if ((index1 == 3)&&(index2==3)) {
area2.setText(area2.getText()+"Total amount to be paid is 25 Thousand \n");
}

if ((index1 == 0)&&(index2==4)) {
area2.setText(area2.getText()+"Total amount to be paid is 1 Lakh 20 Thousand \n");
}

if ((index1 == 1)&&(index2==4)) {
area2.setText(area2.getText()+"Total amount to be paid is 60 Thousand \n");
}

if ((index1 == 2)&&(index2==4)) {
area2.setText(area2.getText()+"Total amount to be paid is 60 Thousand \n");
}

if ((index1 == 3)&&(index2==4)) {
area2.setText(area2.getText()+"Total amount to be paid is 30 Thousand \n");
}
if (e.getSource() == Receipt) {
try {
    try (FileWriter fw = new FileWriter("java.txt")) {
        fw.write(area2.getText());
    }
}
catch (IOException ae) {
System.out.println(ae);
}
}

JOptionPane.showMessageDialog(  // display message after bookingof room 
area2, "ROOM BOOKED SUCCESSFULLY");
};
});
addWindowListener(
new WindowAdapter() {

@Override
public void windowClosing(
WindowEvent we)
{
System.exit(0);
}
});

setSize(1280, 1300);
setLayout(null);
setVisible(true);
getContentPane().setBackground(Color.BLACK);
   };

@Override
void close(){System.exit(0);};  

 
}
Booking b3=new Booking();
public static void main(String[] args){
new hotel();
}

} 