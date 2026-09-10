package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdsa extends zzblr {
    private final String zza;
    private final zzdnh zzb;
    private final zzdnm zzc;
    private final zzdxe zzd;

    public zzdsa(String str, zzdnh zzdnhVar, zzdnm zzdnmVar, zzdxe zzdxeVar) {
        this.zza = str;
        this.zzb = zzdnhVar;
        this.zzc = zzdnmVar;
        this.zzd = zzdxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final boolean zzA() throws RemoteException {
        zzdnm zzdnmVar = this.zzc;
        return (zzdnmVar.zzE().isEmpty() || zzdnmVar.zzF() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzB(com.google.android.gms.ads.internal.client.zzdj zzdjVar) throws RemoteException {
        this.zzb.zzA(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzC(com.google.android.gms.ads.internal.client.zzdf zzdfVar) throws RemoteException {
        this.zzb.zzB(zzdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzD() {
        this.zzb.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzE() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final zzbjv zzF() throws RemoteException {
        return this.zzb.zzP().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final boolean zzG() {
        return this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final com.google.android.gms.ads.internal.client.zzea zzH() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhB)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzI(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        try {
            if (!zzdtVar.zzf()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.zzb.zzQ(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzJ(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzor)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final long zzK() {
        zzdnh zzdnhVar = this.zzb;
        if (zzdnhVar == null || zzdnhVar.zzo() == null) {
            return 0L;
        }
        return zzdnhVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzL(long j) {
        zzdnh zzdnhVar = this.zzb;
        if (zzdnhVar == null || zzdnhVar.zzo() == null) {
            return;
        }
        zzdnhVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zze() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final List zzf() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzg() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final zzbjy zzh() throws RemoteException {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzi() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzj() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final double zzk() throws RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzl() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzm() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzo() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzp() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final zzbjr zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzt(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final IObjectWrapper zzu() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final IObjectWrapper zzv() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final Bundle zzw() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzx(zzblp zzblpVar) throws RemoteException {
        this.zzb.zzy(zzblpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzy() throws RemoteException {
        this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final List zzz() throws RemoteException {
        return zzA() ? this.zzc.zzE() : Collections.EMPTY_LIST;
    }
}
