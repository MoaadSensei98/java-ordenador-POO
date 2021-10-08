package poo.objetos.ordenador.act1;
 
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		 Ordenador ord1 = new Ordenador();
		 Perifericos peri1 = new Perifericos();
		 Perifericos peri2 = new Perifericos();
		 Perifericos peri3 = new Perifericos();
		 PlacaBase placa1 = new PlacaBase();
		 Procesador proc1 = new Procesador();
		 Ram ram1 = new Ram();
		 Ram ram2 = new Ram(); 
		 TarjetaGrafica tarj1 = new TarjetaGrafica();
		 TarjetaGrafica tarj2 = new TarjetaGrafica();
		 TarjetaGrafica tarjInt = new TarjetaGrafica();
		 
		 ord1.setPrecio(1050);
		 
		 ord1.setMarca("Asus");
		 
		 placa1.setMarca("MSI");
		 placa1.setModelo("GODLIKE");
		 placa1.setPrecio(299);
		 ord1.setPlacaBase(placa1);
		 
		 proc1.setGHz(4.4);
		 proc1.setMarca("Ryzen");
		 proc1.setPrecio(150);
		 proc1.setTarjetaIntegrada(tarj1);
 		 ord1.setProcesador(proc1);
		 
		 List <Perifericos> perifericos  = new LinkedList<Perifericos> ();
		 
		 peri2.setNombre("Teclado");
		 peri2.setMarca("Corsair");
		 peri2.setPrecio(75);
 		 peri3.setNombre("Cascos");
		 peri3.setMarca("HyperX");
		 peri3.setPrecio(99); 
		 perifericos.add(peri1);
		 perifericos.add(peri2);
		 perifericos.add(peri3);
		 ord1.setListaPerifericos(perifericos);
		 
		 List<Ram> ram  = new LinkedList<Ram> ();
		 ram1.setGeneracion("DDR4");
		 ram1.setHz(3200);
		 ram1.setPrecio(50); 
		 ram2.setGeneracion("DDR4");
		 ram2.setHz(3200);
		 ram2.setPrecio(50); 
		 ram.add(ram1);
		 ram.add(ram2);
		 ord1.setListaRam(ram);

		 
		 List<TarjetaGrafica> tarj  = new LinkedList<TarjetaGrafica> ();
		 tarj1.setMarca("Nvidia");
		 tarj1.setModelo("RTX 3090");
		 tarj1.setRam(ram2); 
		 tarj2.setMarca("Nvidia");
		 tarj2.setModelo("RTX 3080");
		 tarj2.setRam(ram2);
		 tarjInt.setMarca("");
		 tarj.add(tarj1);
		 tarj.add(tarj1);
		 ord1.setListatarjetaGrafica(tarj);
		 
		 
		 System.out.println(ord1);
		 System.out.print(ord1.calcularPrecioComponentes());
		 
	}

  
	 
}
