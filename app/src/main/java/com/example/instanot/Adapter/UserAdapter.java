package com.example.instanot.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.support.v4.*;
import com.example.instanot.Model.User;
import com.example.instanot.R;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{

    private Context mContext;
    private List<User> mUsers;

    private FirebaseUser firebaseUser;

    public UserAdapter(Context mContext, List<User> mUsers) {
        this.mContext = mContext;
        this.mUsers = mUsers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(mContext).inflate(R.layout.);
        //return new UserAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }
}
