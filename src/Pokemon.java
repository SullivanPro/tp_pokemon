public class Pokemon {


    private Double lvlLife;
    private Double lvlPower;
    private String name;


    Pokemon(String name, Double lvlLife, Double lvlPower){
        this.name = name;
        this.lvlLife = lvlLife;
        this.lvlPower = lvlPower;
    }

    /**
     * Getters & Setters
     */
    public Double getLvlLife() {
        return lvlLife;
    }

    public void setLvlLife(Double lvlLife) {
        this.lvlLife = lvlLife;
    }

    public Double getLvlPower() {
        return lvlPower;
    }

    public void setLvlPower(Double lvlPower) {
        this.lvlPower = lvlPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Cries
     */
    public String defeatCry() {
        return "Cri de défaite : " + name + " oh... je suis ko";
    }

    public String victoryCry() {
        return "Cri de victoire : " + name + " yeaah ! J'ai gagné !";
    }

    public String fightCry() {
        return "Cri de combat : Je suis " + name + ", j'ai " + lvlLife + " de vie et " + lvlPower + " de puissance. Prêt à combattre !";

    }
}
