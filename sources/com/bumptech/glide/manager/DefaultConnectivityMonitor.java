package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
final class DefaultConnectivityMonitor implements ConnectivityMonitor {
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ConnectivityMonitor.ConnectivityListener f12747Y;

    public DefaultConnectivityMonitor(Context context, ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.X = context.getApplicationContext();
        this.f12747Y = connectivityListener;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        SingletonConnectivityReceiver singletonConnectivityReceiverA = SingletonConnectivityReceiver.a(this.X);
        ConnectivityMonitor.ConnectivityListener connectivityListener = this.f12747Y;
        synchronized (singletonConnectivityReceiverA) {
            singletonConnectivityReceiverA.f12759b.add(connectivityListener);
            singletonConnectivityReceiverA.b();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        SingletonConnectivityReceiver singletonConnectivityReceiverA = SingletonConnectivityReceiver.a(this.X);
        ConnectivityMonitor.ConnectivityListener connectivityListener = this.f12747Y;
        synchronized (singletonConnectivityReceiverA) {
            singletonConnectivityReceiverA.f12759b.remove(connectivityListener);
            if (singletonConnectivityReceiverA.f12760c && singletonConnectivityReceiverA.f12759b.isEmpty()) {
                SingletonConnectivityReceiver.FrameworkConnectivityMonitorPostApi24 frameworkConnectivityMonitorPostApi24 = singletonConnectivityReceiverA.f12758a;
                ((ConnectivityManager) frameworkConnectivityMonitorPostApi24.f12765c.get()).unregisterNetworkCallback(frameworkConnectivityMonitorPostApi24.d);
                singletonConnectivityReceiverA.f12760c = false;
            }
        }
    }
}
