package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeto implements zzezv {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final String zzf;
    private final zzcxo zzg;

    public zzeto(Context context, Bundle bundle, String str, String str2, com.google.android.gms.ads.internal.util.zzg zzgVar, String str3, zzcxo zzcxoVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzgVar;
        this.zzf = str3;
        this.zzg = zzcxoVar;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgz)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.zzt(this.zza));
            } catch (RemoteException | RuntimeException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zze;
        if (!zzgVar.zzx()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !zzgVar.zzx());
        zzc(bundle);
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzcxo zzcxoVar = this.zzg;
            bundle2.putLong("dload", zzcxoVar.zzc(str));
            bundle2.putInt("pcc", zzcxoVar.zzb(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzld)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zzn() <= 0) {
            return;
        }
        bundle.putInt("nrwv", com.google.android.gms.ads.internal.zzt.zzh().zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzczm) obj).zzb;
        bundle.putBundle("quality_signals", this.zzb);
        zzc(bundle);
    }
}
