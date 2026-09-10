package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzekt implements zzejg {
    private final Context zza;
    private final zzdkz zzb;
    private final Executor zzc;
    private final zzfhq zzd;
    private final zzdxe zze;

    public zzekt(Context context, Executor executor, zzdkz zzdkzVar, zzfhq zzfhqVar, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzb = zzdkzVar;
        this.zzc = executor;
        this.zzd = zzfhqVar;
        this.zze = zzdxeVar;
    }

    private static String zze(zzfhr zzfhrVar) {
        try {
            return zzfhrVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zza(zzfic zzficVar, zzfhr zzfhrVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbhl.zza(context) && !TextUtils.isEmpty(zze(zzfhrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final ListenableFuture zzb(final zzfic zzficVar, final zzfhr zzfhrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzow)).booleanValue()) {
            zzdxd zzdxdVarZza = this.zze.zza();
            zzdxdVarZza.zzc("action", "cstm_tbs_rndr");
            zzdxdVarZza.zzd();
        }
        String strZze = zze(zzfhrVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfhu zzfhuVar = zzficVar.zzb.zzb;
        return zzgym.zzj(zzgym.zza(null), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzeks
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(uri, zzficVar, zzfhrVar, zzfhuVar, obj);
            }
        }, this.zzc);
    }

    public final /* synthetic */ ListenableFuture zzc(Uri uri, zzfic zzficVar, zzfhr zzfhrVar, zzfhu zzfhuVar, Object obj) {
        try {
            Intent intent = new CustomTabsIntent.Builder().a().f3706a;
            intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(intent, null);
            zzcdt zzcdtVar = new zzcdt();
            zzdjt zzdjtVarZzd = this.zzb.zzd(new zzcwa(zzficVar, zzfhrVar, null), new zzdjw(new zzekr(this, zzcdtVar, zzfhrVar), null));
            zzcdtVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdjtVarZzd.zzi(), null, new VersionInfoParcel(0, 0, false), null, null, zzfhuVar.zzb));
            this.zzd.zzd();
            return zzgym.zza(zzdjtVarZzd.zzh());
        } catch (Throwable th) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    public final /* synthetic */ zzdxe zzd() {
        return this.zze;
    }
}
