package com.p004ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class lo implements pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25635a = "lo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25636b = 23;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qf f25637c;
    private ConnectivityManager.NetworkCallback d;

    public class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f25638a;

        public a(Context context) {
            this.f25638a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                lo.this.f25637c.a(a9.a(network, this.f25638a), a9.a(this.f25638a, network));
                return;
            }
            qf qfVar = lo.this.f25637c;
            String strB = a9.b(this.f25638a);
            Context context = this.f25638a;
            qfVar.a(strB, a9.a(context, a9.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                lo.this.f25637c.b(a9.a(network, this.f25638a), a9.a(this.f25638a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                lo.this.f25637c.b(a9.a(network, this.f25638a), a9.a(this.f25638a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (a9.b(this.f25638a).equals("none")) {
                lo.this.f25637c.a();
            }
        }
    }

    public lo(qf qfVar) {
        this.f25637c = qfVar;
    }

    @Override // com.p004ironsource.pf
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f25636b) {
            a(context);
            if (a9.b(context).equals("none")) {
                this.f25637c.a();
            }
            if (this.d == null) {
                this.d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.d);
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                Log.e(this.f25635a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.p004ironsource.pf
    public JSONObject c(Context context) {
        return a9.a(context, a9.a(context));
    }

    @Override // com.p004ironsource.pf
    public void a() {
        this.d = null;
    }

    @Override // com.p004ironsource.pf
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f25636b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception e2) {
            q9.d().a(e2);
            Log.e(this.f25635a, "NetworkCallback for was not registered or already unregistered");
        }
    }
}
