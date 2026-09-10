package com.mbridge.msdk.config.component.status;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConnectivityManager f32397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f32398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f32399d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.mbridge.msdk.config.component.status.a> f32396a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConnectivityManager.NetworkCallback f32400e = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            boolean zHasTransport = networkCapabilities.hasTransport(1);
            boolean zHasTransport2 = networkCapabilities.hasTransport(0);
            int iC = zHasTransport ? 9 : -1;
            if (zHasTransport2) {
                iC = c.this.c();
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916002");
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(iC));
            bVar.a(map);
            c.this.a(bVar);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            super.onLost(network);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916002");
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(c.this.c()));
            bVar.a(map);
            c.this.a(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                int iC = c.this.c();
                com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
                bVar.b("916002");
                HashMap map = new HashMap();
                map.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(iC));
                bVar.a(map);
                c.this.a(bVar);
            } catch (Throwable th2) {
                q0.b("MBNetworkEventPublisher", th2.getMessage());
            }
        }

        public /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    public c() {
        a(com.mbridge.msdk.foundation.controller.c.n().d());
        a();
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        this.f32396a.remove(aVar);
    }

    @SuppressLint({"MissingPermission"})
    public int c() {
        NetworkInfo activeNetworkInfo;
        if (this.f32399d) {
            TelephonyManager telephonyManager = (TelephonyManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("phone");
            return m0.c(telephonyManager != null ? telephonyManager.getDataNetworkType() : 0);
        }
        ConnectivityManager connectivityManager = this.f32397b;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        return m0.c(activeNetworkInfo.getSubtype());
    }

    public void d() {
        if (this.f32396a.isEmpty()) {
            b();
        }
    }

    private void a() {
        int iA = b0.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_PHONE_STATE");
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 33) {
            this.f32399d = iA == 0;
            return;
        }
        int iA2 = b0.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_BASIC_PHONE_STATE");
        if (iA != 0 && iA2 != 0) {
            z10 = false;
        }
        this.f32399d = z10;
    }

    public void b() {
        if (this.f32397b == null) {
            this.f32397b = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
        }
        this.f32397b.unregisterNetworkCallback(this.f32400e);
        this.f32397b = null;
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar == null || this.f32396a.contains(aVar)) {
            return;
        }
        this.f32396a.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.f32396a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th2) {
            q0.b("MBNetworkEventPublisher", th2.getMessage());
        }
    }

    private void a(Context context) {
        this.f32397b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f32397b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(11).addCapability(12).build(), this.f32400e);
    }
}
