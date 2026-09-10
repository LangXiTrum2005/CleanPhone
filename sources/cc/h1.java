package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6106a;

    public h1(String str) {
        this.f6106a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        return this.f6106a.equals(((h1) ((m2) obj)).f6106a);
    }

    public final int hashCode() {
        return this.f6106a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return defpackage.e.q(this.f6106a, "}", new StringBuilder("Log{content="));
    }
}
