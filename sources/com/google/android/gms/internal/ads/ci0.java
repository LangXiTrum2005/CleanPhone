package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f13171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzu f13172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CsiUrlBuilder f13174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f13176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f13177i;

    public ci0(k00 k00Var, zzu zzuVar, CsiParamDefaults csiParamDefaults, CsiUrlBuilder csiUrlBuilder, Context context) {
        HashMap map = new HashMap();
        this.f13169a = map;
        this.f13176h = new AtomicBoolean();
        this.f13177i = new AtomicReference(new Bundle());
        this.f13171c = k00Var;
        this.f13172d = zzuVar;
        this.f13173e = ((Boolean) zzba.zzc().a(am.N2)).booleanValue();
        this.f13174f = csiUrlBuilder;
        this.f13175g = ((Boolean) zzba.zzc().a(am.a8)).booleanValue();
        this.f13170b = context;
        csiParamDefaults.set(map);
    }

    public final void a(Map map) {
        if (map == null || map.isEmpty()) {
            int i10 = zze.zza;
            zzo.zzd("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.f13176h.getAndSet(true);
        AtomicReference atomicReference = this.f13177i;
        if (!andSet) {
            String str = (String) zzba.zzc().a(am.f12170gc);
            atomicReference.set(zzac.zzc(this.f13170b, str, new lz(this, str)));
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void b(Map map) {
        if (map.isEmpty()) {
            int i10 = zze.zza;
            zzo.zzd("Empty paramMap.");
            return;
        }
        a(map);
        String strGenerateUrl = this.f13174f.generateUrl(map);
        zze.zza(strGenerateUrl);
        boolean z10 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f13173e) {
            if (!z10 || this.f13175g) {
                this.f13171c.execute(new di0(this, strGenerateUrl, 1));
            }
        }
    }

    public final void c(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            int i10 = zze.zza;
            zzo.zzd("Empty paramMap.");
            return;
        }
        a(abstractMap);
        String strGenerateUrl = this.f13174f.generateUrl(abstractMap);
        zze.zza(strGenerateUrl);
        if (((Boolean) zzba.zzc().a(am.Re)).booleanValue() || this.f13173e) {
            this.f13171c.execute(new di0(this, strGenerateUrl, 0));
        }
    }
}
