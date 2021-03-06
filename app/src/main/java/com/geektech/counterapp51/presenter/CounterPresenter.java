package com.geektech.counterapp51.presenter;

import com.geektech.counterapp51.Injector;
import com.geektech.counterapp51.model.CounterModel;
import com.geektech.counterapp51.view.CounterContracts;

public class CounterPresenter implements CounterContracts.CounterPresenter {
    CounterModel counterModel = Injector.counterModel();
    CounterContracts.CounterView counterView;

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateText(counterModel.getCount());
        if (counterModel.getCount() == counterModel.getToastNumber()) {
            counterView.seeToast(counterModel.getToastNumber());
        }
        if (counterModel.getCount() == counterModel.getColorNumber()) {
            counterView.paintText(counterModel.getColorNumber());
        }
    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateText(counterModel.getCount());
        if (counterModel.getCount() == counterModel.getToastNumber()) {
            counterView.seeToast(counterModel.getToastNumber());
        }
        if (counterModel.getCount() == counterModel.getColorNumber()) {
            counterView.paintText(counterModel.getColorNumber());
        }
    }

    @Override
    public void attachCounterView(CounterContracts.CounterView view) {
        counterView = view;
    }
}
