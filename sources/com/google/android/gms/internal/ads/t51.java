package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t51 implements d81 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ t51 f20190b = new t51(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t51 f20191c = new t51(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t51 f20192d = new t51(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t51 f20193e = new t51(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ t51 f20194f = new t51(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t51 f20195g = new t51(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20196a;

    public /* synthetic */ t51(int i10) {
        this.f20196a = i10;
    }

    @Override // com.google.android.gms.internal.ads.d81
    public final Object apply(Object obj) {
        switch (this.f20196a) {
            case 0:
                return null;
            case 1:
                return y51.a(5);
            case 2:
                i32 i32Var = (i32) obj;
                int i10 = g22.Q;
                String str = i32Var.f15557a;
                String str2 = i32Var.f15558b;
                return q4.a.j(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 3:
                m2 m2Var = (m2) obj;
                m2Var.getClass();
                return m2Var.getClass().getSimpleName();
            case 4:
                return ca1.y(v71.w(((q32) obj).zzn().f21029b, f20195g));
            default:
                v42 v42Var = v42.f21027d;
                return Integer.valueOf(((ni) obj).f17831c);
        }
    }
}
