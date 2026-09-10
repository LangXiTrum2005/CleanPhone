package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzemg implements zzejg {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zza(zzfic zzficVar, zzfhr zzfhrVar) {
        return !TextUtils.isEmpty(zzfhrVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final ListenableFuture zzb(zzfic zzficVar, zzfhr zzfhrVar) {
        JSONObject jSONObject = zzfhrVar.zzv;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfik zzfikVar = zzficVar.zza.zza;
        zzfij zzfijVar = new zzfij();
        zzfijVar.zzz(zzfikVar);
        zzfijVar.zzg(strOptString);
        zzfijVar.zzy(true);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfikVar.zzd;
        Bundle bundleZzd = zzd(zzmVar.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfhrVar.zzD;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        zzfijVar.zza(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, bundleZzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundleZzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz, zzmVar.zzA));
        zzfik zzfikVarZzA = zzfijVar.zzA();
        Bundle bundle = new Bundle();
        zzfhu zzfhuVar = zzficVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfhuVar.zza));
        bundle2.putInt("refresh_interval", zzfhuVar.zzc);
        bundle2.putString("gws_query_id", zzfhuVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        Bundle bundleD = androidx.media3.extractor.text.ttml.a.d("initial_ad_unit_id", zzfikVar.zzg);
        bundleD.putString("allocation_id", zzfhrVar.zzw);
        bundleD.putString("ad_source_name", zzfhrVar.zzF);
        bundleD.putStringArrayList("click_urls", new ArrayList<>(zzfhrVar.zzc));
        bundleD.putStringArrayList("imp_urls", new ArrayList<>(zzfhrVar.zzd));
        bundleD.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfhrVar.zzp));
        bundleD.putStringArrayList("fill_urls", new ArrayList<>(zzfhrVar.zzm));
        bundleD.putStringArrayList("video_start_urls", new ArrayList<>(zzfhrVar.zzg));
        bundleD.putStringArrayList("video_reward_urls", new ArrayList<>(zzfhrVar.zzh));
        bundleD.putStringArrayList("video_complete_urls", new ArrayList<>(zzfhrVar.zzi));
        bundleD.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzfhrVar.zzj);
        bundleD.putString("valid_from_timestamp", zzfhrVar.zzk);
        bundleD.putBoolean("is_closable_area_disabled", zzfhrVar.zzP);
        bundleD.putString("recursive_server_response_data", zzfhrVar.zzao);
        bundleD.putBoolean("is_analytics_logging_enabled", zzfhrVar.zzW);
        zzbzy zzbzyVar = zzfhrVar.zzl;
        if (zzbzyVar != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("rb_amount", zzbzyVar.zzb);
            bundle3.putString("rb_type", zzbzyVar.zza);
            bundleD.putParcelableArray("rewards", new Bundle[]{bundle3});
        }
        bundle.putBundle("parent_ad_config", bundleD);
        return zzc(zzfikVarZzA, bundle, zzfhrVar, zzficVar);
    }

    public abstract ListenableFuture zzc(zzfik zzfikVar, Bundle bundle, zzfhr zzfhrVar, zzfic zzficVar);
}
