package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s91 f17170k = new s91();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wy1 f17171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f17172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f17174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f17175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f17176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0 f17177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z80 f17178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f17179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l42 f17180j;

    public m(Context context) {
        l42 l42Var = new l42();
        h hVar = h.F;
        this.f17173c = new Object();
        this.f17174d = context != null ? context.getApplicationContext() : null;
        this.f17180j = l42Var;
        if (hVar != null) {
            this.f17175e = hVar;
        } else {
            g gVar = new g(hVar);
            gVar.b(hVar);
            this.f17175e = new h(gVar);
        }
        this.f17178h = z80.f22559b;
        if (this.f17175e.A && context == null) {
            v71.y("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static Pair a(o[] oVarArr, int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            o oVar = oVarArr[i11];
            if (oVar != null && oVar.f18056a.f17831c == i10) {
                return Pair.create(oVar, Integer.valueOf(i11));
            }
        }
        return null;
    }

    public static final Pair b(int i10, r rVar, int[][][] iArr, j jVar, Comparator comparator) {
        RandomAccess randomAccessU;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 2; i11++) {
            if (i10 == rVar.f19256a[i11]) {
                v42 v42Var = rVar.f19257b[i11];
                for (int i12 = 0; i12 < v42Var.f21028a; i12++) {
                    ni niVarA = v42Var.a(i12);
                    ya1 ya1VarF = jVar.f(i11, niVarA, iArr[i11][i12]);
                    int i13 = niVarA.f17829a;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        k kVar = (k) ya1VarF.get(i14);
                        int iA = kVar.a();
                        if (!zArr[i14] && iA != 0) {
                            if (iA == 1) {
                                randomAccessU = ca1.u(kVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(kVar);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    k kVar2 = (k) ya1VarF.get(i16);
                                    if (kVar2.a() == 2 && kVar.b(kVar2)) {
                                        arrayList2.add(kVar2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccessU = arrayList2;
                            }
                            arrayList.add(randomAccessU);
                        }
                        i14 = i15;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((k) list.get(i17)).f16230c;
        }
        k kVar3 = (k) list.get(0);
        return Pair.create(new o(kVar3.f16229b, iArr2), Integer.valueOf(kVar3.f16228a));
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static int f(g22 g22Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(g22Var.f14668d)) {
            return 4;
        }
        String strE = e(str);
        String strE2 = e(g22Var.f14668d);
        if (strE2 == null || strE == null) {
            return (z10 && strE2 == null) ? 1 : 0;
        }
        if (strE2.startsWith(strE) || strE.startsWith(strE2)) {
            return 3;
        }
        String str2 = uu0.f20901a;
        return strE2.split("-", 2)[0].equals(strE.split("-", 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int g(g22 g22Var, ca1 ca1Var) {
        for (int i10 = 0; i10 < ca1Var.size(); i10++) {
            int i11 = 0;
            while (true) {
                ca1 ca1Var2 = g22Var.f14667c;
                if (i11 < ca1Var2.size()) {
                    if (((i32) ca1Var2.get(i11)).f15558b.equals(ca1Var.get(i10))) {
                        return i10;
                    }
                    i11++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    public static final o h(v42 v42Var, int[][] iArr, h hVar) {
        hVar.f15797q.getClass();
        int i10 = 0;
        ni niVar = null;
        f fVar = null;
        for (int i11 = 0; i11 < v42Var.f21028a; i11++) {
            ni niVarA = v42Var.a(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < niVarA.f17829a; i12++) {
                if (ux1.s(iArr2[i12], hVar.B)) {
                    f fVar2 = new f(niVarA.f17832d[i12], iArr2[i12]);
                    if (fVar != null) {
                        if (v91.f21141a.d(fVar2.f14125b, fVar.f14125b).d(fVar2.f14124a, fVar.f14124a).e() > 0) {
                            niVar = niVarA;
                            i10 = i12;
                            fVar = fVar2;
                        }
                    } else {
                        niVar = niVarA;
                        i10 = i12;
                        fVar = fVar2;
                    }
                }
            }
        }
        if (niVar == null) {
            return null;
        }
        return new o(niVar, new int[]{i10});
    }

    public static void j(r rVar, in inVar) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            v42 v42Var = rVar.f19257b[i10];
            for (int i11 = 0; i11 < v42Var.f21028a; i11++) {
                if (inVar.f15801u.get(v42Var.a(i11)) != null) {
                    throw new ClassCastException();
                }
            }
        }
        v42 v42Var2 = rVar.f19259d;
        for (int i12 = 0; i12 < v42Var2.f21028a; i12++) {
            if (inVar.f15801u.get(v42Var2.a(i12)) != null) {
                throw new ClassCastException();
            }
        }
        for (int i13 = 0; i13 < 2; i13++) {
            if (map.get(Integer.valueOf(rVar.f19256a[i13])) != null) {
                throw new ClassCastException();
            }
        }
    }

    public static void k(r rVar, h hVar, o[] oVarArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            v42 v42Var = rVar.f19257b[i10];
            Map map = (Map) hVar.D.get(i10);
            if (map != null && map.containsKey(v42Var)) {
                Map map2 = (Map) hVar.D.get(i10);
                if (map2 != null && map2.get(v42Var) != null) {
                    throw new ClassCastException();
                }
                oVarArr[i10] = null;
            }
        }
    }

    public static void l(r rVar, h hVar, o[] oVarArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            int i11 = rVar.f19256a[i10];
            if (hVar.E.get(i10) || hVar.f15802v.contains(Integer.valueOf(i11))) {
                oVarArr[i10] = null;
            }
        }
    }

    public final void c() {
        j0 j0Var;
        synchronized (this.f17173c) {
            try {
                Thread thread = this.f17176f;
                if (thread != null) {
                    ps1.d0("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (j0Var = this.f17177g) != null) {
            j0Var.e();
            this.f17177g = null;
        }
        this.f17171a = null;
        this.f17172b = null;
    }

    public final void d(z80 z80Var) {
        if (this.f17178h.equals(z80Var)) {
            return;
        }
        this.f17178h = z80Var;
        i();
    }

    public final void i() {
        boolean z10;
        wy1 wy1Var;
        j0 j0Var;
        synchronized (this.f17173c) {
            try {
                z10 = false;
                if (this.f17175e.A && Build.VERSION.SDK_INT >= 32 && (j0Var = this.f17177g) != null && j0Var.f15886b) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (wy1Var = this.f17171a) == null) {
            return;
        }
        wy1Var.f21632g.c(10);
    }
}
