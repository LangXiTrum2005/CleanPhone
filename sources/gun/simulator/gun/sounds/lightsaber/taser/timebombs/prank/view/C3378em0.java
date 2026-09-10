package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.em0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3378em0 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C3378em0.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C3378em0.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C3378em0.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C3378em0.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f4337a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final AbstractRunnableC3970lb0 a(AbstractRunnableC3970lb0 abstractRunnableC3970lb0) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return abstractRunnableC3970lb0;
        }
        if (abstractRunnableC3970lb0.b.f3624a == 1) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f4337a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC3970lb0);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final AbstractRunnableC3970lb0 b() {
        AbstractRunnableC3970lb0 abstractRunnableC3970lb0;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC3970lb0 = (AbstractRunnableC3970lb0) this.f4337a.getAndSet(i2, null)) != null) {
                if (abstractRunnableC3970lb0.b.f3624a == 1) {
                    e.decrementAndGet(this);
                }
                return abstractRunnableC3970lb0;
            }
        }
    }

    public final AbstractRunnableC3970lb0 c(int i, boolean z) {
        int i2 = i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        AtomicReferenceArray atomicReferenceArray = this.f4337a;
        AbstractRunnableC3970lb0 abstractRunnableC3970lb0 = (AbstractRunnableC3970lb0) atomicReferenceArray.get(i2);
        if (abstractRunnableC3970lb0 != null) {
            if ((abstractRunnableC3970lb0.b.f3624a == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC3970lb0, null)) {
                    if (atomicReferenceArray.get(i2) != abstractRunnableC3970lb0) {
                    }
                }
                if (z) {
                    e.decrementAndGet(this);
                }
                return abstractRunnableC3970lb0;
            }
        }
        return null;
    }
}
