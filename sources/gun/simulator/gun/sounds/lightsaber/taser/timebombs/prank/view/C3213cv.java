package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import com.hjq.permissions.Permission;
import com.hjq.permissions.XXPermissions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3213cv extends AbstractC3477fv {
    public final /* synthetic */ int d;
    public final InterfaceC3069bH e;
    public final InterfaceC3069bH f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3213cv(ContextWrapper contextWrapper, int i) {
        super(contextWrapper);
        this.d = i;
        EnumC4124nH enumC4124nH = EnumC4124nH.c;
        if (i != 1) {
            AbstractC2995aW.q(contextWrapper, "activity");
            this.e = AbstractC2340Cl.H(enumC4124nH, C3283dj.w);
            this.f = AbstractC2340Cl.H(enumC4124nH, new X9(this, 8));
            return;
        }
        AbstractC2995aW.q(contextWrapper, "activity");
        super(contextWrapper);
        this.e = AbstractC2340Cl.H(enumC4124nH, new C3389ev(contextWrapper, 1));
        this.f = AbstractC2340Cl.H(enumC4124nH, new C3389ev(contextWrapper, 0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2303Ba
    public final void a() {
        switch (this.d) {
            case 0:
                Camera cameraE = e();
                if (cameraE != null) {
                    cameraE.release();
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3477fv
    public final void c() {
        int i = this.d;
        P0 p0 = this.c;
        R7 r7 = this.b;
        switch (i) {
            case 0:
                r7.removeCallbacks(p0);
                if (e() != null) {
                    InterfaceC3069bH interfaceC3069bH = this.f;
                    try {
                        Camera.Parameters parameters = (Camera.Parameters) interfaceC3069bH.getValue();
                        if (parameters != null) {
                            parameters.setFlashMode("off");
                        }
                        Camera cameraE = e();
                        if (cameraE != null) {
                            cameraE.setParameters((Camera.Parameters) interfaceC3069bH.getValue());
                        }
                        Camera cameraE2 = e();
                        if (cameraE2 != null) {
                            cameraE2.stopPreview();
                        }
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            default:
                r7.removeCallbacks(p0);
                r7.post(new RunnableC3301dv(this, 1));
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3477fv
    public final void d(boolean z) {
        int i = this.d;
        P0 p0 = this.c;
        R7 r7 = this.b;
        switch (i) {
            case 0:
                if (e() != null) {
                    InterfaceC3069bH interfaceC3069bH = this.f;
                    Camera.Parameters parameters = (Camera.Parameters) interfaceC3069bH.getValue();
                    if (parameters != null) {
                        parameters.setFlashMode("torch");
                    }
                    Camera cameraE = e();
                    if (cameraE != null) {
                        cameraE.setParameters((Camera.Parameters) interfaceC3069bH.getValue());
                    }
                    Camera cameraE2 = e();
                    if (cameraE2 != null) {
                        cameraE2.startPreview();
                    }
                    if (!z) {
                        r7.post(p0);
                    } else {
                        r7.postDelayed(p0, 100L);
                    }
                    break;
                }
                break;
            default:
                if (((PackageManager) this.e.getValue()).hasSystemFeature("android.hardware.camera.flash")) {
                    r7.post(new RunnableC3301dv(this, 0));
                    if (!z) {
                        r7.post(p0);
                    } else {
                        r7.postDelayed(p0, 100L);
                    }
                    break;
                }
                break;
        }
    }

    public final Camera e() {
        if (XXPermissions.isGranted(App.n.f(), Permission.CAMERA)) {
            return (Camera) this.e.getValue();
        }
        return null;
    }
}
