package team.redrock.base.buff;

import team.redrock.base.Hero;
import team.redrock.base.buff.Buff;
public interface Blinding extends Buff {

    /**
     * 眩晕的蓝耗和时间长度有关
     * 眩晕时间没一回合的蓝耗
     */
    int aRoundConsume = 70;

    @Override
    default String getDescription(){
        return "致盲了且流血了"+getTime()+"回合！";
    }

    @Override
    default void action(Hero hero) {
        hero.setCanDamage(false);
        hero.setCanCast(true);
        hero.reduceHp(200);
    }

    @Override
    default boolean isDebuff() {
        return true;
    }

    @Override
    default int getConsume(){
        return getTime()*aRoundConsume;
    }
}
