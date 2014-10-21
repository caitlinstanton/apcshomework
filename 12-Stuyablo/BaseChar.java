import java.util.Random;
public class BaseChar{

    private int hp,mp,atk,def,spd,acc,lck;
    private boolean poisonState=false;
    private String name, weapon;
    Random r = new Random();

    public BaseChar(int h, int m, int a, int d, int s, int ac, int c, String n, String w){
	hp=h;
	mp=m;
	atk=r.nextInt(3)+a-1;
	def=r.nextInt(4)+d-2;
	spd=r.nextInt(2)+s-1;
	acc=r.nextInt(10)+ac-5;
	lck=r.nextInt(3)+c-1;
	name=n;
	weapon=w;
    }
    public String toString(){
	return name;
    }
    
    public int getHP(){
	return hp;
    }
    public int getMP(){
	return mp;
    }   
    public void setMP(int m){
	mp=m;
    }
    public void setHP(int h){
        hp = h;
    }
    public int getAtk(){
	return atk;
    }
    public int getDef(){
	return def;
    }
    public int getSpd(){
	return spd;
    }
    public int getLck(){
	return lck;
    }
    public int getACC(){
	return acc;
    }
    public String getWeapon(){
	return weapon;
    }
    public boolean isPoisoned(){
	return poisonState;
    }
    public String poison(){
	if (!poisonState){
	    poisonState = true;
	    return "" + this + "was poisoned.";
	}
	return "" + this + "was already poisoned.";
    }
    public String attack(BaseChar other){
	if (r.nextInt(100)+1<acc){
	    if (other.getDef()>this.getAtk()){
		return "" + this + " could deal no damage to " + other;
	    }
	    if (r.nextInt(100)+1<lck){
		other.setHP(other.getHP()+2*(other.getDef()-this.getAtk()));
		return "" + this + " attacked " + other + " with " + weapon + " and injured " + other;
	    }
	    other.setHP(other.getHP()+other.getDef()-this.getAtk());
	    return "" + this + " attacked " + other + " with " + weapon + " and injured " + other;
	}
	return "" + this + " missed " + other;
    }

}
