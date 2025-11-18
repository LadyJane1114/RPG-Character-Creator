package Classes;

public class Monster {
    private String monName;
    private int monHP;
    private int monAC;
    private int monAtt;

    public Monster(String monName, int monHP, int monAC, int monAtt) {
        this.monName = monName;
        this.monHP = monHP;
        this.monAC = monAC;
        this.monAtt = monAtt;
    }

    public String getMonName() {return monName;}
    public void setMonName(String monName) {this.monName = monName;}
    public int getMonHP() {return monHP;}
    public void setMonHP(int monHP) {this.monHP = monHP;}
    public int getMonAC() {return monAC;}
    public void setMonAC(int monAC) {this.monAC = monAC;}
    public int getMonAtt() {return monAtt;}
    public void setMonAtt(int monDMG) {this.monAtt = monAtt;}


}
