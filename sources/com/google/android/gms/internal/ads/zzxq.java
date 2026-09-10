package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzxq {
    private final zzaah zza;
    private final zzer zzb = new zzer(32);
    private zzxp zzc;
    private zzxp zzd;
    private zzxp zze;
    private long zzf;

    public zzxq(zzaah zzaahVar) {
        this.zza = zzaahVar;
        zzxp zzxpVar = new zzxp(0L, 65536);
        this.zzc = zzxpVar;
        this.zzd = zzxpVar;
        this.zze = zzxpVar;
    }

    private final int zzi(int i2) {
        zzxp zzxpVar = this.zze;
        if (zzxpVar.zzc == null) {
            zzaaf zzaafVarZza = this.zza.zza();
            zzxp zzxpVar2 = new zzxp(this.zze.zzb, 65536);
            zzxpVar.zzc = zzaafVarZza;
            zzxpVar.zzd = zzxpVar2;
        }
        return Math.min(i2, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i2) {
        long j = this.zzf + ((long) i2);
        this.zzf = j;
        zzxp zzxpVar = this.zze;
        if (j == zzxpVar.zzb) {
            this.zze = zzxpVar.zzd;
        }
    }

    private static zzxp zzk(zzxp zzxpVar, zzih zzihVar, zzxr zzxrVar, zzer zzerVar) {
        zzxp zzxpVarZzm;
        int iZzt;
        if (zzihVar.zzk()) {
            long j = zzxrVar.zzb;
            zzerVar.zza(1);
            zzxp zzxpVarZzm2 = zzm(zzxpVar, j, zzerVar.zzi(), 1);
            long j2 = j + 1;
            byte b2 = zzerVar.zzi()[0];
            int i2 = b2 & 128;
            int i3 = b2 & AbstractJsonLexerKt.TC_INVALID;
            zzie zzieVar = zzihVar.zzb;
            byte[] bArr = zzieVar.zza;
            if (bArr == null) {
                zzieVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z2 = i2 != 0;
            zzxpVarZzm = zzm(zzxpVarZzm2, j2, zzieVar.zza, i3);
            long j3 = j2 + ((long) i3);
            if (z2) {
                zzerVar.zza(2);
                zzxpVarZzm = zzm(zzxpVarZzm, j3, zzerVar.zzi(), 2);
                j3 += 2;
                iZzt = zzerVar.zzt();
            } else {
                iZzt = 1;
            }
            int[] iArr = zzieVar.zzd;
            if (iArr == null || iArr.length < iZzt) {
                iArr = new int[iZzt];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzieVar.zze;
            if (iArr3 == null || iArr3.length < iZzt) {
                iArr3 = new int[iZzt];
            }
            int[] iArr4 = iArr3;
            if (z2) {
                int i4 = iZzt * 6;
                zzerVar.zza(i4);
                zzxpVarZzm = zzm(zzxpVarZzm, j3, zzerVar.zzi(), i4);
                j3 += (long) i4;
                zzerVar.zzh(0);
                for (int i5 = 0; i5 < iZzt; i5++) {
                    iArr2[i5] = zzerVar.zzt();
                    iArr4[i5] = zzerVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzxrVar.zza - ((int) (j3 - zzxrVar.zzb));
            }
            zzafz zzafzVar = zzxrVar.zzc;
            String str = zzfj.zza;
            zzieVar.zza(iZzt, iArr2, iArr4, zzafzVar.zzb, zzieVar.zza, zzafzVar.zza, zzafzVar.zzc, zzafzVar.zzd);
            long j4 = zzxrVar.zzb;
            int i6 = (int) (j3 - j4);
            zzxrVar.zzb = j4 + ((long) i6);
            zzxrVar.zza -= i6;
        } else {
            zzxpVarZzm = zzxpVar;
        }
        if (!zzihVar.zze()) {
            zzihVar.zzj(zzxrVar.zza);
            return zzl(zzxpVarZzm, zzxrVar.zzb, zzihVar.zzc, zzxrVar.zza);
        }
        zzerVar.zza(4);
        zzxp zzxpVarZzm3 = zzm(zzxpVarZzm, zzxrVar.zzb, zzerVar.zzi(), 4);
        int iZzH = zzerVar.zzH();
        zzxrVar.zzb += 4;
        zzxrVar.zza -= 4;
        zzihVar.zzj(iZzH);
        zzxp zzxpVarZzl = zzl(zzxpVarZzm3, zzxrVar.zzb, zzihVar.zzc, iZzH);
        zzxrVar.zzb += (long) iZzH;
        int i7 = zzxrVar.zza - iZzH;
        zzxrVar.zza = i7;
        ByteBuffer byteBuffer = zzihVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            zzihVar.zzf = ByteBuffer.allocate(i7);
        } else {
            zzihVar.zzf.clear();
        }
        return zzl(zzxpVarZzl, zzxrVar.zzb, zzihVar.zzf, zzxrVar.zza);
    }

    private static zzxp zzl(zzxp zzxpVar, long j, ByteBuffer byteBuffer, int i2) {
        zzxp zzxpVarZzn = zzn(zzxpVar, j);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzxpVarZzn.zzb - j));
            byteBuffer.put(zzxpVarZzn.zzc.zza, zzxpVarZzn.zzb(j), iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == zzxpVarZzn.zzb) {
                zzxpVarZzn = zzxpVarZzn.zzd;
            }
        }
        return zzxpVarZzn;
    }

    private static zzxp zzm(zzxp zzxpVar, long j, byte[] bArr, int i2) {
        zzxp zzxpVarZzn = zzn(zzxpVar, j);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (zzxpVarZzn.zzb - j));
            System.arraycopy(zzxpVarZzn.zzc.zza, zzxpVarZzn.zzb(j), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j += (long) iMin;
            if (j == zzxpVarZzn.zzb) {
                zzxpVarZzn = zzxpVarZzn.zzd;
            }
        }
        return zzxpVarZzn;
    }

    private static zzxp zzn(zzxp zzxpVar, long j) {
        while (j >= zzxpVar.zzb) {
            zzxpVar = zzxpVar.zzd;
        }
        return zzxpVar;
    }

    public final void zza() {
        zzxp zzxpVar = this.zzc;
        if (zzxpVar.zzc != null) {
            this.zza.zzc(zzxpVar);
            zzxpVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzxp zzxpVar2 = this.zzc;
        this.zzd = zzxpVar2;
        this.zze = zzxpVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzih zzihVar, zzxr zzxrVar) {
        this.zzd = zzk(this.zzd, zzihVar, zzxrVar, this.zzb);
    }

    public final void zzd(zzih zzihVar, zzxr zzxrVar) {
        zzk(this.zzd, zzihVar, zzxrVar, this.zzb);
    }

    public final void zze(long j) {
        zzxp zzxpVar;
        if (j != -1) {
            while (true) {
                zzxpVar = this.zzc;
                if (j < zzxpVar.zzb) {
                    break;
                }
                this.zza.zzb(zzxpVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzxpVar.zza) {
                this.zzd = zzxpVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i2, boolean z2) throws IOException {
        int iZzi = zzi(i2);
        zzxp zzxpVar = this.zze;
        int iZza = zzjVar.zza(zzxpVar.zzc.zza, zzxpVar.zzb(this.zzf), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzer zzerVar, int i2) {
        while (i2 > 0) {
            int iZzi = zzi(i2);
            zzxp zzxpVar = this.zze;
            zzerVar.zzm(zzxpVar.zzc.zza, zzxpVar.zzb(this.zzf), iZzi);
            i2 -= iZzi;
            zzj(iZzi);
        }
    }
}
