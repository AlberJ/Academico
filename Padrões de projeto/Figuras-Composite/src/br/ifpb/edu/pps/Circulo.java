package br.ifpb.edu.pps;

public class Circulo extends FiguraComposta {

	@Override
	public void areaFigura() {
		// TODO Auto-generated method stub
		System.out.println("�rea C�rculo");
	}

	@Override
	public void perimetroFigura() {
		// TODO Auto-generated method stub
		System.out.println("Per�metro C�rculo");
	}

	@Override
	public void desenharFigura() {
		// TODO Auto-generated method stub
		System.out.println("Desenhando C�rculo");
	}

	@Override
	public String toString() {
		String texto = "[ C�rculo ]";
		if (!this.getFiguras().isEmpty()) {
			for(Figura f : this.getFiguras()) {
				texto += " + "+f.toString();
			}
		}
		return texto;
	}

	
}
