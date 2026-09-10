package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdh extends zzhbe {
    private final zzhdj zza;
    private final zzhxc zzb;

    @Nullable
    private final Integer zzc;

    private zzhdh(zzhdj zzhdjVar, zzhxc zzhxcVar, @Nullable Integer num) {
        this.zza = zzhdjVar;
        this.zzb = zzhxcVar;
        this.zzc = num;
    }

    public static zzhdh zzd(zzhdj zzhdjVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhxc zzhxcVarZza;
        if (zzhdjVar.zzd() == zzhdi.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzhxcVarZza = zzhxc.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhdjVar.zzd() != zzhdi.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzhdjVar.zzd().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzhxcVarZza = zzhxc.zza(new byte[0]);
        }
        return new zzhdh(zzhdjVar, zzhxcVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final zzhxc zzc() {
        return this.zzb;
    }

    public final zzhdj zze() {
        return this.zza;
    }
}
