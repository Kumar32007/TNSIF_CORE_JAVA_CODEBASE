package com.day7;
//Covarient Return type
public class colors {
	protected colors getcolor() {
		colors c = new colors();
		return c;
	}
	
	
}
class Red extends colors{
	@Override
	protected  Red getcolor() {
		Red c = new Red();
		return c;
	}
}

class Blue extends colors{
	@Override
	protected  Blue getcolor() {
		Blue c = new Blue();
		return c;
	}
}