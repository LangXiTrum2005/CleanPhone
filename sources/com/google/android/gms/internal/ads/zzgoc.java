package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgoc {

    @Nullable
    private Integer zza = null;

    @Nullable
    private Integer zzb = null;
    private zzgod zzc = zzgod.zzd;

    private zzgoc() {
    }

    public final zzgoc zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgoc zzb(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(AbstractC3950lJ.p("Invalid tag size for AesCmacParameters: ", i));
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzgoc zzc(zzgod zzgodVar) {
        this.zzc = zzgodVar;
        return this;
    }

    public final zzgof zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzgof(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzgoc(zzgoe zzgoeVar) {
    }
}
