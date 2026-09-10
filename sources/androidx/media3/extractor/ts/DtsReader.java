package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.google.common.primitives.Ints;
import com.inmobi.commons.core.configs.AdConfig;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class DtsReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7468a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7470c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7471e;
    public TrackOutput f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7473i;
    public long j;
    public Format k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7474l;
    public int m;
    public int g = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f7476p = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7469b = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7475n = -1;
    public int o = -1;

    public DtsReader(String str, int i2, int i3) {
        this.f7468a = new ParsableByteArray(new byte[i3]);
        this.f7470c = str;
        this.d = i2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) throws ParserException {
        int i2;
        int i3;
        boolean z2;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        byte b4;
        int i7;
        int i8;
        int iG;
        int iG2;
        int iG3;
        int i9;
        long jO;
        int i10;
        int i11;
        long jO2;
        int iG4;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        Assertions.f(this.f);
        while (parsableByteArray.a() > 0) {
            int i16 = this.g;
            int i17 = 8;
            ParsableByteArray parsableByteArray2 = this.f7468a;
            switch (i16) {
                case 0:
                    while (true) {
                        if (parsableByteArray.a() <= 0) {
                            i15 = 4;
                        }
                        int i18 = this.f7473i << 8;
                        this.f7473i = i18;
                        int iU = i18 | parsableByteArray.u();
                        this.f7473i = iU;
                        if (iU == 2147385345 || iU == -25230976 || iU == 536864768 || iU == -14745368) {
                            i2 = 1;
                        } else if (iU == 1683496997 || iU == 622876772) {
                            i2 = 2;
                        } else if (iU == 1078008818 || iU == -233094848) {
                            i2 = 3;
                        } else {
                            i2 = (iU == 1908687592 || iU == -398277519) ? 4 : 0;
                        }
                        this.m = i2;
                        if (i2 != 0) {
                            byte[] bArr = parsableByteArray2.f5667a;
                            bArr[0] = (byte) ((iU >> 24) & 255);
                            bArr[1] = (byte) ((iU >> 16) & 255);
                            bArr[2] = (byte) ((iU >> 8) & 255);
                            bArr[3] = (byte) (iU & 255);
                            this.f7472h = 4;
                            this.f7473i = 0;
                            if (i2 == 3 || i2 == 4) {
                                this.g = 4;
                            } else if (i2 == 1) {
                                this.g = 1;
                            } else {
                                this.g = 2;
                            }
                            i15 = 4;
                        }
                        break;
                        break;
                    }
                    break;
                case 1:
                    if (b(parsableByteArray, parsableByteArray2.f5667a, 18)) {
                        byte[] bArr2 = parsableByteArray2.f5667a;
                        if (this.k == null) {
                            String str = this.f7471e;
                            ParsableBitArray parsableBitArrayA = DtsUtil.a(bArr2);
                            parsableBitArrayA.o(60);
                            int i19 = DtsUtil.f6748a[parsableBitArrayA.g(6)];
                            int i20 = DtsUtil.f6749b[parsableBitArrayA.g(4)];
                            int iG5 = parsableBitArrayA.g(5);
                            int i21 = iG5 >= 29 ? -1 : (DtsUtil.f6750c[iG5] * 1000) / 2;
                            parsableBitArrayA.o(10);
                            int i22 = i19 + (parsableBitArrayA.g(2) > 0 ? 1 : 0);
                            Format.Builder builder = new Format.Builder();
                            builder.f5423a = str;
                            builder.f5429l = MimeTypes.l("audio/vnd.dts");
                            builder.g = i21;
                            builder.f5434z = i22;
                            builder.f5418A = i20;
                            builder.f5431p = null;
                            builder.d = this.f7470c;
                            builder.f = this.d;
                            Format format = new Format(builder);
                            this.k = format;
                            this.f.b(format);
                        }
                        byte b5 = bArr2[0];
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i6 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                                b4 = bArr2[9];
                            } else if (b5 != 31) {
                                i3 = (((bArr2[5] & 3) << 12) | ((bArr2[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                                z2 = false;
                            } else {
                                i6 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                                b4 = bArr2[8];
                            }
                            i3 = (i6 | ((b4 & 60) >> 2)) + 1;
                            z2 = true;
                        } else {
                            i3 = (((bArr2[4] & 3) << 12) | ((bArr2[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                            z2 = false;
                        }
                        if (z2) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f7474l = i3;
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i4 = (bArr2[4] & 7) << 4;
                                b3 = bArr2[7];
                            } else if (b5 != 31) {
                                i4 = (bArr2[4] & 1) << 6;
                                b2 = bArr2[5];
                            } else {
                                i4 = (bArr2[5] & 7) << 4;
                                b3 = bArr2[6];
                            }
                            i5 = b3 & 60;
                            this.j = Ints.b(Util.M(this.k.f5401B, (((i5 >> 2) | i4) + 1) * 32));
                            parsableByteArray2.G(0);
                            this.f.e(18, parsableByteArray2);
                            this.g = 6;
                        } else {
                            i4 = (bArr2[5] & 1) << 6;
                            b2 = bArr2[4];
                        }
                        i5 = b2 & 252;
                        this.j = Ints.b(Util.M(this.k.f5401B, (((i5 >> 2) | i4) + 1) * 32));
                        parsableByteArray2.G(0);
                        this.f.e(18, parsableByteArray2);
                        this.g = 6;
                    }
                    i15 = 4;
                    break;
                case 2:
                    if (b(parsableByteArray, parsableByteArray2.f5667a, 7)) {
                        ParsableBitArray parsableBitArrayA2 = DtsUtil.a(parsableByteArray2.f5667a);
                        parsableBitArrayA2.o(42);
                        this.f7475n = parsableBitArrayA2.g(parsableBitArrayA2.f() ? 12 : 8) + 1;
                        this.g = 3;
                    }
                    i15 = 4;
                    break;
                case 3:
                    int i23 = i15;
                    if (b(parsableByteArray, parsableByteArray2.f5667a, this.f7475n)) {
                        ParsableBitArray parsableBitArrayA3 = DtsUtil.a(parsableByteArray2.f5667a);
                        parsableBitArrayA3.o(40);
                        int iG6 = parsableBitArrayA3.g(2);
                        if (parsableBitArrayA3.f()) {
                            i7 = 20;
                            i8 = 12;
                        } else {
                            i7 = 16;
                            i8 = 8;
                        }
                        parsableBitArrayA3.o(i8);
                        int iG7 = parsableBitArrayA3.g(i7) + 1;
                        boolean zF = parsableBitArrayA3.f();
                        if (zF) {
                            iG = parsableBitArrayA3.g(2);
                            iG2 = (parsableBitArrayA3.g(3) + 1) * 512;
                            if (parsableBitArrayA3.f()) {
                                parsableBitArrayA3.o(36);
                            }
                            int iG8 = parsableBitArrayA3.g(3) + 1;
                            int iG9 = parsableBitArrayA3.g(3) + 1;
                            if (iG8 != 1 || iG9 != 1) {
                                throw ParserException.b("Multiple audio presentations or assets not supported");
                            }
                            int i24 = iG6 + 1;
                            int iG10 = parsableBitArrayA3.g(i24);
                            int i25 = 0;
                            while (i25 < i24) {
                                if (((iG10 >> i25) & 1) == 1) {
                                    parsableBitArrayA3.o(i17);
                                }
                                i25++;
                                i17 = 8;
                            }
                            if (parsableBitArrayA3.f()) {
                                parsableBitArrayA3.o(2);
                                int iG11 = (parsableBitArrayA3.g(2) + 1) << 2;
                                int iG12 = parsableBitArrayA3.g(2) + 1;
                                for (int i26 = 0; i26 < iG12; i26++) {
                                    parsableBitArrayA3.o(iG11);
                                }
                            }
                        } else {
                            iG = -1;
                            iG2 = 0;
                        }
                        parsableBitArrayA3.o(i7);
                        parsableBitArrayA3.o(12);
                        if (zF) {
                            if (parsableBitArrayA3.f()) {
                                parsableBitArrayA3.o(i23);
                            }
                            if (parsableBitArrayA3.f()) {
                                parsableBitArrayA3.o(24);
                            }
                            if (parsableBitArrayA3.f()) {
                                parsableBitArrayA3.p(parsableBitArrayA3.g(10) + 1);
                            }
                            parsableBitArrayA3.o(5);
                            int i27 = DtsUtil.d[parsableBitArrayA3.g(4)];
                            iG3 = parsableBitArrayA3.g(8) + 1;
                            i9 = i27;
                        } else {
                            iG3 = -1;
                            i9 = -2147483647;
                        }
                        if (zF) {
                            if (iG == 0) {
                                i10 = 32000;
                            } else if (iG == 1) {
                                i10 = 44100;
                            } else {
                                if (iG != 2) {
                                    throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + iG);
                                }
                                i10 = 48000;
                            }
                            int i28 = Util.f5683a;
                            jO = Util.O(iG2, 1000000L, i10, RoundingMode.FLOOR);
                        } else {
                            jO = -9223372036854775807L;
                        }
                        f(new DtsUtil.DtsHeader("audio/vnd.dts.hd;profile=lbr", iG3, i9, iG7, jO));
                        this.f7474l = iG7;
                        this.j = jO == -9223372036854775807L ? 0L : jO;
                        parsableByteArray2.G(0);
                        this.f.e(this.f7475n, parsableByteArray2);
                        this.g = 6;
                    }
                    i15 = 4;
                    break;
                case 4:
                    i11 = i15;
                    if (b(parsableByteArray, parsableByteArray2.f5667a, 6)) {
                        ParsableBitArray parsableBitArrayA4 = DtsUtil.a(parsableByteArray2.f5667a);
                        parsableBitArrayA4.o(32);
                        int iB = DtsUtil.b(parsableBitArrayA4, DtsUtil.f6753i) + 1;
                        this.o = iB;
                        int i29 = this.f7472h;
                        if (i29 > iB) {
                            int i30 = i29 - iB;
                            this.f7472h = i29 - i30;
                            parsableByteArray.G(parsableByteArray.f5668b - i30);
                        }
                        this.g = 5;
                    }
                    i15 = i11;
                    break;
                case 5:
                    if (b(parsableByteArray, parsableByteArray2.f5667a, this.o)) {
                        byte[] bArr3 = parsableByteArray2.f5667a;
                        AtomicInteger atomicInteger = this.f7469b;
                        i11 = i15;
                        ParsableBitArray parsableBitArrayA5 = DtsUtil.a(bArr3);
                        int i31 = parsableBitArrayA5.g(32) == 1078008818 ? 1 : 0;
                        int iB2 = DtsUtil.b(parsableBitArrayA5, DtsUtil.f6751e);
                        int i32 = iB2 + 1;
                        if (i31 == 0) {
                            jO2 = -9223372036854775807L;
                            iG4 = -2147483647;
                        } else {
                            if (!parsableBitArrayA5.f()) {
                                throw ParserException.b("Only supports full channel mask-based audio presentation");
                            }
                            int i33 = iB2 - 1;
                            int i34 = ((bArr3[i33] << 8) & 65535) | (bArr3[iB2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            int i35 = Util.f5683a;
                            int i36 = 65535;
                            for (int i37 = 0; i37 < i33; i37++) {
                                byte b6 = bArr3[i37];
                                int i38 = (((b6 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4) ^ ((i36 >> 12) & 255)) & 255;
                                int[] iArr = Util.m;
                                int i39 = (iArr[i38] ^ ((i36 << 4) & 65535)) & 65535;
                                i36 = (((i39 << 4) & 65535) ^ iArr[((b6 & 15) ^ ((i39 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i34 != i36) {
                                throw ParserException.a(null, "CRC check failed");
                            }
                            int iG13 = parsableBitArrayA5.g(2);
                            if (iG13 != 0) {
                                if (iG13 == 1) {
                                    i13 = 480;
                                } else {
                                    if (iG13 != 2) {
                                        throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + iG13);
                                    }
                                    i13 = 384;
                                }
                                i12 = 3;
                            } else {
                                i12 = 3;
                                i13 = 512;
                            }
                            int iG14 = (parsableBitArrayA5.g(i12) + 1) * i13;
                            int iG15 = parsableBitArrayA5.g(2);
                            if (iG15 == 0) {
                                i14 = 32000;
                            } else if (iG15 == 1) {
                                i14 = 44100;
                            } else {
                                if (iG15 != 2) {
                                    throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + iG15);
                                }
                                i14 = 48000;
                            }
                            if (parsableBitArrayA5.f()) {
                                parsableBitArrayA5.o(36);
                            }
                            iG4 = i14 * (1 << parsableBitArrayA5.g(2));
                            jO2 = Util.O(iG14, 1000000L, i14, RoundingMode.FLOOR);
                        }
                        int iB3 = 0;
                        for (int i40 = 0; i40 < i31; i40++) {
                            iB3 += DtsUtil.b(parsableBitArrayA5, DtsUtil.f);
                        }
                        if (i31 != 0) {
                            atomicInteger.set(DtsUtil.b(parsableBitArrayA5, DtsUtil.g));
                        }
                        int iB4 = iB3 + (atomicInteger.get() != 0 ? DtsUtil.b(parsableBitArrayA5, DtsUtil.f6752h) : 0) + i32;
                        DtsUtil.DtsHeader dtsHeader = new DtsUtil.DtsHeader("audio/vnd.dts.uhd;profile=p2", 2, iG4, iB4, jO2);
                        if (this.m == 3) {
                            f(dtsHeader);
                        }
                        this.f7474l = iB4;
                        this.j = jO2 == -9223372036854775807L ? 0L : jO2;
                        parsableByteArray2.G(0);
                        this.f.e(this.o, parsableByteArray2);
                        this.g = 6;
                        i15 = i11;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(parsableByteArray.a(), this.f7474l - this.f7472h);
                    this.f.e(iMin, parsableByteArray);
                    int i41 = this.f7472h + iMin;
                    this.f7472h = i41;
                    if (i41 == this.f7474l) {
                        Assertions.e(this.f7476p != -9223372036854775807L);
                        this.f.f(this.f7476p, this.m == i15 ? 0 : 1, this.f7474l, 0, null);
                        this.f7476p += this.j;
                        this.g = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public final boolean b(ParsableByteArray parsableByteArray, byte[] bArr, int i2) {
        int iMin = Math.min(parsableByteArray.a(), i2 - this.f7472h);
        parsableByteArray.e(bArr, this.f7472h, iMin);
        int i3 = this.f7472h + iMin;
        this.f7472h = i3;
        return i3 == i2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.f7476p = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f7471e = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        this.f = extractorOutput.track(trackIdGenerator.d, 1);
    }

    public final void f(DtsUtil.DtsHeader dtsHeader) {
        int i2;
        int i3 = dtsHeader.f6755b;
        if (i3 == -2147483647 || (i2 = dtsHeader.f6756c) == -1) {
            return;
        }
        Format format = this.k;
        String str = dtsHeader.f6754a;
        if (format != null && i2 == format.f5400A && i3 == format.f5401B && str.equals(format.m)) {
            return;
        }
        Format format2 = this.k;
        Format.Builder builder = format2 == null ? new Format.Builder() : format2.a();
        builder.f5423a = this.f7471e;
        builder.f5429l = MimeTypes.l(str);
        builder.f5434z = i2;
        builder.f5418A = i3;
        builder.d = this.f7470c;
        builder.f = this.d;
        Format format3 = new Format(builder);
        this.k = format3;
        this.f.b(format3);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.g = 0;
        this.f7472h = 0;
        this.f7473i = 0;
        this.f7476p = -9223372036854775807L;
        this.f7469b.set(0);
    }
}
