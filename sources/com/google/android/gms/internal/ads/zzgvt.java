package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvt {
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
    public zzgvt(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char c2 = cArr[i2];
            boolean z2 = true;
            zzgqa.zzc(c2 < 128, "Non-ASCII character: %s", c2);
            if (bArr[c2] != -1) {
                z2 = false;
            }
            zzgqa.zzc(z2, "Duplicate character: %s", c2);
            bArr[c2] = (byte) i2;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgvt) {
            zzgvt zzgvtVar = (zzgvt) obj;
            if (this.zzi == zzgvtVar.zzi && Arrays.equals(this.zzf, zzgvtVar.zzf)) {
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

    public final char zza(int i2) {
        return this.zzf[i2];
    }

    public final boolean zzb(int i2) {
        return this.zzh[i2 % this.zzc];
    }

    public final int zzc(char c2) throws zzgvw {
        if (c2 > 127) {
            throw new zzgvw("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        byte b2 = this.zzg[c2];
        if (b2 != -1) {
            return b2;
        }
        if (c2 <= ' ' || c2 == 127) {
            throw new zzgvw("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        throw new zzgvw(androidx.media3.extractor.text.ttml.a.p(new StringBuilder(String.valueOf(c2).length() + 24), "Unrecognized character: ", c2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    public final zzgvt zzd() {
        boolean z2;
        int i2 = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i2 >= length) {
                return this;
            }
            if (zzgpj.zzd(cArr[i2])) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    }
                    if (zzgpj.zzc(cArr[i3])) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                zzgqa.zzj(!z2, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i4 = 0; i4 < cArr.length; i4++) {
                    char c2 = cArr[i4];
                    if (zzgpj.zzd(c2)) {
                        c2 ^= 32;
                    }
                    cArr2[i4] = (char) c2;
                }
                zzgvt zzgvtVar = new zzgvt(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzgvtVar.zzi) {
                    return zzgvtVar;
                }
                byte[] bArr = zzgvtVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i5 = 65; i5 <= 90; i5++) {
                    int i6 = i5 | 32;
                    byte b2 = bArr[i5];
                    byte b3 = bArr[i6];
                    if (b2 == -1) {
                        bArrCopyOf[i5] = b3;
                    } else {
                        char c3 = (char) i5;
                        char c4 = (char) i6;
                        if (b3 != -1) {
                            throw new IllegalStateException(zzgqr.zzd("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                        }
                        bArrCopyOf[i6] = b2;
                    }
                }
                return new zzgvt(zzgvtVar.zze.concat(".ignoreCase()"), zzgvtVar.zzf, bArrCopyOf, true);
            }
            i2++;
        }
    }

    public final boolean zze(char c2) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final /* synthetic */ char[] zzf() {
        return this.zzf;
    }

    private zzgvt(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZza = zzgwq.zza(length, RoundingMode.UNNECESSARY);
            this.zzb = iZza;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZza);
            int i2 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i2;
            this.zzd = iZza >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i2];
            for (int i3 = 0; i3 < this.zzd; i3++) {
                zArr[zzgwq.zzb(i3 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z2;
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.g(length2, "Illegal alphabet length ", new StringBuilder(String.valueOf(length2).length() + 24)), e2);
        }
    }
}
