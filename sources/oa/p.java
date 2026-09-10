package oa;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends m1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final na.e f47288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f47289b;

    public p(na.e eVar, m1 m1Var) {
        this.f47288a = eVar;
        this.f47289b = m1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        na.e eVar = this.f47288a;
        return this.f47289b.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f47288a.equals(pVar.f47288a) && this.f47289b.equals(pVar.f47289b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47288a, this.f47289b});
    }

    public final String toString() {
        return this.f47289b + ".onResultOf(" + this.f47288a + ")";
    }
}
