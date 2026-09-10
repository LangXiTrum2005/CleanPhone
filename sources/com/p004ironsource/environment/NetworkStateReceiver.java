package com.p004ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.fp;
import com.p004ironsource.q9;

/* JADX INFO: loaded from: classes5.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager f24923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fp f24924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24925c = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkStateReceiver.this.f24924b != null) {
                NetworkStateReceiver.this.f24924b.a(NetworkStateReceiver.this.f24925c);
            }
        }
    }

    public NetworkStateReceiver(Context context, fp fpVar) {
        this.f24924b = fpVar;
        if (context != null) {
            this.f24923a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }

    private boolean a() {
        boolean z2 = this.f24925c;
        ConnectivityManager connectivityManager = this.f24923a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f24925c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e2) {
                q9.d().a(e2);
                this.f24925c = false;
            }
        } else {
            this.f24925c = false;
        }
        return z2 != this.f24925c;
    }
}
