package wa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f53097d;

    public l(int i10, int i11, int i12, h hVar) {
        this.f53094a = i10;
        this.f53095b = i11;
        this.f53096c = i12;
        this.f53097d = hVar;
    }

    public static zc.u b() {
        zc.u uVar = new zc.u(19);
        uVar.f54879b = null;
        uVar.f54880c = null;
        uVar.f54881d = null;
        uVar.f54882e = h.f53054m;
        return uVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f53097d != h.f53054m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f53094a == this.f53094a && lVar.f53095b == this.f53095b && lVar.f53096c == this.f53096c && lVar.f53097d == this.f53097d;
    }

    public final int hashCode() {
        return Objects.hash(l.class, Integer.valueOf(this.f53094a), Integer.valueOf(this.f53095b), Integer.valueOf(this.f53096c), this.f53097d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesEax Parameters (variant: ");
        sb2.append(this.f53097d);
        sb2.append(", ");
        sb2.append(this.f53095b);
        sb2.append("-byte IV, ");
        sb2.append(this.f53096c);
        sb2.append("-byte tag, and ");
        return l1.d.i(sb2, this.f53094a, "-byte key)");
    }
}
