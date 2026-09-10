package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lo0 implements gd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f17085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f17087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f17088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f17089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f17090k;
    public Object l;

    public lo0(Context context, eh0 eh0Var, ou0 ou0Var, VersionInfoParcel versionInfoParcel, du0 du0Var, m00 m00Var, b30 b30Var, rq rqVar, boolean z10, zl0 zl0Var, wh0 wh0Var, yh0 yh0Var) {
        this.f17081b = context;
        this.f17082c = eh0Var;
        this.f17083d = ou0Var;
        this.f17084e = versionInfoParcel;
        this.f17085f = du0Var;
        this.f17086g = m00Var;
        this.f17087h = b30Var;
        this.f17088i = rqVar;
        this.f17080a = z10;
        this.f17089j = zl0Var;
        this.f17090k = wh0Var;
        this.l = yh0Var;
    }

    public i1.p0 a(int i10, ArrayList arrayList, f2.f1 f1Var) {
        ArrayList arrayList2 = (ArrayList) this.f17082c;
        if (!arrayList.isEmpty()) {
            this.f17090k = f1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                p1.v0 v0Var = (p1.v0) arrayList.get(i11 - i10);
                if (i11 > 0) {
                    p1.v0 v0Var2 = (p1.v0) arrayList2.get(i11 - 1);
                    v0Var.f48174d = v0Var2.f48171a.f40522o.f40443b.o() + v0Var2.f48174d;
                    v0Var.f48175e = false;
                    v0Var.f48173c.clear();
                } else {
                    v0Var.f48174d = 0;
                    v0Var.f48175e = false;
                    v0Var.f48173c.clear();
                }
                int iO = v0Var.f48171a.f40522o.f40443b.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((p1.v0) arrayList2.get(i12)).f48174d += iO;
                }
                arrayList2.add(i11, v0Var);
                ((HashMap) this.f17084e).put(v0Var.f48172b, v0Var);
                if (this.f17080a) {
                    f(v0Var);
                    if (((IdentityHashMap) this.f17083d).isEmpty()) {
                        ((HashSet) this.f17087h).add(v0Var);
                    } else {
                        p1.u0 u0Var = (p1.u0) ((HashMap) this.f17086g).get(v0Var);
                        if (u0Var != null) {
                            u0Var.f48167a.e(u0Var.f48168b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public i1.p0 b() {
        ArrayList arrayList = (ArrayList) this.f17082c;
        if (arrayList.isEmpty()) {
            return i1.p0.f42656a;
        }
        int iO = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p1.v0 v0Var = (p1.v0) arrayList.get(i10);
            v0Var.f48174d = iO;
            iO += v0Var.f48171a.f40522o.f40443b.o();
        }
        return new p1.b1(arrayList, (f2.f1) this.f17090k);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public void c(boolean z10, Context context, ka0 ka0Var) {
        boolean z11;
        float f10;
        boolean z12;
        boolean z13 = this.f17080a;
        ou0 ou0Var = (ou0) this.f17083d;
        du0 du0Var = (du0) this.f17085f;
        rq rqVar = (rq) this.f17088i;
        vg0 vg0Var = (vg0) zw1.H((m00) this.f17086g);
        try {
            b30 b30VarA = (b30) this.f17087h;
            if (b30VarA.o0()) {
                if (((Boolean) zzba.zzc().a(am.D1)).booleanValue()) {
                    b30VarA = ((eh0) this.f17082c).a(ou0Var.f18365f, null, null);
                    b30VarA.D("/reward", new eq((uc0) ((l50) vg0Var).f16737p0.zzb(), 4));
                    ((dh0) ((l50) vg0Var).f16738q0.zzb()).a(b30VarA, true, z13 ? rqVar : null, (wh0) this.f17090k);
                    b30VarA.zzP().f14700g = new b21(b30VarA, 27);
                    b30VarA.zzP().f14701h = new cn0(b30VarA);
                    hu0 hu0Var = du0Var.f13708s;
                    b30VarA.t(hu0Var.f15395b, hu0Var.f15394a);
                }
            }
            b30 b30Var = b30VarA;
            b30Var.M(true);
            boolean z14 = false;
            boolean zA = z13 ? rqVar.a(false) : false;
            zzt.zzc();
            boolean zZzL = zzs.zzL((Context) this.f17081b);
            if (z13) {
                synchronized (rqVar) {
                    z12 = rqVar.f19637b;
                }
                if (z12) {
                    z14 = true;
                    z11 = z14;
                } else {
                    z11 = false;
                    z14 = true;
                }
            } else {
                z11 = z14;
            }
            if (z14) {
                synchronized (rqVar) {
                    f10 = rqVar.f19638c;
                }
            } else {
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            zzl zzlVar = new zzl(zA, zZzL, z11, f10, -1, z10, du0Var.O, du0Var.P);
            if (ka0Var != null) {
                ka0Var.X0();
            }
            zzt.zzb();
            dd0 dd0Var = (dd0) ((l50) vg0Var).f16736o0.zzb();
            int i10 = du0Var.Q;
            VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.f17084e;
            String str = du0Var.B;
            hu0 hu0Var2 = du0Var.f13708s;
            zzn.zza(context, new AdOverlayInfoParcel(null, dd0Var, null, b30Var, i10, versionInfoParcel, str, zzlVar, hu0Var2.f15395b, hu0Var2.f15394a, ou0Var.f18366g, ka0Var, du0Var.b() ? (zl0) this.f17089j : null, b30Var.zzn()), true, (yh0) this.l);
        } catch (k30 e10) {
            int i11 = zze.zza;
            zzo.zzg("", e10);
        }
    }

    public void d() {
        Iterator it = ((HashSet) this.f17087h).iterator();
        while (it.hasNext()) {
            p1.v0 v0Var = (p1.v0) it.next();
            if (v0Var.f48173c.isEmpty()) {
                p1.u0 u0Var = (p1.u0) ((HashMap) this.f17086g).get(v0Var);
                if (u0Var != null) {
                    u0Var.f48167a.e(u0Var.f48168b);
                }
                it.remove();
            }
        }
    }

    public void e(p1.v0 v0Var) {
        if (v0Var.f48175e && v0Var.f48173c.isEmpty()) {
            p1.u0 u0Var = (p1.u0) ((HashMap) this.f17086g).remove(v0Var);
            u0Var.getClass();
            p1.t0 t0Var = u0Var.f48169c;
            f2.a aVar = u0Var.f48167a;
            aVar.s(u0Var.f48168b);
            aVar.v(t0Var);
            aVar.u(t0Var);
            ((HashSet) this.f17087h).remove(v0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [f2.d0, p1.p0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f(p1.v0 v0Var) {
        f2.y yVar = v0Var.f48171a;
        ?? r2 = new f2.d0() { // from class: p1.p0
            @Override // f2.d0
            public final void a(f2.a aVar, i1.p0 p0Var) {
                l1.w wVar = ((h0) this.f48140a.f17085f).f48055h;
                wVar.d(2);
                wVar.e(22);
            }
        };
        p1.t0 t0Var = new p1.t0(this, v0Var);
        ((HashMap) this.f17086g).put(v0Var, new p1.u0(yVar, r2, t0Var));
        String str = l1.y.f44830a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        yVar.getClass();
        f2.i0 i0Var = yVar.f40274c;
        i0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = i0Var.f40371c;
        f2.h0 h0Var = new f2.h0();
        h0Var.f40363a = handler;
        h0Var.f40364b = t0Var;
        copyOnWriteArrayList.add(h0Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        f2.i0 i0Var2 = yVar.f40275d;
        i0Var2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = i0Var2.f40371c;
        u1.d dVar = new u1.d();
        dVar.f51659a = t0Var;
        copyOnWriteArrayList2.add(dVar);
        yVar.o(r2, (n1.z) this.l, (q1.j) this.f17081b);
    }

    public void g(f2.a0 a0Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f17083d;
        p1.v0 v0Var = (p1.v0) identityHashMap.remove(a0Var);
        v0Var.getClass();
        v0Var.f48171a.r(a0Var);
        v0Var.f48173c.remove(((f2.v) a0Var).f40467a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(v0Var);
    }

    public void h(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f17082c;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            p1.v0 v0Var = (p1.v0) arrayList.remove(i12);
            ((HashMap) this.f17084e).remove(v0Var.f48172b);
            int i13 = -v0Var.f48171a.f40522o.f40443b.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((p1.v0) arrayList.get(i14)).f48174d += i13;
            }
            v0Var.f48175e = true;
            if (this.f17080a) {
                e(v0Var);
            }
        }
    }

    public ci i(int i10, int i11, List list) {
        ArrayList arrayList = (ArrayList) this.f17083d;
        ps1.v(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        ps1.v(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((lz1) arrayList.get(i12)).f17165a.a((f5) list.get(i12 - i10));
        }
        return l();
    }

    public boolean j() {
        return this.f17080a;
    }

    public void k() {
        ps1.c0(!this.f17080a);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f17083d;
            if (i10 >= arrayList.size()) {
                this.f17080a = true;
                return;
            }
            lz1 lz1Var = (lz1) arrayList.get(i10);
            s(lz1Var);
            ((HashSet) this.f17088i).add(lz1Var);
            i10++;
        }
    }

    public ci l() {
        ArrayList arrayList = (ArrayList) this.f17083d;
        if (arrayList.isEmpty()) {
            return ci.f13168a;
        }
        int iA = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            lz1 lz1Var = (lz1) arrayList.get(i10);
            lz1Var.f17168d = iA;
            iA += lz1Var.f17165a.f17632o.f15101b.a();
        }
        return new sz1(arrayList, (q42) this.l);
    }

    public ci m(List list, q42 q42Var) {
        ArrayList arrayList = (ArrayList) this.f17083d;
        r(0, arrayList.size());
        return n(arrayList.size(), list, q42Var);
    }

    public ci n(int i10, List list, q42 q42Var) {
        ArrayList arrayList = (ArrayList) this.f17083d;
        if (!list.isEmpty()) {
            this.l = q42Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                lz1 lz1Var = (lz1) list.get(i11 - i10);
                if (i11 > 0) {
                    lz1 lz1Var2 = (lz1) arrayList.get(i11 - 1);
                    lz1Var.f17168d = lz1Var2.f17165a.f17632o.f15101b.a() + lz1Var2.f17168d;
                    lz1Var.f17169e = false;
                    lz1Var.f17167c.clear();
                } else {
                    lz1Var.f17168d = 0;
                    lz1Var.f17169e = false;
                    lz1Var.f17167c.clear();
                }
                int iA = lz1Var.f17165a.f17632o.f15101b.a();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((lz1) arrayList.get(i12)).f17168d += iA;
                }
                arrayList.add(i11, lz1Var);
                ((HashMap) this.f17085f).put(lz1Var.f17166b, lz1Var);
                if (this.f17080a) {
                    s(lz1Var);
                    if (((IdentityHashMap) this.f17084e).isEmpty()) {
                        ((HashSet) this.f17088i).add(lz1Var);
                    } else {
                        kz1 kz1Var = (kz1) ((HashMap) this.f17087h).get(lz1Var);
                        if (kz1Var != null) {
                            kz1Var.f16587a.p(kz1Var.f16588b);
                        }
                    }
                }
            }
        }
        return l();
    }

    public ci o(int i10, int i11, q42 q42Var) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= ((ArrayList) this.f17083d).size()) {
            z10 = true;
        }
        ps1.v(z10);
        this.l = q42Var;
        r(i10, i11);
        return l();
    }

    public ci p(q42 q42Var) {
        int size = ((ArrayList) this.f17083d).size();
        if (q42Var.f18927b.length != size) {
            q42Var = new q42(new Random(q42Var.f18926a.nextLong())).a(size);
        }
        this.l = q42Var;
        return l();
    }

    public void q() {
        Iterator it = ((HashSet) this.f17088i).iterator();
        while (it.hasNext()) {
            lz1 lz1Var = (lz1) it.next();
            if (lz1Var.f17167c.isEmpty()) {
                kz1 kz1Var = (kz1) ((HashMap) this.f17087h).get(lz1Var);
                if (kz1Var != null) {
                    kz1Var.f16587a.p(kz1Var.f16588b);
                }
                it.remove();
            }
        }
    }

    public void r(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f17083d;
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            lz1 lz1Var = (lz1) arrayList.remove(i11);
            ((HashMap) this.f17085f).remove(lz1Var.f17166b);
            int i12 = -lz1Var.f17165a.f17632o.f15101b.a();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((lz1) arrayList.get(i13)).f17168d += i12;
            }
            lz1Var.f17169e = true;
            if (this.f17080a) {
                t(lz1Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.mz1, com.google.android.gms.internal.ads.s32] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void s(lz1 lz1Var) {
        n32 n32Var = lz1Var.f17165a;
        ?? r2 = new s32() { // from class: com.google.android.gms.internal.ads.mz1
            @Override // com.google.android.gms.internal.ads.s32
            public final void a(a32 a32Var, ci ciVar) {
                ys0 ys0Var = ((wy1) this.f17594a.f17086g).f21632g;
                ys0Var.d(2);
                ys0Var.c(22);
            }
        };
        jz1 jz1Var = new jz1(this, lz1Var);
        ((HashMap) this.f17087h).put(lz1Var, new kz1(n32Var, r2, jz1Var));
        String str = uu0.f20901a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        iw0 iw0Var = n32Var.f11822c;
        iw0Var.getClass();
        ((CopyOnWriteArrayList) iw0Var.f15865c).add(new t32(handler, jz1Var));
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        f81 f81Var = n32Var.f11823d;
        f81Var.getClass();
        ((CopyOnWriteArrayList) f81Var.f14318c).add(new b22(jz1Var));
        n32Var.n(r2, (j02) this.f17081b, (x) this.f17082c);
    }

    public void t(lz1 lz1Var) {
        if (lz1Var.f17169e && lz1Var.f17167c.isEmpty()) {
            kz1 kz1Var = (kz1) ((HashMap) this.f17087h).remove(lz1Var);
            kz1Var.getClass();
            a32 a32Var = kz1Var.f16587a;
            a32Var.q(kz1Var.f16588b);
            jz1 jz1Var = kz1Var.f16589c;
            a32Var.l(jz1Var);
            a32Var.m(jz1Var);
            ((HashSet) this.f17088i).remove(lz1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public du0 zzb() {
        return (du0) this.f17085f;
    }

    public lo0(wy1 wy1Var, d02 d02Var, ys0 ys0Var, j02 j02Var, x xVar) {
        this.f17081b = j02Var;
        this.f17082c = xVar;
        this.f17086g = wy1Var;
        this.l = new q42();
        this.f17084e = new IdentityHashMap();
        this.f17085f = new HashMap();
        this.f17083d = new ArrayList();
        this.f17089j = d02Var;
        this.f17090k = ys0Var;
        this.f17087h = new HashMap();
        this.f17088i = new HashSet();
    }

    public lo0(p1.h0 h0Var, q1.f fVar, l1.w wVar, q1.j jVar) {
        this.f17081b = jVar;
        this.f17085f = h0Var;
        this.f17090k = new f2.f1();
        this.f17083d = new IdentityHashMap();
        this.f17084e = new HashMap();
        this.f17082c = new ArrayList();
        this.f17088i = fVar;
        this.f17089j = wVar;
        this.f17086g = new HashMap();
        this.f17087h = new HashSet();
    }
}
