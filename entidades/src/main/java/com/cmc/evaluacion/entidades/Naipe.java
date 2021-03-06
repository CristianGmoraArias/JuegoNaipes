package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Naipe {
private ArrayList<Numero> numerosPosibles;
private ArrayList<Carta> cartas;
private ArrayList<Carta> auxiliar;


@Override
public String toString() {
	return "Naipe [numerosPosibles=" + numerosPosibles + ", cartas=" + cartas + ", auxiliar=" + auxiliar + "]";
}

public ArrayList<Carta> getCartas() {
	return cartas;
}

	public Naipe(){
		numerosPosibles=new ArrayList<Numero>();
		cartas=new ArrayList<Carta>();
		Numero agregar= new Numero("A",11);
		numerosPosibles.add(agregar);
		Numero agregar1= new Numero("2",2);
		numerosPosibles.add(agregar1);
		Numero agregar2= new Numero("3",3);
		numerosPosibles.add(agregar2);
		Numero agregar3= new Numero("4",4);
		numerosPosibles.add(agregar3);
		Numero agregar4= new Numero("5",5);
		numerosPosibles.add(agregar4);
		Numero agregar5= new Numero("6",6);
		numerosPosibles.add(agregar5);
		Numero agregar6= new Numero("7",7);
		numerosPosibles.add(agregar6);
		Numero agregar7= new Numero("8",8);
		numerosPosibles.add(agregar7);
		Numero agregar8= new Numero("9",9);
		numerosPosibles.add(agregar8);
		Numero agregar9= new Numero("10",10);
		numerosPosibles.add(agregar9);
		Numero agregar10= new Numero("J",10);
		numerosPosibles.add(agregar10);
		Numero agregar11= new Numero("Q",10);
		numerosPosibles.add(agregar11);
		Numero agregar12= new Numero("K",10);
		numerosPosibles.add(agregar12);
		
		for (Numero carta : numerosPosibles) {
			Carta cartaA=new Carta(carta, Palos.CORAZON_NEGRO);
			cartas.add(cartaA);
			Carta cartaB=new Carta(carta, Palos.CORAZON_ROJO);
			cartas.add(cartaB);
			Carta cartaC=new Carta(carta, Palos.DIAMANTE);
			cartas.add(cartaC);
			Carta cartaD=new Carta(carta, Palos.TREBOL);
			cartas.add(cartaD);
		}
		
	}
	
	
	
	public ArrayList<Carta> barajar(){
		auxiliar=new ArrayList<Carta>();
		for(int i=0;i<100;i++){
			int random= Random.obtenerPosicion();
			if(cartas.get(random).getEstado().equals("N")){
				cartas.get(random).setEstado("C");
				auxiliar.add(cartas.get(random));
				
			}
		}
		for (int i=0;i<cartas.size();i++){
			if(cartas.get(i).getEstado().equals("N")){
				auxiliar.add(cartas.get(i));
			}
		}
		
		
		return auxiliar;
	}
	
	
	
}
