package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: renamed from: com.startapp.sdk.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C3397h extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f41024a;

    public C3397h(i iVar) {
        this.f41024a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int iA = g6.a(networkCapabilities);
        synchronized (this.f41024a.f41071c) {
            this.f41024a.f41071c.put(network, Integer.valueOf(iA));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (this.f41024a.f41071c) {
            this.f41024a.f41071c.remove(network);
        }
    }
}
