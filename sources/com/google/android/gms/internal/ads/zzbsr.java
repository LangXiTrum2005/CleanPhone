package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbsr implements zzgxu {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    public zzbsr(ListenableFuture listenableFuture, String str, zzbry zzbryVar, zzbrx zzbrxVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzgym.zzj(this.zzb, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzbsq
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return this.zza.zzc(obj, (zzbrs) obj2);
            }
        }, zzcdo.zzg);
    }

    public final /* synthetic */ ListenableFuture zzc(Object obj, zzbrs zzbrsVar) throws JSONException {
        zzcdt zzcdtVar = new zzcdt();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbnm.zzo.zzb(string, new zzbsp(this, zzcdtVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbrsVar.zzb(this.zza, jSONObject);
        return zzcdtVar;
    }
}
