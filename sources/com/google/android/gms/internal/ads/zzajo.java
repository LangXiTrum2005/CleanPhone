package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajo implements zzafv {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzajo(int i2, long j, int i3) {
        this.zza = i2;
        this.zzb = j;
        this.zzc = i3;
    }

    public final String toString() {
        String strZzx = zzfj.zzx(this.zza);
        int length = strZzx.length();
        long j = this.zzb;
        int length2 = String.valueOf(j).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i2).length() + 1);
        android.support.v4.media.a.A(sb, "AtomSizeTooSmall{type=", strZzx, ", size=");
        sb.append(j);
        sb.append(", minHeaderSize=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
