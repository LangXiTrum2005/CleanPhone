package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T6 extends RS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3754a = AtomicReferenceFieldUpdater.newUpdater(T6.class, Object.class, "_consensus");
    private volatile Object _consensus = S6.f3701a;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RS
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3754a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        SE se = S6.f3701a;
        if (obj2 == se) {
            SE seC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == se) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, se, seC)) {
                    if (atomicReferenceFieldUpdater.get(this) != se) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = seC;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract SE c(Object obj);
}
