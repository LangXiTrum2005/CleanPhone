package mi;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f46002a;

    public h(k kVar) {
        this.f46002a = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z10) {
        int i10 = k.f46022e;
        k kVar = this.f46002a;
        if (kVar.D("onWindowFocusChanged")) {
            kVar.f46024b.t(z10);
        }
    }
}
