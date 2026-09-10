package dh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f38896b = new g(new e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f38897a;

    public g(e eVar) {
        this.f38897a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f38897a.equals(((g) obj).f38897a);
    }

    public final int hashCode() {
        return Integer.hashCode(2) + wi.d.f(400, wi.d.f(100, (f.f38894a.hashCode() + (this.f38897a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "SimilarVideosAlgorithmSettings(extractionRule=" + this.f38897a + ", timeTolerance=" + f.f38894a + ", bigFileThresholdMB=100, maxAllowedFileMB=400, minMatchedFrameCount=2)";
    }
}
