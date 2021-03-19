/** 
 * @author Thomas VanderBruggen - tvanderbruggen
 * CIS175 - Spring 2021
 * 3/18/2021
 */
package dmacc;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Computer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}
	
	@Autowired
	ComputerRepository repo; 
	@Override
	public void run(String... args) { 
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class); 
		Scanner sc = new Scanner(System.in);
		
		Computer c = appContext.getBean("computer", Computer.class);
		System.out.println("----Enter Computer Info----"); 
		System.out.println("Enter CPU: "); 
		c.setCpu(sc.nextLine());
		System.out.println("Enter GPU: "); 
		c.setGpu(sc.nextLine());
		System.out.println("Enter Storage capacity: "); 
		c.setStorageSize(sc.nextInt());
		sc.nextLine(); 
		System.out.println("Enter Storage Type (Solid state, Hard disk, Mixed, etc): "); 
		c.setStorageType(sc.nextLine());
		System.out.println("Enter RAM capacity: "); 
		c.setRamCap(sc.nextInt());
		sc.close(); 
		repo.save(c);
		
		
		List<Computer> allComputers = repo.findAll(); 
		System.out.println("\n\n----All computers in DB----"); 
		for (Computer comp: allComputers) { 
			System.out.println(comp); 
		}
	}

}
