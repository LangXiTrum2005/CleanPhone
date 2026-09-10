package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaeb {
    public static void zza(long j, zzer zzerVar, zzaga[] zzagaVarArr) {
        int iZzB;
        while (true) {
            if (zzerVar.zzd() <= 1) {
                return;
            }
            int iZzc = zzc(zzerVar);
            int iZzc2 = zzc(zzerVar);
            int iZzg = zzerVar.zzg() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzerVar.zzd()) {
                zzee.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzg = zzerVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzs = zzerVar.zzs();
                int iZzt = zzerVar.zzt();
                if (iZzt == 49) {
                    iZzB = zzerVar.zzB();
                    iZzt = 49;
                } else {
                    iZzB = 0;
                }
                int iZzs2 = zzerVar.zzs();
                if (iZzt == 47) {
                    zzerVar.zzk(1);
                    iZzt = 47;
                }
                boolean z2 = iZzs == 181 && (iZzt == 49 || iZzt == 47) && iZzs2 == 3;
                if (iZzt == 49) {
                    z2 &= iZzB == 1195456820;
                }
                if (z2) {
                    zzb(j, zzerVar, zzagaVarArr);
                }
            }
            zzerVar.zzh(iZzg);
        }
    }

    public static void zzb(long j, zzer zzerVar, zzaga[] zzagaVarArr) {
        int iZzs = zzerVar.zzs();
        if ((iZzs & 64) != 0) {
            int i2 = iZzs & 31;
            zzerVar.zzk(1);
            int iZzg = zzerVar.zzg();
            for (zzaga zzagaVar : zzagaVarArr) {
                int i3 = i2 * 3;
                zzerVar.zzh(iZzg);
                zzagaVar.zzz(zzerVar, i3);
                zzgqa.zzi(j != -9223372036854775807L);
                zzagaVar.zzx(j, 1, i3, 0, null);
            }
        }
    }

    private static int zzc(zzer zzerVar) {
        int i2 = 0;
        while (zzerVar.zzd() != 0) {
            int iZzs = zzerVar.zzs();
            i2 += iZzs;
            if (iZzs != 255) {
                return i2;
            }
        }
        return -1;
    }
}
