package com.smartdigimkt.i4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String g = "RequirementsWatcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f35841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.i4.a f35842c;
    private c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35843e;
    private C0506b f;

    /* JADX INFO: renamed from: com.smartdigimkt.i4.b$b, reason: collision with other inner class name */
    public final class C0506b extends ConnectivityManager.NetworkCallback {
        private C0506b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            b.b(b.this + " NetworkCallback.onAvailable");
            b.this.a(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            b.b(b.this + " NetworkCallback.onLost");
            b.this.a(false);
        }
    }

    public class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b.b(b.this + " received " + intent.getAction());
            b.this.a(false);
        }
    }

    public interface d {
        void a(b bVar);

        void b(b bVar);
    }

    public b(Context context, d dVar, com.smartdigimkt.i4.a aVar) {
        this.f35842c = aVar;
        this.f35841b = dVar;
        this.f35840a = context.getApplicationContext();
        b(this + " created");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
    }

    private void e() {
        if (f0.f37540a >= 21) {
            ((ConnectivityManager) this.f35840a.getSystemService("connectivity")).unregisterNetworkCallback(this.f);
            this.f = null;
        }
    }

    public void c() {
        com.smartdigimkt.p4.a.a(Looper.myLooper());
        a(true);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f35842c.a() != 0) {
            if (f0.f37540a >= 23) {
                b();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f35842c.c()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f35842c.d()) {
            if (f0.f37540a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        c cVar = new c();
        this.d = cVar;
        this.f35840a.registerReceiver(cVar, intentFilter, null, new Handler());
        b(this + " started");
    }

    public void d() {
        this.f35840a.unregisterReceiver(this.d);
        this.d = null;
        if (this.f != null) {
            e();
        }
        b(this + " stopped");
    }

    public String toString() {
        return super.toString();
    }

    private void b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f35840a.getSystemService("connectivity");
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(16).build();
        C0506b c0506b = new C0506b();
        this.f = c0506b;
        connectivityManager.registerNetworkCallback(networkRequestBuild, c0506b);
    }

    public com.smartdigimkt.i4.a a() {
        return this.f35842c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2) {
        boolean zD = this.f35842c.d(this.f35840a);
        if (!z2 && zD == this.f35843e) {
            b("requirementsAreMet is still " + zD);
            return;
        }
        this.f35843e = zD;
        if (zD) {
            b("start job");
            this.f35841b.b(this);
        } else {
            b("stop job");
            this.f35841b.a(this);
        }
    }
}
