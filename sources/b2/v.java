package b2;

import f2.b1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f5403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2.m f5404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f5405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f5408f;

    public v(x xVar, c0 c0Var, int i10, d dVar) {
        this.f5408f = xVar;
        this.f5404b = new j2.m(l1.d.e(i10, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        b1 b1Var = new b1(xVar.f5412a, null, null);
        this.f5405c = b1Var;
        this.f5403a = new u(xVar, c0Var, i10, b1Var, dVar);
        b1Var.f40284f = xVar.f5414c;
    }

    public final void a() {
        if (this.f5406d) {
            return;
        }
        this.f5403a.f5400b.f5261j = true;
        this.f5406d = true;
        x.b(this.f5408f);
    }
}
