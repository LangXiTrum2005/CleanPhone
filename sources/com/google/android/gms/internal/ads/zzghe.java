package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghe extends zzget {
    private final zzghg zza;
    private final zzgvo zzb;

    @Nullable
    private final Integer zzc;

    private zzghe(zzghg zzghgVar, zzgvo zzgvoVar, @Nullable Integer num) {
        this.zza = zzghgVar;
        this.zzb = zzgvoVar;
        this.zzc = num;
    }

    public static zzghe zza(zzghg zzghgVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzgvoVarZzb;
        if (zzghgVar.zzb() == zzghf.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgvoVarZzb = zzgvo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzghgVar.zzb() != zzghf.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzghgVar.zzb().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgvoVarZzb = zzgvo.zzb(new byte[0]);
        }
        return new zzghe(zzghgVar, zzgvoVarZzb, num);
    }

    public final zzghg zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
