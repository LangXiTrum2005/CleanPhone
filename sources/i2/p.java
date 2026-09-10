package i2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.a0;
import f2.k1;
import i1.q0;
import i1.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import l1.y;
import oa.j0;
import oa.m1;
import oa.n1;
import p1.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m1 f42818k = new oa.v(new b2.j(5));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f42820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f42821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f42822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f42823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f42824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i1.e f42825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f42826j;

    public p(Context context) {
        a0 a0Var = new a0(26);
        i iVar = i.F;
        this.f42819c = new Object();
        this.f42820d = context != null ? context.getApplicationContext() : null;
        this.f42821e = a0Var;
        if (iVar != null) {
            this.f42822f = iVar;
        } else {
            iVar.getClass();
            h hVar = new h(iVar);
            hVar.a(iVar);
            this.f42822f = new i(hVar);
        }
        this.f42825i = i1.e.f42531c;
        if (this.f42822f.A && context == null) {
            l1.a.s("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int b(i1.p pVar, j0 j0Var) {
        for (int i10 = 0; i10 < j0Var.size(); i10++) {
            for (int i11 = 0; i11 < pVar.f42633c.size(); i11++) {
                if (((i1.q) pVar.f42633c.get(i11)).f42658b.equals(j0Var.get(i10))) {
                    return i10;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void c(k1 k1Var, i iVar, HashMap map) {
        for (int i10 = 0; i10 < k1Var.f40386a; i10++) {
            r0 r0Var = (r0) iVar.f42692u.get(k1Var.a(i10));
            if (r0Var != null) {
                q0 q0Var = r0Var.f42665a;
                r0 r0Var2 = (r0) map.get(Integer.valueOf(q0Var.f42661c));
                if (r0Var2 == null || (r0Var2.f42666b.isEmpty() && !r0Var.f42666b.isEmpty())) {
                    map.put(Integer.valueOf(q0Var.f42661c), r0Var);
                }
            }
        }
    }

    public static int d(i1.p pVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(pVar.f42634d)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(pVar.f42634d);
        if (strF2 == null || strF == null) {
            return (z10 && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        String str2 = y.f44830a;
        return strF2.split("-", 2)[0].equals(strF.split("-", 2)[0]) ? 2 : 0;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static Pair g(int i10, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccessB;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i12 = tVar2.f42829a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == tVar2.f42830b[i13]) {
                k1 k1Var = tVar2.f42831c[i13];
                for (int i14 = 0; i14 < k1Var.f40386a; i14++) {
                    q0 q0VarA = k1Var.a(i14);
                    n1 n1VarB = mVar.b(i13, q0VarA, iArr[i13][i14]);
                    int i15 = q0VarA.f42659a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) n1VarB.get(i16);
                        int iA = nVar.a();
                        if (zArr[i16] || iA == 0) {
                            i11 = i12;
                        } else {
                            if (iA == 1) {
                                randomAccessB = j0.B(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    n nVar2 = (n) n1VarB.get(i17);
                                    int i18 = i12;
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                randomAccessB = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccessB);
                        }
                        i16++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            tVar2 = tVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((n) list.get(i19)).f42798c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.f42797b, iArr2), Integer.valueOf(nVar3.f42796a));
    }

    @Override // i2.u
    public final void a() {
        k kVar;
        synchronized (this.f42819c) {
            try {
                Thread thread = this.f42823g;
                if (thread != null) {
                    go.k.s("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (kVar = this.f42824h) != null) {
            kVar.d();
            this.f42824h = null;
        }
        this.f42835a = null;
        this.f42836b = null;
    }

    public final void e() {
        boolean z10;
        h0 h0Var;
        k kVar;
        synchronized (this.f42819c) {
            try {
                z10 = this.f42822f.A && Build.VERSION.SDK_INT >= 32 && (kVar = this.f42824h) != null && kVar.f42784b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (h0Var = this.f42835a) == null) {
            return;
        }
        h0Var.f48055h.e(10);
    }

    public final void h(i iVar) {
        boolean zEquals;
        synchronized (this.f42819c) {
            zEquals = this.f42822f.equals(iVar);
            this.f42822f = iVar;
        }
        if (zEquals) {
            return;
        }
        if (iVar.A && this.f42820d == null) {
            l1.a.s("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        h0 h0Var = this.f42835a;
        if (h0Var != null) {
            h0Var.f48055h.e(10);
        }
    }
}
