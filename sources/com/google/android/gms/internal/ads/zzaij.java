package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaij extends zzaig {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzaij(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaij.class == obj.getClass()) {
            zzaij zzaijVar = (zzaij) obj;
            if (this.zza == zzaijVar.zza && this.zzb == zzaijVar.zzb && this.zzc == zzaijVar.zzc && Arrays.equals(this.zzd, zzaijVar.zzd) && Arrays.equals(this.zze, zzaijVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzd;
        int iHashCode = Arrays.hashCode(iArr) + (((((i2 * 31) + this.zzb) * 31) + this.zzc) * 31);
        return Arrays.hashCode(this.zze) + (iHashCode * 31);
    }
}
