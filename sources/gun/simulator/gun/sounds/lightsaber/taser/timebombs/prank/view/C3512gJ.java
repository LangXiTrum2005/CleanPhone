package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3512gJ {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C3512gJ.class, Object.class, "_next");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C3512gJ.class, "_state");
    public static final SE g = new SE("REMOVE_FROZEN", 1);
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4411a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;

    public C3512gJ(int i, boolean z) {
        this.f4411a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C3512gJ c3512gJC = this;
                    while ((atomicLongFieldUpdater.get(c3512gJC) & 1152921504606846976L) != 0) {
                        c3512gJC = c3512gJC.c();
                        AtomicReferenceArray atomicReferenceArray2 = c3512gJC.d;
                        int i4 = c3512gJC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C3424fJ) && ((C3424fJ) obj2).f4363a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c3512gJC = null;
                        }
                        if (c3512gJC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f4411a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final C3512gJ c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            C3512gJ c3512gJ = (C3512gJ) atomicReferenceFieldUpdater.get(this);
            if (c3512gJ != null) {
                return c3512gJ;
            }
            C3512gJ c3512gJ2 = new C3512gJ(this.f4411a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c3424fJ = this.d.get(i4);
                if (c3424fJ == null) {
                    c3424fJ = new C3424fJ(i);
                }
                c3512gJ2.d.set(c3512gJ2.c & i, c3424fJ);
                i++;
            }
            atomicLongFieldUpdater.set(c3512gJ2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c3512gJ2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            int i4 = i & i3;
            if ((i2 & i3) == i4) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = this.b;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else {
                if (obj instanceof C3424fJ) {
                    return null;
                }
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                if (z) {
                    C3512gJ c3512gJC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                        long j3 = atomicLongFieldUpdater2.get(c3512gJC);
                        int i5 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c3512gJC = c3512gJC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(c3512gJC, j3, (j3 & (-1073741824)) | j2)) {
                                c3512gJC.d.set(c3512gJC.c & i5, null);
                                c3512gJC = null;
                            } else {
                                continue;
                            }
                        }
                        if (c3512gJC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
