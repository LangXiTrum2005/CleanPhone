package xn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f54069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f54070b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f54072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f54073e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f54075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f54076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w f54077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f54078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f54079k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public bo.e f54080m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54071c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h2.d f54074f = new h2.d(4, false);

    public static void b(String str, w wVar) {
        if (wVar != null) {
            if (wVar.f54087g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (wVar.f54088h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (wVar.f54089i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (wVar.f54090j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final w a() {
        int i10 = this.f54071c;
        if (i10 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f54071c).toString());
        }
        s sVar = this.f54069a;
        if (sVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f54070b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f54072d;
        if (str != null) {
            return new w(sVar, rVar, str, i10, this.f54073e, this.f54074f.i(), this.f54075g, this.f54076h, this.f54077i, this.f54078j, this.f54079k, this.l, this.f54080m);
        }
        throw new IllegalStateException("message == null");
    }
}
