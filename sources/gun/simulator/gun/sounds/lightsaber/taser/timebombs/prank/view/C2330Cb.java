package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2330Cb implements InterfaceC2851Wd {
    public static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(C2330Cb.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(C2330Cb.class, "receivers");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(C2330Cb.class, "bufferEnd");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C2330Cb.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(C2330Cb.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C2330Cb.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(C2330Cb.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C2330Cb.class, Object.class, "_closeCause");
    public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(C2330Cb.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2928a;
    public final InterfaceC2766Sw b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public C2330Cb(int i2, InterfaceC2766Sw interfaceC2766Sw) {
        this.f2928a = i2;
        this.b = interfaceC2766Sw;
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Invalid channel capacity: ", i2, ", should be >=0").toString());
        }
        C4151ne c4151ne = AbstractC2382Eb.f3028a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = e.get(this);
        C4151ne c4151ne2 = new C4151ne(0L, null, this, 3);
        this.sendSegment = c4151ne2;
        this.receiveSegment = c4151ne2;
        if (A()) {
            c4151ne2 = AbstractC2382Eb.f3028a;
            AbstractC2995aW.o(c4151ne2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = c4151ne2;
        this._closeCause = AbstractC2382Eb.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object D(C2330Cb c2330Cb, InterfaceC2857Wj interfaceC2857Wj) {
        C2278Ab c2278Ab;
        Object objE;
        if (interfaceC2857Wj instanceof C2278Ab) {
            c2278Ab = (C2278Ab) interfaceC2857Wj;
            int i2 = c2278Ab.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2278Ab.c = i2 - Integer.MIN_VALUE;
            } else {
                c2278Ab = new C2278Ab(c2330Cb, interfaceC2857Wj);
            }
        } else {
            c2278Ab = new C2278Ab(c2330Cb, interfaceC2857Wj);
        }
        C2278Ab c2278Ab2 = c2278Ab;
        Object obj = c2278Ab2.f2820a;
        Object obj2 = EnumC4602sk.f4993a;
        int i3 = c2278Ab2.c;
        if (i3 == 0) {
            AbstractC3375el.b0(obj);
            C4151ne c4151ne = (C4151ne) h.get(c2330Cb);
            while (!c2330Cb.y()) {
                long andIncrement = d.getAndIncrement(c2330Cb);
                int i4 = AbstractC2382Eb.b;
                long j2 = andIncrement / ((long) i4);
                int i5 = (int) (andIncrement % ((long) i4));
                if (c4151ne.c != j2) {
                    C4151ne c4151neN = c2330Cb.n(j2, c4151ne);
                    if (c4151neN == null) {
                        continue;
                    } else {
                        c4151ne = c4151neN;
                    }
                }
                Object objI = c2330Cb.I(c4151ne, i5, andIncrement, null);
                if (objI == AbstractC2382Eb.m) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (objI == AbstractC2382Eb.o) {
                    if (andIncrement < c2330Cb.v()) {
                        c4151ne.a();
                    }
                } else {
                    if (objI != AbstractC2382Eb.n) {
                        c4151ne.a();
                        return objI;
                    }
                    c2278Ab2.c = 1;
                    objE = c2330Cb.E(c4151ne, i5, andIncrement, c2278Ab2);
                    if (objE == obj2) {
                        return obj2;
                    }
                }
            }
            return new C3799je(c2330Cb.p());
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC3375el.b0(obj);
        objE = ((C4063me) obj).f4704a;
        return objE;
    }

    public static boolean H(Object obj) {
        if (obj instanceof InterfaceC2772Tc) {
            AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC2382Eb.a((InterfaceC2772Tc) obj, C5033xf0.f5238a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final C4151ne b(C2330Cb c2330Cb, long j2, C4151ne c4151ne) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        c2330Cb.getClass();
        C4151ne c4151ne2 = AbstractC2382Eb.f3028a;
        C2356Db c2356Db = C2356Db.f2975a;
        loop0: while (true) {
            objA = AbstractC2492Ih.a(c4151ne, j2, c2356Db);
            if (!AbstractC2995aW.V(objA)) {
                W30 w30N = AbstractC2995aW.N(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                    W30 w30 = (W30) atomicReferenceFieldUpdater.get(c2330Cb);
                    if (w30.c >= w30N.c) {
                        break loop0;
                    }
                    if (!w30N.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c2330Cb, w30, w30N)) {
                            if (!w30.e()) {
                                break loop0;
                            }
                            w30.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c2330Cb) == w30);
                    if (w30N.e()) {
                        w30N.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zV = AbstractC2995aW.V(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = d;
        if (zV) {
            c2330Cb.u();
            if (c4151ne.c * ((long) AbstractC2382Eb.b) >= atomicLongFieldUpdater2.get(c2330Cb)) {
                return null;
            }
            c4151ne.a();
            return null;
        }
        C4151ne c4151ne3 = (C4151ne) AbstractC2995aW.N(objA);
        long j5 = c4151ne3.c;
        if (j5 <= j2) {
            return c4151ne3;
        }
        long j6 = ((long) AbstractC2382Eb.b) * j5;
        do {
            atomicLongFieldUpdater = c;
            j3 = atomicLongFieldUpdater.get(c2330Cb);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(c2330Cb, j3, j4 + (((long) ((int) (j3 >> 60))) << 60)));
        if (j5 * ((long) AbstractC2382Eb.b) >= atomicLongFieldUpdater2.get(c2330Cb)) {
            return null;
        }
        c4151ne3.a();
        return null;
    }

    public static final void c(C2330Cb c2330Cb, Object obj, C2798Uc c2798Uc) throws IllegalAccessException, InvocationTargetException {
        C3770jF c3770jFJ;
        InterfaceC2766Sw interfaceC2766Sw = c2330Cb.b;
        if (interfaceC2766Sw != null && (c3770jFJ = AbstractC3375el.j(interfaceC2766Sw, obj, null)) != null) {
            AbstractC2995aW.Q(c2798Uc.e, c3770jFJ);
        }
        c2798Uc.resumeWith(AbstractC3375el.v(c2330Cb.s()));
    }

    public static final int d(C2330Cb c2330Cb, C4151ne c4151ne, int i2, Object obj, long j2, Object obj2, boolean z) {
        c2330Cb.getClass();
        c4151ne.m(i2, obj);
        if (z) {
            return c2330Cb.J(c4151ne, i2, obj, j2, obj2, z);
        }
        Object objK = c4151ne.k(i2);
        if (objK == null) {
            if (c2330Cb.e(j2)) {
                if (c4151ne.j(i2, null, AbstractC2382Eb.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c4151ne.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof InterfaceC5129yj0) {
            c4151ne.m(i2, null);
            if (c2330Cb.G(objK, obj)) {
                c4151ne.n(i2, AbstractC2382Eb.i);
                return 0;
            }
            SE se = AbstractC2382Eb.k;
            if (c4151ne.f.getAndSet((i2 * 2) + 1, se) != se) {
                c4151ne.l(i2, true);
            }
            return 5;
        }
        return c2330Cb.J(c4151ne, i2, obj, j2, obj2, z);
    }

    public static void w(C2330Cb c2330Cb) {
        c2330Cb.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if ((atomicLongFieldUpdater.addAndGet(c2330Cb, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c2330Cb) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j2 = e.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    public final void B(long j2, C4151ne c4151ne) {
        C4151ne c4151ne2;
        C4151ne c4151ne3;
        while (c4151ne.c < j2 && (c4151ne3 = (C4151ne) c4151ne.b()) != null) {
            c4151ne = c4151ne3;
        }
        while (true) {
            if (!c4151ne.c() || (c4151ne2 = (C4151ne) c4151ne.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    W30 w30 = (W30) atomicReferenceFieldUpdater.get(this);
                    if (w30.c >= c4151ne.c) {
                        return;
                    }
                    if (!c4151ne.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, w30, c4151ne)) {
                            if (w30.e()) {
                                w30.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == w30);
                    if (c4151ne.e()) {
                        c4151ne.d();
                    }
                }
            } else {
                c4151ne = c4151ne2;
            }
        }
    }

    public final Object C(Object obj, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
        C3770jF c3770jFJ;
        C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        InterfaceC2766Sw interfaceC2766Sw = this.b;
        if (interfaceC2766Sw == null || (c3770jFJ = AbstractC3375el.j(interfaceC2766Sw, obj, null)) == null) {
            c2798Uc.resumeWith(AbstractC3375el.v(s()));
        } else {
            AbstractC2995aW.h(c3770jFJ, s());
            c2798Uc.resumeWith(AbstractC3375el.v(c3770jFJ));
        }
        Object objS = c2798Uc.s();
        return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object E(C4151ne c4151ne, int i2, long j2, InterfaceC2857Wj interfaceC2857Wj) {
        C2304Bb c2304Bb;
        C4063me c4063me;
        C5200zb c5200zb;
        C4151ne c4151ne2;
        if (interfaceC2857Wj instanceof C2304Bb) {
            c2304Bb = (C2304Bb) interfaceC2857Wj;
            int i3 = c2304Bb.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2304Bb.c = i3 - Integer.MIN_VALUE;
            } else {
                c2304Bb = new C2304Bb(this, interfaceC2857Wj);
            }
        } else {
            c2304Bb = new C2304Bb(this, interfaceC2857Wj);
        }
        Object objS = c2304Bb.f2877a;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i4 = c2304Bb.c;
        if (i4 == 0) {
            AbstractC3375el.b0(objS);
            c2304Bb.getClass();
            c2304Bb.getClass();
            c2304Bb.c = 1;
            C2798Uc c2798UcV = WD.v(WD.w(c2304Bb));
            try {
                QX qx = new QX(c2798UcV);
                Object objI = I(c4151ne, i2, j2, qx);
                if (objI != AbstractC2382Eb.m) {
                    Object obj = AbstractC2382Eb.o;
                    InterfaceC2766Sw interfaceC2766Sw = this.b;
                    InterfaceC3549gk interfaceC3549gk = c2798UcV.e;
                    if (objI == obj) {
                        if (j2 < v()) {
                            c4151ne.a();
                        }
                        C4151ne c4151ne3 = (C4151ne) h.get(this);
                        while (true) {
                            if (y()) {
                                c2798UcV.resumeWith(new C4063me(new C3799je(p())));
                                break;
                            }
                            long andIncrement = d.getAndIncrement(this);
                            long j3 = AbstractC2382Eb.b;
                            long j4 = andIncrement / j3;
                            int i5 = (int) (andIncrement % j3);
                            if (c4151ne3.c != j4) {
                                C4151ne c4151neN = n(j4, c4151ne3);
                                if (c4151neN != null) {
                                    c4151ne2 = c4151neN;
                                }
                            } else {
                                c4151ne2 = c4151ne3;
                            }
                            C4151ne c4151ne4 = c4151ne2;
                            Object objI2 = I(c4151ne2, i5, andIncrement, qx);
                            if (objI2 == AbstractC2382Eb.m) {
                                qx.a(c4151ne4, i5);
                                break;
                            }
                            if (objI2 == AbstractC2382Eb.o) {
                                if (andIncrement < v()) {
                                    c4151ne4.a();
                                }
                                c4151ne3 = c4151ne4;
                            } else {
                                if (objI2 == AbstractC2382Eb.n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                c4151ne4.a();
                                c4063me = new C4063me(objI2);
                                c5200zb = interfaceC2766Sw != null ? new C5200zb(interfaceC2766Sw, objI2, interfaceC3549gk) : null;
                            }
                        }
                    } else {
                        c4151ne.a();
                        c4063me = new C4063me(objI);
                        c5200zb = interfaceC2766Sw != null ? new C5200zb(interfaceC2766Sw, objI, interfaceC3549gk) : null;
                    }
                    c2798UcV.B(c5200zb, c4063me);
                    break;
                }
                qx.a(c4151ne, i2);
                objS = c2798UcV.s();
                if (objS == enumC4602sk) {
                    return enumC4602sk;
                }
            } catch (Throwable th) {
                c2798UcV.A();
                throw th;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(objS);
        }
        return ((C4063me) objS).f4704a;
    }

    public final void F(InterfaceC5129yj0 interfaceC5129yj0, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (interfaceC5129yj0 instanceof InterfaceC2772Tc) {
            ((InterfaceC2857Wj) interfaceC5129yj0).resumeWith(AbstractC3375el.v(z ? r() : s()));
            return;
        }
        if (interfaceC5129yj0 instanceof QX) {
            ((QX) interfaceC5129yj0).f3605a.resumeWith(new C4063me(new C3799je(p())));
            return;
        }
        if (!(interfaceC5129yj0 instanceof C5112yb)) {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC5129yj0).toString());
        }
        C5112yb c5112yb = (C5112yb) interfaceC5129yj0;
        C2798Uc c2798Uc = c5112yb.b;
        AbstractC2995aW.n(c2798Uc);
        c5112yb.b = null;
        c5112yb.f5282a = AbstractC2382Eb.l;
        Throwable thP = c5112yb.c.p();
        if (thP == null) {
            c2798Uc.resumeWith(Boolean.FALSE);
        } else {
            c2798Uc.resumeWith(AbstractC3375el.v(thP));
        }
    }

    public final boolean G(Object obj, Object obj2) {
        boolean z = obj instanceof QX;
        InterfaceC2766Sw interfaceC2766Sw = this.b;
        if (z) {
            AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C4063me c4063me = new C4063me(obj2);
            C2798Uc c2798Uc = ((QX) obj).f3605a;
            return AbstractC2382Eb.a(c2798Uc, c4063me, interfaceC2766Sw != null ? new C5200zb(interfaceC2766Sw, obj2, c2798Uc.e) : null);
        }
        if (!(obj instanceof C5112yb)) {
            if (obj instanceof InterfaceC2772Tc) {
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                InterfaceC2772Tc interfaceC2772Tc = (InterfaceC2772Tc) obj;
                return AbstractC2382Eb.a(interfaceC2772Tc, obj2, interfaceC2766Sw != null ? new C5200zb(interfaceC2766Sw, obj2, interfaceC2772Tc.getContext()) : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C5112yb c5112yb = (C5112yb) obj;
        C2798Uc c2798Uc2 = c5112yb.b;
        AbstractC2995aW.n(c2798Uc2);
        c5112yb.b = null;
        c5112yb.f5282a = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC2766Sw interfaceC2766Sw2 = c5112yb.c.b;
        return AbstractC2382Eb.a(c2798Uc2, bool, interfaceC2766Sw2 != null ? new C5200zb(interfaceC2766Sw2, obj2, c2798Uc2.e) : null);
    }

    public final Object I(C4151ne c4151ne, int i2, long j2, Object obj) {
        Object objK = c4151ne.k(i2);
        AtomicReferenceArray atomicReferenceArray = c4151ne.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (objK == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC2382Eb.n;
                }
                if (c4151ne.j(i2, objK, obj)) {
                    m();
                    return AbstractC2382Eb.m;
                }
            }
        } else if (objK == AbstractC2382Eb.d && c4151ne.j(i2, objK, AbstractC2382Eb.i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            c4151ne.m(i2, null);
            return obj2;
        }
        while (true) {
            Object objK2 = c4151ne.k(i2);
            if (objK2 == null || objK2 == AbstractC2382Eb.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c4151ne.j(i2, objK2, AbstractC2382Eb.h)) {
                        m();
                        return AbstractC2382Eb.o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC2382Eb.n;
                    }
                    if (c4151ne.j(i2, objK2, obj)) {
                        m();
                        return AbstractC2382Eb.m;
                    }
                }
            } else if (objK2 != AbstractC2382Eb.d) {
                SE se = AbstractC2382Eb.j;
                if (objK2 == se) {
                    return AbstractC2382Eb.o;
                }
                if (objK2 == AbstractC2382Eb.h) {
                    return AbstractC2382Eb.o;
                }
                if (objK2 == AbstractC2382Eb.l) {
                    m();
                    return AbstractC2382Eb.o;
                }
                if (objK2 != AbstractC2382Eb.g && c4151ne.j(i2, objK2, AbstractC2382Eb.f)) {
                    boolean z = objK2 instanceof C5217zj0;
                    if (z) {
                        objK2 = ((C5217zj0) objK2).f5338a;
                    }
                    if (H(objK2)) {
                        c4151ne.n(i2, AbstractC2382Eb.i);
                        m();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        c4151ne.m(i2, null);
                        return obj3;
                    }
                    c4151ne.n(i2, se);
                    c4151ne.l(i2, false);
                    if (z) {
                        m();
                    }
                    return AbstractC2382Eb.o;
                }
            } else if (c4151ne.j(i2, objK2, AbstractC2382Eb.i)) {
                m();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                c4151ne.m(i2, null);
                return obj4;
            }
        }
    }

    public final int J(C4151ne c4151ne, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objK = c4151ne.k(i2);
            if (objK == null) {
                if (!e(j2) || z) {
                    if (z) {
                        if (c4151ne.j(i2, null, AbstractC2382Eb.j)) {
                            c4151ne.l(i2, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c4151ne.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c4151ne.j(i2, null, AbstractC2382Eb.d)) {
                    return 1;
                }
            } else {
                if (objK != AbstractC2382Eb.e) {
                    SE se = AbstractC2382Eb.k;
                    if (objK == se) {
                        c4151ne.m(i2, null);
                        return 5;
                    }
                    if (objK == AbstractC2382Eb.h) {
                        c4151ne.m(i2, null);
                        return 5;
                    }
                    if (objK == AbstractC2382Eb.l) {
                        c4151ne.m(i2, null);
                        u();
                        return 4;
                    }
                    c4151ne.m(i2, null);
                    if (objK instanceof C5217zj0) {
                        objK = ((C5217zj0) objK).f5338a;
                    }
                    if (G(objK, obj)) {
                        c4151ne.n(i2, AbstractC2382Eb.i);
                        return 0;
                    }
                    if (c4151ne.f.getAndSet((i2 * 2) + 1, se) != se) {
                        c4151ne.l(i2, true);
                    }
                    return 5;
                }
                if (c4151ne.j(i2, objK, AbstractC2382Eb.d)) {
                    return 1;
                }
            }
        }
    }

    public final void K(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        if (A()) {
            return;
        }
        do {
            atomicLongFieldUpdater = e;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = AbstractC2382Eb.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
            if (i3 >= i2) {
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 4611686018427387904L + (j3 & 4611686018427387903L)));
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(this);
                    long j6 = atomicLongFieldUpdater2.get(this);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + 4611686018427387904L);
                    }
                }
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, j4 & 4611686018427387903L));
                return;
            }
            long j8 = atomicLongFieldUpdater.get(this);
            if (j8 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j8 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(true, cancellationException);
    }

    public final boolean e(long j2) {
        return j2 < e.get(this) || j2 < d.get(this) + ((long) this.f2928a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public Object f(Object obj) throws IllegalAccessException, InvocationTargetException {
        C4151ne c4151ne;
        C4151ne c4151ne2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean zX = x(j2, false);
        C3975le c3975le = C4063me.b;
        if (!zX && (!e(j2 & 1152921504606846975L))) {
            return c3975le;
        }
        Object obj2 = AbstractC2382Eb.j;
        C4151ne c4151ne3 = (C4151ne) g.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zX2 = x(andIncrement, false);
            int i2 = AbstractC2382Eb.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (c4151ne3.c != j5) {
                C4151ne c4151neB = b(this, j5, c4151ne3);
                if (c4151neB != null) {
                    c4151ne = c4151neB;
                } else if (zX2) {
                    return new C3799je(s());
                }
            } else {
                c4151ne = c4151ne3;
            }
            C4151ne c4151ne4 = c4151ne;
            int iD = d(this, c4151ne, i3, obj, j3, obj2, zX2);
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            if (iD == 0) {
                c4151ne4.a();
            } else if (iD != 1) {
                if (iD == 2) {
                    if (zX2) {
                        c4151ne4.h();
                        return new C3799je(s());
                    }
                    InterfaceC5129yj0 interfaceC5129yj0 = obj2 instanceof InterfaceC5129yj0 ? (InterfaceC5129yj0) obj2 : null;
                    if (interfaceC5129yj0 != null) {
                        c4151ne2 = c4151ne4;
                        interfaceC5129yj0.a(c4151ne2, i3 + i2);
                    } else {
                        c4151ne2 = c4151ne4;
                    }
                    c4151ne2.h();
                    return c3975le;
                }
                if (iD == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (iD == 4) {
                    if (j3 < d.get(this)) {
                        c4151ne4.a();
                    }
                    return new C3799je(s());
                }
                if (iD == 5) {
                    c4151ne4.a();
                }
                c4151ne3 = c4151ne4;
            }
            return c5033xf0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c3, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d8, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uc] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.Object r27, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2330Cb.g(java.lang.Object, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wj):java.lang.Object");
    }

    public final boolean h(boolean z, Throwable th) {
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (z) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                C4151ne c4151ne = AbstractC2382Eb.f3028a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (((long) 1) << 60) + (j6 & 1152921504606846975L)));
        }
        SE se = AbstractC2382Eb.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, se, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != se) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (((long) 3) << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, (j4 << 60) + j3));
        }
        u();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
                obj = atomicReferenceFieldUpdater2.get(this);
                SE se2 = obj == null ? AbstractC2382Eb.q : AbstractC2382Eb.r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, se2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                WD.h(1, obj);
                ((InterfaceC2766Sw) obj).invoke(p());
            }
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uc] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cb, java.lang.Object] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX
    public final Object i(InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C4151ne c4151ne;
        ?? r13;
        C2798Uc c2798Uc;
        C5200zb c5200zb;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        C4151ne c4151ne2 = (C4151ne) atomicReferenceFieldUpdater.get(this);
        while (!y()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = AbstractC2382Eb.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (c4151ne2.c != j3) {
                C4151ne c4151neN = n(j3, c4151ne2);
                if (c4151neN == null) {
                    continue;
                } else {
                    c4151ne = c4151neN;
                }
            } else {
                c4151ne = c4151ne2;
            }
            Object objI = I(c4151ne, i2, andIncrement, null);
            SE se = AbstractC2382Eb.m;
            if (objI == se) {
                throw new IllegalStateException("unexpected".toString());
            }
            SE se2 = AbstractC2382Eb.o;
            if (objI == se2) {
                if (andIncrement < v()) {
                    c4151ne.a();
                }
                c4151ne2 = c4151ne;
            } else {
                if (objI != AbstractC2382Eb.n) {
                    c4151ne.a();
                    return objI;
                }
                C2798Uc c2798UcV = WD.v(WD.w(interfaceC2857Wj));
                try {
                    Object objI2 = I(c4151ne, i2, andIncrement, c2798UcV);
                    try {
                        if (objI2 != se) {
                            c2798Uc = c2798UcV;
                            InterfaceC2766Sw interfaceC2766Sw = this.b;
                            InterfaceC3549gk interfaceC3549gk = c2798Uc.e;
                            if (objI2 == se2) {
                                if (andIncrement < v()) {
                                    c4151ne.a();
                                }
                                C4151ne c4151ne3 = (C4151ne) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (y()) {
                                        c2798Uc.resumeWith(AbstractC3375el.v(r()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j4 = AbstractC2382Eb.b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (c4151ne3.c != j5) {
                                        C4151ne c4151neN2 = n(j5, c4151ne3);
                                        if (c4151neN2 != null) {
                                            c4151ne3 = c4151neN2;
                                        }
                                    }
                                    InterfaceC3549gk interfaceC3549gk2 = interfaceC3549gk;
                                    InterfaceC2766Sw interfaceC2766Sw2 = interfaceC2766Sw;
                                    objI2 = I(c4151ne3, i3, andIncrement2, c2798Uc);
                                    if (objI2 == AbstractC2382Eb.m) {
                                        c2798Uc.a(c4151ne3, i3);
                                        break;
                                    }
                                    if (objI2 == AbstractC2382Eb.o) {
                                        if (andIncrement2 < v()) {
                                            c4151ne3.a();
                                        }
                                        interfaceC3549gk = interfaceC3549gk2;
                                        interfaceC2766Sw = interfaceC2766Sw2;
                                    } else {
                                        if (objI2 == AbstractC2382Eb.n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        c4151ne3.a();
                                        c5200zb = interfaceC2766Sw2 != null ? new C5200zb(interfaceC2766Sw2, objI2, interfaceC3549gk2) : null;
                                    }
                                }
                            } else {
                                c4151ne.a();
                                c5200zb = interfaceC2766Sw != null ? new C5200zb(interfaceC2766Sw, objI2, interfaceC3549gk) : null;
                            }
                            c2798Uc.B(c5200zb, objI2);
                            break;
                        }
                        c2798Uc = c2798UcV;
                        c2798Uc.a(c4151ne, i2);
                        return c2798Uc.s();
                    } catch (Throwable th) {
                        th = th;
                        r13 = se;
                        r13.A();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r13 = c2798UcV;
                }
            }
        }
        Throwable thR = r();
        int i4 = AbstractC3502g90.f4407a;
        throw thR;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX
    public final C5112yb iterator() {
        return new C5112yb(this);
    }

    public final C4151ne j(long j2) throws IllegalAccessException, InvocationTargetException {
        Object objG0;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = i.get(this);
        C4151ne c4151ne = (C4151ne) g.get(this);
        if (c4151ne.c > ((C4151ne) obj).c) {
            obj = c4151ne;
        }
        C4151ne c4151ne2 = (C4151ne) h.get(this);
        if (c4151ne2.c > ((C4151ne) obj).c) {
            obj = c4151ne2;
        }
        AbstractC2518Jh abstractC2518Jh = (AbstractC2518Jh) obj;
        SE se = AbstractC2492Ih.f3233a;
        loop0: while (true) {
            abstractC2518Jh.getClass();
            Object obj2 = AbstractC2518Jh.f3276a.get(abstractC2518Jh);
            SE se2 = AbstractC2492Ih.f3233a;
            objG0 = null;
            if (obj2 == se2) {
                break;
            }
            AbstractC2518Jh abstractC2518Jh2 = (AbstractC2518Jh) obj2;
            if (abstractC2518Jh2 == null) {
                do {
                    atomicReferenceFieldUpdater = AbstractC2518Jh.f3276a;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2518Jh, null, se2)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC2518Jh) == null);
            } else {
                abstractC2518Jh = abstractC2518Jh2;
            }
        }
        C4151ne c4151ne3 = (C4151ne) abstractC2518Jh;
        if (z()) {
            C4151ne c4151ne4 = c4151ne3;
            loop2: while (true) {
                int i2 = AbstractC2382Eb.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j3 = (c4151ne4.c * ((long) AbstractC2382Eb.b)) + ((long) i2);
                        if (j3 >= d.get(this)) {
                            while (true) {
                                Object objK = c4151ne4.k(i2);
                                if (objK != null && objK != AbstractC2382Eb.e) {
                                    if (objK != AbstractC2382Eb.d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (c4151ne4.j(i2, objK, AbstractC2382Eb.l)) {
                                    c4151ne4.h();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        c4151ne4 = (C4151ne) ((AbstractC2518Jh) AbstractC2518Jh.b.get(c4151ne4));
                        if (c4151ne4 == null) {
                        }
                    }
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                k(j3);
            }
        }
        loop5: for (C4151ne c4151ne5 = c4151ne3; c4151ne5 != null; c4151ne5 = (C4151ne) ((AbstractC2518Jh) AbstractC2518Jh.b.get(c4151ne5))) {
            for (int i3 = AbstractC2382Eb.b - 1; -1 < i3; i3--) {
                if ((c4151ne5.c * ((long) AbstractC2382Eb.b)) + ((long) i3) < j2) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = c4151ne5.k(i3);
                    if (objK2 != null && objK2 != AbstractC2382Eb.e) {
                        if (!(objK2 instanceof C5217zj0)) {
                            if (!(objK2 instanceof InterfaceC5129yj0)) {
                                break;
                            }
                            if (c4151ne5.j(i3, objK2, AbstractC2382Eb.l)) {
                                objG0 = AbstractC2995aW.g0(objG0, objK2);
                                c4151ne5.l(i3, true);
                                break;
                            }
                        } else {
                            if (c4151ne5.j(i3, objK2, AbstractC2382Eb.l)) {
                                objG0 = AbstractC2995aW.g0(objG0, ((C5217zj0) objK2).f5338a);
                                c4151ne5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (c4151ne5.j(i3, objK2, AbstractC2382Eb.l)) {
                            c4151ne5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objG0 != null) {
            if (objG0 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objG0;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    F((InterfaceC5129yj0) arrayList.get(size), true);
                }
            } else {
                F((InterfaceC5129yj0) objG0, true);
            }
        }
        return c4151ne3;
    }

    public final void k(long j2) {
        C3770jF c3770jFJ;
        C4151ne c4151ne = (C4151ne) h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.f2928a) + j3, e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = AbstractC2382Eb.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (c4151ne.c != j5) {
                    C4151ne c4151neN = n(j5, c4151ne);
                    if (c4151neN == null) {
                        continue;
                    } else {
                        c4151ne = c4151neN;
                    }
                }
                Object objI = I(c4151ne, i2, j3, null);
                if (objI != AbstractC2382Eb.o) {
                    c4151ne.a();
                    InterfaceC2766Sw interfaceC2766Sw = this.b;
                    if (interfaceC2766Sw != null && (c3770jFJ = AbstractC3375el.j(interfaceC2766Sw, objI, null)) != null) {
                        throw c3770jFJ;
                    }
                } else if (j3 < v()) {
                    c4151ne.a();
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final void l(C4140nX c4140nX) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c4140nX)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            SE se = AbstractC2382Eb.q;
            if (obj != se) {
                if (obj == AbstractC2382Eb.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            SE se2 = AbstractC2382Eb.r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, se, se2)) {
                    c4140nX.invoke(p());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == se);
        }
    }

    public final void m() {
        Object objA;
        if (A()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        C4151ne c4151ne = (C4151ne) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = e.getAndIncrement(this);
            long j2 = andIncrement / ((long) AbstractC2382Eb.b);
            if (v() <= andIncrement) {
                if (c4151ne.c < j2 && c4151ne.b() != null) {
                    B(j2, c4151ne);
                }
                w(this);
                return;
            }
            if (c4151ne.c != j2) {
                C2356Db c2356Db = C2356Db.f2975a;
                while (true) {
                    objA = AbstractC2492Ih.a(c4151ne, j2, c2356Db);
                    if (!AbstractC2995aW.V(objA)) {
                        W30 w30N = AbstractC2995aW.N(objA);
                        while (true) {
                            W30 w30 = (W30) atomicReferenceFieldUpdater.get(this);
                            if (w30.c >= w30N.c) {
                                break;
                            }
                            if (!w30N.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, w30, w30N)) {
                                    if (!w30.e()) {
                                        break;
                                    }
                                    w30.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == w30);
                            if (w30N.e()) {
                                w30N.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C4151ne c4151ne2 = null;
                if (AbstractC2995aW.V(objA)) {
                    u();
                    B(j2, c4151ne);
                    w(this);
                } else {
                    C4151ne c4151ne3 = (C4151ne) AbstractC2995aW.N(objA);
                    long j3 = c4151ne3.c;
                    if (j3 > j2) {
                        long j4 = j3 * ((long) AbstractC2382Eb.b);
                        if (e.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            w(this);
                        }
                    } else {
                        c4151ne2 = c4151ne3;
                    }
                }
                if (c4151ne2 == null) {
                    continue;
                } else {
                    c4151ne = c4151ne2;
                }
            }
            int i2 = (int) (andIncrement % ((long) AbstractC2382Eb.b));
            Object objK = c4151ne.k(i2);
            boolean z = objK instanceof InterfaceC5129yj0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = d;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !c4151ne.j(i2, objK, AbstractC2382Eb.g)) {
                while (true) {
                    Object objK2 = c4151ne.k(i2);
                    if (objK2 instanceof InterfaceC5129yj0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (c4151ne.j(i2, objK2, new C5217zj0((InterfaceC5129yj0) objK2))) {
                                w(this);
                                return;
                            }
                        } else if (c4151ne.j(i2, objK2, AbstractC2382Eb.g)) {
                            if (!H(objK2)) {
                                c4151ne.n(i2, AbstractC2382Eb.j);
                                c4151ne.l(i2, false);
                                break;
                            } else {
                                c4151ne.n(i2, AbstractC2382Eb.d);
                                w(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == AbstractC2382Eb.j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (c4151ne.j(i2, objK2, AbstractC2382Eb.e)) {
                                w(this);
                                return;
                            }
                        } else if (objK2 == AbstractC2382Eb.d || objK2 == AbstractC2382Eb.h || objK2 == AbstractC2382Eb.i || objK2 == AbstractC2382Eb.k || objK2 == AbstractC2382Eb.l) {
                            w(this);
                            return;
                        } else if (objK2 != AbstractC2382Eb.f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                w(this);
            } else if (H(objK)) {
                c4151ne.n(i2, AbstractC2382Eb.d);
                w(this);
                return;
            } else {
                c4151ne.n(i2, AbstractC2382Eb.j);
                c4151ne.l(i2, false);
                w(this);
            }
        }
    }

    public final C4151ne n(long j2, C4151ne c4151ne) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        C4151ne c4151ne2 = AbstractC2382Eb.f3028a;
        C2356Db c2356Db = C2356Db.f2975a;
        loop0: while (true) {
            objA = AbstractC2492Ih.a(c4151ne, j2, c2356Db);
            if (!AbstractC2995aW.V(objA)) {
                W30 w30N = AbstractC2995aW.N(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    W30 w30 = (W30) atomicReferenceFieldUpdater.get(this);
                    if (w30.c >= w30N.c) {
                        break loop0;
                    }
                    if (!w30N.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, w30, w30N)) {
                            if (!w30.e()) {
                                break loop0;
                            }
                            w30.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == w30);
                    if (w30N.e()) {
                        w30N.d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC2995aW.V(objA)) {
            u();
            if (c4151ne.c * ((long) AbstractC2382Eb.b) >= v()) {
                return null;
            }
            c4151ne.a();
            return null;
        }
        C4151ne c4151ne3 = (C4151ne) AbstractC2995aW.N(objA);
        boolean zA = A();
        long j4 = c4151ne3.c;
        if (!zA && j2 <= e.get(this) / ((long) AbstractC2382Eb.b)) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
                W30 w31 = (W30) atomicReferenceFieldUpdater2.get(this);
                if (w31.c >= j4 || !c4151ne3.i()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, w31, c4151ne3)) {
                        if (!w31.e()) {
                            break loop3;
                        }
                        w31.d();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == w31);
                if (c4151ne3.e()) {
                    c4151ne3.d();
                }
            }
        }
        if (j4 <= j2) {
            return c4151ne3;
        }
        long j5 = ((long) AbstractC2382Eb.b) * j4;
        do {
            atomicLongFieldUpdater = d;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * ((long) AbstractC2382Eb.b) >= v()) {
            return null;
        }
        c4151ne3.a();
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX
    public final Object o() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = c.get(this);
        if (x(j3, true)) {
            return new C3799je(p());
        }
        long j4 = j3 & 1152921504606846975L;
        Object obj = C4063me.b;
        if (j2 >= j4) {
            return obj;
        }
        Object obj2 = AbstractC2382Eb.k;
        C4151ne c4151ne = (C4151ne) h.get(this);
        while (!y()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = AbstractC2382Eb.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (c4151ne.c != j6) {
                C4151ne c4151neN = n(j6, c4151ne);
                if (c4151neN == null) {
                    continue;
                } else {
                    c4151ne = c4151neN;
                }
            }
            Object objI = I(c4151ne, i2, andIncrement, obj2);
            if (objI == AbstractC2382Eb.m) {
                InterfaceC5129yj0 interfaceC5129yj0 = obj2 instanceof InterfaceC5129yj0 ? (InterfaceC5129yj0) obj2 : null;
                if (interfaceC5129yj0 != null) {
                    interfaceC5129yj0.a(c4151ne, i2);
                }
                K(andIncrement);
                c4151ne.h();
            } else if (objI == AbstractC2382Eb.o) {
                if (andIncrement < v()) {
                    c4151ne.a();
                }
            } else {
                if (objI == AbstractC2382Eb.n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                c4151ne.a();
                obj = objI;
            }
            return obj;
        }
        return new C3799je(p());
    }

    public final Throwable p() {
        return (Throwable) j.get(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final boolean q(Throwable th) {
        return h(false, th);
    }

    public final Throwable r() {
        Throwable thP = p();
        return thP == null ? new C2516Jf("Channel was closed") : thP;
    }

    public final Throwable s() {
        Throwable thP = p();
        return thP == null ? new C2542Kf("Channel was closed") : thP;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX
    public final Object t(InterfaceC2857Wj interfaceC2857Wj) {
        return D(this, interfaceC2857Wj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (c.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f2928a + ',');
        sb.append("data=[");
        List listK = AbstractC2340Cl.K(h.get(this), g.get(this), i.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((C4151ne) obj) != AbstractC2382Eb.f3028a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((C4151ne) next).c;
            do {
                Object next2 = it.next();
                long j3 = ((C4151ne) next2).c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        C4151ne c4151ne = (C4151ne) next;
        long j4 = d.get(this);
        long jV = v();
        loop2: do {
            int i3 = AbstractC2382Eb.b;
            for (int i4 = 0; i4 < i3; i4++) {
                long j5 = (c4151ne.c * ((long) AbstractC2382Eb.b)) + ((long) i4);
                if (j5 >= jV && j5 >= j4) {
                    break loop2;
                }
                Object objK = c4151ne.k(i4);
                Object obj2 = c4151ne.f.get(i4 * 2);
                if (objK instanceof InterfaceC2772Tc) {
                    string = (j5 >= j4 || j5 < jV) ? (j5 >= jV || j5 < j4) ? "cont" : "send" : "receive";
                } else if (objK instanceof QX) {
                    string = "receiveCatching";
                } else if (objK instanceof C5217zj0) {
                    string = "EB(" + objK + ')';
                } else if (AbstractC2995aW.i(objK, AbstractC2382Eb.f) || AbstractC2995aW.i(objK, AbstractC2382Eb.g)) {
                    string = "resuming_sender";
                } else {
                    if (objK != null && !AbstractC2995aW.i(objK, AbstractC2382Eb.e) && !AbstractC2995aW.i(objK, AbstractC2382Eb.i) && !AbstractC2995aW.i(objK, AbstractC2382Eb.h) && !AbstractC2995aW.i(objK, AbstractC2382Eb.k) && !AbstractC2995aW.i(objK, AbstractC2382Eb.j) && !AbstractC2995aW.i(objK, AbstractC2382Eb.l)) {
                        string = objK.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            c4151ne = (C4151ne) c4151ne.b();
        } while (c4151ne != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(AbstractC3089ba0.p0(sb)) == ',') {
            AbstractC2995aW.p(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final boolean u() {
        return x(c.get(this), false);
    }

    public final long v() {
        return c.get(this) & 1152921504606846975L;
    }

    public final boolean x(long j2, boolean z) throws IllegalAccessException, InvocationTargetException {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (i2 == 2) {
            j(j2 & 1152921504606846975L);
            if (z) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    C4151ne c4151neN = (C4151ne) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (v() <= j3) {
                        break;
                    }
                    long j4 = AbstractC2382Eb.b;
                    long j5 = j3 / j4;
                    if (c4151neN.c != j5 && (c4151neN = n(j5, c4151neN)) == null) {
                        if (((C4151ne) atomicReferenceFieldUpdater.get(this)).c < j5) {
                            break;
                        }
                    } else {
                        c4151neN.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object objK = c4151neN.k(i3);
                            if (objK != null && objK != AbstractC2382Eb.e) {
                                if (objK != AbstractC2382Eb.d) {
                                    if (objK != AbstractC2382Eb.j && objK != AbstractC2382Eb.l && objK != AbstractC2382Eb.i && objK != AbstractC2382Eb.h) {
                                        if (objK != AbstractC2382Eb.g) {
                                            if (objK == AbstractC2382Eb.f || j3 != atomicLongFieldUpdater.get(this)) {
                                                break;
                                                break;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (c4151neN.j(i3, objK, AbstractC2382Eb.h)) {
                                m();
                                break;
                            }
                        }
                        d.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(AbstractC3950lJ.p("unexpected close status: ", i2).toString());
            }
            C4151ne c4151neJ = j(j2 & 1152921504606846975L);
            C3770jF c3770jFJ = null;
            Object objG0 = null;
            loop0: do {
                for (int i4 = AbstractC2382Eb.b - 1; -1 < i4; i4--) {
                    long j6 = (c4151neJ.c * ((long) AbstractC2382Eb.b)) + ((long) i4);
                    while (true) {
                        Object objK2 = c4151neJ.k(i4);
                        if (objK2 == AbstractC2382Eb.i) {
                            break loop0;
                        }
                        SE se = AbstractC2382Eb.d;
                        AtomicReferenceArray atomicReferenceArray = c4151neJ.f;
                        InterfaceC2766Sw interfaceC2766Sw = this.b;
                        if (objK2 != se) {
                            if (objK2 != AbstractC2382Eb.e && objK2 != null) {
                                if (!(objK2 instanceof InterfaceC5129yj0) && !(objK2 instanceof C5217zj0)) {
                                    SE se2 = AbstractC2382Eb.g;
                                    if (objK2 == se2 || objK2 == AbstractC2382Eb.f) {
                                        break loop0;
                                    }
                                    if (objK2 != se2) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    InterfaceC5129yj0 interfaceC5129yj0 = objK2 instanceof C5217zj0 ? ((C5217zj0) objK2).f5338a : (InterfaceC5129yj0) objK2;
                                    if (c4151neJ.j(i4, objK2, AbstractC2382Eb.l)) {
                                        if (interfaceC2766Sw != null) {
                                            c3770jFJ = AbstractC3375el.j(interfaceC2766Sw, atomicReferenceArray.get(i4 * 2), c3770jFJ);
                                        }
                                        objG0 = AbstractC2995aW.g0(objG0, interfaceC5129yj0);
                                        c4151neJ.m(i4, null);
                                        c4151neJ.h();
                                        break;
                                    }
                                }
                            } else if (c4151neJ.j(i4, objK2, AbstractC2382Eb.l)) {
                                c4151neJ.h();
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (c4151neJ.j(i4, objK2, AbstractC2382Eb.l)) {
                                if (interfaceC2766Sw != null) {
                                    c3770jFJ = AbstractC3375el.j(interfaceC2766Sw, atomicReferenceArray.get(i4 * 2), c3770jFJ);
                                }
                                c4151neJ.m(i4, null);
                                c4151neJ.h();
                                break;
                            }
                        }
                    }
                }
                c4151neJ = (C4151ne) ((AbstractC2518Jh) AbstractC2518Jh.b.get(c4151neJ));
            } while (c4151neJ != null);
            if (objG0 != null) {
                if (objG0 instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objG0;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        F((InterfaceC5129yj0) arrayList.get(size), false);
                    }
                } else {
                    F((InterfaceC5129yj0) objG0, false);
                }
            }
            if (c3770jFJ != null) {
                throw c3770jFJ;
            }
        }
        return true;
    }

    public final boolean y() {
        return x(c.get(this), true);
    }

    public boolean z() {
        return false;
    }
}
