package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.no, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4171no implements InterfaceC4522ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4761a;
    public final /* synthetic */ ScheduledExecutorServiceC4435qo b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ C4171no(ScheduledExecutorServiceC4435qo scheduledExecutorServiceC4435qo, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f4761a = i;
        this.b = scheduledExecutorServiceC4435qo;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4522ro
    public final ScheduledFuture a(Wm0 wm0) {
        int i = this.f4761a;
        Runnable runnable = this.c;
        ScheduledExecutorServiceC4435qo scheduledExecutorServiceC4435qo = this.b;
        scheduledExecutorServiceC4435qo.getClass();
        switch (i) {
            case 0:
                return scheduledExecutorServiceC4435qo.b.scheduleAtFixedRate(new RunnableC4259oo(scheduledExecutorServiceC4435qo, runnable, wm0, 0), this.d, this.e, this.f);
            default:
                return scheduledExecutorServiceC4435qo.b.scheduleWithFixedDelay(new RunnableC4259oo(scheduledExecutorServiceC4435qo, runnable, wm0, 2), this.d, this.e, this.f);
        }
    }
}
