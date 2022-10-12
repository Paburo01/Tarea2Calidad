
public class Empleado {

	enum TipoEmpleado{Vendedor, Encargado};
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		float salarioB=0;
		
		if(tipo.equals(TipoEmpleado.Vendedor)) 
			salarioB=2000;
		else salarioB=2500;
		
		if (ventasMes>=1500) salarioB+=200;
		else if(ventasMes>=1000) salarioB+=100;
		
		salarioB+=horasExtra*30;
		
		return salarioB;
}
	
	 public float calculoNominaNeta(float nominaBruta) {
		 int NominaR=0;
		 
		 if(nominaBruta>2100 && nominaBruta<2500) NominaR*=(1-15);
		 else if(nominaBruta>2500)  NominaR*=(1-18);
		 
		 return NominaR;
	 }
}
