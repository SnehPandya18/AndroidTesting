package com.snehpandya.androidtesting;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sneh.pandya on 25/10/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Names> mNames;
    private Context mContext;

    public MyAdapter(List<Names> names, Context context) {
        mNames = names;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.array_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Names names = mNames.get(position);

        TextView textView = holder.mTextView;
        textView.setText(names.getName());
    }

    @Override
    public int getItemCount() {
        return mNames.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        MyViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.text_array_list_item);
        }
    }
}
