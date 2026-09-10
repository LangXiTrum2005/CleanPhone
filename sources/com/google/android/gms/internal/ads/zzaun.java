package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaun {
    public final zzati zza;
    public final zzauj zzb;
    public final zzaug zzc;
    public final zzaub zzd;

    public zzaun(zzati zzatiVar, zzauj zzaujVar, zzaub zzaubVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        this.zza = zzatiVar;
        this.zzb = zzaujVar;
        this.zzd = zzaubVar;
        this.zzc = new zzaug(Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 454333378));
    }

    public final Optional zza() {
        zzatc zzatcVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzauf();
            }
            zzaud zzaudVar = (zzaud) arrayDeque.pop();
            long j = zzaudVar.zza;
            long j2 = zzaudVar.zzb;
            long j3 = zzaudVar.zzc;
            zzauj zzaujVar = this.zzb;
            if (zzaujVar.zzb < j2) {
                return Optional.of(zzatc.zzG);
            }
            this.zzd.zza(j);
            if (j3 == 0) {
                while (zzaujVar.zzb > j2) {
                    zzaujVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzatz e2) {
            e = e2;
            throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzaua e3) {
            e = e3;
            throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzauf unused) {
            zzatcVar = zzatc.zzw;
            return Optional.of(zzatcVar);
        } catch (zzauh unused2) {
            zzatcVar = zzatc.zzG;
            return Optional.of(zzatcVar);
        }
    }
}
