package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.SurfaceHolder;
import androidx.core.content.ContextCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceHolderCallbackC3902kl0 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f4612a;

    public SurfaceHolderCallbackC3902kl0(WeaponUseActivity weaponUseActivity) {
        this.f4612a = weaponUseActivity;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC2995aW.q(surfaceHolder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) throws Throwable {
        Canvas canvasLockCanvas;
        AbstractC2995aW.q(surfaceHolder, "holder");
        Zb0 zb0 = WeaponUseActivity.n;
        WeaponUseActivity weaponUseActivity = this.f4612a;
        weaponUseActivity.getTAG();
        Drawable drawable = ContextCompat.getDrawable(weaponUseActivity, R.drawable.flash_view);
        weaponUseActivity.getClass();
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
