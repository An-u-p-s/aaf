package anups.aaf.builder.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import anups.dat.en.core.annotations.HtmlDataConfiguration;
import anups.utility.core.browser.DefaultBrowser;

@SpringBootApplication
@ComponentScan(basePackages = {"anups"})
@HtmlDataConfiguration(basePath={"dat"},defaultPackage="anups.aaf.builder.html")
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
