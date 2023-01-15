package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		
		String[] vect = new String[] {"Motherboard", "Processor", "RamMemory", "SolidStateDrive", "PowerSupply"};
		
		System.out.println("<<Computer components>>");
		for (String x : vect) {
			System.out.println(x);
		}
		
		List<String> list = new ArrayList<>();
		
		list.add("Monitor");
		list.add("Keyboard");
		list.add("Mouse");
		list.add("Headphone");
		list.add("Camera");
		
		System.out.println("\n<<Computer peripherals>>");
		for (String y : list) {
			System.out.println(y);
		}
	}
}
