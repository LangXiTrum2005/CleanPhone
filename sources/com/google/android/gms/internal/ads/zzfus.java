package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzfus extends zzful {
    private final Object zza;

    public zzfus(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfus) {
            return this.zza.equals(((zzfus) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return DM.B("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final zzful zza(zzfuc zzfucVar) {
        Object objApply = zzfucVar.apply(this.zza);
        zzfun.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzfus(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
