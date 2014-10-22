import java.util.Random;
public class BaseChar{

    private int hp,mp,atk,def,spd,acc,lck;
    private boolean poisonState=false;
    private String name, weapon;
    Random r = new Random();

    public BaseChar(int h, int m, int a, int d, int s, int ac, int c, String n, String w){
	hp=h;
	mp=m;
	atk=a;
	def=d;
	spd=s;
	acc=ac;
	lck=c;
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
    public void increaseMP(int m){
	mp=mp+m;
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
    public void makePoisoned() {
	poisonState=true;
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
