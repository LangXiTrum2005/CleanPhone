package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghg extends zzgeu {
    private final String zza;
    private final zzghf zzb;

    private zzghg(String str, zzghf zzghfVar) {
        this.zza = str;
        this.zzb = zzghfVar;
    }

    public static zzghg zzc(String str, zzghf zzghfVar) {
        return new zzghg(str, zzghfVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghg)) {
            return false;
        }
        zzghg zzghgVar = (zzghg) obj;
        return zzghgVar.zza.equals(this.zza) && zzghgVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzghg.class, this.zza, this.zzb);
    }

    public final String toString() {
        return DM.n(new StringBuilder("LegacyKmsAead Parameters (keyUri: "), this.zza, ", variant: ", this.zzb.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzb != zzghf.zzb;
    }

    public final zzghf zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}
