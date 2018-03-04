package com.playwithspring.part1.chapter2.di.compitation;

import com.playwithspring.part1.commons.Poem;

public class Madhusala implements Poem {

    public static String[] LINES = {
            "मृदु भावों के अंगूरों की आज बना लाया हाला" ,
            "प्रियतम, अपने ही हाथों से आज पिलाऊँगा प्याला," ,
            "पहले भोग लगा लूँ तेरा फिर प्रसाद जग पाएगा," ,
            "सबसे पहले तेरा स्वागत करती मेरी मधुशाला"
    };

    public void recite() {
        for (String line : LINES) {
            System.out.println(line);
        }
    }
}
