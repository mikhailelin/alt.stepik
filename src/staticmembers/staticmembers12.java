//https://alt.stepik.org/topics/lesson/56061
class Cat {

    // write static and instance variables
	String name;
	int age;
	public static int counter=0;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forgot to check the number of cats
	if(counter+1>5){
		System.out.println("You have too many cats");
	}
	this.name=name;
	this.age=age;
	counter++;

    }

    public static int getNumberOfCats() {
        // implement the static method
	return counter;
    }
}