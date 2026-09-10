package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzhc extends IOException {
    public final int zza;

    public zzhc(int i2) {
        this.zza = i2;
    }

    public zzhc(String str, int i2) {
        super(str);
        this.zza = i2;
    }

    public zzhc(String str, Throwable th, int i2) {
        super(str, th);
        this.zza = i2;
    }

    public zzhc(Throwable th, int i2) {
        super(th);
        this.zza = i2;
    }
}
