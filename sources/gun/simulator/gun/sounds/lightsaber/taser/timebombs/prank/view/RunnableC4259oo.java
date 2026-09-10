package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4259oo implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4808a;
    public final /* synthetic */ ScheduledExecutorServiceC4435qo b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Wm0 d;

    public /* synthetic */ RunnableC4259oo(ScheduledExecutorServiceC4435qo scheduledExecutorServiceC4435qo, Runnable runnable, Wm0 wm0, int i) {
        this.f4808a = i;
        this.b = scheduledExecutorServiceC4435qo;
        this.c = runnable;
        this.d = wm0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4808a;
        final Wm0 wm0 = this.d;
        final Runnable runnable = this.c;
        ScheduledExecutorServiceC4435qo scheduledExecutorServiceC4435qo = this.b;
        scheduledExecutorServiceC4435qo.getClass();
        switch (i) {
            case 0:
                final int i2 = 1;
                scheduledExecutorServiceC4435qo.f4902a.execute(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.po
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i3 = i2;
                        Wm0 wm1 = wm0;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    ScheduledFutureC4610so scheduledFutureC4610so = (ScheduledFutureC4610so) wm1.b;
                                    int i4 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so.set(null);
                                    return;
                                } catch (Exception e) {
                                    ScheduledFutureC4610so scheduledFutureC4610so2 = (ScheduledFutureC4610so) wm1.b;
                                    int i5 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so2.setException(e);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ScheduledFutureC4610so scheduledFutureC4610so3 = (ScheduledFutureC4610so) wm1.b;
                                    int i6 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so3.setException(e2);
                                    throw e2;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    ScheduledFutureC4610so scheduledFutureC4610so4 = (ScheduledFutureC4610so) wm1.b;
                                    int i7 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so4.setException(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 0;
                scheduledExecutorServiceC4435qo.f4902a.execute(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.po
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i4 = i3;
                        Wm0 wm1 = wm0;
                        Runnable runnable2 = runnable;
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    ScheduledFutureC4610so scheduledFutureC4610so = (ScheduledFutureC4610so) wm1.b;
                                    int i5 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so.set(null);
                                    return;
                                } catch (Exception e) {
                                    ScheduledFutureC4610so scheduledFutureC4610so2 = (ScheduledFutureC4610so) wm1.b;
                                    int i6 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so2.setException(e);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ScheduledFutureC4610so scheduledFutureC4610so3 = (ScheduledFutureC4610so) wm1.b;
                                    int i7 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so3.setException(e2);
                                    throw e2;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    ScheduledFutureC4610so scheduledFutureC4610so4 = (ScheduledFutureC4610so) wm1.b;
                                    int i8 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so4.setException(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 2;
                scheduledExecutorServiceC4435qo.f4902a.execute(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.po
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i5 = i4;
                        Wm0 wm1 = wm0;
                        Runnable runnable2 = runnable;
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    ScheduledFutureC4610so scheduledFutureC4610so = (ScheduledFutureC4610so) wm1.b;
                                    int i6 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so.set(null);
                                    return;
                                } catch (Exception e) {
                                    ScheduledFutureC4610so scheduledFutureC4610so2 = (ScheduledFutureC4610so) wm1.b;
                                    int i7 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so2.setException(e);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ScheduledFutureC4610so scheduledFutureC4610so3 = (ScheduledFutureC4610so) wm1.b;
                                    int i8 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so3.setException(e2);
                                    throw e2;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    ScheduledFutureC4610so scheduledFutureC4610so4 = (ScheduledFutureC4610so) wm1.b;
                                    int i9 = ScheduledFutureC4610so.b;
                                    scheduledFutureC4610so4.setException(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
