package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvx extends Exception {
    private final int zza;

    public zzfvx(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfvx(int i2, Throwable th) {
        super(th);
        this.zza = i2;
    }
}
