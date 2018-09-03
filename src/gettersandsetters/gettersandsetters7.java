//https://alt.stepik.org/topics/lesson/64058
//Write getters and setters for all fields.
class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;   

	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String[] getAuthors(){
		return this.authors;
	}
	public void setAuthors(String[] authors){
		this.authors=authors;
	}
	public int getYearOfPublishing(){
		return this.yearOfPublishing;
	}
	public void setYearOfPublishing(int yearOfPublishing){
		this.yearOfPublishing=yearOfPublishing;
	}

}
