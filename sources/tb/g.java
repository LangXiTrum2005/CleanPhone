package tb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f50693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50694b;

    public g(q qVar, boolean z10) {
        this.f50693a = qVar;
        this.f50694b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f50693a.equals(this.f50693a) && gVar.f50694b == this.f50694b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f50694b).hashCode() ^ ((this.f50693a.hashCode() ^ 1000003) * 1000003);
    }
}
