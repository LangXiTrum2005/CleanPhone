package tb;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface b {
    default Object a(Class cls) {
        return g(q.a(cls));
    }

    tc.b b(q qVar);

    o c(q qVar);

    default tc.b d(Class cls) {
        return b(q.a(cls));
    }

    tc.b e(q qVar);

    default Set f(q qVar) {
        return (Set) e(qVar).get();
    }

    default Object g(q qVar) {
        tc.b bVarB = b(qVar);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }
}
