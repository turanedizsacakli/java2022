package homeworkProjectDayThree.core.concrete;

import homeworkProjectDayThree.core.absrtract.ILogger;

public class ConsoleLogger  implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("For Console is logged...");
		
	}

}
