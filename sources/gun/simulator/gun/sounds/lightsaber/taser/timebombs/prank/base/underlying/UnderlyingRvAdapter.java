package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.underlying;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.underlying.UnderlyingRvViewHolder;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z9;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UnderlyingRvAdapter<B, VH extends UnderlyingRvViewHolder<B, ?>> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2792a = new ArrayList();

    public abstract UnderlyingRvViewHolder a();

    public final boolean b(UnderlyingRvViewHolder underlyingRvViewHolder, int i, String str) {
        AbstractC2995aW.q(underlyingRvViewHolder, "holder");
        if (!AbstractC2995aW.i(str, "UnderlyingViewHolder_UpdateViewSelectedState")) {
            return false;
        }
        AbstractC2995aW.p(this.f2792a.get(i), "get(...)");
        underlyingRvViewHolder.itemView.setSelected(false);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f2792a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC2995aW.q((UnderlyingRvViewHolder) viewHolder, "holder");
        if (i >= 0) {
            ArrayList arrayList = this.f2792a;
            if (i < arrayList.size()) {
                arrayList.get(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        UnderlyingRvViewHolder underlyingRvViewHolderA = a();
        underlyingRvViewHolderA.itemView.setOnClickListener(new Z9(4, this, underlyingRvViewHolderA));
        return underlyingRvViewHolderA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        UnderlyingRvViewHolder underlyingRvViewHolder = (UnderlyingRvViewHolder) viewHolder;
        AbstractC2995aW.q(underlyingRvViewHolder, "holder");
        AbstractC2995aW.q(list, "payloads");
        Object objI0 = AbstractC2853Wf.i0(list);
        if (objI0 != null) {
            if (objI0 instanceof Bundle) {
                Set<String> setKeySet = ((Bundle) objI0).keySet();
                AbstractC2995aW.p(setKeySet, "keySet(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    String str = (String) obj;
                    AbstractC2995aW.n(str);
                    if (b(underlyingRvViewHolder, i, str)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return;
                }
            }
            if ((objI0 instanceof String) && b(underlyingRvViewHolder, i, (String) objI0)) {
                return;
            }
        }
        super.onBindViewHolder(underlyingRvViewHolder, i, list);
    }
}
