package com.formpipeCharacterReaderProject.formpipeCharacterReaderProject.simpleCharacterReader;


import com.formpipeCharacterReaderProject.formpipeCharacterReaderProject.FormpipeCharacterReaderProjectApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleCharacterReader implements FormpipeCharacterReaderProjectApplication {
    @Override
    public void findDuplicateElement(List<String> list) {
            Arrays.stream(list.get(0).toLowerCase().replace(",","").split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}
