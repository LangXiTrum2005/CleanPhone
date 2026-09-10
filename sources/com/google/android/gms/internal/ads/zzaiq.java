package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaiq implements zzao {
    public final float zza;
    public final int zzb;

    public zzaiq(float f, int i2) {
        this.zza = f;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaiq.class == obj.getClass()) {
            zzaiq zzaiqVar = (zzaiq) obj;
            if (this.zza == zzaiqVar.zza && this.zzb == zzaiqVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }

    public final String toString() {
        float f = this.zza;
        int length = String.valueOf(f).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i2).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i2);
        return sb.toString();
    }
}
