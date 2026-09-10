package rn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f49708e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn.d f49709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tn.e f49710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f49711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f49712d;

    public d(pn.d descriptor, tn.e eVar) {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        this.f49709a = descriptor;
        this.f49710b = eVar;
        int iD = descriptor.d();
        if (iD <= 64) {
            this.f49711c = iD != 64 ? (-1) << iD : 0L;
            this.f49712d = f49708e;
            return;
        }
        this.f49711c = 0L;
        int i10 = (iD - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((iD & 63) != 0) {
            jArr[i10 - 1] = (-1) << iD;
        }
        this.f49712d = jArr;
    }
}
