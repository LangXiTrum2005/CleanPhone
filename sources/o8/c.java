package o8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47210a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f47210a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f47210a.equals(((c) obj).f47210a);
    }

    public final int hashCode() {
        return this.f47210a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return defpackage.e.q(this.f47210a, "\"}", new StringBuilder("Encoding{name=\""));
    }
}
