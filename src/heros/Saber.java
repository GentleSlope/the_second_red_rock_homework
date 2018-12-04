package team.redrock.heros;

import team.redrock.base.DamageSkill;
import team.redrock.base.Hero;
import team.redrock.base.Skill;

public class Saber extends Hero {
    private final static String NAME = "蒋维富";//你的名字
    private final static String STUID = "2017212670";//学号
    private final static int STR = 100;//力量
    private final static int INT = 200;//智力
    private final static int AGI = 300;//敏捷

    public Saber() {
        //在构造方法里第一行写上调用父类的构造方法
        //第一个参数是你的名字，第二个是学号，后面依次是力量、敏捷、智力。
        super(NAME, STUID, STR, AGI, INT);
        Skill heihei = new team.redrock.skills.Venomous_spines();
        Skill holy_light = new team.redrock.skills.holy_light();
        super.addSkill(heihei);
        super.addSkill(holy_light);
    }
}
