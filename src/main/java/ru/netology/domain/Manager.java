package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private int quantityOfFilms = 5;

    Movies[] list = {new Movies(1, "Bloodshort", "Action"),
            new Movies(2, "Forward", "Cartoon"),
            new Movies(3, "Belgrad Hotel", "Comedy"),
            new Movies(4, "Gentlemens", "Action"),
            new Movies(5, "Invisible Man", "Thriller"),
            new Movies(6, "Trolls world tour", "Cartoon"),
            new Movies(7, "Number One", "Comedy")};

    Movies movies = new Movies(8, "Man in Black", "Comedy");

    public Movies[] addFilm(Movies movies) {
        int length = list.length + 1;
        Movies[] addedFilm = new Movies[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }
        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = movies;
        list = addedFilm;
        System.out.println(list);
        return list;

    }


    public Movies[] showFilms() {
        for (int i = list.length - 1; i > list.length - (quantityOfFilms + 1) & i >= 0; i--) {
            System.out.print(list[i]);
        }
        return new Movies[0];
    }
}