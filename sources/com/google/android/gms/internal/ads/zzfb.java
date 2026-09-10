package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfb extends IllegalStateException {
    public final int zza;
    public final int zzb;

    public zzfb(int i2, int i3) {
        super(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Z.n(new StringBuilder(String.valueOf(i3).length() + 31), "Player stuck suppressed for ", i3, " ms") : Z.n(new StringBuilder(String.valueOf(i3).length() + 43), "Player stuck playing without ending for ", i3, " ms") : Z.n(new StringBuilder(String.valueOf(i3).length() + 45), "Player stuck playing with no progress for ", i3, " ms") : Z.n(new StringBuilder(String.valueOf(i3).length() + 47), "Player stuck buffering with no progress for ", i3, " ms") : Z.n(new StringBuilder(String.valueOf(i3).length() + 46), "Player stuck buffering and not loading for ", i3, " ms"));
        this.zza = i2;
        this.zzb = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfb.class == obj.getClass()) {
            zzfb zzfbVar = (zzfb) obj;
            if (this.zza == zzfbVar.zza && this.zzb == zzfbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }
}
