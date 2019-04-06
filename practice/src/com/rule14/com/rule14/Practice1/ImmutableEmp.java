package com.rule14.com.rule14.Practice1;

public final class ImmutableEmp {
	
	private final int i;
	private final int j;
	
	public ImmutableEmp(int k, int l) {
		
		i=k;
		j=l;
		
	}
	
	public int getI() {
		
		return i;
	}
	
	public int getJ() {
		
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImmutableEmp i2 = new ImmutableEmp(50, 70);
		ImmutableEmp i1 = new ImmutableEmp(10, 20);
		System.out.println(i2.i);
		System.out.println(i1.i);
		System.out.println(i1);
		
	}

}
