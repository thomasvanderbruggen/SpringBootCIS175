/** 
 * @author Thomas VanderBruggen - tvanderbruggen
 * CIS175 - Spring 2021
 * 3/18/2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Long>{}