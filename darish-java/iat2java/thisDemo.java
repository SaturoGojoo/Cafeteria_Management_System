class thisDemo {
	int a=10;
	static int b=20;
	void display(){
		this.a=100;
		System.out.println(a);
		this.b=600;
		System.out.println(b);
	}
	public static void main(String args[]){
		thisDemo t=new thisDemo();
        t.display();
	}
}