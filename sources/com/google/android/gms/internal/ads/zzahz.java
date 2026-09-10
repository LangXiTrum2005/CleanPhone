package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahz extends zzaig {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzaig[] zze;

    public zzahz(String str, boolean z2, boolean z3, String[] strArr, zzaig[] zzaigVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = strArr;
        this.zze = zzaigVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahz.class == obj.getClass()) {
            zzahz zzahzVar = (zzahz) obj;
            if (this.zzb == zzahzVar.zzb && this.zzc == zzahzVar.zzc && Objects.equals(this.zza, zzahzVar.zza) && Arrays.equals(this.zzd, zzahzVar.zzd) && Arrays.equals(this.zze, zzahzVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        return str.hashCode() + (((i2 * 31) + (this.zzc ? 1 : 0)) * 31);
    }
}
