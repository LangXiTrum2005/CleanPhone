package androidx.media3.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class RequirementsWatcher {

    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                throw null;
            }
        }
    }

    public interface Listener {
    }

    public final class NetworkCallback extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6338b;

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            throw null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z2) {
            if (!z2) {
                throw null;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f6337a && this.f6338b == zHasCapability) {
                if (zHasCapability) {
                    throw null;
                }
            } else {
                this.f6337a = true;
                this.f6338b = zHasCapability;
                throw null;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            throw null;
        }
    }
}
