package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.google.common.util.concurrent.ListenableFuture;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.x.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdqz {
    private final Executor zza;
    private final zzdqu zzb;
    private final zzdwy zzc;

    public zzdqz(Executor executor, zzdqu zzdquVar, zzdwy zzdwyVar) {
        this.zza = executor;
        this.zzb = zzdquVar;
        this.zzc = zzdwyVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture listenableFutureZza;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgym.zza(Collections.EMPTY_LIST);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue()) {
            Z.t(this.zzc.zze(), zzdwm.NATIVE_ASSETS_LOADING_CUSTOM_START.zza());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject == null) {
                listenableFutureZza = zzgym.zza(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    listenableFutureZza = zzgym.zza(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    listenableFutureZza = k.f38992h.equals(strOptString2) ? zzgym.zza(new zzdqw(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : d.c.k.equals(strOptString2) ? zzgym.zzk(this.zzb.zza(jSONObjectOptJSONObject, "image_value", null), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzdqx
                        @Override // com.google.android.gms.internal.ads.zzgpr
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdqw(strOptString, (zzbjj) obj);
                        }
                    }, this.zza) : zzgym.zza(null);
                }
            }
            arrayList.add(listenableFutureZza);
        }
        return zzgym.zzk(zzgym.zzm(arrayList), zzdqy.zza, this.zza);
    }
}
