package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4432qm0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4900a;
    public boolean b;
    public final /* synthetic */ AbstractC4783um0 c;

    public RunnableC4432qm0(com.bytedance.sdk.openadsdk.core.NXR.ZU.lk lkVar) {
        this.c = lkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentPosition;
        AbstractC4783um0 abstractC4783um0 = this.c;
        if (abstractC4783um0.lc != null) {
            try {
                if (!this.b) {
                    OG og = (OG) abstractC4783um0.lc;
                    og.getClass();
                    try {
                        currentPosition = og.i.getCurrentPosition();
                    } catch (Throwable unused) {
                        currentPosition = 0;
                    }
                    abstractC4783um0.sLN = Math.max(this.f4900a, currentPosition);
                }
                long unused2 = abstractC4783um0.sLN;
            } catch (Throwable th) {
                th.toString();
            }
        }
        if (abstractC4783um0.NXR != null) {
            abstractC4783um0.NXR.sendEmptyMessageDelayed(100, 0L);
        }
    }
}
