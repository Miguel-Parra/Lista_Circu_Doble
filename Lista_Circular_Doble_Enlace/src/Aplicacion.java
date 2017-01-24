
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List_cir_doble a= new List_cir_doble();
		System.out.println(a.toString());
		
		
		a.insertarAlPrincipio("Pamela");
		a.insertarAlPrincipio("Miguel");
		
		System.out.println("\n"+a.toString());
		System.out.println("\n"+a.toStringRev());
		System.out.println("\n"+a.comprobar());
		
		a.InsertarAlFinal("Gissel");
		a.InsertarAlFinal("Angel");
		
		String bus="mIGUEL";
		int busq=4;
        if(a.buscarNodo(bus)==null){
			System.out.println("\nNo existe el elemento "+bus+" en la lista");
			}else{
			System.out.println("\nSe encontro el elemeto "+bus+" en la lista: \n"+a.buscarNodo(bus).getDato());		
		}

		if(a.buscarNodo(busq)==null){
			System.out.println("\nNo existe la posicion "+busq+" en la lista");
			}else{
			System.out.println("\nSe encontro la posicion "+busq+" en la lista:\n"+a.buscarNodo(busq).getDato());
		}
		System.out.println("\n"+a);
		
		String eliminar="angel";
		a.eliminarNodo(eliminar);

		//System.out.println("\nSe elimino el elemento "+eliminar+" de la lista\n"+"la nueva lista es\n"+a);
		System.out.println("\n"+a);
		System.out.println("\n"+a.comprobar());
		}

}
