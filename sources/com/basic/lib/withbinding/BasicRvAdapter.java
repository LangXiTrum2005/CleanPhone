package com.basic.lib.withbinding;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z9;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicRvAdapter<B, VH extends BasicRvViewHolderNotBinding<B>> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f212a = new ArrayList();
    public boolean b;
    public Object c;
    public InterfaceC3567gx d;

    public final boolean a(int i) {
        return i >= 0 && i < this.f212a.size();
    }

    public final Object b(int i) {
        if (a(i)) {
            return this.f212a.get(i);
        }
        return null;
    }

    public abstract BasicRvViewHolderNotBinding c(ViewGroup viewGroup, int i);

    public final void d(int i, String str) {
        notifyItemRangeChanged(i, 1, BundleKt.bundleOf(new C4839vT(str, Boolean.TRUE)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BasicRvViewHolderNotBinding basicRvViewHolderNotBinding, int i) {
        AbstractC2995aW.q(basicRvViewHolderNotBinding, "holder");
        Object objB = b(i);
        if (objB != null) {
            basicRvViewHolderNotBinding.c(objB);
            if (this.b) {
                Object obj = this.c;
                basicRvViewHolderNotBinding.d(obj != null ? AbstractC2995aW.i(obj, objB) : false);
            }
        }
    }

    public final void f(ArrayList arrayList) {
        AbstractC2995aW.q(arrayList, "dataList");
        if (arrayList.size() == this.f212a.size() && AbstractC2995aW.i(arrayList, this.f212a)) {
            return;
        }
        int size = this.f212a.size();
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f212a = arrayList2;
        if (!(!arrayList2.isEmpty())) {
            notifyItemRangeRemoved(0, size);
        } else if (size > 0) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeInserted(0, this.f212a.size());
        }
    }

    public final void g(Object obj) {
        this.b = true;
        Object obj2 = this.c;
        int iIndexOf = obj2 != null ? this.f212a.indexOf(obj2) : -1;
        this.c = obj;
        int iIndexOf2 = obj != null ? this.f212a.indexOf(obj) : -1;
        if (a(iIndexOf)) {
            d(iIndexOf, "BasicViewHolder_UpdateViewSelectedState");
        }
        if (a(iIndexOf2)) {
            d(iIndexOf2, "BasicViewHolder_UpdateViewSelectedState");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f212a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        BasicRvViewHolderNotBinding basicRvViewHolderNotBindingC = c(viewGroup, i);
        basicRvViewHolderNotBindingC.itemView.setOnClickListener(new Z9(1, this, basicRvViewHolderNotBindingC));
        return basicRvViewHolderNotBindingC;
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
                    Object obj2 = this.f212a.get(i);
                    Object obj3 = this.c;
                    basicRvViewHolderNotBinding.d(obj3 != null ? AbstractC2995aW.i(obj3, obj2) : false);
                } else if (AbstractC2995aW.i(str, "BasicViewHolder_UpdateView")) {
                    onBindViewHolder(basicRvViewHolderNotBinding, i);
                }
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                return;
            }
        }
        super.onBindViewHolder(basicRvViewHolderNotBinding, i, list);
    }
}
