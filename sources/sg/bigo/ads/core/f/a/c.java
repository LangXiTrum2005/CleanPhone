package sg.bigo.ads.core.f.a;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends n implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48497a;

    public c(String str, int i2) {
        super(str);
        this.f48497a = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(c cVar) {
        return this.f48497a - cVar.f48497a;
    }

    @Override // sg.bigo.ads.core.f.a.n
    public final String toString() {
        StringBuilder sb = new StringBuilder("{\"Content\":\"");
        sb.append(this.f48522b);
        sb.append("\",\"pro_ms\":\"");
        return android.support.v4.media.a.i(this.f48497a, "\"}", sb);
    }
}
