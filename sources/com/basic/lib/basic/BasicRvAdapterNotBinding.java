package com.basic.lib.basic;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z9;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicRvAdapterNotBinding<B, VH extends BasicRvViewHolderNotBinding<B>> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f207a = new ArrayList();

    public abstract BasicRvViewHolderNotBinding a(ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f207a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj;
        BasicRvViewHolderNotBinding basicRvViewHolderNotBinding = (BasicRvViewHolderNotBinding) viewHolder;
        AbstractC2995aW.q(basicRvViewHolderNotBinding, "holder");
        if (i >= 0) {
            ArrayList arrayList = this.f207a;
            if (i < arrayList.size()) {
                obj = arrayList.get(i);
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            basicRvViewHolderNotBinding.c(obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        BasicRvViewHolderNotBinding basicRvViewHolderNotBindingA = a(viewGroup, i);
        basicRvViewHolderNotBindingA.itemView.setOnClickListener(new Z9(0, this, basicRvViewHolderNotBindingA));
        return basicRvViewHolderNotBindingA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        BasicRvViewHolderNotBinding basicRvViewHolderNotBinding = (BasicRvViewHolderNotBinding) viewHolder;
        AbstractC2995aW.q(basicRvViewHolderNotBinding, "holder");
        AbstractC2995aW.q(list, "payloads");
        Object objI0 = AbstractC2853Wf.i0(list);
        if (objI0 != null && (objI0 instanceof Bundle)) {
            Set<String> setKeySet = ((Bundle) objI0).keySet();
            AbstractC2995aW.p(setKeySet, "keySet(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                String str = (String) obj;
                AbstractC2995aW.n(str);
                if (AbstractC2995aW.i(str, "BasicViewHolder_UpdateViewSelectedState")) {
                    this.f207a.get(i);
                    basicRvViewHolderNotBinding.d(false);
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                return;
            }
        }
        super.onBindViewHolder(basicRvViewHolderNotBinding, i, list);
    }
}
