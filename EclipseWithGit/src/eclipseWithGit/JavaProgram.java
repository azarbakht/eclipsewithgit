package eclipseWithGit;

import javax.swing.*;
import javax.swing.border.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
import java.util.*;
import java.awt.*;

public class JavaProgram {

	public static void main(String[] args){

		// OUTPUT ***********************************************************	// dialog box pop-on with a message
		JOptionPane.showMessageDialog(null, "ye message too dialog box");
		// JOptionPane.showMessageDialog(null, "ye message e dige too Dialog box", "Title e dialogBox emoon", JOptionPane.INFORMATION_MESSAGE);
		// JOptionPane.showMessageDialog(null, "ye adad beyne 0-10 benevis. Ba'desh bedoone enter zadan ye word benevis. Ba'desh ye khat chiz miz benevis");
		System.out.println("ye adad beyne 0-10 benevis. Ba'desh bedoone enter zadan ye word benevis. Ba'desh ye khat chiz miz benevis: \n");


		// INPUT *************************************************************************************************	
		Scanner input = new Scanner(System.in);
		double adad = input.nextDouble();	// to read a Double adad
		// input.nextLine();	// add this after every input nextInt, nextDouble, etc. to consume the trailing \n that they leave behind and will become problematic down the line in the program next time you're using nextLine
		JOptionPane.showMessageDialog(null, adad);	// show what iput we got for the user

		String word = input.next();			// input a String
		String line1 = input.nextLine();	// input a line of Strings
		JOptionPane.showMessageDialog(null, word);
		JOptionPane.showMessageDialog(null, line1);
		//		input.close();						// Close the scanner input to prevent resource leak

		// INPUT from Args *************************************************************************************************	
		for (int i=0; i < args.length; i++){
			System.out.printf("args[%d] = %30s \n ", i, args[i]);
		}

		// CASTING ***********************************************************************************************
		System.out.println( (int)4.7 );

		char letter1 = 'A';
		String letter2 = "A";

		char letter3 = '\u0041';
		char letter4 = '\u6B22';	// Chinese characters
		char letter5 = '\u8FCE'; 
		char letter6 = '\u03b3';	// Greek character

		char alef = '\u0627';	// Persian letters
		char mim = '\u0645';	
		char ye = '\u0649';
		char re = '\u0631';

		System.out.println(letter1);
		System.out.println(letter2);
		System.out.println(letter3);
		System.out.println(letter4);
		System.out.println(letter5);
		System.out.println(letter6);
		System.out.println(alef);
		System.out.println(mim);
		System.out.println(ye);
		System.out.println(re);

		String amir = new String();		// benevis Amir :D
		amir = Character.toString(alef) + Character.toString(mim) + Character.toString(ye) + Character.toString(re);	// convert a Character to String
		System.out.println(amir);
		JOptionPane.showMessageDialog(null, amir);


		// input in GUI ******************************************************************************************
		String khatGUI = JOptionPane.showInputDialog(null, "enter some text", "Input box title here", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, khatGUI, khatGUI, JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, khatGUI);


		// IF STATEMENT ******************************************************************************************
		System.out.println("Enter a number, and we'll tell you if it's greater or less than 7: ");
		float adadefloat = input.nextFloat();
		input.nextLine();
		if (adadefloat > 7){
			System.out.println(adadefloat + " bozorgtar az 7 eh");
		}
		else if (adadefloat < 7){
			System.out.println(adadefloat + " koochiktar az 7 eh");
		}
		else {
			System.out.println(adadefloat + " mosaavi e 7 eh");
		}


		// INLINE True/False check BOOLEAN ************************************************************************
		boolean even = adadefloat % 2 == 0;
		if(even == true){
			System.out.println(adadefloat + " is an even number");
		} else if(even == false){
			System.out.println(adadefloat + " is an odd number");
		}


		// Generate a RANDOM NUMBER *******************************************************************************
		// Math.random() returns a double value between 0.0 and 1.0, but not 1.0		
		float randomNumber1 = (float)(Math.random());
		float randomNumber2 = (float)(Math.random());
		// to get a random number between 0 and 10 
		int randomNumber3 = (int)(Math.random() * 10);
		System.out.println(randomNumber1 + "\n");
		System.out.println(randomNumber2);
		System.out.println(randomNumber3);
		// generate 10 random numbers
		for (int i = 0; i < 10; i++){
			int randomNumber4 = (int)(Math.random() * 10);
			System.out.println(randomNumber4);
		}


		// EXIT STATUS (Normal vs. Abnormal) ***********************************************************************
		int status = 0;
		// be System.exit(status); age status 0 bedim, yani normal. (gheyre 0 bedim yani abnormal)
		if (status != 0){
			System.out.println("Error: invalid status");
			System.exit(1);
		}


		// EXCLUSIVE OR ^ *******************************************************************************************
		if (adadefloat % 2 == 0 ^ adadefloat % 3 ==0){
			System.out.println(adadefloat + " is divisible by 2 or 3, but not divisible by both");
		}


		// SWITCH ***************************************************************************************************
		switch ((int)adadefloat){
		case (7): System.out.println(adadefloat + " is 7"); break;
		case (2): System.out.println(adadefloat + " is 2"); break;
		default: System.out.println(adadefloat + " is neither 7 nor 2");
		}

		switch((int)adadefloat){
		case(7): System.out.println(adadefloat + " is 7"); break;
		case (2): System.out.println(adadefloat + " is 2"); break;
		default: System.out.println(adadefloat + " is neither 2 nor 7");
		}


		// INLINE IF STATEMENT ELSE *********************************************************************************
		boolean y = (adadefloat > 0) ? true: false; 		
		System.out.println(y);


		// OUTPUT FORMATTING ****************************************************************************************
		int adadeInt = 83;
		char adadeChar = 'a';
		String adadeString = "salaam salaam in Amirhosein Azarbakht, programmer e khafan eh!";
		boolean adadeBoolean = true;

		System.out.printf("in format nashode st %f", adadefloat);

		// float 2.4 yani 2 ta adad ghable . (including the decimal point .), va 4 ta adad ba'de .
		System.out.printf("\n in format shodeh st %2.4f \n", adadefloat);

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


		// CONFIRMATION INPUT DIALOG BOX ***********************************************************************************
		System.out.println("Enter an email address: \n");
		String email = input.nextLine();
		int answer = JOptionPane.showConfirmDialog(null, "Are you sure this is what you want? " + email);
		if (answer == JOptionPane.YES_OPTION){
			System.out.println("You said Yes, " + email);
		}
		else if (answer == JOptionPane.NO_OPTION){
			System.out.println("You said No, " + email);	
		}
		else if (answer == JOptionPane.CANCEL_OPTION){
			System.out.println("You said Cancel, " + email);		
		}


		// to redirect input text from a file: ************************************************************************
		// java JavaProgram < text.txt 


		// WHILE LOOP *************************************************************************************************
		int sentinel = 1;
		while (sentinel < 10){
			System.out.printf("in Sentinel e #%d eh \n", sentinel);
			sentinel++;
		}


		// DO WHILE LOOP **********************************************************************************************
		sentinel = 1;
		do{
			System.out.printf("in Sentinel e #%d eh \n", sentinel);
			sentinel++;		
		} while (sentinel < 10);


		// FOR LOOP ****************************************************************************************************
		for (int i = 0; i < 10; i++){
			System.out.printf("in i e #%d eh \n", i);
		}


		// BREAK; to break OUT of a LOOP; mippare az loop biroon *******************************************************
		for (int i = 0; i < 10; i++){
			System.out.printf("in break e #%d eh \n", i);
			if (i == 5){
				break;			
			}
		}


		// CONTINUE; jumps to the END of the LOOP; mippare tahe loop ***************************************************
		// continue breaks out of the CURRENT ITERATION in the loop; SKIPS just ONE iteration!!
		// break breaks out of the loop
		for (int i = 0; i < 10; i++){
			if (i == 5){
				continue;			
			}
			System.out.printf("in continue e #%d eh \n", i);
		}


		// ARRAYS *******************************************************************************************************
		double[] array = new double[5];

		for(int i = 0; i < 5; i++){
			System.out.println("\n Enter a number: ");
			array[i] = input.nextDouble();
		}
		for(int i = 0; i < array.length; i++){
			System.out.printf("%5.0f \n", array[i]);
		}
		System.out.println("Size of this array is " + array.length);

		// FOR-EACH LOOP to access ARRAY elements: to traverse the array sequentially without using an index *************
		for (double elementTooyeList: array){
			System.out.printf("ba for-each loop injorieh:  %5.0f \n", elementTooyeList);
		}

		// COPY an ARRAY *************************************************************************************************
		double[] array2 = new double[5];
		System.arraycopy(array, 0, array2, 0, array.length);
		for (double elementsInArray2: array2){
			System.out.printf("in ham element haye array2 ke copy shode az array: %5.0f \n", elementsInArray2);
		}

		// BINARY SEARCH **************************************************************************************************
		// SORT and BINARY SEARCH; java.util.Arrays class provides sort and binarySearch routines

		double[] array3 = {6.0, 4.4, 9.1, 0.3, 55.0, 124.0};
		int indexeItem1 = Arrays.binarySearch(array3, 9.1);
		System.out.println(indexeItem1 + "\n");

		char[] array4 = {'a', 'l', 'i', 't', 'r', 'g', 'f'};
		int indexeItem2 = Arrays.binarySearch(array4, 'a');
		int indexeItem3 = Arrays.binarySearch(array4, 't');
		System.out.println(indexeItem2 + "\n");		
		System.out.println(indexeItem3 + "\n");

		// SORT ************************************************************************************************************
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

		// Array to String
		System.out.printf("%s \n", Arrays.toString(array3));

		// TWO-DIMENSIONAL ARRAY ********************************************************************************************
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


		// DATE and TIME *****************************************************************************************************
		Date date = new Date();
		System.out.printf("%s \n", date.getTime());
		System.out.printf("%s \n", date.toString());


		// GUI ***************************************************************************************************************

		// FRAME: create a frame from JFrame in SWING package; javax.swing.JFrame;
		JFrame frame1 = new JFrame();
		frame1.setTitle("Frame1 Title");
		frame1.setSize(200, 150);
		frame1.setLocation(200,100);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a second frame
		JFrame frame2 = new JFrame();
		frame2.setTitle("Frame2 Title");
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

		// PANEL **************************************************************************************************
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

		// ADD PANEL TO THE FRAME
		frame3.add(panel);

		// END OF GUI stuff


		// STRINGBUILDER *******************************************************************************************
		// StringBuilder: mesle String eh + inke mishe tagheiresh dad o append kard behesh o ina. immutable nist
		StringBuilder stringBuilder = new StringBuilder();
		String stringB = input.nextLine();		
		stringBuilder.append(stringB);
		System.out.println(stringBuilder + "\n");
		System.out.println(stringBuilder.reverse() + "\n");


		// MAX_VALUE of an int, float, long, double ****************************************************************
		System.out.println("\n The maximum value of an int is: " + Integer.MAX_VALUE);
		System.out.printf("\n The maximum value of an float is: %100.100e", Float.MAX_VALUE);
		System.out.printf("\n The maximum value of an double is: %100.100e", Double.MAX_VALUE);
		System.out.println("\n The maximum value of an long is: " + Long.MAX_VALUE);
		System.out.println("\n The maximum value of an short is: " + Short.MAX_VALUE);


		// HEX to DECIMAL CONVERSION: convert a decimal to hexadecimal *********************************************
		// TYPE CONVERSIONS 
		System.out.println(String.format("%x", 255) + "\n");
		// convert a decimal to OCTAL		
		System.out.println(String.format("%o", 255) + "\n");
		//convert a digit String into an int
		System.out.println(Integer.parseInt("255") + "\n");
		// string to double
		System.out.println(Double.parseDouble("255") + "\n");
		// convert a BINARY (radix 2; mabnaaye 2) to int 
		System.out.println(Integer.parseInt("11111111", 2) + "\n");
		// convert a hexadecimal (radix 16) to int
		System.out.println(Integer.parseInt("A", 16) + "\n");
		// convert an octal to int
		System.out.println(Integer.parseInt("77", 8) + "\n");


		// ARRAYLIST *************************************************************************************************************
		// Array vs. ArrayList: Array is fixed size(Static Array eh), whereas ArrayList is unlimited size (Dynamic Array eh).
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



		// GUI - continued ********************************************************************************************

		JFrame frame4 = new JFrame();
		// Flow Layout		
		//		frame4.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		// Grid Layout
		frame4.setLayout(new GridLayout());
		frame4.setLayout(new GridLayout(3, 2));
		// Border Layout
		//		frame.setLayout(new BorderLayout());
		//		frame.setLayout(new BorderLayout(8, 8));
		// Border Layout doesn't work by just altering this line. You have to add a BorderLayout.EAST, BorderLayout.WEST, BorderLayout.SOUTH, BorderLayout.NORTH, BorderLayout.CENTER, when adding elements to the frame, in the add lines. 
		frame4.add(new JLabel("First Name: "));
		frame4.add(new JTextField(20));
		frame4.add(new JLabel("MI"));
		frame4.add(new JTextField(1));
		frame4.add(new JLabel("Last Name: "));
		frame4.add(new JTextField(30));
		frame4.setTitle("in ye title eh");	
		frame4.setSize(200,200);
		frame4.setLocationRelativeTo(null);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setVisible(true);

		JFrame frame5 = new JFrame();
		// Border Layout
		//		frame5.setLayout(new BorderLayout());
		frame5.setLayout(new BorderLayout(8, 8));
		frame5.add(new JLabel("First Name: "), BorderLayout.NORTH);
		// frame.add(new JTextField(20), BorderLayout.NORTH);
		frame5.add(new JLabel("MI"), BorderLayout.WEST);
		// frame5.add(new JTextField(1), BorderLayout.WEST);
		frame5.add(new JLabel("Last Name: "), BorderLayout.SOUTH);
		// frame5.add(new JTextField(30), BorderLayout.SOUTH);
		frame5.setTitle("in ye title eh");	
		frame5.setSize(200,200);
		frame5.setLocationRelativeTo(null);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setVisible(true);
		// ye jooriayi, GradLayout is better than the other ones.

		// Frame
		JFrame frame6 = new JFrame();
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

		JLabel jlbl1 = new JLabel("Amirhosein shaakh eh too Programming");
		// Tool Tip Text		
		jlbl.setToolTipText("inam tool tip e ineh");
		panel1.add(jlbl1, BorderLayout.CENTER);

		// ImageIcon
		ImageIcon icon = new ImageIcon("/home/aha/Desktop/programming/flags/us.png");
		JLabel iconLabel = new JLabel(icon);

		panel1.add(iconLabel, BorderLayout.WEST);
		panel1.add(panel2, BorderLayout.EAST);
		panel1.add(panel3, BorderLayout.SOUTH);
		panel1.add(panel4, BorderLayout.NORTH);

		frame6.add(panel1);

		// Image Icons country flags
		ImageIcon irFlag = new ImageIcon("/home/aha/Desktop/programming/flags/ir.png");
		ImageIcon seFlag = new ImageIcon("/home/aha/Desktop/programming/flags/se.png");
		ImageIcon usFlag = new ImageIcon("/home/aha/Desktop/programming/flags/us.png");
		ImageIcon caFlag = new ImageIcon("/home/aha/Desktop/programming/flags/ca.png");

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
		frame6.setTitle("in ye title eh");	
		// Size		
		frame6.setSize(400,250);
		// Location		
		frame6.setLocationRelativeTo(null);
		// On Close		
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Visible		
		frame6.setVisible(true);
		// End of GUI-continued



	} // main method

} // JavaProgram class



class NewPanel extends JPanel{
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		// g.drawLine(20, 20, 100, 100);
		g.drawString("es tring", 20, 50);
		g.fillRect(20, 20, 100, 100);
	} // paintComponent Overridden method

} // NewPanel class



