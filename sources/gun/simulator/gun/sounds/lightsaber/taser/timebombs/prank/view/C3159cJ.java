package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3159cJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4215a = AtomicReferenceFieldUpdater.newUpdater(C3159cJ.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C3159cJ.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C3159cJ.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public final C3159cJ d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            C3159cJ c3159cJ = (C3159cJ) atomicReferenceFieldUpdater2.get(this);
            C3159cJ c3159cJ2 = c3159cJ;
            while (true) {
                C3159cJ c3159cJ3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f4215a;
                    obj = atomicReferenceFieldUpdater.get(c3159cJ2);
                    if (obj == this) {
                        if (c3159cJ == c3159cJ2) {
                            return c3159cJ2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, c3159cJ, c3159cJ2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != c3159cJ) {
                                break;
                            }
                        }
                        return c3159cJ2;
                    }
                    if (h()) {
                        return null;
                    }
                    if (obj == null) {
                        return c3159cJ2;
                    }
                    if (obj instanceof RS) {
                        ((RS) obj).a(c3159cJ2);
                        break;
                    }
                    if (!(obj instanceof C5020xY)) {
                        AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        c3159cJ3 = c3159cJ2;
                        c3159cJ2 = (C3159cJ) obj;
                    } else {
                        if (c3159cJ3 != null) {
                            break;
                        }
                        c3159cJ2 = (C3159cJ) atomicReferenceFieldUpdater2.get(c3159cJ2);
                    }
                }
                C3159cJ c3159cJ4 = ((C5020xY) obj).f5226a;
                while (!atomicReferenceFieldUpdater.compareAndSet(c3159cJ3, c3159cJ2, c3159cJ4)) {
                    if (atomicReferenceFieldUpdater.get(c3159cJ3) != c3159cJ2) {
                        break;
                    }
                }
                c3159cJ2 = c3159cJ3;
            }
        }
    }

    public final void e(C3159cJ c3159cJ) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            C3159cJ c3159cJ2 = (C3159cJ) atomicReferenceFieldUpdater.get(c3159cJ);
            if (f() != c3159cJ) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c3159cJ, c3159cJ2, this)) {
                    if (h()) {
                        c3159cJ.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c3159cJ) == c3159cJ2);
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f4215a.get(this);
            if (!(obj instanceof RS)) {
                return obj;
            }
            ((RS) obj).a(this);
        }
    }

    public final C3159cJ g() {
        C3159cJ c3159cJ;
        Object objF = f();
        SE se = AbstractC2982aJ.f4117a;
        C5020xY c5020xY = objF instanceof C5020xY ? (C5020xY) objF : null;
        if (c5020xY != null && (c3159cJ = c5020xY.f5226a) != null) {
            return c3159cJ;
        }
        AbstractC2995aW.o(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C3159cJ) objF;
    }

    public boolean h() {
        return f() instanceof C5020xY;
    }

    public String toString() {
        return new C3071bJ(this, AbstractC2340Cl.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC2340Cl.x(this);
    }
}
