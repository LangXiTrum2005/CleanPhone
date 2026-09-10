package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: SimpleItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class impassible extends RecyclerView.formularize {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f13449competently = true;

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public boolean attabal(RecyclerView.stratoscope stratoscopeVar, RecyclerView.formularize.dern dernVar, RecyclerView.formularize.dern dernVar2) {
        int i;
        int i2;
        return (dernVar == null || ((i = dernVar.f13254attabal) == (i2 = dernVar2.f13254attabal) && dernVar.f13256saneness == dernVar2.f13256saneness)) ? gintrap(stratoscopeVar) : preprohormone(stratoscopeVar, i, dernVar.f13256saneness, i2, dernVar2.f13256saneness);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public boolean beachfront(RecyclerView.stratoscope stratoscopeVar) {
        return !this.f13449competently || stratoscopeVar.isInvalid();
    }

    public abstract boolean cord(RecyclerView.stratoscope stratoscopeVar);

    public final void cuirassed(RecyclerView.stratoscope stratoscopeVar) {
        restrictive(stratoscopeVar);
        impromptu(stratoscopeVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public boolean dern(RecyclerView.stratoscope stratoscopeVar, RecyclerView.formularize.dern dernVar, RecyclerView.formularize.dern dernVar2) {
        int i = dernVar.f13254attabal;
        int i2 = dernVar.f13256saneness;
        View view = stratoscopeVar.itemView;
        int left = dernVar2 == null ? view.getLeft() : dernVar2.f13254attabal;
        int top = dernVar2 == null ? view.getTop() : dernVar2.f13256saneness;
        if (stratoscopeVar.isRemoved() || (i == left && i2 == top)) {
            return cord(stratoscopeVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return preprohormone(stratoscopeVar, i, i2, left, top);
    }

    public abstract boolean gintrap(RecyclerView.stratoscope stratoscopeVar);

    public final void kattegat(RecyclerView.stratoscope stratoscopeVar) {
        privatdozent(stratoscopeVar);
        impromptu(stratoscopeVar);
    }

    public final void oilcan(RecyclerView.stratoscope stratoscopeVar, boolean z) {
        seminary(stratoscopeVar, z);
    }

    public abstract boolean preprohormone(RecyclerView.stratoscope stratoscopeVar, int i, int i2, int i3, int i4);

    public abstract boolean rotuma(RecyclerView.stratoscope stratoscopeVar, RecyclerView.stratoscope stratoscopeVar2, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public boolean saneness(RecyclerView.stratoscope stratoscopeVar, RecyclerView.stratoscope stratoscopeVar2, RecyclerView.formularize.dern dernVar, RecyclerView.formularize.dern dernVar2) {
        int i;
        int i2;
        int i3 = dernVar.f13254attabal;
        int i4 = dernVar.f13256saneness;
        if (stratoscopeVar2.shouldIgnore()) {
            int i5 = dernVar.f13254attabal;
            i2 = dernVar.f13256saneness;
            i = i5;
        } else {
            i = dernVar2.f13254attabal;
            i2 = dernVar2.f13256saneness;
        }
        return rotuma(stratoscopeVar, stratoscopeVar2, i3, i4, i, i2);
    }

    public final void sealless(RecyclerView.stratoscope stratoscopeVar) {
        saran(stratoscopeVar);
    }

    public final void stratoscope(RecyclerView.stratoscope stratoscopeVar) {
        merc(stratoscopeVar);
    }

    public final void supplicat(RecyclerView.stratoscope stratoscopeVar) {
        creditor(stratoscopeVar);
    }

    public final void trm(RecyclerView.stratoscope stratoscopeVar, boolean z) {
        polder(stratoscopeVar, z);
        impromptu(stratoscopeVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public boolean wireman(RecyclerView.stratoscope stratoscopeVar, RecyclerView.formularize.dern dernVar, RecyclerView.formularize.dern dernVar2) {
        int i = dernVar.f13254attabal;
        int i2 = dernVar2.f13254attabal;
        if (i != i2 || dernVar.f13256saneness != dernVar2.f13256saneness) {
            return preprohormone(stratoscopeVar, i, dernVar.f13256saneness, i2, dernVar2.f13256saneness);
        }
        yemenite(stratoscopeVar);
        return false;
    }

    public final void yemenite(RecyclerView.stratoscope stratoscopeVar) {
        grimness(stratoscopeVar);
        impromptu(stratoscopeVar);
    }

    public void creditor(RecyclerView.stratoscope stratoscopeVar) {
    }

    public void grimness(RecyclerView.stratoscope stratoscopeVar) {
    }

    public void merc(RecyclerView.stratoscope stratoscopeVar) {
    }

    public void privatdozent(RecyclerView.stratoscope stratoscopeVar) {
    }

    public void restrictive(RecyclerView.stratoscope stratoscopeVar) {
    }

    public void saran(RecyclerView.stratoscope stratoscopeVar) {
    }

    public void polder(RecyclerView.stratoscope stratoscopeVar, boolean z) {
    }

    public void seminary(RecyclerView.stratoscope stratoscopeVar, boolean z) {
    }
}
