package org.formacion.decorator;

public abstract class Decorador implements BaseDatos {
	
protected BaseDatos dbDecorad;
	
	public Decorador(BaseDatos dbDecorad) {
		this.dbDecorad = dbDecorad;
	}

}
