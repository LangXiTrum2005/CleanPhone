package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaew {
    public static boolean zza(zzer zzerVar, zzafb zzafbVar, int i2, zzaev zzaevVar) {
        int iZzg = zzerVar.zzg();
        long jZzz = zzerVar.zzz();
        long j = jZzz >>> 16;
        if (j != i2) {
            return false;
        }
        boolean z2 = (j & 1) == 1;
        long j2 = jZzz >> 12;
        long j3 = jZzz >> 8;
        long j4 = jZzz >> 4;
        long j5 = jZzz >> 1;
        long j6 = jZzz & 1;
        int i3 = (int) (j4 & 15);
        if (i3 <= 7) {
            if (i3 != zzafbVar.zzg - 1) {
                return false;
            }
        } else if (i3 > 10 || zzafbVar.zzg != 2) {
            return false;
        }
        int i4 = (int) (j5 & 7);
        if ((i4 != 0 && i4 != zzafbVar.zzi) || j6 == 1 || !zzd(zzerVar, zzafbVar, z2, zzaevVar)) {
            return false;
        }
        long j7 = zzaevVar.zza;
        int iZzc = zzc(zzerVar, (int) (j2 & 15));
        long j8 = zzafbVar.zzj;
        boolean z3 = j8 == 0 || j7 + ((long) iZzc) >= j8;
        if (iZzc == -1) {
            return false;
        }
        if ((!z3 && iZzc < zzafbVar.zza) || iZzc > zzafbVar.zzb) {
            return false;
        }
        int i5 = zzafbVar.zze;
        int i6 = (int) (j3 & 15);
        if (i6 != 0) {
            if (i6 <= 11) {
                if (i6 != zzafbVar.zzf) {
                    return false;
                }
            } else if (i6 == 12) {
                if (zzerVar.zzs() * 1000 != i5) {
                    return false;
                }
            } else {
                if (i6 > 14) {
                    return false;
                }
                int iZzt = zzerVar.zzt();
                if (i6 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i5) {
                    return false;
                }
            }
        }
        if (zzerVar.zzs() != zzfj.zzI(zzerVar.zzi(), iZzg, zzerVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzerVar.zzd() != 0) {
            int iZzn = zzerVar.zzn();
            if ((iZzn & 128) != 0) {
                return false;
            }
            int i7 = (iZzn & 126) >> 1;
            if ((i7 >= 2 && i7 <= 7) || (i7 >= 13 && i7 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i7);
                zzee.zzb("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzaep zzaepVar, zzafb zzafbVar) throws IOException {
        zzaepVar.zzl();
        zzaepVar.zzk(1);
        byte[] bArr = new byte[1];
        zzaepVar.zzi(bArr, 0, 1);
        int i2 = bArr[0] & 1;
        boolean z2 = 1 == i2;
        zzaepVar.zzk(2);
        int i3 = 1 != i2 ? 6 : 7;
        zzer zzerVar = new zzer(i3);
        zzerVar.zzf(zzaes.zzb(zzaepVar, zzerVar.zzi(), 0, i3));
        zzaepVar.zzl();
        zzaev zzaevVar = new zzaev();
        if (zzd(zzerVar, zzafbVar, z2, zzaevVar)) {
            return zzaevVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzer zzerVar, int i2) {
        switch (i2) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return zzerVar.zzs() + 1;
            case 7:
                return zzerVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzer zzerVar, zzafb zzafbVar, boolean z2, zzaev zzaevVar) {
        try {
            long jZzO = zzerVar.zzO();
            if (!z2) {
                jZzO *= (long) zzafbVar.zzb;
            }
            long j = zzafbVar.zzj;
            if (j != 0 && jZzO > j) {
                return false;
            }
            zzaevVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
