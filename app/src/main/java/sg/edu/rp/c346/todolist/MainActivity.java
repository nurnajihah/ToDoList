package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvTask;
    ArrayList<ItemList> alItemList;
    CustomAdapter caTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTask = findViewById(R.id.listViewToDo);
        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2018, 9, 22);

        alItemList = new ArrayList<>();

        ItemList item1 = new ItemList("MSA", date1);

        ItemList item2 = new ItemList("Go for haircut", date2);



        alItemList.add(item1);
        alItemList.add(item2);

        caTask = new CustomAdapter(this, R.layout.item_list, alItemList);

        lvTask.setAdapter(caTask);
    }
}
