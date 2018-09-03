//https://alt.stepik.org/topics/lesson/63647

class Clock {

    int hours = 12;
    int minutes = 0;

    // write a method here
	public void next(){
		if(minutes+1>59){
			minutes=0;
			hours=(hours+1>12)?0:(hours+1);
		}else{
			minutes++;
		}
	}
}
