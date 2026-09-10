package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3478dc implements InterfaceC3705q7 {
    private String a = C3478dc.class.getSimpleName();
    private int b = 23;
    private final InterfaceC3721r7 c;
    private ConnectivityManager.NetworkCallback d;

    /* JADX INFO: renamed from: com.ironsource.dc$a */
    public class a extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C3478dc.this.c.a(U3.a(network, this.a), U3.a(this.a, network));
                return;
            }
            InterfaceC3721r7 interfaceC3721r7 = C3478dc.this.c;
            String strB = U3.b(this.a);
            Context context = this.a;
            interfaceC3721r7.a(strB, U3.a(context, U3.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C3478dc.this.c.b(U3.a(network, this.a), U3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C3478dc.this.c.b(U3.a(network, this.a), U3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (U3.b(this.a).equals("none")) {
                C3478dc.this.c.a();
            }
        }
    }

    public C3478dc(InterfaceC3721r7 interfaceC3721r7) {
        this.c = interfaceC3721r7;
    }

    @Override // com.ironsource.InterfaceC3705q7
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception e) {
            C3631m4.d().a(e);
        }
    }

    @Override // com.ironsource.InterfaceC3705q7
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (U3.b(context).equals("none")) {
                this.c.a();
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
            } catch (Exception e) {
                C3631m4.d().a(e);
            }
        }
    }

    @Override // com.ironsource.InterfaceC3705q7
    public JSONObject c(Context context) {
        return U3.a(context, U3.a(context));
    }

    @Override // com.ironsource.InterfaceC3705q7
    public void a() {
        this.d = null;
    }
}
