package w1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f52818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1.m f52822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f52823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f52824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f52825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f52826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f52827k;

    public k(String str, j jVar, long j10, int i10, long j11, i1.m mVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f52817a = str;
        this.f52818b = jVar;
        this.f52819c = j10;
        this.f52820d = i10;
        this.f52821e = j11;
        this.f52822f = mVar;
        this.f52823g = str2;
        this.f52824h = str3;
        this.f52825i = j12;
        this.f52826j = j13;
        this.f52827k = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j10 = this.f52821e;
        if (j10 > jLongValue) {
            return 1;
        }
        return j10 < l.longValue() ? -1 : 0;
    }
}
