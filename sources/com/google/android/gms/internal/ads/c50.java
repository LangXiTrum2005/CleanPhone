package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a50 f13043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nt0 f13044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ct0 f13045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bc0 f13046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w90 f13047f;

    public /* synthetic */ c50(a50 a50Var, int i10) {
        this.f13042a = i10;
        this.f13043b = a50Var;
    }

    public d50 a() {
        ic1.j(this.f13046e, bc0.class);
        ic1.j(this.f13047f, w90.class);
        return new d50(this.f13043b, new tc0(9), this.f13046e, this.f13047f, new so0(29), this.f13044c, this.f13045d);
    }

    public m50 b() {
        ic1.j(this.f13046e, bc0.class);
        ic1.j(this.f13047f, w90.class);
        return new m50(this.f13043b, new tc0(9), this.f13046e, this.f13047f, new so0(29), this.f13044c, this.f13045d);
    }

    public final /* bridge */ Object c() {
        switch (this.f13042a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
