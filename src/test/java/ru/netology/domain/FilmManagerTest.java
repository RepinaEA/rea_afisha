package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmItem first = new FilmItem(1, "Бладшот", "боевик");
    FilmItem second = new FilmItem(2, "Вперед", "мультфильм");
    FilmItem third = new FilmItem(3, "Отель Белград", "комедия");
    FilmItem fourth = new FilmItem(4, "Джентельмены", "боевик");
    FilmItem fifth = new FilmItem(5, "Человек-невидимка", "ужасы");
    FilmItem sixth = new FilmItem(6, "Тролли. Мировой тур", "мультфильм");
    FilmItem seventh = new FilmItem(7, "Номер один", "комедия");
    FilmItem eighth = new FilmItem(8, "Бэтмен", "фантастика");
    FilmItem ninth = new FilmItem(9, "Отец", "драма");
    FilmItem tenth = new FilmItem(10, "Власть", "драма");
    FilmItem eleventh = new FilmItem(11, "Время", "фантастика");

    @Test
    public void FindAllNoFilmCount() {
        FilmManager add = new FilmManager();
        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        FilmItem[] actual = add.findAll();
        FilmItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindAllFilmCount() {
        FilmManager add = new FilmManager(11);
        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        FilmItem[] actual = add.findAll();
        FilmItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindAllFilmMoreCount() {
        FilmManager add = new FilmManager(3);
        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        FilmItem[] actual = add.findAll();
        FilmItem[] expected = {first, second, third};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindAllFilmLessCount() {
        FilmManager add = new FilmManager(13);
        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        FilmItem[] actual = add.findAll();
        FilmItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastNoFilmCount() {
        FilmManager add = new FilmManager();
        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        FilmItem[] actual = add.findLast();
        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastFilmCount() {
        FilmManager add = new FilmManager(11);
        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        FilmItem[] actual = add.findLast();
        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindLastFilmeMoreCount() {
        FilmManager add = new FilmManager(5);
        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        FilmItem[] actual = add.findLast();
        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindLastFilmLessCount() {
        FilmManager add = new FilmManager(15);
        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        FilmItem[] actual = add.findLast();
        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
}
