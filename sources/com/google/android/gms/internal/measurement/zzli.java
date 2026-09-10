package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class zzli extends zzlj {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzli(byte[] bArr, int i2, int i3, boolean z2, byte[] bArr2) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i2) throws zzmr {
        int i3 = this.zzd;
        this.zzd = 0;
        int i4 = this.zzb + this.zzc;
        this.zzb = i4;
        if (i4 <= 0) {
            this.zzc = 0;
            return i3;
        }
        this.zzc = i4;
        this.zzb = 0;
        return i3;
    }
}
