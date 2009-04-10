package me.springframework.sample.javame;

import java.util.Enumeration;
import java.util.Vector;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import me.springframework.sample.api.Movie;
import me.springframework.sample.api.MovieFinder;
import me.springframework.sample.javame.factory.BeanFactory;


public class MovieMidlet extends MIDlet {

    private BeanFactory factory = new BeanFactory();

    protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
    }

    protected void pauseApp() {
    }

    protected void startApp() throws MIDletStateChangeException {
        MovieFinder finder = (MovieFinder) factory.getBean("movieFinder");
        Vector movies = finder.findAll();
        Display.getDisplay(this).setCurrent(createMoviePanel(movies));
    }

    private final Displayable createMoviePanel(Vector movies) {
        List displayable = new List("Movies", List.IMPLICIT);
        Enumeration enumeration = movies.elements();
        while (enumeration.hasMoreElements()) {
            Movie movie = (Movie) enumeration.nextElement();
            displayable.append(movie.getTitle() + " (" + movie.getYear() + ")", null);
        }
        return displayable;
    }

}