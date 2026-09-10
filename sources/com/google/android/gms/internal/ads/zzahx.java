package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahx extends zzaig {
    public final byte[] zza;

    public zzahx(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahx.class == obj.getClass()) {
            zzahx zzahxVar = (zzahx) obj;
            if (this.zzf.equals(zzahxVar.zzf) && Arrays.equals(this.zza, zzahxVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return Arrays.hashCode(this.zza) + (iHashCode * 31);
    }
}
