package pl.kodolamacz.spring.dao.repository.impl;

import org.springframework.stereotype.Repository;
import pl.kodolamacz.spring.dao.model.Movie;
import pl.kodolamacz.spring.dao.repository.MovieDao;

/**
 * Created by acacko on 29.10.17
 */
@Repository
public class MovieDaoImpl extends AbstractDaoImpl<Movie> implements MovieDao {

    @Override
    public Movie findByTitle(String title) {
        return entityMap.values()
                .stream()
                .filter(movie -> movie.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

}
