package com.google.android.exoplayer2.extractor.ts;

import com.applovin.impl.Z;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* JADX INFO: loaded from: classes3.dex */
public final class PesReader implements TsPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ElementaryStreamReader f18039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableBitArray f18040b = new ParsableBitArray(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18041c = 0;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimestampAdjuster f18042e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18044i;
    public int j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18045l;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.f18039a = elementaryStreamReader;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f18042e = timestampAdjuster;
        this.f18039a.d(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void b(int i2, ParsableByteArray parsableByteArray) {
        int i3;
        int i4;
        int i5;
        int i6;
        Assertions.e(this.f18042e);
        int i7 = i2 & 1;
        ElementaryStreamReader elementaryStreamReader = this.f18039a;
        int i8 = -1;
        int i9 = 3;
        int i10 = 2;
        if (i7 != 0) {
            int i11 = this.f18041c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    Log.g("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        Log.g("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    elementaryStreamReader.packetFinished();
                }
            }
            this.f18041c = 1;
            this.d = 0;
        }
        int i12 = i2;
        while (parsableByteArray.a() > 0) {
            int i13 = this.f18041c;
            if (i13 != 0) {
                ParsableBitArray parsableBitArray = this.f18040b;
                if (i13 == 1) {
                    i4 = i9;
                    if (c(parsableByteArray, parsableBitArray.f18952a, 9)) {
                        parsableBitArray.l(0);
                        int iG = parsableBitArray.g(24);
                        if (iG != 1) {
                            Z.s(iG, "Unexpected start code prefix: ", "PesReader");
                            this.j = -1;
                            i6 = 0;
                            i3 = -1;
                            i5 = 2;
                        } else {
                            parsableBitArray.n(8);
                            int iG2 = parsableBitArray.g(16);
                            parsableBitArray.n(5);
                            this.k = parsableBitArray.f();
                            i5 = 2;
                            parsableBitArray.n(2);
                            this.f = parsableBitArray.f();
                            this.g = parsableBitArray.f();
                            parsableBitArray.n(6);
                            int iG3 = parsableBitArray.g(8);
                            this.f18044i = iG3;
                            if (iG2 == 0) {
                                this.j = -1;
                                i3 = -1;
                            } else {
                                int i14 = (iG2 - 3) - iG3;
                                this.j = i14;
                                if (i14 < 0) {
                                    Log.g("PesReader", "Found negative packet payload size: " + this.j);
                                    i3 = -1;
                                    this.j = -1;
                                } else {
                                    i3 = -1;
                                }
                            }
                            i6 = 2;
                        }
                        this.f18041c = i6;
                        this.d = 0;
                    } else {
                        i3 = -1;
                        i5 = 2;
                    }
                } else if (i13 == i10) {
                    if (c(parsableByteArray, parsableBitArray.f18952a, Math.min(10, this.f18044i)) && c(parsableByteArray, null, this.f18044i)) {
                        parsableBitArray.l(0);
                        this.f18045l = -9223372036854775807L;
                        if (this.f) {
                            parsableBitArray.n(4);
                            long jG = ((long) parsableBitArray.g(i9)) << 30;
                            parsableBitArray.n(1);
                            long jG2 = ((long) (parsableBitArray.g(15) << 15)) | jG;
                            parsableBitArray.n(1);
                            long jG3 = jG2 | ((long) parsableBitArray.g(15));
                            parsableBitArray.n(1);
                            if (!this.f18043h && this.g) {
                                parsableBitArray.n(4);
                                long jG4 = ((long) parsableBitArray.g(i9)) << 30;
                                parsableBitArray.n(1);
                                long jG5 = ((long) (parsableBitArray.g(15) << 15)) | jG4;
                                parsableBitArray.n(1);
                                long jG6 = jG5 | ((long) parsableBitArray.g(15));
                                parsableBitArray.n(1);
                                this.f18042e.b(jG6);
                                this.f18043h = true;
                            }
                            this.f18045l = this.f18042e.b(jG3);
                        }
                        i12 |= this.k ? 4 : 0;
                        elementaryStreamReader.c(i12, this.f18045l);
                        this.f18041c = 3;
                        this.d = 0;
                        i9 = 3;
                        i8 = -1;
                        i10 = 2;
                    } else {
                        i4 = i9;
                        i5 = i10;
                        i3 = -1;
                    }
                } else {
                    if (i13 != i9) {
                        throw new IllegalStateException();
                    }
                    int iA = parsableByteArray.a();
                    int i15 = this.j;
                    int i16 = i15 == i8 ? 0 : iA - i15;
                    if (i16 > 0) {
                        iA -= i16;
                        parsableByteArray.E(parsableByteArray.f18957b + iA);
                    }
                    elementaryStreamReader.b(parsableByteArray);
                    int i17 = this.j;
                    if (i17 != i8) {
                        int i18 = i17 - iA;
                        this.j = i18;
                        if (i18 == 0) {
                            elementaryStreamReader.packetFinished();
                            this.f18041c = 1;
                            this.d = 0;
                        }
                    }
                    int i19 = i9;
                    i3 = i8;
                    i4 = i19;
                    i5 = i10;
                }
            } else {
                int i20 = i9;
                i3 = i8;
                i4 = i20;
                i5 = i10;
                parsableByteArray.G(parsableByteArray.a());
            }
            int i21 = i3;
            i9 = i4;
            i8 = i21;
            i10 = i5;
        }
    }

    public final boolean c(ParsableByteArray parsableByteArray, byte[] bArr, int i2) {
        int iMin = Math.min(parsableByteArray.a(), i2 - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.G(iMin);
        } else {
            parsableByteArray.e(bArr, this.d, iMin);
        }
        int i3 = this.d + iMin;
        this.d = i3;
        return i3 == i2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void seek() {
        this.f18041c = 0;
        this.d = 0;
        this.f18043h = false;
        this.f18039a.seek();
    }
}
