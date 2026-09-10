package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfri {
    private final zzfru zza;
    private final zzfru zzb;
    private final boolean zzc;
    private final zzfrm zzd;
    private final zzfrp zze;

    private zzfri(zzfrm zzfrmVar, zzfrp zzfrpVar, zzfru zzfruVar, zzfru zzfruVar2, boolean z2) {
        this.zzd = zzfrmVar;
        this.zze = zzfrpVar;
        this.zza = zzfruVar;
        if (zzfruVar2 == null) {
            this.zzb = zzfru.NONE;
        } else {
            this.zzb = zzfruVar2;
        }
        this.zzc = z2;
    }

    public static zzfri zza(zzfrm zzfrmVar, zzfrp zzfrpVar, zzfru zzfruVar, zzfru zzfruVar2, boolean z2) {
        zzftf.zzb(zzfrmVar, "CreativeType is null");
        zzftf.zzb(zzfrpVar, "ImpressionType is null");
        zzftf.zzb(zzfruVar, "Impression owner is null");
        if (zzfruVar == zzfru.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfrmVar == zzfrm.DEFINED_BY_JAVASCRIPT && zzfruVar == zzfru.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfrpVar == zzfrp.DEFINED_BY_JAVASCRIPT && zzfruVar == zzfru.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfri(zzfrmVar, zzfrpVar, zzfruVar, zzfruVar2, z2);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzftb.zzc(jSONObject, "impressionOwner", this.zza);
        zzftb.zzc(jSONObject, "mediaEventsOwner", this.zzb);
        zzftb.zzc(jSONObject, "creativeType", this.zzd);
        zzftb.zzc(jSONObject, "impressionType", this.zze);
        zzftb.zzc(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
