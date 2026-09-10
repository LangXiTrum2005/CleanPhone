package wa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f53144b;

    public z(String str, h hVar) {
        this.f53143a = str;
        this.f53144b = hVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f53144b != h.f53065x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return zVar.f53143a.equals(this.f53143a) && zVar.f53144b.equals(this.f53144b);
    }

    public final int hashCode() {
        return Objects.hash(z.class, this.f53143a, this.f53144b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f53143a + ", variant: " + this.f53144b + ")";
    }
}
