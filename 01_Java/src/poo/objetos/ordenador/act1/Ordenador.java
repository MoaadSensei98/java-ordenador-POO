package poo.objetos.ordenador.act1;

import java.util.List;

public class Ordenador {
	private double precio;
	private String marca;
	private Procesador procesador;
	private List<Ram> listaRam; 
	private List<TarjetaGrafica> listatarjetaGrafica;
	private List<Perifericos> listaPerifericos;
	private PlacaBase placaBase;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	
	public List<Ram> getListaRam() {
		return listaRam;
	}
	public void setListaRam(List<Ram> listaRam) {
		this.listaRam = listaRam;
	}
	
	public List<TarjetaGrafica> getListatarjetaGrafica() {
		return listatarjetaGrafica;
	}
	public void setListatarjetaGrafica(List<TarjetaGrafica> listatarjetaGrafica) {
		this.listatarjetaGrafica = listatarjetaGrafica;
	}
	
	public List<Perifericos> getListaPerifericos() {
		return listaPerifericos;
	}
	public void setListaPerifericos(List<Perifericos> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}
	
	public PlacaBase getPlacaBase() {
		return placaBase;
	}
	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}
	public double calcularPrecioComponentes() {
		 double total;
		 double totalRam=0;
		 double totalTarj=0;
		 double totalPeri=0;
		 
		 for(Ram ram : listaRam) {
			 totalRam += ram.getPrecio();
		 }
		 for (TarjetaGrafica tarj : listatarjetaGrafica) {
			 totalTarj += tarj.getPrecio();
		 }
		 for (Perifericos peri : listaPerifericos) {
			 totalPeri += peri.getPrecio();
		 }
		 total = totalRam+ procesador.getPrecio() + placaBase.getPrecio() + totalPeri + totalTarj;
		return total;
		 
	 } 
	@Override 
	public String toString() {
		return "\nOrdenador precio=" + precio + ", marca=" + marca + ",procesador=" + procesador + "\nlistaRam="
				+ listaRam + ", \nlistatarjetaGrafica=\n" + listatarjetaGrafica + ", listaPerifericos=" + listaPerifericos
				+ ", placaBase=" + placaBase ;
	} 
	 
	
	
}
