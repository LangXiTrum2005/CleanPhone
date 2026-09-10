package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.so, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledFutureC4610so extends AbstractResolvableFuture implements ScheduledFuture {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f4999a;

    public ScheduledFutureC4610so(InterfaceC4522ro interfaceC4522ro) {
        this.f4999a = interfaceC4522ro.a(new Wm0(this, 29));
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void afterDone() {
        this.f4999a.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f4999a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4999a.getDelay(timeUnit);
    }
}
