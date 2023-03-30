package object;

import java.util.Iterator;

public class SmartMain {

	public static void main(String[] args) {
		
		SmartPhone sm = new SmartPhone();
		
		for (int i = 0; i < sm.contact.length; i++) {
			sm.saveData();
			
		}

		sm.showData();
		sm.searchData();
		sm.deleteData();
		sm.updateData();
	}
	

}
