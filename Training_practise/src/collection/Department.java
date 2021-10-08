package collection;

import java.util.List;

public class Department {

	int deptid;
	String deptname;
	List<Student> studentlist;

	public Department(int deptid, String deptname, List<Student> studentlist2) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.studentlist = studentlist2;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", studentlist=" + studentlist + "]";
	}

}
