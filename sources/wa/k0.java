package wa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f53093a;

    public k0(h hVar) {
        this.f53093a = hVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f53093a != h.K;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f53093a == this.f53093a;
    }

    public final int hashCode() {
        return Objects.hash(k0.class, this.f53093a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f53093a + ")";
    }
}
