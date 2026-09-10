package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkk extends RuntimeException {
    public zzhkk(String str) {
        super(str);
    }

    public static Object zza(zzhkj zzhkjVar) {
        try {
            return zzhkjVar.zza();
        } catch (Exception e2) {
            throw new zzhkk(e2);
        }
    }

    public zzhkk(String str, Throwable th) {
        super(str, th);
    }

    public zzhkk(Throwable th) {
        super(th);
    }
}
