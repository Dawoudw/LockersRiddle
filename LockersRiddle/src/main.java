import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		int totalOpened = 0;
		ArrayList<Boolean> lockersList = new ArrayList<Boolean>();
		for (int i = 1; i <= 100; i++) {
			lockersList.add(true);
		}
		for (int x = 2; x < lockersList.size(); x++) {
			for (int j = 1; x * j < lockersList.size(); j++) {

				if (lockersList.get(x * j) == false) {
					lockersList.set(x * j, true);
				} else {
					lockersList.set(x * j, false);
				}
			}
		}

		for (int i = 0; i < lockersList.size(); i++) {
			if (lockersList.get(i).booleanValue() == true) {
				System.out.println("Locker:  [" + i + "] is open.");
				totalOpened++;
			}
		}
		System.out.println("Total Opened Lcokers: " + totalOpened);
	}
}
