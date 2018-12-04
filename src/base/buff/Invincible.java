package team.redrock.base.buff;

import team.redrock.base.Hero;
import team.redrock.base.buff.Buff;
public interface Invincible extends Buff {


    int aRoundConsume = 0;

    @Override
    default String getDescription(){
        return "无敌"+getTime()+"回合！";
    }

    @Override
    default void action(Hero hero) {
        hero.setcanReduceHp(false);
    }

    @Override
    default boolean isDebuff() {
        return false;
    }

    @Override
    default int getConsume(){
        return getTime()*aRoundConsume;
    }
}