package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgof extends zzgoz {
    private final int zza;
    private final int zzb;
    private final zzgod zzc;

    public /* synthetic */ zzgof(int i, int i2, zzgod zzgodVar, zzgoe zzgoeVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgodVar;
    }

    public static zzgoc zze() {
        return new zzgoc(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgof)) {
            return false;
        }
        zzgof zzgofVar = (zzgof) obj;
        return zzgofVar.zza == this.zza && zzgofVar.zzd() == zzd() && zzgofVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzgof.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        StringBuilder sbU = AbstractC3950lJ.u("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        sbU.append(this.zzb);
        sbU.append("-byte tags, and ");
        return AbstractC5044xl.o(sbU, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzc != zzgod.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgod zzgodVar = this.zzc;
        if (zzgodVar == zzgod.zzd) {
            return this.zzb;
        }
        if (zzgodVar == zzgod.zza || zzgodVar == zzgod.zzb || zzgodVar == zzgod.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgod zzf() {
        return this.zzc;
    }
}
