package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2748Se implements W20, InterfaceC4985x40, JI, MI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3724a;
    public final int[] b;
    public final C4619sw[] c;
    public final boolean[] d;
    public final InterfaceC2774Te e;
    public final InterfaceC4897w40 f;
    public final DO g;
    public final G7 h;
    public final OI i;
    public final C4581sZ j;
    public final ArrayList k;
    public final List l;
    public final V20 m;
    public final V20[] n;
    public final F9 o;
    public AbstractC2567Le p;
    public C4619sw q;
    public InterfaceC2722Re r;
    public long s;
    public long t;
    public int u;
    public D9 v;
    public boolean w;

    public C2748Se(int i, int[] iArr, C4619sw[] c4619swArr, InterfaceC2774Te interfaceC2774Te, InterfaceC4897w40 interfaceC4897w40, C2833Vl c2833Vl, long j, InterfaceC3296dq interfaceC3296dq, C3031aq c3031aq, G7 g7, DO r13) {
        this.f3724a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.b = iArr;
        this.c = c4619swArr == null ? new C4619sw[0] : c4619swArr;
        this.e = interfaceC2774Te;
        this.f = interfaceC4897w40;
        this.g = r13;
        this.h = g7;
        this.i = new OI("ChunkSampleStream");
        this.j = new C4581sZ(1);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.n = new V20[length];
        this.d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        V20[] v20Arr = new V20[i3];
        interfaceC3296dq.getClass();
        c3031aq.getClass();
        V20 v20 = new V20(c2833Vl, interfaceC3296dq, c3031aq);
        this.m = v20;
        iArr2[0] = i;
        v20Arr[0] = v20;
        while (i2 < length) {
            V20 v21 = new V20(c2833Vl, null, null);
            this.n[i2] = v21;
            int i4 = i2 + 1;
            v20Arr[i4] = v21;
            iArr2[i4] = this.b[i2];
            i2 = i4;
        }
        this.o = new F9(iArr2, v20Arr);
        this.s = j;
        this.t = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int a(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        if (i()) {
            return -3;
        }
        D9 d9 = this.v;
        V20 v20 = this.m;
        if (d9 != null && d9.c(0) <= v20.q()) {
            return -3;
        }
        j();
        return v20.A(c3692iN, c2677Pl, i, this.w);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void c(LI li, long j, long j2) {
        AbstractC2567Le abstractC2567Le = (AbstractC2567Le) li;
        this.p = null;
        this.e.d(abstractC2567Le);
        long j3 = abstractC2567Le.f3364a;
        Uri uri = abstractC2567Le.i.c;
        FI fi = new FI();
        this.h.getClass();
        this.g.g(fi, abstractC2567Le.c, this.f3724a, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h);
        this.f.o(this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        long j2;
        List listEmptyList;
        if (!this.w) {
            OI oi = this.i;
            if (!oi.d() && !oi.c()) {
                boolean zI = i();
                if (zI) {
                    listEmptyList = Collections.emptyList();
                    j2 = this.s;
                } else {
                    j2 = g().h;
                    listEmptyList = this.l;
                }
                this.e.f(j, j2, listEmptyList, this.j);
                C4581sZ c4581sZ = this.j;
                boolean z = c4581sZ.f4984a;
                AbstractC2567Le abstractC2567Le = (AbstractC2567Le) c4581sZ.b;
                c4581sZ.b = null;
                c4581sZ.f4984a = false;
                if (z) {
                    this.s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    this.w = true;
                    return true;
                }
                if (abstractC2567Le == null) {
                    return false;
                }
                this.p = abstractC2567Le;
                boolean z2 = abstractC2567Le instanceof D9;
                F9 f9 = this.o;
                if (z2) {
                    D9 d9 = (D9) abstractC2567Le;
                    if (zI) {
                        long j3 = this.s;
                        if (d9.g != j3) {
                            this.m.t = j3;
                            for (V20 v20 : this.n) {
                                v20.t = this.s;
                            }
                        }
                        this.s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    }
                    d9.m = f9;
                    V20[] v20Arr = f9.b;
                    int[] iArr = new int[v20Arr.length];
                    for (int i = 0; i < v20Arr.length; i++) {
                        V20 v21 = v20Arr[i];
                        iArr[i] = v21.q + v21.p;
                    }
                    d9.n = iArr;
                    this.k.add(d9);
                } else if (abstractC2567Le instanceof C3594hD) {
                    ((C3594hD) abstractC2567Le).k = f9;
                }
                oi.f(abstractC2567Le, this, this.h.A(abstractC2567Le.c));
                this.g.l(new FI(abstractC2567Le.b), abstractC2567Le.c, this.f3724a, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h);
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void d(LI li, long j, long j2, boolean z) {
        AbstractC2567Le abstractC2567Le = (AbstractC2567Le) li;
        this.p = null;
        this.v = null;
        long j3 = abstractC2567Le.f3364a;
        Uri uri = abstractC2567Le.i.c;
        FI fi = new FI();
        this.h.getClass();
        this.g.d(fi, abstractC2567Le.c, this.f3724a, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h);
        if (z) {
            return;
        }
        if (i()) {
            this.m.C(false);
            for (V20 v20 : this.n) {
                v20.C(false);
            }
        } else if (abstractC2567Le instanceof D9) {
            ArrayList arrayList = this.k;
            f(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
        }
        this.f.o(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final C2868Wu e(LI li, long j, long j2, IOException iOException, int i) {
        C2868Wu c2868WuB;
        AbstractC2567Le abstractC2567Le = (AbstractC2567Le) li;
        long j3 = abstractC2567Le.i.b;
        boolean z = abstractC2567Le instanceof D9;
        ArrayList arrayList = this.k;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && h(size)) ? false : true;
        Uri uri = abstractC2567Le.i.c;
        FI fi = new FI();
        BR br = new BR(fi, new C3779jO(abstractC2567Le.c, this.f3724a, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, Ug0.W(abstractC2567Le.g), Ug0.W(abstractC2567Le.h)), iOException, i);
        InterfaceC2774Te interfaceC2774Te = this.e;
        G7 g7 = this.h;
        if (!interfaceC2774Te.e(abstractC2567Le, z2, br, g7)) {
            c2868WuB = null;
        } else if (z2) {
            c2868WuB = OI.e;
            if (z) {
                FW.s(f(size) == abstractC2567Le);
                if (arrayList.isEmpty()) {
                    this.s = this.t;
                }
            }
        } else {
            AbstractC4038mJ.f();
            c2868WuB = null;
        }
        if (c2868WuB == null) {
            g7.getClass();
            long jB = G7.B(br);
            c2868WuB = jB != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? OI.b(jB, false) : OI.f;
        }
        boolean z3 = !c2868WuB.c();
        C2868Wu c2868Wu = c2868WuB;
        this.g.i(fi, abstractC2567Le.c, this.f3724a, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h, iOException, z3);
        if (z3) {
            this.p = null;
            g7.getClass();
            this.f.o(this);
        }
        return c2868Wu;
    }

    public final D9 f(int i) {
        ArrayList arrayList = this.k;
        D9 d9 = (D9) arrayList.get(i);
        Ug0.Q(arrayList, i, arrayList.size());
        this.u = Math.max(this.u, arrayList.size());
        int i2 = 0;
        this.m.k(d9.c(0));
        while (true) {
            V20[] v20Arr = this.n;
            if (i2 >= v20Arr.length) {
                return d9;
            }
            V20 v20 = v20Arr[i2];
            i2++;
            v20.k(d9.c(i2));
        }
    }

    public final D9 g() {
        return (D9) DM.e(this.k, 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        if (this.w) {
            return Long.MIN_VALUE;
        }
        if (i()) {
            return this.s;
        }
        long jMax = this.t;
        D9 d9G = g();
        if (!d9G.b()) {
            ArrayList arrayList = this.k;
            d9G = arrayList.size() > 1 ? (D9) DM.e(arrayList, 2) : null;
        }
        if (d9G != null) {
            jMax = Math.max(jMax, d9G.h);
        }
        return Math.max(jMax, this.m.n());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        if (i()) {
            return this.s;
        }
        if (this.w) {
            return Long.MIN_VALUE;
        }
        return g().h;
    }

    public final boolean h(int i) {
        int iQ;
        D9 d9 = (D9) this.k.get(i);
        if (this.m.q() > d9.c(0)) {
            return true;
        }
        int i2 = 0;
        do {
            V20[] v20Arr = this.n;
            if (i2 >= v20Arr.length) {
                return false;
            }
            iQ = v20Arr[i2].q();
            i2++;
        } while (iQ <= d9.c(i2));
        return true;
    }

    public final boolean i() {
        return this.s != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return this.i.d();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final boolean isReady() {
        return !i() && this.m.v(this.w);
    }

    public final void j() {
        int iL = l(this.m.q(), this.u - 1);
        while (true) {
            int i = this.u;
            if (i > iL) {
                return;
            }
            this.u = i + 1;
            D9 d9 = (D9) this.k.get(i);
            C4619sw c4619sw = d9.d;
            if (!c4619sw.equals(this.q)) {
                this.g.b(this.f3724a, c4619sw, d9.e, d9.f, d9.g);
            }
            this.q = c4619sw;
        }
    }

    public final int l(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((D9) arrayList.get(i2)).c(0) <= i);
        return i2 - 1;
    }

    public final void m(InterfaceC2722Re interfaceC2722Re) {
        this.r = interfaceC2722Re;
        V20 v20 = this.m;
        v20.i();
        InterfaceC2889Xp interfaceC2889Xp = v20.h;
        if (interfaceC2889Xp != null) {
            interfaceC2889Xp.b(v20.e);
            v20.h = null;
            v20.g = null;
        }
        for (V20 v21 : this.n) {
            v21.i();
            InterfaceC2889Xp interfaceC2889Xp2 = v21.h;
            if (interfaceC2889Xp2 != null) {
                interfaceC2889Xp2.b(v21.e);
                v21.h = null;
                v21.g = null;
            }
        }
        this.i.e(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final void maybeThrowError() throws IOException {
        OI oi = this.i;
        oi.maybeThrowError();
        this.m.x();
        if (oi.d()) {
            return;
        }
        this.e.maybeThrowError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (r10.m.F(r11, r11 < getNextLoadPositionUs()) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(long r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2748Se.n(long):void");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MI
    public final void onLoaderReleased() {
        this.m.B();
        for (V20 v20 : this.n) {
            v20.B();
        }
        this.e.release();
        InterfaceC2722Re interfaceC2722Re = this.r;
        if (interfaceC2722Re != null) {
            C2780Tk c2780Tk = (C2780Tk) interfaceC2722Re;
            synchronized (c2780Tk) {
                TU tu = (TU) c2780Tk.n.remove(this);
                if (tu != null) {
                    tu.f3772a.B();
                }
            }
        }
    }

    public final void q(long j) {
        long j2;
        if (i()) {
            return;
        }
        V20 v20 = this.m;
        int i = v20.q;
        v20.h(j, true);
        V20 v21 = this.m;
        int i2 = v21.q;
        if (i2 > i) {
            synchronized (v21) {
                j2 = v21.p == 0 ? Long.MIN_VALUE : v21.n[v21.r];
            }
            int i3 = 0;
            while (true) {
                V20[] v20Arr = this.n;
                if (i3 >= v20Arr.length) {
                    break;
                }
                v20Arr[i3].h(j2, this.d[i3]);
                i3++;
            }
        }
        int iMin = Math.min(l(i2, 0), this.u);
        if (iMin > 0) {
            Ug0.Q(this.k, 0, iMin);
            this.u -= iMin;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        OI oi = this.i;
        if (oi.c() || i()) {
            return;
        }
        boolean zD = oi.d();
        ArrayList arrayList = this.k;
        List list = this.l;
        InterfaceC2774Te interfaceC2774Te = this.e;
        if (zD) {
            AbstractC2567Le abstractC2567Le = this.p;
            abstractC2567Le.getClass();
            boolean z = abstractC2567Le instanceof D9;
            if (!(z && h(arrayList.size() - 1)) && interfaceC2774Te.c(j, abstractC2567Le, list)) {
                oi.a();
                if (z) {
                    this.v = (D9) abstractC2567Le;
                    return;
                }
                return;
            }
            return;
        }
        int preferredQueueSize = interfaceC2774Te.getPreferredQueueSize(j, list);
        if (preferredQueueSize < arrayList.size()) {
            FW.s(!oi.d());
            int size = arrayList.size();
            while (true) {
                if (preferredQueueSize >= size) {
                    preferredQueueSize = -1;
                    break;
                } else if (!h(preferredQueueSize)) {
                    break;
                } else {
                    preferredQueueSize++;
                }
            }
            if (preferredQueueSize == -1) {
                return;
            }
            long j2 = g().h;
            D9 d9F = f(preferredQueueSize);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
            this.w = false;
            DO r12 = this.g;
            r12.n(new C3779jO(1, this.f3724a, null, 3, null, r12.a(d9F.g), r12.a(j2)));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int skipData(long j) {
        if (i()) {
            return 0;
        }
        V20 v20 = this.m;
        int iS = v20.s(j, this.w);
        D9 d9 = this.v;
        if (d9 != null) {
            iS = Math.min(iS, d9.c(0) - v20.q());
        }
        v20.G(iS);
        j();
        return iS;
    }
}
