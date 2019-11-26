package com.bigdatapassion.hadoop.mapreduce.main;

import com.bigdatapassion.hadoop.mapreduce.invertedindex.InvertedIndexRunner;
import com.bigdatapassion.hadoop.mapreduce.wordcount.WordCountRunner;

public class MapReduceRunner {

    public static void main(String[] args) throws Exception {
        String operation = args[0];

        String[] result = new String[args.length - 1];
        System.arraycopy(args, 1, result, 0, result.length);

        if ("wordcount".equalsIgnoreCase(operation)) {
            WordCountRunner.main(result);
        } else if ("invertedindex".equalsIgnoreCase(operation)) {
            InvertedIndexRunner.main(result);
        }
    }

}
