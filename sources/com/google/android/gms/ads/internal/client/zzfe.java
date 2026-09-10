package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzfe extends zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzff f10870a;

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(zzm zzmVar) throws RemoteException {
        zzi(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    @Nullable
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzg() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    @Nullable
    public final String zzh() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzi(zzm zzmVar, int i10) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzfd(this));
    }
}
