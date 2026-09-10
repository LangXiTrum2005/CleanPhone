package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafi {
    private final zzer zza = new zzer(10);

    private final boolean zzb(zzaep zzaepVar, int i2) throws IOException {
        int i3;
        int i4 = 0;
        do {
            int i5 = i4 % 10;
            if (i5 == 0) {
                if (i4 != 0) {
                    zzer zzerVar = this.zza;
                    System.arraycopy(zzerVar.zzi(), 10, zzerVar.zzi(), 0, 9);
                }
                i3 = 0;
            } else {
                i3 = i5;
            }
            int i6 = i4 != 0 ? 1 : 10;
            try {
                zzer zzerVar2 = this.zza;
                int i7 = i5 + 10;
                zzaepVar.zzi(zzerVar2.zzi(), i7 - i6, i6);
                zzerVar2.zzh(i3);
                zzerVar2.zzf(i7);
                if (zzerVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzafl.zza(zzerVar2.zzr()) != -1) {
                    return false;
                }
                if (i4 == 0) {
                    zzerVar2.zzc(20);
                }
                i4++;
            } catch (EOFException unused) {
            }
        } while (i4 <= i2);
        return false;
    }

    public final zzap zza(zzaep zzaepVar, zzaic zzaicVar, int i2) throws IOException {
        zzap zzapVarZza = null;
        int i3 = 0;
        while (zzb(zzaepVar, i2)) {
            zzer zzerVar = this.zza;
            int iZzg = zzerVar.zzg();
            zzerVar.zzk(6);
            int iZzG = zzerVar.zzG();
            int i4 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i4];
                System.arraycopy(zzerVar.zzi(), iZzg, bArr, 0, 10);
                zzaepVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzaif.zza(bArr, i4, zzaicVar, new zzahp());
            } else {
                zzaepVar.zzk(iZzG);
            }
            i3 += i4;
        }
        zzaepVar.zzl();
        zzaepVar.zzk(i3);
        return zzapVarZza;
    }
}
