package fn;

import com.google.android.gms.internal.ads.fs1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends gn.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f41036a = new AtomicReference(null);

    @Override // gn.c
    public final boolean a(fs1 fs1Var) {
        AtomicReference atomicReference = this.f41036a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(g.f41071b);
        return true;
    }

    @Override // gn.c
    public final ak.f[] b(fs1 fs1Var) {
        this.f41036a.set(null);
        return gn.b.f41981a;
    }
}
