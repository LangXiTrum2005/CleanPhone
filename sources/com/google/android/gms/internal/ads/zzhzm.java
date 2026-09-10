package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzm extends zzhzq {
    private final byte[] zza;
    private int zzg;
    private int zzh;
    private int zzi;
    private final int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzhzm(byte[] bArr, int i2, int i3, boolean z2, byte[] bArr2) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zza = bArr;
        this.zzg = i3 + i2;
        this.zzi = i2;
        this.zzj = i2;
    }

    private final void zzN() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i3 = i2 - this.zzj;
        int i4 = this.zzl;
        if (i3 <= i4) {
            this.zzh = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzh = i5;
        this.zzg = i2 - i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final void zzA(int i2) {
        this.zzl = i2;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final boolean zzB() throws IOException {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzC() {
        return this.zzi - this.zzj;
    }

    public final byte zzD() throws IOException {
        int i2 = this.zzi;
        if (i2 == this.zzg) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzi = i2 + 1;
        return bArr[i2];
    }

    public final void zzE(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zzg;
            int i4 = this.zzi;
            if (i2 <= i3 - i4) {
                this.zzi = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
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
            if (this.zzg - this.zzi < 10) {
                while (i4 < 10) {
                    if (zzD() < 0) {
                        i4++;
                    }
                }
                throw new zzibg("CodedInputStream encountered a malformed varint.");
            }
            while (i4 < 10) {
                byte[] bArr = this.zza;
                int i5 = this.zzi;
                this.zzi = i5 + 1;
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
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzu <= i2 - i3) {
                String str = new String(this.zza, i3, iZzu, zzibe.zza);
                this.zzi += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzu <= i2 - i3) {
                String strZzf = zzidr.zzf(this.zza, i3, iZzu);
                this.zzi += iZzu;
                return strZzf;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final zzhzl zzn() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzu <= i2 - i3) {
                zzhzl zzhzlVarZzt = zzhzl.zzt(this.zza, i3, iZzu, false);
                this.zzi += iZzu;
                return zzhzlVarZzt;
            }
        }
        if (iZzu == 0) {
            return zzhzl.zzb;
        }
        if (iZzu > 0) {
            int i4 = this.zzg;
            int i5 = this.zzi;
            if (iZzu <= i4 - i5) {
                int i6 = iZzu + i5;
                this.zzi = i6;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.zza, i5, i6);
                zzhzl zzhzlVar = zzhzl.zzb;
                return new zzhzj(bArrCopyOfRange);
            }
        }
        if (iZzu <= 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i4 != i3) {
            byte[] bArr = this.zza;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzi = i5;
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
                this.zzi = i6;
                return i2;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zza;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzi = i4;
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
                this.zzi = i5;
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
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzi = i2 + 4;
        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public final long zzy() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzi = i2 + 8;
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
        int i3 = (this.zzi - this.zzj) + i2;
        if (i3 < 0) {
            throw new zzibg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i4 = this.zzl;
        if (i3 > i4) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i3;
        zzN();
        return i4;
    }
}
