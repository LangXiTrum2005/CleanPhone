package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4660tQ extends C3580h40 implements InterfaceC4397qQ {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C4660tQ.class, Object.class, "owner");
    private volatile Object owner;

    public C4660tQ(boolean z) {
        super(z ? 1 : 0);
        this.owner = z ? null : AbstractC4748uQ.f5077a;
    }

    public final boolean c() {
        return Math.max(C3580h40.g.get(this), 0) == 0;
    }

    public final Object d(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3580h40.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f4445a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                if (i2 <= 0) {
                    if (obj != null) {
                        while (c()) {
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != AbstractC4748uQ.f5077a) {
                                if (obj2 == obj) {
                                    c = 2;
                                    break;
                                }
                            }
                        }
                        if (c()) {
                        }
                    }
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c = 0;
                    break;
                }
            }
        }
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (c == 0) {
            return c5033xf0;
        }
        if (c != 1) {
            if (c != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        C2798Uc c2798UcV = WD.v(WD.w(interfaceC2857Wj));
        try {
            a(new C4572sQ(this, c2798UcV, obj));
            Object objS = c2798UcV.s();
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            if (objS != enumC4602sk) {
                objS = c5033xf0;
            }
            return objS == enumC4602sk ? objS : c5033xf0;
        } catch (Throwable th) {
            c2798UcV.A();
            throw th;
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            SE se = AbstractC4748uQ.f5077a;
            if (obj2 != se) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, se)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        return "Mutex@" + AbstractC2340Cl.x(this) + "[isLocked=" + c() + ",owner=" + h.get(this) + ']';
    }
}
