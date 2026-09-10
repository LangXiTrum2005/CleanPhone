package p;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f47654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f47655b;

    public h(j jVar, f fVar) {
        this.f47655b = jVar;
        this.f47654a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.k kVar;
        j jVar = this.f47655b;
        o.m mVar = jVar.f47672c;
        if (mVar != null && (kVar = mVar.f46963e) != null) {
            kVar.q(mVar);
        }
        View view = (View) jVar.f47677h;
        if (view != null && view.getWindowToken() != null) {
            f fVar = this.f47654a;
            if (fVar.b()) {
                jVar.f47687s = fVar;
            } else if (fVar.f47025e != null) {
                fVar.d(0, 0, false, false);
                jVar.f47687s = fVar;
            }
        }
        jVar.f47689u = null;
    }
}
