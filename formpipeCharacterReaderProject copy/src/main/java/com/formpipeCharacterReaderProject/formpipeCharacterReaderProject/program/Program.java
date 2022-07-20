package com.formpipeCharacterReaderProject.formpipeCharacterReaderProject.program;


import com.formpipeCharacterReaderProject.formpipeCharacterReaderProject.FormpipeCharacterReaderProjectApplication;
import com.formpipeCharacterReaderProject.formpipeCharacterReaderProject.simpleCharacterReader.SimpleCharacterReader;
import com.formpipeCharacterReaderProject.formpipeCharacterReaderProject.slowCharacterReader.SlowCharacterReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping
public class Program {
    public static void main(String args[]){
        FormpipeCharacterReaderProjectApplication charReader = new SimpleCharacterReader();
        List<String> list = Arrays.asList("It was the best of times, it was the worst of times");
        //charReader.findDuplicateElement(list);
        list = Arrays.asList("It was the best of times, it was the worst of times"
                , "It was the best of times, it was the worst of times"
                , "It was the best of times, it was the worst of times"
                , "It was the best of times, it was the worst of times"
                , "It was the best of times, it was the worst of times"
                , "It was the best of times, it was the worst of times"
                , "It was the best of times, it was the worst of times"
                , "It was the best of times, it was the worst of times"
                , "It was the best of times, it was the worst of times"
                , "It was the best of times, it was the worst of times");
        charReader = new SlowCharacterReader();
        charReader.findDuplicateElement(list);
    }
}
