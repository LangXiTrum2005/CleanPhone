package eb;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f40021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f40022b;

    public z(Class cls, Class cls2) {
        this.f40021a = cls;
        this.f40022b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return zVar.f40021a.equals(this.f40021a) && zVar.f40022b.equals(this.f40022b);
    }

    public final int hashCode() {
        return Objects.hash(this.f40021a, this.f40022b);
    }

    public final String toString() {
        return this.f40021a.getSimpleName() + " with primitive type: " + this.f40022b.getSimpleName();
    }
}
