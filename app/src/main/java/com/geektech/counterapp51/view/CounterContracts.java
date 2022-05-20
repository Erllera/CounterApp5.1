package com.geektech.counterapp51.view;

import com.geektech.counterapp51.model.CounterModel;

public class CounterContracts {

    public interface CounterView {
        void updateText(int count);
        void seeToast(int toastNumber);
        void paintText(int colorNumber);
    }

    public interface CounterPresenter {
        void increment();
        void decrement();
        void attachCounterView(CounterView view);
    }
}
