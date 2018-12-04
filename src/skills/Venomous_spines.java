package team.redrock.skills;

import team.redrock.base.DamageSkill;
import team.redrock.base.buff.Dizzy;


public class Venomous_spines extends DamageSkill implements team.redrock.base.buff.Blinding {

    private static final String NAME = "Venomous_spines ";
    private static final int DAMAGE = 200;
    private static final int EFFECT_TIME = 2;

    public Venomous_spines() {
        super(NAME, DAMAGE);
    }

    @Override
    public int getTime() {
        return EFFECT_TIME;
    }

}