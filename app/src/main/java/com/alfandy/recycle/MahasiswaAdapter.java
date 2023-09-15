package com.alfandy.recycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.alfandy.recycle.MainActivity;
import com.alfandy.recycle.Mahasiswa;
import com.alfandy.recycle.R;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private List<Mahasiswa> mahasiswaList;
    private Context context;

    public MahasiswaAdapter(List<Mahasiswa> mahasiswaList, Context context) {
        this.mahasiswaList = mahasiswaList;
        this.context = context;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        Mahasiswa mahasiswa = mahasiswaList.get(position);
        holder.textViewNama.setText(mahasiswa.getNama());
        holder.textViewNIM.setText(mahasiswa.getNim());
        holder.textViewNomorHp.setText(mahasiswa.getNomorHp());
    }

    @Override
    public int getItemCount() {
        return mahasiswaList.size();
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNama, textViewNIM, textViewNomorHp;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNama = itemView.findViewById(R.id.textViewNama);
            textViewNIM = itemView.findViewById(R.id.textViewNIM);
            textViewNomorHp = itemView.findViewById(R.id.textViewNomorHp);
        }
    }
}
