package ar.edu.unq.poo.tp6_PalabrasOrdenadas;

public class AdapterPalabrasOrdenadas implements DefaultListModel {

		private ListaDePalabrasOrdenadas lista;
		
		public AdapterPalabrasOrdenadas(ListaDePalabrasOrdenadas lista) {
			this.lista = lista;
		}
		
		public void addElement(String elem) {
			lista.agregarPalabra(elem);
		}
}

