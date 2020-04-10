package com.yak7.test55;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreferences {

    private static final String PREFERENCES_NAME = "WORD";
    private SharedPreferences preferences;

    public AppPreferences(Context context)
    {
        preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);

    }
    public static final String[] WORDS = {"РАДИО", "МАДАГАСКАР",
            "КАША", "ЧЕРНИГОВ", "АНДРОИД", "ЮПИТЕР", "МОЗАМБИК", "ГАФНИЙ", "ЛИТИЙ", "НАТРИЙ",
            "ПОЛИФЕНОЛ", "СТАНЦИЯ", "ГАРАЖ", "СТЕК", "ВОЛЬФРАМ", "ПИЛОТ", "ПОЛИТИКА",
            "ЖЕЛЕЗО", "АЗОТ", "ТУМАН", "МЕРКУРИЙ", "СИНОПТИК", "КИЕВ", "ПРИЛУКИ", "НЕЖИН",
            "КОТ", "КРОТ", "ГРУША", "КАЛЬЦИЙ", "КОБАЛЬТ"};
}
