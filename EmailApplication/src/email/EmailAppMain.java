package email;

public class EmailAppMain {
	
	public static void main(String args[]) {
		Email em= new Email("Sri","Rupa");
		System.out.println(em.showInfo());
		em.setAlternateEmail("alt@gmail.com");
		System.out.println("your alternate email is "+em.getALternateEmail());
	}

}
