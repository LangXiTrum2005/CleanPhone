package vg;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f52584b;

    public b(String key, c cVar) {
        n.f(key, "key");
        this.f52583a = key;
        this.f52584b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.a(this.f52583a, bVar.f52583a) && n.a(this.f52584b, bVar.f52584b);
    }

    public final int hashCode() {
        return this.f52584b.hashCode() + (this.f52583a.hashCode() * 31);
    }

    public final String toString() {
        return "CerebroEventProperty(key=" + this.f52583a + ", value=" + this.f52584b + ")";
    }
}
