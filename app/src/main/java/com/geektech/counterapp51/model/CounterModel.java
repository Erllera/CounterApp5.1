package com.geektech.counterapp51.model;

import android.widget.Toast;

public class CounterModel {
    public int toastNumber = 10;
    public int colorNumber = 15;
    public int count = 0;

    public int getToastNumber() {
        return toastNumber;
    }

    public int getColorNumber() {
        return colorNumber;
    }

    public void increment() {
        ++count;
    }

    public void decrement() {
        --count;
    }

    public int getCount() {
        return count;
    }

}
