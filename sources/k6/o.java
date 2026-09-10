package k6;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a7.l {
    @Override // a7.l
    public final void d(Object obj, Object obj2) {
        p pVar = (p) obj;
        pVar.getClass();
        ArrayDeque arrayDeque = p.f44367b;
        synchronized (arrayDeque) {
            arrayDeque.offer(pVar);
        }
    }
}
