//https://alt.stepik.org/topics/lesson/63317


enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    private int level;
    DangerLevel(int level){
        this.level=level;
    }
    public int getLevel(){
        return this.level;
    }
}