package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzoj {
    private static final zzoj zza = new zzoj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoj(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzoj zza() {
        return zza;
    }

    public static zzoj zzb() {
        return new zzoj(0, new int[8], new Object[8], true);
    }

    public static zzoj zzc(zzoj zzojVar, zzoj zzojVar2) {
        int i2 = zzojVar.zzb + zzojVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzojVar.zzc, i2);
        System.arraycopy(zzojVar2.zzc, 0, iArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzojVar.zzd, i2);
        System.arraycopy(zzojVar2.zzd, 0, objArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        return new zzoj(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzm(int i2) {
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
        if (obj == null || !(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        int i2 = this.zzb;
        if (i2 == zzojVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzojVar.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzojVar.zzd;
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

    public final void zzf(zzov zzovVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzovVar.zzv(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzg(zzov zzovVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzovVar.zzc(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzovVar.zzj(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzovVar.zzn(i5, (zzlh) obj);
                } else if (i4 == 3) {
                    zzovVar.zzt(i5);
                    ((zzoj) obj).zzg(zzovVar);
                    zzovVar.zzu(i5);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    zzovVar.zzk(i5, ((Integer) obj).intValue());
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
            zzlh zzlhVar = (zzlh) this.zzd[i3];
            int iZzz = zzlm.zzz(8);
            int iZzz2 = zzlm.zzz(i4) + zzlm.zzz(16);
            int iZzz3 = zzlm.zzz(24);
            int iZzc = zzlhVar.zzc();
            iB = a.b(iZzz + iZzz, iZzz2, Z.B(iZzc, iZzc, iZzz3), iB);
        }
        this.zze = iB;
        return iB;
    }

    public final int zzi() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzz3 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = i5 << 3;
                        zzlh zzlhVar = (zzlh) this.zzd[i3];
                        int iZzz4 = zzlm.zzz(i7);
                        int iZzc = zzlhVar.zzc();
                        iZzz3 = zzlm.zzz(iZzc) + iZzc + iZzz4 + iZzz3;
                    } else if (i6 == 3) {
                        int iZzz5 = zzlm.zzz(i5 << 3);
                        iZzz = iZzz5 + iZzz5;
                        iZzA = ((zzoj) this.zzd[i3]).zzi();
                    } else {
                        if (i6 != 5) {
                            throw new IllegalStateException(new zzmq("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.zzd[i3]).getClass();
                        iZzz2 = zzlm.zzz(i5 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i3]).getClass();
                    iZzz2 = zzlm.zzz(i5 << 3) + 8;
                }
                iZzz3 = iZzz2 + iZzz3;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.zzd[i3]).longValue();
                iZzz = zzlm.zzz(i8);
                iZzA = zzlm.zzA(jLongValue);
            }
            iZzz3 = iZzA + iZzz + iZzz3;
        }
        this.zze = iZzz3;
        return iZzz3;
    }

    public final void zzj(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzno.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final void zzk(int i2, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    public final zzoj zzl(zzoj zzojVar) {
        if (zzojVar.equals(zza)) {
            return this;
        }
        zze();
        int i2 = this.zzb + zzojVar.zzb;
        zzm(i2);
        System.arraycopy(zzojVar.zzc, 0, this.zzc, this.zzb, zzojVar.zzb);
        System.arraycopy(zzojVar.zzd, 0, this.zzd, this.zzb, zzojVar.zzb);
        this.zzb = i2;
        return this;
    }

    private zzoj() {
        this(0, new int[8], new Object[8], true);
    }
}
