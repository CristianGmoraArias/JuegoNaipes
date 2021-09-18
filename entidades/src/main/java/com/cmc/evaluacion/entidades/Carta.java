package com.cmc.evaluacion.entidades;

public class Carta {
private Numero numero;
private String palo;
private String estado="N";

public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public Numero getNumero() {
	return numero;
}
public void setNumero(Numero numero) {
	this.numero = numero;
}
public String getPalo() {
	return palo;
}
public void setPalo(String palo) {
	this.palo = palo;
}
public Carta(Numero numero, String palo) {
	super();
	this.numero = numero;
	this.palo = palo;
}
@Override
public String toString() {
	return  numero.getNumeroCarta()+ "-"+palo ;
}





}
