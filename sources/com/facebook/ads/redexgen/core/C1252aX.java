package com.facebook.ads.redexgen.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1252aX extends ConnectivityManager.NetworkCallback {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C1253aY A02;

    public C1252aX(C1253aY c1253aY) {
        this.A02 = c1253aY;
    }

    private void A00() {
        this.A02.A04.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.aV
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A02();
            }
        });
    }

    private void A01() {
        this.A02.A04.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.aW
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A03();
            }
        });
    }

    public final /* synthetic */ void A02() {
        if (this.A02.A02 == null) {
            return;
        }
        this.A02.A03();
    }

    public final /* synthetic */ void A03() {
        if (this.A02.A02 == null) {
            return;
        }
        this.A02.A04();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        A00();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (!z) {
            A01();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean networkValidated = this.A01;
        if (networkValidated) {
            boolean networkValidated2 = this.A00;
            if (networkValidated2 == zHasCapability) {
                if (!zHasCapability) {
                    return;
                }
                A01();
                return;
            }
        }
        this.A01 = true;
        this.A00 = zHasCapability;
        A00();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        A00();
    }
}
