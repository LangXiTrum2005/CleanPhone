package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.yr;
import java.util.Collections;
import java.util.List;
import s9.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfj extends zzcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yr f10875a;

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                yr yrVar = this.f10874a.f10875a;
                if (yrVar != null) {
                    try {
                        yrVar.zzb(Collections.EMPTY_LIST);
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onComplete event.", e10);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zzk() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzl() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(yr yrVar) throws RemoteException {
        this.f10875a = yrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzw() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzf(float f10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzg(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(@Nullable String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(st stVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(zzfr zzfrVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(zzdk zzdkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(a aVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(@Nullable String str, a aVar) throws RemoteException {
    }
}
