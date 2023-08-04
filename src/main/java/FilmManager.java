public class FilmManager {
    private int maxPosterSize = 5;
    private Films[] items = new Films[0];

    public FilmManager(int posterSize) {
        maxPosterSize = posterSize;
    }

    public FilmManager() {
        maxPosterSize = 5;
    }

    public void save(Films item) {
        Films[] tmp = new Films[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Films[] FindAll() {
        return items;
    }

    public Films[] FindLast() {
        Films[] reversed = new Films[maxPosterSize];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }
}
