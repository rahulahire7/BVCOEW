public class Employee {
	//Instance variable...
	private int empId;
	private String ename;
	private double esal;
	
	private Address addr;
	
	public int getEmpId() {
		
		return empId;
	}
	public void setEmpId(int empId) {
		if(empId>0)
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	

	
	

}
