package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.math.RoundingMode;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzfzv {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzfzv(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            zzfun.zzg(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            zzfun.zzg(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfzv) {
            zzfzv zzfzvVar = (zzfzv) obj;
            if (this.zzi == zzfzvVar.zzi && Arrays.equals(this.zzf, zzfzvVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i) {
        return this.zzf[i];
    }

    public final int zzb(char c) throws zzfzy {
        if (c > 127) {
            throw new zzfzy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.zzg[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new zzfzy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new zzfzy("Unrecognized character: " + c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final zzfzv zzc() {
        boolean z;
        int i = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i >= cArr.length) {
                return this;
            }
            if (zzftt.zze(cArr[i])) {
                int i2 = 0;
                while (true) {
                    if (i2 >= cArr.length) {
                        z = false;
                        break;
                    }
                    if (zzftt.zzd(cArr[i2])) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                zzfun.zzm(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                int i3 = 0;
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i3 >= cArr3.length) {
                        break;
                    }
                    char c = cArr3[i3];
                    if (zzftt.zze(c)) {
                        c ^= 32;
                    }
                    cArr2[i3] = (char) c;
                    i3++;
                }
                zzfzv zzfzvVar = new zzfzv(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzfzvVar.zzi) {
                    return zzfzvVar;
                }
                byte[] bArr = zzfzvVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i4 = 65; i4 <= 90; i4++) {
                    int i5 = i4 | 32;
                    byte[] bArr2 = zzfzvVar.zzg;
                    byte b = bArr2[i4];
                    byte b2 = bArr2[i5];
                    if (b == -1) {
                        bArrCopyOf[i4] = b2;
                    } else {
                        char c2 = (char) i4;
                        char c3 = (char) i5;
                        if (b2 != -1) {
                            throw new IllegalStateException(zzfve.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c2), Character.valueOf(c3)));
                        }
                        bArrCopyOf[i5] = b;
                    }
                }
                return new zzfzv(zzfzvVar.zze.concat(".ignoreCase()"), zzfzvVar.zzf, bArrCopyOf, true);
            }
            i++;
        }
    }

    public final boolean zzd(int i) {
        return this.zzh[i % this.zzc];
    }

    public final boolean zze(char c) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzfzv(String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzc = zzgaj.zzc(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzc;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzc);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i;
            this.zzd = iZzc >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzd; i2++) {
                zArr[zzgaj.zzb(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("Illegal alphabet length ", cArr.length), e);
        }
    }
}
