package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbg {
    private final zzazt zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzbbg(zzazt zzaztVar, String str, String str2, Class... clsArr) {
        this.zza = zzaztVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzaztVar.zzd().submit(new zzbbf(this));
    }

    private final String zzc(byte[] bArr, String str) throws zzayx, UnsupportedEncodingException {
        return new String(this.zza.zzf().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final /* synthetic */ void zzb() {
        try {
            zzazt zzaztVar = this.zza;
            Class<?> clsLoadClass = zzaztVar.zze().loadClass(zzc(zzaztVar.zzg(), this.zzb));
            if (clsLoadClass != null) {
                this.zzd = clsLoadClass.getMethod(zzc(zzaztVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzayx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } finally {
            this.zzf.countDown();
        }
    }
}
