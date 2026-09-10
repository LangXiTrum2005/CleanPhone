package wa;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f53070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53071b;

    public h0(int i10, h hVar) {
        this.f53070a = hVar;
        this.f53071b = i10;
    }

    public static h0 b(int i10, h hVar) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new h0(i10, hVar);
    }

    @Override // va.i
    public final boolean a() {
        return this.f53070a != h.H;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return h0Var.f53070a == this.f53070a && h0Var.f53071b == this.f53071b;
    }

    public final int hashCode() {
        return Objects.hash(h0.class, this.f53070a, Integer.valueOf(this.f53071b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("X-AES-GCM Parameters (variant: ");
        sb2.append(this.f53070a);
        sb2.append("salt_size_bytes: ");
        return l1.d.i(sb2, this.f53071b, ")");
    }
}
