import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    Films item1 = new Films("Бладшот>");
    Films item2 = new Films("Вперёд");
    Films item3 = new Films("Отель Белград");
    Films item4 = new Films("Джентльмены");
    Films item5 = new Films("Человек-невидимка");
    Films item6 = new Films("Тролли.Мировой тур");
    Films item7 = new Films("Номер один");

    @Test
    public void testAllFilms() {
        FilmManager repo = new FilmManager();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);

        Films[] expected = {item1, item2, item3, item4, item5, item6, item7};
        Films[] actual = repo.FindAll();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFiveFilms() {
        FilmManager repo = new FilmManager();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);

        Films[] expected = {item7, item6, item5, item4, item3};
        Films[] actual = repo.FindLast();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSevenFilms() {
        FilmManager repo = new FilmManager(7);
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);

        Films[] expected = {item7, item6, item5, item4, item3, item2, item1};
        Films[] actual = repo.FindLast();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNullFilms() {
        FilmManager repo = new FilmManager();

        Films[] expected = {};
        Films[] actual = repo.FindAll();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOneFilms() {
        FilmManager repo = new FilmManager();
        repo.save(item1);

        Films[] expected = {item1};
        Films[] actual = repo.FindAll();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoFilms() {
        FilmManager repo = new FilmManager(2);
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);

        Films[] expected = {item7, item6};
        Films[] actual = repo.FindLast();

        Assert.assertArrayEquals(expected, actual);
    }
}
