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

    public Films[] findAll() {
        return items;
    }

    public Films[] findLast() {
        int length;
        if (items.length < maxPosterSize) {
            length = items.length;
        } else {
            length = maxPosterSize;
        }
        Films[] reversed = new Films[length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }
}
