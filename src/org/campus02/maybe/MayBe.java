package org.campus02.maybe;

public class MayBe<T> {

	private T data;
	private int status;
	
	public MayBe(T data, int status) {
		super();
		this.data = data;
		this.status = status;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public static final int ZugriffErlaubt = 1;
	public static final int ZugriffVerboten = 2;
	public static final int NichtVorhanden = 3;
	
	public void printData() {
		switch (status) {
		case 1:
			System.out.println("Zugriff erlaubt: " + data);
			break;
		case 2:
			System.out.println("Zugriff nicht erlaubt!");
			break;
		case 3:
			System.out.println("Daten nicht vorhanden!");
			break;	
		default:
			System.out.println("Ungültiger Status");
			break;
		}
	}
}
