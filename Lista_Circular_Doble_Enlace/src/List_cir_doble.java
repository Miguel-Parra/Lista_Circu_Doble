
public class List_cir_doble {
		
	protected Nodo cabeza;
	protected Nodo cola;
	protected int tama�o;
	
	
	public List_cir_doble(){
		cabeza=cola=null;
		tama�o=0;}
	
public boolean estaVacia(){
		if (cabeza==null){
			return true;
		}else{
			return false;
		}}

public void insertarAlPrincipio(String name){
	if (estaVacia()){
		cabeza= new Nodo(name);
		cola=cabeza;
		tama�o+=1;
	}else{
		Nodo p=new Nodo(name,cabeza,cola);
		cabeza.setAnte(p);
		cola.setSig(p);
		cabeza=p;
		tama�o+=1;
}}

public void InsertarAlFinal(String dato){
	if(estaVacia()==true){
		cola=new Nodo(dato);
		cabeza=cola;
		tama�o=+1;
	}else{
		Nodo q= new Nodo(dato,cabeza,cola);
		cabeza.setAnte(q);
		cola.setSig(q);
		cola=q;
		tama�o+=1;
	}
}

public Nodo buscarNodo(String dato){
Nodo aux=cabeza;
for(int i=0;i!=tama�o;i++){
	if(aux.getDato().compareToIgnoreCase(dato)==0){
	return aux;
	
}else{
	aux=aux.getSig();
}}
return null;
}


 public Nodo buscarNodo(int indice){
	 if(indice<0||indice>tama�o){
		 return null;
	 }else{
	Nodo aux1=cabeza;
	 for(int i=1;i<=tama�o;i++){
		if(i==indice){
			return aux1;
			}else{
			aux1=aux1.getSig();
			}
	 }}
	 return null;
 }
 
 
 public void eliminarNodo(String elim){
		
		
		Nodo aux=buscarNodo(elim);
		if(aux!=null){
		Nodo au1=aux.getAnte();
		Nodo au2=aux.getSig();
		
		if (au1==cola){
			cabeza=cabeza.getSig();
			cabeza.setAnte(cola);
			cola.setSig(cabeza);
			tama�o-=1;
			
			
		}else{ 
			if(au2==cabeza){
		
			cola=cola.getAnte();
			cola.setSig(cabeza);
			cabeza.setAnte(cola);
			tama�o-=1;
		}
		else{
		au1.setSig(au2);
		au2.setAnte(au1);
		tama�o-=1;
		}}}
		
	}


		
		
public  String comprobar(){
	String sal="Anterior a "+cabeza.getDato()+": "+cabeza.getAnte().getDato();
	sal+="\nSiguiente a "+cola.getDato()+": "+cola.getSig().getDato();
	return sal;
}

public String toString() {
	String salida="";
	if(estaVacia()){
		salida="La lista esta vacia\n";
	}else{
	salida= "LISTA ORDENADA:\n*********************\n";
	Nodo n= cabeza;
	for(int i=0;i!=tama�o;i++){
	//while(n.getSig()!=cabeza){
		salida+=n.getDato()+"\n";
		n=n.getSig();
	}}
	return salida+"tama�o= "+tama�o+"\n***********************";
}	

public String toStringRev() {
	String salida="";
	if(estaVacia()){
		salida="La lista esta vacia";
	}else{
		salida= "LISTA REV:\n*********************\n";
		Nodo n= cola;
		for(int i=0;i!=tama�o;i++){
			//while(n.getSig()!=cabeza){
			salida+=n.getDato()+"\n";
			n=n.getAnte();
		}}
	return salida+"tama�o= "+tama�o+"\n***********************";
}}

		



