package eclipseWithGit;

import javax.swing.*;
import javax.swing.border.*;
import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.Graphics;

public class JavaProgram {

	public static void main(String[] args){

		// OUTPUT	// dialog box pop-on with a message
		JOptionPane.showMessageDialog(null, "in ham ye message e dige st too dialog box");
		JOptionPane.showMessageDialog(null, "in ye message e dige too Dialog box", "in ham ye title baraye Dialog box", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "ye adad beyne 0-10 benevis. Ba'desh bedoone enter zadan ye word benevis. Ba'desh ye khat chiz miz benevis");
		
		// INPUT	
		Scanner input = new Scanner(System.in);
		double adad = input.nextDouble();	// to read a Double adad
		JOptionPane.showMessageDialog(null, adad);	// show what iput we got for the user
		
		String word = input.next();			// input a String
		String line1 = input.nextLine();	// input a line of Strings
		JOptionPane.showMessageDialog(null, word);
		JOptionPane.showMessageDialog(null, line1);
		
		input.close();						// Close the scanner input to prevent resource leak
			
		
		
		// Casting
		System.out.println( (int)4.7 );

/*
		char letter = 'A';
		String letter2 = "A";
		char letter3 = '\u0041';
		char letter4 = '\u6B22';
		char letter5 = '\u8FCE';
		char letter6 = '\u03b3';

		char alef = '\u0627';
		char mim = '\u0645';
		char ye = '\u0649';
		char re = '\u0631';

		System.out.println(letter);
		System.out.println(letter2);
		System.out.println(letter3);
		System.out.println(letter4);
		System.out.println(letter5);
		System.out.println(letter6);
		System.out.println(alef);
		System.out.println(mim);
		System.out.println(ye);
		System.out.println(re);

		JOptionPane.showMessageDialog(null, re);
*/

//		JOptionPane.showInputDialog("ye adadi benevis inja:");
//		String adadGUI = JOptionPane.showInputDialog("ye adadi inja benevis:");
/*		String khatGUI = JOptionPane.showInputDialog(null, "ye chizi inja benevis", "ye title ei chizi ham injast", JOptionPane.QUESTION_MESSAGE);

		JOptionPane.showMessageDialog(null, khatGUI, khatGUI, JOptionPane.QUESTION_MESSAGE);
*/

/*		
		float adadefloat = input.nextFloat();
		
		// if else
		if (adadefloat > 7){
			System.out.println("bozorgtar az 7 eh");
		}
		else if (adadefloat < 7){
			System.out.println("koochiktar az 7 eh");
		}
		else {
			System.out.println("mosaavi e 7 eh");
		}
		
		// one line check kardan o assign kardan e true ya false boodane ye chizi
		boolean even = adadefloat % 7 == 0;
		System.out.println(even);

		// Math.random() returns a double value between 0.0 and 1.0, but not 1.0		
		float randomNumber1 = (float)(Math.random());
		float randomNumber2 = (float)(Math.random());

		// to get a random number between 0 and 10 
		int randomNumber3 = (int)(Math.random() * 10);

		System.out.println(randomNumber1 + "\n");
		System.out.println(randomNumber2);
		System.out.println(randomNumber3);
		
		// baazi :D
		for (int i = 0; i < 10; i++){
			int randomNumber4 = (int)(Math.random() * 10);
			System.out.println(randomNumber4);
		}
		
		// System.exit(status)
		// age status 0 bedim, yani normal. age gheyre 0 bedim, yani abnormal
		if (1 != 1){
			System.out.println("Error: invalid status");
			System.exit(1);
		}
		
		// exclusive OR
		if (adadefloat % 2 == 0 ^ adadefloat % 3 ==0){
			System.out.println(adadefloat + "is divisible by 2 or 3, but not divisible by both");
		}
		
		// switch
		switch ((int)adadefloat){
			case (7): System.out.println(adadefloat + " is 7"); break;
			case (2): System.out.println(adadefloat + " is 2"); break;
			default: System.out.println(adadefloat + " is neither 7 nor 2");
		}

		// one line if else		
		boolean y = (adadefloat > 0) ? true: false; 		

		System.out.println(y);
		


		// formatting the output in the console
		int adadeInt = 83;
		char adadeChar = 'a';
		String adadeString = "salaam salaam in Amirhosein Azarbakht, programmer e khafan eh!";
		boolean adadeBoolean = true;

		System.out.printf("in format nashode st %f", adadefloat);

		// float 2.4 yani 2 ta adad ghable . (including the decimal point .), va 4 ta adad ba'de .
		System.out.printf("in format shodeh st %2.4f \n", adadefloat);
		
		// decimal
		System.out.printf("in format shodeh st %d \n", adadeInt);
		System.out.printf("in format shodeh st %5d \n" , adadeInt);

		// e format (scientific format)
		System.out.printf("in format shodeh st %e \n", adadefloat);
		System.out.printf("in format shodeh st %10.2e \n", adadefloat);

		// Boolean
		System.out.printf("in format shodeh st %b \n", adadeBoolean);

		// char
		System.out.printf("in format shodeh st %c \n", adadeChar);

		// string		
		System.out.printf("in format shodeh st %s \n", adadeString);
		System.out.printf("in format shodeh st %12s \n", adadeString);
		
		System.out.printf("%8d%50s%8.1f\n", 12345, "Amirhosein the great programmer", 6.01);
		System.out.printf("%8d%50s%8.1f\n", 12, "Amirhosein Azarbakht programmer e khafan", 677.01);
		System.out.printf("%8d%50s%8.1f\n", 1345, "Amirhosein the programmer", 6.01);
		System.out.printf("%8d%50s%8.1f\n", 1002345, "Amirhosein the skilled programmer", 6.4401);
		System.out.printf("%8d%50s%8.1f\n", 1, "Amirhosein the programming go-to", 6.091);
			
		String email = input.nextLine();
		int answer = JOptionPane.showConfirmDialog(null, "Are you sure is this what you want?" + email);
		if (answer == JOptionPane.YES_OPTION){
			System.out.println("You said Yes " + answer);
		}
		else if (answer == JOptionPane.NO_OPTION){
			System.out.println("You said No " + answer);	
		}
		else if (answer == JOptionPane.CANCEL_OPTION){
			System.out.println("You said Cancel " + answer);		
		}

		
		// to redirect input text from a file:
		// java JavaProgram < text.txt 

		
		int sentinel = 1;
		// while
		while (sentinel < 10){
			System.out.printf("in Sentinel e #%d eh \n", sentinel);
			sentinel++;
		}

		sentinel = 1;
		// do while
		do{
			System.out.printf("in Sentinel e #%d eh \n", sentinel);
			sentinel++;		
		} while (sentinel < 10);

		
		// for loop
		for (int i = 0; i < 10; i++){
			System.out.printf("in i e #%d eh \n", i);
		}


		// break; mippare are loop biroon
		for (int i = 0; i < 10; i++){
			System.out.printf("in break e #%d eh \n", i);
			if (i == 5){
				break;			
			}
		}
		
		// continue; mippare tahe loop
		// continue breaks out of the current iteration in the loop,
		// break breaks out of the loop
		for (int i = 0; i < 10; i++){
			if (i == 5){
				continue;			
			}
			System.out.printf("in continue e #%d eh \n", i);
		}


		// array
		double[] array = new double[5];
		for(int i = 0; i < 5; i++){
			array[i] = input.nextDouble();
		}

		for(int i = 0; i < array.length; i++){
			System.out.printf("%5.0f \n", array[i]);
		}
		
		System.out.println("size of the array is " + array.length);
		
		// for-each loop: to traverse the array sequentially without using an index
		for (double elementTooyeList: array){
			System.out.printf("ba for-each loop injorieh:  %5.0f \n", elementTooyeList);
		}

		// to copy an array
		double[] array2 = new double[5];
		System.arraycopy(array, 0, array2, 0, array.length);

		for (double elementsInArray2: array2){
			System.out.printf("in ham element haye array2 ke copy shode az array: %5.0f \n", elementsInArray2);
		}
		
		
		// java.util.Arrays class provides sort and binarySearch routines
		
		// Binary search		
		double[] array3 = {6.0, 4.4, 9.1, 0.3, 55.0, 124.0};
		int indexeItem1 = Arrays.binarySearch(array3, 9.1);
		System.out.println(indexeItem1 + "\n");
		
		char[] array4 = {'a', 'l', 'i', 't', 'r', 'g', 'f'};
		int indexeItem2 = Arrays.binarySearch(array4, 'a');
		int indexeItem3 = Arrays.binarySearch(array4, 't');
		System.out.println(indexeItem2 + "\n");		
		System.out.println(indexeItem3 + "\n");
		
		// sort	
		Arrays.sort(array3);
		for(double item: array3){
			System.out.printf("%2.2f \n", item);
		}
	
		Arrays.sort(array4);
		for(char item: array4){
			System.out.printf("%c \n", item);		
		}

		// equal arrays?
		System.out.printf("it's %b that array and array3 are equal. \n", Arrays.equals(array, array3));
		
		// array to String
		System.out.printf("%s \n", Arrays.toString(array3));
		
		
		// two-dimentional array
		int[][] matrix = new  int[10][10];
		for (int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				matrix[row][column] = (int)(Math.random() * 100);
			}
		}
		
		for (int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.printf("%4d ", matrix[row][column]);
			}
			System.out.print("\n");
		}


		// Date 
		Date date = new Date();
		System.out.printf("%s \n", date.getTime());
		System.out.printf("%s \n", date.toString());

		// GUI e saadeh		
		JFrame frame1 = new JFrame();
		frame1.setTitle("title e in frame eh");
		frame1.setSize(200, 150);
		frame1.setLocation(200,100);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JFrame frame2 = new JFrame();
		frame2.setTitle("title e in frame dovvomi eh");
		frame2.setSize(200, 150);
		frame2.setLocation(410,100);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Button e clickable
		JButton jbtOK = new JButton("Amirhosein programmer e khafan injast :D");
		
		// Label ya hamoon text baraye har chizi roo GUI
		JLabel jlbl = new JLabel("This is a label! na baba?!");
		
		// Text field ke mishe nevesht toosh, albate toosh neveshte ham dare
		JTextField jtfName = new JTextField("inam ye text eh");
		
		// Check Box e tik khordani
		JCheckBox jchkIranian = new JCheckBox("Iranian");
		JCheckBox jchkSwedish = new JCheckBox("Swedish");
		JCheckBox jchkAmerican = new JCheckBox("American");
		JCheckBox jchkCanadian = new JCheckBox("Canadian");
		
		// Radio Button e entekhab kardani
		JRadioButton jrbMale = new JRadioButton("Male");
		JRadioButton jrbFemale = new JRadioButton("Female");
		
		// Combo Box ke drop down ei, ke entekhab koni az toosh beyne gozineha sh
		JComboBox jcboxCollegeYear = new JComboBox(new String[] {"Freshman", "Sophomore", "Junior", "Senior"});
		
		// Panel
		JPanel panel = new JPanel();
		panel.add(jbtOK);
		panel.add(jlbl);
		panel.add(jtfName);
		panel.add(jchkIranian);
		panel.add(jchkSwedish);
		panel.add(jchkAmerican);
		panel.add(jchkCanadian);
		panel.add(jrbMale);
		panel.add(jrbFemale);
		panel.add(jcboxCollegeYear);

		// Frame
		JFrame frame3 = new JFrame();
		frame3.setTitle("in ham GUI e dast saaze Amir programmer e khafan");
		frame3.setSize(500,200);
		frame3.setLocation(200, 400);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setVisible(true);
		
		frame3.add(panel);
*/

/*		
		// StringBuilder: mesle String eh, + inke mishe tagheiresh dad o append kard behesh o ina. immutable nist
		StringBuilder stringBuilder = new StringBuilder();
		String stringB = input.nextLine();		
		stringBuilder.append(stringB);
		System.out.println(stringBuilder + "\n");
		System.out.println(stringBuilder.reverse() + "\n");
*/

/*
		// MAX_VALUE of an int, float, long, double		
		System.out.println("\n The maximum value of an int is: " + Integer.MAX_VALUE);
		System.out.printf("\n The maximum value of an float is: %100.100e", Float.MAX_VALUE);
		System.out.printf("\n The maximum value of an double is: %100.100e", Double.MAX_VALUE);
		System.out.println("\n The maximum value of an long is: " + Long.MAX_VALUE);
		System.out.println("\n The maximum value of an short is: " + Short.MAX_VALUE);
*/


/*
		// convert a decimal to hexadecimal
		System.out.println(String.format("%x", 255) + "\n");
		// convert a decimal to octal		
		System.out.println(String.format("%o", 255) + "\n");
		//convert a digit String into an int
		System.out.println(Integer.parseInt("255") + "\n");
		// string to double
		System.out.println(Double.parseDouble("255") + "\n");
		// convert a binary (radix 2; mabnaaye 2) to int
		System.out.println(Integer.parseInt("11111111", 2) + "\n");
		// convert a hexadecimal (radix 16) to int
		System.out.println(Integer.parseInt("A", 16) + "\n");
		// convert an octal to int
		System.out.println(Integer.parseInt("77", 8) + "\n");

		
		// Array vs. ArrayList
		// Array is fixed size. Static Array.
		// ArrayList is unlimited size. Dynamic Array eh.
	
		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("Tehran");
		cityList.add("Rome");
		cityList.add("New York");
		cityList.add("Vancouver, Canada");
		cityList.add("Stockholm, Sweden");

		System.out.println("====================" + "\n");
		for(int i = 0; i < cityList.size(); i++){
			System.out.println(cityList.get(i) + "\n");		
		}
		System.out.println("====================" + "\n");

		System.out.println("cityList size: " + cityList.size() + "\n");
		System.out.println("cityList contains Rome? " + cityList.contains("Rome") + "\n");		
		cityList.remove("Rome");		

		System.out.println("====================" + "\n");
		for(int i = 0; i < cityList.size(); i++){
			System.out.println(cityList.get(i) + "\n");		
		}
		System.out.println("====================" + "\n");

		System.out.println("cityList contains Rome? " + cityList.contains("Rome") + "\n");		
		System.out.println("cityList index of New York: " + cityList.indexOf("New York") + "\n");		
		System.out.println("cityList at index 2: " + cityList.get(2) + "\n");		
		
		System.out.println("====================" + "\n");
		for(int i = 0; i < cityList.size(); i++){
			System.out.println(cityList.get(i) + "\n");		
		}
		System.out.println("====================" + "\n");

		cityList.remove("Stockholm, Sweden");		
		cityList.remove(0);		
		
		System.out.println("====================" + "\n");
		for(int i = 0; i < cityList.size(); i++){
			System.out.println(cityList.get(i) + "\n");		
		}
		System.out.println("====================" + "\n");

		// print the entire ArrayList
		System.out.println(cityList.toString() + "\n");
*/


/*
		
		JFrame frame = new JFrame();
		
		// Flow Layout		
//		frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

		// Grid Layout
//		frame.setLayout(new GridLayout());
//		frame.setLayout(new GridLayout(3, 2));


		// Border Layout
//		frame.setLayout(new BorderLayout());
//		frame.setLayout(new BorderLayout(8, 8));
		// Border Layout doesn't work by just altering this line. You have to add a BorderLayout.EAST, BorderLayout.WEST, BorderLayout.SOUTH, BorderLayout.NORTH, BorderLayout.CENTER, when adding elements to the frame, in the add lines. 

		frame.add(new JLabel("First Name: "));
		frame.add(new JTextField(20));
		frame.add(new JLabel("MI"));
		frame.add(new JTextField(1));
		frame.add(new JLabel("Last Name: "));
		frame.add(new JTextField(30));

		frame.setTitle("in ye title eh");	
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);


*/


/*		
		JFrame frame = new JFrame();
		
		// Border Layout
//		frame.setLayout(new BorderLayout());
		frame.setLayout(new BorderLayout(8, 8));

		frame.add(new JLabel("First Name: "), BorderLayout.NORTH);
		// frame.add(new JTextField(20), BorderLayout.NORTH);
		frame.add(new JLabel("MI"), BorderLayout.WEST);
		// frame.add(new JTextField(1), BorderLayout.WEST);
		frame.add(new JLabel("Last Name: "), BorderLayout.SOUTH);
		// frame.add(new JTextField(30), BorderLayout.SOUTH);

		frame.setTitle("in ye title eh");	
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		
		// ye jooriayi, GradLayout is better than the other ones.

*/

		// Frame
		JFrame frame = new JFrame();
		
		// Panel
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		NewPanel panel4 = new NewPanel();
		
		// Layout
		panel1.setLayout(new BorderLayout(10, 10));
		panel2.setLayout(new GridLayout(3, 3));
		panel3.setLayout(new GridLayout(1, 4));	
// 		panel4.setLayout(new BorderLayout(10, 10));			
	
		// Border
		panel1.setBorder(new TitledBorder("Title e in :D"));
		panel2.setBorder(new LineBorder(Color.BLACK, 2));
		panel3.setBorder(new TitledBorder("Country Flags"));		
		panel4.setBorder(new TitledBorder("Graphic baazi"));		
	
		// Cursor
		panel1.setCursor(new Cursor(Cursor.TEXT_CURSOR));		
		panel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel4.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		
		
		for(int i = 1; i <= 9; i++){
			panel2.add(new JButton("" + i));
		}
	
		JLabel jlbl = new JLabel("Amirhosein shaakh eh too Programming");
		// Tool Tip Text		
		jlbl.setToolTipText("inam tool tip e ineh");
		panel1.add(jlbl, BorderLayout.CENTER);
		
		// ImageIcon
		ImageIcon icon = new ImageIcon("/home/aha/Downloads/famfamfam_flag_icons/png/us.png");
		JLabel iconLabel = new JLabel(icon);

		panel1.add(iconLabel, BorderLayout.WEST);
		panel1.add(panel2, BorderLayout.EAST);
		panel1.add(panel3, BorderLayout.SOUTH);
		panel1.add(panel4, BorderLayout.NORTH);

		frame.add(panel1);
	
		// Image Icons country flags
		ImageIcon irFlag = new ImageIcon("/home/aha/Downloads/famfamfam_flag_icons/png/ir.png");
		ImageIcon seFlag = new ImageIcon("/home/aha/Downloads/famfamfam_flag_icons/png/se.png");
		ImageIcon usFlag = new ImageIcon("/home/aha/Downloads/famfamfam_flag_icons/png/us.png");
		ImageIcon caFlag = new ImageIcon("/home/aha/Downloads/famfamfam_flag_icons/png/ca.png");
		
		JButton irButton = new JButton("Iran", irFlag);
		JButton seButton = new JButton("Sweden", seFlag);
		JButton usButton = new JButton("United States", usFlag);
		JButton caButton = new JButton("Canada", caFlag);

		panel3.add(irButton);
		panel3.add(seButton);
		panel3.add(usButton);
		panel3.add(caButton);

		// Pressed Icon
		irButton.setPressedIcon(usFlag);
		caButton.setPressedIcon(usFlag);
		
		// Rollover Icon
		seButton.setRolloverIcon(usFlag);
		

		// Title
		frame.setTitle("in ye title eh");	
		// Size		
		frame.setSize(400,250);
		// Location		
		frame.setLocationRelativeTo(null);
		// On Close		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Visible		
		frame.setVisible(true);

		
	} // main method

} // JavaProgram class







class NewPanel extends JPanel{
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		// g.drawLine(20, 20, 100, 100);
		g.drawString("es tring", 20, 50);
		g.fillRect(20, 20, 100, 100);
	} // paintComponent Overriden method

} // NewPanel class



