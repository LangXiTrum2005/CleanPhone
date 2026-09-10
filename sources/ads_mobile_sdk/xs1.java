package ads_mobile_sdk;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class xs1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ys1 a;

    public xs1(ys1 ys1Var) {
        this.a = ys1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (this.a) {
            this.a.c = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (this.a) {
            this.a.c = null;
        }
    }
}
