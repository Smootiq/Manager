package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerTest {
    Manager manager = new Manager();
    Movies movies = new Movies( 8, "Man in Black", "Comedy" );

    @Test
    void addFilm() {
        Movies[] actual = manager.addFilm( movies );
        Movies[] expected = {new Movies( 1, "Bloodshort", "Action" ),
                new Movies( 2, "Forward", "Cartoon" ),
                new Movies( 3, "Belgrad Hotel", "Comedy" ),
                new Movies( 4, "Gentlemens", "Action" ),
                new Movies( 5, "Invisible Man", "Thriller" ),
                new Movies( 6, "Trolls world tour", "Cartoon" ),
                new Movies( 7, "Number One", "Comedy" ),
                new Movies( 8, "Man in Black", "Comedy" )};
        assertArrayEquals( expected, actual );
    }

    @Test
    void searchFilms() {
        manager.addFilm( movies );
        manager.showFilms();
    }

    @Test
    void showFilms() {
        manager.addFilm( movies );
        Movies[] movies = manager.showFilms();
    }
}