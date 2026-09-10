package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzer {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgtn zzc = zzgtn.zzl(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzer(byte[] bArr, int i2) {
        this.zze = bArr;
        this.zzg = i2;
    }

    private final char zzS(ByteOrder byteOrder, int i2) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i3 = this.zzf + i2;
            return zzgwu.zza(bArr[i3], bArr[i3 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i4 = this.zzf + i2;
        return zzgwu.zza(bArr2[i4 + 1], bArr2[i4]);
    }

    private final char zzT(Charset charset, char[] cArr) {
        int iZzU;
        if (zzd() >= zzV(charset) && (iZzU = zzU(charset)) != 0) {
            int i2 = iZzU >>> 8;
            if (!Character.isSupplementaryCodePoint(i2)) {
                long j = i2;
                char c2 = (char) j;
                zzgqa.zze(((long) c2) == j, "Out of range: %s", j);
                for (char c3 : cArr) {
                    if (c3 == c2) {
                        this.zzf = zzgwx.zza(iZzU & 255) + this.zzf;
                        return c2;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    private final int zzU(Charset charset) {
        int codePoint;
        int i2;
        int iZzY;
        zzgqa.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i3 = this.zzf;
            int i4 = this.zzg;
            throw new IndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i3).length() + 17 + String.valueOf(i4).length()), i3, "position=", i4, ", limit="));
        }
        int i5 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b2 = this.zze[this.zzf];
            if ((b2 & 128) == 0) {
                codePoint = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                return (codePoint << 8) | i5;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b3 = this.zze[this.zzf];
            if ((b3 & 128) == 0) {
                i2 = 1;
            } else if ((b3 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i2 = 2;
            } else if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                byte[] bArr = this.zze;
                int i6 = this.zzf;
                if (zzX(bArr[i6 + 1]) && zzX(bArr[i6 + 2])) {
                    i2 = 3;
                } else if ((this.zze[this.zzf] & 248) == 240) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
            } else if ((this.zze[this.zzf] & 248) == 240 || zzd() < 4) {
                i2 = 0;
            } else {
                byte[] bArr2 = this.zze;
                int i7 = this.zzf;
                if (zzX(bArr2[i7 + 1]) && zzX(bArr2[i7 + 2]) && zzX(bArr2[i7 + 3])) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
            }
            if (i2 == 1) {
                iZzY = this.zze[this.zzf] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            } else if (i2 == 2) {
                byte[] bArr3 = this.zze;
                int i8 = this.zzf;
                iZzY = zzY(0, 0, bArr3[i8], bArr3[i8 + 1]);
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        byte[] bArr4 = this.zze;
                        int i9 = this.zzf;
                        iZzY = zzY(bArr4[i9], bArr4[i9 + 1], bArr4[i9 + 2], bArr4[i9 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i10 = this.zzf;
                iZzY = zzY(0, bArr5[i10] & 15, bArr5[i10 + 1], bArr5[i10 + 2]);
            }
            i5 = i2;
            codePoint = iZzY;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzS) || zzd() < 4) {
                codePoint = cZzS;
                i5 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzS, zzS(byteOrder, 2));
                i5 = 4;
            }
        }
        return (codePoint << 8) | i5;
    }

    private static int zzV(Charset charset) {
        zzgqa.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i2) {
        if (!zzd.get() || zzd() >= i2) {
            return;
        }
        int iZzd = zzd();
        throw new IndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 25 + String.valueOf(iZzd).length()), i2, "bytesNeeded= ", iZzd, ", bytesLeft="));
    }

    private static boolean zzX(byte b2) {
        return (b2 & 192) == 128;
    }

    private static int zzY(int i2, int i3, int i4, int i5) {
        return zzgwx.zze((byte) 0, zzgxb.zza(((i2 & 7) << 2) | ((i3 & 48) >> 4)), zzgxb.zza(((i4 & 60) >> 2) | ((i3 & 15) << 4)), zzgxb.zza((i5 & 63) | ((i4 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        long j = bArr[i2];
        int i4 = i2 + 2;
        this.zzf = i4;
        long j2 = bArr[i3];
        int i5 = i2 + 3;
        this.zzf = i5;
        long j3 = bArr[i4];
        this.zzf = i2 + 4;
        return ((((long) bArr[i5]) & 255) << 24) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = i2 + 2;
        this.zzf = i5;
        int i6 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i7 = i2 + 3;
        this.zzf = i7;
        int i8 = bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 4;
        return (bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i4 << 24) | (i6 << 16) | (i8 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = i2 + 2;
        this.zzf = i5;
        int i6 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i7 = i2 + 3;
        this.zzf = i7;
        int i8 = bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 4;
        return ((bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i6 << 8) | i4 | (i8 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        long j = bArr[i2];
        int i4 = i2 + 2;
        this.zzf = i4;
        long j2 = bArr[i3];
        int i5 = i2 + 3;
        this.zzf = i5;
        long j3 = bArr[i4];
        int i6 = i2 + 4;
        this.zzf = i6;
        long j4 = bArr[i5];
        int i7 = i2 + 5;
        this.zzf = i7;
        long j5 = bArr[i6];
        int i8 = i2 + 6;
        this.zzf = i8;
        long j6 = bArr[i7];
        int i9 = i2 + 7;
        this.zzf = i9;
        long j7 = bArr[i8];
        this.zzf = i2 + 8;
        return ((j7 & 255) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | (((long) bArr[i9]) & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        long j = bArr[i2];
        int i4 = i2 + 2;
        this.zzf = i4;
        long j2 = bArr[i3];
        int i5 = i2 + 3;
        this.zzf = i5;
        long j3 = bArr[i4];
        int i6 = i2 + 4;
        this.zzf = i6;
        long j4 = bArr[i5];
        int i7 = i2 + 5;
        this.zzf = i7;
        long j5 = bArr[i6];
        int i8 = i2 + 6;
        this.zzf = i8;
        long j6 = bArr[i7];
        int i9 = i2 + 7;
        this.zzf = i9;
        long j7 = bArr[i8];
        this.zzf = i2 + 8;
        return ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((((long) bArr[i9]) & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 2;
        int i5 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 4;
        return (i4 << 8) | i5;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int iZzB = zzB();
        if (iZzB >= 0) {
            return iZzB;
        }
        throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.g(iZzB, "Top bit not zero: ", new StringBuilder(String.valueOf(iZzB).length() + 18)));
    }

    public final int zzI() {
        int iZzC = zzC();
        if (iZzC >= 0) {
            return iZzC;
        }
        throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.g(iZzC, "Top bit not zero: ", new StringBuilder(String.valueOf(iZzC).length() + 18)));
    }

    public final long zzJ() {
        long jZzD = zzD();
        if (jZzD >= 0) {
            return jZzD;
        }
        throw new IllegalStateException(androidx.media3.extractor.text.ttml.a.k(jZzD, "Top bit not zero: ", new StringBuilder(String.valueOf(jZzD).length() + 18)));
    }

    public final String zzK(int i2, Charset charset) {
        zzW(i2);
        byte[] bArr = this.zze;
        int i3 = this.zzf;
        String str = new String(bArr, i3, i2, charset);
        this.zzf = i3 + i2;
        return str;
    }

    public final String zzL(int i2) {
        zzW(i2);
        if (i2 == 0) {
            return "";
        }
        int i3 = this.zzf;
        int i4 = (i3 + i2) - 1;
        String strZzj = zzfj.zzj(this.zze, i3, (i4 >= this.zzg || this.zze[i4] != 0) ? i2 : i2 - 1);
        this.zzf += i2;
        return strZzj;
    }

    public final String zzM(char c2) {
        if (zzd() == 0) {
            return null;
        }
        int i2 = this.zzf;
        while (i2 < this.zzg && this.zze[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.zze;
        int i3 = this.zzf;
        String strZzj = zzfj.zzj(bArr, i3, i2 - i3);
        this.zzf = i2;
        if (i2 < this.zzg) {
            this.zzf = i2 + 1;
        }
        return strZzj;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5 A[SYNTHETIC] */
    public final String zzN(Charset charset) {
        byte[] bArr;
        zzgqa.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            zzR();
        }
        int i2 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i2 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i3 = this.zzf;
        while (true) {
            int i4 = this.zzg;
            if (i3 >= i4 - (i2 - 1)) {
                i3 = i4;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzfj.zzk(this.zze[i3])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.zze;
                if (bArr2[i3] == 0 && zzfj.zzk(bArr2[i3 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zze;
                    if (bArr[i3 + 1] == 0 && zzfj.zzk(bArr[i3])) {
                        break;
                    }
                }
                i3 += i2;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zze;
                    if (bArr[i3 + 1] == 0) {
                        continue;
                    }
                }
                i3 += i2;
            }
        }
        String strZzK = zzK(i3 - this.zzf, charset);
        if (this.zzf != this.zzg && zzT(charset, zza) == '\r') {
            zzT(charset, zzb);
        }
        return strZzK;
    }

    public final long zzO() {
        int i2;
        zzW(1);
        long j = this.zze[this.zzf];
        int i3 = 7;
        while (true) {
            i2 = 0;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) == 0) {
                if (i3 >= 6) {
                    if (i3 != 7) {
                        break;
                    }
                    i2 = 1;
                    break;
                }
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
                break;
            }
            i3--;
        }
        if (i2 == 0) {
            throw new NumberFormatException(androidx.media3.extractor.text.ttml.a.k(j, "Invalid UTF-8 sequence first byte: ", new StringBuilder(String.valueOf(j).length() + 35)));
        }
        zzW(i2);
        for (int i5 = 1; i5 < i2; i5++) {
            byte b2 = this.zze[this.zzf + i5];
            if ((b2 & 192) != 128) {
                throw new NumberFormatException(androidx.media3.extractor.text.ttml.a.k(j, "Invalid UTF-8 sequence continuation byte: ", new StringBuilder(String.valueOf(j).length() + 42)));
            }
            j = (j << 6) | ((long) (b2 & 63));
        }
        this.zzf += i2;
        return j;
    }

    public final long zzP() {
        long j = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzs = zzs();
            j |= (127 & jZzs) << (i2 * 7);
            if ((jZzs & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i2 = this.zzf;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.zzf = i2 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i3 = this.zzf;
        byte b2 = bArr2[i3];
        if (b2 == -2) {
            if (bArr2[i3 + 1] != -1) {
                return null;
            }
            this.zzf = i3 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b2 != -1 || bArr2[i3 + 1] != -2) {
            return null;
        }
        this.zzf = i3 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void zza(int i2) {
        byte[] bArr = this.zze;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        zzb(bArr, i2);
    }

    public final void zzb(byte[] bArr, int i2) {
        this.zze = bArr;
        this.zzg = i2;
        this.zzf = 0;
    }

    public final void zzc(int i2) {
        byte[] bArr = this.zze;
        if (i2 > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i2);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= this.zze.length) {
            z2 = true;
        }
        zzgqa.zza(z2);
        this.zzg = i2;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= this.zzg) {
            z2 = true;
        }
        zzgqa.zza(z2);
        this.zzf = i2;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i2) {
        zzh(this.zzf + i2);
    }

    public final void zzl(zzeq zzeqVar, int i2) {
        zzm(zzeqVar.zza, 0, i2);
        zzeqVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i2, int i3) {
        zzW(i3);
        System.arraycopy(this.zze, this.zzf, bArr, i2, i3);
        this.zzf += i3;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(Charset charset) {
        int iZzU = zzU(charset);
        if (iZzU != 0) {
            return zzgwx.zza(iZzU >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            int iZzx = zzx();
            this.zzf -= 3;
            return iZzx;
        }
        int i2 = this.zzf;
        int i3 = this.zzg;
        throw new IndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 17 + String.valueOf(i3).length()), i2, "position=", i3, ", limit="));
    }

    public final int zzr() {
        if (zzd() >= 4) {
            int iZzB = zzB();
            this.zzf -= 4;
            return iZzB;
        }
        int i2 = this.zzf;
        int i3 = this.zzg;
        throw new IndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 17 + String.valueOf(i3).length()), i2, "position=", i3, ", limit="));
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        this.zzf = i2 + 1;
        return bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 2;
        return (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i4 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 2;
        return ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i4;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 2;
        return (short) ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i4 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 2;
        return (short) (((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i4);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = i2 + 2;
        this.zzf = i5;
        int i6 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 3;
        return (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i4 << 16) | (i6 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = i2 + 2;
        this.zzf = i5;
        int i6 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.zzf = i2 + 3;
        return (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((i4 << 24) >> 8) | (i6 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        long j = bArr[i2];
        int i4 = i2 + 2;
        this.zzf = i4;
        long j2 = bArr[i3];
        int i5 = i2 + 3;
        this.zzf = i5;
        long j3 = bArr[i4];
        this.zzf = i2 + 4;
        return (((long) bArr[i5]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public zzer() {
        this.zze = zzfj.zzb;
    }

    public zzer(int i2) {
        this.zze = new byte[i2];
        this.zzg = i2;
    }

    public zzer(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
