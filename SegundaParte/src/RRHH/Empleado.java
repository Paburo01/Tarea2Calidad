package RRHH;

public class Empleado {

	public enum TipoEmpleado{Vendedor, Encargado};
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		float salarioB=0;
		
		if(tipo.equals(TipoEmpleado.Vendedor)) 
			salarioB=2000;
		else salarioB=2500;
		
		if (ventasMes>=1500) salarioB+=200;
		else if(ventasMes>=1000) salarioB+=100;
		
		salarioB+=horasExtra*30;
		
		return salarioB;
}
	
	 public static float calculoNominaNeta(float nominaBruta) {
		 float retencion = 0;
			if (nominaBruta >= 2500)
				retencion = (float)0.18;
			else if (nominaBruta >= 2100)
				retencion = (float)0.15;
			return nominaBruta*(1-retencion);
	 }
}
