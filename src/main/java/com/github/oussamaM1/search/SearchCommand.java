package com.github.oussamaM1.search;

import com.github.oussamaM1.api.StackOverflowHttpClient;
import io.micronaut.http.annotation.Options;
import jakarta.inject.Inject;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;

@Command(name ="search" ,description = "Search questions" , mixinStandardHelpOptions = true)
public class SearchCommand implements Runnable{

    @Option(names = {"-q" , "--query"} , description = "Search phrase.")
    String query = "";
    @Option(names = {"-t" , "--tag"} , description = "Search inside specific tags.")
    String tag = "";
    @Option(names = {"-n" , "--limit"} , description = "Number of results , default : 10")
    int limit = 10;
    @Option(names = {"-s","--sort-by"} , description = "Values : relevance , votes , creation , activity. Default : relevance")
    String sort = "relevance";
    @Option(names = {"--verbose"}  , description = "Print verbose output.")
    boolean verbose;

    @Inject
    StackOverflowHttpClient client;

    @Override
    public void run() {
        System.out.println("Search command running...");
        var response = client.search(query , tag , limit , sort);
        response.items.forEach(System.out::println);
    }
}
