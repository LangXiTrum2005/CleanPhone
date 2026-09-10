package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.ConnectivityManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.De, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2359De extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ DialogC2411Fe g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2359De(DialogC2411Fe dialogC2411Fe, int i) {
        super(0);
        this.f = i;
        this.g = dialogC2411Fe;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final /* bridge */ /* synthetic */ Object invoke() {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.f) {
            case 0:
                m159invoke();
                break;
            case 1:
                m159invoke();
                break;
            default:
                m159invoke();
                break;
        }
        return c5033xf0;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m159invoke() {
        int i = this.f;
        DialogC2411Fe dialogC2411Fe = this.g;
        switch (i) {
            case 0:
                C4568sM c4568sM = dialogC2411Fe.c;
                ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) c4568sM.d;
                if (networkCallback != null) {
                    ((ConnectivityManager) c4568sM.c).unregisterNetworkCallback(networkCallback);
                }
                c4568sM.d = null;
                break;
            case 1:
                C2359De c2359De = new C2359De(dialogC2411Fe, 0);
                int i2 = DialogC2411Fe.d;
                dialogC2411Fe.dismiss();
                c2359De.invoke();
                break;
            default:
                boolean z = dialogC2411Fe.b;
                break;
        }
    }
}
