package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52011b;

    public /* synthetic */ a0(int i10, int i11, String str) {
        if (3 != (i10 & 3)) {
            rn.k.a(i10, 3, y.f52186a.d());
            throw null;
        }
        this.f52010a = i11;
        this.f52011b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f52010a == a0Var.f52010a && kotlin.jvm.internal.n.a(this.f52011b, a0Var.f52011b);
    }

    public final int hashCode() {
        return this.f52011b.hashCode() + (Integer.hashCode(this.f52010a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.f52010a);
        sb2.append(", uuid=");
        return wi.d.k(sb2, this.f52011b, ')');
    }

    public a0(int i10, String uuid) {
        kotlin.jvm.internal.n.f(uuid, "uuid");
        this.f52010a = i10;
        this.f52011b = uuid;
    }
}
