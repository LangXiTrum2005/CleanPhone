package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f7266a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.h fVar;
        u.g("BillingClientTesting", "Billing Override Service connected.");
        j jVar = this.f7266a;
        int i10 = com.google.android.gms.internal.play_billing.g.f24269b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            fVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.h ? (com.google.android.gms.internal.play_billing.h) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.f(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
        }
        jVar.M = fVar;
        jVar.L = 2;
        jVar.O(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        u.h("BillingClientTesting", "Billing Override Service disconnected.");
        j jVar = this.f7266a;
        jVar.M = null;
        jVar.L = 0;
    }
}
