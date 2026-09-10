package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.FrameLayout;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC4673tb0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5040a;
    public final /* synthetic */ Gb0 b;

    public /* synthetic */ RunnableC4673tb0(Gb0 gb0, int i) {
        this.f5040a = i;
        this.b = gb0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f5040a;
        Gb0 gb0 = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(gb0, "this$0");
                FrameLayout frameLayout = ((ActivityGunBinding) gb0.f4847a.getMBinding()).surfaceRoot;
                AbstractC2995aW.p(frameLayout, "surfaceRoot");
                Oh0.c(frameLayout);
                break;
            default:
                AbstractC2995aW.q(gb0, "this$0");
                gb0.Q = true;
                gb0.q();
                break;
        }
    }
}
