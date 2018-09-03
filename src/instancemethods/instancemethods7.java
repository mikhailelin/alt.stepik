//https://alt.stepik.org/topics/lesson/63646
class Car {

    int yearModel;
    String make;
    int speed;
	public void accelerate(){
		speed=speed+5;
	}
	public void brake(){
		speed=(speed-5<0)?0:(speed-5);
	}
}


