package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczo {
    private final zzfmu zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzija zzg;
    private final String zzh;
    private final zzfaa zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfik zzk;
    private final int zzl;
    private final zzdgd zzm;

    public zzczo(zzfmu zzfmuVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzija zzijaVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzfaa zzfaaVar, zzfik zzfikVar, zzdgd zzdgdVar, int i2) {
        this.zza = zzfmuVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzijaVar;
        this.zzh = str2;
        this.zzi = zzfaaVar;
        this.zzj = zzgVar;
        this.zzk = zzfikVar;
        this.zzm = zzdgdVar;
        this.zzl = i2;
    }

    public final ListenableFuture zza(Bundle bundle) {
        this.zzm.zza();
        zzfmo zzfmoVar = zzfmo.SIGNALS;
        zzfmu zzfmuVar = this.zza;
        Objects.requireNonNull(zzfmuVar);
        return zzfmf.zza(this.zzi.zza(new zzczm(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfmoVar, zzfmuVar).zzi();
    }

    public final ListenableFuture zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final ListenableFuture listenableFutureZza = zza(bundle);
        return this.zza.zzb(zzfmo.REQUEST_PARCEL, listenableFutureZza, (ListenableFuture) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzczn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(listenableFutureZza, bundle);
            }
        }).zzi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzbza zzc(ListenableFuture listenableFuture, Bundle bundle) {
        zzczm zzczmVar = (zzczm) listenableFuture.get();
        Bundle bundle2 = zzczmVar.zza;
        String str = (String) ((ListenableFuture) this.zzg.zzb()).get();
        boolean z2 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhQ)).booleanValue() && this.zzj.zzx()) {
            z2 = true;
        }
        boolean z3 = z2;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzbza(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z3, this.zzk.zza(), bundle, zzczmVar.zzb, this.zzl);
    }
}
