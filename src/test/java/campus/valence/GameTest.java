package campus.valence;

import org.junit.Assert;
import org.junit.Test;


/*
 * Compétences à valider en plus:
 * - Manipuler l’environnement de développement
 * - Débugger un programme
 * - Générer la Javadoc
 */
public class GameTest extends Exception {

    /*
     * Compétences:
     * - Programmer avec des variables
     * - Programmer une boucle
     * - Programmer une condition
     */
    @Test
    public void testShouldFindTheStrongest() throws Exception {
        Game game = new Game();

        Hero hero = game.findStrongest();

        Assert.assertEquals("Yves", hero.getName());
        Assert.assertEquals(9, hero.getForce());
        Assert.assertEquals(7, hero.getLife());
    }

    /*
     * La ligne "game.attackHero" doit être décommenté pour valider le test
     *
     * Compétences:
     * - Définir et utiliser une méthode
     */
    @Test
    public void testShouldRemoveOneLifePointWhenAttacked() throws Exception {
        Game game = new Game();
        Hero hero = game.findStrongest();

        game.attackHero(hero);

        Assert.assertEquals(6, hero.getLife());
    }

    /*
     * Etape 1: Faire passer le test avec l'exception du language, java.lang.Exception
     * Etape 2: Créer sa propre classe IllegalLifePointsException, qui prendra dans son constructeur uniquement l'entier qui correspond à la vie
     *
     * Compétences:
     * - Définir des classes
     * - Instancier des objets
     * - Gérer les exceptions
     */
    @Test

    public void testShouldDenyLifePointsOver99() {

        try {
            new Hero("Sergueï", 20, 100);
            Assert.fail("No exception has been raised");
        } catch (Exception error) {
            Assert.assertEquals("100 life points is too much!", error.getMessage());
        }
    }


    /*
     * Bonus !
     */
    @Test
    public void testShouldHeroShouldBeComparable() throws Exception {
        Game game = new Game();

        Hero hero = game.findStrongest();

        Assert.assertEquals(new Hero("Yves", 9, 7), hero);
    }

}
