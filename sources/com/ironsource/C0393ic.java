package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0393ic implements InterfaceC0566s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28901a = "ic";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28902b = 23;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0584t7 f28903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f28904d;

    /* JADX INFO: renamed from: com.ironsource.ic$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f28905a;

        public a(Context context) {
            this.f28905a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C0393ic.this.f28903c.a(U3.a(network, this.f28905a), U3.a(this.f28905a, network));
                return;
            }
            InterfaceC0584t7 interfaceC0584t7 = C0393ic.this.f28903c;
            String strB = U3.b(this.f28905a);
            Context context = this.f28905a;
            interfaceC0584t7.a(strB, U3.a(context, U3.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C0393ic.this.f28903c.b(U3.a(network, this.f28905a), U3.a(this.f28905a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C0393ic.this.f28903c.b(U3.a(network, this.f28905a), U3.a(this.f28905a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (U3.b(this.f28905a).equals("none")) {
                C0393ic.this.f28903c.a();
            }
        }
    }

    public C0393ic(InterfaceC0584t7 interfaceC0584t7) {
        this.f28903c = interfaceC0584t7;
    }

    @Override // com.ironsource.InterfaceC0566s7
    @SuppressLint({"NewApi", "MissingPermission"})
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f28902b) {
            a(context);
            if (U3.b(context).equals("none")) {
                this.f28903c.a();
            }
            if (this.f28904d == null) {
                this.f28904d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.f28904d);
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                Log.e(this.f28901a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC0566s7
    public JSONObject c(Context context) {
        return U3.a(context, U3.a(context));
    }

    @Override // com.ironsource.InterfaceC0566s7
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f28902b || this.f28904d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f28904d);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            Log.e(this.f28901a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC0566s7
    public void a() {
        this.f28904d = null;
    }
}
