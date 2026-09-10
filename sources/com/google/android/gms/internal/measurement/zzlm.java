package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzlm extends zzkz {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzlm.class.getName());
    private static final boolean zzd = zzop.zza();
    zzln zza;

    private zzlm() {
        throw null;
    }

    public static int zzA(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzos.zzb(str);
        } catch (zzor unused) {
            length = str.getBytes(zzmp.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzC(zznm zznmVar) {
        int iZzcn = zznmVar.zzcn();
        return zzz(iZzcn) + iZzcn;
    }

    public static int zzD(zznm zznmVar, zznx zznxVar) {
        int iZzcd = ((zzks) zznmVar).zzcd(zznxVar);
        return zzz(iZzcd) + iZzcd;
    }

    @Deprecated
    public static int zzG(int i2, zznm zznmVar, zznx zznxVar) {
        int iZzz = zzz(i2 << 3);
        return ((zzks) zznmVar).zzcd(zznxVar) + iZzz + iZzz;
    }

    public static int zzz(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public final void zzE() {
        if (zzy() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzF(String str, zzor zzorVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzorVar);
        byte[] bytes = str.getBytes(zzmp.zza);
        try {
            int length = bytes.length;
            zzr(length);
            zzw(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(e2);
        }
    }

    public abstract void zza(int i2, int i3) throws IOException;

    public abstract void zzb(int i2, int i3) throws IOException;

    public abstract void zzc(int i2, int i3) throws IOException;

    public abstract void zzd(int i2, int i3) throws IOException;

    public abstract void zze(int i2, long j) throws IOException;

    public abstract void zzf(int i2, long j) throws IOException;

    public abstract void zzg(int i2, boolean z2) throws IOException;

    public abstract void zzh(int i2, String str) throws IOException;

    public abstract void zzi(int i2, zzlh zzlhVar) throws IOException;

    public abstract void zzj(zzlh zzlhVar) throws IOException;

    public abstract void zzk(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzl(int i2, zznm zznmVar, zznx zznxVar) throws IOException;

    public abstract void zzm(int i2, zznm zznmVar) throws IOException;

    public abstract void zzn(int i2, zzlh zzlhVar) throws IOException;

    public abstract void zzo(zznm zznmVar) throws IOException;

    public abstract void zzp(byte b2) throws IOException;

    public abstract void zzq(int i2) throws IOException;

    public abstract void zzr(int i2) throws IOException;

    public abstract void zzs(int i2) throws IOException;

    public abstract void zzt(long j) throws IOException;

    public abstract void zzu(long j) throws IOException;

    public abstract void zzw(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzx(String str) throws IOException;

    public abstract int zzy();

    public /* synthetic */ zzlm(byte[] bArr) {
    }
}
