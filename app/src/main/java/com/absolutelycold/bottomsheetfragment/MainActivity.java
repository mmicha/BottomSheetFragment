package com.absolutelycold.bottomsheetfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ItemListDialogFragment.Listener{

    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.show_bottom_sheet);
    }

    public void onShowBottomSheetClicked(View view) {
        String positionsData[] = {"Open Browser", "Copy Url", "Open Other Application"};
        ItemListDialogFragment.newInstance(positionsData).show(getSupportFragmentManager(), ItemListDialogFragment.TAG);
    }

    @Override
    public void onItemClicked(int position) {
        switch(position) {
            case 0:
                textView.setText("Open Browser is clicked");
                break;
            case 1:
                textView.setText("Copy Url is clicked");
                break;
            case 2:
                textView.setText("Open Other Application is clicked");
                break;
            default:
                textView.setText("Opps, error");
        }

    }
}
