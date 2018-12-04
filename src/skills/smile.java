package team.redrock.skills;

import team.redrock.base.DamageSkill;
import team.redrock.base.buff.Dizzy;


public class smile extends DamageSkill implements team.redrock.base.buff.poison {

    private static final String NAME = "smile";
    private static final int DAMAGE = 100;
    private static final int POSION_TIME = 2;

    public smile() {
        super(NAME, DAMAGE);
    }

    @Override
    public int getTime() {
        return POSION_TIME;
    }

}