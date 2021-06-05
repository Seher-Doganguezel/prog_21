package aufgabe7;


public class Student implements Listener
{

	private String name;
	private Publisher publisher;
	
	
	public Student(String name){
		this.name= name;
	}

	
	@Override
	public void setPublisher(Publisher publisher) {
		if(publisher.register(this)){
			
			this.publisher = publisher;	
			System.out.println(this.name + " registered! ");
		}	
	}

	@Override
	public void removePublisher(Publisher publisher) {
		
		if(publisher.unregister(this)) {
			this.publisher = null;
			System.out.println(this.name + " unregistered! ");
		}
		
	}
	


	public boolean equals(Publisher publisher)
	{
		 if (publisher == null) return false;   
	     if (publisher == this) return true;
	     if (publisher.getClass() != this.getClass()) return false;
	     Student st = (Student)publisher;
	     return (this.name.equals(st.name));
		
	}
	public int hashCode() {
	return this.name.hashCode();
	}


	@Override
	public void update() {
	String msg =this.publisher.getUpdate(this);
	System.out.println(this.name + " received " + msg);
		
	}

}