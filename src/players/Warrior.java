package players;

import boss.Boss;
import game.Ability;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERB);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        if (getHealth() > 0) {
            setDamage(getDamage() + boss.getDamage());
        }

    }
}

