package br.ifpb.edu.pps;

public class Quadrilatero extends FiguraComposta {

	
	@Override
	public void areaFigura() {
		// TODO Auto-generated method stub
		System.out.println("�rea Quadril�tero");
	}

	@Override
	public void perimetroFigura() {
		// TODO Auto-generated method stub
		System.out.println("Per�metro Quadril�tero");
	}

	@Override
	public void desenharFigura() {
		// TODO Auto-generated method stub
		System.out.println("Desenhando Quadril�tero");
	}

	@Override
	public String toString() {
		String texto = "[ Quadril�tero ]";
		if (!this.getFiguras().isEmpty()) {
			for(Figura f : this.getFiguras()) {
				texto += " + "+f.toString();
			}
		}
		return texto;
	}

}
