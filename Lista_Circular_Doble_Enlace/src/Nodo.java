

public class Nodo {
private String dato;
private Nodo sig;
private Nodo ante;


public Nodo (String dat){
	
	this.dato=dat;
	sig= null;
	ante= null;
}


public Nodo(String dat, Nodo s, Nodo a)
{   dato= dat;
	sig=s;
	ante=a;	
}

public String getDato() {
	return dato;
}

public void setDato(String dato) {
	this.dato = dato;
}

public Nodo getSig() {
	return sig;
}

public void setSig(Nodo sig) {
	this.sig = sig;
}

public Nodo getAnte() {
	return ante;
}

public void setAnte(Nodo ante) {
	this.ante = ante;
}

/*@Override
public String toString() {
	return "Nodo [dato=" + dato + ", sig=" + sig + ", ante=" + ante + "]";
}*/






}
