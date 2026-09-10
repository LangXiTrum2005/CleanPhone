package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;

/* JADX INFO: loaded from: classes4.dex */
final class zzgnp extends zzgoq {
    private final int zza;
    private final String zzb;
    private final int zzc;

    public /* synthetic */ zzgnp(int i2, String str, int i3, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = i3;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgoq) {
            zzgoq zzgoqVar = (zzgoq) obj;
            if (this.zza == zzgoqVar.zza() && ((str = this.zzb) != null ? str.equals(zzgoqVar.zzb()) : zzgoqVar.zzb() == null) && this.zzc == zzgoqVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        int i2 = this.zza;
        int length = String.valueOf(i2).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i3).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i2);
        sb.append(", sessionToken=");
        sb.append(str);
        return Z.n(sb, ", uiMode=", i3, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final int zzc() {
        return this.zzc;
    }
}
