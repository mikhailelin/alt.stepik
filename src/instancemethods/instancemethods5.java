//https://alt.stepik.org/topics/lesson/63250
class Application {

    String name;

    // write a method here
	public void run(String[] args){
		System.out.println(this.name);
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
}