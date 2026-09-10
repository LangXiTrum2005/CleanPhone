package kb;

import j2.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f44572b = new i(new n(5));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f44573c = new i(new n(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f44574a;

    static {
        new i(new n(8));
        new i(new jj.d(7));
        new i(new jj.d(5));
        int i10 = 6;
        new i(new jj.d(i10));
        new i(new n(i10));
    }

    public i(j jVar) {
        if (ab.a.a()) {
            this.f44574a = new n5.f(jVar, 23);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f44574a = new od.c(jVar, 17);
        } else {
            this.f44574a = new s4.i(jVar);
        }
    }
}
