package org.federicoariellotitto;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> a = IntStream.range(0, aCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .collect(toList());

        Result resolver = new Result();
        List<String> result = resolver.balancedBraces(a);

        result.forEach(System.out::println);

        bufferedReader.close();
    }
}

