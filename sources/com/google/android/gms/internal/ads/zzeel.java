package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.umeng.ccg.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeel implements zzecw {
    private final Context zza;
    private final zzdfu zzb;
    private final Executor zzc;
    private final zzfbn zzd;
    private final zzdrw zze;

    public zzeel(Context context, Executor executor, zzdfu zzdfuVar, zzfbn zzfbnVar, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzdfuVar;
        this.zzc = executor;
        this.zzd = zzfbnVar;
        this.zze = zzdrwVar;
    }

    @Nullable
    private static String zze(zzfbo zzfboVar) {
        try {
            return zzfboVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final AI zza(final zzfca zzfcaVar, final zzfbo zzfboVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmT)).booleanValue()) {
            zzdrv zzdrvVarZza = this.zze.zza();
            zzdrvVarZza.zzb(a.w, "cstm_tbs_rndr");
            zzdrvVarZza.zzg();
        }
        String strZze = zze(zzfboVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        return zzgch.zzn(zzgch.zzh(null), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzc(uri, zzfcaVar, zzfboVar, zzfbrVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfcaVar, zzfbo zzfboVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbdm.zzg(context) && !TextUtils.isEmpty(zze(zzfboVar));
    }

    public final /* synthetic */ AI zzc(Uri uri, zzfca zzfcaVar, zzfbo zzfboVar, zzfbr zzfbrVar, Object obj) throws Exception {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null);
            final zzcab zzcabVar = new zzcab();
            zzder zzderVarZze = this.zzb.zze(new zzcrp(zzfcaVar, zzfboVar, null), new zzdeu(new zzdgc() { // from class: com.google.android.gms.internal.ads.zzeek
                @Override // com.google.android.gms.internal.ads.zzdgc
                public final void zza(boolean z, Context context, zzcwg zzcwgVar) throws zzdgb {
                    this.zza.zzd(zzcabVar, z, context, zzcwgVar);
                }
            }, null));
            zzcabVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzderVarZze.zza(), null, new VersionInfoParcel(0, 0, false), null, null, zzfbrVar.zzb));
            this.zzd.zza();
            return zzgch.zzh(zzderVarZze.zzg());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    public final /* synthetic */ void zzd(zzcab zzcabVar, boolean z, Context context, zzcwg zzcwgVar) throws zzdgb {
        try {
            com.google.android.gms.ads.internal.zzv.zzj();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzcabVar.get(), true, this.zze);
        } catch (Exception unused) {
        }
    }
}
