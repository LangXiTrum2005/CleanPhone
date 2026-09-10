package wa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f53076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f53077f;

    public i(int i10, int i11, int i12, int i13, h hVar, h hVar2) {
        this.f53072a = i10;
        this.f53073b = i11;
        this.f53074c = i12;
        this.f53075d = i13;
        this.f53076e = hVar;
        this.f53077f = hVar2;
    }

    public static com.google.android.gms.internal.consent_sdk.x b() {
        com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x();
        xVar.f23260a = null;
        xVar.f23261b = null;
        xVar.f23262c = null;
        xVar.f23263d = null;
        xVar.f23264e = null;
        xVar.f23265f = h.f53052j;
        return xVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f53076e != h.f53052j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f53072a == this.f53072a && iVar.f53073b == this.f53073b && iVar.f53074c == this.f53074c && iVar.f53075d == this.f53075d && iVar.f53076e == this.f53076e && iVar.f53077f == this.f53077f;
    }

    public final int hashCode() {
        return Objects.hash(i.class, Integer.valueOf(this.f53072a), Integer.valueOf(this.f53073b), Integer.valueOf(this.f53074c), Integer.valueOf(this.f53075d), this.f53076e, this.f53077f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb2.append(this.f53076e);
        sb2.append(", hashType: ");
        sb2.append(this.f53077f);
        sb2.append(", ");
        sb2.append(this.f53074c);
        sb2.append("-byte IV, and ");
        sb2.append(this.f53075d);
        sb2.append("-byte tags, and ");
        sb2.append(this.f53072a);
        sb2.append("-byte AES key, and ");
        return l1.d.i(sb2, this.f53073b, "-byte HMAC key)");
    }
}
