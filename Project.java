public class Project {
	//Attributes 
	String ERF_number;
	String project_number;
	String project_name;
	String customer_name;
	String customer_surname;
	String building_type;
	String physical_address;
	String deadline;

	//Constructors
	public Project(String ERF_number,String project_number,String project_name,String customer_name,String customer_surname,String building_type,
			String physical_address,String deadline)  {
		this.ERF_number = ERF_number;
		this.project_number = project_number;
		this.project_name = project_name;
		this.customer_name = customer_name;
		this.customer_surname = customer_surname;
		this.building_type = building_type;
		this.physical_address = physical_address;
		this.deadline = deadline;
        
	}
	//Methods
	public String getERFNumber() {
		return ERF_number;
	}
	public String getProjectNumber() {
		return project_number;
	}
	public String getProjectName() {
		return project_name;
	}
	public String getCustomer() {
		String customerInfo = customer_name;
		customerInfo += customer_surname; 
		return customerInfo ;
	}
	public String BuildingType() {
		return building_type;
	}
	public String getPhysicalAddress() {
		return physical_address;
	}
	public String getDeadline() {
		return deadline;

	}
	public String toString() {
		String work =  "ERF number = " + ERF_number;
		work +=  "\nProject number = " + project_number;
		work += "\n Project name = " +  project_name;
		work += "\nCustomer name = " + customer_name;
		work +=  "\nCustomer surname = " + customer_surname;
		work +=  "\nBuilding  type = " + building_type;
		work +=  "\nPhysical address = " + physical_address;
		work +=  "\nDeadline = " + deadline;
		return work;

	}

}