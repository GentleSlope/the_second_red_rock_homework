package team.redrock.base.buff;

import team.redrock.base.Hero;
import team.redrock.base.buff.Buff;


public interface poison extends Buff {


    int aRoundConsume = 0;

    @Override
    default String getDescription(){
        return "并且将持续掉血"+getTime()+"回合！";
    }

    @Override
default void action(Hero hero) {
    hero.reduceHp( 100);
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