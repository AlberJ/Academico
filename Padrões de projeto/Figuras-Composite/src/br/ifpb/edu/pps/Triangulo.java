package br.ifpb.edu.pps;

public class Triangulo extends FiguraComposta {

	@Override
	public void areaFigura() {
		// TODO Auto-generated method stub
		System.out.println("�rea Tri�ngulo");
	}

	@Override
	public void perimetroFigura() {
		// TODO Auto-generated method stub
		System.out.println("Per�metro Tri�ngulo");
	}

	@Override
	public void desenharFigura() {
		// TODO Auto-generated method stub
		System.out.println("Desenhando Tri�ngulo");
	}

	@Override
	public String toString() {
		String texto = "[ Tri�ngulo ]";
		if (!this.getFiguras().isEmpty()) {
			for(Figura f : this.getFiguras()) {
				texto += " + "+f.toString();
			}
		}
		return texto;
	}
	
}
