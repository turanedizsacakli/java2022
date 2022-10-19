package overriding;

public class Main {

	public static void main(String[] args) {
		
		BaseCreditManager[] creditManagers=new BaseCreditManager[] {new TeacherCreditManager(), new FarmCreditManager(), new StudentCreditManager()};
		for (BaseCreditManager creditManager:creditManagers) {
			System.err.println(creditManager.calc(1000));
		}

	}

}
