
//test
public class Camcorder extends Item{
private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		// Write your codes here
		String output = super.toString();
		output+= ("Optical Zoom: "+ opticalZoom + "\n");
	
		return output;
	}
}




//
//qn1: (1) Written before.. to help developers
//qn2 : (2) assertequals
//qn3: (2) .java
//qn4: (3) @After
//qn5 : (3) developers


//qn7: (4) estimate each task in the terms of estimated hours 
//qn8: (1) maintaining product backlog with current information 
//qn9: (1) As ... I want .... so that
//qn10: (2) business priority
//qn11: (3) until sufficient detail is known
//


//6. a) Which one of the two JUnit test cases, testFindMax1() or testFindMax2(), will fail? 
//[testFindMax2()]
//b) Why it fails? 
//[Because the max will be 0 so anything lower than 0 will not be the max value, it will result in an error since testFindMax2() contains only negative value]
//c) How to fix the source code to make that JUnit test case pass? 
//[If possible use positive numbers]

