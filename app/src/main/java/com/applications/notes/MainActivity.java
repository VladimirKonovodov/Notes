package com.applications.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textEnterPin;
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_Del;
    View.OnClickListener onClickListener;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    public static final int PIN_LENGTH = 4;
    public static final String PIN_FLAG_EXIST = "yes";
    public static final String PIN_USER = "pin";
    private static String NOTE_TEXT = "note_text";
    private SharedPreferences myNoteSharedPref;
    StringBuffer sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewsInit();
        int pinSymCount = 0;
        sb = new StringBuffer();
        buttonsListener();
        myNoteSharedPref = getSharedPreferences("MyNote", MODE_PRIVATE);
    }
    private void buttonsListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.btn_Del) {
                    if (sb.length() != 0) {
                        switch (sb.length()) {
                            case 1: {
                                imageView1.setImageResource(R.drawable.ic_baseline_radio_button_unchecked_24);
                                break;
                            }
                            case 2: {
                                imageView2.setImageResource(R.drawable.ic_baseline_radio_button_unchecked_24);
                                break;
                            }
                            case 3: {
                                imageView3.setImageResource(R.drawable.ic_baseline_radio_button_unchecked_24);
                                break;
                            }
                            case 4: {
                                imageView4.setImageResource(R.drawable.ic_baseline_radio_button_unchecked_24);
                                break;
                            }
                            default:
                                break;
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        textEnterPin.setText(sb.toString());

                    }
                } else {
                    if (sb.length() < PIN_LENGTH) {
                        sb.append(view.getTag().toString());
                        textEnterPin.setText(sb.toString());
                        switch (sb.length()) {
                            case 1: {
                                imageView1.setImageResource(R.drawable.ic_baseline_check_circle_outline_24);
                                break;
                            }
                            case 2: {
                                imageView2.setImageResource(R.drawable.ic_baseline_check_circle_outline_24);
                                break;
                            }
                            case 3: {
                                imageView3.setImageResource(R.drawable.ic_baseline_check_circle_outline_24);
                                break;
                            }
                            case 4: {
                                imageView4.setImageResource(R.drawable.ic_baseline_check_circle_outline_24);
                                break;
                            }
                            default:
                                break;
                        }
                        //imageView1.setImageResource(R.drawable.ic_baseline_check_circle_24);
                    }
                }

            }
        };

        btn_0.setOnClickListener(onClickListener);
        btn_1.setOnClickListener(onClickListener);
        btn_2.setOnClickListener(onClickListener);
        btn_3.setOnClickListener(onClickListener);
        btn_4.setOnClickListener(onClickListener);
        btn_5.setOnClickListener(onClickListener);
        btn_6.setOnClickListener(onClickListener);
        btn_7.setOnClickListener(onClickListener);
        btn_8.setOnClickListener(onClickListener);
        btn_9.setOnClickListener(onClickListener);
        btn_Del.setOnClickListener(onClickListener);

    }

    private void viewsInit() {
        textEnterPin = findViewById(R.id.textEnterPin);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_Del = findViewById(R.id.btn_Del);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView1.setImageResource(R.drawable.ic_baseline_radio_button_unchecked_24);
        imageView2.setImageResource(R.drawable.ic_baseline_radio_button_unchecked_24);
        imageView3.setImageResource(R.drawable.ic_baseline_radio_button_unchecked_24);
        imageView4.setImageResource(R.drawable.ic_baseline_radio_button_unchecked_24);


    }

    private String getPref() {
        /*
        if (!myNoteSharedPref.contains(NOTE_TEXT)) {
            return setPref();
        } else {
            */
        return myNoteSharedPref.getString(NOTE_TEXT, "");
        //}
    }

    private String setPref() {

        SharedPreferences.Editor myEditor = myNoteSharedPref.edit();
/*
        String noteSave = getString(R.string.large_text);
        myEditor.putString(NOTE_TEXT, noteSave);
        myEditor.apply();
        Toast.makeText(ListViewActivity.this, "данные сохранены", Toast.LENGTH_LONG).show();
        return noteSave;*/
        return "werw";
    }
}