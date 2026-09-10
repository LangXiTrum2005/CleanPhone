package eb;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f40002b = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f40003a = new AtomicReference(new a0(new d0(13)));

    public final Object a(qk.i0 i0Var, Class cls) {
        return ((a0) this.f40003a.get()).a(i0Var, cls);
    }

    public final synchronized void b(x xVar) {
        d0 d0Var = new d0((a0) this.f40003a.get());
        d0Var.Y0(xVar);
        this.f40003a.set(new a0(d0Var));
    }

    public final synchronized void c(b0 b0Var) {
        d0 d0Var = new d0((a0) this.f40003a.get());
        HashMap map = (HashMap) d0Var.f39977c;
        Class clsC = b0Var.c();
        if (map.containsKey(clsC)) {
            b0 b0Var2 = (b0) map.get(clsC);
            if (!b0Var2.equals(b0Var) || !b0Var.equals(b0Var2)) {
                throw new GeneralSecurityException(defpackage.e.l(clsC, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
            }
        } else {
            map.put(clsC, b0Var);
        }
        this.f40003a.set(new a0(d0Var));
    }
}
