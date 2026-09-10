package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.WebViewFeatureInternal;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzckq {
    private Profile zza = null;

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                int i2 = WebViewCompat.f8565a;
                if (!WebViewFeatureInternal.f8589l.c()) {
                    throw WebViewFeatureInternal.a();
                }
                WebViewCompat.c(webView).f8592a.setProfile("GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e2) {
                String strConcat = "WebViewCompat error: ".concat(e2.toString());
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzps)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "WebViewCompat.setProfile");
                }
            }
        }
    }

    public final void zzb(zzcku zzckuVar) {
        ProfileStore profileStore;
        if (!WebViewFeature.a("MULTI_PROFILE")) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfxq.zza("androidx.webkit.ProfileStore", Constants.GET_INSTANCE, new zzfxp[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzfxq.zza("androidx.webkit.ProfileStore$-CC", Constants.GET_INSTANCE, new zzfxp[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e3.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpr)).booleanValue()) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzckuVar.zza;
                zzdxd zzdxdVarZza = zzckuVar.zzb.zzd().zza();
                zzdxdVarZza.zzc("action", "webview_p_l");
                zzdxdVarZza.zzc("webview_p_l", Long.toString(jElapsedRealtime));
                zzdxdVarZza.zzd();
                return;
            }
            return;
        }
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpr)).booleanValue()) {
            zzdxd zzdxdVarZza2 = zzckuVar.zzb.zzd().zza();
            zzdxdVarZza2.zzc("action", "webview_p_f");
            zzdxdVarZza2.zzc("webview_p_f", "No instance");
            zzdxdVarZza2.zzd();
        }
    }
}
