package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.SurfaceHolder;
import androidx.core.content.ContextCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class N10 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RussianRouletteActivity f3435a;

    public N10(RussianRouletteActivity russianRouletteActivity) {
        this.f3435a = russianRouletteActivity;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC2995aW.q(surfaceHolder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) throws Throwable {
        Canvas canvasLockCanvas;
        AbstractC2995aW.q(surfaceHolder, "holder");
        RussianRouletteActivity russianRouletteActivity = this.f3435a;
        Drawable drawable = ContextCompat.getDrawable(russianRouletteActivity, R.drawable.flash_view);
        int i = RussianRouletteActivity.t;
        russianRouletteActivity.getClass();
        try {
            canvasLockCanvas = surfaceHolder.lockCanvas();
            if (canvasLockCanvas != null) {
                if (drawable != null) {
                    try {
                        drawable.setBounds(0, 0, canvasLockCanvas.getWidth(), canvasLockCanvas.getHeight());
                    } catch (Throwable th) {
                        th = th;
                        if (canvasLockCanvas != null) {
                            surfaceHolder.unlockCanvasAndPost(canvasLockCanvas);
                        }
                        throw th;
                    }
                }
                if (drawable != null) {
                    drawable.draw(canvasLockCanvas);
                }
            }
            if (canvasLockCanvas != null) {
                surfaceHolder.unlockCanvasAndPost(canvasLockCanvas);
            }
        } catch (Throwable th2) {
            th = th2;
            canvasLockCanvas = null;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC2995aW.q(surfaceHolder, "holder");
    }
}
