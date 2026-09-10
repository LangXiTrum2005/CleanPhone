package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class Ac3Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableBitArray f17897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17899c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TrackOutput f17900e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17902i;
    public Format j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17903l;

    public Ac3Reader(String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[128], 128);
        this.f17897a = parsableBitArray;
        this.f17898b = new ParsableByteArray(parsableBitArray.f18952a);
        this.f = 0;
        this.f17903l = -9223372036854775807L;
        this.f17899c = str;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0209  */
    /* JADX WARN: Code duplicated, block: B:148:0x024b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void b(ParsableByteArray parsableByteArray) {
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
        Assertions.e(this.f17900e);
        while (parsableByteArray.a() > 0) {
            int i18 = this.f;
            ParsableByteArray parsableByteArray2 = this.f17898b;
            if (i18 == 0) {
                while (parsableByteArray.a() > 0) {
                    if (this.f17901h) {
                        int iU = parsableByteArray.u();
                        if (iU == 119) {
                            this.f17901h = false;
                            this.f = 1;
                            byte[] bArr = parsableByteArray2.f18956a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.g = 2;
                            break;
                        }
                        this.f17901h = iU == 11;
                    } else {
                        this.f17901h = parsableByteArray.u() == 11;
                    }
                }
            } else if (i18 == 1) {
                byte[] bArr2 = parsableByteArray2.f18956a;
                int iMin = Math.min(parsableByteArray.a(), 128 - this.g);
                parsableByteArray.e(bArr2, this.g, iMin);
                int i19 = this.g + iMin;
                this.g = i19;
                if (i19 == 128) {
                    ParsableBitArray parsableBitArray = this.f17897a;
                    parsableBitArray.l(0);
                    int iE = parsableBitArray.e();
                    parsableBitArray.n(40);
                    byte b3 = parsableBitArray.g(5) > 10;
                    parsableBitArray.l(iE);
                    int[] iArr = Ac3Util.d;
                    int[] iArr2 = Ac3Util.f17272b;
                    if (b3 == true) {
                        parsableBitArray.n(16);
                        int iG = parsableBitArray.g(2);
                        if (iG == 0) {
                            b2 = 0;
                        } else if (iG != 1) {
                            b2 = iG != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b2 = 1;
                        }
                        parsableBitArray.n(3);
                        iA = (parsableBitArray.g(11) + 1) * 2;
                        int iG2 = parsableBitArray.g(2);
                        if (iG2 == 3) {
                            i6 = Ac3Util.f17273c[parsableBitArray.g(2)];
                            i7 = 3;
                            i8 = 6;
                        } else {
                            int iG3 = parsableBitArray.g(2);
                            int i20 = Ac3Util.f17271a[iG3];
                            i6 = iArr2[iG2];
                            i7 = iG3;
                            i8 = i20;
                        }
                        i5 = i8 * 256;
                        int i21 = (iA * i6) / (i8 * 32);
                        int iG4 = parsableBitArray.g(3);
                        boolean zF = parsableBitArray.f();
                        i4 = iArr[iG4] + (zF ? 1 : 0);
                        parsableBitArray.n(10);
                        if (parsableBitArray.f()) {
                            parsableBitArray.n(8);
                        }
                        if (iG4 == 0) {
                            parsableBitArray.n(5);
                            if (parsableBitArray.f()) {
                                parsableBitArray.n(8);
                            }
                        }
                        if (b2 == 1 && parsableBitArray.f()) {
                            parsableBitArray.n(16);
                        }
                        if (parsableBitArray.f()) {
                            if (iG4 > 2) {
                                parsableBitArray.n(2);
                            }
                            if ((iG4 & 1) == 0 || iG4 <= 2) {
                                i13 = 6;
                            } else {
                                i13 = 6;
                                parsableBitArray.n(6);
                            }
                            if ((iG4 & 4) != 0) {
                                parsableBitArray.n(i13);
                            }
                            if (zF && parsableBitArray.f()) {
                                parsableBitArray.n(5);
                            }
                            if (b2 != 0) {
                                i9 = i7;
                            } else {
                                if (parsableBitArray.f()) {
                                    i14 = 6;
                                    parsableBitArray.n(6);
                                } else {
                                    i14 = 6;
                                }
                                if (iG4 == 0 && parsableBitArray.f()) {
                                    parsableBitArray.n(i14);
                                }
                                if (parsableBitArray.f()) {
                                    parsableBitArray.n(i14);
                                }
                                int iG5 = parsableBitArray.g(2);
                                if (iG5 == 1) {
                                    parsableBitArray.n(5);
                                    i16 = 2;
                                } else {
                                    if (iG5 == 2) {
                                        parsableBitArray.n(12);
                                    } else if (iG5 == 3) {
                                        int iG6 = parsableBitArray.g(5);
                                        if (parsableBitArray.f()) {
                                            parsableBitArray.n(5);
                                            if (parsableBitArray.f()) {
                                                i17 = 4;
                                                parsableBitArray.n(4);
                                            } else {
                                                i17 = 4;
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.n(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.n(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.n(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.n(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.n(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.n(i17);
                                            }
                                            if (parsableBitArray.f()) {
                                                if (parsableBitArray.f()) {
                                                    parsableBitArray.n(i17);
                                                }
                                                if (parsableBitArray.f()) {
                                                    parsableBitArray.n(i17);
                                                }
                                            }
                                        }
                                        if (parsableBitArray.f()) {
                                            parsableBitArray.n(5);
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.n(7);
                                                if (parsableBitArray.f()) {
                                                    i15 = 8;
                                                    parsableBitArray.n(8);
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
                                        parsableBitArray.n((iG6 + 2) * i15);
                                        parsableBitArray.c();
                                    }
                                    i16 = 2;
                                }
                                if (iG4 < i16) {
                                    if (parsableBitArray.f()) {
                                        parsableBitArray.n(14);
                                    }
                                    if (iG4 == 0 && parsableBitArray.f()) {
                                        parsableBitArray.n(14);
                                    }
                                }
                                if (parsableBitArray.f()) {
                                    i9 = i7;
                                    if (i9 == 0) {
                                        parsableBitArray.n(5);
                                    } else {
                                        for (int i22 = 0; i22 < i8; i22++) {
                                            if (parsableBitArray.f()) {
                                                parsableBitArray.n(5);
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
                            parsableBitArray.n(5);
                            if (iG4 == 2) {
                                parsableBitArray.n(4);
                            }
                            if (iG4 >= 6) {
                                parsableBitArray.n(2);
                            }
                            if (parsableBitArray.f()) {
                                i12 = 8;
                                parsableBitArray.n(8);
                            } else {
                                i12 = 8;
                            }
                            if (iG4 == 0 && parsableBitArray.f()) {
                                parsableBitArray.n(i12);
                            }
                            i10 = 3;
                            if (iG2 < 3) {
                                parsableBitArray.m();
                            }
                        } else {
                            i10 = 3;
                        }
                        if (b2 == 0 && i9 != i10) {
                            parsableBitArray.m();
                        }
                        if (b2 == 2 && (i9 == i10 || parsableBitArray.f())) {
                            i11 = 6;
                            parsableBitArray.n(6);
                        } else {
                            i11 = 6;
                        }
                        str = (parsableBitArray.f() && parsableBitArray.g(i11) == 1 && parsableBitArray.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i2 = i21;
                    } else {
                        parsableBitArray.n(32);
                        int iG7 = parsableBitArray.g(2);
                        String str2 = iG7 == 3 ? null : "audio/ac3";
                        int iG8 = parsableBitArray.g(6);
                        i2 = Ac3Util.f17274e[iG8 / 2] * 1000;
                        iA = Ac3Util.a(iG7, iG8);
                        parsableBitArray.n(8);
                        int iG9 = parsableBitArray.g(3);
                        if ((iG9 & 1) == 0 || iG9 == 1) {
                            i3 = 2;
                        } else {
                            i3 = 2;
                            parsableBitArray.n(2);
                        }
                        if ((iG9 & 4) != 0) {
                            parsableBitArray.n(i3);
                        }
                        if (iG9 == i3) {
                            parsableBitArray.n(i3);
                        }
                        int i23 = iG7 < 3 ? iArr2[iG7] : -1;
                        i4 = iArr[iG9] + (parsableBitArray.f() ? 1 : 0);
                        String str3 = str2;
                        i5 = 1536;
                        str = str3;
                        i6 = i23;
                    }
                    Format format = this.j;
                    if (format == null || i4 != format.z0 || i6 != format.A0 || !Util.a(str, format.m0)) {
                        Format.Builder builder = new Format.Builder();
                        builder.f17081a = this.d;
                        builder.k = str;
                        builder.x = i4;
                        builder.y = i6;
                        builder.f17083c = this.f17899c;
                        builder.g = i2;
                        if ("audio/ac3".equals(str)) {
                            builder.f = i2;
                        }
                        Format format2 = new Format(builder);
                        this.j = format2;
                        this.f17900e.c(format2);
                    }
                    this.k = iA;
                    this.f17902i = (((long) i5) * 1000000) / ((long) this.j.A0);
                    parsableByteArray2.F(0);
                    this.f17900e.e(128, parsableByteArray2);
                    this.f = 2;
                }
            } else if (i18 == 2) {
                int iMin2 = Math.min(parsableByteArray.a(), this.k - this.g);
                this.f17900e.e(iMin2, parsableByteArray);
                int i24 = this.g + iMin2;
                this.g = i24;
                int i25 = this.k;
                if (i24 == i25) {
                    long j = this.f17903l;
                    if (j != -9223372036854775807L) {
                        this.f17900e.f(j, 1, i25, 0, null);
                        this.f17903l += this.f17902i;
                    }
                    this.f = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if (j != -9223372036854775807L) {
            this.f17903l = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.d = trackIdGenerator.f18100e;
        trackIdGenerator.b();
        this.f17900e = extractorOutput.track(trackIdGenerator.d, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f = 0;
        this.g = 0;
        this.f17901h = false;
        this.f17903l = -9223372036854775807L;
    }
}
