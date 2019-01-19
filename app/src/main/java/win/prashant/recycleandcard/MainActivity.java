package win.prashant.recycleandcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerviewAdapter;
    private List<Person> personList;
    private MyRecyclerViewAdapter recyclearViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        personList = new ArrayList<>();

        for (int index = 0; index < 20; index++) {
            Person myPerson = new Person("Mr .A" + index, "Progrmmaer" +index);
            personList.add(myPerson);
        }

        recyclearViewAdapter = new MyRecyclerViewAdapter(personList, MainActivity.this);
        recyclerView.setAdapter(recyclearViewAdapter);
    }
}