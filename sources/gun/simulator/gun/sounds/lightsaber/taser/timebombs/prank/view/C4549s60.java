package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4549s60 extends V implements InterfaceC4221oQ, InterfaceC4443qv {
    public final int e;
    public final int f;
    public final EnumC5024xb g;
    public Object[] h;
    public long i;
    public long j;
    public int k;
    public int l;

    public C4549s60(int i, int i2, EnumC5024xb enumC5024xb) {
        this.e = i;
        this.f = i2;
        this.g = enumC5024xb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void j(C4549s60 c4549s60, InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C4461r60 c4461r60;
        C4549s60 c4549s61;
        Throwable th;
        C4725u60 c4725u60;
        InterfaceC4530rv interfaceC4530rv2;
        InterfaceC5000xE interfaceC5000xE;
        if (interfaceC2857Wj instanceof C4461r60) {
            c4461r60 = (C4461r60) interfaceC2857Wj;
            int i = c4461r60.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4461r60.g = i - Integer.MIN_VALUE;
            } else {
                c4461r60 = new C4461r60(c4549s60, interfaceC2857Wj);
            }
        } else {
            c4461r60 = new C4461r60(c4549s60, interfaceC2857Wj);
        }
        Object obj = c4461r60.e;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c4461r60.g;
        if (i2 != 0) {
            if (i2 == 1) {
                c4725u60 = c4461r60.c;
                InterfaceC4530rv interfaceC4530rv3 = c4461r60.b;
                C4549s60 c4549s62 = c4461r60.f4916a;
                try {
                    AbstractC3375el.b0(obj);
                    interfaceC4530rv2 = interfaceC4530rv3;
                    c4549s60 = c4549s62;
                    try {
                        interfaceC5000xE = (InterfaceC5000xE) c4461r60.getContext().get(G7.e);
                    } catch (Throwable th2) {
                        c4549s61 = c4549s60;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c4549s61 = c4549s62;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC5000xE interfaceC5000xE2 = c4461r60.d;
                c4725u60 = c4461r60.c;
                InterfaceC4530rv interfaceC4530rv4 = c4461r60.b;
                c4549s61 = c4461r60.f4916a;
                try {
                    AbstractC3375el.b0(obj);
                    interfaceC4530rv2 = interfaceC4530rv4;
                    interfaceC5000xE = interfaceC5000xE2;
                    c4549s60 = c4549s61;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            c4549s61.f(c4725u60);
            throw th;
        }
        AbstractC3375el.b0(obj);
        C4725u60 c4725u61 = (C4725u60) c4549s60.c();
        try {
            if (interfaceC4530rv instanceof C4056ma0) {
                c4461r60.f4916a = c4549s60;
                c4461r60.b = interfaceC4530rv;
                c4461r60.c = c4725u61;
                c4461r60.g = 1;
                if (((C4056ma0) interfaceC4530rv).c(c4461r60) == enumC4602sk) {
                    return;
                }
            }
            interfaceC4530rv2 = interfaceC4530rv;
            c4725u60 = c4725u61;
            interfaceC5000xE = (InterfaceC5000xE) c4461r60.getContext().get(G7.e);
        } catch (Throwable th5) {
            c4549s61 = c4549s60;
            th = th5;
            c4725u60 = c4725u61;
        }
        while (true) {
            Object objR = c4549s60.r(c4725u60);
            if (objR == AbstractC4637t60.f5016a) {
                c4461r60.f4916a = c4549s60;
                c4461r60.b = interfaceC4530rv2;
                c4461r60.c = c4725u60;
                c4461r60.d = interfaceC5000xE;
                c4461r60.g = 2;
                if (c4549s60.h(c4725u60, c4461r60) == enumC4602sk) {
                    return;
                }
            } else {
                if (interfaceC5000xE != null && !interfaceC5000xE.isActive()) {
                    throw interfaceC5000xE.k();
                }
                c4461r60.f4916a = c4549s60;
                c4461r60.b = interfaceC4530rv2;
                c4461r60.c = c4725u60;
                c4461r60.d = interfaceC5000xE;
                c4461r60.g = 3;
                if (interfaceC4530rv2.emit(objR, c4461r60) == enumC4602sk) {
                    return;
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ
    public final boolean a(Object obj) {
        int i;
        boolean z;
        InterfaceC2857Wj[] interfaceC2857WjArrM = AbstractC2871Wx.b;
        synchronized (this) {
            if (p(obj)) {
                interfaceC2857WjArrM = m(interfaceC2857WjArrM);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC2857Wj interfaceC2857Wj : interfaceC2857WjArrM) {
            if (interfaceC2857Wj != null) {
                interfaceC2857Wj.resumeWith(C5033xf0.f5238a);
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ
    public final void b() {
        synchronized (this) {
            s(n() + ((long) this.k), this.j, n() + ((long) this.k), n() + ((long) this.k) + ((long) this.l));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
    public final Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        j(this, interfaceC4530rv, interfaceC2857Wj);
        return EnumC4602sk.f4993a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V
    public final W d() {
        C4725u60 c4725u60 = new C4725u60();
        c4725u60.f5065a = -1L;
        return c4725u60;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V
    public final W[] e() {
        return new C4725u60[2];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
    public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        InterfaceC2857Wj[] interfaceC2857WjArrM;
        C4374q60 c4374q60;
        if (a(obj)) {
            return C5033xf0.f5238a;
        }
        C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        InterfaceC2857Wj[] interfaceC2857WjArrM2 = AbstractC2871Wx.b;
        synchronized (this) {
            try {
                if (p(obj)) {
                    c2798Uc.resumeWith(C5033xf0.f5238a);
                    interfaceC2857WjArrM = m(interfaceC2857WjArrM2);
                    c4374q60 = null;
                } else {
                    C4374q60 c4374q61 = new C4374q60(this, ((long) (this.k + this.l)) + n(), obj, c2798Uc);
                    l(c4374q61);
                    this.l++;
                    if (this.f == 0) {
                        interfaceC2857WjArrM2 = m(interfaceC2857WjArrM2);
                    }
                    interfaceC2857WjArrM = interfaceC2857WjArrM2;
                    c4374q60 = c4374q61;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4374q60 != null) {
            c2798Uc.n(new C4700tp(c4374q60, 0));
        }
        for (InterfaceC2857Wj interfaceC2857Wj2 : interfaceC2857WjArrM) {
            if (interfaceC2857Wj2 != null) {
                interfaceC2857Wj2.resumeWith(C5033xf0.f5238a);
            }
        }
        Object objS = c2798Uc.s();
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        if (objS != enumC4602sk) {
            objS = C5033xf0.f5238a;
        }
        return objS == enumC4602sk ? objS : C5033xf0.f5238a;
    }

    public final Object h(C4725u60 c4725u60, C4461r60 c4461r60) {
        C2798Uc c2798Uc = new C2798Uc(1, WD.w(c4461r60));
        c2798Uc.t();
        synchronized (this) {
            if (q(c4725u60) < 0) {
                c4725u60.b = c2798Uc;
            } else {
                c2798Uc.resumeWith(C5033xf0.f5238a);
            }
        }
        Object objS = c2798Uc.s();
        return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
    }

    public final void i() {
        if (this.f != 0 || this.l > 1) {
            Object[] objArr = this.h;
            AbstractC2995aW.n(objArr);
            while (this.l > 0) {
                long jN = n();
                int i = this.k;
                int i2 = this.l;
                if (objArr[(objArr.length - 1) & ((int) ((jN + ((long) (i + i2))) - 1))] != AbstractC4637t60.f5016a) {
                    return;
                }
                this.l = i2 - 1;
                AbstractC4637t60.c(objArr, n() + ((long) (this.k + this.l)), null);
            }
        }
    }

    public final void k() {
        W[] wArr;
        Object[] objArr = this.h;
        AbstractC2995aW.n(objArr);
        AbstractC4637t60.c(objArr, n(), null);
        this.k--;
        long jN = n() + 1;
        if (this.i < jN) {
            this.i = jN;
        }
        if (this.j < jN) {
            if (this.b != 0 && (wArr = this.f3852a) != null) {
                for (W w : wArr) {
                    if (w != null) {
                        C4725u60 c4725u60 = (C4725u60) w;
                        long j = c4725u60.f5065a;
                        if (j >= 0 && j < jN) {
                            c4725u60.f5065a = jN;
                        }
                    }
                }
            }
            this.j = jN;
        }
    }

    public final void l(Object obj) {
        int i = this.k + this.l;
        Object[] objArrO = this.h;
        if (objArrO == null) {
            objArrO = o(null, 0, 2);
        } else if (i >= objArrO.length) {
            objArrO = o(objArrO, i, objArrO.length * 2);
        }
        AbstractC4637t60.c(objArrO, n() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wj[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final InterfaceC2857Wj[] m(InterfaceC2857Wj[] interfaceC2857WjArr) {
        W[] wArr;
        C4725u60 c4725u60;
        C2798Uc c2798Uc;
        int length = interfaceC2857WjArr.length;
        if (this.b != 0 && (wArr = this.f3852a) != null) {
            int length2 = wArr.length;
            int i = 0;
            while (i < length2) {
                W w = wArr[i];
                if (w == null || (c2798Uc = (c4725u60 = (C4725u60) w).b) == null || q(c4725u60) < 0) {
                    interfaceC2857WjArr = interfaceC2857WjArr;
                } else {
                    if (length >= interfaceC2857WjArr.length) {
                        interfaceC2857WjArr = interfaceC2857WjArr;
                        interfaceC2857WjArr = interfaceC2857WjArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC2857WjArr, Math.max(2, interfaceC2857WjArr.length * 2));
                        AbstractC2995aW.p(objArrCopyOf, "copyOf(this, newSize)");
                        interfaceC2857WjArr = objArrCopyOf;
                    }
                    interfaceC2857WjArr = interfaceC2857WjArr;
                    interfaceC2857WjArr = interfaceC2857WjArr;
                    ((InterfaceC2857Wj[]) interfaceC2857WjArr)[length] = c2798Uc;
                    c4725u60.b = null;
                    length++;
                }
                i++;
                interfaceC2857WjArr = interfaceC2857WjArr;
            }
            interfaceC2857WjArr = interfaceC2857WjArr;
        }
        return (InterfaceC2857Wj[]) interfaceC2857WjArr;
    }

    public final long n() {
        return Math.min(this.j, this.i);
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.h = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jN = n();
        for (int i3 = 0; i3 < i; i3++) {
            long j = ((long) i3) + jN;
            AbstractC4637t60.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean p(Object obj) {
        int i = this.b;
        int i2 = this.e;
        if (i == 0) {
            if (i2 != 0) {
                l(obj);
                int i3 = this.k + 1;
                this.k = i3;
                if (i3 > i2) {
                    k();
                }
                this.j = n() + ((long) this.k);
            }
            return true;
        }
        int i4 = this.k;
        int i5 = this.f;
        if (i4 >= i5 && this.j <= this.i) {
            int iOrdinal = this.g.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 2) {
                return true;
            }
        }
        l(obj);
        int i6 = this.k + 1;
        this.k = i6;
        if (i6 > i5) {
            k();
        }
        long jN = n() + ((long) this.k);
        long j = this.i;
        if (((int) (jN - j)) > i2) {
            s(j + 1, this.j, n() + ((long) this.k), n() + ((long) this.k) + ((long) this.l));
        }
        return true;
    }

    public final long q(C4725u60 c4725u60) {
        long j = c4725u60.f5065a;
        if (j < n() + ((long) this.k)) {
            return j;
        }
        if (this.f <= 0 && j <= n() && this.l != 0) {
            return j;
        }
        return -1L;
    }

    public final Object r(C4725u60 c4725u60) {
        Object obj;
        InterfaceC2857Wj[] interfaceC2857WjArrT = AbstractC2871Wx.b;
        synchronized (this) {
            long jQ = q(c4725u60);
            if (jQ < 0) {
                obj = AbstractC4637t60.f5016a;
            } else {
                long j = c4725u60.f5065a;
                Object[] objArr = this.h;
                AbstractC2995aW.n(objArr);
                Object obj2 = objArr[((int) jQ) & (objArr.length - 1)];
                if (obj2 instanceof C4374q60) {
                    obj2 = ((C4374q60) obj2).c;
                }
                c4725u60.f5065a = jQ + 1;
                Object obj3 = obj2;
                interfaceC2857WjArrT = t(j);
                obj = obj3;
            }
        }
        for (InterfaceC2857Wj interfaceC2857Wj : interfaceC2857WjArrT) {
            if (interfaceC2857Wj != null) {
                interfaceC2857Wj.resumeWith(C5033xf0.f5238a);
            }
        }
        return obj;
    }

    public final void s(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jN = n(); jN < jMin; jN++) {
            Object[] objArr = this.h;
            AbstractC2995aW.n(objArr);
            AbstractC4637t60.c(objArr, jN, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - jMin);
        this.l = (int) (j4 - j3);
    }

    public final InterfaceC2857Wj[] t(long j) {
        long j2;
        long j3;
        InterfaceC2857Wj[] interfaceC2857WjArr;
        long j4;
        W[] wArr;
        long j5 = this.j;
        InterfaceC2857Wj[] interfaceC2857WjArr2 = AbstractC2871Wx.b;
        if (j > j5) {
            return interfaceC2857WjArr2;
        }
        long jN = n();
        long j6 = ((long) this.k) + jN;
        int i = this.f;
        if (i == 0 && this.l > 0) {
            j6++;
        }
        if (this.b != 0 && (wArr = this.f3852a) != null) {
            for (W w : wArr) {
                if (w != null) {
                    long j7 = ((C4725u60) w).f5065a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.j) {
            return interfaceC2857WjArr2;
        }
        long jN2 = n() + ((long) this.k);
        int iMin = this.b > 0 ? Math.min(this.l, i - ((int) (jN2 - j6))) : this.l;
        long j8 = ((long) this.l) + jN2;
        int i2 = 1;
        if (iMin > 0) {
            InterfaceC2857Wj[] interfaceC2857WjArr3 = new InterfaceC2857Wj[iMin];
            Object[] objArr = this.h;
            AbstractC2995aW.n(objArr);
            long j9 = jN2;
            int i3 = 0;
            while (true) {
                if (jN2 >= j8) {
                    j2 = j6;
                    j3 = j8;
                    break;
                }
                j2 = j6;
                Object obj = objArr[((int) jN2) & (objArr.length - i2)];
                SE se = AbstractC4637t60.f5016a;
                if (obj != se) {
                    AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C4374q60 c4374q60 = (C4374q60) obj;
                    int i4 = i3 + 1;
                    j3 = j8;
                    interfaceC2857WjArr3[i3] = c4374q60.d;
                    AbstractC4637t60.c(objArr, jN2, se);
                    AbstractC4637t60.c(objArr, j9, c4374q60.c);
                    j4 = 1;
                    j9++;
                    if (i4 >= iMin) {
                        break;
                    }
                    i3 = i4;
                } else {
                    j3 = j8;
                    j4 = 1;
                }
                jN2 += j4;
                j6 = j2;
                j8 = j3;
                i2 = 1;
            }
            interfaceC2857WjArr = interfaceC2857WjArr3;
            jN2 = j9;
        } else {
            j2 = j6;
            j3 = j8;
            interfaceC2857WjArr = interfaceC2857WjArr2;
        }
        int i5 = (int) (jN2 - jN);
        long j10 = this.b == 0 ? jN2 : j2;
        long jMax = Math.max(this.i, jN2 - ((long) Math.min(this.e, i5)));
        if (i == 0 && jMax < j3) {
            Object[] objArr2 = this.h;
            AbstractC2995aW.n(objArr2);
            if (AbstractC2995aW.i(objArr2[((int) jMax) & (objArr2.length - 1)], AbstractC4637t60.f5016a)) {
                jN2++;
                jMax++;
            }
        }
        s(jMax, j10, jN2, j3);
        i();
        return (interfaceC2857WjArr.length == 0) ^ true ? m(interfaceC2857WjArr) : interfaceC2857WjArr;
    }
}
