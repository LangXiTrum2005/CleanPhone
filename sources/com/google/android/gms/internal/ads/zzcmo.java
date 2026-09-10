package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcmo implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcmo(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcmo zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzcmo(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbyt zzb() {
        Context contextZza = ((zzclp) this.zza).zza();
        zzfnr zzfnrVar = (zzfnr) this.zzb.zzb();
        zzgyw zzgywVarZzc = zzflk.zzc();
        zzbsf zzbsfVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfnrVar);
        zzbrz zzbrzVar = zzbsc.zza;
        zzbsfVarZza.zza("google.afma.request.getAdDictionary", zzbrzVar, zzbrzVar);
        return new zzbyw(contextZza, com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfnrVar).zza("google.afma.sdkConstants.getSdkConstants", zzbrzVar, zzbrzVar), VersionInfoParcel.forPackage(), zzgywVarZzc);
    }
}
