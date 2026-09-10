package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: classes.dex */
public class NetworkStateTracker extends ConstraintTracker<NetworkState> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f8740i = Logger.e("NetworkStateTracker");
    public final ConnectivityManager g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NetworkStateCallback f8741h;

    public class NetworkStateBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            Logger.c().a(NetworkStateTracker.f8740i, "Network broadcast received", new Throwable[0]);
            throw null;
        }
    }

    public class NetworkStateCallback extends ConnectivityManager.NetworkCallback {
        public NetworkStateCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Logger.c().a(NetworkStateTracker.f8740i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.c(networkStateTracker.f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Logger.c().a(NetworkStateTracker.f8740i, "Network connection lost", new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.c(networkStateTracker.f());
        }
    }

    public NetworkStateTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        this.g = (ConnectivityManager) this.f8736b.getSystemService("connectivity");
        this.f8741h = new NetworkStateCallback();
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final Object a() {
        return f();
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void d() {
        String str = f8740i;
        try {
            Logger.c().a(str, "Registering network callback", new Throwable[0]);
            this.g.registerDefaultNetworkCallback(this.f8741h);
        } catch (IllegalArgumentException | SecurityException e2) {
            Logger.c().b(str, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void e() {
        String str = f8740i;
        try {
            Logger.c().a(str, "Unregistering network callback", new Throwable[0]);
            this.g.unregisterNetworkCallback(this.f8741h);
        } catch (IllegalArgumentException | SecurityException e2) {
            Logger.c().b(str, "Received exception while unregistering network callback", e2);
        }
    }

    public final NetworkState f() {
        boolean z2;
        ConnectivityManager connectivityManager = this.g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = false;
        boolean z4 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            z2 = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e2) {
            Logger.c().b(f8740i, "Unable to validate active network", e2);
        }
        boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z3 = true;
        }
        NetworkState networkState = new NetworkState();
        networkState.f8721a = z4;
        networkState.f8722b = z2;
        networkState.f8723c = zIsActiveNetworkMetered;
        networkState.d = z3;
        return networkState;
    }
}
