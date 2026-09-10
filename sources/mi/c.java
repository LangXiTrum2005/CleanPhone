package mi;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f45977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f45978b;

    public c(e eVar, s sVar) {
        this.f45978b = eVar;
        this.f45977a = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        e eVar = this.f45978b;
        if (eVar.f45990h && eVar.f45988f != null) {
            this.f45977a.getViewTreeObserver().removeOnPreDrawListener(this);
            eVar.f45988f = null;
        }
        return eVar.f45990h;
    }
}
