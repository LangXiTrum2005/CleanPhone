package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhzw extends zzhzc {
    private static final Logger zza = Logger.getLogger(zzhzw.class.getName());
    private static final boolean zzb = zzidm.zza();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zzhzw() {
        throw null;
    }

    public static int zzA(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int zzB(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzidr.zzc(str);
        } catch (zzidq unused) {
            length = str.getBytes(zzibe.zza).length;
        }
        return zzA(length) + length;
    }

    public static int zzD(zzicc zziccVar) {
        int iZzbr = zziccVar.zzbr();
        return zzA(iZzbr) + iZzbr;
    }

    public static int zzz(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public final void zzE() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzF(String str, zzidq zzidqVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzidqVar);
        byte[] bytes = str.getBytes(zzibe.zza);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzhzu(e2);
        }
    }

    public abstract void zzJ(int i2, int i3) throws IOException;

    public abstract void zzK(int i2, int i3) throws IOException;

    public abstract void zzL(int i2, int i3) throws IOException;

    public abstract void zzM(int i2, int i3) throws IOException;

    public abstract void zzN(int i2, long j) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzhzc
    public abstract void zza(byte[] bArr, int i2, int i3) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i2, long j) throws IOException;

    public abstract void zzi(int i2, boolean z2) throws IOException;

    public abstract void zzj(int i2, String str) throws IOException;

    public abstract void zzk(int i2, zzhzl zzhzlVar) throws IOException;

    public abstract void zzl(zzhzl zzhzlVar) throws IOException;

    public abstract void zzm(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzn(int i2, zzicc zziccVar) throws IOException;

    public abstract void zzo(int i2, zzhzl zzhzlVar) throws IOException;

    public abstract void zzp(zzicc zziccVar) throws IOException;

    public abstract void zzq(byte b2) throws IOException;

    public abstract void zzr(int i2) throws IOException;

    public abstract void zzs(int i2) throws IOException;

    public abstract void zzt(int i2) throws IOException;

    public abstract void zzu(long j) throws IOException;

    public abstract void zzv(long j) throws IOException;

    public abstract void zzx(String str) throws IOException;

    public abstract void zzy() throws IOException;

    public /* synthetic */ zzhzw(byte[] bArr) {
    }
}
