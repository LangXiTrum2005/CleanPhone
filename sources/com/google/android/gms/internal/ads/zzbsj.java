package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbsj implements zzbrv {
    private final zzbrx zza;
    private final zzbry zzb;
    private final zzbrr zzc;
    private final String zzd;

    public zzbsj(zzbrr zzbrrVar, String str, zzbry zzbryVar, zzbrx zzbrxVar) {
        this.zzc = zzbrrVar;
        this.zzd = str;
        this.zzb = zzbryVar;
        this.zza = zzbrxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final ListenableFuture zzb(Object obj) {
        zzcdt zzcdtVar = new zzcdt();
        zzbrl zzbrlVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbrlVarZzb.zze(new zzbsg(this, zzbrlVarZzb, obj, zzcdtVar), new zzbsh(this, zzcdtVar, zzbrlVarZzb));
        return zzcdtVar;
    }

    public final /* synthetic */ void zzc(zzbrl zzbrlVar, zzbrs zzbrsVar, Object obj, zzcdt zzcdtVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String string = UUID.randomUUID().toString();
            zzbnm.zzo.zzb(string, new zzbsi(this, zzbrlVar, zzcdtVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbrsVar.zzb(this.zzd, jSONObject);
        } catch (Exception e2) {
            try {
                zzcdtVar.zzd(e2);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e2);
            } finally {
                zzbrlVar.zza();
            }
        }
    }

    public final /* synthetic */ zzbrx zzd() {
        return this.zza;
    }
}
