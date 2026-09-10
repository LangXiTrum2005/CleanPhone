package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhzq {
    private static volatile int zza = 100;
    public static final /* synthetic */ int zzf = 0;
    int zzb;
    int zzc;
    final int zzd = zza;
    Object zze;

    private zzhzq() {
    }

    public static zzhzq zzF(InputStream inputStream, int i2) {
        if (inputStream != null) {
            return new zzhzo(inputStream, 4096, null);
        }
        byte[] bArr = zzibe.zzb;
        int length = bArr.length;
        return zzG(bArr, 0, 0, false);
    }

    public static zzhzq zzG(byte[] bArr, int i2, int i3, boolean z2) {
        zzhzm zzhzmVar = new zzhzm(bArr, i2, i3, z2, null);
        try {
            zzhzmVar.zzz(i3);
            return zzhzmVar;
        } catch (zzibg e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int zzK(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static long zzL(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static int zzM(int i2, InputStream inputStream) throws IOException {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i3 |= (i5 & 127) << i4;
            if ((i5 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        while (i4 < 64) {
            int i6 = inputStream.read();
            if (i6 == -1) {
                throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i6 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        throw new zzibg("CodedInputStream encountered a malformed varint.");
    }

    public abstract void zzA(int i2);

    public abstract boolean zzB() throws IOException;

    public abstract int zzC();

    public final void zzH() throws zzibg {
        if (this.zzb + this.zzc >= this.zzd) {
            throw new zzibg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzI() throws zzibg {
        if (this.zzc == 0) {
            zzb(0);
        }
    }

    public final void zzJ() throws IOException {
        boolean zZzc;
        do {
            int iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzH();
            this.zzc++;
            zZzc = zzc(iZza);
            this.zzc--;
        } while (zZzc);
    }

    public abstract int zza() throws IOException;

    public abstract void zzb(int i2) throws zzibg;

    public abstract boolean zzc(int i2) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzhzl zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract int zzz(int i2) throws zzibg;

    public /* synthetic */ zzhzq(byte[] bArr) {
    }
}
