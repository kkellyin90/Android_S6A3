package com.funapp.session6assignment3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_option);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.color_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

    PopupMenu popup = new PopupMenu(this, findViewById(R.id.textColor));
    popup.getMenuInflater().inflate(R.menu.popup_color, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.red:
                        Toast.makeText(MainOption.this, "Red Color", Toast.LENGTH_SHORT).show();
                        //return true;
                    case R.id.green:
                        Toast.makeText(MainOption.this, "Green Color", Toast.LENGTH_SHORT).show();
                        //return true;
                    case R.id.blue:
                        Toast.makeText(MainOption.this, "Blue Color", Toast.LENGTH_SHORT).show();
                        //return true;
                }
                return true;
            }
        });

    return super.onOptionsItemSelected(item);
    }
}


