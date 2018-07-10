package basics;

public class LoopysWithArrays {

	public static void main(String[] args) {
		int d = 0;
		int w = 0;
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";

		// do loops run first then test condition
		do {
			System.out.println("This is the DO loop: " + states[d]);
			d++;
		} while (d < 5);
		
		// while loops test condition first then run the loop
		while (w <= 4) {
			System.out.println("This is the WHILE loop: " + states[w]);
			w++;
		}
		
		boolean stateFound = false;
		int sf = 0;
		while(!stateFound) {
			if (states[sf] == "Texas"){
				System.out.println("Texas was found!");
				stateFound = true;
			}
			System.out.println(states[sf]);
			sf++;
		}
		
		for (int f = 0; f <= 4; f++) {
			System.out.println("For loop: " + states[f]);
		}
	}

}
