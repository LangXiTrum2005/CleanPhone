package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbaz extends zzbbh {
    private final StackTraceElement[] zzh;

    public zzbaz(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(zzaztVar, "ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=", zzavsVar, i2, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzazk zzazkVar = new zzazk((String) this.zze.invoke(null, stackTraceElementArr));
            zzavs zzavsVar = this.zzd;
            synchronized (zzavsVar) {
                try {
                    zzavsVar.zzC(zzazkVar.zza.longValue());
                    if (zzazkVar.zzb.booleanValue()) {
                        zzavsVar.zzag(true != zzazkVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        zzavsVar.zzag(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
