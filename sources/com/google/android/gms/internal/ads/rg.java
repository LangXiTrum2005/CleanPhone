package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rg extends yg {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19584h;

    public rg(fg fgVar, xd xdVar, long j10, int i10) {
        super(fgVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", xdVar, i10, 25);
        this.f19584h = j10;
    }

    @Override // com.google.android.gms.internal.ads.yg
    public final void a() {
        long jLongValue = ((Long) this.f22235e.invoke(null, null)).longValue();
        xd xdVar = this.f22234d;
        synchronized (xdVar) {
            xdVar.b();
            ((je) xdVar.f19193b).m0(jLongValue);
            long j10 = this.f19584h;
            if (j10 != 0) {
                xdVar.b();
                ((je) xdVar.f19193b).M0(jLongValue - j10);
                xdVar.b();
                ((je) xdVar.f19193b).P0(j10);
            }
        }
    }
}
