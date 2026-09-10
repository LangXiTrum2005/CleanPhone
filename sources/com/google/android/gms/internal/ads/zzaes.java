package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaes {
    @Pure
    public static void zza(boolean z2, String str) throws zzat {
        if (!z2) {
            throw zzat.zzb(str, null);
        }
    }

    public static int zzb(zzaep zzaepVar, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int iZzg = zzaepVar.zzg(bArr, i2 + i4, i3 - i4);
            if (iZzg == -1) {
                break;
            }
            i4 += iZzg;
        }
        return i4;
    }

    public static boolean zzc(zzaep zzaepVar, byte[] bArr, int i2, int i3) throws IOException {
        try {
            zzaepVar.zzc(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zzaep zzaepVar, int i2) throws IOException {
        try {
            zzaepVar.zzf(i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzaep zzaepVar, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        try {
            return zzaepVar.zzh(bArr, 0, i3, z2);
        } catch (EOFException e2) {
            if (z2) {
                return false;
            }
            throw e2;
        }
    }

    public static int zzf(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}
