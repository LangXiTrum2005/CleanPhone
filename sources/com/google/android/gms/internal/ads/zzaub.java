package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaub {
    public int zza;
    public zzatw zzb;
    public zzatk zzc;
    public zzatn zzd;

    public zzaub() {
        this(new zzatn(1));
    }

    private final long zzg() throws zzaty, zzaua {
        int i2 = ((((~1246322141) & 272302173) | 1841378864) + ((1246322141 & 825937997) | 658822930)) - (-1823634633);
        int i3 = 1600766768 % 649830540;
        int i4 = ((((~680326130) & 1378702392) | 3315809) + ((680326130 & 1913472410) | 739293607)) - 2048099035;
        int i5 = 1743768897 % 152059765;
        int i6 = ((((~973294814) & 1252035530) | 51191353) + ((973294814 & 1755616710) | 889459732)) - 1494176168;
        int i7 = 1861701682 % 1196748250;
        int i8 = ((((~29116548) & 174422021) | 84710160) + ((29116548 & (-1973327347)) | (-1266641286))) - (-1891729929);
        int i9 = 2091729405 % 1207774949;
        int i10 = ((((~80201211) & 1629524354) | 38778411) + ((80201211 & 1977746312) | 382371455)) - 1921480783;
        int i11 = 1050760512 % 184320788;
        int i12 = 0;
        long j = 0;
        while (i12 < (i2 ^ i3)) {
            try {
                zzatk zzatkVar = this.zzc;
                zzatw zzatwVar = this.zzb;
                int i13 = i2;
                int i14 = this.zza;
                int i15 = i3;
                this.zza = i14 + 1;
                byte bZza = zzatkVar.zza(zzatwVar, i14);
                int i16 = i6 ^ i7;
                j |= ((long) ((i4 ^ i5) & bZza)) << i12;
                if (i12 == i16) {
                    if (bZza > 1) {
                        throw new zzaty();
                    }
                    i12 = i16;
                }
                if ((bZza & (i8 ^ i9)) == 0) {
                    return (j >>> 1) ^ (-(1 & j));
                }
                i12 += i10 ^ i11;
                i2 = i13;
                i3 = i15;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzaua(e2);
            }
        }
        throw new zzaty();
    }

    private static final void zzh(long j) throws zzatz {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzatz();
        }
    }

    public final void zza(long j) throws zzatz, zzaua {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        zzh(j);
        long j10 = j / (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8) ^ (j9 % 899334107));
        if (j10 < 0 || j10 > this.zzb.zza.length) {
            throw new zzaua();
        }
        this.zza = (int) j10;
    }

    public final long zzb() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        return ((long) this.zza) * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public final long zzc() throws zzaua {
        try {
            zzatk zzatkVar = this.zzc;
            zzatw zzatwVar = this.zzb;
            int i2 = this.zza;
            this.zza = i2 + 1;
            return zzatkVar.zza(zzatwVar, i2);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzaua(e2);
        }
    }

    public final int zzd() throws zzaua {
        int i2 = ((((~413360099) & 1621678468) | 84323740) + ((413360099 & 1621644360) | 385888249)) - 1513564466;
        int i3 = 1609416931 % 1031126087;
        int i4 = ((((~978587665) & 1228171537) | 1025392332) + ((978587665 & 1075859857) | 983056096)) - (-1589113644);
        int i5 = 1723578341 % 672563970;
        int i6 = ((((~1163384280) & 546336857) | 505597090) + ((1163384280 & 546323033) | 358992768)) - 1346988633;
        int i7 = 1124734562 % 530406424;
        int i8 = ((((~217161528) & 116398273) | 202500381) + ((217161528 & 316821712) | 269928733)) - 410012058;
        int i9 = 529302443 % 418646579;
        try {
            zzatk zzatkVar = this.zzc;
            zzatw zzatwVar = this.zzb;
            int i10 = this.zza;
            this.zza = i10 + 1;
            int i11 = i2 ^ i3;
            int iZza = zzatkVar.zza(zzatwVar, i10) & i11;
            zzatk zzatkVar2 = this.zzc;
            zzatw zzatwVar2 = this.zzb;
            int i12 = this.zza;
            this.zza = i12 + 1;
            int iZza2 = iZza | ((zzatkVar2.zza(zzatwVar2, i12) & i11) << (i4 ^ i5));
            zzatk zzatkVar3 = this.zzc;
            zzatw zzatwVar3 = this.zzb;
            int i13 = this.zza;
            this.zza = i13 + 1;
            int iZza3 = iZza2 | ((i11 & zzatkVar3.zza(zzatwVar3, i13)) << (i6 ^ i7));
            zzatk zzatkVar4 = this.zzc;
            zzatw zzatwVar4 = this.zzb;
            int i14 = this.zza;
            this.zza = i14 + 1;
            return iZza3 | (zzatkVar4.zza(zzatwVar4, i14) << (i8 ^ i9));
        } catch (IndexOutOfBoundsException e2) {
            throw new zzaua(e2);
        }
    }

    public final long zze() throws zzaty, zzaua {
        return zzg();
    }

    public final zzatw zzf(long j) throws zzatz, zzaua {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iC = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        zzh(zzb() + j);
        int i10 = this.zza;
        long j2 = i10;
        zzatw zzatwVar = this.zzb;
        long j3 = (j >> ((i9 % 774318984) ^ iC)) + j2;
        if (j3 > zzatwVar.zza.length || j3 < j2) {
            throw new zzaua();
        }
        try {
            int i11 = (int) j3;
            zzatw zzatwVarZzb = this.zzc.zzb(zzatwVar, i10, i11);
            this.zza = i11;
            return zzatwVarZzb;
        } catch (IndexOutOfBoundsException e2) {
            throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e2);
        }
    }

    public zzaub(zzatn zzatnVar) {
        this(zzatw.zzb, 0, new zzatl());
        this.zzd = zzatnVar;
    }

    private zzaub(zzatw zzatwVar, int i2, zzatk zzatkVar) {
        this.zzb = zzatwVar;
        this.zza = i2;
        this.zzc = zzatkVar;
    }

    public zzaub(zzatw zzatwVar, int i2, zzatk zzatkVar, zzatn zzatnVar) {
        this(zzatwVar, i2, zzatkVar);
        this.zzd = zzatnVar;
    }
}
