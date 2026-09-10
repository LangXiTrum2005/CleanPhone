package com.afollestad.materialdialogs.simplelist;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QK;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSimpleListAdapter extends RecyclerView.Adapter<NM> implements QK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EM f52a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (this.f52a != null) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new NM(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.md_simplelist_item, viewGroup, false), this);
    }
}
