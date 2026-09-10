package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaip implements zzao {
    public final List zza;

    public zzaip(List list) {
        this.zza = list;
        boolean z2 = false;
        if (!list.isEmpty()) {
            long j = ((zzaio) list.get(0)).zzb;
            for (int i2 = 1; i2 < list.size(); i2++) {
                if (((zzaio) list.get(i2)).zza < j) {
                    z2 = true;
                    break;
                }
                j = ((zzaio) list.get(i2)).zzb;
            }
        }
        zzgqa.zza(!z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaip.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzaip) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }
}
