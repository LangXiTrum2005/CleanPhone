package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.SurfaceHolder;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceHolderCallbackC4451r10 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3086bY f4912a;
    public final /* synthetic */ RussianRouletteActivity b;

    public SurfaceHolderCallbackC4451r10(C3086bY c3086bY, RussianRouletteActivity russianRouletteActivity) {
        this.f4912a = c3086bY;
        this.b = russianRouletteActivity;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC2995aW.q(surfaceHolder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        AbstractC2995aW.q(surfaceHolder, "holder");
        Object obj = this.f4912a.f4172a;
        if (obj != null) {
            int i = RussianRouletteActivity.t;
            this.b.getClass();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC2995aW.q(surfaceHolder, "holder");
    }
}
