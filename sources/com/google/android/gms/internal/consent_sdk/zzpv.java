package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzpv extends zzpe {
    private static final Logger zza = Logger.getLogger(zzpv.class.getName());
    private static final boolean zzb = zzsw.zzx();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zzpv() {
        throw null;
    }

    public static int zzA(zzrq zzrqVar) {
        int iZzn = zzrqVar.zzn();
        return zzC(iZzn) + iZzn;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzsy.zzb(str);
        } catch (zzsx unused) {
            length = str.getBytes(zzqs.zza).length;
        }
        return zzC(length) + length;
    }

    public static int zzC(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzD(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void zzE(String str, zzsx zzsxVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzsxVar);
        byte[] bytes = str.getBytes(zzqs.zza);
        try {
            int length = bytes.length;
            zzw(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(e);
        }
    }

    public abstract void zzI() throws IOException;

    public abstract void zzJ(byte b) throws IOException;

    public abstract void zzK(int i, boolean z) throws IOException;

    public abstract void zzL(byte[] bArr, int i, int i2) throws IOException;

    @Override // com.google.android.gms.internal.consent_sdk.zzpe
    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, zzpm zzpmVar) throws IOException;

    public abstract void zzi(zzpm zzpmVar) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(int i, long j) throws IOException;

    public abstract void zzm(long j) throws IOException;

    public abstract void zzn(int i, int i2) throws IOException;

    public abstract void zzo(int i) throws IOException;

    public abstract void zzp(zzrq zzrqVar) throws IOException;

    public abstract void zzq(int i, zzrq zzrqVar) throws IOException;

    public abstract void zzr(int i, zzpm zzpmVar) throws IOException;

    public abstract void zzs(int i, String str) throws IOException;

    public abstract void zzt(String str) throws IOException;

    public abstract void zzu(int i, int i2) throws IOException;

    public abstract void zzv(int i, int i2) throws IOException;

    public abstract void zzw(int i) throws IOException;

    public abstract void zzx(int i, long j) throws IOException;

    public abstract void zzy(long j) throws IOException;

    public /* synthetic */ zzpv(zzpu zzpuVar) {
    }
}
