
public class Main {

	public static void main(String[] args) {
		
		Motorcycle x = new Motorcycle();
		Kawasaki y = new Kawasaki();
		Suzuki z = new Suzuki();
		
		System.out.println(x.Class);
		System.out.println(x.Attribute);
		x.behavior();
		
		System.out.println("");
		System.out.println(x.brand + y.brand);
		System.out.println(x.colour + y.colour); 
		System.out.println(x.type + y.type);
		
		System.out.println("");
		System.out.println(x.brand + z.brand);
		System.out.println(x.colour + z.colour);
		System.out.println(x.type + z.type);
		
	

	}

}