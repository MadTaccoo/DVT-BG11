package test;

public class Methods {
	public static void main(String[] args) {
		System.out.print(bellen("Einstein", 6, "Wulff"));
	}

	public static void bellen() {
		System.out.println("Woof!");
	}
	
	public static void bellen(int anzahl) {
		if(anzahl <= 0) {
			return;
		}
		
		for(int i = 0; i < anzahl; i++) {
            System.out.print("Woof! ");
		}
		System.out.println();
	}
	
	public static String bellen(String name, int anzahl, String bellart) {
        String ret = name+": ";
		
		for(int i = 0; i < anzahl; i++) {
            ret += bellart + " ";
		}
		ret += "\n";
		
		return ret;
	}

}
