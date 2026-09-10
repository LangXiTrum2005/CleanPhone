package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C0474n4;
import com.ironsource.Cc;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager f28571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cc f28572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28573c = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            Cc cc2 = networkStateReceiver.f28572b;
            if (cc2 != null) {
                cc2.a(networkStateReceiver.f28573c);
            }
        }
    }

    public NetworkStateReceiver(Context context, Cc cc2) {
        this.f28572b = cc2;
        if (context != null) {
            this.f28571a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }

    private boolean a() {
        boolean z10 = this.f28573c;
        ConnectivityManager connectivityManager = this.f28571a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f28573c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                this.f28573c = false;
            }
        } else {
            this.f28573c = false;
        }
        return z10 != this.f28573c;
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }
}
