package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbbh implements Callable {
    protected final zzazt zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzavs zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbbh(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        this.zza = zzaztVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzavsVar;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i2;
        try {
            long jNanoTime = System.nanoTime();
            zzazt zzaztVar = this.zza;
            Method methodZzo = zzaztVar.zzo(this.zzb, this.zzc);
            this.zze = methodZzo;
            if (methodZzo == null) {
                return null;
            }
            zza();
            zzayk zzaykVarZzh = zzaztVar.zzh();
            if (zzaykVarZzh == null || (i2 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzaykVarZzh.zza(this.zzg, i2, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
