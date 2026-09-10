package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhrh {

    @Nullable
    private zzhre zza = null;

    @Nullable
    private ECPoint zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhrh() {
    }

    public final zzhrh zza(zzhre zzhreVar) {
        this.zza = zzhreVar;
        return this;
    }

    public final zzhrh zzb(ECPoint eCPoint) {
        this.zzb = eCPoint;
        return this;
    }

    public final zzhrh zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhri zzd() throws GeneralSecurityException {
        zzhxc zzhxcVarZza;
        zzhre zzhreVar = this.zza;
        if (zzhreVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.zzb;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        zzhhq.zza(eCPoint, zzhreVar.zzd().zza().getCurve());
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhrd.zzd) {
            zzhxcVarZza = zzhjf.zza;
        } else if (this.zza.zzf() == zzhrd.zzc || this.zza.zzf() == zzhrd.zzb) {
            zzhxcVarZza = zzhjf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhrd.zza) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.zza.zzf().toString()));
            }
            zzhxcVarZza = zzhjf.zzb(this.zzc.intValue());
        }
        return new zzhri(this.zza, this.zzb, zzhxcVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhrh(byte[] bArr) {
    }
}
