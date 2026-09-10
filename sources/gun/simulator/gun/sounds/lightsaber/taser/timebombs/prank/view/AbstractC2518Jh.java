package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2518Jh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3276a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2518Jh.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(AbstractC2518Jh.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC2518Jh(AbstractC2518Jh abstractC2518Jh) {
        this._prev = abstractC2518Jh;
    }

    public final void a() {
        b.lazySet(this, null);
    }

    public final AbstractC2518Jh b() {
        Object obj = f3276a.get(this);
        if (obj == AbstractC2492Ih.f3233a) {
            return null;
        }
        return (AbstractC2518Jh) obj;
    }

    public abstract boolean c();

    public final void d() {
        AbstractC2518Jh abstractC2518JhB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            AbstractC2518Jh abstractC2518Jh = (AbstractC2518Jh) atomicReferenceFieldUpdater.get(this);
            while (abstractC2518Jh != null && abstractC2518Jh.c()) {
                abstractC2518Jh = (AbstractC2518Jh) atomicReferenceFieldUpdater.get(abstractC2518Jh);
            }
            AbstractC2518Jh abstractC2518JhB2 = b();
            AbstractC2995aW.n(abstractC2518JhB2);
            while (abstractC2518JhB2.c() && (abstractC2518JhB = abstractC2518JhB2.b()) != null) {
                abstractC2518JhB2 = abstractC2518JhB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC2518JhB2);
                AbstractC2518Jh abstractC2518Jh2 = ((AbstractC2518Jh) obj) == null ? null : abstractC2518Jh;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2518JhB2, obj, abstractC2518Jh2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(abstractC2518JhB2) != obj) {
                    }
                }
            }
            if (abstractC2518Jh != null) {
                f3276a.set(abstractC2518Jh, abstractC2518JhB2);
            }
            if (!abstractC2518JhB2.c() || abstractC2518JhB2.b() == null) {
                if (abstractC2518Jh == null || !abstractC2518Jh.c()) {
                    return;
                }
            }
        }
    }
}
