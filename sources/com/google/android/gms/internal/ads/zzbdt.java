package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbdt {
    public static void zza(String[] strArr, int i2, int i3, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i2, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzb(i2, jZze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i4 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i4 >= length2 - 5) {
                return;
            }
            long jZza = zzbdq.zza(strArr[i4 - 1]);
            long jZza2 = zzbdq.zza(strArr[i4 + 5]);
            String strZzc = zzc(strArr, i4, 6);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zzd(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzb(i2, jZze, strZzc, length2, priorityQueue);
            i4++;
        }
    }

    public static void zzb(int i2, long j, String str, int i3, PriorityQueue priorityQueue) {
        zzbds zzbdsVar = new zzbds(j, str, i3);
        if ((priorityQueue.size() != i2 || (((zzbds) priorityQueue.peek()).zzc <= zzbdsVar.zzc && ((zzbds) priorityQueue.peek()).zza <= zzbdsVar.zza)) && !priorityQueue.contains(zzbdsVar)) {
            priorityQueue.add(zzbdsVar);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    public static String zzc(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i6 = i4 - 1;
            if (i2 >= i6) {
                sb.append(strArr[i6]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            i2++;
        }
    }

    public static long zzd(long j, int i2) {
        if (i2 == 1) {
            return j;
        }
        int i3 = i2 >> 1;
        long j2 = (j * j) % 1073807359;
        return (i2 & 1) == 0 ? zzd(j2, i3) % 1073807359 : ((zzd(j2, i3) % 1073807359) * j) % 1073807359;
    }

    private static long zze(String[] strArr, int i2, int i3) {
        long jZza = (((long) zzbdq.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i4 = 1; i4 < i3; i4++) {
            jZza = (((((long) zzbdq.zza(strArr[i4])) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
