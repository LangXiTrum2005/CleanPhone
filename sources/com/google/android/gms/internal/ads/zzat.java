package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzat extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzat(String str, Throwable th, boolean z2, int i2) {
        super(str, th);
        this.zza = z2;
        this.zzb = i2;
    }

    public static zzat zza(String str, Throwable th) {
        return new zzat(str, th, true, 0);
    }

    public static zzat zzb(String str, Throwable th) {
        return new zzat(str, th, true, 1);
    }

    public static zzat zzc(String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        boolean z2 = this.zza;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + String.valueOf(z2).length() + strConcat.length() + 20 + 11 + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z2);
        sb.append(", dataType=");
        return android.support.v4.media.a.i(i2, "}", sb);
    }
}
