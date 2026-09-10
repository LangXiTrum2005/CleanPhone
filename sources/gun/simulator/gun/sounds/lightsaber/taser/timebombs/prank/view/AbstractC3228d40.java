package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3228d40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V30 f4257a = new V30(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(V30 v30) {
        if (v30.f != null || v30.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (v30.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        V30 v31 = (V30) atomicReference.get();
        if (v31 == f4257a) {
            return;
        }
        int i = v31 == null ? 0 : v31.c;
        if (i >= 65536) {
            return;
        }
        v30.f = v31;
        v30.b = 0;
        v30.c = i + 8192;
        while (!atomicReference.compareAndSet(v31, v30)) {
            if (atomicReference.get() != v31) {
                v30.f = null;
                return;
            }
        }
    }

    public static final V30 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        V30 v30 = f4257a;
        V30 v31 = (V30) atomicReference.getAndSet(v30);
        if (v31 == v30) {
            return new V30();
        }
        if (v31 == null) {
            atomicReference.set(null);
            return new V30();
        }
        atomicReference.set(v31.f);
        v31.f = null;
        v31.c = 0;
        return v31;
    }
}
