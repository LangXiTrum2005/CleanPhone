package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f52066d;

    public e0(String str, int i10, int i11, boolean z10) {
        this.f52063a = str;
        this.f52064b = i10;
        this.f52065c = i11;
        this.f52066d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.n.a(this.f52063a, e0Var.f52063a) && this.f52064b == e0Var.f52064b && this.f52065c == e0Var.f52065c && this.f52066d == e0Var.f52066d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52066d) + wi.d.f(this.f52065c, wi.d.f(this.f52064b, this.f52063a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f52063a);
        sb2.append(", pid=");
        sb2.append(this.f52064b);
        sb2.append(", importance=");
        sb2.append(this.f52065c);
        sb2.append(", isDefaultProcess=");
        return defpackage.e.t(sb2, this.f52066d, ')');
    }
}
