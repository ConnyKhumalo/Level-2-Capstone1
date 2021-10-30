public class Contractor {
	//Attributes
		String cname;
		long ctelephone;
		String cemail_address;
		String cphysical_address;
		//Constructors
		public Contractor(String cname,long ctelephone,String cemail_address,String cphysical_address)  {
			
			this.cname = cname;
			this.ctelephone = ctelephone;
			this.cemail_address = cemail_address;
			this.cphysical_address = cphysical_address;
		}
		//Methods
		public String getName() {
			return cname;
		}
		public long getTelephone() {
			return ctelephone;
		}
		public String getEmailAddress() {
			return cemail_address;
		}
		public String getPhysicalAddress() {
			return cphysical_address;
		}
		public String toString() {
			String info =  "Name = " + cname;
			info +=  "\nTelephone = " + ctelephone;
			info += "\nEmail address = " + cemail_address;
			info += "\nPyhsical address = " + cphysical_address;
			return info;
		}
	}
