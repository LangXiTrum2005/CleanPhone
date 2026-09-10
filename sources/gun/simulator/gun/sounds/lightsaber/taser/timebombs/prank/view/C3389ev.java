package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3389ev extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3389ev(ContextWrapper contextWrapper, int i) {
        super(0);
        this.f = i;
        this.g = contextWrapper;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        Context context = this.g;
        switch (i) {
            case 0:
                Object systemService = context.getSystemService("camera");
                if (systemService instanceof CameraManager) {
                    return (CameraManager) systemService;
                }
                return null;
            default:
                return context.getPackageManager();
        }
    }
}
