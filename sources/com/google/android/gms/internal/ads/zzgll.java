package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgll extends zzgek {
    private final zzgni zza;

    public zzgll(zzgni zzgniVar) {
        this.zza = zzgniVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgll)) {
            return false;
        }
        zzgni zzgniVar = ((zzgll) obj).zza;
        return this.zza.zzc().zzg().equals(zzgniVar.zzc().zzg()) && this.zza.zzc().zzi().equals(zzgniVar.zzc().zzi()) && this.zza.zzc().zzh().equals(zzgniVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgni zzgniVar = this.zza;
        return Objects.hash(zzgniVar.zzc(), zzgniVar.zzd());
    }

    public final String toString() {
        String str;
        String strZzi = this.zza.zzc().zzi();
        int iOrdinal = this.zza.zzc().zzg().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return AbstractC5044xl.n("(typeUrl=", strZzi, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgtp.RAW;
    }

    public final zzgni zzb() {
        return this.zza;
    }
}
