package com.geektech.counterapp51;

import com.geektech.counterapp51.model.CounterModel;
import com.geektech.counterapp51.presenter.CounterPresenter;

public class Injector {
    public static CounterPresenter counterPresenter() {
        return new CounterPresenter();
    }

    public static CounterModel counterModel() {
        return new CounterModel();
    }

}
