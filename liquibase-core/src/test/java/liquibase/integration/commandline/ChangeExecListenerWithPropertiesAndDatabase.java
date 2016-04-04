package liquibase.integration.commandline;

import java.util.Properties;

import liquibase.changelog.visitor.AbstractChangeExecListener;
import liquibase.database.Database;

public class ChangeExecListenerWithPropertiesAndDatabase extends AbstractChangeExecListener {
	private final Database database;
	private final Properties properties;
	
	public ChangeExecListenerWithPropertiesAndDatabase(Properties properties, Database database) {
		this.database = database;
		this.properties = properties;
	}
	
	public Properties getProperties() {
		return properties;
	}

	public Database getDatabase() {
		return database;
	}
}
