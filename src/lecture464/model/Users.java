package lecture464.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



public class Users {
	/*From Assignment 1*/
	private String userName;
	private String password;
	
	/*From Assignment 2 */
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	
	public Users() {
		super();
	}
	
	public Users(String userName, String password, String firstName, String lastName, String address, String phone) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Users(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public void registerUser(Users aUser, String propFilePath) {
		
		Properties p = new Properties();
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(propFilePath);
			p.load(fis);
			p.setProperty(aUser.getUserName(), aUser.getPassword());
			p.store(new FileOutputStream(propFilePath), null);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	// validateUser
	public boolean validateUser(String propFilePath) throws IOException{
		Properties p = new Properties();
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(propFilePath);
			p.load(fis);
			//String pword = p.getProperty(userName);
			if(!p.containsKey(this.userName)) {
			// Check whether userName exists. 1 => doesn't exist
				return false; 
			} else return true;
			
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} finally {
			if (fis!=null){
				try {
					fis.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	// removeUser
	public void removeUser(){
		this.userName = null;
		this.password =null;
		System.gc();
	}
	
}
