package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhcu extends zzhbe {
    private final zzhcz zza;
    private final zzhxe zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    private zzhcu(zzhcz zzhczVar, zzhxe zzhxeVar, zzhxc zzhxcVar, @Nullable Integer num) {
        this.zza = zzhczVar;
        this.zzb = zzhxeVar;
        this.zzc = zzhxcVar;
        this.zzd = num;
    }

    public static zzhcu zzd(zzhcy zzhcyVar, zzhxe zzhxeVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhxc zzhxcVarZzb;
        zzhcy zzhcyVar2 = zzhcy.zzc;
        if (zzhcyVar != zzhcyVar2 && num == null) {
            String string = zzhcyVar.toString();
            throw new GeneralSecurityException(android.support.v4.media.a.s(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhcyVar == zzhcyVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhxeVar.zzd() != 32) {
            int iZzd = zzhxeVar.zzd();
            throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZzd, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 74)));
        }
        zzhcz zzhczVarZzb = zzhcz.zzb(zzhcyVar);
        if (zzhczVarZzb.zzc() == zzhcyVar2) {
            zzhxcVarZzb = zzhjf.zza;
        } else if (zzhczVarZzb.zzc() == zzhcy.zzb) {
            zzhxcVarZzb = zzhjf.zza(num.intValue());
        } else {
            if (zzhczVarZzb.zzc() != zzhcy.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhczVarZzb.zzc().toString()));
            }
            zzhxcVarZzb = zzhjf.zzb(num.intValue());
        }
        return new zzhcu(zzhczVarZzb, zzhxeVar, zzhxcVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final zzhxc zzc() {
        return this.zzc;
    }

    public final zzhxe zze() {
        return this.zzb;
    }

    public final zzhcz zzf() {
        return this.zza;
    }
}
