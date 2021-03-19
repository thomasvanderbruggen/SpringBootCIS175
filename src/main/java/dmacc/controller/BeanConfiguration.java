/** 
 * @author Thomas VanderBruggen - tvanderbruggen
 * CIS175 - Spring 2021
 * 3/18/2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;

@Configuration
public class BeanConfiguration {
	@Bean
	public Computer computer() { 
		Computer c = new Computer(); 
		return c; 
	}
	
}
