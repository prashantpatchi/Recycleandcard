package win.prashant.recycleandcard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public  class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private List<Person> persons;
    private Context context;

    public MyRecyclerViewAdapter(List<Person> persons, Context context) {
        this.persons = persons;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_list_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Person person = persons.get(i);
        viewHolder.txtname.setText(person.getName());
        viewHolder.txtjob.setText(person.getJob());

    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtname,txtjob;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname =  itemView.findViewById(R.id.textPersonName);
            txtjob = itemView.findViewById(R.id.txtPersonJob);
        }
    }

    }
