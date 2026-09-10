package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vg extends yg {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21166h;

    public vg(fg fgVar, xd xdVar, int i10) {
        super(fgVar, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", xdVar, i10, 61);
        this.f21166h = fgVar.f14400o.f12027a;
    }

    @Override // com.google.android.gms.internal.ads.yg
    public final void a() {
        long jLongValue = ((Long) this.f22235e.invoke(null, this.f22231a.f14387a, Boolean.valueOf(this.f21166h))).longValue();
        xd xdVar = this.f22234d;
        synchronized (xdVar) {
            xdVar.b();
            ((je) xdVar.f19193b).a0(jLongValue);
        }
    }
}
