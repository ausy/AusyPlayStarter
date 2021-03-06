package job;

import java.text.MessageFormat;
import java.util.Date;

import play.Logger;
import play.jobs.Job;

/**
 * Sample of class to illustrate how Jobs work.
 */
//@Every("10s") uncomment to enable
public class FakeJob extends Job<Object> {

	@Override
	public void doJob() throws Exception {
		String log = MessageFormat.format("Exemple de job effectué à : {0, date, hh:mm:ss}", new Date());
		Logger.info(log);
	}
}
