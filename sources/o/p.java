package o;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public od.c f47010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f47011b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f47011b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        od.c cVar = this.f47010a;
        if (cVar != null) {
            m mVar = ((o) cVar.f47386b).f46997n;
            mVar.f46966h = true;
            mVar.p(true);
        }
    }
}
