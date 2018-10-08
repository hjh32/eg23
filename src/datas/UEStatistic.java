package datas;

import java.text.DecimalFormat;

public class UEStatistic {

	private String year;
	private int effectif;
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int fx;
	private int abs;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getEffectif() {
		return effectif;
	}

	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public int getFx() {
		return fx;
	}

	public void setFx(int fx) {
		this.fx = fx;
	}

	public int getAbs() {
		return abs;
	}

	public void setAbs(int abs) {
		this.abs = abs;
	}
	
	public void setUp(String year, int a, int b, int c, int d, int e, int f, int fx, int abs) {
		this.year = year;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.fx = fx;
		this.abs = abs;
		this.effectif = a + b + c + d + e + f + fx + abs;
	}
	
	public String getSuccess() {
		DecimalFormat df = new DecimalFormat("#.00");
		double success = (a + b + c + d + e)*100.0/effectif;
		return df.format(success) + "%";
	}
	
	public String getFailure() {
		DecimalFormat df = new DecimalFormat("#.00");
		double failure = (f + fx + abs)*100.0/effectif;
		return df.format(failure) + "%";
	}

}
