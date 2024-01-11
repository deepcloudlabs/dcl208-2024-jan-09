package com.example;

public class Exercise03 {

	public static void main(String[] args) {
		fun(1,2,3);	
		fun(new FunParam.Builder(1).t(10).y(2).z(4).build());
	}

	public static void fun(int x, int y, int z) {
		
	}
	public static void fun(int... values) {
		
	}
	public static void fun(FunParam param) {
		System.out.println(param);
	}
}
record FunParam(int x, int y, int z,int t) {
	
	public static class Builder{
		private int x;
		private int y=1;
		private int z=1;
		private int t=1;
		public Builder(int x) {
			this.x = x;
		}
		public Builder y(int value) {
			this.y = value;
			return this;
		}
		public Builder z(int value) {
			this.z = value;
			return this;
		}
		public Builder t(int value) {
			this.t = value;
			return this;
		}
		public FunParam build() {
			return new FunParam(x,y,z,t);
		}
	}
}