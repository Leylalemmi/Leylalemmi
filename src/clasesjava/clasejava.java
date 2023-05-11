package clasesjava;

public class clasejava {

	public static void main(String[] args) {
      
		humanojava obj_h = new humanojava(17,50,2,"lisa");
		
		System.out.println("Mi nombre es: "+obj_h.getNombre());
		System.out.println("Mi edad es: "+obj_h.getEdad());
		System.out.println("Mi peso es: "+obj_h.getPeso());
		System.out.println("Mi altura es: "+obj_h.getAltura());
        obj_h.setEdad(20);
        System.out.println("Mi edad es: "+obj_h.getEdad());
       
	
	
	
	}

}
