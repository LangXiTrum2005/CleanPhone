package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.uw;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class QueryInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzex f11559a;

    public QueryInfo(zzex zzexVar) {
        this.f11559a = zzexVar;
    }

    public static void a(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        am.a(context);
        if (((Boolean) dn.f13598j.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdRequest adRequest2 = adRequest;
                        new uw(context, adFormat, adRequest2 == null ? null : adRequest2.zza(), str, 0).j(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new uw(context, adFormat, adRequest == null ? null : adRequest.zza(), str, 0).j(queryInfoGenerationCallback);
    }

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        a(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    @NonNull
    public String getQuery() {
        return this.f11559a.zza();
    }

    @NonNull
    public Bundle getQueryBundle() {
        return this.f11559a.zzc();
    }

    @NonNull
    public String getRequestId() {
        return this.f11559a.zzb();
    }

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull String str, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        c0.i(str, "AdUnitId cannot be null.");
        a(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
