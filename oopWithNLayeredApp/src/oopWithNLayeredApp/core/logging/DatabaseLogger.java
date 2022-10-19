package oopWithNLayeredApp.core.logging;

//, java.lang.System.Logger
public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.err.println("veritabanına loglandı...");
	}

}
