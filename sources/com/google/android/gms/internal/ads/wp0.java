package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzm;
import com.ironsource.O6;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wp0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou0 f21562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21564c;

    public wp0(ou0 ou0Var, long j10, long j11) {
        this.f21562a = ou0Var;
        this.f21563b = j10;
        this.f21564c = j11;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        ou0 ou0Var = this.f21562a;
        zzm zzmVar = ou0Var.f18363d;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", ou0Var.f18366g);
        int i10 = ou0Var.f18374p.f38703b;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i11 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j10 = this.f21563b;
        bundle.putLong("start_signals_timestamp", j10);
        if (((Boolean) zzba.zzc().a(am.jf)).booleanValue()) {
            bundle.putLong("tsi", j10 - this.f21564c);
        }
        rb0.A(bundle, "is_sdk_preload", true, zzmVar.zzc());
        rb0.r(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j11 = zzmVar.zzb;
        String str = simpleDateFormat.format(new Date(j11));
        boolean z10 = false;
        rb0.r(bundle, "cust_age", str, j11 != -1);
        Bundle bundle2 = zzmVar.zzc;
        if (bundle2 != null) {
            bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
        }
        int i12 = zzmVar.zzd;
        rb0.x(bundle, "cust_gender", i12, i12 != -1);
        List list = zzmVar.zze;
        if (list != null) {
            bundle.putStringArrayList("kw", new ArrayList<>(list));
        }
        int i13 = zzmVar.zzg;
        rb0.x(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i14 = zzmVar.zza;
        rb0.x(bundle, "d_imp_hdr", 1, i14 >= 2 && zzmVar.zzh);
        String str2 = zzmVar.zzi;
        rb0.r(bundle, "ppid", str2, i14 >= 2 && !TextUtils.isEmpty(str2));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong(O6.f26746s, (long) latitude);
            bundle3.putLong(Constants.LONG, (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        rb0.F("url", bundle, zzmVar.zzl);
        List list2 = zzmVar.zzv;
        if (list2 != null) {
            bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
        }
        Bundle bundle4 = zzmVar.zzn;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        List list3 = zzmVar.zzo;
        if (list3 != null) {
            bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
        }
        rb0.F("request_agent", bundle, zzmVar.zzp);
        rb0.F("request_pkg", bundle, zzmVar.zzq);
        rb0.A(bundle, "is_designed_for_families", zzmVar.zzr, i14 >= 7);
        if (i14 >= 8) {
            int i15 = zzmVar.zzt;
            rb0.x(bundle, "tag_for_under_age_of_consent", i15, i15 != -1);
            rb0.F("max_ad_content_rating", bundle, zzmVar.zzu);
        }
        int i16 = zzmVar.zzB;
        rb0.x(bundle, "tfat", i16, i16 != -1);
        Bundle bundle5 = ou0Var.f18364e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        rb0.F("plid", bundle, bundle5.getString("plid"));
        if (ou0Var.f18380v && (zzmVar.zzs != null || zzmVar.zzx != null)) {
            z10 = true;
        }
        rb0.x(bundle, "s2s_rr", 1, z10);
    }
}
