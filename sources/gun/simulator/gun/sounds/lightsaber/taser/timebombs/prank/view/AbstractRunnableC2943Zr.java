package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC2943Zr implements Runnable, Comparable, InterfaceC4612sp {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4096a;
    public int b = -1;

    public AbstractRunnableC2943Zr(long j) {
        this.f4096a = j;
    }

    public final C3446fc0 b() {
        Object obj = this._heap;
        if (obj instanceof C3446fc0) {
            return (C3446fc0) obj;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4612sp
    public final void c() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                SE se = AbstractC3298ds.f4295a;
                if (obj == se) {
                    return;
                }
                C3033as c3033as = obj instanceof C3033as ? (C3033as) obj : null;
                if (c3033as != null) {
                    c3033as.c(this);
                }
                this._heap = se;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f4096a - ((AbstractRunnableC2943Zr) obj).f4096a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int d(long j, C3033as c3033as, AbstractC3122bs abstractC3122bs) {
        synchronized (this) {
            if (this._heap == AbstractC3298ds.f4295a) {
                return 2;
            }
            synchronized (c3033as) {
                try {
                    AbstractRunnableC2943Zr[] abstractRunnableC2943ZrArr = c3033as.f4373a;
                    AbstractRunnableC2943Zr abstractRunnableC2943Zr = abstractRunnableC2943ZrArr != null ? abstractRunnableC2943ZrArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC3122bs.e;
                    abstractC3122bs.getClass();
                    if (AbstractC3122bs.g.get(abstractC3122bs) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC2943Zr == null) {
                        c3033as.c = j;
                    } else {
                        long j2 = abstractRunnableC2943Zr.f4096a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c3033as.c > 0) {
                            c3033as.c = j;
                        }
                    }
                    long j3 = this.f4096a;
                    long j4 = c3033as.c;
                    if (j3 - j4 < 0) {
                        this.f4096a = j4;
                    }
                    c3033as.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(C3033as c3033as) {
        if (this._heap == AbstractC3298ds.f4295a) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = c3033as;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f4096a + ']';
    }
}
