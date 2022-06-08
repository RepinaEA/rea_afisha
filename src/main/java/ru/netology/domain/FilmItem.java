package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class FilmItem {

    private int FilmID;
    private String FilmName;
    private String FilmGenre;

}
