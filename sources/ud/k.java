package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f52115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f52116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f52117c;

    public k(j jVar, j jVar2, double d10) {
        this.f52115a = jVar;
        this.f52116b = jVar2;
        this.f52117c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f52115a == kVar.f52115a && this.f52116b == kVar.f52116b && Double.compare(this.f52117c, kVar.f52117c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f52117c) + ((this.f52116b.hashCode() + (this.f52115a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f52115a + ", crashlytics=" + this.f52116b + ", sessionSamplingRate=" + this.f52117c + ')';
    }
}
