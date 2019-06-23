package anups.aaf.builder.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import anups.aaf.builder.util.DefaultBrowser;

@SpringBootApplication
@ComponentScan(basePackages = {"anups.aaf.builder"})
public class ApplicationStart  implements CommandLineRunner {

  
  public static void main(String[] args) {
	SpringApplication.run(ApplicationStart.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
	  DefaultBrowser defaultBrowser = new DefaultBrowser();
	  defaultBrowser.openURL("http://localhost:8991/");
  }
  
}
