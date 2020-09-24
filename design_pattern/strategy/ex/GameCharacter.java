package ex;

public class GameCharacter {
    private Weapon weapon;
    
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if(this.weapon == null)
            System.out.println("no weapon");
        else 
            weapon.attakc();
    }
}
