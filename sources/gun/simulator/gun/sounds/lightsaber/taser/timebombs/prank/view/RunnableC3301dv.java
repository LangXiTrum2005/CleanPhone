package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC3301dv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4296a;
    public final /* synthetic */ C3213cv b;

    public /* synthetic */ RunnableC3301dv(C3213cv c3213cv, int i) {
        this.f4296a = i;
        this.b = c3213cv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4296a;
        C3213cv c3213cv = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(c3213cv, "this$0");
                CameraManager cameraManager = (CameraManager) c3213cv.f.getValue();
                if (cameraManager != null) {
                    try {
                        cameraManager.setTorchMode(cameraManager.getCameraIdList()[0], true);
                    } catch (Throwable th) {
                        AbstractC3375el.v(th);
                        return;
                    }
                }
                break;
            default:
                AbstractC2995aW.q(c3213cv, "this$0");
                CameraManager cameraManager2 = (CameraManager) c3213cv.f.getValue();
                if (cameraManager2 != null) {
                    try {
                        cameraManager2.setTorchMode(cameraManager2.getCameraIdList()[0], false);
                    } catch (Throwable th2) {
                        AbstractC3375el.v(th2);
                    }
                }
                break;
        }
    }
}
