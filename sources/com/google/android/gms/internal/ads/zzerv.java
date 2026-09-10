package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzerv implements zzezv {
    final zzfik zza;
    private final long zzb;
    private final long zzc;

    public zzerv(zzfik zzfikVar, long j, long j2) {
        this.zza = zzfikVar;
        this.zzb = j;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        zzfik zzfikVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfikVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzfikVar.zzg);
        int i2 = zzfikVar.zzp.zza;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i3 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j = this.zzb;
        bundle.putLong("start_signals_timestamp", j);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoR)).booleanValue()) {
            bundle.putLong("tsi", j - this.zzc);
        }
        zzfiz.zzd(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfiz.zzb(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j2 = zzmVar.zzb;
        zzfiz.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j2)), j2 != -1);
        zzfiz.zzf(bundle, "extras", zzmVar.zzc);
        int i4 = zzmVar.zzd;
        zzfiz.zzc(bundle, "cust_gender", i4, i4 != -1);
        zzfiz.zzg(bundle, "kw", zzmVar.zze);
        int i5 = zzmVar.zzg;
        zzfiz.zzc(bundle, "tag_for_child_directed_treatment", i5, i5 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i6 = zzmVar.zza;
        zzfiz.zzc(bundle, "d_imp_hdr", 1, i6 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfiz.zzb(bundle, "ppid", str, i6 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfiz.zze(bundle, "url", zzmVar.zzl);
        zzfiz.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfiz.zzf(bundle, "custom_targeting", zzmVar.zzn);
        zzfiz.zzg(bundle, "category_exclusions", zzmVar.zzo);
        zzfiz.zze(bundle, "request_agent", zzmVar.zzp);
        zzfiz.zze(bundle, "request_pkg", zzmVar.zzq);
        zzfiz.zzd(bundle, "is_designed_for_families", zzmVar.zzr, i6 >= 7);
        if (i6 >= 8) {
            int i7 = zzmVar.zzt;
            zzfiz.zzc(bundle, "tag_for_under_age_of_consent", i7, i7 != -1);
            zzfiz.zze(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
        Bundle bundle3 = zzfikVar.zze;
        zzfiz.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzfiz.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzfiz.zze(bundle, "plid", bundle3.getString("plid"));
        zzfiz.zzc(bundle, "s2s_rr", 1, zzfikVar.zzv && !(zzmVar.zzs == null && zzmVar.zzx == null));
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzczm) obj).zzb;
        zzfik zzfikVar = this.zza;
        bundle.putString("slotname", zzfikVar.zzg);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfikVar.zzd;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i2 = zzmVar.zzg;
        zzfiz.zzc(bundle, "tag_for_child_directed_treatment", i2, i2 != -1);
        if (zzmVar.zza >= 8) {
            int i3 = zzmVar.zzt;
            zzfiz.zzc(bundle, "tag_for_under_age_of_consent", i3, i3 != -1);
        }
        zzfiz.zze(bundle, "url", zzmVar.zzl);
        zzfiz.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = zzmVar.zzc;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziv)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfiz.zzf(bundle, "extras", bundle3);
    }
}
