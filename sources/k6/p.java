package k6;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f44367b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f44368a;

    static {
        char[] cArr = a7.p.f3444a;
        f44367b = new ArrayDeque(0);
    }

    public static p a(Object obj) {
        p pVar;
        ArrayDeque arrayDeque = f44367b;
        synchronized (arrayDeque) {
            pVar = (p) arrayDeque.poll();
        }
        if (pVar == null) {
            pVar = new p();
        }
        pVar.f44368a = obj;
        return pVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && this.f44368a.equals(((p) obj).f44368a);
    }

    public final int hashCode() {
        return this.f44368a.hashCode();
    }
}
