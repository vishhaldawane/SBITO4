
public class GirlTest {
	public static void main(String[] args) {
		Girl girl1 = new Girl("Jane");
		Girl girl2 = new Girl("Julie");
		Girl girl3 = new Girl("Reeta");
		
		System.out.println("girl1 "+girl1);
		System.out.println("girl2 "+girl2);
		System.out.println("girl3 "+girl3);
		
		//passing object as a parameter/argument into a function
		girl2.talk(10,girl1);
		
		String msg = girl3.gossip(girl1,girl2);
		System.out.println("msg "+msg);
		
		CaseStudy caseStudy = new CaseStudy("Payee Management", 4, 24);
		Project project = girl1.work(caseStudy,girl2,girl3);
		System.out.println("Project is : "+project);
		
		
	}
}

class Girl
{
	String girlName;

	@Override
	public String toString() {
		return "Girl [girlName=" + girlName + "]";
	}
	Girl(String gn) {
		girlName = gn;
	}
	void selfTalk() {
		System.out.println(girlName+" is having self talk...");
	}
	void talk(int x) {
		System.out.println(girlName+" is talking for "+x+" minutes..");
	}
	void talk(int x, Girl g) { //g is a proxy/ref to the actual object which is being passed
		System.out.println(girlName+" is talking for "+x+" minutes with "+g.girlName);
	}
	String gossip(Girl x, Girl y) {
		System.out.println(girlName+" is gossiping with "+x.girlName+" and "+y.girlName);
		return "How is java training going on???";
	}
	
	Project work(CaseStudy c,Girl x, Girl y) {
		System.out.println("work in progress...got the case study...creating a project....");
		System.out.println(girlName+","+x.girlName+" and "+y.girlName+" are working on "+c.caseStudyTitle+" case study..");
		Project proj = new Project(c.caseStudyTitle, "Banking");
		return proj;
	}
}
class Project {
	String title;
	String type;
	public Project(String title, String type) {
		super();
		this.title = title;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Project [title=" + title + ", type=" + type + "]";
	}
	
	
}
class CaseStudy {
	String caseStudyTitle;
	int teamSize;
	int duration;
	public CaseStudy(String caseStudyTitle, int teamSize, int duration) {
		super();
		this.caseStudyTitle = caseStudyTitle;
		this.teamSize = teamSize;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "CaseStudy [caseStudyTitle=" + caseStudyTitle + ", teamSize=" + teamSize + ", duration=" + duration
				+ "]";
	}
	
	
	
}
	
