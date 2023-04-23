// HavSurAb
interface HavingSuperAbility {
    public abstract void applySuperAbility();
}


abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbilityType;
}


class Magic extends Hero {
    public Magic() {
        health = 100;
        damage = 10;
        superAbilityType = "MAGICAL ATTACK";
    }
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + superAbilityType);
    }
}


class Medic extends Hero {
    public Medic() {
        health = 150;
        damage = 5;
        superAbilityType = "HEALING";
    }
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbilityType);
    }
}

class Warrior extends Hero {
    public Warrior() {
        health = 200;
        damage = 15;
        superAbilityType = "CRITICAL DAMAGE";
    }
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + superAbilityType);
    }
}

class Main {
    public static void main(String[] args) {
        // Создаем массив героев
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic();
        heroes[1] = new Medic();
        heroes[2] = new Warrior();


        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}
