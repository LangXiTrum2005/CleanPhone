package com.google.android.exoplayer2.extractor.mp3;

import android.support.v4.media.a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.Id3Peeker;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class Mp3Extractor implements Extractor {
    public static final /* synthetic */ int s = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DummyTrackOutput f17737e;
    public ExtractorOutput f;
    public TrackOutput g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TrackOutput f17738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17739i;
    public Metadata j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17740l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17741n;
    public Seeker o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17742p;
    public boolean q;
    public long r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f17734a = new ParsableByteArray(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MpegAudioUtil.Header f17735b = new MpegAudioUtil.Header();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GaplessInfoHolder f17736c = new GaplessInfoHolder();
    public long k = -9223372036854775807L;
    public final Id3Peeker d = new Id3Peeker();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp3Extractor() {
        DummyTrackOutput dummyTrackOutput = new DummyTrackOutput();
        this.f17737e = dummyTrackOutput;
        this.f17738h = dummyTrackOutput;
    }

    public final ConstantBitrateSeeker a(DefaultExtractorInput defaultExtractorInput, boolean z2) {
        ParsableByteArray parsableByteArray = this.f17734a;
        defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 4, false);
        parsableByteArray.F(0);
        int iG = parsableByteArray.g();
        MpegAudioUtil.Header header = this.f17735b;
        header.a(iG);
        return new ConstantBitrateSeeker(defaultExtractorInput.f17527c, defaultExtractorInput.d, header.f, header.f17387c, z2);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) {
        return f((DefaultExtractorInput) extractorInput, true);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x023b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0241  */
    /* JADX WARN: Code duplicated, block: B:110:0x024b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0251  */
    /* JADX WARN: Code duplicated, block: B:114:0x0257  */
    /* JADX WARN: Code duplicated, block: B:118:0x027c A[EDGE_INSN: B:118:0x027c->B:119:0x0283 BREAK  A[LOOP:1: B:111:0x024f->B:117:0x0277]] */
    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:121:0x0298 A[LOOP:2: B:120:0x0296->B:121:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x02cc A[LOOP:0: B:105:0x023f->B:123:0x02cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x02d2 A[EDGE_INSN: B:124:0x02d2->B:125:0x02d4 BREAK  A[LOOP:0: B:105:0x023f->B:123:0x02cc]] */
    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:137:0x0331  */
    /* JADX WARN: Code duplicated, block: B:139:0x033f  */
    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0349  */
    /* JADX WARN: Code duplicated, block: B:144:0x0356  */
    /* JADX WARN: Code duplicated, block: B:147:0x0369  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:170:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:171:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:174:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:184:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:66:0x015a A[PHI: r32
  0x015a: PHI (r32v10 com.google.android.exoplayer2.extractor.mp3.Seeker) = 
  (r32v1 com.google.android.exoplayer2.extractor.mp3.Seeker)
  (r32v1 com.google.android.exoplayer2.extractor.mp3.Seeker)
  (r32v1 com.google.android.exoplayer2.extractor.mp3.Seeker)
  (r32v13 com.google.android.exoplayer2.extractor.mp3.Seeker)
 binds: [B:97:0x0220, B:99:0x0226, B:100:0x0228, B:65:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:94:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0217  */
    /* JADX WARN: Code duplicated, block: B:98:0x0222  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws Throwable {
        Mp3Extractor mp3Extractor;
        int i2;
        int i3;
        long j;
        Seeker seeker;
        ParsableByteArray parsableByteArray;
        Throwable th;
        long j2;
        long j3;
        int iD;
        int i4;
        DefaultExtractorInput defaultExtractorInput;
        int iG;
        ParsableByteArray parsableByteArray2;
        int i5;
        int iG2;
        GaplessInfoHolder gaplessInfoHolder;
        DefaultExtractorInput defaultExtractorInput2;
        int iG3;
        Seeker seekerA;
        int i6;
        int i7;
        int iX;
        Metadata metadata;
        DefaultExtractorInput defaultExtractorInput3;
        long j4;
        MlltSeeker mlltSeeker;
        Seeker seekerA2;
        Metadata.Entry[] entryArr;
        int length;
        int i8;
        Metadata.Entry entry;
        MlltFrame mlltFrame;
        int i9;
        long jB;
        int length2;
        long[] jArr;
        long[] jArr2;
        long j5;
        int i10;
        Metadata.Entry[] entryArr2;
        int length3;
        int i11;
        Metadata.Entry entry2;
        TextInformationFrame textInformationFrame;
        DefaultExtractorInput defaultExtractorInput4;
        int iU;
        Assertions.e(this.g);
        int i12 = Util.f18979a;
        int i13 = this.f17739i;
        MpegAudioUtil.Header header = this.f17735b;
        if (i13 == 0) {
            try {
                f((DefaultExtractorInput) extractorInput, false);
                seeker = this.o;
                parsableByteArray = this.f17734a;
                if (seeker == null) {
                    th = null;
                    parsableByteArray2 = new ParsableByteArray(header.f17387c);
                    j = 1000000;
                    ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray2.f18956a, 0, header.f17387c, false);
                    i5 = 21;
                    if ((header.f17385a & 1) != 0) {
                        if (header.f17388e != 1) {
                            i5 = 36;
                        }
                    } else if (header.f17388e == 1) {
                        i5 = 13;
                    }
                    if (parsableByteArray2.f18958c >= i5 + 4) {
                        parsableByteArray2.F(i5);
                        iG2 = parsableByteArray2.g();
                        if (iG2 != 1483304551 && iG2 != 1231971951) {
                            if (parsableByteArray2.f18958c >= 40) {
                                parsableByteArray2.F(36);
                                if (parsableByteArray2.g() == 1447187017) {
                                    iG2 = 1447187017;
                                } else {
                                    iG2 = 0;
                                }
                            } else {
                                iG2 = 0;
                            }
                        }
                    } else if (parsableByteArray2.f18958c >= 40) {
                        parsableByteArray2.F(36);
                        if (parsableByteArray2.g() == 1447187017) {
                            iG2 = 1447187017;
                        } else {
                            iG2 = 0;
                        }
                    } else {
                        iG2 = 0;
                    }
                    gaplessInfoHolder = this.f17736c;
                    if (iG2 != 1483304551 || iG2 == 1231971951) {
                        defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                        long j6 = defaultExtractorInput2.d;
                        int i14 = header.g;
                        int i15 = header.d;
                        iG3 = parsableByteArray2.g();
                        if ((iG3 & 1) == 1 || (iX = parsableByteArray2.x()) == 0) {
                            seekerA = null;
                        } else {
                            long jF = Util.F(iX, ((long) i14) * 1000000, i15);
                            if ((iG3 & 6) != 6) {
                                seekerA = new XingSeeker(j6, header.f17387c, jF, -1L, null);
                            } else {
                                long jV = parsableByteArray2.v();
                                long[] jArr3 = new long[100];
                                for (int i16 = 0; i16 < 100; i16++) {
                                    jArr3[i16] = parsableByteArray2.u();
                                }
                                long j7 = defaultExtractorInput2.f17527c;
                                if (j7 != -1) {
                                    long j8 = j6 + jV;
                                    if (j7 != j8) {
                                        StringBuilder sbV = a.v(j7, "XING data size mismatch: ", ", ");
                                        sbV.append(j8);
                                        Log.g("XingSeeker", sbV.toString());
                                    }
                                }
                                seekerA = new XingSeeker(j6, header.f17387c, jF, jV, jArr3);
                            }
                        }
                        if (seekerA != null && (gaplessInfoHolder.f17548a == -1 || gaplessInfoHolder.f17549b == -1)) {
                            defaultExtractorInput2.f = 0;
                            defaultExtractorInput2.c(i5 + 141, false);
                            defaultExtractorInput2.peekFully(parsableByteArray.f18956a, 0, 3, false);
                            parsableByteArray.F(0);
                            int iW = parsableByteArray.w();
                            i6 = iW >> 12;
                            i7 = iW & 4095;
                            if (i6 <= 0 || i7 > 0) {
                                gaplessInfoHolder.f17548a = i6;
                                gaplessInfoHolder.f17549b = i7;
                            }
                        }
                        defaultExtractorInput2.skipFully(header.f17387c);
                        if (seekerA == null && !seekerA.isSeekable() && iG2 == 1231971951) {
                            mp3Extractor = this;
                            seekerA = mp3Extractor.a(defaultExtractorInput2, false);
                        } else {
                            mp3Extractor = this;
                        }
                    } else if (iG2 == 1447187017) {
                        DefaultExtractorInput defaultExtractorInput5 = (DefaultExtractorInput) extractorInput;
                        long j9 = defaultExtractorInput5.d;
                        parsableByteArray2.G(10);
                        int iG4 = parsableByteArray2.g();
                        if (iG4 <= 0) {
                            seekerA = null;
                            defaultExtractorInput4 = defaultExtractorInput5;
                            break;
                        }
                        int i17 = header.d;
                        long jF2 = Util.F(iG4, ((long) (i17 >= 32000 ? 1152 : 576)) * 1000000, i17);
                        int iZ = parsableByteArray2.z();
                        int iZ2 = parsableByteArray2.z();
                        int iZ3 = parsableByteArray2.z();
                        parsableByteArray2.G(2);
                        long j10 = j9 + ((long) header.f17387c);
                        long[] jArr4 = new long[iZ];
                        long[] jArr5 = new long[iZ];
                        long j11 = j9;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= iZ) {
                                defaultExtractorInput4 = defaultExtractorInput5;
                                long j12 = defaultExtractorInput4.f17527c;
                                if (j12 != -1 && j12 != j11) {
                                    StringBuilder sbV2 = a.v(j12, "VBRI data size mismatch: ", ", ");
                                    sbV2.append(j11);
                                    Log.g("VbriSeeker", sbV2.toString());
                                }
                                seekerA = new VbriSeeker(jArr4, jArr5, jF2, j11);
                                break;
                            }
                            jArr4[i18] = (((long) i18) * jF2) / ((long) iZ);
                            jArr5[i18] = Math.max(j11, j10);
                            if (iZ3 == 1) {
                                iU = parsableByteArray2.u();
                            } else if (iZ3 == 2) {
                                iU = parsableByteArray2.z();
                            } else if (iZ3 == 3) {
                                iU = parsableByteArray2.w();
                            } else {
                                if (iZ3 != 4) {
                                    seekerA = null;
                                    defaultExtractorInput4 = defaultExtractorInput5;
                                    break;
                                }
                                iU = parsableByteArray2.x();
                            }
                            j11 += ((long) iU) * ((long) iZ2);
                            i18++;
                            defaultExtractorInput5 = defaultExtractorInput5;
                        }
                        defaultExtractorInput4.skipFully(header.f17387c);
                        mp3Extractor = this;
                    } else {
                        ((DefaultExtractorInput) extractorInput).f = 0;
                        mp3Extractor = this;
                        seekerA = null;
                    }
                    metadata = mp3Extractor.j;
                    defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
                    j4 = defaultExtractorInput3.d;
                    if (metadata != null) {
                        mlltSeeker = null;
                        break;
                    }
                    entryArr = metadata.X;
                    length = entryArr.length;
                    i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            mlltSeeker = null;
                            break;
                        }
                        entry = entryArr[i8];
                        if (entry instanceof MlltFrame) {
                            mlltFrame = (MlltFrame) entry;
                            if (metadata != null) {
                                i9 = 1;
                                jB = -9223372036854775807L;
                                break;
                            }
                            entryArr2 = metadata.X;
                            length3 = entryArr2.length;
                            i11 = 0;
                            while (true) {
                                if (i11 < length3) {
                                    i9 = 1;
                                    jB = -9223372036854775807L;
                                    break;
                                }
                                entry2 = entryArr2[i11];
                                if (entry2 instanceof TextInformationFrame) {
                                    textInformationFrame = (TextInformationFrame) entry2;
                                    if (textInformationFrame.X.equals("TLEN")) {
                                        jB = Util.B(Long.parseLong((String) textInformationFrame.Z.get(0)));
                                        i9 = 1;
                                        break;
                                    }
                                }
                                i11++;
                            }
                            length2 = mlltFrame.f0.length;
                            int i19 = length2 + 1;
                            jArr = new long[i19];
                            jArr2 = new long[i19];
                            jArr[0] = j4;
                            jArr2[0] = 0;
                            j5 = 0;
                            i10 = i9;
                            while (i10 <= length2) {
                                int i20 = i10 - 1;
                                long j13 = j4 + ((long) (mlltFrame.Z + mlltFrame.f0[i20]));
                                j5 += (long) (mlltFrame.e0 + mlltFrame.g0[i20]);
                                jArr[i10] = j13;
                                jArr2[i10] = j5;
                                i10++;
                                j4 = j13;
                                length2 = length2;
                            }
                            mlltSeeker = new MlltSeeker(jArr, jArr2, jB);
                            break;
                        }
                        i8++;
                    }
                    if (mp3Extractor.f17742p) {
                        seekerA2 = new Seeker.UnseekableSeeker(-9223372036854775807L);
                    } else {
                        if (mlltSeeker != null) {
                            seekerA = mlltSeeker;
                        } else if (seekerA == null) {
                            seekerA = null;
                        }
                        if (seekerA != null) {
                            seekerA.isSeekable();
                            seekerA2 = seekerA;
                        } else {
                            seekerA2 = mp3Extractor.a(defaultExtractorInput3, false);
                        }
                    }
                    mp3Extractor.o = seekerA2;
                    mp3Extractor.f.g(seekerA2);
                    TrackOutput trackOutput = mp3Extractor.f17738h;
                    Format.Builder builder = new Format.Builder();
                    builder.k = header.f17386b;
                    builder.f17087l = 4096;
                    builder.x = header.f17388e;
                    builder.y = header.d;
                    builder.f17077A = gaplessInfoHolder.f17548a;
                    builder.f17078B = gaplessInfoHolder.f17549b;
                    builder.f17086i = mp3Extractor.j;
                    trackOutput.c(new Format(builder));
                    mp3Extractor.m = defaultExtractorInput3.d;
                } else {
                    mp3Extractor = this;
                    th = null;
                    j = 1000000;
                    j2 = mp3Extractor.m;
                    if (j2 != 0) {
                        j3 = ((DefaultExtractorInput) extractorInput).d;
                        if (j3 < j2) {
                            ((DefaultExtractorInput) extractorInput).skipFully((int) (j2 - j3));
                        }
                    }
                }
                if (mp3Extractor.f17741n == 0) {
                    ((DefaultExtractorInput) extractorInput).f = 0;
                    defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                    if (mp3Extractor.e(defaultExtractorInput)) {
                        i2 = -1;
                        i3 = -1;
                    } else {
                        parsableByteArray.F(0);
                        iG = parsableByteArray.g();
                        if (((-128000) & iG) == (((long) mp3Extractor.f17739i) & (-128000)) || MpegAudioUtil.a(iG) == -1) {
                            defaultExtractorInput.skipFully(1);
                            mp3Extractor.f17739i = 0;
                        } else {
                            header.a(iG);
                            if (mp3Extractor.k == -9223372036854775807L) {
                                mp3Extractor.k = mp3Extractor.o.getTimeUs(defaultExtractorInput.d);
                            }
                            mp3Extractor.f17741n = header.f17387c;
                            Seeker seeker2 = mp3Extractor.o;
                            if (seeker2 instanceof IndexSeeker) {
                                IndexSeeker indexSeeker = (IndexSeeker) seeker2;
                                long j14 = (((mp3Extractor.f17740l + ((long) header.g)) * j) / ((long) header.d)) + mp3Extractor.k;
                                long j15 = defaultExtractorInput.d;
                                if (!indexSeeker.b(j14)) {
                                    throw th;
                                }
                                if (mp3Extractor.q && indexSeeker.b(mp3Extractor.r)) {
                                    mp3Extractor.q = false;
                                    mp3Extractor.f17738h = mp3Extractor.g;
                                }
                            }
                            iD = mp3Extractor.f17738h.d(extractorInput, mp3Extractor.f17741n, true);
                            if (iD == -1) {
                                i2 = -1;
                                i3 = -1;
                            } else {
                                i4 = mp3Extractor.f17741n - iD;
                                mp3Extractor.f17741n = i4;
                                if (i4 <= 0) {
                                    mp3Extractor.f17738h.f(((mp3Extractor.f17740l * j) / ((long) header.d)) + mp3Extractor.k, 1, header.f17387c, 0, null);
                                    mp3Extractor.f17740l += (long) header.g;
                                    mp3Extractor.f17741n = 0;
                                    i3 = 0;
                                    i2 = -1;
                                }
                            }
                        }
                        i2 = -1;
                        i3 = 0;
                    }
                } else {
                    iD = mp3Extractor.f17738h.d(extractorInput, mp3Extractor.f17741n, true);
                    if (iD == -1) {
                        i2 = -1;
                        i3 = -1;
                    } else {
                        i4 = mp3Extractor.f17741n - iD;
                        mp3Extractor.f17741n = i4;
                        if (i4 <= 0) {
                            i2 = -1;
                            i3 = 0;
                        } else {
                            mp3Extractor.f17738h.f(((mp3Extractor.f17740l * j) / ((long) header.d)) + mp3Extractor.k, 1, header.f17387c, 0, null);
                            mp3Extractor.f17740l += (long) header.g;
                            mp3Extractor.f17741n = 0;
                            i3 = 0;
                            i2 = -1;
                        }
                    }
                }
            } catch (EOFException unused) {
                mp3Extractor = this;
                i2 = -1;
                i3 = -1;
                j = 1000000;
            }
        } else {
            seeker = this.o;
            parsableByteArray = this.f17734a;
            if (seeker == null) {
                th = null;
                parsableByteArray2 = new ParsableByteArray(header.f17387c);
                j = 1000000;
                ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray2.f18956a, 0, header.f17387c, false);
                i5 = 21;
                if ((header.f17385a & 1) != 0) {
                    if (header.f17388e != 1) {
                        i5 = 36;
                    }
                } else if (header.f17388e == 1) {
                    i5 = 13;
                }
                if (parsableByteArray2.f18958c >= i5 + 4) {
                    parsableByteArray2.F(i5);
                    iG2 = parsableByteArray2.g();
                    if (iG2 != 1483304551) {
                        if (parsableByteArray2.f18958c >= 40) {
                            parsableByteArray2.F(36);
                            if (parsableByteArray2.g() == 1447187017) {
                                iG2 = 1447187017;
                            } else {
                                iG2 = 0;
                            }
                        } else {
                            iG2 = 0;
                        }
                    }
                } else if (parsableByteArray2.f18958c >= 40) {
                    parsableByteArray2.F(36);
                    if (parsableByteArray2.g() == 1447187017) {
                        iG2 = 1447187017;
                    } else {
                        iG2 = 0;
                    }
                } else {
                    iG2 = 0;
                }
                gaplessInfoHolder = this.f17736c;
                if (iG2 != 1483304551) {
                    defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                    long j16 = defaultExtractorInput2.d;
                    int i110 = header.g;
                    int i111 = header.d;
                    iG3 = parsableByteArray2.g();
                    if ((iG3 & 1) == 1) {
                        seekerA = null;
                    } else {
                        seekerA = null;
                    }
                    if (seekerA != null) {
                        defaultExtractorInput2.f = 0;
                        defaultExtractorInput2.c(i5 + 141, false);
                        defaultExtractorInput2.peekFully(parsableByteArray.f18956a, 0, 3, false);
                        parsableByteArray.F(0);
                        int iW2 = parsableByteArray.w();
                        i6 = iW2 >> 12;
                        i7 = iW2 & 4095;
                        if (i6 <= 0) {
                            gaplessInfoHolder.f17548a = i6;
                            gaplessInfoHolder.f17549b = i7;
                        } else {
                            gaplessInfoHolder.f17548a = i6;
                            gaplessInfoHolder.f17549b = i7;
                        }
                    }
                    defaultExtractorInput2.skipFully(header.f17387c);
                    if (seekerA == null) {
                        mp3Extractor = this;
                    } else {
                        mp3Extractor = this;
                    }
                } else {
                    defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                    long j17 = defaultExtractorInput2.d;
                    int i112 = header.g;
                    int i113 = header.d;
                    iG3 = parsableByteArray2.g();
                    if ((iG3 & 1) == 1) {
                        seekerA = null;
                    } else {
                        seekerA = null;
                    }
                    if (seekerA != null) {
                        defaultExtractorInput2.f = 0;
                        defaultExtractorInput2.c(i5 + 141, false);
                        defaultExtractorInput2.peekFully(parsableByteArray.f18956a, 0, 3, false);
                        parsableByteArray.F(0);
                        int iW3 = parsableByteArray.w();
                        i6 = iW3 >> 12;
                        i7 = iW3 & 4095;
                        if (i6 <= 0) {
                            gaplessInfoHolder.f17548a = i6;
                            gaplessInfoHolder.f17549b = i7;
                        } else {
                            gaplessInfoHolder.f17548a = i6;
                            gaplessInfoHolder.f17549b = i7;
                        }
                    }
                    defaultExtractorInput2.skipFully(header.f17387c);
                    if (seekerA == null) {
                        mp3Extractor = this;
                    } else {
                        mp3Extractor = this;
                    }
                }
                metadata = mp3Extractor.j;
                defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
                j4 = defaultExtractorInput3.d;
                if (metadata != null) {
                    mlltSeeker = null;
                    break;
                }
                entryArr = metadata.X;
                length = entryArr.length;
                i8 = 0;
                while (true) {
                    if (i8 < length) {
                        mlltSeeker = null;
                        break;
                    }
                    entry = entryArr[i8];
                    if (entry instanceof MlltFrame) {
                        mlltFrame = (MlltFrame) entry;
                        if (metadata != null) {
                            i9 = 1;
                            jB = -9223372036854775807L;
                            break;
                        }
                        entryArr2 = metadata.X;
                        length3 = entryArr2.length;
                        i11 = 0;
                        while (true) {
                            if (i11 < length3) {
                                i9 = 1;
                                jB = -9223372036854775807L;
                                break;
                            }
                            entry2 = entryArr2[i11];
                            if (entry2 instanceof TextInformationFrame) {
                                textInformationFrame = (TextInformationFrame) entry2;
                                if (textInformationFrame.X.equals("TLEN")) {
                                    jB = Util.B(Long.parseLong((String) textInformationFrame.Z.get(0)));
                                    i9 = 1;
                                    break;
                                }
                            }
                            i11++;
                        }
                        length2 = mlltFrame.f0.length;
                        int i114 = length2 + 1;
                        jArr = new long[i114];
                        jArr2 = new long[i114];
                        jArr[0] = j4;
                        jArr2[0] = 0;
                        j5 = 0;
                        i10 = i9;
                        while (i10 <= length2) {
                            int i21 = i10 - 1;
                            long j18 = j4 + ((long) (mlltFrame.Z + mlltFrame.f0[i21]));
                            j5 += (long) (mlltFrame.e0 + mlltFrame.g0[i21]);
                            jArr[i10] = j18;
                            jArr2[i10] = j5;
                            i10++;
                            j4 = j18;
                            length2 = length2;
                        }
                        mlltSeeker = new MlltSeeker(jArr, jArr2, jB);
                        break;
                    }
                    i8++;
                }
                if (mp3Extractor.f17742p) {
                    seekerA2 = new Seeker.UnseekableSeeker(-9223372036854775807L);
                } else {
                    if (mlltSeeker != null) {
                        seekerA = mlltSeeker;
                    } else if (seekerA == null) {
                        seekerA = null;
                    }
                    if (seekerA != null) {
                        seekerA.isSeekable();
                        seekerA2 = seekerA;
                    } else {
                        seekerA2 = mp3Extractor.a(defaultExtractorInput3, false);
                    }
                }
                mp3Extractor.o = seekerA2;
                mp3Extractor.f.g(seekerA2);
                TrackOutput trackOutput2 = mp3Extractor.f17738h;
                Format.Builder builder2 = new Format.Builder();
                builder2.k = header.f17386b;
                builder2.f17087l = 4096;
                builder2.x = header.f17388e;
                builder2.y = header.d;
                builder2.f17077A = gaplessInfoHolder.f17548a;
                builder2.f17078B = gaplessInfoHolder.f17549b;
                builder2.f17086i = mp3Extractor.j;
                trackOutput2.c(new Format(builder2));
                mp3Extractor.m = defaultExtractorInput3.d;
            } else {
                mp3Extractor = this;
                th = null;
                j = 1000000;
                j2 = mp3Extractor.m;
                if (j2 != 0) {
                    j3 = ((DefaultExtractorInput) extractorInput).d;
                    if (j3 < j2) {
                        ((DefaultExtractorInput) extractorInput).skipFully((int) (j2 - j3));
                    }
                }
            }
            if (mp3Extractor.f17741n == 0) {
                ((DefaultExtractorInput) extractorInput).f = 0;
                defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                if (mp3Extractor.e(defaultExtractorInput)) {
                    i2 = -1;
                    i3 = -1;
                } else {
                    parsableByteArray.F(0);
                    iG = parsableByteArray.g();
                    if (((-128000) & iG) == (((long) mp3Extractor.f17739i) & (-128000))) {
                    }
                    defaultExtractorInput.skipFully(1);
                    mp3Extractor.f17739i = 0;
                    i2 = -1;
                    i3 = 0;
                }
            } else {
                iD = mp3Extractor.f17738h.d(extractorInput, mp3Extractor.f17741n, true);
                if (iD == -1) {
                    i2 = -1;
                    i3 = -1;
                } else {
                    i4 = mp3Extractor.f17741n - iD;
                    mp3Extractor.f17741n = i4;
                    if (i4 <= 0) {
                        i2 = -1;
                        i3 = 0;
                    } else {
                        mp3Extractor.f17738h.f(((mp3Extractor.f17740l * j) / ((long) header.d)) + mp3Extractor.k, 1, header.f17387c, 0, null);
                        mp3Extractor.f17740l += (long) header.g;
                        mp3Extractor.f17741n = 0;
                        i3 = 0;
                        i2 = -1;
                    }
                }
            }
        }
        if (i3 == i2) {
            Seeker seeker3 = mp3Extractor.o;
            if (seeker3 instanceof IndexSeeker) {
                long j19 = ((mp3Extractor.f17740l * j) / ((long) header.d)) + mp3Extractor.k;
                if (seeker3.getDurationUs() != j19) {
                    Seeker seeker4 = mp3Extractor.o;
                    ((IndexSeeker) seeker4).f17730a = j19;
                    mp3Extractor.f.g(seeker4);
                }
            }
        }
        return i3;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f = extractorOutput;
        TrackOutput trackOutputTrack = extractorOutput.track(0, 1);
        this.g = trackOutputTrack;
        this.f17738h = trackOutputTrack;
        this.f.endTracks();
    }

    public final boolean e(DefaultExtractorInput defaultExtractorInput) {
        Seeker seeker = this.o;
        if (seeker != null) {
            long jA = seeker.a();
            if (jA == -1 || defaultExtractorInput.getPeekPosition() <= jA - 4) {
            }
            return true;
        }
        try {
            return !defaultExtractorInput.peekFully(this.f17734a.f18956a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean f(DefaultExtractorInput defaultExtractorInput, boolean z2) throws ParserException, EOFException, InterruptedIOException {
        int peekPosition;
        int i2;
        int iA;
        int i3 = z2 ? 32768 : 131072;
        defaultExtractorInput.f = 0;
        if (defaultExtractorInput.d == 0) {
            Metadata metadataA = this.d.a(defaultExtractorInput, null);
            this.j = metadataA;
            if (metadataA != null) {
                this.f17736c.b(metadataA);
            }
            peekPosition = (int) defaultExtractorInput.getPeekPosition();
            if (!z2) {
                defaultExtractorInput.skipFully(peekPosition);
            }
            i2 = 0;
        } else {
            peekPosition = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (e(defaultExtractorInput)) {
                if (i4 > 0) {
                    break;
                }
                throw new EOFException();
            }
            ParsableByteArray parsableByteArray = this.f17734a;
            parsableByteArray.F(0);
            int iG = parsableByteArray.g();
            if ((i2 == 0 || ((-128000) & iG) == (((long) i2) & (-128000))) && (iA = MpegAudioUtil.a(iG)) != -1) {
                i4++;
                if (i4 != 1) {
                    if (i4 == 4) {
                        break;
                    }
                } else {
                    this.f17735b.a(iG);
                    i2 = iG;
                }
                defaultExtractorInput.c(iA - 4, false);
            } else {
                int i6 = i5 + 1;
                if (i5 == i3) {
                    if (z2) {
                        return false;
                    }
                    throw ParserException.a(null, "Searched too many bytes.");
                }
                if (z2) {
                    defaultExtractorInput.f = 0;
                    defaultExtractorInput.c(peekPosition + i6, false);
                } else {
                    defaultExtractorInput.skipFully(1);
                }
                i4 = 0;
                i5 = i6;
                i2 = 0;
            }
        }
        if (z2) {
            defaultExtractorInput.skipFully(peekPosition + i5);
        } else {
            defaultExtractorInput.f = 0;
        }
        this.f17739i = i2;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f17739i = 0;
        this.k = -9223372036854775807L;
        this.f17740l = 0L;
        this.f17741n = 0;
        this.r = j2;
        Seeker seeker = this.o;
        if (!(seeker instanceof IndexSeeker) || ((IndexSeeker) seeker).b(j2)) {
            return;
        }
        this.q = true;
        this.f17738h = this.f17737e;
    }
}
