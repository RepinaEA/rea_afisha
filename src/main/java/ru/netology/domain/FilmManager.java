package ru.netology.domain;

public class FilmManager {

    private int filmCount = 10;
    private FilmItem[] items = new FilmItem[0];

    public FilmManager(int filmCount) {
        this.filmCount = filmCount;
    }

    public FilmManager() {

    }

    public void save(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        FilmItem[] film = new FilmItem[filmCount];
        System.arraycopy(items, 0, film, 0, filmCount);
        return film;
    }

    public FilmItem[] findLast() {

        FilmItem[] result = new FilmItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        FilmItem[] film = new FilmItem[filmCount];
        System.arraycopy(result, 0, film, 0, filmCount);
        return film;
    }

}
