package campus.valence;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Hero> heroes;
    private int index = 0;

    public Game() throws Exception {
        this.heroes = new ArrayList<Hero>();
        this.heroes.add(new Hero("Thomas", 4, 8));
        this.heroes.add(new Hero("Johnn", 2, 8));
        this.heroes.add(new Hero("McGregor", 8, 8));
        this.heroes.add(new Hero("Lalanne", 3, 8));
        this.heroes.add(new Hero("Yves", 9, 7));
    }

    /**
     * Should iterate over all heroes to find the strongest one
     *
     * @return the hero which has the bigger force attribute
     */
    //------------------------------------------------------------------------------------------

    public Hero findStrongest() {
        Hero HeroStronger = heroes.get(0);

        for (index = 0; index < heroes.size(); index++) {
            Hero HeroIndex = heroes.get(index);

            if (HeroIndex.getForce() > HeroStronger.getForce()) {
                HeroStronger = HeroIndex;

            }


        }
        return HeroStronger;
    }

    //------------------------------------------------------------------------------------------

    public Hero attackHero(Hero hero) {
        hero.setLife(hero.getLife() - 1);
        return hero;
    }


}
