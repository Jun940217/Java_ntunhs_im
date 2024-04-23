package hw8;

public class warrior extends Character{
        private int Defense;
    public warrior(String name,int health,int attackPower,int Defense) {
		super(name,health,attackPower);
		this.Defense=Defense;
	}
    @Override
    public void takeDamage(int damage) {
    	int reduceDamage=Math.max(damage-Defense, 0);
    	super.takeDamage(reduceDamage);
    	}
    public void useShield() {
		Defense+=10;
		System.out.println(name+"使用盾牌，防禦力增加至"+Defense);	
}
@Override
public void display() {
	System.out.println("戰士名稱："+name+", 生命值："+health+",攻擊力:"+attackPower+",防禦力:"+Defense);

}
}
