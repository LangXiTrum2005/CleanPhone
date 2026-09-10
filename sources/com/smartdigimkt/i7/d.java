package com.smartdigimkt.i7;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.smartdigimkt.n8.r;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.SDMAdxSetting;
import com.smartdigimkt.sdk.api.format.SDMLossInfo;
import com.smartdigimkt.sdk.api.format.SDMWinInfo;
import com.smartdigimkt.w6.k;
import com.smartdigimkt.w6.l;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35862a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35863b = "3000008";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35864c = 0;
    public static final int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f35865e = "";
    public static final int f = 1;
    public static final int g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f35866h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f35867i = 4;
    public static final int j = 5;
    public static final int k = 0;

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.a7.c X;

        public a(com.smartdigimkt.a7.c cVar) {
            this.X = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB;
            try {
                if (TextUtils.isEmpty(this.X.d)) {
                    this.X.d = com.smartdigimkt.m6.b.p().q();
                }
                if (!TextUtils.isEmpty(this.X.f33767c)) {
                    this.X.f33768e = com.smartdigimkt.m6.b.p().d(this.X.f33767c);
                    d.b(this.X);
                    if (SDMAdxSetting.getInstance().isAdxNetworkMode(this.X.f33767c)) {
                        this.X.f33763V = 1;
                    }
                }
                this.X.f33769h = String.valueOf(System.currentTimeMillis());
                com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
                if (aVarB == null) {
                    zB = false;
                } else {
                    if (d.c(aVarB, this.X)) {
                        return;
                    }
                    if (d.d(aVarB, this.X)) {
                        f.a(com.smartdigimkt.m6.b.p().k()).a(this.X, true);
                        return;
                    }
                    zB = d.b(this.X, aVarB);
                }
                e.a().a(this.X, zB);
            } catch (Throwable unused) {
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f35868Y;
        final /* synthetic */ Context Z;

        public b(String str, String str2, Context context) {
            this.X = str;
            this.f35868Y = str2;
            this.Z = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent();
            intent.setAction(this.X + "_log_agent");
            intent.putExtra(android.support.v4.media.a.r(new StringBuilder(), this.X, "_log_agent_data"), this.f35868Y);
            intent.addFlags(8);
            com.smartdigimkt.s6.b.a(this.Z).a(intent);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f35869Y;
        final /* synthetic */ com.smartdigimkt.v6.a Z;
        final /* synthetic */ String e0;
        final /* synthetic */ int f0;
        final /* synthetic */ int g0;
        final /* synthetic */ String h0;
        final /* synthetic */ String i0;
        final /* synthetic */ boolean j0;
        final /* synthetic */ String k0;
        final /* synthetic */ long l0;

        public c(String str, String str2, com.smartdigimkt.v6.a aVar, String str3, int i2, int i3, String str4, String str5, boolean z2, String str6, long j) {
            this.X = str;
            this.f35869Y = str2;
            this.Z = aVar;
            this.e0 = str3;
            this.f0 = i2;
            this.g0 = i3;
            this.h0 = str4;
            this.i0 = str5;
            this.j0 = z2;
            this.k0 = str6;
            this.l0 = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zIsScreenOn;
            String str;
            String str2;
            com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(this.X, this.f35869Y);
            cVar.f33765a = "1004687";
            com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
            if (aVarB == null || !d.c(aVarB, cVar)) {
                cVar.a(this.Z);
                cVar.f33772n = this.e0;
                cVar.o = String.valueOf(this.f0);
                cVar.f33773p = String.valueOf(this.g0);
                try {
                    zIsScreenOn = ((PowerManager) com.smartdigimkt.m6.b.p().k().getSystemService("power")).isScreenOn();
                } catch (Throwable unused) {
                    zIsScreenOn = true;
                }
                boolean zInKeyguardRestrictedInputMode = false;
                try {
                    KeyguardManager keyguardManager = (KeyguardManager) com.smartdigimkt.m6.b.p().k().getSystemService("keyguard");
                    if (keyguardManager != null) {
                        zInKeyguardRestrictedInputMode = keyguardManager.inKeyguardRestrictedInputMode();
                    }
                } catch (Throwable unused2) {
                }
                if (!zInKeyguardRestrictedInputMode && zIsScreenOn) {
                    str = "0";
                } else if (zInKeyguardRestrictedInputMode || zIsScreenOn) {
                    str = (zInKeyguardRestrictedInputMode && zIsScreenOn) ? "2" : "3";
                } else {
                    str = "1";
                }
                cVar.q = str;
                try {
                    str2 = com.smartdigimkt.n8.h.h(com.smartdigimkt.m6.b.p().k()) ? "1" : "0";
                } catch (Throwable unused3) {
                }
                cVar.r = str2;
                cVar.s = this.h0;
                cVar.t = this.i0;
                cVar.f33774u = this.j0 ? "1" : "2";
                if (TextUtils.isEmpty(d.f35865e)) {
                    try {
                        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                        long blockSize = statFs.getBlockSize();
                        String unused4 = d.f35865e = ((statFs.getAvailableBlocks() * blockSize) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + "MB";
                        cVar.v = d.f35865e;
                    } catch (Throwable unused5) {
                    }
                } else {
                    cVar.v = d.f35865e;
                }
                cVar.f33775w = this.k0;
                cVar.x = String.valueOf(this.l0);
                d.c(cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(com.smartdigimkt.l8.a aVar, com.smartdigimkt.a7.c cVar) {
        if (com.smartdigimkt.m6.b.p().C()) {
            return true;
        }
        String strF = aVar.F();
        if (!TextUtils.isEmpty(strF)) {
            String str = cVar.O;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(strF);
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        if (TextUtils.equals(str, jSONArray.optString(i2))) {
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        Map<String, String> mapG = aVar.G();
        if (mapG == null) {
            return false;
        }
        if (TextUtils.isEmpty(cVar.f33758N)) {
            return mapG.containsKey(cVar.f33765a);
        }
        if (mapG.containsKey(cVar.f33765a)) {
            String str2 = mapG.get(cVar.f33765a);
            if (!TextUtils.isEmpty(str2) && str2.contains(cVar.f33758N)) {
                return true;
            }
        }
        return false;
    }

    private static void d(com.smartdigimkt.a7.c cVar) {
        Context contextA;
        if (TextUtils.isEmpty("")) {
            return;
        }
        String strA = r.a("");
        if (cVar == null || (contextA = com.smartdigimkt.m7.a.b().a()) == null) {
            return;
        }
        String str = cVar.f33765a;
        str.getClass();
        if (str.equals("3000012")) {
            cVar.f33774u = "1";
            com.smartdigimkt.l7.b.a().e(new b(strA, cVar.a().toString(), contextA));
        }
    }

    public static void b(com.smartdigimkt.a7.c cVar) {
        com.smartdigimkt.l8.e eVarA = com.smartdigimkt.k8.c.a().a(cVar.f33767c);
        if (eVarA != null) {
            cVar.f33761R = eVarA.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[RETURN] */
    public static boolean b(com.smartdigimkt.a7.c cVar, com.smartdigimkt.l8.a aVar) {
        Map<String, String> mapA;
        if (f35863b.equals(cVar.f33765a)) {
            return true;
        }
        if (!TextUtils.isEmpty(cVar.f33765a) && !TextUtils.isEmpty(cVar.O) && !TextUtils.isEmpty(cVar.f33758N) && (mapA = aVar.a(cVar.f33765a)) != null) {
            if (mapA.containsKey("0")) {
                String str = mapA.get("0");
                if (!TextUtils.isEmpty(str) && str.contains(cVar.f33758N)) {
                    return true;
                }
            } else if (mapA.containsKey(cVar.O)) {
                String str2 = mapA.get(cVar.O);
                if (!TextUtils.isEmpty(str2) && str2.contains(cVar.f33758N)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void a(Runnable runnable) {
        com.smartdigimkt.l7.b.a().b(runnable, 13);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004616";
        cVar.f33767c = str5;
        cVar.f33772n = str;
        cVar.o = str2;
        cVar.f33773p = str3;
        cVar.q = str4;
        cVar.r = str6;
        cVar.s = str7;
        cVar.t = String.valueOf(com.smartdigimkt.n8.h.h(com.smartdigimkt.m6.b.p().k()) ? 1 : 0);
        cVar.f33774u = String.valueOf(com.smartdigimkt.k8.a.e().b().T());
        c(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(com.smartdigimkt.l8.a aVar, com.smartdigimkt.a7.c cVar) {
        Map<String, String> mapH = aVar.H();
        if (mapH == null) {
            return false;
        }
        if (TextUtils.isEmpty(cVar.f33758N)) {
            return mapH.containsKey(cVar.f33765a);
        }
        if (!mapH.containsKey(cVar.f33765a)) {
            return false;
        }
        String str = mapH.get(cVar.f33765a);
        return !TextUtils.isEmpty(str) && str.contains(cVar.f33758N);
    }

    public static void b(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.smartdigimkt.a7.c cVarA = com.smartdigimkt.a7.c.a(str);
        cVarA.a(aVar);
        c(cVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.smartdigimkt.a7.c cVar) {
        if (cVar == null) {
            return;
        }
        if (com.smartdigimkt.m6.b.p().k() != null && com.smartdigimkt.m6.b.p().E()) {
            com.smartdigimkt.l7.b.a().b((Runnable) new a(cVar), 8);
        } else if (com.smartdigimkt.n8.c.R()) {
            d(cVar);
        }
    }

    public static void b(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2) {
        if (fVar == null || aVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004749";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.o = ((com.smartdigimkt.w6.d) fVar).I0();
        }
        cVar.f33773p = fVar.q();
        cVar.q = String.valueOf(i2);
        c(cVar);
    }

    public static void c(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2) {
        if (fVar == null || aVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004768";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            cVar.o = dVar.I0();
            cVar.f33773p = String.valueOf(dVar.Q0());
        }
        cVar.q = String.valueOf(i2);
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar) {
        if (fVar == null || aVar == null || !(fVar instanceof l)) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004697";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        cVar.o = fVar.m();
        cVar.f33773p = ((l) fVar).I0();
        c(cVar);
    }

    public static void b(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, int i2, long j2, long j3, long j4, long j5) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004707";
        cVar.a(aVar);
        cVar.f33772n = String.valueOf(aVar.j);
        cVar.o = aVar.f39166e;
        cVar.f33773p = String.valueOf(aVar.f39164b);
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            cVar.q = dVar.I0();
            cVar.r = dVar.L();
        }
        cVar.s = String.valueOf(i2);
        cVar.t = String.valueOf(j2);
        cVar.f33774u = String.format("%.2f", Double.valueOf((j3 / 1024.0d) / 1024.0d));
        cVar.v = String.valueOf(j4);
        cVar.f33775w = String.format("%.2f", Double.valueOf((j5 / 1024.0d) / 1024.0d));
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, int i2, String str) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004706";
        cVar.a(aVar);
        cVar.f33772n = String.valueOf(aVar.j);
        cVar.o = aVar.f39166e;
        cVar.f33773p = String.valueOf(aVar.f39164b);
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            cVar.q = dVar.I0();
            cVar.r = dVar.L();
        }
        cVar.s = String.valueOf(i2);
        cVar.t = str;
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), "66");
        cVar.f33765a = "1004736";
        cVar.a(aVar);
        cVar.f33772n = String.valueOf(aVar.f39164b);
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.o = ((com.smartdigimkt.w6.d) fVar).I0();
            cVar.f33773p = fVar.L();
        }
        cVar.q = 1 == ((l) fVar).B0() ? "2" : "1";
        com.smartdigimkt.w6.g gVar = aVar.t;
        if (gVar != null) {
            cVar.r = gVar.l1() == 1 ? "1" : "2";
        }
        cVar.s = i2 == 1 ? "2" : "1";
        cVar.t = i3 == 1 ? "2" : "1";
        cVar.f33774u = String.valueOf(i4);
        cVar.v = z3 ? "1" : "2";
        cVar.f33775w = z4 ? "1" : "2";
        c(cVar);
    }

    public static void b(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, int i2, String str) {
        try {
            com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
            cVar.f33765a = "1004679";
            cVar.a(aVar);
            if (fVar instanceof com.smartdigimkt.w6.d) {
                cVar.f33772n = ((com.smartdigimkt.w6.d) fVar).I0();
            }
            cVar.o = aVar.f39166e;
            cVar.f33773p = fVar.L();
            cVar.q = String.valueOf(fVar.O());
            cVar.r = fVar.o0();
            cVar.s = fVar.n0();
            cVar.t = String.valueOf(i2);
            c(cVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str) {
        if (aVar == null || fVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), "66");
        cVar.f33765a = "1004737";
        cVar.a(aVar);
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            cVar.f33772n = String.valueOf(dVar.I0());
            cVar.o = String.valueOf(dVar.L());
        }
        cVar.f33773p = fVar.z();
        cVar.q = fVar.y();
        cVar.r = fVar.x();
        cVar.s = str;
        cVar.t = String.valueOf(aVar.f39164b);
        c(cVar);
    }

    public static void b(com.smartdigimkt.r8.d dVar) {
        try {
            SDMWinInfo sDMWinInfoF = dVar.f();
            com.smartdigimkt.y4.c cVarD = dVar.d();
            com.smartdigimkt.y6.b bVarI = cVarD.i();
            com.smartdigimkt.v6.a aVarH = cVarD.h();
            com.smartdigimkt.w6.f fVarG = cVarD.g();
            com.smartdigimkt.l8.f fVarL = cVarD.l();
            String strValueOf = String.valueOf(aVarH.j);
            com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVarH.f39164b), strValueOf);
            cVar.f33765a = "3000005";
            cVar.a(cVarD.f());
            cVar.f33772n = strValueOf;
            cVar.o = aVarH.f39166e;
            cVar.f33773p = dVar.g();
            cVar.q = String.valueOf(bVarI.f());
            double secondPrice = sDMWinInfoF.getSecondPrice();
            SDMAdConst.CURRENCY currency = sDMWinInfoF.getCurrency();
            cVar.r = String.valueOf(secondPrice);
            if (currency != null) {
                cVar.s = currency.toString();
            }
            cVar.t = String.valueOf(fVarL.d());
            cVar.f33774u = String.valueOf(bVarI.f40240E);
            cVar.v = String.valueOf(bVarI.f40243J);
            cVar.f33775w = dVar.a();
            cVar.x = dVar.b();
            String strE = com.smartdigimkt.n8.h.e(sDMWinInfoF.getExtraMap(), "bidding_name");
            if (!TextUtils.isEmpty(strE)) {
                cVar.y = strE;
            }
            cVar.f33776z = "1";
            if (fVarG instanceof com.smartdigimkt.w6.d) {
                cVar.f33752A = ((com.smartdigimkt.w6.d) fVarG).I0();
            }
            cVar.f33753B = fVarG != null ? fVarG.L() : "";
            cVar.C = aVarH.f39169l;
            c(cVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, long j2, long j3) {
        a(fVar, aVar, true, j2, 0, "", j3);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, boolean z2, long j2, int i2, String str, long j3) {
        String str2;
        String str3;
        if (fVar == null || aVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004761";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.o = ((com.smartdigimkt.w6.d) fVar).I0();
        }
        cVar.f33773p = z2 ? "1" : "2";
        cVar.q = String.valueOf(j2);
        cVar.r = fVar.v();
        String str4 = "";
        if (fVar.i() != null) {
            str2 = fVar.i().a0() + "";
        } else {
            str2 = "";
        }
        cVar.s = str2;
        if (fVar.i() != null) {
            str3 = fVar.i().b0() + "";
        } else {
            str3 = "";
        }
        cVar.t = str3;
        if (fVar.i() != null) {
            str4 = fVar.i().f0() + "";
        }
        cVar.f33774u = str4;
        if (!z2) {
            cVar.v = String.valueOf(i2);
            cVar.f33775w = str;
        }
        if (j3 > 0) {
            cVar.x = String.valueOf(j3);
        }
        c(cVar);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, long j2, String str, long j3, long j4, long j5, long j6, long j7) {
        String str2;
        String str3;
        if (fVar == null || aVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004762";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.o = ((com.smartdigimkt.w6.d) fVar).I0();
        }
        cVar.f33773p = String.valueOf(i2);
        cVar.q = String.valueOf(j2);
        cVar.r = fVar.v();
        String str4 = "";
        if (fVar.i() != null) {
            str2 = fVar.i().a0() + "";
        } else {
            str2 = "";
        }
        cVar.s = str2;
        if (fVar.i() != null) {
            str3 = fVar.i().b0() + "";
        } else {
            str3 = "";
        }
        cVar.t = str3;
        if (fVar.i() != null) {
            str4 = fVar.i().f0() + "";
        }
        cVar.f33774u = str4;
        cVar.v = str;
        cVar.f33775w = String.valueOf(j3);
        cVar.x = String.valueOf(j4);
        cVar.y = String.valueOf(j5);
        cVar.f33776z = String.valueOf(j6);
        cVar.f33752A = String.valueOf(j7);
        c(cVar);
    }

    public static void b(String str, String str2, String str3, String str4) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "3000010";
        cVar.d = str3;
        cVar.f33772n = str2;
        cVar.o = str;
        cVar.f33773p = str4;
        c(cVar);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, int i3) {
        if (fVar == null || aVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004747";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.o = ((com.smartdigimkt.w6.d) fVar).I0();
        }
        cVar.f33773p = String.valueOf(i2);
        if (i3 > 0) {
            cVar.q = String.valueOf(i3);
        }
        cVar.r = String.valueOf(fVar.j());
        cVar.s = fVar.q();
        cVar.t = fVar.k();
        c(cVar);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, boolean z2, int i3, String str) {
        if (fVar == null || aVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004748";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.o = ((com.smartdigimkt.w6.d) fVar).I0();
        }
        if (TextUtils.isEmpty(str)) {
            cVar.f33773p = fVar.q();
        } else {
            cVar.f33773p = str;
        }
        cVar.q = fVar.k();
        cVar.r = String.valueOf(i2);
        if (i2 != 1 && z2) {
            cVar.s = z2 ? "1" : "2";
        }
        if (i2 == 3 && i3 > 0) {
            cVar.t = String.valueOf(i3);
        }
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, int i2, boolean z2) {
        if (aVar == null || fVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004698";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        cVar.o = fVar.m();
        cVar.f33773p = fVar instanceof com.smartdigimkt.w6.d ? ((com.smartdigimkt.w6.d) fVar).I0() : "";
        cVar.q = String.valueOf(aVar.f39164b);
        cVar.r = String.valueOf(aVar.f39168i);
        cVar.s = String.valueOf(i2);
        cVar.t = String.valueOf(aVar.f39169l);
        if (i2 != 5) {
            cVar.f33774u = z2 ? "1" : "2";
        }
        c(cVar);
    }

    public static void a(String str, com.smartdigimkt.v6.a aVar, String str2, String str3, String str4, int i2, int i3, String str5, String str6, boolean z2, long j2) {
        if (com.smartdigimkt.m6.b.p().k() == null) {
            return;
        }
        a(new c(str3, str4, aVar, str2, i2, i3, str6, str5, z2, str, j2));
    }

    public static void a(com.smartdigimkt.v6.a aVar, String str, String str2, String str3, String str4, int i2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, String.valueOf(66));
        cVar.f33765a = "1004735";
        cVar.a(aVar);
        cVar.f33772n = str;
        cVar.o = str2;
        cVar.f33773p = str3;
        cVar.q = str4;
        cVar.r = String.valueOf(i2);
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, int i2, String str, Map<String, JSONArray> map, int i3, int i4, int i5, String str2, int i6, int i7, long j2, String str3, int i8, boolean z2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004675";
        cVar.a(aVar);
        cVar.f33772n = str;
        cVar.o = String.valueOf(i2);
        cVar.q = String.valueOf(i3);
        cVar.r = String.valueOf(i4);
        cVar.s = String.valueOf(i5);
        cVar.t = str2;
        cVar.f33774u = String.valueOf(i6);
        if (i7 >= 0) {
            cVar.v = String.valueOf(i7);
        }
        if (j2 > 0) {
            cVar.f33775w = String.valueOf(j2);
        }
        if (!TextUtils.isEmpty(str3)) {
            cVar.x = str3;
        }
        if (i8 > 0) {
            cVar.y = String.valueOf(i8);
        }
        if (map != null && map.size() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, JSONArray> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                cVar.f33776z = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        if (z2) {
            cVar.f33752A = "1";
        }
        c(cVar);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2) {
        a(fVar, aVar, i2, false, 0, "", 0, fVar.i() != null ? fVar.i().V() : 1);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, boolean z2, int i3, String str, int i4, int i5) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004719";
        cVar.a(aVar);
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            cVar.f33772n = dVar.I0();
            cVar.o = dVar.L();
        }
        cVar.f33773p = z2 ? "2" : "1";
        if (i3 > 0) {
            cVar.q = String.valueOf(i3);
            if (!TextUtils.isEmpty(str)) {
                cVar.r = str;
            }
            if (i4 > 0) {
                cVar.s = String.valueOf(i4);
            }
        } else {
            cVar.q = "1";
        }
        cVar.t = String.valueOf(aVar.f39164b);
        if (fVar != null && fVar.i() != null) {
            cVar.f33774u = fVar.i().q0();
        }
        cVar.v = String.valueOf(i2);
        cVar.f33775w = String.valueOf(i5);
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, int i2, com.smartdigimkt.w6.f fVar, long j2, long j3) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(i2), null);
        cVar.f33765a = "1004721";
        cVar.a(aVar);
        cVar.f33772n = String.valueOf(j2);
        cVar.o = String.valueOf(j3);
        if (fVar != null) {
            if (!TextUtils.isEmpty(fVar.p())) {
                cVar.f33773p = fVar.p();
            }
            cVar.q = fVar.q();
            cVar.r = fVar.L();
            if (fVar instanceof com.smartdigimkt.w6.d) {
                cVar.s = ((com.smartdigimkt.w6.d) fVar).I0();
            }
        }
        cVar.t = String.valueOf(i2);
        c(cVar);
    }

    public static void a(String str, String str2, String str3, int i2, String str4, long j2, long j3, com.smartdigimkt.w6.f fVar) {
        a(str, str2, str3, i2, str4, j2, j3, fVar, 0, 0L);
    }

    public static void a(String str, String str2, String str3, int i2, String str4, long j2, long j3, com.smartdigimkt.w6.f fVar, int i3, long j4) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004642";
        cVar.f33766b = str;
        if (fVar != null) {
            cVar.X = fVar.p0();
            cVar.f33764Y = fVar.V();
            cVar.f33775w = fVar.X();
            cVar.y = fVar.q();
            if (fVar instanceof com.smartdigimkt.w6.d) {
                cVar.x = ((com.smartdigimkt.w6.d) fVar).I0();
            }
        }
        cVar.f33772n = str2;
        cVar.o = str3;
        cVar.f33773p = String.valueOf(i2);
        if (i2 == 3 || i2 == 10) {
            cVar.q = str4;
        } else if (i2 == 2) {
            cVar.r = String.valueOf(j2);
            cVar.s = String.valueOf(j3 / 1024.0f);
        }
        if (i2 == 11) {
            cVar.t = android.support.v4.media.a.h(i3, "");
        }
        if (i2 == 13) {
            if (fVar != null && TextUtils.isEmpty(fVar.X()) && TextUtils.isEmpty(fVar.q())) {
                cVar.f33774u = "1";
            } else {
                cVar.f33774u = "0";
            }
        }
        if (i2 == 6 || i2 == 9 || i2 == 12) {
            cVar.v = String.valueOf(System.currentTimeMillis() - j4);
        }
        c(cVar);
    }

    public static void a(com.smartdigimkt.w6.f fVar, List<String> list, List<String> list2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004771";
        if (fVar != null) {
            cVar.f33766b = fVar.d0();
            cVar.X = fVar.p0();
            cVar.f33764Y = fVar.V();
            cVar.f33772n = fVar.L();
            cVar.o = fVar.X();
            if (fVar instanceof com.smartdigimkt.w6.d) {
                cVar.f33773p = ((com.smartdigimkt.w6.d) fVar).I0();
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray((Collection) list);
                    JSONArray jSONArray2 = new JSONArray((Collection) list2);
                    jSONObject.put("success", jSONArray);
                    jSONObject.put("fail", jSONArray2);
                    cVar.q = jSONObject.toString();
                } catch (Throwable unused) {
                }
            }
        }
        c(cVar);
    }

    public static void a(String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, int i3, long j3, long j4, String str11, String str12) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, str3);
        cVar.f33765a = "1004711";
        cVar.f33766b = str;
        cVar.X = str11;
        cVar.f33764Y = str12;
        cVar.f33767c = str2;
        cVar.f33769h = String.valueOf(j2);
        cVar.f33772n = str3;
        cVar.o = str4;
        cVar.f33773p = str5;
        cVar.q = str6;
        if (!TextUtils.isEmpty(str7)) {
            cVar.r = String.valueOf(str7.contains("data/data") ? 1 : 2);
        }
        cVar.s = str8;
        cVar.t = String.valueOf(i2);
        cVar.f33774u = str9;
        if (!"1".equals(str9)) {
            cVar.v = str10;
        }
        cVar.f33775w = String.valueOf(i3);
        cVar.x = String.valueOf(j3 / 1024.0f);
        cVar.y = String.valueOf(j4);
        c(cVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, str3);
        cVar.f33765a = "1004712";
        cVar.f33766b = str;
        cVar.X = str8;
        cVar.f33764Y = str9;
        cVar.f33767c = str2;
        cVar.f33769h = String.valueOf(System.currentTimeMillis());
        cVar.f33772n = str3;
        cVar.o = str4;
        cVar.f33773p = str5;
        cVar.q = str6;
        cVar.r = str7;
        cVar.s = String.valueOf(i2);
        c(cVar);
    }

    public static void a(int i2, long j2, long j3, String str) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004644";
        cVar.d = str;
        cVar.f33772n = String.valueOf(i2);
        cVar.o = String.valueOf(j2);
        cVar.f33773p = String.valueOf(j3);
        cVar.q = String.valueOf(j3 - j2);
        c(cVar);
    }

    public static void a(int i2, long j2, long j3, String str, String str2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004651";
        cVar.d = str;
        cVar.f33772n = String.valueOf(i2);
        cVar.o = String.valueOf(j3 - j2);
        cVar.f33773p = str2;
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, boolean z2, int i2, int i3, long j2, long j3) {
        if (aVar == null || fVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004699";
        cVar.a(aVar);
        cVar.f33772n = z2 ? "2" : "1";
        cVar.o = String.valueOf(i2);
        cVar.f33773p = String.valueOf(j2);
        cVar.q = String.valueOf(j3);
        cVar.r = String.valueOf(aVar.f39164b);
        cVar.s = String.valueOf(i3);
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            cVar.t = String.valueOf(dVar.I0());
            cVar.f33774u = String.valueOf(dVar.L());
        }
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, int i2, String str, JSONArray jSONArray, String str2, int i3) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004700";
        cVar.a(aVar);
        cVar.f33772n = str;
        cVar.o = String.valueOf(i2);
        cVar.f33773p = jSONArray != null ? jSONArray.toString() : "";
        cVar.q = str2;
        cVar.r = String.valueOf(i3);
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, int i2, long j2, long j3, long j4, long j5) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004708";
        cVar.a(aVar);
        cVar.f33772n = String.valueOf(aVar.j);
        cVar.o = aVar.f39166e;
        cVar.f33773p = String.valueOf(aVar.f39164b);
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            cVar.q = dVar.I0();
            cVar.r = dVar.L();
        }
        cVar.s = String.valueOf(i2);
        cVar.t = String.valueOf(j2);
        cVar.f33774u = String.format("%.2f", Double.valueOf((j3 / 1024.0d) / 1024.0d));
        cVar.v = String.valueOf(j4);
        cVar.f33775w = String.format("%.2f", Double.valueOf((j5 / 1024.0d) / 1024.0d));
        com.smartdigimkt.w6.g gVar = aVar.t;
        if (gVar != null && gVar.I() > 0) {
            cVar.x = String.valueOf(aVar.t.I());
        }
        c(cVar);
    }

    public static void a(com.smartdigimkt.a7.a aVar, String str, String str2, int i2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004709";
        cVar.a(aVar);
        cVar.f33772n = String.valueOf(aVar.W());
        cVar.o = aVar.d0();
        cVar.f33773p = aVar.I();
        cVar.q = str;
        cVar.r = str2;
        cVar.s = String.valueOf(i2);
        cVar.t = "1";
        c(cVar);
    }

    public static void a(com.smartdigimkt.a7.a aVar, String str, String str2, boolean z2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004710";
        cVar.a(aVar);
        cVar.f33772n = String.valueOf(aVar.W());
        cVar.o = aVar.d0();
        cVar.f33773p = str;
        cVar.q = str2;
        cVar.r = z2 ? "1" : "2";
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, long j2, boolean z2, long j3, int i2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), "66");
        cVar.f33765a = "1004733";
        cVar.a(aVar);
        com.smartdigimkt.w6.g gVar = aVar.t;
        if (gVar != null) {
            cVar.f33772n = gVar.m0() == 2 ? "1" : "2";
            cVar.s = String.valueOf(aVar.t.k0());
            cVar.t = String.valueOf(aVar.t.l0());
            cVar.v = String.valueOf(aVar.t.j0());
            cVar.f33775w = String.valueOf(aVar.t.I0());
        }
        cVar.o = String.valueOf(j2);
        cVar.f33773p = String.valueOf(System.currentTimeMillis() - j2);
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.q = ((com.smartdigimkt.w6.d) fVar).I0();
            cVar.r = fVar.L();
        }
        cVar.f33774u = z2 ? "1" : "2";
        cVar.x = String.valueOf(j3);
        cVar.y = String.valueOf(i2);
        c(cVar);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, String str, String str2) {
        if (fVar == null || aVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004652";
        cVar.a(aVar);
        cVar.f33772n = String.valueOf(aVar.j);
        cVar.o = aVar.f39166e;
        if (fVar instanceof com.smartdigimkt.z6.a) {
            cVar.f33773p = "1";
        } else if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.f33773p = "2";
        }
        cVar.q = str;
        cVar.r = str2;
        cVar.s = fVar.L();
        cVar.t = fVar.m();
        cVar.f33774u = fVar.X();
        cVar.v = fVar.g0();
        cVar.f33775w = fVar.r();
        cVar.x = fVar.w();
        cVar.y = fVar.s();
        cVar.f33776z = fVar.k0();
        try {
            if (fVar instanceof l) {
                StringBuilder sb = new StringBuilder();
                String strO0 = ((l) fVar).O0();
                if (!TextUtils.isEmpty(strO0)) {
                    JSONArray jSONArray = new JSONArray(strO0);
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        sb.append(jSONArray.optString(i2));
                        sb.append(",");
                    }
                    if (sb.length() > 1) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    cVar.f33752A = sb.toString();
                }
            }
        } catch (Throwable unused) {
        }
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str, String str2, String str3, String str4) {
        if (aVar == null || fVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004648";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        cVar.o = String.valueOf(fVar.O());
        cVar.f33773p = str;
        cVar.q = str2;
        cVar.r = str3;
        cVar.s = str4;
        c(cVar);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, String str, String str2, List<Boolean> list, int i2, boolean z2) {
        if (fVar == null || aVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004756";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.o = ((com.smartdigimkt.w6.d) fVar).I0();
        }
        cVar.f33773p = str;
        cVar.q = str2;
        cVar.r = String.valueOf(aVar.f39164b);
        cVar.t = String.valueOf(i2);
        if (list != null && list.size() == 5) {
            Boolean bool = list.get(0);
            Boolean bool2 = list.get(1);
            Boolean bool3 = list.get(2);
            Boolean bool4 = list.get(3);
            Boolean bool5 = list.get(4);
            if (bool != null) {
                cVar.f33774u = bool.booleanValue() ? "1" : "2";
            }
            if (bool2 != null) {
                cVar.v = bool2.booleanValue() ? "1" : "2";
            }
            if (bool3 != null) {
                cVar.f33775w = bool3.booleanValue() ? "1" : "2";
            }
            if (bool4 != null) {
                cVar.x = bool4.booleanValue() ? "1" : "2";
            }
            if (bool5 != null) {
                cVar.y = bool5.booleanValue() ? "1" : "2";
            }
        }
        cVar.f33776z = z2 ? "1" : "2";
        cVar.f33752A = fVar.t0() ? "1" : "2";
        c(cVar);
    }

    public static void a(int i2, int i3, int i4, long j2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004758";
        cVar.f33772n = String.valueOf(i2);
        cVar.o = String.valueOf(i3);
        cVar.f33773p = String.valueOf(i4);
        cVar.q = String.valueOf(j2);
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str, String str2, int i2, int i3) {
        a(aVar, fVar, str, str2, i2, i3, "");
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str, String str2, int i2, int i3, String str3) {
        if (aVar == null || fVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004650";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        cVar.o = String.valueOf(fVar.O());
        cVar.f33773p = str;
        cVar.q = str2;
        cVar.r = String.valueOf(i2);
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.t = String.valueOf(((com.smartdigimkt.w6.d) fVar).I0());
        }
        cVar.f33774u = String.valueOf(aVar.f39164b);
        if (i3 > 0) {
            cVar.v = String.valueOf(i3);
        }
        cVar.f33775w = str3;
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str, String str2, int i2) {
        if (aVar == null || fVar == null) {
            return;
        }
        boolean z2 = i2 == 0;
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "1004728";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        cVar.o = String.valueOf(aVar.t.O());
        cVar.f33773p = String.valueOf(z2 ? 1 : 2);
        cVar.q = str;
        cVar.r = str2;
        if (!z2) {
            cVar.s = String.valueOf(i2);
        }
        c(cVar);
    }

    public static void a(String str, String str2, com.smartdigimkt.v6.a aVar, String str3, String str4, int i2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z2, boolean z3, String str18, String str19, String str20) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, String.valueOf(66));
        cVar.f33765a = "1004731";
        cVar.f33766b = str;
        cVar.f33767c = str2;
        cVar.a(aVar);
        cVar.f33772n = str3;
        cVar.o = str4;
        cVar.f33773p = str6;
        cVar.q = str7;
        cVar.r = str8;
        cVar.s = str9;
        cVar.t = str10;
        cVar.f33774u = str11;
        cVar.v = str12;
        cVar.f33775w = str5;
        cVar.x = String.valueOf(i2);
        cVar.y = str13;
        cVar.f33776z = str14;
        cVar.f33752A = str15;
        cVar.f33753B = str16;
        cVar.C = str17;
        cVar.D = z2 ? "2" : "1";
        cVar.f33754E = z3 ? "1" : "2";
        cVar.f33755F = str18;
        cVar.G = str19;
        cVar.H = str20;
        c(cVar);
    }

    public static void a(int i2, String str, String str2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c("", "");
        cVar.f33765a = "1004765";
        cVar.f33772n = String.valueOf(i2);
        cVar.o = str;
        cVar.f33773p = str2;
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7, String str8, String str9, String str10) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004715";
        cVar.a(aVar);
        cVar.f33772n = str;
        cVar.o = str2;
        cVar.f33773p = str3;
        cVar.q = str4;
        cVar.r = androidx.datastore.preferences.protobuf.a.i(j2, "");
        cVar.s = str5;
        cVar.t = str6;
        cVar.f33774u = str7;
        cVar.v = str8;
        cVar.f33775w = str9;
        cVar.x = str10;
        c(cVar);
    }

    public static void a(String str, int i2, int i3, int i4) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004717";
        cVar.f33772n = str;
        cVar.o = String.valueOf(i2);
        cVar.f33773p = String.valueOf(i3);
        cVar.q = String.valueOf(i4);
        c(cVar);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, String str) {
        a(fVar, aVar, false, str, 0.0d, 0.0d, 0L, 0L, 0L, 0);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, double d2, double d3, long j2) {
        a(fVar, aVar, true, "", d2, d3, j2, 0L, 0L, 0);
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, boolean z2, String str, double d2, double d3, long j2, long j3, long j4, int i2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004764";
        cVar.a(aVar);
        if (fVar != null) {
            cVar.f33772n = String.valueOf(fVar.O());
            if (fVar instanceof com.smartdigimkt.w6.d) {
                cVar.f33773p = ((com.smartdigimkt.w6.d) fVar).I0();
                cVar.q = fVar.L();
            }
            cVar.r = fVar.k0();
        }
        if (aVar != null) {
            cVar.o = String.valueOf(aVar.f39164b);
            com.smartdigimkt.w6.g gVar = aVar.t;
            if (gVar != null) {
                cVar.f33775w = String.valueOf(gVar.F0());
            }
        }
        cVar.s = z2 ? "1" : "2";
        if (!TextUtils.isEmpty(str)) {
            cVar.t = str;
        }
        if (d2 > 0.0d) {
            cVar.f33774u = String.valueOf(Math.round(d2 / 1024.0d));
        }
        if (d3 > 0.0d) {
            cVar.v = String.valueOf(Math.round(d3 / 1024.0d));
        }
        if (j2 > 0) {
            cVar.x = String.valueOf(j2);
        }
        if (j3 > 0) {
            cVar.y = String.valueOf(j3);
        }
        if (j4 > 0) {
            cVar.f33776z = String.valueOf(j4);
        }
        if (i2 > 0) {
            cVar.f33752A = String.valueOf(i2);
        }
        c(cVar);
    }

    public static void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.v6.a aVar, String str, k kVar, boolean z2, int i2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(66));
        cVar.f33765a = "1004704";
        cVar.a(aVar);
        cVar.f33772n = dVar != null ? dVar.L() : "";
        cVar.o = "2";
        cVar.f33773p = String.valueOf(aVar.f39164b);
        if (!TextUtils.isEmpty(str)) {
            cVar.q = str;
        }
        cVar.r = String.valueOf(kVar.c());
        cVar.s = String.valueOf(kVar.a());
        if (dVar != null) {
            cVar.t = dVar.Y0() == 1 ? "1" : "0";
        } else {
            cVar.t = "0";
        }
        cVar.f33774u = String.valueOf(kVar.b());
        cVar.v = aVar.v ? "1" : "0";
        cVar.f33775w = String.valueOf(kVar.d());
        cVar.x = z2 ? "1" : "0";
        if (kVar.f > 0 && kVar.g > 0) {
            cVar.y = String.valueOf(kVar.e());
        }
        cVar.f33776z = String.valueOf(i2);
        c(cVar);
    }

    public static void a(String str, String str2) {
        boolean zIsEmpty = str.isEmpty();
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004729";
        cVar.f33772n = Build.MANUFACTURER;
        cVar.o = !zIsEmpty ? "1" : "2";
        if (!zIsEmpty) {
            cVar.f33773p = str;
        } else {
            cVar.q = str2;
        }
        c(cVar);
    }

    public static void a(int i2, int i3, String str, long j2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004769";
        try {
            cVar.f33772n = Build.MANUFACTURER;
        } catch (Throwable unused) {
        }
        cVar.o = String.valueOf(i2);
        cVar.f33773p = String.valueOf(i3);
        if (!TextUtils.isEmpty(str)) {
            cVar.q = str;
        }
        cVar.r = String.valueOf(j2);
        c(cVar);
    }

    public static void a(String str, com.smartdigimkt.v6.a aVar, String str2, String str3, String str4, String str5, String str6, String str7, long j2, int i2, int i3) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "1004713";
        cVar.f33766b = str;
        cVar.f33767c = str2;
        cVar.a(aVar);
        cVar.f33772n = str3;
        cVar.o = str4;
        cVar.f33773p = str5;
        cVar.q = str6;
        cVar.r = str7;
        cVar.s = String.valueOf(j2);
        cVar.t = String.valueOf(i2);
        cVar.f33774u = String.valueOf(i3);
        c(cVar);
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str, String str2) {
        a(aVar, fVar, str, str2, true, "", "");
    }

    public static void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str, String str2, boolean z2, String str3, String str4) {
        if (aVar == null || fVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(66));
        cVar.f33765a = "1004743";
        cVar.f33766b = aVar.f;
        cVar.f33767c = aVar.f39163a;
        cVar.a(aVar);
        cVar.f33772n = str;
        if (fVar instanceof com.smartdigimkt.w6.d) {
            com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
            cVar.o = String.valueOf(dVar.I0());
            cVar.f33773p = String.valueOf(dVar.L());
        }
        cVar.q = String.valueOf(aVar.f39164b);
        cVar.r = str2;
        cVar.s = z2 ? "1" : "2";
        cVar.t = str3;
        cVar.f33774u = str4;
        c(cVar);
    }

    public static void a(com.smartdigimkt.a7.a aVar, AdError adError) {
        try {
            com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c("", null);
            cVar.f33765a = "3000001";
            if (aVar != null) {
                cVar.a(aVar);
                com.smartdigimkt.l8.e eVarA = com.smartdigimkt.k8.c.a().a(aVar.Y());
                cVar.f33770i = eVarA != null ? eVarA.l() : "";
            }
            if (adError != null) {
                cVar.f33772n = adError.getErrorInfo();
                cVar.o = adError.getCode();
            }
            c(cVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(com.smartdigimkt.y4.c cVar, AdError adError) {
        if (cVar == null) {
            return;
        }
        try {
            com.smartdigimkt.a7.c cVar2 = new com.smartdigimkt.a7.c("", null);
            cVar2.f33765a = "3000002";
            com.smartdigimkt.a7.a aVarF = cVar.f();
            if (aVarF != null) {
                cVar2.a(aVarF);
                com.smartdigimkt.l8.e eVarA = com.smartdigimkt.k8.c.a().a(aVarF.Y());
                cVar2.f33770i = eVarA != null ? eVarA.l() : "";
            }
            cVar2.f33772n = adError != null ? adError.getCode() : "";
            cVar2.o = adError != null ? adError.getMessage() : "";
            com.smartdigimkt.w6.f fVarG = cVar.g();
            cVar2.f33773p = fVarG != null ? fVarG.L() : "";
            if (fVarG instanceof com.smartdigimkt.w6.d) {
                cVar2.q = ((com.smartdigimkt.w6.d) fVarG).I0();
            }
            c(cVar2);
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z2, String str, com.smartdigimkt.y4.c cVar, long j2, int i2) {
        com.smartdigimkt.a7.c cVar2 = new com.smartdigimkt.a7.c("", null);
        cVar2.f33765a = "3000003";
        if (cVar != null) {
            com.smartdigimkt.a7.a aVarF = cVar.f();
            if (aVarF != null) {
                cVar2.a(aVarF);
            }
            com.smartdigimkt.w6.f fVarG = cVar.g();
            if (fVarG instanceof com.smartdigimkt.w6.d) {
                cVar2.q = ((com.smartdigimkt.w6.d) fVarG).I0();
            }
            cVar2.r = fVarG != null ? fVarG.L() : "";
        }
        cVar2.f33772n = z2 ? "1" : "0";
        cVar2.o = String.valueOf(i2);
        cVar2.f33773p = String.valueOf(j2);
        cVar2.f33767c = str;
        c(cVar2);
    }

    public static void a(String str, String str2, String str3, String str4) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "3000004";
        cVar.f33767c = str;
        cVar.f33772n = str2;
        cVar.o = str3;
        cVar.f33773p = str4;
        c(cVar);
    }

    public static void a(com.smartdigimkt.r8.d dVar) {
        try {
            SDMLossInfo sDMLossInfoE = dVar.e();
            com.smartdigimkt.y4.c cVarD = dVar.d();
            com.smartdigimkt.v6.a aVarH = cVarD.h();
            com.smartdigimkt.w6.f fVarG = cVarD.g();
            com.smartdigimkt.l8.f fVarL = cVarD.l();
            com.smartdigimkt.y6.b bVarI = cVarD.i();
            String strValueOf = String.valueOf(aVarH.j);
            com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVarH.f39164b), strValueOf);
            cVar.f33765a = "3000006";
            cVar.a(cVarD.f());
            cVar.f33772n = strValueOf;
            cVar.o = aVarH.f39166e;
            cVar.f33773p = dVar.h();
            SDMLossInfo.LOSS_REASON lossReason = sDMLossInfoE.getLossReason();
            if (lossReason != null) {
                cVar.q = String.valueOf(lossReason.getCode());
            }
            cVar.r = String.valueOf(bVarI.f());
            cVar.s = String.valueOf(sDMLossInfoE.getWinPrice());
            cVar.t = String.valueOf(sDMLossInfoE.getCurrency());
            cVar.f33774u = String.valueOf(fVarL.c());
            cVar.v = String.valueOf(bVarI.f40240E);
            cVar.f33775w = String.valueOf(bVarI.f40243J);
            cVar.x = dVar.a();
            cVar.y = dVar.b();
            String strE = com.smartdigimkt.n8.h.e(sDMLossInfoE.getExtraMap(), "bidding_name");
            if (!TextUtils.isEmpty(strE)) {
                cVar.f33776z = strE;
            }
            cVar.f33752A = "1";
            if (fVarG instanceof com.smartdigimkt.w6.d) {
                cVar.f33753B = ((com.smartdigimkt.w6.d) fVarG).I0();
            }
            cVar.C = fVarG != null ? fVarG.L() : "";
            cVar.D = aVarH.f39169l;
            c(cVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "3000007";
        if (!TextUtils.isEmpty(str)) {
            cVar.f33767c = str;
        }
        cVar.f33772n = str2;
        cVar.o = str3;
        cVar.f33773p = str4;
        cVar.q = str5;
        c(cVar);
    }

    public static void a(long j2, long j3, long j4) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c("", "");
        cVar.f33765a = f35863b;
        cVar.f33772n = String.valueOf(j2);
        cVar.o = String.valueOf(j3);
        cVar.f33773p = String.valueOf(j4);
        c(cVar);
    }

    public static void a(String str, String str2, long j2, long j3, SDMAdRequest sDMAdRequest) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "3000009";
        if (!TextUtils.isEmpty(str2)) {
            cVar.f33767c = str2;
        }
        cVar.f33772n = str;
        cVar.o = String.valueOf(j2);
        cVar.f33773p = String.valueOf(j3);
        cVar.q = String.valueOf(j3 - j2);
        c(cVar);
    }

    public static void a(String str, String str2, String str3) {
        b(str, str2, str3, "");
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, boolean z2, boolean z3) {
        String string;
        if (fVar == null || aVar == null) {
            return;
        }
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(String.valueOf(aVar.f39164b), String.valueOf(aVar.j));
        cVar.f33765a = "3000011";
        cVar.a(aVar);
        cVar.f33772n = fVar.L();
        if (fVar instanceof com.smartdigimkt.w6.d) {
            cVar.o = ((com.smartdigimkt.w6.d) fVar).I0();
        }
        com.smartdigimkt.w6.g gVar = aVar.t;
        if (gVar != null) {
            cVar.f33773p = String.valueOf(gVar.D());
            cVar.s = String.valueOf(aVar.t.m1());
            if (aVar.t.m1() == 2) {
                string = String.valueOf(aVar.t.i1());
            } else if (aVar.t.b1() != null) {
                string = aVar.t.b1().toString();
            } else {
                string = "";
            }
            cVar.t = string;
            cVar.f33774u = String.valueOf(aVar.t.f1());
        }
        cVar.q = z2 ? "1" : "2";
        cVar.r = z3 ? "1" : "2";
        c(cVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, long j2) {
        com.smartdigimkt.a7.c cVar = new com.smartdigimkt.a7.c(null, null);
        cVar.f33765a = "3000012";
        cVar.f33772n = str;
        cVar.o = str2;
        cVar.f33773p = str3;
        cVar.q = str4;
        cVar.r = str5;
        cVar.t = String.valueOf(SystemClock.elapsedRealtime() - j2);
        c(cVar);
    }
}
