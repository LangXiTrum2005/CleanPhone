package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
public final class Ac3Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableBitArray f7433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7435c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7436e;
    public TrackOutput f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7438i;
    public long j;
    public Format k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7439l;
    public long m;

    public Ac3Reader() {
        this(null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0212  */
    /* JADX WARN: Code duplicated, block: B:149:0x0254  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        int i2;
        int iA;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        byte b2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Assertions.f(this.f);
        while (parsableByteArray.a() > 0) {
            int i18 = this.g;
            ParsableByteArray parsableByteArray2 = this.f7434b;
            if (i18 == 0) {
                while (parsableByteArray.a() > 0) {
                    if (this.f7438i) {
                        int iU = parsableByteArray.u();
                        if (iU == 119) {
                            this.f7438i = false;
                            this.g = 1;
                            byte[] bArr = parsableByteArray2.f5667a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f7437h = 2;
                            break;
                        }
                        this.f7438i = iU == 11;
                    } else {
                        this.f7438i = parsableByteArray.u() == 11;
                    }
                }
            } else if (i18 == 1) {
                byte[] bArr2 = parsableByteArray2.f5667a;
                int iMin = Math.min(parsableByteArray.a(), 128 - this.f7437h);
                parsableByteArray.e(bArr2, this.f7437h, iMin);
                int i19 = this.f7437h + iMin;
                this.f7437h = i19;
                if (i19 == 128) {
                    ParsableBitArray parsableBitArray = this.f7433a;
                    parsableBitArray.m(0);
                    int iE = parsableBitArray.e();
                    parsableBitArray.o(40);
                    byte b3 = parsableBitArray.g(5) > 10;
                    parsableBitArray.m(iE);
                    int[] iArr = Ac3Util.d;
                    int[] iArr2 = Ac3Util.f6702b;
                    if (b3 == true) {
                        parsableBitArray.o(16);
                        int iG = parsableBitArray.g(2);
                        if (iG == 0) {
                            b2 = 0;
                        } else if (iG != 1) {
                            b2 = iG != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b2 = 1;
                        }
                        parsableBitArray.o(3);
                        iA = (parsableBitArray.g(11) + 1) * 2;
                        int iG2 = parsableBitArray.g(2);
                        if (iG2 == 3) {
                            i6 = Ac3Util.f6703c[parsableBitArray.g(2)];
                            i7 = 3;
                            i8 = 6;
                        } else {
                            int iG3 = parsableBitArray.g(2);
                            int i20 = Ac3Util.f6701a[iG3];
                            i6 = iArr2[iG2];
                            i7 = iG3;
                            i8 = i20;
                        }
                        i5 = i8 * 256;
                        int i21 = (iA * i6) / (i8 * 32);
                        int iG4 = parsableBitArray.g(3);
                        boolean zF = parsableBitArray.f();
                        i4 = iArr[iG4] + (zF ? 1 : 0);
                        parsableBitArray.o(10);
                        if (parsableBitArray.f()) {
                            parsableBitArray.o(8);
                        }
                        if (iG4 == 0) {
                            parsableBitArray.o(5);
                            if (parsableBitArray.f()) {
                                parsableBitArray.o(8);
                            }
                        }
                        if (b2 == 1 && parsableBitArray.f()) {
                            parsableBitArray.o(16);
                        }
                        if (parsableBitArray.f()) {
                            if (iG4 > 2) {
                                parsableBitArray.o(2);
                            }
                            if ((iG4 & 1) == 0 || iG4 <= 2) {
                                i13 = 6;
                            } else {
                                i13 = 6;
                                parsableBitArray.o(6);
                            }
                            if ((iG4 & 4) != 0) {
                                parsableBitArray.o(i13);
                            }
                            if (zF && parsableBitArray.f()) {
                                parsableBitArray.o(5);
                            }
                            if (b2 != 0) {
                                i9 = i7;
                            } else {
                                if (parsableBitArray.f()) {
                                    i14 = 6;
                                    parsableBitArray.o(6);
                                } else {
                                    i14 = 6;
                                }
                                if (iG4 == 0 && parsableBitArray.f()) {
                                    parsableBitArray.o(i14);
                                }
                                if (parsableBitArray.f()) {
                                    parsableBitArray.o(i14);
                                }
                                int iG5 = parsableBitArray.g(2);
                                if (iG5 == 1) {
                                    parsableBitArray.o(5);
                                    i16 = 2;
                                } else {
                                    if (iG5 == 2) {
                                        parsableBitArray.o(12);
                                    } else if (iG5 == 3) {
                                        int iG6 = parsableBitArray.g(5);
                                        if (parsableBitArray.f()) {
                                            parsableBitArray.o(5);
                                            if (parsableBitArray.f()) {
                                                i17 = 4;
                                                parsableBitArray.o(4);
                                            } else {
                                                i17 = 4;
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.o(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.o(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.o(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.o(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.o(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.o(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                if (parsableBitArray.f()) {
                                                    parsableBitArray.o(i17);
                                                }
                                                if (parsableBitArray.f()) {
                                                    parsableBitArray.o(i17);
                                                }
                                            }
                                        }
                                        if (parsableBitArray.f()) {
                                            parsableBitArray.o(5);
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.o(7);
                                                if (parsableBitArray.f()) {
                                                    i15 = 8;
                                                    parsableBitArray.o(8);
                                                } else {
                                                    i15 = 8;
                                                }
                                            } else {
                                                i15 = 8;
                                            }
                                        } else {
                                            i15 = 8;
                                        }
                                        i16 = 2;
                                        parsableBitArray.o((iG6 + 2) * i15);
                                        parsableBitArray.c();
                                    }
                                    i16 = 2;
                                }
                                if (iG4 < i16) {
                                    if (parsableBitArray.f()) {
                                        parsableBitArray.o(14);
                                    }
                                    if (iG4 == 0 && parsableBitArray.f()) {
                                        parsableBitArray.o(14);
                                    }
                                }
                                if (parsableBitArray.f()) {
                                    i9 = i7;
                                    if (i9 == 0) {
                                        parsableBitArray.o(5);
                                    } else {
                                        for (int i22 = 0; i22 < i8; i22++) {
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.o(5);
                                            }
                                        }
                                    }
                                } else {
                                    i9 = i7;
                                }
                            }
                        } else {
                            i9 = i7;
                        }
                        if (parsableBitArray.f()) {
                            parsableBitArray.o(5);
                            if (iG4 == 2) {
                                parsableBitArray.o(4);
                            }
                            if (iG4 >= 6) {
                                parsableBitArray.o(2);
                            }
                            if (parsableBitArray.f()) {
                                i12 = 8;
                                parsableBitArray.o(8);
                            } else {
                                i12 = 8;
                            }
                            if (iG4 == 0 && parsableBitArray.f()) {
                                parsableBitArray.o(i12);
                            }
                            i10 = 3;
                            if (iG2 < 3) {
                                parsableBitArray.n();
                            }
                        } else {
                            i10 = 3;
                        }
                        if (b2 == 0 && i9 != i10) {
                            parsableBitArray.n();
                        }
                        if (b2 == 2 && (i9 == i10 || parsableBitArray.f())) {
                            i11 = 6;
                            parsableBitArray.o(6);
                        } else {
                            i11 = 6;
                        }
                        str = (parsableBitArray.f() && parsableBitArray.g(i11) == 1 && parsableBitArray.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i2 = i21;
                    } else {
                        parsableBitArray.o(32);
                        int iG7 = parsableBitArray.g(2);
                        String str2 = iG7 == 3 ? null : "audio/ac3";
                        int iG8 = parsableBitArray.g(6);
                        i2 = Ac3Util.f6704e[iG8 / 2] * 1000;
                        iA = Ac3Util.a(iG7, iG8);
                        parsableBitArray.o(8);
                        int iG9 = parsableBitArray.g(3);
                        if ((iG9 & 1) == 0 || iG9 == 1) {
                            i3 = 2;
                        } else {
                            i3 = 2;
                            parsableBitArray.o(2);
                        }
                        if ((iG9 & 4) != 0) {
                            parsableBitArray.o(i3);
                        }
                        if (iG9 == i3) {
                            parsableBitArray.o(i3);
                        }
                        int i23 = iG7 < 3 ? iArr2[iG7] : -1;
                        i4 = iArr[iG9] + (parsableBitArray.f() ? 1 : 0);
                        String str3 = str2;
                        i5 = 1536;
                        str = str3;
                        i6 = i23;
                    }
                    Format format = this.k;
                    if (format == null || i4 != format.f5400A || i6 != format.f5401B || !Util.a(str, format.m)) {
                        Format.Builder builder = new Format.Builder();
                        builder.f5423a = this.f7436e;
                        builder.f5429l = MimeTypes.l(str);
                        builder.f5434z = i4;
                        builder.f5418A = i6;
                        builder.d = this.f7435c;
                        builder.f = this.d;
                        builder.f5427h = i2;
                        if ("audio/ac3".equals(str)) {
                            builder.g = i2;
                        }
                        Format format2 = new Format(builder);
                        this.k = format2;
                        this.f.b(format2);
                    }
                    this.f7439l = iA;
                    this.j = (((long) i5) * 1000000) / ((long) this.k.f5401B);
                    parsableByteArray2.G(0);
                    this.f.e(128, parsableByteArray2);
                    this.g = 2;
                }
            } else if (i18 == 2) {
                int iMin2 = Math.min(parsableByteArray.a(), this.f7439l - this.f7437h);
                this.f.e(iMin2, parsableByteArray);
                int i24 = this.f7437h + iMin2;
                this.f7437h = i24;
                if (i24 == this.f7439l) {
                    Assertions.e(this.m != -9223372036854775807L);
                    this.f.f(this.m, 1, this.f7439l, 0, null);
                    this.m += this.j;
                    this.g = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.m = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f7436e = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        this.f = extractorOutput.track(trackIdGenerator.d, 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.g = 0;
        this.f7437h = 0;
        this.f7438i = false;
        this.m = -9223372036854775807L;
    }

    public Ac3Reader(String str, int i2) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[128], 128);
        this.f7433a = parsableBitArray;
        this.f7434b = new ParsableByteArray(parsableBitArray.f5663a);
        this.g = 0;
        this.m = -9223372036854775807L;
        this.f7435c = str;
        this.d = i2;
    }
}
