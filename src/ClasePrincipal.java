
public class ClasePrincipal {

	public static void main(String[] args) {
		
		System.out.println("PADRE");
		ClasePadre clase_padre = new ClasePadre();
		clase_padre.atributo_padre = 10;
		System.out.println(clase_padre.atributo_padre);
		clase_padre.funcionPadre();
		
		System.out.println("HIJO");
		ClaseHijo clase_hijo = new ClaseHijo();
		clase_hijo.atributo_hijo = 20;
		System.out.println(clase_hijo.atributo_hijo);
		clase_hijo.funcionHijo();
		clase_hijo.atributo_padre = 30;
		System.out.println(clase_hijo.atributo_padre);
		clase_hijo.funcionPadre();
	}

}
