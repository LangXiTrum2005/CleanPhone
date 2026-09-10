package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6214a;

    public o1(String str) {
        this.f6214a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        return this.f6214a.equals(((o1) ((s2) obj)).f6214a);
    }

    public final int hashCode() {
        return this.f6214a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return defpackage.e.q(this.f6214a, "}", new StringBuilder("User{identifier="));
    }
}
