import java.io.*;

public class SerializationDemo {
		public static void main(String[] args) {
			Employee e = new Employee();
			e.name = "Reyan Ali";
			e.address = "Phokka Kuan, Ambehta Peer";
			e.SSN = 11122333;
			e.number = 101;

			try {
				FileOutputStream fileOut = new FileOutputStream("D://Mac Book/mahi.txt");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(e);
				out.close();
				fileOut.close();
				System.out.printf("Serialized data is saved in /tmp/employee.ser");
			} catch (IOException i) {
				i.printStackTrace();
			}
		}
	}

class Employee implements java.io.Serializable {
	   /**
	 * 
	 */
	private static final long serialVersionUID = -5925203153190141986L;
	public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	}