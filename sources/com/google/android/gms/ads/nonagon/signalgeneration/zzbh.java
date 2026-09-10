package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzect;
import com.google.android.gms.internal.ads.zzeeg;
import com.google.android.gms.internal.ads.zzgxu;
import com.google.android.gms.internal.ads.zzgym;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbh implements zzgxu {
    private final Executor zza;
    private final zzect zzb;

    public zzbh(Executor executor, zzect zzectVar) {
        this.zza = executor;
        this.zzb = zzectVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        final zzbza zzbzaVar = (zzbza) obj;
        return zzgym.zzj(this.zzb.zza(zzbzaVar), new zzgxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                zzeeg zzeegVar = (zzeeg) obj2;
                zzbj zzbjVar = new zzbj(new JsonReader(new InputStreamReader(zzeegVar.zza())), zzeegVar.zzb());
                zzbza zzbzaVar2 = zzbzaVar;
                try {
                    zzbjVar.zzb = com.google.android.gms.ads.internal.client.zzbb.zza().zzm(zzbzaVar2.zza).toString();
                } catch (JSONException unused) {
                    zzbjVar.zzb = JsonUtils.EMPTY_JSON;
                }
                Bundle bundle = zzbzaVar2.zzn;
                if (!bundle.isEmpty()) {
                    try {
                        zzbjVar.zzc = com.google.android.gms.ads.internal.client.zzbb.zza().zzm(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return zzgym.zza(zzbjVar);
            }
        }, this.zza);
    }
}
