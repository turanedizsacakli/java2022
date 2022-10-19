package homeworkProjectDayThree.core.concrete;

import homeworkProjectDayThree.core.absrtract.ILogger;

public class EmailLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Email is logged...");
		
	}

}
