package fb;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f40733c;

    public d(int i10, int i11, c cVar) {
        this.f40731a = i10;
        this.f40732b = i11;
        this.f40733c = cVar;
    }

    public static g9.k b() {
        g9.k kVar = new g9.k(15);
        kVar.f41770b = null;
        kVar.f41771c = null;
        kVar.f41772d = c.f40729e;
        return kVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f40733c != c.f40729e;
    }

    public final int c() {
        c cVar = c.f40729e;
        int i10 = this.f40732b;
        c cVar2 = this.f40733c;
        if (cVar2 == cVar) {
            return i10;
        }
        if (cVar2 == c.f40726b) {
            return i10 + 5;
        }
        if (cVar2 == c.f40727c) {
            return i10 + 5;
        }
        if (cVar2 == c.f40728d) {
            return i10 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f40731a == this.f40731a && dVar.c() == c() && dVar.f40733c == this.f40733c;
    }

    public final int hashCode() {
        return Objects.hash(d.class, Integer.valueOf(this.f40731a), Integer.valueOf(this.f40732b), this.f40733c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb2.append(this.f40733c);
        sb2.append(", ");
        sb2.append(this.f40732b);
        sb2.append("-byte tags, and ");
        return l1.d.i(sb2, this.f40731a, "-byte key)");
    }
}
