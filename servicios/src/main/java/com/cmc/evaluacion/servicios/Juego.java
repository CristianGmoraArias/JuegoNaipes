package com.cmc.evaluacion.servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.cmc.evaluacion.entidades.Carta;
import com.cmc.evaluacion.entidades.Naipe;

public class Juego {

	private Naipe naipe;
	private HashMap<String, ArrayList<Carta>> cartasJugador;
	private Naipe naipeBarajado;

	public Juego(String[] string) {
		cartasJugador = new HashMap<String, ArrayList<Carta>>();
		for (String string2 : string) {
			ArrayList<Carta> cartasEntregadas = new ArrayList<Carta>();
			cartasJugador.put(string2, cartasEntregadas);
		}

	}

	public void juego() {
		naipe = new Naipe();
		naipe.barajar();
		naipeBarajado = naipe;
	}

	public void entregarCartas(int cartasPorJugador){
		naipeBarajado = new Naipe();
		ArrayList<Carta>cartasParaEntregar=naipeBarajado.barajar();

		int y=0;
		for (int i=0;i<cartasPorJugador;i++ ){
			Set<String> keys=cartasJugador.keySet();
			 for ( String key : keys) {
				 Carta carta= cartasParaEntregar.get(y);
				ArrayList<Carta>carta1= cartasJugador.get(key);
				carta1.add(carta);
				cartasJugador.put(key, carta1); 
				y++;
			}
			
		}
		
		
	}
	
	
	public int devolverTotal(String id){
		int valorCartas=0;
		for(int i = 0;i<cartasJugador.get(id).size();i++){
			valorCartas+=cartasJugador.get(id).get(i).getNumero().getValor();
		}
		return valorCartas;
	}
	
	
	public String determinarGanador(){
		String idGanador=new String();
		int sumaGanador=0;
		Set<String> keys=cartasJugador.keySet();
		 for ( String key : keys) {
			 if(devolverTotal(key)>sumaGanador){
				 idGanador=key;
				 sumaGanador=devolverTotal(key);
			 }
		}
		
		
		return idGanador;
	}

	@Override
	public String toString() {
		return "Juego [naipeBarajado=" + naipeBarajado + "]";
	}

	public Naipe getNaipeBarajado() {
		return naipeBarajado;
	}

	public void setNaipeBarajado(Naipe naipeBarajado) {
		this.naipeBarajado = naipeBarajado;
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

	public HashMap<String, ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}

	public void setCartasJugador(HashMap<String, ArrayList<Carta>> cartasJugador) {
		this.cartasJugador = cartasJugador;
	}

}
