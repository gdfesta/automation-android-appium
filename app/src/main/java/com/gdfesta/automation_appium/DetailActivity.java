package com.gdfesta.automation_appium;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * @author gdfesta
 */
public class DetailActivity extends AppCompatActivity {
    private final static String EXTRA = "EXTRA";

    public static Intent createIntent(Context context, String detail) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA, detail);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        ((TextView) findViewById(R.id.detail_text)).setText(getString(R.string.detail_text, getIntent().getStringExtra(EXTRA)));
    }
}
