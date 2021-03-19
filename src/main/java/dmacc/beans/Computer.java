/** 
 * @author Thomas VanderBruggen - tvanderbruggen
 * CIS175 - Spring 2021
 * 3/18/2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String cpu; 
	private String gpu; 
	private int storageSize; 
	private String storageType; 
	private int ramCap; 
	public Computer() { } 
	public Computer(String cpu, String gpu, int storageSize, String storageType, int ramCap) { 
		this.cpu = cpu; 
		this.gpu = gpu; 
		this.storageSize = storageSize; 
		this.storageType = storageType; 
		this.ramCap = ramCap; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getStorageSize() {
		return storageSize;
	}
	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	public String getStorageType() {
		return storageType;
	}
	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}
	public int getRamCap() {
		return ramCap;
	}
	public void setRamCap(int ramCap) {
		this.ramCap = ramCap;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", cpu=" + cpu + ", gpu=" + gpu + ", storageSize=" + storageSize
				+ ", storageType=" + storageType + ", ramCap=" + ramCap + "]";
	}

}
