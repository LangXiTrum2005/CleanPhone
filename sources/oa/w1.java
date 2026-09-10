package oa;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends m1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f47340a = new w1();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f47340a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // oa.m1
    public final m1 d() {
        return l1.f47272a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
