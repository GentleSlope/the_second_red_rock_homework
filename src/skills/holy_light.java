package team.redrock.skills;
import team.redrock.base.DamageSkill;
import team.redrock.base.buff.Invincible;


public class holy_light extends DamageSkill implements team.redrock.base.buff.Invincible {

    private static final String NAME = "holy_light";
    private static final int DAMAGE = 0;
    private static final int POSION_TIME = 100;

    public holy_light() {
        super(NAME, DAMAGE);
    }

    @Override
    public int getTime() {
        return POSION_TIME;
    }

}