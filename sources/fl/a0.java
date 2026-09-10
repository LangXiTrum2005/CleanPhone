package fl;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 implements pl.d {
    @Override // pl.b
    public d a(yl.c fqName) {
        Object next;
        kotlin.jvm.internal.n.f(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (c.a(d0.c.p(d0.c.l(((d) next).f40988a))).b().equals(fqName)) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof a0) && kotlin.jvm.internal.n.a(b(), ((a0) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
