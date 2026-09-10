package com.smartdigimkt.m3;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f36578A = 27;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f36579B = 28;
    public static final int C = 29;
    public static final int D = 30;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f36580E = 31;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f36581F = 32;
    public static final int G = 33;
    public static final int H = 34;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f36582I = 35;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f36583J = 36;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36584a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36585b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36586c = 3;
    public static final int d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36587e = 5;
    public static final int f = 6;
    public static final int g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f36588h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f36589i = 9;
    public static final int j = 10;
    public static final int k = 11;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f36590l = 12;
    public static final int m = 13;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f36591n = 14;
    public static final int o = 15;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f36592p = 16;
    public static final int q = 17;
    public static final int r = 18;
    public static final int s = 19;
    public static final int t = 20;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f36593u = 21;
    public static final int v = 22;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f36594w = 23;
    public static final int x = 24;
    public static final int y = 25;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f36595z = 26;

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.w6.f X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ Context f36596Y;

        public a(com.smartdigimkt.w6.f fVar, Context context) {
            this.X = fVar;
            this.f36596Y = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X instanceof com.smartdigimkt.w6.l) {
                l.a(this.f36596Y).a();
                l.a(this.f36596Y).a(this.X.L(), this.X);
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.f f36597Y;
        final /* synthetic */ com.smartdigimkt.v3.l Z;

        public b(int i2, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v3.l lVar) {
            this.X = i2;
            this.f36597Y = fVar;
            this.Z = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().getName();
            com.smartdigimkt.w6.f fVar = this.f36597Y;
            if (fVar instanceof com.smartdigimkt.z6.a) {
                com.smartdigimkt.z6.a aVar = (com.smartdigimkt.z6.a) fVar;
                boolean zA = fVar.i() != null ? f.a(this.X, this.f36597Y.i()) : false;
                if (this.X == 8) {
                    String strH0 = aVar.H0();
                    if (!TextUtils.isEmpty(strH0)) {
                        new com.smartdigimkt.b8.j(strH0, this.Z.f39133b, zA).a(0, (com.smartdigimkt.w7.c) null);
                    }
                }
                com.smartdigimkt.b8.i iVar = new com.smartdigimkt.b8.i(this.X, aVar, this.Z.f39133b);
                if (!TextUtils.isEmpty(iVar.k())) {
                    iVar.a(this.Z.d);
                    iVar.a(0, (com.smartdigimkt.w7.c) null);
                }
            } else {
                com.smartdigimkt.q3.e.a(this.X, (com.smartdigimkt.w6.l) fVar, this.Z);
            }
            if (this.X == 21) {
                f.a(this.f36597Y);
            }
        }
    }

    public static boolean a(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v3.g gVar, String str, com.smartdigimkt.c7.b bVar) {
        try {
            com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
            String str2 = (gVar == null || TextUtils.isEmpty(gVar.f39093c)) ? "" : gVar.f39093c;
            if (cVarB != null && cVarB.a()) {
                Context applicationContext = context.getApplicationContext();
                cVarB.handleOfferClick(applicationContext, aVar, fVar, str, str2, new a(fVar, applicationContext), bVar);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean b(Context context, com.smartdigimkt.w6.f fVar) {
        if (fVar != null && !TextUtils.isEmpty(fVar.q()) && com.smartdigimkt.q3.d.a(context, fVar.q(), fVar.b(), fVar.M(), fVar.t0())) {
            return true;
        }
        if (fVar == null || TextUtils.isEmpty(fVar.X())) {
            return false;
        }
        return com.smartdigimkt.q3.d.a(context, fVar.X());
    }

    public static void a(int i2, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v3.l lVar) {
        if (fVar.w0()) {
            return;
        }
        com.smartdigimkt.l7.b.a().c(new b(i2, fVar, lVar));
    }

    public static boolean a(int i2, com.smartdigimkt.w6.g gVar) {
        if (i2 != 9 && i2 != 14) {
            if (gVar.r0() != 1) {
                return false;
            }
        } else if (gVar.H() != 1) {
            return false;
        }
        return true;
    }

    public static boolean a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.w6.g gVar) {
        return !(fVar instanceof com.smartdigimkt.w6.d) ? !((fVar instanceof com.smartdigimkt.z6.a) && ((com.smartdigimkt.z6.a) fVar).C0() == 1) : !((gVar instanceof com.smartdigimkt.w6.m) && ((com.smartdigimkt.w6.m) gVar).S1() == 1);
    }

    public static boolean a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, Segment.SIZE);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static void a(Context context, com.smartdigimkt.w6.f fVar) {
        com.smartdigimkt.s6.c cVarB;
        if (context == null || fVar == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(fVar.X()) || (cVarB = com.smartdigimkt.m6.b.p().b()) == null || !cVarB.a()) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (fVar instanceof com.smartdigimkt.w6.l) {
                l.a(applicationContext).a();
                l.a(applicationContext).a(fVar.L(), fVar);
            }
            cVarB.registerMarketReceiver(fVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(com.smartdigimkt.w6.f fVar) {
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            if (dVar.X0() == 1) {
                if (com.smartdigimkt.n8.h.b(com.smartdigimkt.m6.b.p().k().getApplicationContext(), dVar.X())) {
                    dVar.K0();
                    dVar.X();
                    com.smartdigimkt.p6.d.b().a(dVar);
                } else {
                    dVar.K0();
                    dVar.X();
                }
            }
        }
    }
}
