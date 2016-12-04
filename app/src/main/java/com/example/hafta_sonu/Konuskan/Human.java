package com.example.hafta_sonu.Konuskan;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by Hafta_Sonu on 4.12.2016.
 */

public class Human implements Konusturan{
    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String Speak() {
        return  "Benim Adım " + name;
    }
}
