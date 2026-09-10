package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.impl.Z;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzaqg {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzaep zzaepVar) throws IOException {
        zzer zzerVar = new zzer(8);
        int i2 = zzaqf.zza(zzaepVar, zzerVar).zza;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        zzaepVar.zzi(zzerVar.zzi(), 0, 4);
        zzerVar.zzh(0);
        int iZzB = zzerVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iZzB);
        zzee.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzaqe zzb(zzaep zzaepVar) throws IOException {
        byte[] bArr;
        int i2;
        byte[] bArr2;
        zzer zzerVar = new zzer(16);
        long j = zzd(1718449184, zzaepVar, zzerVar).zzb;
        zzgqa.zzi(j >= 16);
        zzaepVar.zzi(zzerVar.zzi(), 0, 16);
        zzerVar.zzh(0);
        int iZzu = zzerVar.zzu();
        int iZzu2 = zzerVar.zzu();
        int iZzI = zzerVar.zzI();
        int iZzI2 = zzerVar.zzI();
        int iZzu3 = zzerVar.zzu();
        int iZzu4 = zzerVar.zzu();
        int i3 = ((int) j) - 16;
        if (i3 > 0) {
            bArr = new byte[i3];
            zzaepVar.zzi(bArr, 0, i3);
            if (iZzu == 65534) {
                if (i3 == 24) {
                    zzer zzerVar2 = new zzer(bArr);
                    zzerVar2.zzu();
                    int iZzu5 = zzerVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzu4).length() + String.valueOf(iZzu5).length() + 33 + 19);
                        androidx.datastore.preferences.protobuf.a.z(sb, "validBits ( ", iZzu5, ")  != bitsPerSample( ", iZzu4);
                        sb.append(") are not supported");
                        throw zzat.zzc(sb.toString());
                    }
                    int iZzI3 = zzerVar2.zzI();
                    if ((iZzI3 >> 18) != 0) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzI3).length() + 21);
                        sb2.append("invalid channel mask ");
                        sb2.append(iZzI3);
                        throw zzat.zzc(sb2.toString());
                    }
                    if (iZzI3 != 0 && Integer.bitCount(iZzI3) != iZzu2) {
                        int iBitCount = Integer.bitCount(iZzI3);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(iZzI3).length());
                        sb3.append("invalid number of channels (");
                        sb3.append(iBitCount);
                        sb3.append(") in channel mask ");
                        sb3.append(iZzI3);
                        throw zzat.zzc(sb3.toString());
                    }
                    iZzu = zzerVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzerVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzat.zzc("invalid wav format extension guid");
                    }
                } else {
                    bArr2 = bArr;
                    i2 = 65534;
                }
            }
            zzaepVar.zzf((int) (zzaepVar.zzm() - zzaepVar.zzn()));
            return new zzaqe(i2, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
        }
        bArr = zzfj.zzb;
        i2 = iZzu;
        bArr2 = bArr;
        zzaepVar.zzf((int) (zzaepVar.zzm() - zzaepVar.zzn()));
        return new zzaqe(i2, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
    }

    public static Pair zzc(zzaep zzaepVar) throws IOException {
        zzaepVar.zzl();
        zzaqf zzaqfVarZzd = zzd(1684108385, zzaepVar, new zzer(8));
        zzaepVar.zzf(8);
        return Pair.create(Long.valueOf(zzaepVar.zzn()), Long.valueOf(zzaqfVarZzd.zzb));
    }

    private static zzaqf zzd(int i2, zzaep zzaepVar, zzer zzerVar) throws IOException {
        zzaqf zzaqfVarZza = zzaqf.zza(zzaepVar, zzerVar);
        while (true) {
            int i3 = zzaqfVarZza.zza;
            if (i3 == i2) {
                return zzaqfVarZza;
            }
            Z.w(new StringBuilder(String.valueOf(i3).length() + 28), "Ignoring unknown WAV chunk: ", i3, "WavHeaderReader");
            long j = zzaqfVarZza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i3);
                throw zzat.zzc(sb.toString());
            }
            zzaepVar.zzf((int) j2);
            zzaqfVarZza = zzaqf.zza(zzaepVar, zzerVar);
        }
    }
}
