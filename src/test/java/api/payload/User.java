package api.payload;

public class User {
	//POJO - Plain old Java Object
	int id0;
	 // String id;
	  String username;
	  String firstName;
	  String lastName;
	  String email;
	 String password;
	 String phone;
	  int userStatus=0;
	  public int getid()
		{
			return id0;
		}
		public void setID(int id) {
			
			this.id0=id;
		}
	  
	  
//	  public String getId() {
//			return id;
//		}
//		public void setId(String id) {
//			this.id = id;
//		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public int getUserStatus() {
			return userStatus;
		}
		public void setUserStatus(int userStatus) {
			this.userStatus = userStatus;
		}
		
		
		  
}
