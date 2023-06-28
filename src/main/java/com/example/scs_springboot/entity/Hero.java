package com.example.scs_springboot.entity;
import java.util.List;

/**
 * @author: 蛋宝
 * @date: 2023/6/28 14:54
 * @description:
 */
public class Hero {
    private String name;
    private String alias;
    private int level;
    private List<String> abilities;
    private boolean isAlive;

    public Hero(String name, String alias, int level, List<String> abilities) {
        this.name = name;
        this.alias = alias;
        this.level = level;
        this.abilities = abilities;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void increaseLevel() {
        level++;
    }

    public void useAbility(String ability) {
        if (abilities.contains(ability)) {
            System.out.println(name + " uses " + ability + " ability.");
        } else {
            System.out.println(name + " does not possess " + ability + " ability.");
        }
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            System.out.println(name + " takes " + damage + " damage.");
            if (damage >= 100) {
                isAlive = false;
                System.out.println(name + " has been defeated.");
            }
        }
    }
}