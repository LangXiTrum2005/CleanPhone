package t5;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f50507b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return n.a(this.f50506a, eVar.f50506a) && n.a(this.f50507b, eVar.f50507b);
    }

    public final int hashCode() {
        return this.f50507b.hashCode() + (this.f50506a.hashCode() * 31);
    }

    public final String toString() {
        return l1.d.h("Group(id=", this.f50506a, ", name=", this.f50507b, ")");
    }
}
