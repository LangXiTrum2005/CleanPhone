package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrv extends zzbko {
    private final String zza;
    private final zzdnh zzb;
    private final zzdnm zzc;

    public zzdrv(String str, zzdnh zzdnhVar, zzdnm zzdnmVar) {
        this.zza = str;
        this.zzb = zzdnhVar;
        this.zzc = zzdnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final IObjectWrapper zzb() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final String zzc() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final List zzd() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final String zze() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final zzbjy zzf() throws RemoteException {
        return this.zzc.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final String zzg() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final String zzh() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final Bundle zzi() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzj() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final com.google.android.gms.ads.internal.client.zzed zzk() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzl(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzm(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzn(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final zzbjr zzo() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final IObjectWrapper zzp() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final String zzq() throws RemoteException {
        return this.zza;
    }
}
