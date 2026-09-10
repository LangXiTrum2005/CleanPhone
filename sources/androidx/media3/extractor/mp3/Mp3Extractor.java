package androidx.media3.extractor.mp3;

import android.support.v4.media.a;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class Mp3Extractor implements Extractor {
    public static final /* synthetic */ int s = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DiscardingTrackOutput f7037e;
    public ExtractorOutput f;
    public TrackOutput g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TrackOutput f7038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7039i;
    public Metadata j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7040l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7041n;
    public Seeker o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7042p;
    public boolean q;
    public long r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7034a = new ParsableByteArray(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MpegAudioUtil.Header f7035b = new MpegAudioUtil.Header();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GaplessInfoHolder f7036c = new GaplessInfoHolder();
    public long k = -9223372036854775807L;
    public final Id3Peeker d = new Id3Peeker();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp3Extractor() {
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.f7037e = discardingTrackOutput;
        this.f7038h = discardingTrackOutput;
    }

    public final boolean a(DefaultExtractorInput defaultExtractorInput) {
        Seeker seeker = this.o;
        if (seeker != null) {
            long jA = seeker.a();
            if (jA == -1 || defaultExtractorInput.getPeekPosition() <= jA - 4) {
            }
            return true;
        }
        try {
            return !defaultExtractorInput.peekFully(this.f7034a.f5667a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        return g((DefaultExtractorInput) extractorInput, true);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f = extractorOutput;
        TrackOutput trackOutputTrack = extractorOutput.track(0, 1);
        this.g = trackOutputTrack;
        this.f7038h = trackOutputTrack;
        this.f.endTracks();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x023c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0249  */
    /* JADX WARN: Code duplicated, block: B:113:0x0251  */
    /* JADX WARN: Code duplicated, block: B:114:0x0255  */
    /* JADX WARN: Code duplicated, block: B:116:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x025b  */
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:120:0x028c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0297  */
    /* JADX WARN: Code duplicated, block: B:125:0x029b  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:147:0x0324 A[EDGE_INSN: B:147:0x0324->B:148:0x0328 BREAK  A[LOOP:1: B:140:0x02f7->B:146:0x031f]] */
    /* JADX WARN: Code duplicated, block: B:150:0x033a A[LOOP:2: B:149:0x0338->B:150:0x033a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0365 A[LOOP:0: B:134:0x02e7->B:152:0x0365, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x036b A[EDGE_INSN: B:153:0x036b->B:154:0x036d BREAK  A[LOOP:0: B:134:0x02e7->B:152:0x0365]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0371  */
    /* JADX WARN: Code duplicated, block: B:157:0x037c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x037e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0381 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0384  */
    /* JADX WARN: Code duplicated, block: B:163:0x0388  */
    /* JADX WARN: Code duplicated, block: B:164:0x0390  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:171:0x040e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0417  */
    /* JADX WARN: Code duplicated, block: B:176:0x0423  */
    /* JADX WARN: Code duplicated, block: B:179:0x0434  */
    /* JADX WARN: Code duplicated, block: B:181:0x044b  */
    /* JADX WARN: Code duplicated, block: B:183:0x0452  */
    /* JADX WARN: Code duplicated, block: B:184:0x0455  */
    /* JADX WARN: Code duplicated, block: B:186:0x0463  */
    /* JADX WARN: Code duplicated, block: B:189:0x0477  */
    /* JADX WARN: Code duplicated, block: B:191:0x0490  */
    /* JADX WARN: Code duplicated, block: B:196:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:197:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:198:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:201:0x04af  */
    /* JADX WARN: Code duplicated, block: B:204:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:218:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:78:0x0199  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7 A[LOOP:4: B:82:0x01a5->B:83:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01de  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws Throwable {
        MpegAudioUtil.Header header;
        int i2;
        int i3;
        long j;
        Seeker seeker;
        ParsableByteArray parsableByteArray;
        ParsableByteArray parsableByteArray2;
        Throwable th;
        long j2;
        long j3;
        int iC;
        int i4;
        DefaultExtractorInput defaultExtractorInput;
        int iG;
        int i5;
        int i6;
        Seeker seeker2;
        IndexSeeker indexSeeker;
        long j4;
        ParsableByteArray parsableByteArray3;
        int i7;
        long j5;
        int iG2;
        GaplessInfoHolder gaplessInfoHolder;
        ParsableByteArray parsableByteArray4;
        int iG3;
        int iY;
        long jW;
        long[] jArr;
        int i8;
        int i9;
        XingFrame xingFrame;
        long j6;
        int i10;
        int i11;
        long j7;
        long j8;
        MpegAudioUtil.Header header2;
        long jA;
        long j9;
        Seeker constantBitrateSeeker;
        long jA2;
        long[] jArr2;
        int i12;
        Metadata metadata;
        DefaultExtractorInput defaultExtractorInput2;
        long j10;
        MlltSeeker mlltSeeker;
        Seeker constantBitrateSeeker2;
        Format.Builder builder;
        Metadata.Entry[] entryArr;
        int length;
        int i13;
        Metadata.Entry entry;
        MlltFrame mlltFrame;
        int i14;
        long jI;
        int length2;
        long[] jArr3;
        long[] jArr4;
        int i15;
        Metadata.Entry[] entryArr2;
        int length3;
        int i16;
        Metadata.Entry entry2;
        TextInformationFrame textInformationFrame;
        DefaultExtractorInput defaultExtractorInput3;
        long j11;
        int iG4;
        int i17;
        int i18;
        long jO;
        int iA;
        int iA2;
        int iA3;
        long j12;
        long[] jArr5;
        long[] jArr6;
        int i19;
        DefaultExtractorInput defaultExtractorInput4;
        long j13;
        int iU;
        Assertions.f(this.g);
        int i20 = Util.f5683a;
        int i21 = this.f7039i;
        MpegAudioUtil.Header header3 = this.f7035b;
        if (i21 == 0) {
            try {
                g((DefaultExtractorInput) extractorInput, false);
                seeker = this.o;
                parsableByteArray = this.f7034a;
                if (seeker == null) {
                    th = null;
                    parsableByteArray3 = new ParsableByteArray(header3.f6791c);
                    j = 1000000;
                    ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray3.f5667a, 0, header3.f6791c, false);
                    if ((header3.f6789a & 1) != 0) {
                        if (header3.f6792e != 1) {
                            i7 = 36;
                        } else {
                            i7 = 21;
                        }
                    } else if (header3.f6792e != 1) {
                        i7 = 21;
                    } else {
                        i7 = 13;
                    }
                    j5 = 0;
                    if (parsableByteArray3.f5669c >= i7 + 4) {
                        parsableByteArray3.G(i7);
                        iG2 = parsableByteArray3.g();
                        if (iG2 != 1483304551 && iG2 != 1231971951) {
                            if (parsableByteArray3.f5669c >= 40) {
                                parsableByteArray3.G(36);
                                if (parsableByteArray3.g() == 1447187017) {
                                    iG2 = 1447187017;
                                } else {
                                    iG2 = 0;
                                }
                            } else {
                                iG2 = 0;
                            }
                        }
                    } else if (parsableByteArray3.f5669c >= 40) {
                        parsableByteArray3.G(36);
                        if (parsableByteArray3.g() == 1447187017) {
                            iG2 = 1447187017;
                        } else {
                            iG2 = 0;
                        }
                    } else {
                        iG2 = 0;
                    }
                    gaplessInfoHolder = this.f7036c;
                    if (iG2 == 1231971951) {
                        parsableByteArray4 = parsableByteArray;
                        iG3 = parsableByteArray3.g();
                        if ((iG3 & 1) != 0) {
                            iY = parsableByteArray3.y();
                        } else {
                            iY = -1;
                        }
                        if ((iG3 & 2) != 0) {
                            jW = parsableByteArray3.w();
                        } else {
                            jW = -1;
                        }
                        if ((iG3 & 4) == 4) {
                            jArr2 = new long[100];
                            for (i12 = 0; i12 < 100; i12++) {
                                jArr2[i12] = parsableByteArray3.u();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iG3 & 8) != 0) {
                            parsableByteArray3.H(4);
                        }
                        if (parsableByteArray3.a() >= 24) {
                            parsableByteArray3.H(21);
                            int iX = parsableByteArray3.x();
                            i9 = iX & 4095;
                            i8 = (16773120 & iX) >> 12;
                        } else {
                            i8 = -1;
                            i9 = -1;
                        }
                        j6 = iY;
                        xingFrame = new XingFrame(this.f7035b, j6, jW, jArr, i8, i9);
                        i10 = i8;
                        i11 = i9;
                        if ((gaplessInfoHolder.f6773a != -1 || gaplessInfoHolder.f6774b == -1) && i10 != -1 && i11 != -1) {
                            gaplessInfoHolder.f6773a = i10;
                            gaplessInfoHolder.f6774b = i11;
                        }
                        DefaultExtractorInput defaultExtractorInput5 = (DefaultExtractorInput) extractorInput;
                        j7 = defaultExtractorInput5.d;
                        j8 = defaultExtractorInput5.f6741c;
                        if (j8 != -1 || jW == -1) {
                            header = header3;
                        } else {
                            header = header3;
                            long j14 = j7 + jW;
                            if (j8 != j14) {
                                StringBuilder sbV = a.v(j8, "Data size mismatch between stream (", ") and Xing frame (");
                                sbV.append(j14);
                                sbV.append("), using Xing value.");
                                Log.f("Mp3Extractor", sbV.toString());
                                header = header;
                            }
                        }
                        defaultExtractorInput5.skipFully(header.f6791c);
                        header2 = xingFrame.f7047a;
                        if (iG2 == 1483304551) {
                            jA2 = xingFrame.a();
                            if (jA2 == -9223372036854775807L) {
                                constantBitrateSeeker = null;
                            } else {
                                constantBitrateSeeker = (jW != -1 || jArr == null) ? new XingSeeker(j7, header2.f6791c, jA2, header2.f, -1L, null) : new XingSeeker(j7, header2.f6791c, jA2, header2.f, jW, jArr);
                            }
                        } else {
                            jA = xingFrame.a();
                            if (jA != -9223372036854775807L) {
                                if (jW != -1) {
                                    j8 = j7 + jW;
                                    j9 = jW - ((long) header2.f6791c);
                                } else if (j8 != -1) {
                                    j9 = (j8 - j7) - ((long) header2.f6791c);
                                } else {
                                    constantBitrateSeeker = null;
                                }
                                long j15 = j8;
                                long j16 = j9;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                constantBitrateSeeker = new ConstantBitrateSeeker(j15, j7 + ((long) header2.f6791c), Ints.b(Util.O(j16, 8000000L, jA, roundingMode)), Ints.b(LongMath.b(j16, j6, roundingMode)), false);
                            } else {
                                constantBitrateSeeker = null;
                            }
                        }
                    } else if (iG2 != 1447187017) {
                        defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
                        j11 = defaultExtractorInput3.d;
                        parsableByteArray3.H(10);
                        iG4 = parsableByteArray3.g();
                        if (iG4 <= 0) {
                            i17 = header3.d;
                            long j17 = iG4;
                            if (i17 >= 32000) {
                                i18 = 1152;
                            } else {
                                i18 = 576;
                            }
                            jO = Util.O(j17, ((long) i18) * 1000000, i17, RoundingMode.FLOOR);
                            iA = parsableByteArray3.A();
                            iA2 = parsableByteArray3.A();
                            iA3 = parsableByteArray3.A();
                            parsableByteArray3.H(2);
                            j12 = ((long) header3.f6791c) + j11;
                            jArr5 = new long[iA];
                            jArr6 = new long[iA];
                            i19 = 0;
                            while (true) {
                                if (i19 < iA) {
                                    parsableByteArray4 = parsableByteArray;
                                    long[] jArr7 = jArr6;
                                    defaultExtractorInput4 = defaultExtractorInput3;
                                    j13 = defaultExtractorInput4.f6741c;
                                    if (j13 != -1 && j13 != j11) {
                                        StringBuilder sbV2 = a.v(j13, "VBRI data size mismatch: ", ", ");
                                        sbV2.append(j11);
                                        Log.g("VbriSeeker", sbV2.toString());
                                    }
                                    constantBitrateSeeker = new VbriSeeker(jArr5, jArr7, jO, j11, header3.f);
                                    break;
                                }
                                parsableByteArray4 = parsableByteArray;
                                long[] jArr8 = jArr6;
                                jArr5[i19] = (((long) i19) * jO) / ((long) iA);
                                jArr8[i19] = Math.max(j11, j12);
                                if (iA3 != 1) {
                                    iU = parsableByteArray3.u();
                                } else if (iA3 != 2) {
                                    iU = parsableByteArray3.A();
                                } else if (iA3 != 3) {
                                    iU = parsableByteArray3.x();
                                } else {
                                    if (iA3 != 4) {
                                        constantBitrateSeeker = null;
                                        defaultExtractorInput4 = defaultExtractorInput3;
                                        break;
                                    }
                                    iU = parsableByteArray3.y();
                                }
                                j11 += ((long) iU) * ((long) iA2);
                                i19++;
                                parsableByteArray = parsableByteArray4;
                                iA3 = iA3;
                                j12 = j12;
                                jArr6 = jArr8;
                            }
                        } else {
                            constantBitrateSeeker = null;
                            defaultExtractorInput4 = defaultExtractorInput3;
                            parsableByteArray4 = parsableByteArray;
                        }
                        defaultExtractorInput4.skipFully(header3.f6791c);
                        header = header3;
                    } else if (iG2 != 1483304551) {
                        ((DefaultExtractorInput) extractorInput).f = 0;
                        constantBitrateSeeker = null;
                        header = header3;
                        parsableByteArray4 = parsableByteArray;
                    } else {
                        parsableByteArray4 = parsableByteArray;
                        iG3 = parsableByteArray3.g();
                        if ((iG3 & 1) != 0) {
                            iY = parsableByteArray3.y();
                        } else {
                            iY = -1;
                        }
                        if ((iG3 & 2) != 0) {
                            jW = parsableByteArray3.w();
                        } else {
                            jW = -1;
                        }
                        if ((iG3 & 4) == 4) {
                            jArr2 = new long[100];
                            while (i12 < 100) {
                                jArr2[i12] = parsableByteArray3.u();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iG3 & 8) != 0) {
                            parsableByteArray3.H(4);
                        }
                        if (parsableByteArray3.a() >= 24) {
                            parsableByteArray3.H(21);
                            int iX2 = parsableByteArray3.x();
                            i9 = iX2 & 4095;
                            i8 = (16773120 & iX2) >> 12;
                        } else {
                            i8 = -1;
                            i9 = -1;
                        }
                        j6 = iY;
                        xingFrame = new XingFrame(this.f7035b, j6, jW, jArr, i8, i9);
                        i10 = i8;
                        i11 = i9;
                        if (gaplessInfoHolder.f6773a != -1) {
                            gaplessInfoHolder.f6773a = i10;
                            gaplessInfoHolder.f6774b = i11;
                        } else {
                            gaplessInfoHolder.f6773a = i10;
                            gaplessInfoHolder.f6774b = i11;
                        }
                        DefaultExtractorInput defaultExtractorInput6 = (DefaultExtractorInput) extractorInput;
                        j7 = defaultExtractorInput6.d;
                        j8 = defaultExtractorInput6.f6741c;
                        if (j8 != -1) {
                            header = header3;
                        } else {
                            header = header3;
                        }
                        defaultExtractorInput6.skipFully(header.f6791c);
                        header2 = xingFrame.f7047a;
                        if (iG2 == 1483304551) {
                            jA2 = xingFrame.a();
                            if (jA2 == -9223372036854775807L) {
                                constantBitrateSeeker = null;
                            } else if (jW != -1) {
                            }
                        } else {
                            jA = xingFrame.a();
                            if (jA != -9223372036854775807L) {
                                if (jW != -1) {
                                    j8 = j7 + jW;
                                    j9 = jW - ((long) header2.f6791c);
                                } else if (j8 != -1) {
                                    j9 = (j8 - j7) - ((long) header2.f6791c);
                                } else {
                                    constantBitrateSeeker = null;
                                }
                                long j18 = j8;
                                long j19 = j9;
                                RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                constantBitrateSeeker = new ConstantBitrateSeeker(j18, j7 + ((long) header2.f6791c), Ints.b(Util.O(j19, 8000000L, jA, roundingMode2)), Ints.b(LongMath.b(j19, j6, roundingMode2)), false);
                            } else {
                                constantBitrateSeeker = null;
                            }
                        }
                    }
                    metadata = this.j;
                    defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                    j10 = defaultExtractorInput2.d;
                    if (metadata != null) {
                        mlltSeeker = null;
                        break;
                    }
                    entryArr = metadata.X;
                    length = entryArr.length;
                    i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            mlltSeeker = null;
                            break;
                        }
                        entry = entryArr[i13];
                        if (entry instanceof MlltFrame) {
                            mlltFrame = (MlltFrame) entry;
                            if (metadata != null) {
                                i14 = 1;
                                jI = -9223372036854775807L;
                                break;
                            }
                            entryArr2 = metadata.X;
                            length3 = entryArr2.length;
                            i16 = 0;
                            while (true) {
                                if (i16 < length3) {
                                    i14 = 1;
                                    jI = -9223372036854775807L;
                                    break;
                                }
                                entry2 = entryArr2[i16];
                                if (entry2 instanceof TextInformationFrame) {
                                    textInformationFrame = (TextInformationFrame) entry2;
                                    if (textInformationFrame.X.equals("TLEN")) {
                                        jI = Util.I(Long.parseLong((String) textInformationFrame.Z.get(0)));
                                        i14 = 1;
                                        break;
                                    }
                                }
                                i16++;
                            }
                            length2 = mlltFrame.f0.length;
                            int i22 = length2 + 1;
                            jArr3 = new long[i22];
                            jArr4 = new long[i22];
                            jArr3[0] = j10;
                            jArr4[0] = 0;
                            i15 = i14;
                            while (i15 <= length2) {
                                int i23 = i15 - 1;
                                j10 += (long) (mlltFrame.Z + mlltFrame.f0[i23]);
                                j5 += (long) (mlltFrame.e0 + mlltFrame.g0[i23]);
                                jArr3[i15] = j10;
                                jArr4[i15] = j5;
                                i15++;
                                length2 = length2;
                            }
                            mlltSeeker = new MlltSeeker(jArr3, jArr4, jI);
                            break;
                        }
                        i13++;
                    }
                    if (this.f7042p) {
                        constantBitrateSeeker2 = new Seeker.UnseekableSeeker(-9223372036854775807L);
                        parsableByteArray2 = parsableByteArray4;
                    } else {
                        if (mlltSeeker != null) {
                            constantBitrateSeeker = mlltSeeker;
                        } else if (constantBitrateSeeker == null) {
                            constantBitrateSeeker = null;
                        }
                        if (constantBitrateSeeker != null) {
                            constantBitrateSeeker.isSeekable();
                            parsableByteArray2 = parsableByteArray4;
                            constantBitrateSeeker2 = constantBitrateSeeker;
                        } else {
                            parsableByteArray2 = parsableByteArray4;
                            defaultExtractorInput2.peekFully(parsableByteArray2.f5667a, 0, 4, false);
                            parsableByteArray2.G(0);
                            header.a(parsableByteArray2.g());
                            constantBitrateSeeker2 = new ConstantBitrateSeeker(defaultExtractorInput2.f6741c, defaultExtractorInput2.d, header.f, header.f6791c, false);
                        }
                    }
                    this.o = constantBitrateSeeker2;
                    this.f.e(constantBitrateSeeker2);
                    builder = new Format.Builder();
                    builder.f5429l = MimeTypes.l(header.f6790b);
                    builder.m = 4096;
                    builder.f5434z = header.f6792e;
                    builder.f5418A = header.d;
                    builder.C = gaplessInfoHolder.f6773a;
                    builder.D = gaplessInfoHolder.f6774b;
                    builder.j = this.j;
                    if (this.o.g() != -2147483647) {
                        builder.g = this.o.g();
                    }
                    this.f7038h.b(new Format(builder));
                    this.m = defaultExtractorInput2.d;
                } else {
                    header = header3;
                    parsableByteArray2 = parsableByteArray;
                    th = null;
                    j = 1000000;
                    j2 = this.m;
                    if (j2 != 0) {
                        j3 = ((DefaultExtractorInput) extractorInput).d;
                        if (j3 < j2) {
                            ((DefaultExtractorInput) extractorInput).skipFully((int) (j2 - j3));
                        }
                    }
                }
                if (this.f7041n == 0) {
                    ((DefaultExtractorInput) extractorInput).f = 0;
                    defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                    if (a(defaultExtractorInput)) {
                        i2 = -1;
                        i3 = -1;
                    } else {
                        parsableByteArray2.G(0);
                        iG = parsableByteArray2.g();
                        if (((-128000) & iG) == (((long) this.f7039i) & (-128000))) {
                            i5 = 0;
                            i6 = 1;
                        } else if (MpegAudioUtil.a(iG) == -1) {
                            i6 = 1;
                            i5 = 0;
                        } else {
                            header.a(iG);
                            if (this.k == -9223372036854775807L) {
                                this.k = this.o.getTimeUs(defaultExtractorInput.d);
                            }
                            this.f7041n = header.f6791c;
                            seeker2 = this.o;
                            if (seeker2 instanceof IndexSeeker) {
                                indexSeeker = (IndexSeeker) seeker2;
                                j4 = (((this.f7040l + ((long) header.g)) * j) / ((long) header.d)) + this.k;
                                long j20 = defaultExtractorInput.d;
                                if (indexSeeker.b(j4)) {
                                    throw th;
                                }
                                if (!this.q && indexSeeker.b(this.r)) {
                                    this.q = false;
                                    this.f7038h = this.g;
                                }
                            }
                            iC = this.f7038h.c(extractorInput, this.f7041n, true);
                            if (iC == -1) {
                                i2 = -1;
                                i3 = -1;
                            } else {
                                i4 = this.f7041n - iC;
                                this.f7041n = i4;
                                if (i4 > 0) {
                                    i2 = -1;
                                    i3 = 0;
                                } else {
                                    this.f7038h.f(((this.f7040l * j) / ((long) header.d)) + this.k, 1, header.f6791c, 0, null);
                                    this.f7040l += (long) header.g;
                                    i3 = 0;
                                    this.f7041n = 0;
                                    i2 = -1;
                                }
                            }
                        }
                        defaultExtractorInput.skipFully(i6);
                        this.f7039i = i5;
                        i2 = -1;
                        i3 = 0;
                    }
                } else {
                    iC = this.f7038h.c(extractorInput, this.f7041n, true);
                    if (iC == -1) {
                        i2 = -1;
                        i3 = -1;
                    } else {
                        i4 = this.f7041n - iC;
                        this.f7041n = i4;
                        if (i4 > 0) {
                            i2 = -1;
                            i3 = 0;
                        } else {
                            this.f7038h.f(((this.f7040l * j) / ((long) header.d)) + this.k, 1, header.f6791c, 0, null);
                            this.f7040l += (long) header.g;
                            i3 = 0;
                            this.f7041n = 0;
                            i2 = -1;
                        }
                    }
                }
            } catch (EOFException unused) {
                header = header3;
                i2 = -1;
                i3 = -1;
                j = 1000000;
            }
        } else {
            seeker = this.o;
            parsableByteArray = this.f7034a;
            if (seeker == null) {
                th = null;
                parsableByteArray3 = new ParsableByteArray(header3.f6791c);
                j = 1000000;
                ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray3.f5667a, 0, header3.f6791c, false);
                if ((header3.f6789a & 1) != 0) {
                    if (header3.f6792e != 1) {
                        i7 = 36;
                    } else {
                        i7 = 21;
                    }
                } else if (header3.f6792e != 1) {
                    i7 = 21;
                } else {
                    i7 = 13;
                }
                j5 = 0;
                if (parsableByteArray3.f5669c >= i7 + 4) {
                    parsableByteArray3.G(i7);
                    iG2 = parsableByteArray3.g();
                    if (iG2 != 1483304551) {
                        if (parsableByteArray3.f5669c >= 40) {
                            parsableByteArray3.G(36);
                            if (parsableByteArray3.g() == 1447187017) {
                                iG2 = 1447187017;
                            } else {
                                iG2 = 0;
                            }
                        } else {
                            iG2 = 0;
                        }
                    }
                } else if (parsableByteArray3.f5669c >= 40) {
                    parsableByteArray3.G(36);
                    if (parsableByteArray3.g() == 1447187017) {
                        iG2 = 1447187017;
                    } else {
                        iG2 = 0;
                    }
                } else {
                    iG2 = 0;
                }
                gaplessInfoHolder = this.f7036c;
                if (iG2 == 1231971951) {
                    parsableByteArray4 = parsableByteArray;
                    iG3 = parsableByteArray3.g();
                    if ((iG3 & 1) != 0) {
                        iY = parsableByteArray3.y();
                    } else {
                        iY = -1;
                    }
                    if ((iG3 & 2) != 0) {
                        jW = parsableByteArray3.w();
                    } else {
                        jW = -1;
                    }
                    if ((iG3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i12 < 100) {
                            jArr2[i12] = parsableByteArray3.u();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iG3 & 8) != 0) {
                        parsableByteArray3.H(4);
                    }
                    if (parsableByteArray3.a() >= 24) {
                        parsableByteArray3.H(21);
                        int iX3 = parsableByteArray3.x();
                        i9 = iX3 & 4095;
                        i8 = (16773120 & iX3) >> 12;
                    } else {
                        i8 = -1;
                        i9 = -1;
                    }
                    j6 = iY;
                    xingFrame = new XingFrame(this.f7035b, j6, jW, jArr, i8, i9);
                    i10 = i8;
                    i11 = i9;
                    if (gaplessInfoHolder.f6773a != -1) {
                        gaplessInfoHolder.f6773a = i10;
                        gaplessInfoHolder.f6774b = i11;
                    } else {
                        gaplessInfoHolder.f6773a = i10;
                        gaplessInfoHolder.f6774b = i11;
                    }
                    DefaultExtractorInput defaultExtractorInput7 = (DefaultExtractorInput) extractorInput;
                    j7 = defaultExtractorInput7.d;
                    j8 = defaultExtractorInput7.f6741c;
                    if (j8 != -1) {
                        header = header3;
                    } else {
                        header = header3;
                    }
                    defaultExtractorInput7.skipFully(header.f6791c);
                    header2 = xingFrame.f7047a;
                    if (iG2 == 1483304551) {
                        jA2 = xingFrame.a();
                        if (jA2 == -9223372036854775807L) {
                            constantBitrateSeeker = null;
                        } else if (jW != -1) {
                        }
                    } else {
                        jA = xingFrame.a();
                        if (jA != -9223372036854775807L) {
                            if (jW != -1) {
                                j8 = j7 + jW;
                                j9 = jW - ((long) header2.f6791c);
                            } else if (j8 != -1) {
                                j9 = (j8 - j7) - ((long) header2.f6791c);
                            } else {
                                constantBitrateSeeker = null;
                            }
                            long j110 = j8;
                            long j111 = j9;
                            RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                            constantBitrateSeeker = new ConstantBitrateSeeker(j110, j7 + ((long) header2.f6791c), Ints.b(Util.O(j111, 8000000L, jA, roundingMode3)), Ints.b(LongMath.b(j111, j6, roundingMode3)), false);
                        } else {
                            constantBitrateSeeker = null;
                        }
                    }
                } else if (iG2 != 1447187017) {
                    defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
                    j11 = defaultExtractorInput3.d;
                    parsableByteArray3.H(10);
                    iG4 = parsableByteArray3.g();
                    if (iG4 <= 0) {
                        i17 = header3.d;
                        long j112 = iG4;
                        if (i17 >= 32000) {
                            i18 = 1152;
                        } else {
                            i18 = 576;
                        }
                        jO = Util.O(j112, ((long) i18) * 1000000, i17, RoundingMode.FLOOR);
                        iA = parsableByteArray3.A();
                        iA2 = parsableByteArray3.A();
                        iA3 = parsableByteArray3.A();
                        parsableByteArray3.H(2);
                        j12 = ((long) header3.f6791c) + j11;
                        jArr5 = new long[iA];
                        jArr6 = new long[iA];
                        i19 = 0;
                        while (true) {
                            if (i19 < iA) {
                                parsableByteArray4 = parsableByteArray;
                                long[] jArr9 = jArr6;
                                defaultExtractorInput4 = defaultExtractorInput3;
                                j13 = defaultExtractorInput4.f6741c;
                                if (j13 != -1) {
                                    StringBuilder sbV3 = a.v(j13, "VBRI data size mismatch: ", ", ");
                                    sbV3.append(j11);
                                    Log.g("VbriSeeker", sbV3.toString());
                                }
                                constantBitrateSeeker = new VbriSeeker(jArr5, jArr9, jO, j11, header3.f);
                                break;
                            }
                            parsableByteArray4 = parsableByteArray;
                            long[] jArr10 = jArr6;
                            jArr5[i19] = (((long) i19) * jO) / ((long) iA);
                            jArr10[i19] = Math.max(j11, j12);
                            if (iA3 != 1) {
                                iU = parsableByteArray3.u();
                            } else if (iA3 != 2) {
                                iU = parsableByteArray3.A();
                            } else if (iA3 != 3) {
                                iU = parsableByteArray3.x();
                            } else {
                                if (iA3 != 4) {
                                    constantBitrateSeeker = null;
                                    defaultExtractorInput4 = defaultExtractorInput3;
                                    break;
                                }
                                iU = parsableByteArray3.y();
                            }
                            j11 += ((long) iU) * ((long) iA2);
                            i19++;
                            parsableByteArray = parsableByteArray4;
                            iA3 = iA3;
                            j12 = j12;
                            jArr6 = jArr10;
                        }
                    } else {
                        constantBitrateSeeker = null;
                        defaultExtractorInput4 = defaultExtractorInput3;
                        parsableByteArray4 = parsableByteArray;
                    }
                    defaultExtractorInput4.skipFully(header3.f6791c);
                    header = header3;
                } else if (iG2 != 1483304551) {
                    ((DefaultExtractorInput) extractorInput).f = 0;
                    constantBitrateSeeker = null;
                    header = header3;
                    parsableByteArray4 = parsableByteArray;
                } else {
                    parsableByteArray4 = parsableByteArray;
                    iG3 = parsableByteArray3.g();
                    if ((iG3 & 1) != 0) {
                        iY = parsableByteArray3.y();
                    } else {
                        iY = -1;
                    }
                    if ((iG3 & 2) != 0) {
                        jW = parsableByteArray3.w();
                    } else {
                        jW = -1;
                    }
                    if ((iG3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i12 < 100) {
                            jArr2[i12] = parsableByteArray3.u();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iG3 & 8) != 0) {
                        parsableByteArray3.H(4);
                    }
                    if (parsableByteArray3.a() >= 24) {
                        parsableByteArray3.H(21);
                        int iX4 = parsableByteArray3.x();
                        i9 = iX4 & 4095;
                        i8 = (16773120 & iX4) >> 12;
                    } else {
                        i8 = -1;
                        i9 = -1;
                    }
                    j6 = iY;
                    xingFrame = new XingFrame(this.f7035b, j6, jW, jArr, i8, i9);
                    i10 = i8;
                    i11 = i9;
                    if (gaplessInfoHolder.f6773a != -1) {
                        gaplessInfoHolder.f6773a = i10;
                        gaplessInfoHolder.f6774b = i11;
                    } else {
                        gaplessInfoHolder.f6773a = i10;
                        gaplessInfoHolder.f6774b = i11;
                    }
                    DefaultExtractorInput defaultExtractorInput8 = (DefaultExtractorInput) extractorInput;
                    j7 = defaultExtractorInput8.d;
                    j8 = defaultExtractorInput8.f6741c;
                    if (j8 != -1) {
                        header = header3;
                    } else {
                        header = header3;
                    }
                    defaultExtractorInput8.skipFully(header.f6791c);
                    header2 = xingFrame.f7047a;
                    if (iG2 == 1483304551) {
                        jA2 = xingFrame.a();
                        if (jA2 == -9223372036854775807L) {
                            constantBitrateSeeker = null;
                        } else if (jW != -1) {
                        }
                    } else {
                        jA = xingFrame.a();
                        if (jA != -9223372036854775807L) {
                            if (jW != -1) {
                                j8 = j7 + jW;
                                j9 = jW - ((long) header2.f6791c);
                            } else if (j8 != -1) {
                                j9 = (j8 - j7) - ((long) header2.f6791c);
                            } else {
                                constantBitrateSeeker = null;
                            }
                            long j113 = j8;
                            long j114 = j9;
                            RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                            constantBitrateSeeker = new ConstantBitrateSeeker(j113, j7 + ((long) header2.f6791c), Ints.b(Util.O(j114, 8000000L, jA, roundingMode4)), Ints.b(LongMath.b(j114, j6, roundingMode4)), false);
                        } else {
                            constantBitrateSeeker = null;
                        }
                    }
                }
                metadata = this.j;
                defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                j10 = defaultExtractorInput2.d;
                if (metadata != null) {
                    mlltSeeker = null;
                    break;
                }
                entryArr = metadata.X;
                length = entryArr.length;
                i13 = 0;
                while (true) {
                    if (i13 < length) {
                        mlltSeeker = null;
                        break;
                    }
                    entry = entryArr[i13];
                    if (entry instanceof MlltFrame) {
                        mlltFrame = (MlltFrame) entry;
                        if (metadata != null) {
                            i14 = 1;
                            jI = -9223372036854775807L;
                            break;
                        }
                        entryArr2 = metadata.X;
                        length3 = entryArr2.length;
                        i16 = 0;
                        while (true) {
                            if (i16 < length3) {
                                i14 = 1;
                                jI = -9223372036854775807L;
                                break;
                            }
                            entry2 = entryArr2[i16];
                            if (entry2 instanceof TextInformationFrame) {
                                textInformationFrame = (TextInformationFrame) entry2;
                                if (textInformationFrame.X.equals("TLEN")) {
                                    jI = Util.I(Long.parseLong((String) textInformationFrame.Z.get(0)));
                                    i14 = 1;
                                    break;
                                }
                            }
                            i16++;
                        }
                        length2 = mlltFrame.f0.length;
                        int i24 = length2 + 1;
                        jArr3 = new long[i24];
                        jArr4 = new long[i24];
                        jArr3[0] = j10;
                        jArr4[0] = 0;
                        i15 = i14;
                        while (i15 <= length2) {
                            int i25 = i15 - 1;
                            j10 += (long) (mlltFrame.Z + mlltFrame.f0[i25]);
                            j5 += (long) (mlltFrame.e0 + mlltFrame.g0[i25]);
                            jArr3[i15] = j10;
                            jArr4[i15] = j5;
                            i15++;
                            length2 = length2;
                        }
                        mlltSeeker = new MlltSeeker(jArr3, jArr4, jI);
                        break;
                    }
                    i13++;
                }
                if (this.f7042p) {
                    constantBitrateSeeker2 = new Seeker.UnseekableSeeker(-9223372036854775807L);
                    parsableByteArray2 = parsableByteArray4;
                } else {
                    if (mlltSeeker != null) {
                        constantBitrateSeeker = mlltSeeker;
                    } else if (constantBitrateSeeker == null) {
                        constantBitrateSeeker = null;
                    }
                    if (constantBitrateSeeker != null) {
                        constantBitrateSeeker.isSeekable();
                        parsableByteArray2 = parsableByteArray4;
                        constantBitrateSeeker2 = constantBitrateSeeker;
                    } else {
                        parsableByteArray2 = parsableByteArray4;
                        defaultExtractorInput2.peekFully(parsableByteArray2.f5667a, 0, 4, false);
                        parsableByteArray2.G(0);
                        header.a(parsableByteArray2.g());
                        constantBitrateSeeker2 = new ConstantBitrateSeeker(defaultExtractorInput2.f6741c, defaultExtractorInput2.d, header.f, header.f6791c, false);
                    }
                }
                this.o = constantBitrateSeeker2;
                this.f.e(constantBitrateSeeker2);
                builder = new Format.Builder();
                builder.f5429l = MimeTypes.l(header.f6790b);
                builder.m = 4096;
                builder.f5434z = header.f6792e;
                builder.f5418A = header.d;
                builder.C = gaplessInfoHolder.f6773a;
                builder.D = gaplessInfoHolder.f6774b;
                builder.j = this.j;
                if (this.o.g() != -2147483647) {
                    builder.g = this.o.g();
                }
                this.f7038h.b(new Format(builder));
                this.m = defaultExtractorInput2.d;
            } else {
                header = header3;
                parsableByteArray2 = parsableByteArray;
                th = null;
                j = 1000000;
                j2 = this.m;
                if (j2 != 0) {
                    j3 = ((DefaultExtractorInput) extractorInput).d;
                    if (j3 < j2) {
                        ((DefaultExtractorInput) extractorInput).skipFully((int) (j2 - j3));
                    }
                }
            }
            if (this.f7041n == 0) {
                ((DefaultExtractorInput) extractorInput).f = 0;
                defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                if (a(defaultExtractorInput)) {
                    i2 = -1;
                    i3 = -1;
                } else {
                    parsableByteArray2.G(0);
                    iG = parsableByteArray2.g();
                    if (((-128000) & iG) == (((long) this.f7039i) & (-128000))) {
                        i5 = 0;
                        i6 = 1;
                    } else if (MpegAudioUtil.a(iG) == -1) {
                        i6 = 1;
                        i5 = 0;
                    } else {
                        header.a(iG);
                        if (this.k == -9223372036854775807L) {
                            this.k = this.o.getTimeUs(defaultExtractorInput.d);
                        }
                        this.f7041n = header.f6791c;
                        seeker2 = this.o;
                        if (seeker2 instanceof IndexSeeker) {
                            indexSeeker = (IndexSeeker) seeker2;
                            j4 = (((this.f7040l + ((long) header.g)) * j) / ((long) header.d)) + this.k;
                            long j21 = defaultExtractorInput.d;
                            if (indexSeeker.b(j4)) {
                                throw th;
                            }
                            if (!this.q) {
                            }
                        }
                        iC = this.f7038h.c(extractorInput, this.f7041n, true);
                        if (iC == -1) {
                            i2 = -1;
                            i3 = -1;
                        } else {
                            i4 = this.f7041n - iC;
                            this.f7041n = i4;
                            if (i4 > 0) {
                                i2 = -1;
                                i3 = 0;
                            } else {
                                this.f7038h.f(((this.f7040l * j) / ((long) header.d)) + this.k, 1, header.f6791c, 0, null);
                                this.f7040l += (long) header.g;
                                i3 = 0;
                                this.f7041n = 0;
                                i2 = -1;
                            }
                        }
                    }
                    defaultExtractorInput.skipFully(i6);
                    this.f7039i = i5;
                    i2 = -1;
                    i3 = 0;
                }
            } else {
                iC = this.f7038h.c(extractorInput, this.f7041n, true);
                if (iC == -1) {
                    i2 = -1;
                    i3 = -1;
                } else {
                    i4 = this.f7041n - iC;
                    this.f7041n = i4;
                    if (i4 > 0) {
                        i2 = -1;
                        i3 = 0;
                    } else {
                        this.f7038h.f(((this.f7040l * j) / ((long) header.d)) + this.k, 1, header.f6791c, 0, null);
                        this.f7040l += (long) header.g;
                        i3 = 0;
                        this.f7041n = 0;
                        i2 = -1;
                    }
                }
            }
        }
        if (i3 == i2) {
            Seeker seeker3 = this.o;
            if (seeker3 instanceof IndexSeeker) {
                long j22 = ((this.f7040l * j) / ((long) header.d)) + this.k;
                if (seeker3.getDurationUs() != j22) {
                    Seeker seeker4 = this.o;
                    ((IndexSeeker) seeker4).f7030a = j22;
                    this.f.e(seeker4);
                }
            }
        }
        return i3;
    }

    public final boolean g(DefaultExtractorInput defaultExtractorInput, boolean z2) throws Throwable {
        int peekPosition;
        int i2;
        int iA;
        int i3 = z2 ? 32768 : 131072;
        defaultExtractorInput.f = 0;
        if (defaultExtractorInput.d == 0) {
            Metadata metadataA = this.d.a(defaultExtractorInput, null);
            this.j = metadataA;
            if (metadataA != null) {
                this.f7036c.b(metadataA);
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
            if (a(defaultExtractorInput)) {
                if (i4 > 0) {
                    break;
                }
                throw new EOFException();
            }
            ParsableByteArray parsableByteArray = this.f7034a;
            parsableByteArray.G(0);
            int iG = parsableByteArray.g();
            if ((i2 == 0 || ((-128000) & iG) == (((long) i2) & (-128000))) && (iA = MpegAudioUtil.a(iG)) != -1) {
                i4++;
                if (i4 != 1) {
                    if (i4 == 4) {
                        break;
                    }
                } else {
                    this.f7035b.a(iG);
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
        this.f7039i = i2;
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f7039i = 0;
        this.k = -9223372036854775807L;
        this.f7040l = 0L;
        this.f7041n = 0;
        this.r = j2;
        Seeker seeker = this.o;
        if (!(seeker instanceof IndexSeeker) || ((IndexSeeker) seeker).b(j2)) {
            return;
        }
        this.q = true;
        this.f7038h = this.f7037e;
    }
}
