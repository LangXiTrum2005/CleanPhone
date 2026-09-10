package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzo extends zzhzq {
    private final InputStream zza;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    public /* synthetic */ zzhzo(InputStream inputStream, int i2, byte[] bArr) {
        super(null);
        this.zzm = Integer.MAX_VALUE;
        byte[] bArr2 = zzibe.zzb;
        this.zza = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final void zzN() {
        int i2 = this.zzh + this.zzi;
        this.zzh = i2;
        int i3 = this.zzl + i2;
        int i4 = this.zzm;
        if (i3 <= i4) {
            this.zzi = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzi = i5;
        this.zzh = i2 - i5;
    }

    private final void zzO(int i2) throws IOException {
        if (zzP(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.zzl) - this.zzj) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzibg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzP(int i2) throws IOException {
        int i3 = this.zzj;
        int i4 = i3 + i2;
        int i5 = this.zzh;
        if (i4 <= i5) {
            throw new IllegalStateException(Z.n(new StringBuilder(String.valueOf(i2).length() + 66), "refillBuffer() called when ", i2, " bytes were already available in buffer"));
        }
        int i6 = this.zzl;
        if (i2 > (Integer.MAX_VALUE - i6) - i3 || i6 + i3 + i2 > this.zzm) {
            return false;
        }
        if (i3 > 0) {
            if (i5 > i3) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
            }
            i6 = this.zzl + i3;
            this.zzl = i6;
            i5 = this.zzh - i3;
            this.zzh = i5;
            this.zzj = 0;
        }
        try {
            int i7 = this.zza.read(this.zzg, i5, Math.min(4096 - i5, (Integer.MAX_VALUE - i6) - i5));
            if (i7 != 0 && i7 >= -1 && i7 <= 4096) {
                if (i7 <= 0) {
                    return false;
                }
                this.zzh += i7;
                zzN();
                return this.zzh >= i2 || zzP(i2);
            }
            String strValueOf = String.valueOf(this.zza.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + strValueOf.length() + 39 + 41);
            sb.append(strValueOf);
            sb.append("#read(byte[]) returned invalid result: ");
            sb.append(i7);
            sb.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb.toString());
        } catch (zzibg e2) {
            e2.zza();
            throw e2;
        }
    }

    private final byte[] zzQ(int i2, boolean z2) throws IOException {
        byte[] bArrZzR = zzR(i2);
        if (bArrZzR != null) {
            return bArrZzR;
        }
        int i3 = this.zzj;
        int i4 = this.zzh;
        int i5 = i4 - i3;
        this.zzl += i4;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzg, i3, bArr, 0, i5);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    private final byte[] zzR(int i2) throws IOException {
        if (i2 == 0) {
            return zzibe.zzb;
        }
        int i3 = this.zzl;
        int i4 = this.zzj;
        int i5 = i3 + i4 + i2;
        if ((-2147483647) + i5 > 0) {
            throw new zzibg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.zzm;
        if (i5 > i6) {
            zzE((i6 - i3) - i4);
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i7 = this.zzh - i4;
        int i8 = i2 - i7;
        if (i8 >= 4096) {
            try {
                if (i8 > this.zza.available()) {
                    return null;
                }
            } catch (zzibg e2) {
                e2.zza();
                throw e2;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i7);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i7 < i2) {
            try {
                int i9 = this.zza.read(bArr, i7, i2 - i7);
                if (i9 == -1) {
                    throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i9;
                i7 += i9;
            } catch (zzibg e3) {
                e3.zza();
                throw e3;
            }
        }
        return bArr;
    }

    private final List zzS(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = this.zza.read(bArr, i3, iMin - i3);
                if (i4 == -1) {
                    throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i4;
                i3 += i4;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final void zzA(int i2) {
        this.zzm = i2;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final boolean zzB() throws IOException {
        return this.zzj == this.zzh && !zzP(1);
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzC() {
        return this.zzl + this.zzj;
    }

    public final byte zzD() throws IOException {
        if (this.zzj == this.zzh) {
            zzO(1);
        }
        byte[] bArr = this.zzg;
        int i2 = this.zzj;
        this.zzj = i2 + 1;
        return bArr[i2];
    }

    public final void zzE(int i2) throws IOException {
        int i3 = this.zzh;
        int i4 = this.zzj;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.zzj = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.zzl;
        int i7 = i6 + i4;
        int i8 = this.zzm;
        if (i7 + i2 > i8) {
            zzE((i8 - i6) - i4);
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i7;
        this.zzh = 0;
        this.zzj = 0;
        while (i5 < i2) {
            try {
                long j = i2 - i5;
                try {
                    long jSkip = this.zza.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(this.zza.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i5 += (int) jSkip;
                    }
                } catch (zzibg e2) {
                    e2.zza();
                    throw e2;
                }
            } catch (Throwable th) {
                this.zzl += i5;
                zzN();
                throw th;
            }
        }
        this.zzl += i5;
        zzN();
        if (i5 >= i2) {
            return;
        }
        int i9 = this.zzh;
        int i10 = i9 - this.zzj;
        this.zzj = i9;
        zzO(1);
        while (true) {
            int i11 = i2 - i10;
            int i12 = this.zzh;
            if (i11 <= i12) {
                this.zzj = i11;
                return;
            } else {
                i10 += i12;
                this.zzj = i12;
                zzO(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzibg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final void zzb(int i2) throws zzibg {
        if (this.zzk != i2) {
            throw new zzibg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final boolean zzc(int i2) throws IOException {
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i4 < 10) {
                    if (zzD() < 0) {
                        i4++;
                    }
                }
                throw new zzibg("CodedInputStream encountered a malformed varint.");
            }
            while (i4 < 10) {
                byte[] bArr = this.zzg;
                int i5 = this.zzj;
                this.zzj = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw new zzibg("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i3 == 1) {
            zzE(8);
            return true;
        }
        if (i3 == 2) {
            zzE(zzu());
            return true;
        }
        if (i3 == 3) {
            zzJ();
            zzb(((i2 >>> 3) << 3) | 4);
            return true;
        }
        if (i3 == 4) {
            zzI();
            return false;
        }
        if (i3 != 5) {
            throw new zzibf("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i2 = this.zzh;
            int i3 = this.zzj;
            if (iZzu <= i2 - i3) {
                String str = new String(this.zzg, i3, iZzu, zzibe.zza);
                this.zzj += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzu > this.zzh) {
            return new String(zzQ(iZzu, false), zzibe.zza);
        }
        zzO(iZzu);
        String str2 = new String(this.zzg, this.zzj, iZzu, zzibe.zza);
        this.zzj += iZzu;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final String zzm() throws IOException {
        byte[] bArrZzQ;
        int iZzu = zzu();
        int i2 = this.zzj;
        int i3 = this.zzh;
        if (iZzu <= i3 - i2 && iZzu > 0) {
            bArrZzQ = this.zzg;
            this.zzj = i2 + iZzu;
        } else {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu < 0) {
                throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i2 = 0;
            if (iZzu <= i3) {
                zzO(iZzu);
                bArrZzQ = this.zzg;
                this.zzj = iZzu;
            } else {
                bArrZzQ = zzQ(iZzu, false);
            }
        }
        return zzidr.zzf(bArrZzQ, i2, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final zzhzl zzn() throws IOException {
        int iZzu = zzu();
        int i2 = this.zzh;
        int i3 = this.zzj;
        if (iZzu <= i2 - i3 && iZzu > 0) {
            zzhzl zzhzlVarZzt = zzhzl.zzt(this.zzg, i3, iZzu, false);
            this.zzj += iZzu;
            return zzhzlVarZzt;
        }
        if (iZzu == 0) {
            return zzhzl.zzb;
        }
        if (iZzu < 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzR = zzR(iZzu);
        if (bArrZzR != null) {
            return zzhzl.zzt(bArrZzR, 0, bArrZzR.length, false);
        }
        int i4 = this.zzj;
        int i5 = this.zzh;
        int i6 = i5 - i4;
        this.zzl += i5;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(iZzu - i6);
        byte[] bArr = new byte[iZzu];
        System.arraycopy(this.zzg, i4, bArr, 0, i6);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i6, length);
            i6 += length;
        }
        return zzhzl.zzu(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzs() throws IOException {
        return zzhzq.zzK(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final long zzt() throws IOException {
        return zzhzq.zzL(zzv());
    }

    public final int zzu() throws IOException {
        int i2;
        int i3 = this.zzj;
        int i4 = this.zzh;
        if (i4 != i3) {
            byte[] bArr = this.zzg;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzj = i5;
                return b2;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b2;
                if (i7 < 0) {
                    i2 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        i2 = i9 ^ 16256;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            i2 = (-2080896) ^ i11;
                        } else {
                            i8 = i3 + 5;
                            byte b3 = bArr[i10];
                            int i12 = (i11 ^ (b3 << 28)) ^ 266354560;
                            if (b3 < 0) {
                                i10 = i3 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i3 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i3 + 9;
                                            if (bArr[i10] < 0) {
                                                int i13 = i3 + 10;
                                                if (bArr[i8] >= 0) {
                                                    i6 = i13;
                                                    i2 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i12;
                            }
                            i2 = i12;
                        }
                        i6 = i10;
                    }
                    i6 = i8;
                }
                this.zzj = i6;
                return i2;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        int i2 = this.zzj;
        int i3 = this.zzh;
        if (i3 != i2) {
            byte[] bArr = this.zzg;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzj = i4;
                return b2;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b2;
                if (i6 < 0) {
                    j = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            long j3 = (-2080896) ^ i10;
                            i5 = i9;
                            j = j3;
                        } else {
                            i7 = i2 + 5;
                            long j4 = (((long) bArr[i9]) << 28) ^ ((long) i10);
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i5 = i2 + 6;
                                long j5 = (((long) bArr[i7]) << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i11 = i2 + 7;
                                    long j6 = j5 ^ (((long) bArr[i5]) << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j5 = j6 ^ (((long) bArr[i11]) << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i11 = i2 + 9;
                                            long j7 = (j5 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i5 = i2 + 10;
                                                if (bArr[i11] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i5 = i11;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i5 = i7;
                }
                this.zzj = i5;
                return j;
            }
        }
        return zzw();
    }

    public final long zzw() throws IOException {
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bZzD = zzD();
            j |= ((long) (bZzD & AbstractJsonLexerKt.TC_INVALID)) << i2;
            if ((bZzD & 128) == 0) {
                return j;
            }
        }
        throw new zzibg("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws IOException {
        int i2 = this.zzj;
        if (this.zzh - i2 < 4) {
            zzO(4);
            i2 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i2 + 4;
        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public final long zzy() throws IOException {
        int i2 = this.zzj;
        if (this.zzh - i2 < 8) {
            zzO(8);
            i2 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i2 + 8;
        long j = bArr[i2];
        long j2 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j3 = bArr[i2 + 2];
        long j4 = bArr[i2 + 3];
        return ((((long) bArr[i2 + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzz(int i2) throws zzibg {
        if (i2 < 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.zzl + this.zzj + i2;
        if (i3 < 0) {
            throw new zzibg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i4 = this.zzm;
        if (i3 > i4) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i3;
        zzN();
        return i4;
    }
}
