package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class V20 implements InterfaceC4326pd0 {
    public C4619sw A;
    public C4619sw B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R20 f3856a;
    public final InterfaceC3296dq d;
    public final C3031aq e;
    public U20 f;
    public C4619sw g;
    public InterfaceC2889Xp h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final S20 b = new S20(0);
    public int i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public C4238od0[] o = new C4238od0[1000];
    public final A70 c = new A70(new C2911Yl(10));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public V20(C2833Vl c2833Vl, InterfaceC3296dq interfaceC3296dq, C3031aq c3031aq) {
        this.d = interfaceC3296dq;
        this.e = c3031aq;
        this.f3856a = new R20(c2833Vl);
    }

    public final int A(C3692iN c3692iN, C2677Pl c2677Pl, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        S20 s20 = this.b;
        synchronized (this) {
            try {
                c2677Pl.e = false;
                i2 = -3;
                if (u()) {
                    C4619sw c4619sw = ((T20) this.c.c(q())).f3749a;
                    if (z2 || c4619sw != this.g) {
                        y(c4619sw, c3692iN);
                        i2 = -5;
                    } else {
                        int iR = r(this.s);
                        if (w(iR)) {
                            c2677Pl.b = this.m[iR];
                            long j = this.n[iR];
                            c2677Pl.f = j;
                            if (j < this.t) {
                                c2677Pl.a(Integer.MIN_VALUE);
                            }
                            s20.f3696a = this.l[iR];
                            s20.b = this.k[iR];
                            s20.c = this.o[iR];
                            i2 = -4;
                        } else {
                            c2677Pl.e = true;
                        }
                    }
                } else if (z || this.w) {
                    c2677Pl.b = 4;
                    i2 = -4;
                } else {
                    C4619sw c4619sw2 = this.B;
                    if (c4619sw2 != null && (z2 || c4619sw2 != this.g)) {
                        y(c4619sw2, c3692iN);
                        i2 = -5;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !c2677Pl.c(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    R20 r20 = this.f3856a;
                    R20.f(r20.e, c2677Pl, this.b, r20.c);
                } else {
                    R20 r21 = this.f3856a;
                    r21.e = R20.f(r21.e, c2677Pl, this.b, r21.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void B() {
        C(true);
        InterfaceC2889Xp interfaceC2889Xp = this.h;
        if (interfaceC2889Xp != null) {
            interfaceC2889Xp.b(this.e);
            this.h = null;
            this.g = null;
        }
    }

    public final void C(boolean z) {
        R20 r20 = this.f3856a;
        r20.a(r20.d);
        Q20 q20 = r20.d;
        FW.s(q20.c == null);
        q20.f3586a = 0L;
        q20.b = r20.b;
        Q20 q21 = r20.d;
        r20.e = q21;
        r20.f = q21;
        r20.g = 0L;
        r20.f3641a.b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        A70 a70 = this.c;
        for (int i = 0; i < ((SparseArray) a70.c).size(); i++) {
            ((InterfaceC2494Ij) a70.d).accept(((SparseArray) a70.c).valueAt(i));
        }
        a70.b = -1;
        ((SparseArray) a70.c).clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }

    public final synchronized void D() {
        this.s = 0;
        R20 r20 = this.f3856a;
        r20.e = r20.d;
    }

    public final int E(InterfaceC3813jl interfaceC3813jl, int i, boolean z) throws EOFException {
        R20 r20 = this.f3856a;
        int iC = r20.c(i);
        Q20 q20 = r20.f;
        P3 p3 = q20.c;
        int i2 = interfaceC3813jl.read(p3.f3533a, ((int) (r20.g - q20.f3586a)) + p3.b, iC);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = r20.g + ((long) i2);
        r20.g = j;
        Q20 q21 = r20.f;
        if (j != q21.b) {
            return i2;
        }
        r20.f = q21.d;
        return i2;
    }

    public final synchronized boolean F(long j, boolean z) {
        D();
        int iR = r(this.s);
        if (u() && j >= this.n[iR] && (j <= this.v || z)) {
            int iL = l(iR, this.p - this.s, j, true);
            if (iL == -1) {
                return false;
            }
            this.t = j;
            this.s += iL;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void G(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        FW.h(z);
        this.s += i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public void a(long j, int i, int i2, int i3, C4238od0 c4238od0) {
        int i4;
        if (this.z) {
            C4619sw c4619sw = this.A;
            FW.t(c4619sw);
            e(c4619sw);
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.x) {
            if (!z) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = this.F + j;
        if (!this.D) {
            i4 = i;
        } else {
            if (j2 < this.t) {
                return;
            }
            if (i5 == 0) {
                if (!this.E) {
                    Objects.toString(this.B);
                    AbstractC4038mJ.f();
                    this.E = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.G) {
            if (!z) {
                return;
            }
            synchronized (this) {
                if (this.p == 0) {
                    boolean z2 = j2 > this.u;
                    if (!z2) {
                        return;
                    }
                } else {
                    if (o() >= j2) {
                        return;
                    }
                    int i6 = this.p;
                    int iR = r(i6 - 1);
                    while (i6 > this.s && this.n[iR] >= j2) {
                        i6--;
                        iR--;
                        if (iR == -1) {
                            iR = this.i - 1;
                        }
                    }
                    j(this.q + i6);
                }
                this.G = false;
            }
        }
        f(j2, i4, (this.f3856a.g - ((long) i2)) - ((long) i3), i2, c4238od0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void b(int i, JT jt) {
        while (true) {
            R20 r20 = this.f3856a;
            if (i <= 0) {
                r20.getClass();
                return;
            }
            int iC = r20.c(i);
            Q20 q20 = r20.f;
            P3 p3 = q20.c;
            jt.d(p3.f3533a, ((int) (r20.g - q20.f3586a)) + p3.b, iC);
            i -= iC;
            long j = r20.g + ((long) iC);
            r20.g = j;
            Q20 q21 = r20.f;
            if (j == q21.b) {
                r20.f = q21.d;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final int c(InterfaceC3813jl interfaceC3813jl, int i, boolean z) {
        return E(interfaceC3813jl, i, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final /* synthetic */ void d(int i, JT jt) {
        AbstractC3950lJ.a(this, jt, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void e(C4619sw c4619sw) {
        C4619sw c4619swM = m(c4619sw);
        boolean z = false;
        this.z = false;
        this.A = c4619sw;
        synchronized (this) {
            try {
                this.y = false;
                if (!Ug0.a(c4619swM, this.B)) {
                    if (((SparseArray) this.c.c).size() != 0) {
                        Object obj = this.c.c;
                        if (((T20) ((SparseArray) obj).valueAt(((SparseArray) obj).size() - 1)).f3749a.equals(c4619swM)) {
                            Object obj2 = this.c.c;
                            this.B = ((T20) ((SparseArray) obj2).valueAt(((SparseArray) obj2).size() - 1)).f3749a;
                        }
                        C4619sw c4619sw2 = this.B;
                        this.D = AbstractC5011xP.a(c4619sw2.l, c4619sw2.i);
                        this.E = false;
                        z = true;
                    }
                    this.B = c4619swM;
                    C4619sw c4619sw3 = this.B;
                    this.D = AbstractC5011xP.a(c4619sw3.l, c4619sw3.i);
                    this.E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        U20 u20 = this.f;
        if (u20 == null || !z) {
            return;
        }
        u20.f();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ad A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0081, B:23:0x0085, B:25:0x0090, B:26:0x00a4, B:28:0x00ad, B:24:0x008e, B:19:0x0063), top: B:33:0x0001 }] */
    public final synchronized void f(long j, int i, long j2, int i2, C4238od0 c4238od0) {
        int i3;
        int i4;
        try {
            int i5 = this.p;
            if (i5 > 0) {
                int iR = r(i5 - 1);
                FW.h(this.k[iR] + ((long) this.l[iR]) <= j2);
            }
            this.w = (536870912 & i) != 0;
            this.v = Math.max(this.v, j);
            int iR2 = r(this.p);
            this.n[iR2] = j;
            this.k[iR2] = j2;
            this.l[iR2] = i2;
            this.m[iR2] = i;
            this.o[iR2] = c4238od0;
            this.j[iR2] = this.C;
            if (((SparseArray) this.c.c).size() != 0) {
                Object obj = this.c.c;
                if (!((T20) ((SparseArray) obj).valueAt(((SparseArray) obj).size() - 1)).f3749a.equals(this.B)) {
                }
                i3 = this.p + 1;
                this.p = i3;
                i4 = this.i;
                if (i3 == i4) {
                    int i6 = i4 + 1000;
                    int[] iArr = new int[i6];
                    long[] jArr = new long[i6];
                    long[] jArr2 = new long[i6];
                    int[] iArr2 = new int[i6];
                    int[] iArr3 = new int[i6];
                    C4238od0[] c4238od0Arr = new C4238od0[i6];
                    int i7 = this.r;
                    int i8 = i4 - i7;
                    System.arraycopy(this.k, i7, jArr, 0, i8);
                    System.arraycopy(this.n, this.r, jArr2, 0, i8);
                    System.arraycopy(this.m, this.r, iArr2, 0, i8);
                    System.arraycopy(this.l, this.r, iArr3, 0, i8);
                    System.arraycopy(this.o, this.r, c4238od0Arr, 0, i8);
                    System.arraycopy(this.j, this.r, iArr, 0, i8);
                    int i9 = this.r;
                    System.arraycopy(this.k, 0, jArr, i8, i9);
                    System.arraycopy(this.n, 0, jArr2, i8, i9);
                    System.arraycopy(this.m, 0, iArr2, i8, i9);
                    System.arraycopy(this.l, 0, iArr3, i8, i9);
                    System.arraycopy(this.o, 0, c4238od0Arr, i8, i9);
                    System.arraycopy(this.j, 0, iArr, i8, i9);
                    this.k = jArr;
                    this.n = jArr2;
                    this.m = iArr2;
                    this.l = iArr3;
                    this.o = c4238od0Arr;
                    this.j = iArr;
                    this.r = 0;
                    this.i = i6;
                }
            }
            InterfaceC3296dq interfaceC3296dq = this.d;
            InterfaceC3208cq interfaceC3208cqH = interfaceC3296dq != null ? interfaceC3296dq.h(this.e, this.B) : InterfaceC3208cq.d1;
            A70 a70 = this.c;
            int i10 = this.q + this.p;
            C4619sw c4619sw = this.B;
            c4619sw.getClass();
            a70.a(i10, new T20(c4619sw, interfaceC3208cqH));
            i3 = this.p + 1;
            this.p = i3;
            i4 = this.i;
            if (i3 == i4) {
                int i11 = i4 + 1000;
                int[] iArr4 = new int[i11];
                long[] jArr3 = new long[i11];
                long[] jArr4 = new long[i11];
                int[] iArr5 = new int[i11];
                int[] iArr6 = new int[i11];
                C4238od0[] c4238od0Arr2 = new C4238od0[i11];
                int i12 = this.r;
                int i13 = i4 - i12;
                System.arraycopy(this.k, i12, jArr3, 0, i13);
                System.arraycopy(this.n, this.r, jArr4, 0, i13);
                System.arraycopy(this.m, this.r, iArr5, 0, i13);
                System.arraycopy(this.l, this.r, iArr6, 0, i13);
                System.arraycopy(this.o, this.r, c4238od0Arr2, 0, i13);
                System.arraycopy(this.j, this.r, iArr4, 0, i13);
                int i14 = this.r;
                System.arraycopy(this.k, 0, jArr3, i13, i14);
                System.arraycopy(this.n, 0, jArr4, i13, i14);
                System.arraycopy(this.m, 0, iArr5, i13, i14);
                System.arraycopy(this.l, 0, iArr6, i13, i14);
                System.arraycopy(this.o, 0, c4238od0Arr2, i13, i14);
                System.arraycopy(this.j, 0, iArr4, i13, i14);
                this.k = jArr3;
                this.n = jArr4;
                this.m = iArr5;
                this.l = iArr6;
                this.o = c4238od0Arr2;
                this.j = iArr4;
                this.r = 0;
                this.i = i11;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long g(int i) {
        this.u = Math.max(this.u, p(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        A70 a70 = this.c;
        while (i6 < ((SparseArray) a70.c).size() - 1) {
            int i7 = i6 + 1;
            if (i2 < ((SparseArray) a70.c).keyAt(i7)) {
                break;
            }
            ((InterfaceC2494Ij) a70.d).accept(((SparseArray) a70.c).valueAt(i6));
            ((SparseArray) a70.c).removeAt(i6);
            int i8 = a70.b;
            if (i8 > 0) {
                a70.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    public final void h(long j, boolean z) {
        long jG;
        int i;
        R20 r20 = this.f3856a;
        synchronized (this) {
            try {
                int i2 = this.p;
                jG = -1;
                if (i2 != 0) {
                    long[] jArr = this.n;
                    int i3 = this.r;
                    if (j >= jArr[i3]) {
                        if (z && (i = this.s) != i2) {
                            i2 = i + 1;
                        }
                        int iL = l(i3, i2, j, false);
                        if (iL != -1) {
                            jG = g(iL);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        r20.b(jG);
    }

    public final void i() {
        long jG;
        R20 r20 = this.f3856a;
        synchronized (this) {
            int i = this.p;
            jG = i == 0 ? -1L : g(i);
        }
        r20.b(jG);
    }

    public final long j(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        FW.h(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, p(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        A70 a70 = this.c;
        for (int size = ((SparseArray) a70.c).size() - 1; size >= 0 && i < ((SparseArray) a70.c).keyAt(size); size--) {
            ((InterfaceC2494Ij) a70.d).accept(((SparseArray) a70.c).valueAt(size));
            ((SparseArray) a70.c).removeAt(size);
        }
        a70.b = ((SparseArray) a70.c).size() > 0 ? Math.min(a70.b, ((SparseArray) a70.c).size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        int iR = r(i6 - 1);
        return this.k[iR] + ((long) this.l[iR]);
    }

    public final void k(int i) {
        long j = j(i);
        R20 r20 = this.f3856a;
        FW.h(j <= r20.g);
        r20.g = j;
        int i2 = r20.b;
        if (j != 0) {
            Q20 q20 = r20.d;
            if (j != q20.f3586a) {
                while (r20.g > q20.b) {
                    q20 = q20.d;
                }
                Q20 q21 = q20.d;
                q21.getClass();
                r20.a(q21);
                Q20 q22 = new Q20(q20.b, i2);
                q20.d = q22;
                if (r20.g == q20.b) {
                    q20 = q22;
                }
                r20.f = q20;
                if (r20.e == q21) {
                    r20.e = q22;
                    return;
                }
                return;
            }
        }
        r20.a(r20.d);
        Q20 q23 = new Q20(r20.g, i2);
        r20.d = q23;
        r20.e = q23;
        r20.f = q23;
    }

    public final int l(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public C4619sw m(C4619sw c4619sw) {
        if (this.F == 0 || c4619sw.p == Long.MAX_VALUE) {
            return c4619sw;
        }
        C4531rw c4531rwA = c4619sw.a();
        c4531rwA.o = c4619sw.p + this.F;
        return c4531rwA.a();
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.u, p(this.s));
    }

    public final long p(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iR = r(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iR]);
            if ((this.m[iR] & 1) != 0) {
                break;
            }
            iR--;
            if (iR == -1) {
                iR = this.i - 1;
            }
        }
        return jMax;
    }

    public final int q() {
        return this.q + this.s;
    }

    public final int r(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int s(long j, boolean z) {
        int iR = r(this.s);
        if (u() && j >= this.n[iR]) {
            if (j > this.v && z) {
                return this.p - this.s;
            }
            int iL = l(iR, this.p - this.s, j, true);
            if (iL == -1) {
                return 0;
            }
            return iL;
        }
        return 0;
    }

    public final synchronized C4619sw t() {
        return this.y ? null : this.B;
    }

    public final boolean u() {
        return this.s != this.p;
    }

    public final synchronized boolean v(boolean z) {
        C4619sw c4619sw;
        boolean z2 = true;
        if (u()) {
            if (((T20) this.c.c(q())).f3749a != this.g) {
                return true;
            }
            return w(r(this.s));
        }
        if (!z && !this.w && ((c4619sw = this.B) == null || c4619sw == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean w(int i) {
        InterfaceC2889Xp interfaceC2889Xp = this.h;
        return interfaceC2889Xp == null || interfaceC2889Xp.getState() == 4 || ((this.m[i] & 1073741824) == 0 && this.h.c());
    }

    public final void x() throws C2863Wp {
        InterfaceC2889Xp interfaceC2889Xp = this.h;
        if (interfaceC2889Xp == null || interfaceC2889Xp.getState() != 1) {
            return;
        }
        C2863Wp error = this.h.getError();
        error.getClass();
        throw error;
    }

    public final void y(C4619sw c4619sw, C3692iN c3692iN) {
        C4619sw c4619swA;
        C4619sw c4619sw2 = this.g;
        boolean z = c4619sw2 == null;
        DrmInitData drmInitData = z ? null : c4619sw2.o;
        this.g = c4619sw;
        DrmInitData drmInitData2 = c4619sw.o;
        InterfaceC3296dq interfaceC3296dq = this.d;
        if (interfaceC3296dq != null) {
            int iG = interfaceC3296dq.g(c4619sw);
            C4531rw c4531rwA = c4619sw.a();
            c4531rwA.F = iG;
            c4619swA = c4531rwA.a();
        } else {
            c4619swA = c4619sw;
        }
        c3692iN.c = c4619swA;
        c3692iN.b = this.h;
        if (interfaceC3296dq == null) {
            return;
        }
        if (z || !Ug0.a(drmInitData, drmInitData2)) {
            InterfaceC2889Xp interfaceC2889Xp = this.h;
            C3031aq c3031aq = this.e;
            InterfaceC2889Xp interfaceC2889XpJ = interfaceC3296dq.j(c3031aq, c4619sw);
            this.h = interfaceC2889XpJ;
            c3692iN.b = interfaceC2889XpJ;
            if (interfaceC2889Xp != null) {
                interfaceC2889Xp.b(c3031aq);
            }
        }
    }

    public final synchronized int z() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return u() ? this.j[r(this.s)] : this.C;
    }
}
