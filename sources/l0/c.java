package l0;

import b2.w;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44768d;

    public c(int i10) {
        super(i10, 16);
        this.f44768d = new Object();
    }

    @Override // b2.w, l0.b
    public final boolean e(Object instance) {
        boolean zE;
        n.f(instance, "instance");
        synchronized (this.f44768d) {
            zE = super.e(instance);
        }
        return zE;
    }

    @Override // b2.w, l0.b
    public final Object g() {
        Object objG;
        synchronized (this.f44768d) {
            objG = super.g();
        }
        return objG;
    }
}
