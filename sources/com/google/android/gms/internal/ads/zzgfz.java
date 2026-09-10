package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgfz implements zzgfy {
    private final String zza;
    private final String zzb;
    private final zzgev zzc;
    private final zzavs zzd;
    private final zzgna zze;

    public zzgfz(String str, String str2, zzavs zzavsVar, zzgev zzgevVar, zzgna zzgnaVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzavsVar;
        this.zzc = zzgevVar;
        this.zze = zzgnaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th) {
            try {
                this.zze.zzb(th);
                throw th;
            } catch (Throwable th2) {
                this.zze.zzc();
                throw th2;
            }
        }
    }

    public abstract void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException;
}
