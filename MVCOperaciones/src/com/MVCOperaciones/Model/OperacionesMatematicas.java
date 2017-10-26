package com.MVCOperaciones.Model;

public class OperacionesMatematicas 
{
	private float numero1;
	private float numero2;
	
	public float getNumero1()
	{
		return numero1;
	}
	public void setNumero1(float _numero1)
	{
		this.numero1 = _numero1;
	}
	
	public float getNumero2()
	{
		return numero2;
	}
	public void setNumero2(float _numero2)
	{
		this.numero2 = _numero2;
	}
	
	public float sumar()
	{
		return numero1 + numero2;
	}
	public float restar()
	{
		return numero1 - numero2;
	}
	public float multiplicar()
	{
		return numero1*numero2;
	}
	public float dividir()
	{
		return numero1/numero2;
	}
}