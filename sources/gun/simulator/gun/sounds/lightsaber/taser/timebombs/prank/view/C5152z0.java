package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.activity.result.ActivityResultCallback;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5152z0 implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5309a;
    public final /* synthetic */ InterfaceC2766Sw b;

    public /* synthetic */ C5152z0(int i, InterfaceC2766Sw interfaceC2766Sw) {
        this.f5309a = i;
        this.b = interfaceC2766Sw;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        int i = this.f5309a;
        InterfaceC2766Sw interfaceC2766Sw = this.b;
        switch (i) {
            case 0:
                interfaceC2766Sw.invoke(obj);
                break;
            default:
                interfaceC2766Sw.invoke(obj);
                break;
        }
    }
}
