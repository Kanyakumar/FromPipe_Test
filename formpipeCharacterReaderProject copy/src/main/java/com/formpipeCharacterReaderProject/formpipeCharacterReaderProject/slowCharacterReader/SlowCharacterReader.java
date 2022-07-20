package com.formpipeCharacterReaderProject.formpipeCharacterReaderProject.slowCharacterReader;


import com.formpipeCharacterReaderProject.formpipeCharacterReaderProject.FormpipeCharacterReaderProjectApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SlowCharacterReader implements FormpipeCharacterReaderProjectApplication {
    @Override
    public void findDuplicateElement(List<String> list) {
        Map<String, Long> temp = new HashMap<>();
        for (String str : list) {
            for (String text : str.split(",")) {
                Arrays.stream(text.toLowerCase().trim().split(" "))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                        .forEach(e -> {
                            Long pastValue = temp.get(e.getKey()) == null ? 0 : temp.get(e.getKey());
                            temp.put(e.getKey(), e.getValue() + pastValue);
                        });

            }

        }
        temp.entrySet()
                .stream().sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));


//        list.parallelStream().forEach(text -> Arrays.stream(text.toLowerCase().replace(",", "").split(" "))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
//
//                .forEach(e -> {
//                    Long pastValue = temp.get(e.getKey()) == null ? 0 : temp.get(e.getKey());
//                    temp.put(e.getKey(), e.getValue() + pastValue);
//                })
//        );
    }

}