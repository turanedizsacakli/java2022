package homeworkProjectDayThree.core.concrete;

import homeworkProjectDayThree.core.absrtract.ILogger;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Database is logged..." + data);
		
	}

}
