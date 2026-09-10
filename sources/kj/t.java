package kj;

import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f44710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f44711b;

    public t(u uVar, s sVar) {
        this.f44710a = uVar;
        this.f44711b = sVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(t.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        t tVar = (t) obj;
        return a2.g(this.f44710a, tVar.f44710a) && a2.g(this.f44711b, tVar.f44711b);
    }

    public final int hashCode() {
        return a2.i(this.f44711b) + ((a2.i(this.f44710a) + (t.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SourceSpecification(type=" + this.f44710a + ", camera=" + this.f44711b + ")";
    }
}
