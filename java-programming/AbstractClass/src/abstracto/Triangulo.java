package abstracto;

public class Triangulo extends FiguraGeometrica {

	public Triangulo(String tipoFigura) {
		super(tipoFigura);
	}
	
	public void dibujar() {
		System.out.println("Aquí debería dibujar un: " + this.getClass().getSimpleName());
	}
		
}
