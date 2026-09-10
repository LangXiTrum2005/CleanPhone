package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m91 extends xa1 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        m91 m91Var = a90.f11940a;
        Integer numValueOf = Integer.valueOf(((l80) obj).f16811p);
        m91 m91Var2 = a90.f11940a;
        return numValueOf.compareTo(Integer.valueOf(((l80) obj2).f16811p));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m91)) {
            return false;
        }
        Object obj2 = i6.f15608h;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = wa1.f21478b;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return Objects.hash(i6.f15608h, wa1.f21478b);
    }

    public final String toString() {
        String string = i6.f15608h.toString();
        return q4.a.j(new StringBuilder(string.length() + 31), "Ordering.natural().onResultOf(", string, ")");
    }
}
