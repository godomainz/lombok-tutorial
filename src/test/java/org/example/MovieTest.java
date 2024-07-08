package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MovieTest {
    private Movie movie;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        movie = new Movie();
        movie.setTitle("The Matrix");
        movie.setDescription("Matrix description");
        movie.setCountry("US");
        movie.setId(1L);
        movie.setLanguage("English");
        movie.setOfficialSite(new URL("https://www.imdb.com/title/tt0133093/"));
        movie.setRating(8);
    }

    @Test
    public void testGetId() {
        Assert.assertNotNull(movie);
        Assert.assertEquals(1L,movie.getId());
    }

    @Test
    public void testSetId() {
        Assert.assertNotNull(movie);
        movie.setId(2L);
        Assert.assertEquals(2L,movie.getId());

    }

    @Test
    public void testGetTitle() {
        Assert.assertNotNull(movie);
        movie.setTitle("Tomb Raider");
        Assert.assertEquals("Tomb Raider",movie.getTitle());
    }

    @Test
    public void testSetTitle() {
        Assert.assertNotNull(movie);
        movie.setTitle("The Matrix");
        Assert.assertEquals("The Matrix",movie.getTitle());
    }

    @Test
    public void testGetDescription() {
        Assert.assertNotNull(movie);
        Assert.assertEquals("Matrix description",movie.getDescription());
    }

    @Test
    public void testSetDescription() {
        Assert.assertNotNull(movie);
        movie.setDescription("Tomb Raider description");
        Assert.assertEquals("Tomb Raider description",movie.getDescription());
    }

    @Test
    public void testGetCountry() {
        Assert.assertNotNull(movie);
        Assert.assertEquals("US",movie.getCountry());
    }

    @Test
    public void testSetCountry() {
        Assert.assertNotNull(movie);
        movie.setCountry("UK");
        Assert.assertEquals("UK",movie.getCountry());
    }

    @Test
    public void testGetRating() {
        Assert.assertNotNull(movie);
        Assert.assertEquals(8,movie.getRating());
    }

    @Test
    public void testSetRating() {
        Assert.assertNotNull(movie);
        movie.setRating(7);
        Assert.assertEquals(7,movie.getRating());
    }

    @Test
    public void testGetOfficialSite() {
        Assert.assertNotNull(movie);
        Assert.assertEquals("https://www.imdb.com/title/tt0133093/",movie.getOfficialSite().toString());
    }

    @Test
    public void testSetOfficialSite() throws MalformedURLException {
        Assert.assertNotNull(movie);
        movie.setOfficialSite(new URL("https://www.imdb.com/title/tt1365519/"));
        Assert.assertEquals("https://www.imdb.com/title/tt1365519/",movie.getOfficialSite().toString());
    }

    @Test
    public void testGetLanguage() {
        Assert.assertNotNull(movie);
        Assert.assertEquals("English",movie.getLanguage());
    }

    @Test
    public void testSetLanguage() {
        Assert.assertNotNull(movie);
        movie.setLanguage("Spanish");
        Assert.assertEquals("Spanish",movie.getLanguage());
    }
}