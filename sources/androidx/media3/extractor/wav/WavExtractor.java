package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.commons.core.configs.AdConfig;
import com.smartdigimkt.b0.a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class WavExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExtractorOutput f7656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TrackOutput f7657b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OutputWriter f7659e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7658c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    public static final class ImaAdPcmOutputWriter implements OutputWriter {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int[] f7660n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, a.X0, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExtractorOutput f7661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackOutput f7662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WavFormat f7663c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f7664e;
        public final ParsableByteArray f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Format f7665h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7666i;
        public long j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f7667l;

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
            this.f7661a = extractorOutput;
            this.f7662b = trackOutput;
            this.f7663c = wavFormat;
            int i2 = wavFormat.f7674b;
            int iMax = Math.max(1, i2 / 10);
            this.g = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.f7676e);
            parsableByteArray.n();
            int iN = parsableByteArray.n();
            this.d = iN;
            int i3 = wavFormat.f7673a;
            int i4 = wavFormat.f7675c;
            int i5 = (((i4 - (i3 * 4)) * 8) / (wavFormat.d * i3)) + 1;
            if (iN != i5) {
                throw ParserException.a(null, "Expected frames per block: " + i5 + "; got: " + iN);
            }
            int iF = Util.f(iMax, iN);
            this.f7664e = new byte[iF * i4];
            this.f = new ParsableByteArray(iN * 2 * i3 * iF);
            int i6 = ((i4 * i2) * 8) / iN;
            Format.Builder builder = new Format.Builder();
            builder.f5429l = MimeTypes.l("audio/raw");
            builder.g = i6;
            builder.f5427h = i6;
            builder.m = iMax * 2 * i3;
            builder.f5434z = i3;
            builder.f5418A = i2;
            builder.f5419B = 2;
            this.f7665h = new Format(builder);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void a(int i2, long j) {
            this.f7661a.e(new WavSeekMap(this.f7663c, this.d, i2, j));
            this.f7662b.b(this.f7665h);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void b(long j) {
            this.f7666i = 0;
            this.j = j;
            this.k = 0;
            this.f7667l = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x004f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0054  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:37:0x0135  */
        /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final boolean c(DefaultExtractorInput defaultExtractorInput, long j) throws EOFException, InterruptedIOException {
            byte[] bArr;
            int i2;
            int i3;
            int i4;
            ParsableByteArray parsableByteArray;
            int i5;
            int i6;
            int i7;
            byte[] bArr2;
            int i8;
            int i9;
            int iJ;
            int iMin;
            int[] iArr;
            int i10;
            int i11;
            int i12;
            byte b2;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19 = this.k;
            WavFormat wavFormat = this.f7663c;
            int i20 = i19 / (wavFormat.f7673a * 2);
            int i21 = this.g;
            int i22 = this.d;
            int iF = Util.f(i21 - i20, i22);
            int i23 = wavFormat.f7675c;
            int i24 = iF * i23;
            boolean z2 = j == 0;
            while (true) {
                bArr = this.f7664e;
                if (z2 && (i17 = this.f7666i) < i24) {
                    i18 = defaultExtractorInput.read(bArr, this.f7666i, (int) Math.min(i24 - i17, j));
                    if (i18 == -1) {
                        break;
                    }
                    this.f7666i += i18;
                    bArr = this.f7664e;
                    if (z2) {
                    }
                }
                i2 = this.f7666i / i23;
                if (i2 > 0) {
                    i4 = 0;
                    while (true) {
                        parsableByteArray = this.f;
                        if (i4 < i2) {
                            break;
                        }
                        i6 = 0;
                        while (true) {
                            i7 = wavFormat.f7673a;
                            if (i6 < i7) {
                                bArr2 = parsableByteArray.f5667a;
                                int i25 = (i6 * 4) + (i4 * i23);
                                i8 = (i7 * 4) + i25;
                                i9 = (i23 / i7) - 4;
                                iJ = (short) (((bArr[i25 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i25] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                                int i26 = i2;
                                iMin = Math.min(bArr[i25 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, 88);
                                iArr = f7660n;
                                i10 = iArr[iMin];
                                i11 = ((i4 * i22 * i7) + i6) * 2;
                                bArr2[i11] = (byte) (iJ & 255);
                                bArr2[i11 + 1] = (byte) (iJ >> 8);
                                int i27 = i4;
                                i12 = 0;
                                while (i12 < i9 * 2) {
                                    b2 = bArr[((i12 / 8) * i7 * 4) + i8 + ((i12 / 2) % 4)];
                                    i13 = i12;
                                    i14 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    if (i13 % 2 == 0) {
                                        i15 = b2 & 15;
                                    } else {
                                        i15 = i14 >> 4;
                                    }
                                    i16 = ((((i15 & 7) * 2) + 1) * i10) >> 3;
                                    if ((i15 & 8) != 0) {
                                        i16 = -i16;
                                    }
                                    iJ = Util.j(iJ + i16, -32768, 32767);
                                    i11 = (i7 * 2) + i11;
                                    bArr2[i11] = (byte) (iJ & 255);
                                    bArr2[i11 + 1] = (byte) (iJ >> 8);
                                    iMin = Util.j(iMin + m[i15], 0, 88);
                                    i10 = iArr[iMin];
                                    i12 = i13 + 1;
                                }
                                i6++;
                                i2 = i26;
                                i4 = i27;
                            }
                        }
                        i4++;
                    }
                    int i28 = i2;
                    int i29 = i22 * i28 * 2 * wavFormat.f7673a;
                    parsableByteArray.G(0);
                    parsableByteArray.F(i29);
                    this.f7666i -= i28 * i23;
                    int i30 = parsableByteArray.f5669c;
                    this.f7662b.e(i30, parsableByteArray);
                    i5 = this.k + i30;
                    this.k = i5;
                    if (i5 / (wavFormat.f7673a * 2) >= i21) {
                        d(i21);
                    }
                }
                if (z2 && (i3 = this.k / (wavFormat.f7673a * 2)) > 0) {
                    d(i3);
                }
                return z2;
            }
            while (true) {
                bArr = this.f7664e;
                if (z2) {
                }
                i2 = this.f7666i / i23;
                if (i2 > 0) {
                    i4 = 0;
                    while (true) {
                        parsableByteArray = this.f;
                        if (i4 < i2) {
                            break;
                            break;
                        }
                        i6 = 0;
                        while (true) {
                            i7 = wavFormat.f7673a;
                            if (i6 < i7) {
                                bArr2 = parsableByteArray.f5667a;
                                int i210 = (i6 * 4) + (i4 * i23);
                                i8 = (i7 * 4) + i210;
                                i9 = (i23 / i7) - 4;
                                iJ = (short) (((bArr[i210 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i210] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                                int i211 = i2;
                                iMin = Math.min(bArr[i210 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, 88);
                                iArr = f7660n;
                                i10 = iArr[iMin];
                                i11 = ((i4 * i22 * i7) + i6) * 2;
                                bArr2[i11] = (byte) (iJ & 255);
                                bArr2[i11 + 1] = (byte) (iJ >> 8);
                                int i212 = i4;
                                i12 = 0;
                                while (i12 < i9 * 2) {
                                    b2 = bArr[((i12 / 8) * i7 * 4) + i8 + ((i12 / 2) % 4)];
                                    i13 = i12;
                                    i14 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    if (i13 % 2 == 0) {
                                        i15 = b2 & 15;
                                    } else {
                                        i15 = i14 >> 4;
                                    }
                                    i16 = ((((i15 & 7) * 2) + 1) * i10) >> 3;
                                    if ((i15 & 8) != 0) {
                                        i16 = -i16;
                                    }
                                    iJ = Util.j(iJ + i16, -32768, 32767);
                                    i11 = (i7 * 2) + i11;
                                    bArr2[i11] = (byte) (iJ & 255);
                                    bArr2[i11 + 1] = (byte) (iJ >> 8);
                                    iMin = Util.j(iMin + m[i15], 0, 88);
                                    i10 = iArr[iMin];
                                    i12 = i13 + 1;
                                }
                                i6++;
                                i2 = i211;
                                i4 = i212;
                            }
                        }
                        i4++;
                    }
                    int i213 = i2;
                    int i214 = i22 * i213 * 2 * wavFormat.f7673a;
                    parsableByteArray.G(0);
                    parsableByteArray.F(i214);
                    this.f7666i -= i213 * i23;
                    int i31 = parsableByteArray.f5669c;
                    this.f7662b.e(i31, parsableByteArray);
                    i5 = this.k + i31;
                    this.k = i5;
                    if (i5 / (wavFormat.f7673a * 2) >= i21) {
                        d(i21);
                    }
                }
                if (z2) {
                    d(i3);
                }
                return z2;
                this.f7666i += i18;
            }
        }

        public final void d(int i2) {
            long j = this.j;
            long j2 = this.f7667l;
            WavFormat wavFormat = this.f7663c;
            long j3 = wavFormat.f7674b;
            int i3 = Util.f5683a;
            long jO = j + Util.O(j2, 1000000L, j3, RoundingMode.FLOOR);
            int i4 = i2 * 2 * wavFormat.f7673a;
            this.f7662b.f(jO, 1, i4, this.k - i4, null);
            this.f7667l += (long) i2;
            this.k -= i4;
        }
    }

    public interface OutputWriter {
        void a(int i2, long j);

        void b(long j);

        boolean c(DefaultExtractorInput defaultExtractorInput, long j);
    }

    public static final class PassthroughOutputWriter implements OutputWriter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExtractorOutput f7668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackOutput f7669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WavFormat f7670c;
        public final Format d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7671e;
        public long f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f7672h;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i2) throws ParserException {
            this.f7668a = extractorOutput;
            this.f7669b = trackOutput;
            this.f7670c = wavFormat;
            int i3 = wavFormat.d;
            int i4 = wavFormat.f7673a;
            int i5 = (i3 * i4) / 8;
            int i6 = wavFormat.f7675c;
            if (i6 != i5) {
                throw ParserException.a(null, "Expected block size: " + i5 + "; got: " + i6);
            }
            int i7 = wavFormat.f7674b;
            int i8 = i7 * i5;
            int i9 = i8 * 8;
            int iMax = Math.max(i5, i8 / 10);
            this.f7671e = iMax;
            Format.Builder builder = new Format.Builder();
            builder.f5429l = MimeTypes.l(str);
            builder.g = i9;
            builder.f5427h = i9;
            builder.m = iMax;
            builder.f5434z = i4;
            builder.f5418A = i7;
            builder.f5419B = i2;
            this.d = new Format(builder);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void a(int i2, long j) {
            this.f7668a.e(new WavSeekMap(this.f7670c, 1, i2, j));
            this.f7669b.b(this.d);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void b(long j) {
            this.f = j;
            this.g = 0;
            this.f7672h = 0L;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final boolean c(DefaultExtractorInput defaultExtractorInput, long j) {
            int i2;
            int i3;
            long j2 = j;
            while (j2 > 0 && (i2 = this.g) < (i3 = this.f7671e)) {
                int iC = this.f7669b.c(defaultExtractorInput, (int) Math.min(i3 - i2, j2), true);
                if (iC == -1) {
                    j2 = 0;
                } else {
                    this.g += iC;
                    j2 -= (long) iC;
                }
            }
            WavFormat wavFormat = this.f7670c;
            int i4 = this.g;
            int i5 = wavFormat.f7675c;
            int i6 = i4 / i5;
            if (i6 > 0) {
                long j3 = this.f;
                long j4 = this.f7672h;
                long j5 = wavFormat.f7674b;
                int i7 = Util.f5683a;
                long jO = j3 + Util.O(j4, 1000000L, j5, RoundingMode.FLOOR);
                int i8 = i6 * i5;
                int i9 = this.g - i8;
                this.f7669b.f(jO, 1, i8, i9, null);
                this.f7672h += (long) i6;
                this.g = i9;
            }
            return j2 <= 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        return WavHeaderReader.a((DefaultExtractorInput) extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f7656a = extractorOutput;
        this.f7657b = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0197  */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        byte[] bArr;
        int i2;
        Assertions.f(this.f7657b);
        int i3 = Util.f5683a;
        int i4 = this.f7658c;
        int iW = 4;
        if (i4 == 0) {
            Assertions.e(((DefaultExtractorInput) extractorInput).d == 0);
            int i5 = this.f;
            if (i5 != -1) {
                ((DefaultExtractorInput) extractorInput).skipFully(i5);
                this.f7658c = 4;
                return 0;
            }
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            if (!WavHeaderReader.a(defaultExtractorInput)) {
                throw ParserException.a(null, "Unsupported or unrecognized wav file type.");
            }
            defaultExtractorInput.skipFully((int) (defaultExtractorInput.getPeekPosition() - defaultExtractorInput.d));
            this.f7658c = 1;
            return 0;
        }
        long j = -1;
        if (i4 == 1) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(8);
            DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
            WavHeaderReader.ChunkHeader chunkHeaderA = WavHeaderReader.ChunkHeader.a(defaultExtractorInput2, parsableByteArray);
            if (chunkHeaderA.f7677a != 1685272116) {
                defaultExtractorInput2.f = 0;
            } else {
                defaultExtractorInput2.c(8, false);
                parsableByteArray.G(0);
                DefaultExtractorInput defaultExtractorInput3 = (DefaultExtractorInput) extractorInput;
                defaultExtractorInput3.peekFully(parsableByteArray.f5667a, 0, 8, false);
                j = parsableByteArray.j();
                defaultExtractorInput3.skipFully(((int) chunkHeaderA.f7678b) + 8);
            }
            this.d = j;
            this.f7658c = 2;
            return 0;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                Assertions.e(this.g != -1);
                long j2 = this.g - ((DefaultExtractorInput) extractorInput).d;
                OutputWriter outputWriter = this.f7659e;
                outputWriter.getClass();
                return outputWriter.c((DefaultExtractorInput) extractorInput, j2) ? -1 : 0;
            }
            ((DefaultExtractorInput) extractorInput).f = 0;
            DefaultExtractorInput defaultExtractorInput4 = (DefaultExtractorInput) extractorInput;
            WavHeaderReader.ChunkHeader chunkHeaderB = WavHeaderReader.b(1684108385, defaultExtractorInput4, new ParsableByteArray(8));
            defaultExtractorInput4.skipFully(8);
            Pair pairCreate = Pair.create(Long.valueOf(defaultExtractorInput4.d), Long.valueOf(chunkHeaderB.f7678b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j3 = this.d;
            if (j3 != -1 && jLongValue == 4294967295L) {
                jLongValue = j3;
            }
            long j4 = ((long) this.f) + jLongValue;
            this.g = j4;
            long j5 = defaultExtractorInput4.f6741c;
            if (j5 != -1 && j4 > j5) {
                Log.g("WavExtractor", "Data exceeds input length: " + this.g + ", " + j5);
                this.g = j5;
            }
            OutputWriter outputWriter2 = this.f7659e;
            outputWriter2.getClass();
            outputWriter2.a(this.f, this.g);
            this.f7658c = 4;
            return 0;
        }
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(16);
        DefaultExtractorInput defaultExtractorInput5 = (DefaultExtractorInput) extractorInput;
        long j6 = WavHeaderReader.b(1718449184, defaultExtractorInput5, parsableByteArray2).f7678b;
        Assertions.e(j6 >= 16);
        defaultExtractorInput5.peekFully(parsableByteArray2.f5667a, 0, 16, false);
        parsableByteArray2.G(0);
        int iN = parsableByteArray2.n();
        int iN2 = parsableByteArray2.n();
        int iM = parsableByteArray2.m();
        parsableByteArray2.m();
        int iN3 = parsableByteArray2.n();
        int iN4 = parsableByteArray2.n();
        int i6 = ((int) j6) - 16;
        if (i6 > 0) {
            bArr = new byte[i6];
            ((DefaultExtractorInput) extractorInput).peekFully(bArr, 0, i6, false);
        } else {
            bArr = Util.f;
        }
        byte[] bArr2 = bArr;
        DefaultExtractorInput defaultExtractorInput6 = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput6.skipFully((int) (defaultExtractorInput6.getPeekPosition() - defaultExtractorInput6.d));
        WavFormat wavFormat = new WavFormat(iN, iN2, iM, iN3, iN4, bArr2);
        if (iN == 17) {
            this.f7659e = new ImaAdPcmOutputWriter(this.f7656a, this.f7657b, wavFormat);
        } else if (iN == 6) {
            this.f7659e = new PassthroughOutputWriter(this.f7656a, this.f7657b, wavFormat, "audio/g711-alaw", -1);
        } else if (iN == 7) {
            this.f7659e = new PassthroughOutputWriter(this.f7656a, this.f7657b, wavFormat, "audio/g711-mlaw", -1);
        } else {
            if (iN == 1) {
                iW = Util.w(iN4);
                i2 = iW;
            } else {
                if (iN != 3) {
                    if (iN == 65534) {
                        iW = Util.w(iN4);
                        i2 = iW;
                    }
                } else if (iN4 == 32) {
                    i2 = iW;
                }
                i2 = 0;
            }
            if (i2 == 0) {
                throw ParserException.b("Unsupported WAV format type: " + iN);
            }
            this.f7659e = new PassthroughOutputWriter(this.f7656a, this.f7657b, wavFormat, "audio/raw", i2);
        }
        this.f7658c = 3;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f7658c = j == 0 ? 0 : 4;
        OutputWriter outputWriter = this.f7659e;
        if (outputWriter != null) {
            outputWriter.b(j2);
        }
    }
}
