package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3936l70 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4633a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3936l70(Object obj, int i) {
        this.f4633a = i;
        this.b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f4633a) {
            case 0:
                Tg0.f().post(new RunnableC3848k70(0, this, true));
                break;
            default:
                AbstractC2995aW.q(network, "network");
                super.onAvailable(network);
                ((InterfaceC2714Qw) this.b).invoke();
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f4633a) {
            case 0:
                Tg0.f().post(new RunnableC3848k70(0, this, false));
                break;
            default:
                AbstractC2995aW.q(network, "network");
                super.onLost(network);
                break;
        }
    }
}
