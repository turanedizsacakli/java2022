package oopWithNLayeredApp.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.err.println("mail gönderildi...");
		
	}

}
