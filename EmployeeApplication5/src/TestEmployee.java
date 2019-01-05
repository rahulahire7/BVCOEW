public class TestEmployee {
	public static void main(String[] args) {
		System.out.println("hi..");
		Address a=new Address("Pune","Maha");
		
		Employee e=new Employee();
		System.out.println("hello..");
		e.setEmpId(101);
		e.setEname("Ramesh");
		e.setEsal(1000);
		e.setAddr(a);
		
		System.out.println("welcome..");
		System.out.println("Employee id :"+e.getEmpId());
		System.out.println("Employee Name :"+e.getEname());
		System.out.println("Employee Sal :"+e.getEsal());
		System.out.println("good bye...");
		System.out.println("City :"+e.getAddr().getCity());
		System.out.println("State :"+e.getAddr().getState());
		
	}

}
