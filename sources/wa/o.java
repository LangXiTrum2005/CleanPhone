package wa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f53110d;

    public o(int i10, int i11, int i12, h hVar) {
        this.f53107a = i10;
        this.f53108b = i11;
        this.f53109c = i12;
        this.f53110d = hVar;
    }

    public static k5.g b() {
        k5.g gVar = new k5.g();
        gVar.f44325a = null;
        gVar.f44326b = null;
        gVar.f44327c = null;
        gVar.f44328d = h.f53057p;
        return gVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f53110d != h.f53057p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f53107a == this.f53107a && oVar.f53108b == this.f53108b && oVar.f53109c == this.f53109c && oVar.f53110d == this.f53110d;
    }

    public final int hashCode() {
        return Objects.hash(o.class, Integer.valueOf(this.f53107a), Integer.valueOf(this.f53108b), Integer.valueOf(this.f53109c), this.f53110d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcm Parameters (variant: ");
        sb2.append(this.f53110d);
        sb2.append(", ");
        sb2.append(this.f53108b);
        sb2.append("-byte IV, ");
        sb2.append(this.f53109c);
        sb2.append("-byte tag, and ");
        return l1.d.i(sb2, this.f53107a, "-byte key)");
    }
}
