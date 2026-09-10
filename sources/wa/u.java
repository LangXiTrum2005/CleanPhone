package wa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f53128a;

    public u(h hVar) {
        this.f53128a = hVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f53128a != h.f53063v;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && ((u) obj).f53128a == this.f53128a;
    }

    public final int hashCode() {
        return Objects.hash(u.class, this.f53128a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f53128a + ")";
    }
}
