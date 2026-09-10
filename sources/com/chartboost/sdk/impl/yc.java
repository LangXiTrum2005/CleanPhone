package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f15635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f15636c;
    public final b d;

    public interface a {
        void a();

        void b();
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            boolean z2;
            a aVar;
            Intrinsics.f(network, "network");
            NetworkCapabilities networkCapabilities = yc.this.f15635b.getNetworkCapabilities(network);
            yc ycVar = yc.this;
            if (networkCapabilities != null) {
                z2 = networkCapabilities.hasCapability(12);
            }
            ycVar.f15634a = z2;
            if (!yc.this.f15634a || (aVar = yc.this.f15636c) == null) {
                return;
            }
            aVar.a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.f(network, "network");
            yc.this.f15634a = false;
            a aVar = yc.this.f15636c;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public yc(Context context) {
        Intrinsics.f(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f15635b = (ConnectivityManager) systemService;
        this.d = new b();
    }

    public final void b() {
        this.f15635b.unregisterNetworkCallback(this.d);
        this.f15636c = null;
    }

    public final boolean a() {
        return this.f15634a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    public final void a(a aVar) {
        boolean z2;
        this.f15636c = aVar;
        this.f15635b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.d);
        NetworkCapabilities networkCapabilities = this.f15635b.getNetworkCapabilities(this.f15635b.getActiveNetwork());
        if (networkCapabilities != null) {
            z2 = networkCapabilities.hasCapability(12);
        }
        this.f15634a = z2;
        if (!z2 || aVar == null) {
            return;
        }
        aVar.a();
    }

    public static /* synthetic */ void a(yc ycVar, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = null;
        }
        ycVar.a(aVar);
    }
}
