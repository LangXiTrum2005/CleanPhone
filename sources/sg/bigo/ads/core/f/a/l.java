package sg.bigo.ads.core.f.a;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends n implements Comparable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f48519a;

    public l(String str, float f) {
        super(str);
        this.f48519a = f;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(l lVar) {
        return Double.compare(this.f48519a, lVar.f48519a);
    }

    @Override // sg.bigo.ads.core.f.a.n
    public final String toString() {
        return "{\"Content\":\"" + this.f48522b + "\",\"progress\":\"" + this.f48519a + "\"}";
    }
}
