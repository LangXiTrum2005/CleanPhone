package f8;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40700b;

    public e(String str, boolean z10) {
        this.f40699a = str;
        this.f40700b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return n.a(this.f40699a, eVar.f40699a) && this.f40700b == eVar.f40700b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40700b) + (this.f40699a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderByCond(key=" + this.f40699a + ", asc=" + this.f40700b + ")";
    }
}
