package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcfb {
    private static final AtomicInteger zza = new AtomicInteger(0);
    private static final AtomicInteger zzb = new AtomicInteger(0);

    public static int zzP() {
        return zza.get();
    }

    public static int zzQ() {
        return zzb.get();
    }

    public static AtomicInteger zzf() {
        return zza;
    }

    public static AtomicInteger zzi() {
        return zzb;
    }

    public abstract void zzA(int i2);

    public abstract boolean zzB();

    public abstract int zzC();

    public abstract long zzD();

    public abstract void zzE(boolean z2);

    public abstract void zzF(int i2);

    public abstract void zzG(int i2);

    public abstract long zzH();

    public abstract long zzI();

    public abstract long zzJ();

    public abstract long zzK();

    public abstract int zzL();

    public abstract void zzM(boolean z2);

    public abstract long zzN();

    public abstract long zzO();

    public abstract Integer zzj();

    public abstract void zzn(Integer num);

    public abstract void zzq(Uri[] uriArr, String str);

    public abstract void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z2);

    public abstract void zzs(zzcfa zzcfaVar);

    public abstract void zzt();

    public abstract void zzu(Surface surface, boolean z2) throws IOException;

    public abstract void zzv(float f, boolean z2) throws IOException;

    public abstract void zzw();

    public abstract void zzx(long j);

    public abstract void zzy(int i2);

    public abstract void zzz(int i2);
}
