package homeworkProjectDayThree.core.concrete;

import homeworkProjectDayThree.core.absrtract.ILogger;

public class FileLogger  implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("File is logged...");
		
	}

}
