public class Architect {
	//Attributes
		String name;
		int telephone;
		String email_address;
		String physical_address;
		//Constructors
		public Architect(String name,int telephone,String email_address,String physical_address)  {
			this.name = name;
			this.telephone = telephone;
			this.email_address = email_address;
			this.physical_address = physical_address;
		}
		public Architect(String name2, long telephone1, String email_address2, String aphysical_address) {
			// TODO Auto-generated constructor stub
		}
		//Methods
		public String getName() {
			return name;
		}
		public int getTelephone() {
			return telephone;
		}
		public String getEmailAddress() {
			return email_address;
		}
		public String getPhysicalAddress() {
			return physical_address;
		}
		public String toString() {
			String info =  "Name = " + name;
			info +=  "\nTelephone = " + telephone;
			info += "\nEmail address = " + email_address;
			info += "\nPyhsical address = " + physical_address;
			return info;
		}
}
