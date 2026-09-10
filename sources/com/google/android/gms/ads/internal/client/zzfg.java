package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzfg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzfh f10872a;

    public zzfg(zzfh zzfhVar) {
        this.f10872a = zzfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar = this.f10872a.f10873a;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzc(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
