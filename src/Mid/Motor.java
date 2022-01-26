package Mid;

import java.util.Scanner;
import java.io.InputStream;
import java.util.Vector;

public class Motor extends Kendaraan {

	public Motor(InputStream in) {
		super(in);
	}

	Scanner scan = new Scanner(System.in);
	Vector<String>jenis1List;
	Vector<Integer>helmList;
	
	protected String jenis1;
	protected int helm;
	
	public void motor() {
		jenis1List = new Vector<>();
		helmList = new Vector<>();
		
		do {
			System.out.println("Input type [Automatic | Manual] : ");
			jenis1 = scan.nextLine();
		}while (!jenis1.equals("Automatic") && !jenis1.equals("Manual"));
		
		do {
			System.out.println("Input helm amount [>= 1] : ");
			helm = scan.nextInt();
			scan.nextLine();
		}while (helm < 1);
		System.out.print("Enter to return");
		scan.nextLine();
		
		jenis1List.add(jenis1);
		helmList.add(helm);
	}

	
}
