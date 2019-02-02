package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		ConstructorInjectedController constructorInjectedController=ctx.getBean(ConstructorInjectedController.class);
		controller.hello();
		System.out.println(constructorInjectedController.sayHello());
		System.out.println(controller.greet());
	}
}
