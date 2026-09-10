package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzebr extends Exception {
    private final int zza;

    public zzebr(int i2) {
        this.zza = i2;
    }

    public final int zza() {
        return this.zza;
    }

    public zzebr(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public zzebr(int i2, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
