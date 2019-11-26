package com.bigdatapassion.hadoop.mapreduce.movielens.moviewithtag;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import com.bigdatapassion.hadoop.data.model.movielens.Movie;
import com.bigdatapassion.hadoop.data.model.movielens.factory.MovieFactory;

import java.io.IOException;

public class MovieMapper extends Mapper<Object, Text, IntWritable, Text> {

    private IntWritable movieIdWritable = new IntWritable();
    private Text titleWritable = new Text();

    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

        String line = value.toString();

        Movie movie = MovieFactory.create(line);

        movieIdWritable.set(movie.getMovieId());
        titleWritable.set("\"" + movie.getTitle() + "\"");
        context.write(movieIdWritable, titleWritable);
    }

}
