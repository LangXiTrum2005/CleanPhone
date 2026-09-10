package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzidg {
    private static final zzidg zza = new zzidg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzidg(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzidg zza() {
        return zza;
    }

    public static zzidg zzb() {
        return new zzidg();
    }

    public static zzidg zzc(zzidg zzidgVar, zzidg zzidgVar2) {
        int i2 = zzidgVar.zzb + zzidgVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzidgVar.zzc, i2);
        System.arraycopy(zzidgVar2.zzc, 0, iArrCopyOf, zzidgVar.zzb, zzidgVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzidgVar.zzd, i2);
        System.arraycopy(zzidgVar2.zzd, 0, objArrCopyOf, zzidgVar.zzb, zzidgVar2.zzb);
        return new zzidg(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i2) {
        int[] iArr = this.zzc;
        if (i2 > iArr.length) {
            int i3 = this.zzb;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i2);
            this.zzd = Arrays.copyOf(this.zzd, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzidg)) {
            return false;
        }
        zzidg zzidgVar = (zzidg) obj;
        int i2 = this.zzb;
        if (i2 == zzidgVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzidgVar.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzidgVar.zzd;
            int i4 = this.zzb;
            for (int i5 = 0; i5 < i4; i5++) {
                if (objArr[i5].equals(objArr2[i5])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i3 = i2 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i3 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzidu zziduVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zziduVar.zzv(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzg(zzidu zziduVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zziduVar.zzc(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zziduVar.zzj(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zziduVar.zzn(i5, (zzhzl) obj);
                } else if (i4 == 3) {
                    zziduVar.zzt(i5);
                    ((zzidg) obj).zzg(zziduVar);
                    zziduVar.zzu(i5);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new zzibf("Protocol message tag had invalid wire type."));
                    }
                    zziduVar.zzk(i5, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iB = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzhzl zzhzlVar = (zzhzl) this.zzd[i3];
            int iZzA = zzhzw.zzA(8);
            int iZzA2 = zzhzw.zzA(i4) + zzhzw.zzA(16);
            int iZzA3 = zzhzw.zzA(24);
            int iZzc = zzhzlVar.zzc();
            iB = android.support.v4.media.a.b(iZzA + iZzA, iZzA2, Z.b(iZzc, iZzc, iZzA3), iB);
        }
        this.zze = iB;
        return iB;
    }

    public final int zzi() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzA3 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = i5 << 3;
                        zzhzl zzhzlVar = (zzhzl) this.zzd[i3];
                        int iZzA4 = zzhzw.zzA(i7);
                        int iZzc = zzhzlVar.zzc();
                        iZzA3 = zzhzw.zzA(iZzc) + iZzc + iZzA4 + iZzA3;
                    } else if (i6 == 3) {
                        int iZzA5 = zzhzw.zzA(i5 << 3);
                        iZzA = iZzA5 + iZzA5;
                        iZzB = ((zzidg) this.zzd[i3]).zzi();
                    } else {
                        if (i6 != 5) {
                            throw new IllegalStateException(new zzibf("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.zzd[i3]).getClass();
                        iZzA2 = zzhzw.zzA(i5 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i3]).getClass();
                    iZzA2 = zzhzw.zzA(i5 << 3) + 8;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.zzd[i3]).longValue();
                iZzA = zzhzw.zzA(i8);
                iZzB = zzhzw.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final void zzj(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzice.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final void zzk(int i2, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    public final boolean zzl(int i2, zzhzq zzhzqVar) throws IOException {
        int iZza;
        zze();
        int i3 = i2 & 7;
        if (i3 == 0) {
            zzk(i2, Long.valueOf(zzhzqVar.zzg()));
            return true;
        }
        if (i3 == 1) {
            zzk(i2, Long.valueOf(zzhzqVar.zzi()));
            return true;
        }
        if (i3 == 2) {
            zzk(i2, zzhzqVar.zzn());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                zzhzqVar.zzI();
                return false;
            }
            if (i3 != 5) {
                throw new zzibf("Protocol message tag had invalid wire type.");
            }
            zzk(i2, Integer.valueOf(zzhzqVar.zzj()));
            return true;
        }
        zzidg zzidgVar = new zzidg();
        do {
            iZza = zzhzqVar.zza();
            if (iZza == 0) {
                break;
            }
        } while (zzidgVar.zzl(iZza, zzhzqVar));
        zzhzqVar.zzb(4 | ((i2 >>> 3) << 3));
        zzk(i2, zzidgVar);
        return true;
    }

    public final zzidg zzm(zzidg zzidgVar) {
        if (zzidgVar.equals(zza)) {
            return this;
        }
        zze();
        int i2 = this.zzb + zzidgVar.zzb;
        zzn(i2);
        System.arraycopy(zzidgVar.zzc, 0, this.zzc, this.zzb, zzidgVar.zzb);
        System.arraycopy(zzidgVar.zzd, 0, this.zzd, this.zzb, zzidgVar.zzb);
        this.zzb = i2;
        return this;
    }

    private zzidg() {
        this(0, new int[8], new Object[8], true);
    }
}
