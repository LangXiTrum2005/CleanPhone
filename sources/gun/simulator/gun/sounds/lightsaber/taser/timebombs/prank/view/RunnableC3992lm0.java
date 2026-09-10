package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3992lm0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4665a;
    public final /* synthetic */ AbstractC4783um0 b;

    public RunnableC3992lm0(AbstractC4783um0 abstractC4783um0, long j) {
        this.b = abstractC4783um0;
        this.f4665a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4783um0 abstractC4783um0 = this.b;
        if (abstractC4783um0.NXR != null) {
            abstractC4783um0.NXR.obtainMessage(106, Long.valueOf(this.f4665a)).sendToTarget();
        }
    }
}
