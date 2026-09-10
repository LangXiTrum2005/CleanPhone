package dm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.b f38951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38952b;

    public f(yl.b bVar, int i10) {
        this.f38951a = bVar;
        this.f38952b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.n.a(this.f38951a, fVar.f38951a) && this.f38952b == fVar.f38952b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38952b) + (this.f38951a.hashCode() * 31);
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            i10 = this.f38952b;
            if (i11 >= i10) {
                break;
            }
            sb2.append("kotlin/Array<");
            i11++;
        }
        sb2.append(this.f38951a);
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
