package k6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44358a;

    public k(String str) {
        this.f44358a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f44358a.equals(((k) obj).f44358a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44358a.hashCode();
    }

    public final String toString() {
        return defpackage.e.q(this.f44358a, "'}", new StringBuilder("StringHeaderFactory{value='"));
    }
}
