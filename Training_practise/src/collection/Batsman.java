package collection;

public class Batsman
{
	int batid;
	String batname;
	
	public Batsman(int batid, String batname) {
		super();
		this.batid = batid;
		this.batname = batname;
	}

	@Override
	public String toString() {
		return "Batsman [batid=" + batid + ", batname=" + batname + "]";
	}

	public static void main(String[] args) 
	{
		

	}

}
