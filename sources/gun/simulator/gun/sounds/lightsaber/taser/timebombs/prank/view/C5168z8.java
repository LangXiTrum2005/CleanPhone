package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5168z8 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C5168z8.class, "notCompletedCount");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3732io[] f5316a;
    private volatile int notCompletedCount;

    public C5168z8(InterfaceC3732io[] interfaceC3732ioArr) {
        this.f5316a = interfaceC3732ioArr;
        this.notCompletedCount = interfaceC3732ioArr.length;
    }
}
