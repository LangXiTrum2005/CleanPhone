package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3580h40 {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C3580h40.class, Object.class, TtmlNode.TAG_HEAD);
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(C3580h40.class, "deqIdx");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C3580h40.class, Object.class, "tail");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C3580h40.class, "enqIdx");
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(C3580h40.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4445a = 1;
    public final C4140nX b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public C3580h40(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        C3754j40 c3754j40 = new C3754j40(0L, null, 2);
        this.head = c3754j40;
        this.tail = c3754j40;
        this._availablePermits = 1 - i;
        this.b = new C4140nX(this, 11);
    }

    public final void a(C4572sQ c4572sQ) throws IllegalAccessException, InvocationTargetException {
        Object objA;
        C5033xf0 c5033xf0;
        C2798Uc c2798Uc;
        C3404f40 c3404f40;
        long j;
        while (true) {
            int andDecrement = g.getAndDecrement(this);
            if (andDecrement <= this.f4445a) {
                int i = 0;
                C5033xf0 c5033xf1 = C5033xf0.f5238a;
                C2798Uc c2798Uc2 = c4572sQ.f4979a;
                C4660tQ c4660tQ = c4572sQ.c;
                Object obj = c4572sQ.b;
                if (andDecrement > 0) {
                    C4660tQ.h.set(c4660tQ, obj);
                    c2798Uc2.B(new C4484rQ(c4660tQ, c4572sQ, i), c5033xf1);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                C3754j40 c3754j40 = (C3754j40) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f.getAndIncrement(this);
                C3404f40 c3404f41 = C3404f40.f4349a;
                long j2 = andIncrement / ((long) AbstractC3668i40.f);
                while (true) {
                    objA = AbstractC2492Ih.a(c3754j40, j2, c3404f41);
                    if (AbstractC2995aW.V(objA)) {
                        c5033xf0 = c5033xf1;
                        c2798Uc = c2798Uc2;
                        break;
                    }
                    W30 w30N = AbstractC2995aW.N(objA);
                    while (true) {
                        W30 w30 = (W30) atomicReferenceFieldUpdater.get(this);
                        c3404f40 = c3404f41;
                        j = j2;
                        c5033xf0 = c5033xf1;
                        c2798Uc = c2798Uc2;
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
                        c5033xf1 = c5033xf0;
                        c3404f41 = c3404f40;
                        j2 = j;
                        c2798Uc2 = c2798Uc;
                    }
                    c5033xf1 = c5033xf0;
                    c3404f41 = c3404f40;
                    j2 = j;
                    c2798Uc2 = c2798Uc;
                }
                C3754j40 c3754j41 = (C3754j40) AbstractC2995aW.N(objA);
                int i2 = (int) (andIncrement % ((long) AbstractC3668i40.f));
                AtomicReferenceArray atomicReferenceArray = c3754j41.e;
                do {
                    if (atomicReferenceArray.compareAndSet(i2, null, c4572sQ)) {
                        c4572sQ.a(c3754j41, i2);
                        return;
                    }
                } while (atomicReferenceArray.get(i2) == null);
                SE se = AbstractC3668i40.b;
                SE se2 = AbstractC3668i40.c;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i2, se, se2)) {
                        C4660tQ.h.set(c4660tQ, obj);
                        c2798Uc.B(new C4484rQ(c4660tQ, c4572sQ, 0), c5033xf0);
                        return;
                    } else {
                        C2798Uc c2798Uc3 = c2798Uc;
                        if (atomicReferenceArray.get(i2) != se) {
                            break;
                        } else {
                            c2798Uc = c2798Uc3;
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        int i;
        Object objA;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f4445a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            C3754j40 c3754j40 = (C3754j40) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / ((long) AbstractC3668i40.f);
            C3492g40 c3492g40 = C3492g40.f4401a;
            while (true) {
                objA = AbstractC2492Ih.a(c3754j40, j, c3492g40);
                if (AbstractC2995aW.V(objA)) {
                    break;
                }
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
            }
            C3754j40 c3754j41 = (C3754j40) AbstractC2995aW.N(objA);
            c3754j41.a();
            if (c3754j41.c <= j) {
                int i3 = (int) (andIncrement2 % ((long) AbstractC3668i40.f));
                SE se = AbstractC3668i40.b;
                AtomicReferenceArray atomicReferenceArray = c3754j41.e;
                Object andSet = atomicReferenceArray.getAndSet(i3, se);
                if (andSet == null) {
                    int i4 = AbstractC3668i40.f4487a;
                    boolean z = false;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == AbstractC3668i40.c) {
                            return;
                        }
                    }
                    SE se2 = AbstractC3668i40.b;
                    SE se3 = AbstractC3668i40.d;
                    do {
                        if (atomicReferenceArray.compareAndSet(i3, se2, se3)) {
                            z = true;
                            break;
                        }
                    } while (atomicReferenceArray.get(i3) == se2);
                    if (!z) {
                        return;
                    }
                } else if (andSet == AbstractC3668i40.e) {
                    continue;
                } else {
                    if (!(andSet instanceof InterfaceC2772Tc)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC2772Tc interfaceC2772Tc = (InterfaceC2772Tc) andSet;
                    SE seJ = interfaceC2772Tc.j(C5033xf0.f5238a, this.b);
                    if (seJ != null) {
                        interfaceC2772Tc.v(seJ);
                        return;
                    }
                }
            }
        }
    }
}
