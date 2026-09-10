package qj;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.ads.u22;
import com.google.android.gms.internal.ads.z40;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import f2.f1;
import i1.g0;
import i1.q0;
import i1.r0;
import i1.u0;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import oa.j0;
import oa.n1;
import p1.b1;
import p1.e0;
import p1.h0;
import p1.v0;
import p1.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f49090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextureRegistry$SurfaceProducer f49091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cj.h f49092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.k f49093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i2.p f49094f;

    /* JADX WARN: Code duplicated, block: B:29:0x0156  */
    public w(x xVar, i1.y yVar, mb.b bVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, rj.d dVar) {
        p1.b0 b0Var;
        this.f49090b = xVar;
        this.f49091c = textureRegistry$SurfaceProducer;
        switch (dVar.f49611a) {
            case 0:
                Context context = dVar.f49612b;
                al.b bVar2 = dVar.f49613c;
                i2.p pVar = new i2.p(context);
                p1.i iVar = new p1.i(context);
                go.k.t(!iVar.f48093v);
                iVar.f48077e = new f2.p(pVar, 1);
                f2.b0 b0VarC0 = bVar2.C0(context);
                go.k.t(!iVar.f48093v);
                iVar.f48076d = new f2.p(b0VarC0, 2);
                go.k.t(!iVar.f48093v);
                iVar.f48093v = true;
                b0Var = new p1.b0(iVar);
                break;
            default:
                Context context2 = dVar.f49612b;
                al.b bVar3 = dVar.f49613c;
                i2.p pVar2 = new i2.p(context2);
                p1.i iVar2 = new p1.i(context2);
                go.k.t(!iVar2.f48093v);
                iVar2.f48077e = new f2.p(pVar2, 1);
                f2.b0 b0VarC1 = bVar3.C0(context2);
                go.k.t(!iVar2.f48093v);
                iVar2.f48076d = new f2.p(b0VarC1, 2);
                go.k.t(!iVar2.f48093v);
                iVar2.f48093v = true;
                b0Var = new p1.b0(iVar2);
                break;
        }
        p1.b0 b0Var2 = b0Var;
        this.f49093e = b0Var2;
        b0Var2.l1();
        i2.u uVar = b0Var2.f47942i;
        if (uVar instanceof i2.p) {
            b0Var2.l1();
            this.f49094f = (i2.p) uVar;
        }
        n1 n1VarB = j0.B(yVar);
        b0Var2.l1();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < n1VarB.f47283d; i10++) {
            arrayList.add(b0Var2.f47952r.a((i1.y) n1VarB.get(i10)));
        }
        b0Var2.l1();
        b0Var2.R0(b0Var2.f47941h0);
        b0Var2.O0();
        b0Var2.I++;
        ArrayList arrayList2 = b0Var2.f47950p;
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            v0 v0Var = new v0((f2.a) arrayList.get(i11), b0Var2.f47951q);
            arrayList3.add(v0Var);
            arrayList2.add(i11, new p1.x(v0Var.f48172b, v0Var.f48171a));
        }
        f1 f1Var = b0Var2.N;
        int size = arrayList3.size();
        f1Var.getClass();
        b0Var2.N = new f1(new Random(f1Var.f40336a.nextLong())).a(size);
        b1 b1Var = new b1(arrayList2, b0Var2.N);
        boolean zP = b1Var.p();
        int i12 = b1Var.f47964d;
        if (!zP && -1 >= i12) {
            throw new u22();
        }
        int iA = b1Var.a(false);
        w0 w0VarY0 = b0Var2.Y0(b0Var2.f47941h0, b1Var, b0Var2.Z0(b1Var, iA, C.TIME_UNSET));
        int i13 = w0VarY0.f48183e;
        if (i13 == 1) {
            i13 = 1;
        } else if (b1Var.p()) {
            i13 = 4;
        } else if (iA != -1) {
            if (iA >= i12) {
                i13 = 4;
            } else {
                i13 = 2;
            }
        }
        w0 w0VarX0 = p1.b0.X0(w0VarY0, i13);
        b0Var2.l.f48055h.a(17, new e0(arrayList3, b0Var2.N, iA, l1.y.M(C.TIME_UNSET))).b();
        b0Var2.j1(w0VarX0, 0, (b0Var2.f47941h0.f48180b.f40307a.equals(w0VarX0.f48180b.f40307a) || b0Var2.f47941h0.f48179a.p()) ? false : true, 4, b0Var2.P0(w0VarX0), -1);
        ((p1.b0) this.f49093e).b1();
        p1.k kVar = this.f49093e;
        ((p1.b0) kVar).f47947m.a(c(kVar, textureRegistry$SurfaceProducer));
        p1.k kVar2 = this.f49093e;
        boolean z10 = bVar.f45919a;
        i1.e eVar = new i1.e(3);
        int i14 = !z10 ? 1 : 0;
        p1.b0 b0Var3 = (p1.b0) kVar2;
        mk0 mk0Var = b0Var3.f47947m;
        b0Var3.l1();
        if (b0Var3.f47936e0) {
            return;
        }
        if (!Objects.equals(b0Var3.Y, eVar)) {
            b0Var3.Y = eVar;
            b0Var3.d1(1, 3, eVar);
            mk0Var.c(20, new k3.j(eVar, 13));
        }
        h0 h0Var = b0Var3.l;
        i1.e eVar2 = b0Var3.Y;
        l1.w wVar = h0Var.f48055h;
        wVar.getClass();
        l1.v vVarB = l1.w.b();
        vVarB.f44823a = wVar.f44825a.obtainMessage(31, i14, 0, eVar2);
        vVarB.b();
        mk0Var.b();
    }

    public abstract h c(p1.k kVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    public void d() {
        String str;
        boolean zB;
        cj.h hVar = this.f49092d;
        if (hVar != null) {
            xi.f fVar = (xi.f) hVar.f6449b;
            String str2 = (String) hVar.f6450c;
            a0.f49027a.getClass();
            z.b(fVar, null, str2);
        }
        p1.b0 b0Var = (p1.b0) this.f49093e;
        b0Var.getClass();
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(b0Var)));
        sb2.append(" [AndroidXMedia3/1.9.2] [");
        sb2.append(l1.y.f44830a);
        sb2.append("] [");
        HashSet hashSet = i1.z.f42720a;
        synchronized (i1.z.class) {
            str = i1.z.f42721b;
        }
        sb2.append(str);
        sb2.append(X3.j.f27836e);
        l1.a.j("ExoPlayerImpl", sb2.toString());
        b0Var.l1();
        b0Var.f47959y.c();
        int i10 = 0;
        b0Var.f47960z.h(false);
        b0Var.A.b(false);
        p1.a0 a0Var = b0Var.E;
        if (a0Var != null && Build.VERSION.SDK_INT >= 34) {
            p1.a0.a(a0Var);
        }
        z40 z40Var = b0Var.D;
        ((l1.w) z40Var.f22496f).f44825a.removeCallbacksAndMessages(null);
        p1.b0 b0Var2 = (p1.b0) z40Var.f22491a;
        l1.s sVar = (l1.s) z40Var.f22492b;
        b0Var2.l1();
        mk0 mk0Var = b0Var2.f47947m;
        sVar.getClass();
        mk0Var.f();
        CopyOnWriteArraySet<l1.m> copyOnWriteArraySet = (CopyOnWriteArraySet) mk0Var.f17464f;
        for (l1.m mVar : copyOnWriteArraySet) {
            if (mVar.f44796a.equals(sVar)) {
                l1.l lVar = (l1.l) mk0Var.f17463e;
                mVar.f44799d = true;
                if (lVar != null && mVar.f44798c) {
                    mVar.f44798c = false;
                    lVar.a(mVar.f44796a, mVar.f44797b.b());
                }
                copyOnWriteArraySet.remove(mVar);
            }
        }
        h0 h0Var = b0Var.l;
        if (h0Var.J || !h0Var.f48057j.getThread().isAlive()) {
            zB = true;
        } else {
            h0Var.J = true;
            l1.f fVar2 = new l1.f(h0Var.f48062p);
            h0Var.f48055h.a(7, fVar2).b();
            zB = fVar2.b(h0Var.f48067u);
        }
        if (!zB) {
            b0Var.f47947m.e(10, new ni.g(5));
        }
        b0Var.f47947m.d();
        b0Var.f47944j.f44825a.removeCallbacksAndMessages(null);
        j2.d dVar = b0Var.f47955u;
        q1.f fVar3 = b0Var.f47953s;
        CopyOnWriteArrayList<j2.c> copyOnWriteArrayList = (CopyOnWriteArrayList) ((j2.g) dVar).f43649c.f3698b;
        for (j2.c cVar : copyOnWriteArrayList) {
            if (cVar.f43631b == fVar3) {
                cVar.f43632c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        w0 w0Var = b0Var.f47941h0;
        if (w0Var.f48193p) {
            b0Var.f47941h0 = w0Var.a();
        }
        w0 w0VarX0 = p1.b0.X0(b0Var.f47941h0, 1);
        b0Var.f47941h0 = w0VarX0;
        w0 w0VarC = w0VarX0.c(w0VarX0.f48180b);
        b0Var.f47941h0 = w0VarC;
        w0VarC.f48194q = w0VarC.f48196s;
        b0Var.f47941h0.f48195r = 0L;
        q1.f fVar4 = b0Var.f47953s;
        l1.w wVar = fVar4.f48536h;
        wVar.getClass();
        wVar.c(new q1.c(fVar4, i10));
        b0Var.c1();
        Surface surface = b0Var.T;
        if (surface != null) {
            surface.release();
            b0Var.T = null;
        }
        oa.p pVar = k1.c.f44242b;
        b0Var.f47936e0 = true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:??[OBJECT, ARRAY]) from 0x0089: INVOKE (r0v0 ?? I:java.util.ArrayList), (r8v0 ?? I:??[OBJECT, ARRAY]) VIRTUAL call: java.util.ArrayList.add(java.lang.Object):boolean A[MD:(E):boolean (c)] (LINE:138)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final qj.n e() {
        /*
            r21 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r21
            p1.k r1 = r1.f49093e
            p1.b0 r1 = (p1.b0) r1
            r1.l1()
            p1.w0 r1 = r1.f47941h0
            i2.v r1 = r1.f48187i
            i1.v0 r1 = r1.f42840d
            r3 = 0
        L15:
            oa.j0 r4 = r1.f42710a
            int r4 = r4.size()
            if (r3 >= r4) goto L97
            oa.j0 r4 = r1.f42710a
            java.lang.Object r4 = r4.get(r3)
            i1.u0 r4 = (i1.u0) r4
            i1.q0 r5 = r4.f42700b
            int r5 = r5.f42661c
            r6 = 1
            if (r5 != r6) goto L91
            r5 = 0
        L2d:
            int r6 = r4.f42699a
            if (r5 >= r6) goto L91
            i1.q0 r6 = r4.f42700b
            i1.p[] r6 = r6.f42662d
            r6 = r6[r5]
            boolean[] r7 = r4.f42703e
            boolean r15 = r7[r5]
            qj.g r8 = new qj.g
            long r9 = (long) r3
            long r11 = (long) r5
            java.lang.String r13 = r6.f42632b
            java.lang.String r14 = r6.f42634d
            int r7 = r6.f42640j
            r2 = -1
            r16 = 0
            r20 = r3
            if (r7 == r2) goto L52
            long r2 = (long) r7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L54
        L52:
            r2 = r16
        L54:
            int r3 = r6.G
            r7 = -1
            r17 = r8
            if (r3 == r7) goto L61
            long r7 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            goto L63
        L61:
            r3 = r16
        L63:
            int r7 = r6.F
            r8 = -1
            if (r7 == r8) goto L70
            long r7 = (long) r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r18 = r7
            goto L72
        L70:
            r18 = r16
        L72:
            java.lang.String r6 = r6.f42641k
            if (r6 == 0) goto L7f
            r19 = r6
            r16 = r2
            r8 = r17
        L7c:
            r17 = r3
            goto L86
        L7f:
            r19 = r16
            r8 = r17
            r16 = r2
            goto L7c
        L86:
            r8.<init>(r9, r11, r13, r14, r15, r16, r17, r18, r19)
            r0.add(r8)
            int r5 = r5 + 1
            r3 = r20
            goto L2d
        L91:
            r20 = r3
            int r3 = r20 + 1
            goto L15
        L97:
            qj.n r1 = new qj.n
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.w.e():qj.n");
    }

    public final void f(long j10, long j11) {
        int i10;
        i2.i iVar;
        i2.i iVar2;
        i2.p pVar = this.f49094f;
        if (pVar == null) {
            throw new IllegalStateException("Cannot select audio track: track selector is null");
        }
        p1.b0 b0Var = (p1.b0) this.f49093e;
        b0Var.l1();
        i1.v0 v0Var = b0Var.f47941h0.f48187i.f42840d;
        if (j10 < 0 || j10 >= v0Var.f42710a.size()) {
            StringBuilder sbL = wi.d.l(j10, "Cannot select audio track: groupIndex ", " is out of bounds (available groups: ");
            sbL.append(v0Var.f42710a.size());
            sbL.append(")");
            throw new IllegalArgumentException(sbL.toString());
        }
        u0 u0Var = (u0) v0Var.f42710a.get((int) j10);
        q0 q0Var = u0Var.f42700b;
        int i11 = u0Var.f42699a;
        if (q0Var.f42661c != 1) {
            throw new IllegalArgumentException(l1.d.i(wi.d.l(j10, "Cannot select audio track: group at index ", " is not an audio track (type: "), u0Var.f42700b.f42661c, ")"));
        }
        if (j11 < 0 || (i10 = (int) j11) >= i11) {
            throw new IllegalArgumentException("Cannot select audio track: trackIndex " + j11 + " is out of bounds (available tracks in group: " + i11 + ")");
        }
        r0 r0Var = new r0(q0Var, i10);
        q0 q0Var2 = r0Var.f42665a;
        synchronized (pVar.f42819c) {
            iVar = pVar.f42822f;
        }
        iVar.getClass();
        i2.h hVar = new i2.h(iVar);
        int i12 = q0Var2.f42661c;
        Iterator it = hVar.l.values().iterator();
        while (it.hasNext()) {
            if (((r0) it.next()).f42665a.f42661c == i12) {
                it.remove();
            }
        }
        hVar.l.put(q0Var2, r0Var);
        i2.i iVar3 = new i2.i(hVar);
        pVar.h(iVar3);
        synchronized (pVar.f42819c) {
            iVar2 = pVar.f42822f;
        }
        i2.h hVar2 = new i2.h(iVar2);
        hVar2.a(iVar3);
        pVar.h(new i2.i(hVar2));
    }

    public final void g(boolean z10) {
        int i10 = z10 ? 2 : 0;
        p1.b0 b0Var = (p1.b0) this.f49093e;
        mk0 mk0Var = b0Var.f47947m;
        b0Var.l1();
        if (b0Var.H != i10) {
            b0Var.H = i10;
            l1.w wVar = b0Var.l.f48055h;
            wVar.getClass();
            l1.v vVarB = l1.w.b();
            vVarB.f44823a = wVar.f44825a.obtainMessage(11, i10, 0);
            vVarB.b();
            mk0Var.c(8, new p1.q(i10, 0));
            b0Var.h1();
            mk0Var.b();
        }
    }

    public final void h(double d10) {
        g0 g0Var = new g0((float) d10);
        p1.b0 b0Var = (p1.b0) this.f49093e;
        b0Var.l1();
        if (b0Var.f47941h0.f48192o.equals(g0Var)) {
            return;
        }
        w0 w0VarG = b0Var.f47941h0.g(g0Var);
        b0Var.I++;
        b0Var.l.f48055h.a(4, g0Var).b();
        b0Var.j1(w0VarG, 0, false, 5, C.TIME_UNSET, -1);
    }

    public final void i(double d10) {
        float fMax = (float) Math.max(0.0d, Math.min(1.0d, d10));
        p1.b0 b0Var = (p1.b0) this.f49093e;
        b0Var.l1();
        final float fI = l1.y.i(fMax, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (b0Var.Z == fI) {
            return;
        }
        b0Var.Z = fI;
        b0Var.l.f48055h.a(32, Float.valueOf(fI)).b();
        b0Var.f47947m.e(22, new l1.k() { // from class: p1.p
            @Override // l1.k
            public final void invoke(Object obj) {
                ((i1.i0) obj).t(fI);
            }
        });
    }
}
