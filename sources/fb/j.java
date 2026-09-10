package fb;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f40761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f40762d;

    public j(int i10, int i11, i iVar, h hVar) {
        this.f40759a = i10;
        this.f40760b = i11;
        this.f40761c = iVar;
        this.f40762d = hVar;
    }

    public static k5.g b() {
        k5.g gVar = new k5.g();
        gVar.f44325a = null;
        gVar.f44326b = null;
        gVar.f44327c = null;
        gVar.f44328d = i.f40757e;
        return gVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f40761c != i.f40757e;
    }

    public final int c() {
        i iVar = i.f40757e;
        int i10 = this.f40760b;
        i iVar2 = this.f40761c;
        if (iVar2 == iVar) {
            return i10;
        }
        if (iVar2 == i.f40754b) {
            return i10 + 5;
        }
        if (iVar2 == i.f40755c) {
            return i10 + 5;
        }
        if (iVar2 == i.f40756d) {
            return i10 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f40759a == this.f40759a && jVar.c() == c() && jVar.f40761c == this.f40761c && jVar.f40762d == this.f40762d;
    }

    public final int hashCode() {
        return Objects.hash(j.class, Integer.valueOf(this.f40759a), Integer.valueOf(this.f40760b), this.f40761c, this.f40762d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HMAC Parameters (variant: ");
        sb2.append(this.f40761c);
        sb2.append(", hashType: ");
        sb2.append(this.f40762d);
        sb2.append(", ");
        sb2.append(this.f40760b);
        sb2.append("-byte tags, and ");
        return l1.d.i(sb2, this.f40759a, "-byte key)");
    }
}
