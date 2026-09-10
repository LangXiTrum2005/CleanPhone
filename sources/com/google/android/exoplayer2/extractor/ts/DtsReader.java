package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class DtsReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17933c;
    public TrackOutput d;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Format f17936i;
    public int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f17931a = new ParsableByteArray(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17934e = 0;
    public long k = -9223372036854775807L;

    public DtsReader(String str) {
        this.f17932b = str;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0234  */
    /* JADX WARN: Code duplicated, block: B:67:0x023c  */
    /* JADX WARN: Code duplicated, block: B:69:0x023f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0243  */
    /* JADX WARN: Code duplicated, block: B:73:0x0259  */
    /* JADX WARN: Code duplicated, block: B:75:0x026a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0276  */
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void b(ParsableByteArray parsableByteArray) {
        int i2;
        int i3;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b3;
        int i9;
        byte b4;
        int i10;
        ParsableBitArray parsableBitArray;
        Assertions.e(this.d);
        while (parsableByteArray.a() > 0) {
            int i11 = this.f17934e;
            int i12 = 2;
            int i13 = 8;
            ParsableByteArray parsableByteArray2 = this.f17931a;
            if (i11 == 0) {
                while (parsableByteArray.a() > 0) {
                    int i14 = this.g << 8;
                    this.g = i14;
                    int iU = i14 | parsableByteArray.u();
                    this.g = iU;
                    if (iU == 2147385345 || iU == -25230976 || iU == 536864768 || iU == -14745368) {
                        byte[] bArr = parsableByteArray2.f18956a;
                        bArr[0] = (byte) ((iU >> 24) & 255);
                        bArr[1] = (byte) ((iU >> 16) & 255);
                        bArr[2] = (byte) ((iU >> 8) & 255);
                        bArr[3] = (byte) (iU & 255);
                        this.f = 4;
                        this.g = 0;
                        this.f17934e = 1;
                        break;
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr2 = parsableByteArray2.f18956a;
                int iMin = Math.min(parsableByteArray.a(), 18 - this.f);
                parsableByteArray.e(bArr2, this.f, iMin);
                int i15 = this.f + iMin;
                this.f = i15;
                if (i15 == 18) {
                    byte[] bArr3 = parsableByteArray2.f18956a;
                    if (this.f17936i == null) {
                        String str = this.f17933c;
                        i3 = 0;
                        if (bArr3[0] == 127) {
                            parsableBitArray = new ParsableBitArray(bArr3, bArr3.length);
                            i10 = 2;
                            i2 = 8;
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b5 = bArrCopyOf[0];
                            if (b5 == -2 || b5 == -1) {
                                for (int i16 = 0; i16 < bArrCopyOf.length - 1; i16 += 2) {
                                    byte b6 = bArrCopyOf[i16];
                                    int i17 = i16 + 1;
                                    bArrCopyOf[i16] = bArrCopyOf[i17];
                                    bArrCopyOf[i17] = b6;
                                }
                            }
                            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf, bArrCopyOf.length);
                            if (bArrCopyOf[0] == 31) {
                                ParsableBitArray parsableBitArray3 = new ParsableBitArray(bArrCopyOf, bArrCopyOf.length);
                                while (parsableBitArray3.b() >= 16) {
                                    parsableBitArray3.n(i12);
                                    int iG = parsableBitArray3.g(14) & 16383;
                                    int iMin2 = Math.min(8 - parsableBitArray2.f18954c, 14);
                                    int i18 = i12;
                                    int i19 = parsableBitArray2.f18954c;
                                    int i20 = (8 - i19) - iMin2;
                                    byte[] bArr4 = parsableBitArray2.f18952a;
                                    int i21 = parsableBitArray2.f18953b;
                                    byte b7 = (byte) (bArr4[i21] & ((65280 >> i19) | ((1 << i20) - 1)));
                                    bArr4[i21] = b7;
                                    int i22 = 14 - iMin2;
                                    bArr4[i21] = (byte) (b7 | ((iG >>> i22) << i20));
                                    int i23 = i21 + 1;
                                    while (i22 > i13) {
                                        parsableBitArray2.f18952a[i23] = (byte) (iG >>> (i22 - 8));
                                        i22 -= 8;
                                        i23++;
                                        i13 = i13;
                                    }
                                    int i24 = i13;
                                    int i25 = 8 - i22;
                                    byte[] bArr5 = parsableBitArray2.f18952a;
                                    byte b8 = (byte) (bArr5[i23] & ((1 << i25) - 1));
                                    bArr5[i23] = b8;
                                    bArr5[i23] = (byte) (((iG & ((1 << i22) - 1)) << i25) | b8);
                                    parsableBitArray2.n(14);
                                    parsableBitArray2.a();
                                    i12 = i18;
                                    i13 = i24;
                                }
                            }
                            i10 = i12;
                            i2 = i13;
                            parsableBitArray2.k(bArrCopyOf, bArrCopyOf.length);
                            parsableBitArray = parsableBitArray2;
                        }
                        parsableBitArray.n(60);
                        int i26 = DtsUtil.f17376a[parsableBitArray.g(6)];
                        int i27 = DtsUtil.f17377b[parsableBitArray.g(4)];
                        int iG2 = parsableBitArray.g(5);
                        int i28 = iG2 >= 29 ? -1 : (DtsUtil.f17378c[iG2] * 1000) / 2;
                        parsableBitArray.n(10);
                        int i29 = i26 + (parsableBitArray.g(i10) > 0 ? 1 : 0);
                        Format.Builder builder = new Format.Builder();
                        builder.f17081a = str;
                        builder.k = "audio/vnd.dts";
                        builder.f = i28;
                        builder.x = i29;
                        builder.y = i27;
                        builder.f17088n = null;
                        builder.f17083c = this.f17932b;
                        Format format = new Format(builder);
                        this.f17936i = format;
                        this.d.c(format);
                    } else {
                        i2 = 8;
                        i3 = 0;
                    }
                    byte b9 = bArr3[i3];
                    if (b9 != -2) {
                        if (b9 == -1) {
                            i9 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                            b4 = bArr3[9];
                        } else if (b9 != 31) {
                            i4 = ((bArr3[5] & 3) << 12) | ((bArr3[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                            b2 = bArr3[7];
                        } else {
                            i9 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                            b4 = bArr3[i2];
                        }
                        i6 = (i9 | ((b4 & 60) >> 2)) + 1;
                        i5 = 1;
                        if (i5 != 0) {
                            i6 = (i6 * 16) / 14;
                        }
                        this.j = i6;
                        if (b9 != -2) {
                            if (b9 != -1) {
                                i7 = (bArr3[4] & 7) << 4;
                                b3 = bArr3[7];
                            } else if (b9 != 31) {
                                i7 = (bArr3[4] & 1) << 6;
                                i8 = bArr3[5] & 252;
                            } else {
                                i7 = (bArr3[5] & 7) << 4;
                                b3 = bArr3[6];
                            }
                            i8 = b3 & 60;
                        } else {
                            i7 = (bArr3[5] & 1) << 6;
                            i8 = bArr3[4] & 252;
                        }
                        this.f17935h = (int) ((((long) ((((i8 >> 2) | i7) + 1) * 32)) * 1000000) / ((long) this.f17936i.A0));
                        parsableByteArray2.F(i3);
                        this.d.e(18, parsableByteArray2);
                        this.f17934e = 2;
                    } else {
                        i4 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                        b2 = bArr3[6];
                    }
                    i6 = (i4 | ((b2 & 240) >> 4)) + 1;
                    i5 = i3;
                    if (i5 != 0) {
                        i6 = (i6 * 16) / 14;
                    }
                    this.j = i6;
                    if (b9 != -2) {
                        if (b9 != -1) {
                            i7 = (bArr3[4] & 7) << 4;
                            b3 = bArr3[7];
                        } else if (b9 != 31) {
                            i7 = (bArr3[4] & 1) << 6;
                            i8 = bArr3[5] & 252;
                        } else {
                            i7 = (bArr3[5] & 7) << 4;
                            b3 = bArr3[6];
                        }
                        i8 = b3 & 60;
                    } else {
                        i7 = (bArr3[5] & 1) << 6;
                        i8 = bArr3[4] & 252;
                    }
                    this.f17935h = (int) ((((long) ((((i8 >> 2) | i7) + 1) * 32)) * 1000000) / ((long) this.f17936i.A0));
                    parsableByteArray2.F(i3);
                    this.d.e(18, parsableByteArray2);
                    this.f17934e = 2;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(parsableByteArray.a(), this.j - this.f);
                this.d.e(iMin3, parsableByteArray);
                int i30 = this.f + iMin3;
                this.f = i30;
                int i31 = this.j;
                if (i30 == i31) {
                    long j = this.k;
                    if (j != -9223372036854775807L) {
                        this.d.f(j, 1, i31, 0, null);
                        this.k += this.f17935h;
                    }
                    this.f17934e = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f17933c = trackIdGenerator.f18100e;
        trackIdGenerator.b();
        this.d = extractorOutput.track(trackIdGenerator.d, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f17934e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }
}
