package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzefb {
    private final Context zza;
    private final zzgyw zzb;
    private final zzgyw zzc;
    private final zzija zzd;
    private final VersionInfoParcel zze;
    private final zzeex zzf;
    private final zzdxe zzg;

    public zzefb(Context context, zzgyw zzgywVar, zzgyw zzgywVar2, zzija zzijaVar, VersionInfoParcel versionInfoParcel, zzeex zzeexVar, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzb = zzgywVar;
        this.zzc = zzgywVar2;
        this.zzd = zzijaVar;
        this.zze = versionInfoParcel;
        this.zzf = zzeexVar;
        this.zzg = zzdxeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzefw) this.zzd.zzb()).zzi(this.zze.afmaVersion);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpw)).booleanValue()) {
                zzdxd zzdxdVarZza = this.zzg.zza();
                zzdxdVarZza.zzc("action", "ptard");
                zzdxdVarZza.zzc("ptard", "l");
                zzdxdVarZza.zzd();
            }
        } catch (RemoteException | NullPointerException e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpx)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zza.getPackageName())) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeez
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
            return;
        }
        zzeey zzeeyVar = new zzeey(this);
        zzefd zzefdVarZzb = this.zzf.zzb();
        zzefdVarZzb.zzb(zzeeyVar);
        final zzedl zzedlVarZza = zzefdVarZzb.zza().zza();
        zzgyw zzgywVar = this.zzb;
        Objects.requireNonNull(zzedlVarZza);
        zzgywVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzedlVarZza.zza();
            }
        });
    }

    public final /* synthetic */ zzdxe zzd() {
        return this.zzg;
    }
}
