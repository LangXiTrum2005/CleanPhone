package pj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48381a;

    public a(boolean z10) {
        this.f48381a = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(a.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return com.bumptech.glide.c.h(Boolean.valueOf(this.f48381a), Boolean.valueOf(((a) obj).f48381a));
    }

    public final int hashCode() {
        return com.bumptech.glide.c.i(Boolean.valueOf(this.f48381a)) + (a.class.hashCode() * 31);
    }

    public final String toString() {
        return "BrowserOptions(showTitle=" + this.f48381a + ")";
    }
}
