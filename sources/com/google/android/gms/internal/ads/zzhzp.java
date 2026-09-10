package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzp extends zzhzq {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzg;
    private final long zzh;
    private long zzi;
    private long zzj;
    private final long zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    public /* synthetic */ zzhzp(ByteBuffer byteBuffer, boolean z2, byte[] bArr) {
        super(null);
        this.zzn = Integer.MAX_VALUE;
        this.zzg = byteBuffer.duplicate();
        long jZzs = zzidm.zzs(byteBuffer);
        this.zzh = jZzs;
        this.zzi = ((long) byteBuffer.limit()) + jZzs;
        long jPosition = jZzs + ((long) byteBuffer.position());
        this.zzj = jPosition;
        this.zzk = jPosition;
    }

    private final void zzN() {
        long j = this.zzi + ((long) this.zzl);
        this.zzi = j;
        int i2 = (int) (j - this.zzk);
        int i3 = this.zzn;
        if (i2 <= i3) {
            this.zzl = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzl = i4;
        this.zzi = j - ((long) i4);
    }

    private final int zzO() {
        return (int) (this.zzi - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final void zzA(int i2) {
        this.zzn = i2;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final boolean zzB() throws IOException {
        return this.zzj == this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzC() {
        return (int) (this.zzj - this.zzk);
    }

    public final byte zzD() throws IOException {
        long j = this.zzj;
        if (j == this.zzi) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 1 + j;
        return zzidm.zzr(j);
    }

    public final void zzE(int i2) throws IOException {
        if (i2 >= 0 && i2 <= zzO()) {
            this.zzj += (long) i2;
        } else {
            if (i2 >= 0) {
                throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzm = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzm = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzibg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final void zzb(int i2) throws zzibg {
        if (this.zzm != i2) {
            throw new zzibg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final boolean zzc(int i2) throws IOException {
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (zzO() < 10) {
                while (i4 < 10) {
                    if (zzD() < 0) {
                        i4++;
                    }
                }
                throw new zzibg("CodedInputStream encountered a malformed varint.");
            }
            while (i4 < 10) {
                long j = this.zzj;
                this.zzj = 1 + j;
                if (zzidm.zzr(j) < 0) {
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
        if (iZzu <= 0 || iZzu > zzO()) {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu < 0) {
                throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzu];
        long j = iZzu;
        zzidm.zzq(this.zzj, bArr, 0L, j);
        String str = new String(bArr, zzibe.zza);
        this.zzj += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0 && iZzu <= zzO()) {
            String strZze = zzidr.zze(this.zzg, (int) (this.zzj - this.zzh), iZzu);
            this.zzj += (long) iZzu;
            return strZze;
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
        if (iZzu <= 0 || iZzu > zzO()) {
            if (iZzu == 0) {
                return zzhzl.zzb;
            }
            if (iZzu < 0) {
                throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzu];
        long j = iZzu;
        zzidm.zzq(this.zzj, bArr, 0L, j);
        this.zzj += j;
        zzhzl zzhzlVar = zzhzl.zzb;
        return new zzhzj(bArr);
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzidm.zzr(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzu() throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.zzj
            long r2 = r9.zzi
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.android.gms.internal.ads.zzidm.zzr(r0)
            if (r4 < 0) goto L16
            r9.zzj = r2
            return r4
        L16:
            long r5 = r9.zzi
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.android.gms.internal.ads.zzidm.zzr(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzidm.zzr(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzidm.zzr(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzidm.zzr(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzidm.zzr(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzidm.zzr(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzidm.zzr(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = com.google.android.gms.internal.ads.zzidm.zzr(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.android.gms.internal.ads.zzidm.zzr(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.zzj = r5
            return r0
        L92:
            long r0 = r9.zzw()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzp.zzu():int");
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        int i2;
        long j3 = this.zzj;
        if (this.zzi != j3) {
            long j4 = 1 + j3;
            byte bZzr = zzidm.zzr(j3);
            if (bZzr >= 0) {
                this.zzj = j4;
                return bZzr;
            }
            if (this.zzi - j4 >= 9) {
                long j5 = 2 + j3;
                int iZzr = (zzidm.zzr(j4) << 7) ^ bZzr;
                if (iZzr >= 0) {
                    long j6 = 3 + j3;
                    int iZzr2 = iZzr ^ (zzidm.zzr(j5) << 14);
                    if (iZzr2 < 0) {
                        j5 = 4 + j3;
                        int iZzr3 = iZzr2 ^ (zzidm.zzr(j6) << 21);
                        if (iZzr3 < 0) {
                            i2 = (-2080896) ^ iZzr3;
                        } else {
                            j6 = 5 + j3;
                            long jZzr = (((long) zzidm.zzr(j5)) << 28) ^ ((long) iZzr3);
                            if (jZzr >= 0) {
                                j = 266354560 ^ jZzr;
                            } else {
                                long j7 = 6 + j3;
                                long jZzr2 = (((long) zzidm.zzr(j6)) << 35) ^ jZzr;
                                if (jZzr2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j5 = j3 + 7;
                                    long jZzr3 = jZzr2 ^ (((long) zzidm.zzr(j7)) << 42);
                                    if (jZzr3 >= 0) {
                                        j = 4363953127296L ^ jZzr3;
                                    } else {
                                        j7 = 8 + j3;
                                        jZzr2 = jZzr3 ^ (((long) zzidm.zzr(j5)) << 49);
                                        if (jZzr2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long jZzr4 = (jZzr2 ^ (((long) zzidm.zzr(j7)) << 56)) ^ 71499008037633920L;
                                            if (jZzr4 < 0) {
                                                long j8 = j3 + 10;
                                                if (zzidm.zzr(j5) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                            j = jZzr4;
                                        }
                                    }
                                }
                                j = j2 ^ jZzr2;
                                j5 = j7;
                            }
                        }
                        this.zzj = j5;
                        return j;
                    }
                    j = iZzr2 ^ 16256;
                    j5 = j6;
                    this.zzj = j5;
                    return j;
                }
                i2 = iZzr ^ (-128);
                j = i2;
                this.zzj = j5;
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
        long j = this.zzj;
        if (this.zzi - j < 4) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 4 + j;
        int iZzr = zzidm.zzr(j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int iZzr2 = zzidm.zzr(1 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int iZzr3 = zzidm.zzr(2 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((zzidm.zzr(j + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (iZzr2 << 8) | iZzr | (iZzr3 << 16);
    }

    public final long zzy() throws IOException {
        long j = this.zzj;
        if (this.zzi - j < 8) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 8 + j;
        long jZzr = zzidm.zzr(j);
        long jZzr2 = zzidm.zzr(1 + j);
        long jZzr3 = zzidm.zzr(2 + j);
        long jZzr4 = zzidm.zzr(3 + j);
        long jZzr5 = zzidm.zzr(4 + j);
        return ((((long) zzidm.zzr(j + 7)) & 255) << 56) | (jZzr & 255) | ((jZzr2 & 255) << 8) | ((jZzr3 & 255) << 16) | ((jZzr4 & 255) << 24) | ((jZzr5 & 255) << 32) | ((zzidm.zzr(5 + j) & 255) << 40) | ((zzidm.zzr(6 + j) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzhzq
    public final int zzz(int i2) throws zzibg {
        if (i2 < 0) {
            throw new zzibg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzC = i2 + zzC();
        int i3 = this.zzn;
        if (iZzC > i3) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzn = iZzC;
        zzN();
        return i3;
    }
}
