public class RoboResume {

	private String name;
	private String emailAddress;
	private String[] education = new String[10];
	private String[] work = new String[11];
	private String[] skills = new String[20];

	// Constructor
	public RoboResume(String userName, String userEmailAddress) {
		this.name = userName;
		this.emailAddress = userEmailAddress;
	}

	// Name Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// EmailAddress Methods
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	// Education Methods
	public String getEducation() {
		for (int i = 0; i < education.length; i++) {
			System.out.println(education[i]);
		}
		return " ";
	}

	public void setEducation(String educationName, int educationNumber) {
		this.education[educationNumber] = educationName;
	}

	public int getEducationLength() {
		return education.length;
	}

	// Work Methods
	public String getWork() {
		for (int i = 0; i < work.length; i++) {
			System.out.println(work[i]);
		}
		return " ";
	}

	public void setWork(String workName, int workNumber) {
		this.work[workNumber] = workName;
	}

	public int getWorkLength() {
		return work.length;
	}

	// Skills Methods
	public String getSkills() {
		for (int i = 0; i < skills.length; i++) {
			System.out.println(skills[i]);
		}
		return " ";
	}

	public void setSkills(String skillsName, int skillsNumber) {
		this.skills[skillsNumber] = skillsName;
	}

	public int getSkillsLength() {
		return skills.length;
	}

	// toStringMethod
	public String toString() {
		System.out.println(" ");
		System.out.println("=================================================");
		System.out.println(name);
		System.out.println(emailAddress);
		// print Education
		System.out.println(" ");
		System.out.println("~~~~~~~~Education~~~~~~~~");
		for (int i = 0; i < education.length; i++) {
			if (education[i] != null)
				System.out.println(education[i]);
		}
		// print Works
		System.out.println(" ");
		System.out.println("~~~~~~~~Work Experience~~~~~~~~");
		for (int i = 0; i < work.length; i++) {
			if (work[i] != null)
				System.out.println(work[i]);
		}
		// print Skills
		System.out.println(" ");
		System.out.println("~~~~~~~~Skills~~~~~~~~");
		for (int i = 0; i < skills.length; i++) {
			if (skills[i] != null)
				System.out.println(skills[i]);
		}

		return " ";
	}
}
