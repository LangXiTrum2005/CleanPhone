package s5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50154b;

    public g(int i10, String str) {
        this.f50153a = i10;
        this.f50154b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f50153a == gVar.f50153a && this.f50154b.equals(gVar.f50154b);
    }

    public final int hashCode() {
        return this.f50154b.hashCode() + (Integer.hashCode(this.f50153a) * 31);
    }

    public final String toString() {
        return "WebsiteLabelPair(label=" + this.f50153a + ", customLabel=" + this.f50154b + ")";
    }
}
