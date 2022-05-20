package com.geektech.counterapp51;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.geektech.counterapp51.databinding.ActivityMainBinding;
import com.geektech.counterapp51.model.CounterModel;
import com.geektech.counterapp51.presenter.CounterPresenter;
import com.geektech.counterapp51.view.CounterContracts;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {
    ActivityMainBinding binding;
    CounterPresenter presenter;
    CounterModel counterModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        counterModel = Injector.counterModel();
        presenter = Injector.counterPresenter();
        presenter.attachCounterView(this);
        clickMethods();
    }

    private void clickMethods() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
            }
        });

        binding.decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
            }
        });

    }

    @Override
    public void updateText(int count) {
        binding.counterText.setText(String.valueOf(count));
    }

    @Override
    public void seeToast(int toastNumber) {
        String textTV = binding.counterText.getText().toString();
        if (textTV.equals(String.valueOf(toastNumber))) {
            Toast.makeText(this, "Поздравляю", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void paintText(int colorNumber) {
        String textTV = binding.counterText.getText().toString();
        if (textTV.equals(String.valueOf(colorNumber))) {
            binding.counterText.setTextColor(Color.GREEN);
        }
        else{
            binding.counterText.setTextColor(Color.BLACK);
        }
    }
}