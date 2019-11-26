package com.bigdatapassion.hadoop.mapreduce.movielens.moviefilter;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import com.bigdatapassion.hadoop.data.model.movielens.Movie;
import com.bigdatapassion.hadoop.data.model.movielens.factory.MovieFactory;

import java.io.IOException;

public class MovieFilterMapper extends Mapper<Object, Text, Text, Text> {

    @Override
    protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        Movie movie = MovieFactory.create(line);
        if (movie.getGenres().toLowerCase().contains("action")) {
            context.write(null, value);
        }
    }

}
