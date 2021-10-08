package oops;

public class Person_test
 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setId(1);
		p.setName("vishal");
		Job j = new Job();
		p.setJb(j);
		p.jb.setJobid(333);
		j.setProfile("DEVELOPER");
		Joiningdate jd = new Joiningdate();
		jd.setDay(01);
		jd.setMonth(04);
		jd.setYear(2021);
		j.setDt(jd);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getJb().getJobid());
		System.out.println(p.getJb().getProfile());
	}

}
