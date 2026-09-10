package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgow extends zzgoz {
    private final int zza;
    private final int zzb;
    private final zzgou zzc;
    private final zzgot zzd;

    public /* synthetic */ zzgow(int i, int i2, zzgou zzgouVar, zzgot zzgotVar, zzgov zzgovVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgouVar;
        this.zzd = zzgotVar;
    }

    public static zzgos zze() {
        return new zzgos(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgow)) {
            return false;
        }
        zzgow zzgowVar = (zzgow) obj;
        return zzgowVar.zza == this.zza && zzgowVar.zzd() == zzd() && zzgowVar.zzc == this.zzc && zzgowVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgow.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        StringBuilder sbR = DM.r("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        sbR.append(this.zzb);
        sbR.append("-byte tags, and ");
        return AbstractC5044xl.o(sbR, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzc != zzgou.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgou zzgouVar = this.zzc;
        if (zzgouVar == zzgou.zzd) {
            return this.zzb;
        }
        if (zzgouVar == zzgou.zza || zzgouVar == zzgou.zzb || zzgouVar == zzgou.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgot zzf() {
        return this.zzd;
    }

    public final zzgou zzg() {
        return this.zzc;
    }
}
