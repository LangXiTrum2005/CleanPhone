package z;

import com.google.android.gms.internal.play_billing.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f54590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f54591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f54592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f54593d;

    public final void a(Object obj) {
        this.f54593d = true;
        l lVar = this.f54591b;
        if (lVar == null || !lVar.f54596b.i(obj)) {
            return;
        }
        this.f54590a = null;
        this.f54591b = null;
        this.f54592c = null;
    }

    public final void b(Throwable th2) {
        this.f54593d = true;
        l lVar = this.f54591b;
        if (lVar == null || !lVar.f54596b.j(th2)) {
            return;
        }
        this.f54590a = null;
        this.f54591b = null;
        this.f54592c = null;
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f54591b;
        if (lVar != null) {
            k kVar = lVar.f54596b;
            if (!kVar.isDone()) {
                kVar.j(new n1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f54590a, 5));
            }
        }
        if (this.f54593d || (mVar = this.f54592c) == null) {
            return;
        }
        mVar.i(null);
    }
}
