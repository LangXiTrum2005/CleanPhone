package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.datastore.preferences.protobuf.a;
import com.applovin.shadow.okio.Segment;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class AtomParsers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f17754a;

    public static final class ChunkIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17757c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f17758e;
        public final ParsableByteArray f;
        public final ParsableByteArray g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17759h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17760i;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z2) throws ParserException {
            this.g = parsableByteArray;
            this.f = parsableByteArray2;
            this.f17758e = z2;
            parsableByteArray2.F(12);
            this.f17755a = parsableByteArray2.x();
            parsableByteArray.F(12);
            this.f17760i = parsableByteArray.x();
            ExtractorUtil.a("first_chunk must be 1", parsableByteArray.g() == 1);
            this.f17756b = -1;
        }

        public final boolean a() {
            int i2 = this.f17756b + 1;
            this.f17756b = i2;
            if (i2 == this.f17755a) {
                return false;
            }
            boolean z2 = this.f17758e;
            ParsableByteArray parsableByteArray = this.f;
            this.d = z2 ? parsableByteArray.y() : parsableByteArray.v();
            if (this.f17756b == this.f17759h) {
                ParsableByteArray parsableByteArray2 = this.g;
                this.f17757c = parsableByteArray2.x();
                parsableByteArray2.G(4);
                int i3 = this.f17760i - 1;
                this.f17760i = i3;
                this.f17759h = i3 > 0 ? parsableByteArray2.x() - 1 : -1;
            }
            return true;
        }
    }

    public static final class EsdsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f17762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17763c;
        public final long d;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.f17761a = str;
            this.f17762b = bArr;
            this.f17763c = j;
            this.d = j2;
        }
    }

    public interface SampleSizeBox {
        int a();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static final class StsdData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackEncryptionBox[] f17764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Format f17765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17766c;
        public int d = 0;

        public StsdData(int i2) {
            this.f17764a = new TrackEncryptionBox[i2];
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParsableByteArray f17769c;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.f17753b;
            this.f17769c = parsableByteArray;
            parsableByteArray.F(12);
            int iX = parsableByteArray.x();
            if ("audio/raw".equals(format.m0)) {
                int iT = Util.t(format.B0, format.z0);
                if (iX == 0 || iX % iT != 0) {
                    Log.g("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iT + ", stsz sample size: " + iX);
                    iX = iT;
                }
            }
            this.f17767a = iX == 0 ? -1 : iX;
            this.f17768b = parsableByteArray.x();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int a() {
            return this.f17767a;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int getSampleCount() {
            return this.f17768b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int readNextSampleSize() {
            int i2 = this.f17767a;
            return i2 == -1 ? this.f17769c.x() : i2;
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParsableByteArray f17770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17772c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17773e;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.f17753b;
            this.f17770a = parsableByteArray;
            parsableByteArray.F(12);
            this.f17772c = parsableByteArray.x() & 255;
            this.f17771b = parsableByteArray.x();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int a() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int getSampleCount() {
            return this.f17771b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public final int readNextSampleSize() {
            ParsableByteArray parsableByteArray = this.f17770a;
            int i2 = this.f17772c;
            if (i2 == 8) {
                return parsableByteArray.u();
            }
            if (i2 == 16) {
                return parsableByteArray.z();
            }
            int i3 = this.d;
            this.d = i3 + 1;
            if (i3 % 2 != 0) {
                return this.f17773e & 15;
            }
            int iU = parsableByteArray.u();
            this.f17773e = iU;
            return (iU & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    public static final class TkhdData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17774a;

        public TkhdData(int i2, long j, int i3) {
            this.f17774a = i2;
        }
    }

    static {
        int i2 = Util.f18979a;
        f17754a = "OpusHead".getBytes(Charsets.f19705c);
    }

    public static EsdsData a(int i2, ParsableByteArray parsableByteArray) {
        parsableByteArray.F(i2 + 12);
        parsableByteArray.G(1);
        b(parsableByteArray);
        parsableByteArray.G(2);
        int iU = parsableByteArray.u();
        if ((iU & 128) != 0) {
            parsableByteArray.G(2);
        }
        if ((iU & 64) != 0) {
            parsableByteArray.G(parsableByteArray.u());
        }
        if ((iU & 32) != 0) {
            parsableByteArray.G(2);
        }
        parsableByteArray.G(1);
        b(parsableByteArray);
        String strC = MimeTypes.c(parsableByteArray.u());
        if ("audio/mpeg".equals(strC) || "audio/vnd.dts".equals(strC) || "audio/vnd.dts.hd".equals(strC)) {
            return new EsdsData(strC, null, -1L, -1L);
        }
        parsableByteArray.G(4);
        long jV = parsableByteArray.v();
        long jV2 = parsableByteArray.v();
        parsableByteArray.G(1);
        int iB = b(parsableByteArray);
        long j = jV2;
        byte[] bArr = new byte[iB];
        parsableByteArray.e(bArr, 0, iB);
        if (j <= 0) {
            j = -1;
        }
        return new EsdsData(strC, bArr, j, jV > 0 ? jV : -1L);
    }

    public static int b(ParsableByteArray parsableByteArray) {
        int iU = parsableByteArray.u();
        int i2 = iU & 127;
        while ((iU & 128) == 128) {
            iU = parsableByteArray.u();
            i2 = (i2 << 7) | (iU & 127);
        }
        return i2;
    }

    public static Pair c(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        TrackEncryptionBox trackEncryptionBox;
        Pair pairCreate;
        int i4;
        int i5;
        int i6 = parsableByteArray.f18957b;
        while (i6 - i2 < i3) {
            parsableByteArray.F(i6);
            int iG = parsableByteArray.g();
            ExtractorUtil.a("childAtomSize must be positive", iG > 0);
            if (parsableByteArray.g() == 1936289382) {
                int i7 = i6 + 8;
                int i8 = 0;
                int i9 = -1;
                Integer numValueOf = null;
                String strS = null;
                while (i7 - i6 < iG) {
                    parsableByteArray.F(i7);
                    int iG2 = parsableByteArray.g();
                    int iG3 = parsableByteArray.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(parsableByteArray.g());
                    } else if (iG3 == 1935894637) {
                        parsableByteArray.G(4);
                        strS = parsableByteArray.s(4, Charsets.f19705c);
                    } else if (iG3 == 1935894633) {
                        i9 = i7;
                        i8 = iG2;
                    }
                    i7 += iG2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    ExtractorUtil.a("frma atom is mandatory", numValueOf != null);
                    ExtractorUtil.a("schi atom is mandatory", i9 != -1);
                    int i10 = i9 + 8;
                    while (true) {
                        if (i10 - i9 >= i8) {
                            trackEncryptionBox = null;
                            break;
                        }
                        parsableByteArray.F(i10);
                        int iG4 = parsableByteArray.g();
                        if (parsableByteArray.g() == 1952804451) {
                            int iB = Atom.b(parsableByteArray.g());
                            parsableByteArray.G(1);
                            if (iB == 0) {
                                parsableByteArray.G(1);
                                i5 = 0;
                                i4 = 0;
                            } else {
                                int iU = parsableByteArray.u();
                                i4 = iU & 15;
                                i5 = (iU & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            boolean z2 = parsableByteArray.u() == 1;
                            int iU2 = parsableByteArray.u();
                            byte[] bArr2 = new byte[16];
                            parsableByteArray.e(bArr2, 0, 16);
                            if (z2 && iU2 == 0) {
                                int iU3 = parsableByteArray.u();
                                byte[] bArr3 = new byte[iU3];
                                parsableByteArray.e(bArr3, 0, iU3);
                                bArr = bArr3;
                            }
                            trackEncryptionBox = new TrackEncryptionBox(z2, strS, iU2, bArr2, i5, i4, bArr);
                            break;
                        }
                        i10 += iG4;
                    }
                    ExtractorUtil.a("tenc atom is mandatory", trackEncryptionBox != null);
                    int i11 = Util.f18979a;
                    pairCreate = Pair.create(numValueOf, trackEncryptionBox);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i6 += iG;
        }
        return null;
    }

    public static TrackSampleTable d(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z2;
        int iX;
        int iX2;
        int iX3;
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        int[] iArrCopyOf;
        int[] iArrCopyOf2;
        long[] jArr;
        long[] jArrCopyOf;
        int i6;
        int i7;
        long[] jArr2;
        long j2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        Atom.LeafAtom leafAtomD = containerAtom.d(1937011578);
        Format format = track.f;
        if (leafAtomD != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomD, format);
        } else {
            Atom.LeafAtom leafAtomD2 = containerAtom.d(1937013298);
            if (leafAtomD2 == null) {
                throw ParserException.a(null, "Track has no sample table size information");
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomD2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomD3 = containerAtom.d(1937007471);
        if (leafAtomD3 == null) {
            leafAtomD3 = containerAtom.d(1668232756);
            leafAtomD3.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        Atom.LeafAtom leafAtomD4 = containerAtom.d(1937011555);
        leafAtomD4.getClass();
        Atom.LeafAtom leafAtomD5 = containerAtom.d(1937011827);
        leafAtomD5.getClass();
        Atom.LeafAtom leafAtomD6 = containerAtom.d(1937011571);
        ParsableByteArray parsableByteArray = leafAtomD6 != null ? leafAtomD6.f17753b : null;
        Atom.LeafAtom leafAtomD7 = containerAtom.d(1668576371);
        ParsableByteArray parsableByteArray2 = leafAtomD7 != null ? leafAtomD7.f17753b : null;
        ChunkIterator chunkIterator = new ChunkIterator(leafAtomD4.f17753b, leafAtomD3.f17753b, z2);
        ParsableByteArray parsableByteArray3 = leafAtomD5.f17753b;
        parsableByteArray3.F(12);
        int iX4 = parsableByteArray3.x() - 1;
        int iX5 = parsableByteArray3.x();
        int iX6 = parsableByteArray3.x();
        if (parsableByteArray2 != null) {
            parsableByteArray2.F(12);
            iX = parsableByteArray2.x();
        } else {
            iX = 0;
        }
        if (parsableByteArray != null) {
            parsableByteArray.F(12);
            iX3 = parsableByteArray.x();
            if (iX3 > 0) {
                iX2 = parsableByteArray.x() - 1;
                i2 = 0;
            } else {
                iX2 = -1;
                i2 = 0;
                parsableByteArray = null;
            }
        } else {
            iX2 = -1;
            iX3 = 0;
            i2 = 0;
        }
        int iA = stz2SampleSizeBox.a();
        String str = format.m0;
        int i12 = (iA == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iX4 == 0 && iX == 0 && iX3 == 0)) ? i2 : 1;
        SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
        if (i12 != 0) {
            int i13 = chunkIterator.f17755a;
            long[] jArr3 = new long[i13];
            int[] iArr2 = new int[i13];
            while (chunkIterator.a()) {
                int i14 = chunkIterator.f17756b;
                jArr3[i14] = chunkIterator.d;
                iArr2[i14] = chunkIterator.f17757c;
            }
            long j3 = iX6;
            int i15 = Segment.SIZE / iA;
            int i16 = i2;
            int iG = i16;
            while (i16 < i13) {
                iG += Util.g(iArr2[i16], i15);
                i16++;
            }
            long[] jArr4 = new long[iG];
            iArrCopyOf = new int[iG];
            j = 0;
            long[] jArr5 = new long[iG];
            int[] iArr3 = new int[iG];
            int i17 = i2;
            int i18 = i17;
            int i19 = i18;
            int i20 = i19;
            while (i18 < i13) {
                int i21 = iArr2[i18];
                long j4 = jArr3[i18];
                int i22 = i20;
                int i23 = i13;
                int iMax = i19;
                int i24 = i22;
                int[] iArr4 = iArr3;
                int i25 = i21;
                while (i25 > 0) {
                    int iMin = Math.min(i15, i25);
                    jArr4[i24] = j4;
                    int i26 = i25;
                    int i27 = iA * iMin;
                    iArrCopyOf[i24] = i27;
                    iMax = Math.max(iMax, i27);
                    jArr5[i24] = ((long) i17) * j3;
                    iArr4[i24] = 1;
                    j4 += (long) iArrCopyOf[i24];
                    i17 += iMin;
                    i25 = i26 - iMin;
                    i24++;
                    iA = iA;
                }
                i18++;
                int i28 = i24;
                i19 = iMax;
                i13 = i23;
                i20 = i28;
                iArr3 = iArr4;
            }
            j2 = j3 * ((long) i17);
            jArr2 = jArr4;
            jArrCopyOf = jArr5;
            i3 = i19;
            iArrCopyOf2 = iArr3;
        } else {
            j = 0;
            long[] jArr6 = new long[sampleCount];
            int[] iArr5 = new int[sampleCount];
            long[] jArr7 = new long[sampleCount];
            ParsableByteArray parsableByteArray4 = parsableByteArray2;
            int[] iArr6 = new int[sampleCount];
            ParsableByteArray parsableByteArray5 = parsableByteArray;
            int iX7 = iX2;
            i3 = i2;
            int iG2 = i3;
            int i29 = iG2;
            int i30 = i29;
            long j5 = 0;
            long j6 = 0;
            int i31 = i30;
            while (true) {
                if (i31 >= sampleCount) {
                    i4 = iX4;
                    i5 = iX5;
                    iArrCopyOf = iArr5;
                    iArrCopyOf2 = iArr6;
                    jArr = jArr6;
                    jArrCopyOf = jArr7;
                    i6 = i29;
                    break;
                }
                long j7 = j6;
                int i32 = i29;
                boolean zA = true;
                while (i32 == 0) {
                    zA = chunkIterator.a();
                    if (!zA) {
                        break;
                    }
                    int i33 = iX4;
                    long j8 = chunkIterator.d;
                    i32 = chunkIterator.f17757c;
                    j7 = j8;
                    iX4 = i33;
                    iX5 = iX5;
                    sampleCount = sampleCount;
                }
                int i34 = sampleCount;
                i4 = iX4;
                i5 = iX5;
                if (!zA) {
                    Log.g("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr6, i31);
                    iArrCopyOf = Arrays.copyOf(iArr5, i31);
                    jArrCopyOf = Arrays.copyOf(jArr7, i31);
                    i6 = i32;
                    iArrCopyOf2 = Arrays.copyOf(iArr6, i31);
                    jArr = jArrCopyOf2;
                    sampleCount = i31;
                    break;
                }
                if (parsableByteArray4 != null) {
                    int iX8 = i30;
                    while (iX8 == 0 && iX > 0) {
                        iX8 = parsableByteArray4.x();
                        iG2 = parsableByteArray4.g();
                        iX--;
                    }
                    i30 = iX8 - 1;
                }
                jArr6[i31] = j7;
                int nextSampleSize = sampleSizeBox.readNextSampleSize();
                iArr5[i31] = nextSampleSize;
                if (nextSampleSize > i3) {
                    i3 = nextSampleSize;
                }
                jArr7[i31] = j5 + ((long) iG2);
                iArr6[i31] = parsableByteArray5 == null ? 1 : i2;
                if (i31 == iX7) {
                    iArr6[i31] = 1;
                    iX3--;
                    if (iX3 > 0) {
                        parsableByteArray5.getClass();
                        iX7 = parsableByteArray5.x() - 1;
                    }
                }
                j5 += (long) iX6;
                iX5 = i5 - 1;
                if (iX5 != 0 || i4 <= 0) {
                    iX4 = i4;
                } else {
                    iX4 = i4 - 1;
                    iX5 = parsableByteArray3.x();
                    iX6 = parsableByteArray3.g();
                }
                long j9 = j7 + ((long) iArr5[i31]);
                i29 = i32 - 1;
                i31++;
                j6 = j9;
                sampleCount = i34;
            }
            long j10 = j5 + ((long) iG2);
            if (parsableByteArray4 == null) {
                i7 = 1;
                break;
            }
            while (true) {
                if (iX <= 0) {
                    i7 = 1;
                    break;
                }
                if (parsableByteArray4.x() != 0) {
                    i7 = i2;
                    break;
                }
                parsableByteArray4.g();
                iX--;
            }
            if (iX3 != 0 || i5 != 0 || i6 != 0 || i4 != 0 || i30 != 0 || i7 == 0) {
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                a.y(sb, track.f17830a, ": remainingSynchronizationSamples ", iX3, ", remainingSamplesAtTimestampDelta ");
                a.y(sb, i5, ", remainingSamplesInChunk ", i6, ", remainingTimestampDeltaChanges ");
                sb.append(i4);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i30);
                sb.append(i7 == 0 ? ", ctts invalid" : "");
                Log.g("AtomParsers", sb.toString());
            }
            jArr2 = jArr;
            j2 = j10;
        }
        long jF = Util.F(j2, 1000000L, track.f17832c);
        long j11 = track.f17832c;
        long[] jArr8 = track.f17834h;
        if (jArr8 == null) {
            Util.G(jArrCopyOf, j11);
            return new TrackSampleTable(track, jArr2, iArrCopyOf, i3, jArrCopyOf, iArrCopyOf2, jF);
        }
        int i35 = sampleCount;
        int[] iArr7 = iArrCopyOf;
        int length = jArr8.length;
        int i36 = track.f17831b;
        long[] jArr9 = track.f17835i;
        if (length == 1 && i36 == 1 && jArrCopyOf.length >= 2) {
            jArr9.getClass();
            long j12 = jArr9[i2];
            jArr2 = jArr2;
            long jF2 = Util.F(jArr8[i2], track.f17832c, track.d) + j12;
            int length2 = jArrCopyOf.length - 1;
            int i37 = i3;
            int i38 = i2;
            int iJ = Util.j(4, i38, length2);
            int iJ2 = Util.j(jArrCopyOf.length - 4, i38, length2);
            long j13 = jArrCopyOf[i38];
            if (j13 <= j12 && j12 < jArrCopyOf[iJ] && jArrCopyOf[iJ2] < jF2 && jF2 <= j2) {
                long jF3 = Util.F(j12 - j13, format.A0, track.f17832c);
                int[] iArr8 = iArrCopyOf2;
                long jF4 = Util.F(j2 - jF2, format.A0, track.f17832c);
                if (!(jF3 == j && jF4 == j) && jF3 <= 2147483647L && jF4 <= 2147483647L) {
                    gaplessInfoHolder.f17548a = (int) jF3;
                    gaplessInfoHolder.f17549b = (int) jF4;
                    Util.G(jArrCopyOf, j11);
                    return new TrackSampleTable(track, jArr2, iArr7, i37, jArrCopyOf, iArr8, Util.F(jArr8[0], 1000000L, track.d));
                }
                iArrCopyOf2 = iArr8;
            }
            iArr7 = iArr7;
            i3 = i37;
        } else {
            j2 = j2;
        }
        if (jArr8.length != 1) {
            i8 = 1;
        } else {
            if (jArr8[0] == j) {
                jArr9.getClass();
                long j14 = jArr9[0];
                for (int i39 = 0; i39 < jArrCopyOf.length; i39++) {
                    jArrCopyOf[i39] = Util.F(jArrCopyOf[i39] - j14, 1000000L, track.f17832c);
                }
                return new TrackSampleTable(track, jArr2, iArr7, i3, jArrCopyOf, iArrCopyOf2, Util.F(j2 - j14, 1000000L, track.f17832c));
            }
            i8 = 1;
        }
        boolean z3 = i36 == i8;
        int[] iArr9 = new int[jArr8.length];
        int[] iArr10 = new int[jArr8.length];
        jArr9.getClass();
        int i40 = i3;
        int i41 = 0;
        boolean z4 = false;
        int i42 = 0;
        int i43 = 0;
        while (i41 < jArr8.length) {
            int[] iArr11 = iArr9;
            int[] iArr12 = iArr10;
            long j15 = jArr9[i41];
            if (j15 != -1) {
                i9 = i41;
                boolean z5 = z4;
                long jF5 = Util.F(jArr8[i41], track.f17832c, track.d);
                iArr = iArr11;
                iArr[i9] = Util.f(jArrCopyOf, j15, true);
                iArr12[i9] = Util.b(jArrCopyOf, j15 + jF5, z3);
                while (true) {
                    i10 = iArr[i9];
                    i11 = iArr12[i9];
                    if (i10 >= i11 || (iArrCopyOf2[i10] & 1) != 0) {
                        break;
                    }
                    iArr[i9] = i10 + 1;
                }
                int i44 = (i11 - i10) + i42;
                z4 = z5 | (i43 != i10);
                i43 = i11;
                i42 = i44;
            } else {
                iArr = iArr11;
                i9 = i41;
            }
            i41 = i9 + 1;
            iArr9 = iArr;
            iArr10 = iArr12;
        }
        int[] iArr13 = iArr9;
        int[] iArr14 = iArr10;
        boolean z6 = z4 | (i42 != i35);
        long[] jArr10 = z6 ? new long[i42] : jArr2;
        int[] iArr15 = z6 ? new int[i42] : iArr7;
        if (z6) {
            i40 = 0;
        }
        int[] iArr16 = z6 ? new int[i42] : iArrCopyOf2;
        long[] jArr11 = new long[i42];
        int i45 = 0;
        int i46 = 0;
        long j16 = j;
        while (i45 < jArr8.length) {
            long j17 = jArr9[i45];
            long[] jArr12 = jArr8;
            int i47 = iArr13[i45];
            boolean z7 = z6;
            int i48 = iArr14[i45];
            long[] jArr13 = jArrCopyOf;
            if (z7) {
                int i49 = i48 - i47;
                System.arraycopy(jArr2, i47, jArr10, i46, i49);
                System.arraycopy(iArr7, i47, iArr15, i46, i49);
                System.arraycopy(iArrCopyOf2, i47, iArr16, i46, i49);
            }
            int i50 = i40;
            while (i47 < i48) {
                long[] jArr14 = jArr2;
                int[] iArr17 = iArr7;
                int[] iArr18 = iArrCopyOf2;
                long[] jArr15 = jArr10;
                long j18 = j;
                jArr11[i46] = Util.F(j16, 1000000L, track.d) + Util.F(Math.max(j18, jArr13[i47] - j17), 1000000L, track.f17832c);
                if (z7 && iArr15[i46] > i50) {
                    i50 = iArr17[i47];
                }
                i46++;
                i47++;
                j = j18;
                iArrCopyOf2 = iArr18;
                jArr2 = jArr14;
                iArr7 = iArr17;
                jArr10 = jArr15;
            }
            j16 += jArr12[i45];
            i45++;
            z6 = z7;
            i40 = i50;
            jArr8 = jArr12;
            jArrCopyOf = jArr13;
            iArrCopyOf2 = iArrCopyOf2;
            jArr2 = jArr2;
            iArr7 = iArr7;
            jArr10 = jArr10;
        }
        return new TrackSampleTable(track, jArr10, iArr15, i40, jArr11, iArr16, Util.F(j16, 1000000L, track.d));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0205  */
    /* JADX WARN: Code duplicated, block: B:102:0x0209  */
    /* JADX WARN: Code duplicated, block: B:135:0x0266  */
    /* JADX WARN: Code duplicated, block: B:325:0x0588  */
    /* JADX WARN: Code duplicated, block: B:327:0x0593  */
    /* JADX WARN: Code duplicated, block: B:328:0x0595  */
    /* JADX WARN: Code duplicated, block: B:331:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:332:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:334:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:338:0x05d6 A[PHI: r3
  0x05d6: PHI (r3v45 int) = (r3v44 int), (r3v79 int) binds: [B:333:0x05ca, B:337:0x05d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:341:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:343:0x0624  */
    /* JADX WARN: Code duplicated, block: B:345:0x062a  */
    /* JADX WARN: Code duplicated, block: B:348:0x066b  */
    /* JADX WARN: Code duplicated, block: B:350:0x0676  */
    /* JADX WARN: Code duplicated, block: B:352:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:355:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:357:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:361:0x06db  */
    /* JADX WARN: Code duplicated, block: B:363:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:364:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:366:0x0710  */
    /* JADX WARN: Code duplicated, block: B:368:0x0719  */
    /* JADX WARN: Code duplicated, block: B:370:0x0732  */
    /* JADX WARN: Code duplicated, block: B:371:0x0736  */
    /* JADX WARN: Code duplicated, block: B:373:0x0759  */
    /* JADX WARN: Code duplicated, block: B:375:0x0760 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:376:0x0762  */
    /* JADX WARN: Code duplicated, block: B:380:0x0783  */
    /* JADX WARN: Code duplicated, block: B:384:0x078d  */
    /* JADX WARN: Code duplicated, block: B:399:0x0860  */
    /* JADX WARN: Code duplicated, block: B:401:0x0869  */
    /* JADX WARN: Code duplicated, block: B:403:0x086f  */
    /* JADX WARN: Code duplicated, block: B:405:0x0872  */
    /* JADX WARN: Code duplicated, block: B:409:0x087d  */
    /* JADX WARN: Code duplicated, block: B:411:0x0886  */
    /* JADX WARN: Code duplicated, block: B:413:0x088a  */
    /* JADX WARN: Code duplicated, block: B:417:0x0899 A[LOOP:4: B:407:0x0877->B:417:0x0899, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:420:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:422:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:424:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:425:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:428:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:430:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:438:0x092b  */
    /* JADX WARN: Code duplicated, block: B:444:0x096d  */
    /* JADX WARN: Code duplicated, block: B:446:0x0977  */
    /* JADX WARN: Code duplicated, block: B:448:0x0981  */
    /* JADX WARN: Code duplicated, block: B:449:0x0985  */
    /* JADX WARN: Code duplicated, block: B:451:0x0998  */
    /* JADX WARN: Code duplicated, block: B:453:0x099f  */
    /* JADX WARN: Code duplicated, block: B:456:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:457:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:459:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:460:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:464:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:466:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:470:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a10 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:475:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:480:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:485:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a4e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:488:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:490:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:497:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:499:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:612:0x0cf4  */
    /* JADX WARN: Code duplicated, block: B:613:0x0cf9  */
    /* JADX WARN: Code duplicated, block: B:618:0x0d15  */
    /* JADX WARN: Code duplicated, block: B:619:0x0d1b  */
    /* JADX WARN: Code duplicated, block: B:621:0x0d4f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:624:0x0d55  */
    /* JADX WARN: Code duplicated, block: B:626:0x0d59  */
    /* JADX WARN: Code duplicated, block: B:627:0x0d5e  */
    /* JADX WARN: Code duplicated, block: B:630:0x0d66  */
    /* JADX WARN: Code duplicated, block: B:635:0x0db1  */
    /* JADX WARN: Code duplicated, block: B:637:0x0dbc  */
    /* JADX WARN: Code duplicated, block: B:639:0x0dc5  */
    /* JADX WARN: Code duplicated, block: B:640:0x0dc7  */
    /* JADX WARN: Code duplicated, block: B:642:0x0de1  */
    /* JADX WARN: Code duplicated, block: B:644:0x0de4  */
    /* JADX WARN: Code duplicated, block: B:645:0x0de9  */
    /* JADX WARN: Code duplicated, block: B:648:0x0df1  */
    /* JADX WARN: Code duplicated, block: B:649:0x0df6  */
    /* JADX WARN: Code duplicated, block: B:652:0x0e03 A[LOOP:7: B:641:0x0ddf->B:652:0x0e03, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:657:0x0e18  */
    /* JADX WARN: Code duplicated, block: B:658:0x0e24  */
    /* JADX WARN: Code duplicated, block: B:662:0x0e2d  */
    /* JADX WARN: Code duplicated, block: B:663:0x0e31 A[EDGE_INSN: B:663:0x0e31->B:664:0x0e60 BREAK  A[LOOP:2: B:96:0x01f5->B:632:0x0d81]] */
    /* JADX WARN: Code duplicated, block: B:666:0x0e68  */
    /* JADX WARN: Code duplicated, block: B:667:0x0e6d  */
    /* JADX WARN: Code duplicated, block: B:673:0x0e9e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x076f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0e0a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x0da2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x08a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0867 A[EDGE_INSN: B:691:0x0867->B:400:0x0867 BREAK  A[LOOP:4: B:407:0x0877->B:417:0x0899], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0d0f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x015b  */
    /* JADX WARN: Code duplicated, block: B:87:0x018f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:91:0x019d  */
    /* JADX WARN: Code duplicated, block: B:92:0x019f  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9  */
    public static ArrayList e(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z2, boolean z3, Function function) {
        int i2;
        long jV;
        int i3;
        int i4;
        TkhdData tkhdData;
        long j2;
        ParsableByteArray parsableByteArray;
        int i5;
        long jV2;
        long jF;
        int iB;
        int i6;
        int i7;
        Pair pairCreate;
        Atom.LeafAtom leafAtomD;
        String str;
        ParsableByteArray parsableByteArray2;
        int iG;
        StsdData stsdData;
        int i8;
        TrackEncryptionBox[] trackEncryptionBoxArr;
        ArrayList arrayList;
        int i9;
        Atom.ContainerAtom containerAtom2;
        Pair pair;
        TkhdData tkhdData2;
        int i10;
        StsdData stsdData2;
        long[] jArr;
        long[] jArr2;
        Track track;
        Atom.ContainerAtom containerAtomC;
        Atom.LeafAtom leafAtomD2;
        ParsableByteArray parsableByteArray3;
        int iB2;
        int iX;
        long[] jArr3;
        long[] jArr4;
        int i11;
        Pair pairCreate2;
        long jV3;
        long jG;
        int i12;
        int iG2;
        boolean z4;
        int iG3;
        int i13;
        int i14;
        Atom.ContainerAtom containerAtom3;
        Pair pair2;
        TkhdData tkhdData3;
        String str2;
        int i15;
        int iZ;
        int iZ2;
        int i16;
        int i17;
        int i18;
        DrmInitData drmInitDataA;
        String str3;
        int i19;
        DrmInitData drmInitData2;
        String str4;
        boolean z5;
        String str5;
        float fX;
        int i20;
        int i21;
        int iB3;
        byte[] bArr;
        String str6;
        ByteBuffer byteBufferOrder;
        EsdsData esdsData;
        List listZ;
        int i22;
        int i23;
        int i24;
        float f;
        int i25;
        StsdData stsdData3;
        String str7;
        Format.Builder builder;
        int i26;
        byte[] bArrArray;
        StsdData stsdData4;
        int i27;
        int iG4;
        boolean z6;
        int iG5;
        StsdData stsdData5;
        String str8;
        DolbyVisionConfig dolbyVisionConfigA;
        String str9;
        byte[] bArrCopyOfRange;
        boolean z7;
        HevcConfig hevcConfigA;
        boolean z8;
        AvcConfig avcConfigA;
        Pair pairC;
        int iZ3;
        int i28;
        int iG6;
        int iX2;
        int i29;
        int i30;
        DrmInitData drmInitData3;
        String str10;
        int i31;
        int i32;
        int iIntValue;
        int i33;
        String str11;
        EsdsData esdsData2;
        List listZ2;
        String str12;
        int i34;
        Format.Builder builder2;
        int iG7;
        boolean z9;
        int iG8;
        int i35;
        int i36;
        int i37;
        String str13;
        int i38;
        int i39;
        boolean z10;
        int i40;
        String str14;
        int iG9;
        boolean z11;
        EsdsData esdsData3;
        List listZ3;
        EsdsData esdsDataA;
        byte[] bArr2;
        int[] iArr;
        int[] iArr2;
        int i41;
        String str15;
        List listZ4;
        int i42;
        ParsableBitArray parsableBitArray;
        int i43;
        int iG10;
        int i44;
        String str16;
        ParsableBitArray parsableBitArray2;
        int i45;
        int i46;
        long j3;
        ImmutableList immutableListZ;
        Track track2;
        ArrayList arrayList2 = new ArrayList();
        int i47 = 0;
        while (true) {
            ArrayList arrayList3 = containerAtom.d;
            if (i47 >= arrayList3.size()) {
                return arrayList2;
            }
            Atom.ContainerAtom containerAtom4 = (Atom.ContainerAtom) arrayList3.get(i47);
            if (containerAtom4.f17750a != 1953653099) {
                i9 = i47;
            } else {
                Atom.LeafAtom leafAtomD3 = containerAtom.d(1836476516);
                leafAtomD3.getClass();
                Atom.ContainerAtom containerAtomC2 = containerAtom4.c(1835297121);
                containerAtomC2.getClass();
                Atom.LeafAtom leafAtomD4 = containerAtomC2.d(1751411826);
                leafAtomD4.getClass();
                ParsableByteArray parsableByteArray4 = leafAtomD4.f17753b;
                parsableByteArray4.F(16);
                int iG11 = parsableByteArray4.g();
                if (iG11 == 1936684398) {
                    i2 = 1;
                } else if (iG11 == 1986618469) {
                    i2 = 2;
                } else if (iG11 == 1952807028 || iG11 == 1935832172 || iG11 == 1937072756 || iG11 == 1668047728) {
                    i2 = 3;
                } else {
                    i2 = iG11 == 1835365473 ? 5 : -1;
                }
                if (i2 == -1) {
                    arrayList = arrayList2;
                    i9 = i47;
                } else {
                    Atom.LeafAtom leafAtomD5 = containerAtom4.d(1953196132);
                    leafAtomD5.getClass();
                    ParsableByteArray parsableByteArray5 = leafAtomD5.f17753b;
                    parsableByteArray5.F(8);
                    int iB4 = Atom.b(parsableByteArray5.g());
                    parsableByteArray5.G(iB4 == 0 ? 8 : 16);
                    int iG12 = parsableByteArray5.g();
                    parsableByteArray5.G(4);
                    int i48 = parsableByteArray5.f18957b;
                    int i49 = iB4 == 0 ? 4 : 8;
                    int i50 = 0;
                    while (true) {
                        if (i50 >= i49) {
                            parsableByteArray5.G(i49);
                        } else {
                            if (parsableByteArray5.f18956a[i48 + i50] != -1) {
                                jV = iB4 == 0 ? parsableByteArray5.v() : parsableByteArray5.y();
                                if (jV != 0) {
                                    break;
                                }
                                break;
                            }
                            i50++;
                        }
                        jV = -9223372036854775807L;
                        break;
                    }
                    parsableByteArray5.G(16);
                    int iG13 = parsableByteArray5.g();
                    int iG14 = parsableByteArray5.g();
                    parsableByteArray5.G(4);
                    int iG15 = parsableByteArray5.g();
                    int iG16 = parsableByteArray5.g();
                    if (iG13 == 0 && iG14 == 65536) {
                        i3 = -65536;
                        if (iG15 == -65536 && iG16 == 0) {
                            i4 = 90;
                        }
                        tkhdData = new TkhdData(iG12, jV, i4);
                        if (j == -9223372036854775807L) {
                            j2 = jV;
                        } else {
                            j2 = j;
                        }
                        parsableByteArray = leafAtomD3.f17753b;
                        parsableByteArray.F(8);
                        if (Atom.b(parsableByteArray.g()) == 0) {
                            i5 = 8;
                        } else {
                            i5 = 16;
                        }
                        parsableByteArray.G(i5);
                        jV2 = parsableByteArray.v();
                        jF = j2 != -9223372036854775807L ? Util.F(j2, 1000000L, jV2) : -9223372036854775807L;
                        Atom.ContainerAtom containerAtomC3 = containerAtomC2.c(1835626086);
                        containerAtomC3.getClass();
                        Atom.ContainerAtom containerAtomC4 = containerAtomC3.c(1937007212);
                        containerAtomC4.getClass();
                        Atom.LeafAtom leafAtomD6 = containerAtomC2.d(1835296868);
                        leafAtomD6.getClass();
                        ParsableByteArray parsableByteArray6 = leafAtomD6.f17753b;
                        parsableByteArray6.F(8);
                        iB = Atom.b(parsableByteArray6.g());
                        if (iB == 0) {
                            i6 = 8;
                        } else {
                            i6 = 16;
                        }
                        parsableByteArray6.G(i6);
                        long jV4 = parsableByteArray6.v();
                        if (iB == 0) {
                            i7 = 4;
                        } else {
                            i7 = 8;
                        }
                        parsableByteArray6.G(i7);
                        int iZ4 = parsableByteArray6.z();
                        pairCreate = Pair.create(Long.valueOf(jV4), "" + ((char) (((iZ4 >> 10) & 31) + 96)) + ((char) (((iZ4 >> 5) & 31) + 96)) + ((char) ((iZ4 & 31) + 96)));
                        leafAtomD = containerAtomC4.d(1937011556);
                        if (leafAtomD != null) {
                            throw ParserException.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                        }
                        str = (String) pairCreate.second;
                        parsableByteArray2 = leafAtomD.f17753b;
                        parsableByteArray2.F(12);
                        iG = parsableByteArray2.g();
                        stsdData = new StsdData(iG);
                        i8 = 0;
                        while (true) {
                            trackEncryptionBoxArr = stsdData.f17764a;
                            if (i8 < iG) {
                                arrayList = arrayList2;
                                i9 = i47;
                                containerAtom2 = containerAtom4;
                                pair = pairCreate;
                                tkhdData2 = tkhdData;
                                i10 = i2;
                                stsdData2 = stsdData;
                                if (!z2) {
                                    containerAtom4 = containerAtom2;
                                    containerAtomC = containerAtom4.c(1701082227);
                                    if (containerAtomC == null) {
                                        leafAtomD2 = containerAtomC.d(1701606260);
                                        if (leafAtomD2 == null) {
                                            pairCreate2 = null;
                                        } else {
                                            parsableByteArray3 = leafAtomD2.f17753b;
                                            parsableByteArray3.F(8);
                                            iB2 = Atom.b(parsableByteArray3.g());
                                            iX = parsableByteArray3.x();
                                            jArr3 = new long[iX];
                                            jArr4 = new long[iX];
                                            for (i11 = 0; i11 < iX; i11++) {
                                                if (iB2 == 1) {
                                                    jV3 = parsableByteArray3.y();
                                                } else {
                                                    jV3 = parsableByteArray3.v();
                                                }
                                                jArr3[i11] = jV3;
                                                if (iB2 == 1) {
                                                    jG = parsableByteArray3.o();
                                                } else {
                                                    jG = parsableByteArray3.g();
                                                }
                                                jArr4[i11] = jG;
                                                if (parsableByteArray3.r() == 1) {
                                                    throw new IllegalArgumentException("Unsupported media rate.");
                                                }
                                                parsableByteArray3.G(2);
                                            }
                                            pairCreate2 = Pair.create(jArr3, jArr4);
                                        }
                                        if (pairCreate2 != null) {
                                            long[] jArr5 = (long[]) pairCreate2.first;
                                            jArr2 = (long[]) pairCreate2.second;
                                            jArr = jArr5;
                                        }
                                    }
                                    if (stsdData2.f17765b == null) {
                                        Track track3 = new Track(tkhdData2.f17774a, i10, ((Long) pair.first).longValue(), jV2, jF, stsdData2.f17765b, stsdData2.d, trackEncryptionBoxArr, stsdData2.f17766c, jArr, jArr2);
                                        function = function;
                                        track = track3;
                                        break;
                                    }
                                } else {
                                    containerAtom4 = containerAtom2;
                                }
                                jArr = null;
                                jArr2 = null;
                                if (stsdData2.f17765b == null) {
                                    Track track4 = new Track(tkhdData2.f17774a, i10, ((Long) pair.first).longValue(), jV2, jF, stsdData2.f17765b, stsdData2.d, trackEncryptionBoxArr, stsdData2.f17766c, jArr, jArr2);
                                    function = function;
                                    track = track4;
                                    break;
                                }
                            } else {
                                i12 = parsableByteArray2.f18957b;
                                int i51 = i47;
                                iG2 = parsableByteArray2.g();
                                int i52 = i2;
                                if (iG2 > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int i53 = iG;
                                String str17 = "childAtomSize must be positive";
                                ExtractorUtil.a("childAtomSize must be positive", z4);
                                iG3 = parsableByteArray2.g();
                                i13 = iG12;
                                if (iG3 != 1635148593 || iG3 == 1635148595 || iG3 == 1701733238 || iG3 == 1831958048 || iG3 == 1836070006 || iG3 == 1752589105 || iG3 == 1751479857 || iG3 == 1932670515 || iG3 == 1211250227 || iG3 == 1987063864 || iG3 == 1987063865 || iG3 == 1635135537 || iG3 == 1685479798 || iG3 == 1685479729 || iG3 == 1685481573 || iG3 == 1685481521) {
                                    arrayList2 = arrayList2;
                                    i14 = i4;
                                    containerAtom3 = containerAtom4;
                                    pair2 = pairCreate;
                                    tkhdData3 = tkhdData;
                                    str2 = "childAtomSize must be positive";
                                    i15 = i8;
                                    parsableByteArray2.F(i12 + 16);
                                    parsableByteArray2.G(16);
                                    iZ = parsableByteArray2.z();
                                    iZ2 = parsableByteArray2.z();
                                    parsableByteArray2.G(50);
                                    i16 = parsableByteArray2.f18957b;
                                    if (iG3 == 1701733238) {
                                        i17 = i12;
                                        pairC = c(parsableByteArray2, i17, i18);
                                        if (pairC != null) {
                                            iG3 = ((Integer) pairC.first).intValue();
                                            if (drmInitData == null) {
                                                i18 = iG2;
                                                drmInitDataA = null;
                                            } else {
                                                i18 = iG2;
                                                drmInitDataA = drmInitData.a(((TrackEncryptionBox) pairC.second).f17837b);
                                            }
                                            trackEncryptionBoxArr[i15] = (TrackEncryptionBox) pairC.second;
                                        } else {
                                            i18 = iG2;
                                            drmInitDataA = drmInitData;
                                        }
                                        parsableByteArray2.F(i16);
                                    } else {
                                        i17 = i12;
                                        i18 = iG2;
                                        drmInitDataA = drmInitData;
                                    }
                                    if (iG3 == 1831958048) {
                                        str3 = "video/mpeg";
                                    } else if (iG3 == 1211250227) {
                                        str3 = "video/3gpp";
                                    } else {
                                        str3 = null;
                                    }
                                    i19 = i16;
                                    i12 = i17;
                                    drmInitData2 = drmInitDataA;
                                    str4 = str;
                                    z5 = false;
                                    str5 = str3;
                                    fX = 1.0f;
                                    i20 = -1;
                                    i21 = -1;
                                    iB3 = -1;
                                    bArr = null;
                                    str6 = null;
                                    byteBufferOrder = null;
                                    esdsData = null;
                                    listZ = null;
                                    i22 = -1;
                                    while (true) {
                                        if (i19 - i12 >= i18) {
                                            bArr = bArr;
                                            break;
                                        }
                                        parsableByteArray2.F(i19);
                                        i27 = parsableByteArray2.f18957b;
                                        int i54 = i19;
                                        iG4 = parsableByteArray2.g();
                                        bArr = bArr;
                                        if (iG4 != 0 && parsableByteArray2.f18957b - i12 == i18) {
                                            break;
                                        }
                                        if (iG4 > 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        ExtractorUtil.a(str2, z6);
                                        iG5 = parsableByteArray2.g();
                                        int i55 = i18;
                                        if (iG5 == 1635148611) {
                                            if (str5 == null) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            ExtractorUtil.a(null, z8);
                                            parsableByteArray2.F(i27 + 8);
                                            avcConfigA = AvcConfig.a(parsableByteArray2);
                                            stsdData.f17766c = avcConfigA.f18988b;
                                            if (!z5) {
                                                fX = avcConfigA.f18990e;
                                            }
                                            ArrayList arrayList4 = avcConfigA.f18987a;
                                            iZ = iZ;
                                            iZ2 = iZ2;
                                            fX = fX;
                                            str6 = avcConfigA.f;
                                            listZ = arrayList4;
                                            str5 = "video/avc";
                                        } else {
                                            if (iG5 == 1752589123) {
                                                if (str5 == null) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                ExtractorUtil.a(null, z7);
                                                parsableByteArray2.F(i27 + 8);
                                                hevcConfigA = HevcConfig.a(parsableByteArray2);
                                                stsdData.f17766c = hevcConfigA.f19003b;
                                                if (!z5) {
                                                    fX = hevcConfigA.f19004c;
                                                }
                                                List list = hevcConfigA.f19002a;
                                                String str18 = hevcConfigA.g;
                                                int i56 = hevcConfigA.d;
                                                int i57 = hevcConfigA.f19005e;
                                                iB3 = hevcConfigA.f;
                                                i20 = i56;
                                                iZ = iZ;
                                                iZ2 = iZ2;
                                                fX = fX;
                                                listZ = list;
                                                str2 = str2;
                                                str6 = str18;
                                                iG3 = iG3;
                                                i21 = i57;
                                                stsdData5 = stsdData;
                                                bArr = bArr;
                                                str5 = "video/hevc";
                                            } else if (iG5 != 1685480259 || iG5 == 1685485123) {
                                                iZ = iZ;
                                                iZ2 = iZ2;
                                                fX = fX;
                                                str2 = str2;
                                                iG3 = iG3;
                                                stsdData5 = stsdData;
                                                str8 = str6;
                                                dolbyVisionConfigA = DolbyVisionConfig.a(parsableByteArray2);
                                                if (dolbyVisionConfigA != null) {
                                                    str6 = dolbyVisionConfigA.f18992a;
                                                    str5 = "video/dolby-vision";
                                                } else {
                                                    str6 = str8;
                                                }
                                                bArr = bArr;
                                            } else if (iG5 == 1987076931) {
                                                ExtractorUtil.a(null, str5 == null);
                                                String str19 = iG3 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                parsableByteArray2.F(i27 + 12);
                                                parsableByteArray2.G(2);
                                                boolean z12 = (parsableByteArray2.u() & 1) != 0;
                                                int iU = parsableByteArray2.u();
                                                int iU2 = parsableByteArray2.u();
                                                int iA = ColorInfo.a(iU);
                                                i21 = z12 ? 1 : 2;
                                                iB3 = ColorInfo.b(iU2);
                                                str5 = str19;
                                                i20 = iA;
                                            } else if (iG5 == 1635135811) {
                                                ExtractorUtil.a(null, str5 == null);
                                                str5 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                            } else if (iG5 == 1668050025) {
                                                if (byteBufferOrder == null) {
                                                    byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                }
                                                ByteBuffer byteBuffer = byteBufferOrder;
                                                byteBuffer.position(21);
                                                byteBuffer.putShort(parsableByteArray2.r());
                                                byteBuffer.putShort(parsableByteArray2.r());
                                                byteBufferOrder = byteBuffer;
                                            } else {
                                                if (iG5 == 1835295606) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBufferOrder;
                                                    short sR = parsableByteArray2.r();
                                                    short sR2 = parsableByteArray2.r();
                                                    str2 = str2;
                                                    short sR3 = parsableByteArray2.r();
                                                    iG3 = iG3;
                                                    short sR4 = parsableByteArray2.r();
                                                    stsdData5 = stsdData;
                                                    short sR5 = parsableByteArray2.r();
                                                    fX = fX;
                                                    short sR6 = parsableByteArray2.r();
                                                    iZ2 = iZ2;
                                                    short sR7 = parsableByteArray2.r();
                                                    iZ = iZ;
                                                    short sR8 = parsableByteArray2.r();
                                                    long jV5 = parsableByteArray2.v();
                                                    long jV6 = parsableByteArray2.v();
                                                    str9 = str6;
                                                    byteBuffer2.position(1);
                                                    byteBuffer2.putShort(sR5);
                                                    byteBuffer2.putShort(sR6);
                                                    byteBuffer2.putShort(sR);
                                                    byteBuffer2.putShort(sR2);
                                                    byteBuffer2.putShort(sR3);
                                                    byteBuffer2.putShort(sR4);
                                                    byteBuffer2.putShort(sR7);
                                                    byteBuffer2.putShort(sR8);
                                                    byteBuffer2.putShort((short) (jV5 / 10000));
                                                    byteBuffer2.putShort((short) (jV6 / 10000));
                                                    byteBufferOrder = byteBuffer2;
                                                } else {
                                                    iZ = iZ;
                                                    iZ2 = iZ2;
                                                    fX = fX;
                                                    str2 = str2;
                                                    iG3 = iG3;
                                                    stsdData5 = stsdData;
                                                    str9 = str6;
                                                    if (iG5 == 1681012275) {
                                                        ExtractorUtil.a(null, str5 == null);
                                                        str5 = "video/3gpp";
                                                    } else {
                                                        if (iG5 == 1702061171) {
                                                            ExtractorUtil.a(null, str5 == null);
                                                            EsdsData esdsDataA2 = a(i27, parsableByteArray2);
                                                            byte[] bArr3 = esdsDataA2.f17762b;
                                                            esdsData = esdsDataA2;
                                                            listZ = bArr3 != null ? ImmutableList.z(bArr3) : listZ;
                                                            str5 = esdsDataA2.f17761a;
                                                            bArr = bArr;
                                                        } else if (iG5 == 1885434736) {
                                                            parsableByteArray2.F(i27 + 8);
                                                            fX = parsableByteArray2.x() / parsableByteArray2.x();
                                                            bArr = bArr;
                                                            str6 = str9;
                                                            z5 = true;
                                                        } else if (iG5 == 1937126244) {
                                                            int i58 = i27 + 8;
                                                            while (true) {
                                                                if (i58 - i27 >= iG4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                parsableByteArray2.F(i58);
                                                                int iG17 = parsableByteArray2.g();
                                                                if (parsableByteArray2.g() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(parsableByteArray2.f18956a, i58, iG17 + i58);
                                                                    break;
                                                                }
                                                                i58 += iG17;
                                                            }
                                                            bArr = bArrCopyOfRange;
                                                        } else {
                                                            if (iG5 == 1936995172) {
                                                                int iU3 = parsableByteArray2.u();
                                                                parsableByteArray2.G(3);
                                                                if (iU3 == 0) {
                                                                    int iU4 = parsableByteArray2.u();
                                                                    if (iU4 == 0) {
                                                                        i22 = 0;
                                                                    } else if (iU4 == 1) {
                                                                        i22 = 1;
                                                                    } else if (iU4 == 2) {
                                                                        i22 = 2;
                                                                    } else if (iU4 == 3) {
                                                                        i22 = 3;
                                                                    }
                                                                }
                                                            } else if (iG5 == 1668246642 && i20 == -1 && i21 == -1 && iB3 == -1) {
                                                                int iG18 = parsableByteArray2.g();
                                                                if (iG18 == 1852009592 || iG18 == 1852009571) {
                                                                    int iZ5 = parsableByteArray2.z();
                                                                    int iZ6 = parsableByteArray2.z();
                                                                    parsableByteArray2.G(2);
                                                                    boolean z13 = iG4 == 19 && (parsableByteArray2.u() & 128) != 0;
                                                                    int iA2 = ColorInfo.a(iZ5);
                                                                    int i59 = z13 ? 1 : 2;
                                                                    iB3 = ColorInfo.b(iZ6);
                                                                    i21 = i59;
                                                                    bArr = bArr;
                                                                    str6 = str9;
                                                                    i20 = iA2;
                                                                } else {
                                                                    Log.g("AtomParsers", "Unsupported color type: " + Atom.a(iG18));
                                                                }
                                                            }
                                                            bArr = bArr;
                                                            str6 = str9;
                                                        }
                                                        str6 = str9;
                                                    }
                                                }
                                                str6 = str9;
                                            }
                                            i19 = i54 + iG4;
                                            i18 = i55;
                                            str2 = str2;
                                            iG3 = iG3;
                                            stsdData = stsdData5;
                                            fX = fX;
                                            iZ2 = iZ2;
                                            iZ = iZ;
                                        }
                                        stsdData5 = stsdData;
                                        i19 = i54 + iG4;
                                        i18 = i55;
                                        str2 = str2;
                                        iG3 = iG3;
                                        stsdData = stsdData5;
                                        fX = fX;
                                        iZ2 = iZ2;
                                        iZ = iZ;
                                    }
                                    i23 = iZ;
                                    i24 = iZ2;
                                    f = fX;
                                    i25 = i18;
                                    stsdData3 = stsdData;
                                    str7 = str6;
                                    if (str5 == null) {
                                        i26 = i14;
                                        stsdData4 = stsdData3;
                                    } else {
                                        builder = new Format.Builder();
                                        builder.f17081a = Integer.toString(i13);
                                        builder.k = str5;
                                        builder.f17085h = str7;
                                        builder.f17089p = i23;
                                        builder.q = i24;
                                        builder.t = f;
                                        i26 = i14;
                                        builder.s = i26;
                                        builder.f17090u = bArr;
                                        builder.v = i22;
                                        builder.m = listZ;
                                        builder.f17088n = drmInitData2;
                                        if (i20 == -1 || i21 != -1 || iB3 != -1 || byteBufferOrder != null) {
                                            if (byteBufferOrder != null) {
                                                bArrArray = byteBufferOrder.array();
                                            } else {
                                                bArrArray = null;
                                            }
                                            builder.f17091w = new ColorInfo(i20, i21, iB3, bArrArray);
                                        }
                                        if (esdsData != null) {
                                            EsdsData esdsData4 = esdsData;
                                            builder.f = Ints.e(esdsData4.f17763c);
                                            builder.g = Ints.e(esdsData4.d);
                                        }
                                        Format format = new Format(builder);
                                        stsdData4 = stsdData3;
                                        stsdData4.f17765b = format;
                                    }
                                } else {
                                    i15 = i8;
                                    if (iG3 == 1836069985 || iG3 == 1701733217 || iG3 == 1633889587 || iG3 == 1700998451 || iG3 == 1633889588 || iG3 == 1835823201 || iG3 == 1685353315 || iG3 == 1685353317 || iG3 == 1685353320 || iG3 == 1685353324 || iG3 == 1685353336 || iG3 == 1935764850 || iG3 == 1935767394 || iG3 == 1819304813 || iG3 == 1936684916 || iG3 == 1953984371 || iG3 == 778924082 || iG3 == 778924083 || iG3 == 1835557169 || iG3 == 1835560241 || iG3 == 1634492771 || iG3 == 1634492791 || iG3 == 1970037111 || iG3 == 1332770163 || iG3 == 1716281667) {
                                        arrayList2 = arrayList2;
                                        parsableByteArray2.F(i12 + 16);
                                        if (z3) {
                                            iZ3 = parsableByteArray2.z();
                                            parsableByteArray2.G(6);
                                        } else {
                                            parsableByteArray2.G(8);
                                            iZ3 = 0;
                                        }
                                        if (iZ3 == 0 || iZ3 == 1) {
                                            int iZ7 = parsableByteArray2.z();
                                            parsableByteArray2.G(6);
                                            byte[] bArr4 = parsableByteArray2.f18956a;
                                            int i60 = parsableByteArray2.f18957b;
                                            int i61 = i60 + 1;
                                            parsableByteArray2.f18957b = i61;
                                            int i62 = (bArr4[i60] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                            parsableByteArray2.f18957b = i60 + 2;
                                            i28 = i62 | (bArr4[i61] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                            parsableByteArray2.f18957b = i60 + 4;
                                            parsableByteArray2.F(i60);
                                            iG6 = parsableByteArray2.g();
                                            if (iZ3 == 1) {
                                                parsableByteArray2.G(16);
                                            }
                                            iX2 = iZ7;
                                        } else {
                                            if (iZ3 == 2) {
                                                parsableByteArray2.G(16);
                                                int iRound = (int) Math.round(Double.longBitsToDouble(parsableByteArray2.o()));
                                                iX2 = parsableByteArray2.x();
                                                parsableByteArray2.G(20);
                                                i28 = iRound;
                                                iG6 = 0;
                                            } else {
                                                i12 = i12;
                                                i30 = i4;
                                                i29 = iG2;
                                                containerAtom3 = containerAtom4;
                                                pair2 = pairCreate;
                                                tkhdData3 = tkhdData;
                                            }
                                            str4 = str;
                                            stsdData4 = stsdData;
                                            i26 = i30;
                                            i25 = i29;
                                        }
                                        int i63 = parsableByteArray2.f18957b;
                                        int i64 = iX2;
                                        if (iG3 == 1701733217) {
                                            Pair pairC2 = c(parsableByteArray2, i12, iG2);
                                            if (pairC2 != null) {
                                                int iIntValue2 = ((Integer) pairC2.first).intValue();
                                                DrmInitData drmInitDataA2 = drmInitData == null ? null : drmInitData.a(((TrackEncryptionBox) pairC2.second).f17837b);
                                                trackEncryptionBoxArr[i15] = (TrackEncryptionBox) pairC2.second;
                                                drmInitData3 = drmInitDataA2;
                                                iG3 = iIntValue2;
                                            } else {
                                                drmInitData3 = drmInitData;
                                            }
                                            parsableByteArray2.F(i63);
                                        } else {
                                            drmInitData3 = drmInitData;
                                        }
                                        String str20 = "audio/ac3";
                                        tkhdData3 = tkhdData;
                                        if (iG3 == 1633889587) {
                                            str10 = "audio/ac3";
                                        } else if (iG3 == 1700998451) {
                                            str10 = "audio/eac3";
                                        } else if (iG3 == 1633889588) {
                                            str10 = "audio/ac4";
                                        } else if (iG3 == 1685353315) {
                                            str10 = "audio/vnd.dts";
                                        } else if (iG3 == 1685353320 || iG3 == 1685353324) {
                                            str10 = "audio/vnd.dts.hd";
                                        } else if (iG3 == 1685353317) {
                                            str10 = "audio/vnd.dts.hd;profile=lbr";
                                        } else if (iG3 == 1685353336) {
                                            str10 = "audio/vnd.dts.uhd;profile=p2";
                                        } else if (iG3 == 1935764850) {
                                            str10 = "audio/3gpp";
                                        } else if (iG3 == 1935767394) {
                                            str10 = "audio/amr-wb";
                                        } else {
                                            if (iG3 == 1819304813 || iG3 == 1936684916) {
                                                str10 = "audio/raw";
                                                i31 = 2;
                                            } else if (iG3 == 1953984371) {
                                                i31 = 268435456;
                                                str10 = "audio/raw";
                                            } else if (iG3 == 778924082 || iG3 == 778924083) {
                                                str10 = "audio/mpeg";
                                            } else if (iG3 == 1835557169) {
                                                str10 = "audio/mha1";
                                            } else if (iG3 == 1835560241) {
                                                str10 = "audio/mhm1";
                                            } else if (iG3 == 1634492771) {
                                                str10 = "audio/alac";
                                            } else if (iG3 == 1634492791) {
                                                str10 = "audio/g711-alaw";
                                            } else if (iG3 == 1970037111) {
                                                str10 = "audio/g711-mlaw";
                                            } else if (iG3 == 1332770163) {
                                                str10 = "audio/opus";
                                            } else if (iG3 == 1716281667) {
                                                str10 = "audio/flac";
                                            } else {
                                                str10 = iG3 == 1835823201 ? "audio/true-hd" : null;
                                            }
                                            i12 = i12;
                                            i30 = i4;
                                            containerAtom3 = containerAtom4;
                                            pair2 = pairCreate;
                                            i32 = i28;
                                            iIntValue = i64;
                                            i33 = i63;
                                            str11 = null;
                                            esdsData2 = null;
                                            listZ2 = null;
                                            while (i33 - i12 < iG2) {
                                                parsableByteArray2.F(i33);
                                                iG7 = parsableByteArray2.g();
                                                int i65 = iG2;
                                                if (iG7 > 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                ExtractorUtil.a(str17, z9);
                                                iG8 = parsableByteArray2.g();
                                                int i66 = i31;
                                                if (iG8 == 1835557187) {
                                                    int i67 = iG7 - 13;
                                                    byte[] bArr5 = new byte[i67];
                                                    parsableByteArray2.F(i33 + 13);
                                                    parsableByteArray2.e(bArr5, 0, i67);
                                                    listZ2 = ImmutableList.z(bArr5);
                                                    i39 = i33;
                                                    str14 = str17;
                                                    str20 = str20;
                                                    str11 = str11;
                                                    i40 = iG7;
                                                } else {
                                                    str11 = str11;
                                                    i35 = 1702061171;
                                                    if (iG8 == 1702061171) {
                                                        i36 = iG7;
                                                        i37 = i33;
                                                        str13 = str17;
                                                        str20 = str20;
                                                        if (iG8 != i35) {
                                                            i38 = parsableByteArray2.f18957b;
                                                            i39 = i37;
                                                            if (i38 >= i39) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            ExtractorUtil.a(null, z10);
                                                            while (true) {
                                                                i40 = i36;
                                                                if (i38 - i39 >= i40) {
                                                                    str14 = str13;
                                                                    i38 = -1;
                                                                    break;
                                                                }
                                                                parsableByteArray2.F(i38);
                                                                iG9 = parsableByteArray2.g();
                                                                if (iG9 > 0) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                str14 = str13;
                                                                ExtractorUtil.a(str14, z11);
                                                                if (parsableByteArray2.g() == 1702061171) {
                                                                    break;
                                                                }
                                                                i38 += iG9;
                                                                str13 = str14;
                                                                i36 = i40;
                                                            }
                                                        } else {
                                                            i38 = i37;
                                                            i39 = i38;
                                                            str14 = str13;
                                                            i40 = i36;
                                                        }
                                                        if (i38 != -1) {
                                                            esdsDataA = a(i38, parsableByteArray2);
                                                            str10 = esdsDataA.f17761a;
                                                            bArr2 = esdsDataA.f17762b;
                                                            if (bArr2 != null) {
                                                                if ("audio/mp4a-latm".equals(str10)) {
                                                                    AacUtil.Config configB = AacUtil.b(new ParsableBitArray(bArr2, bArr2.length), false);
                                                                    i32 = configB.f17268a;
                                                                    int i68 = configB.f17269b;
                                                                    str11 = configB.f17270c;
                                                                    iIntValue = i68;
                                                                }
                                                                iIntValue = iIntValue;
                                                                esdsData3 = esdsDataA;
                                                                listZ3 = ImmutableList.z(bArr2);
                                                            } else {
                                                                esdsData3 = esdsDataA;
                                                            }
                                                            str11 = str11;
                                                            esdsData2 = esdsData3;
                                                            listZ2 = listZ3;
                                                            iIntValue = iIntValue;
                                                        } else {
                                                            esdsData3 = esdsData2;
                                                        }
                                                        listZ3 = listZ2;
                                                        str11 = str11;
                                                        esdsData2 = esdsData3;
                                                        listZ2 = listZ3;
                                                        iIntValue = iIntValue;
                                                    } else if (z3 || iG8 != 2002876005) {
                                                        iArr = Ac3Util.d;
                                                        iArr2 = Ac3Util.f17272b;
                                                        if (iG8 == 1684103987) {
                                                            parsableByteArray2.F(i33 + 8);
                                                            String string = Integer.toString(i13);
                                                            parsableBitArray2 = new ParsableBitArray();
                                                            parsableBitArray2.j(parsableByteArray2);
                                                            int i69 = iArr2[parsableBitArray2.g(2)];
                                                            str15 = str17;
                                                            parsableBitArray2.n(8);
                                                            i45 = iArr[parsableBitArray2.g(3)];
                                                            if (parsableBitArray2.g(1) != 0) {
                                                                i46 = i45 + 1;
                                                            } else {
                                                                i46 = i45;
                                                            }
                                                            i41 = iG7;
                                                            int i70 = Ac3Util.f17274e[parsableBitArray2.g(5)] * 1000;
                                                            parsableBitArray2.c();
                                                            parsableByteArray2.F(parsableBitArray2.d());
                                                            Format.Builder builder3 = new Format.Builder();
                                                            builder3.f17081a = string;
                                                            builder3.k = str20;
                                                            builder3.x = i46;
                                                            builder3.y = i69;
                                                            builder3.f17088n = drmInitData3;
                                                            builder3.f17083c = str;
                                                            builder3.f = i70;
                                                            builder3.g = i70;
                                                            stsdData.f17765b = new Format(builder3);
                                                        } else {
                                                            i41 = iG7;
                                                            str15 = str17;
                                                            if (iG8 == 1684366131) {
                                                                parsableByteArray2.F(i33 + 8);
                                                                String string2 = Integer.toString(i13);
                                                                parsableBitArray = new ParsableBitArray();
                                                                parsableBitArray.j(parsableByteArray2);
                                                                int iG19 = parsableBitArray.g(13) * 1000;
                                                                parsableBitArray.n(3);
                                                                int i71 = iArr2[parsableBitArray.g(2)];
                                                                parsableBitArray.n(10);
                                                                i43 = iArr[parsableBitArray.g(3)];
                                                                if (parsableBitArray.g(1) != 0) {
                                                                    i43++;
                                                                }
                                                                parsableBitArray.n(3);
                                                                iG10 = parsableBitArray.g(4);
                                                                parsableBitArray.n(1);
                                                                i44 = i43;
                                                                if (iG10 > 0) {
                                                                    parsableBitArray.o(6);
                                                                    if (parsableBitArray.g(1) != 0) {
                                                                        i44 += 2;
                                                                    }
                                                                    parsableBitArray.n(1);
                                                                    i43 = i44;
                                                                }
                                                                if (parsableBitArray.b() > 7) {
                                                                    parsableBitArray.n(7);
                                                                    if (parsableBitArray.g(1) != 0) {
                                                                        str16 = "audio/eac3-joc";
                                                                    } else {
                                                                        str16 = "audio/eac3";
                                                                    }
                                                                } else {
                                                                    str16 = "audio/eac3";
                                                                }
                                                                parsableBitArray.c();
                                                                parsableByteArray2.F(parsableBitArray.d());
                                                                Format.Builder builder4 = new Format.Builder();
                                                                builder4.f17081a = string2;
                                                                builder4.k = str16;
                                                                builder4.x = i43;
                                                                builder4.y = i71;
                                                                builder4.f17088n = drmInitData3;
                                                                builder4.f17083c = str;
                                                                builder4.g = iG19;
                                                                stsdData.f17765b = new Format(builder4);
                                                            } else {
                                                                i33 = i33;
                                                                str20 = str20;
                                                                if (iG8 == 1684103988) {
                                                                    parsableByteArray2.F(i33 + 8);
                                                                    String string3 = Integer.toString(i13);
                                                                    parsableByteArray2.G(1);
                                                                    if (((parsableByteArray2.u() & 32) >> 5) == 1) {
                                                                        i42 = 48000;
                                                                    } else {
                                                                        i42 = 44100;
                                                                    }
                                                                    Format.Builder builder5 = new Format.Builder();
                                                                    builder5.f17081a = string3;
                                                                    builder5.k = "audio/ac4";
                                                                    builder5.x = 2;
                                                                    builder5.y = i42;
                                                                    builder5.f17088n = drmInitData3;
                                                                    builder5.f17083c = str;
                                                                    stsdData.f17765b = new Format(builder5);
                                                                } else if (iG8 == 1684892784) {
                                                                    if (iG6 > 0) {
                                                                        throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iG6);
                                                                    }
                                                                    i32 = iG6;
                                                                    i39 = i33;
                                                                    str14 = str15;
                                                                    i40 = i41;
                                                                    iIntValue = 2;
                                                                } else if (iG8 != 1684305011 || iG8 == 1969517683) {
                                                                    Format.Builder builder6 = new Format.Builder();
                                                                    builder6.f17081a = Integer.toString(i13);
                                                                    builder6.k = str10;
                                                                    builder6.x = iIntValue;
                                                                    builder6.y = i32;
                                                                    builder6.f17088n = drmInitData3;
                                                                    builder6.f17083c = str;
                                                                    stsdData.f17765b = new Format(builder6);
                                                                } else {
                                                                    if (iG8 == 1682927731) {
                                                                        int i72 = i41 - 8;
                                                                        byte[] bArr6 = f17754a;
                                                                        byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i72);
                                                                        parsableByteArray2.F(i33 + 8);
                                                                        parsableByteArray2.e(bArrCopyOf, bArr6.length, i72);
                                                                        listZ4 = OpusUtil.a(bArrCopyOf);
                                                                    } else if (iG8 == 1684425825) {
                                                                        byte[] bArr7 = new byte[i41 - 8];
                                                                        bArr7[0] = 102;
                                                                        bArr7[1] = 76;
                                                                        bArr7[2] = 97;
                                                                        bArr7[3] = 67;
                                                                        parsableByteArray2.F(i33 + 12);
                                                                        parsableByteArray2.e(bArr7, 4, i41 - 12);
                                                                        listZ4 = ImmutableList.z(bArr7);
                                                                    } else if (iG8 == 1634492771) {
                                                                        int i73 = i41 - 12;
                                                                        byte[] bArr8 = new byte[i73];
                                                                        parsableByteArray2.F(i33 + 12);
                                                                        parsableByteArray2.e(bArr8, 0, i73);
                                                                        ParsableByteArray parsableByteArray7 = new ParsableByteArray(bArr8);
                                                                        parsableByteArray7.F(9);
                                                                        int iU5 = parsableByteArray7.u();
                                                                        parsableByteArray7.F(20);
                                                                        Pair pairCreate3 = Pair.create(Integer.valueOf(parsableByteArray7.x()), Integer.valueOf(iU5));
                                                                        int iIntValue3 = ((Integer) pairCreate3.first).intValue();
                                                                        iIntValue = ((Integer) pairCreate3.second).intValue();
                                                                        listZ2 = ImmutableList.z(bArr8);
                                                                        i32 = iIntValue3;
                                                                    }
                                                                    listZ2 = listZ4;
                                                                }
                                                                i39 = i33;
                                                                str14 = str15;
                                                                i40 = i41;
                                                            }
                                                        }
                                                        i39 = i33;
                                                        str14 = str15;
                                                        i40 = i41;
                                                    } else {
                                                        i35 = 1702061171;
                                                        i36 = iG7;
                                                        i37 = i33;
                                                        str13 = str17;
                                                        str20 = str20;
                                                        if (iG8 != i35) {
                                                            i38 = parsableByteArray2.f18957b;
                                                            i39 = i37;
                                                            if (i38 >= i39) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            ExtractorUtil.a(null, z10);
                                                            while (true) {
                                                                i40 = i36;
                                                                if (i38 - i39 >= i40) {
                                                                    str14 = str13;
                                                                    i38 = -1;
                                                                    break;
                                                                }
                                                                parsableByteArray2.F(i38);
                                                                iG9 = parsableByteArray2.g();
                                                                if (iG9 > 0) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                str14 = str13;
                                                                ExtractorUtil.a(str14, z11);
                                                                if (parsableByteArray2.g() == 1702061171) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i38 += iG9;
                                                                str13 = str14;
                                                                i36 = i40;
                                                            }
                                                        } else {
                                                            i38 = i37;
                                                            i39 = i38;
                                                            str14 = str13;
                                                            i40 = i36;
                                                        }
                                                        if (i38 != -1) {
                                                            esdsDataA = a(i38, parsableByteArray2);
                                                            str10 = esdsDataA.f17761a;
                                                            bArr2 = esdsDataA.f17762b;
                                                            if (bArr2 != null) {
                                                                if ("audio/mp4a-latm".equals(str10)) {
                                                                    AacUtil.Config configB2 = AacUtil.b(new ParsableBitArray(bArr2, bArr2.length), false);
                                                                    i32 = configB2.f17268a;
                                                                    int i610 = configB2.f17269b;
                                                                    str11 = configB2.f17270c;
                                                                    iIntValue = i610;
                                                                }
                                                                iIntValue = iIntValue;
                                                                esdsData3 = esdsDataA;
                                                                listZ3 = ImmutableList.z(bArr2);
                                                            } else {
                                                                esdsData3 = esdsDataA;
                                                            }
                                                            str11 = str11;
                                                            esdsData2 = esdsData3;
                                                            listZ2 = listZ3;
                                                            iIntValue = iIntValue;
                                                        } else {
                                                            esdsData3 = esdsData2;
                                                        }
                                                        listZ3 = listZ2;
                                                        str11 = str11;
                                                        esdsData2 = esdsData3;
                                                        listZ2 = listZ3;
                                                        iIntValue = iIntValue;
                                                    }
                                                }
                                                int i74 = i39 + i40;
                                                str17 = str14;
                                                i31 = i66;
                                                iG2 = i65;
                                                str20 = str20;
                                                i33 = i74;
                                            }
                                            str12 = str11;
                                            i29 = iG2;
                                            i34 = i31;
                                            if (stsdData.f17765b == null && str10 != null) {
                                                builder2 = new Format.Builder();
                                                builder2.f17081a = Integer.toString(i13);
                                                builder2.k = str10;
                                                builder2.f17085h = str12;
                                                builder2.x = iIntValue;
                                                builder2.y = i32;
                                                builder2.f17092z = i34;
                                                builder2.m = listZ2;
                                                builder2.f17088n = drmInitData3;
                                                builder2.f17083c = str;
                                                if (esdsData2 != null) {
                                                    EsdsData esdsData5 = esdsData2;
                                                    builder2.f = Ints.e(esdsData5.f17763c);
                                                    builder2.g = Ints.e(esdsData5.d);
                                                }
                                                stsdData.f17765b = new Format(builder2);
                                            }
                                            str4 = str;
                                            stsdData4 = stsdData;
                                            i26 = i30;
                                            i25 = i29;
                                        }
                                        i31 = -1;
                                        i12 = i12;
                                        i30 = i4;
                                        containerAtom3 = containerAtom4;
                                        pair2 = pairCreate;
                                        i32 = i28;
                                        iIntValue = i64;
                                        i33 = i63;
                                        str11 = null;
                                        esdsData2 = null;
                                        listZ2 = null;
                                        while (i33 - i12 < iG2) {
                                            parsableByteArray2.F(i33);
                                            iG7 = parsableByteArray2.g();
                                            int i611 = iG2;
                                            if (iG7 > 0) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            ExtractorUtil.a(str17, z9);
                                            iG8 = parsableByteArray2.g();
                                            int i612 = i31;
                                            if (iG8 == 1835557187) {
                                                int i613 = iG7 - 13;
                                                byte[] bArr9 = new byte[i613];
                                                parsableByteArray2.F(i33 + 13);
                                                parsableByteArray2.e(bArr9, 0, i613);
                                                listZ2 = ImmutableList.z(bArr9);
                                                i39 = i33;
                                                str14 = str17;
                                                str20 = str20;
                                                str11 = str11;
                                                i40 = iG7;
                                            } else {
                                                str11 = str11;
                                                i35 = 1702061171;
                                                if (iG8 == 1702061171) {
                                                    i36 = iG7;
                                                    i37 = i33;
                                                    str13 = str17;
                                                    str20 = str20;
                                                    if (iG8 != i35) {
                                                        i38 = parsableByteArray2.f18957b;
                                                        i39 = i37;
                                                        if (i38 >= i39) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        ExtractorUtil.a(null, z10);
                                                        while (true) {
                                                            i40 = i36;
                                                            if (i38 - i39 >= i40) {
                                                                str14 = str13;
                                                                i38 = -1;
                                                                break;
                                                            }
                                                            parsableByteArray2.F(i38);
                                                            iG9 = parsableByteArray2.g();
                                                            if (iG9 > 0) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            str14 = str13;
                                                            ExtractorUtil.a(str14, z11);
                                                            if (parsableByteArray2.g() == 1702061171) {
                                                                break;
                                                                break;
                                                            }
                                                            i38 += iG9;
                                                            str13 = str14;
                                                            i36 = i40;
                                                        }
                                                    } else {
                                                        i38 = i37;
                                                        i39 = i38;
                                                        str14 = str13;
                                                        i40 = i36;
                                                    }
                                                    if (i38 != -1) {
                                                        esdsDataA = a(i38, parsableByteArray2);
                                                        str10 = esdsDataA.f17761a;
                                                        bArr2 = esdsDataA.f17762b;
                                                        if (bArr2 != null) {
                                                            if ("audio/mp4a-latm".equals(str10)) {
                                                                AacUtil.Config configB3 = AacUtil.b(new ParsableBitArray(bArr2, bArr2.length), false);
                                                                i32 = configB3.f17268a;
                                                                int i614 = configB3.f17269b;
                                                                str11 = configB3.f17270c;
                                                                iIntValue = i614;
                                                            }
                                                            iIntValue = iIntValue;
                                                            esdsData3 = esdsDataA;
                                                            listZ3 = ImmutableList.z(bArr2);
                                                        } else {
                                                            esdsData3 = esdsDataA;
                                                        }
                                                        str11 = str11;
                                                        esdsData2 = esdsData3;
                                                        listZ2 = listZ3;
                                                        iIntValue = iIntValue;
                                                    } else {
                                                        esdsData3 = esdsData2;
                                                    }
                                                    listZ3 = listZ2;
                                                    str11 = str11;
                                                    esdsData2 = esdsData3;
                                                    listZ2 = listZ3;
                                                    iIntValue = iIntValue;
                                                } else {
                                                    if (z3) {
                                                    }
                                                    iArr = Ac3Util.d;
                                                    iArr2 = Ac3Util.f17272b;
                                                    if (iG8 == 1684103987) {
                                                        parsableByteArray2.F(i33 + 8);
                                                        String string4 = Integer.toString(i13);
                                                        parsableBitArray2 = new ParsableBitArray();
                                                        parsableBitArray2.j(parsableByteArray2);
                                                        int i615 = iArr2[parsableBitArray2.g(2)];
                                                        str15 = str17;
                                                        parsableBitArray2.n(8);
                                                        i45 = iArr[parsableBitArray2.g(3)];
                                                        if (parsableBitArray2.g(1) != 0) {
                                                            i46 = i45 + 1;
                                                        } else {
                                                            i46 = i45;
                                                        }
                                                        i41 = iG7;
                                                        int i75 = Ac3Util.f17274e[parsableBitArray2.g(5)] * 1000;
                                                        parsableBitArray2.c();
                                                        parsableByteArray2.F(parsableBitArray2.d());
                                                        Format.Builder builder7 = new Format.Builder();
                                                        builder7.f17081a = string4;
                                                        builder7.k = str20;
                                                        builder7.x = i46;
                                                        builder7.y = i615;
                                                        builder7.f17088n = drmInitData3;
                                                        builder7.f17083c = str;
                                                        builder7.f = i75;
                                                        builder7.g = i75;
                                                        stsdData.f17765b = new Format(builder7);
                                                    } else {
                                                        i41 = iG7;
                                                        str15 = str17;
                                                        if (iG8 == 1684366131) {
                                                            parsableByteArray2.F(i33 + 8);
                                                            String string5 = Integer.toString(i13);
                                                            parsableBitArray = new ParsableBitArray();
                                                            parsableBitArray.j(parsableByteArray2);
                                                            int iG110 = parsableBitArray.g(13) * 1000;
                                                            parsableBitArray.n(3);
                                                            int i76 = iArr2[parsableBitArray.g(2)];
                                                            parsableBitArray.n(10);
                                                            i43 = iArr[parsableBitArray.g(3)];
                                                            if (parsableBitArray.g(1) != 0) {
                                                                i43++;
                                                            }
                                                            parsableBitArray.n(3);
                                                            iG10 = parsableBitArray.g(4);
                                                            parsableBitArray.n(1);
                                                            i44 = i43;
                                                            if (iG10 > 0) {
                                                                parsableBitArray.o(6);
                                                                if (parsableBitArray.g(1) != 0) {
                                                                    i44 += 2;
                                                                }
                                                                parsableBitArray.n(1);
                                                                i43 = i44;
                                                            }
                                                            if (parsableBitArray.b() > 7) {
                                                                parsableBitArray.n(7);
                                                                if (parsableBitArray.g(1) != 0) {
                                                                    str16 = "audio/eac3-joc";
                                                                } else {
                                                                    str16 = "audio/eac3";
                                                                }
                                                            } else {
                                                                str16 = "audio/eac3";
                                                            }
                                                            parsableBitArray.c();
                                                            parsableByteArray2.F(parsableBitArray.d());
                                                            Format.Builder builder8 = new Format.Builder();
                                                            builder8.f17081a = string5;
                                                            builder8.k = str16;
                                                            builder8.x = i43;
                                                            builder8.y = i76;
                                                            builder8.f17088n = drmInitData3;
                                                            builder8.f17083c = str;
                                                            builder8.g = iG110;
                                                            stsdData.f17765b = new Format(builder8);
                                                        } else {
                                                            i33 = i33;
                                                            str20 = str20;
                                                            if (iG8 == 1684103988) {
                                                                parsableByteArray2.F(i33 + 8);
                                                                String string6 = Integer.toString(i13);
                                                                parsableByteArray2.G(1);
                                                                if (((parsableByteArray2.u() & 32) >> 5) == 1) {
                                                                    i42 = 48000;
                                                                } else {
                                                                    i42 = 44100;
                                                                }
                                                                Format.Builder builder9 = new Format.Builder();
                                                                builder9.f17081a = string6;
                                                                builder9.k = "audio/ac4";
                                                                builder9.x = 2;
                                                                builder9.y = i42;
                                                                builder9.f17088n = drmInitData3;
                                                                builder9.f17083c = str;
                                                                stsdData.f17765b = new Format(builder9);
                                                            } else if (iG8 == 1684892784) {
                                                                if (iG6 > 0) {
                                                                    throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iG6);
                                                                }
                                                                i32 = iG6;
                                                                i39 = i33;
                                                                str14 = str15;
                                                                i40 = i41;
                                                                iIntValue = 2;
                                                            } else if (iG8 != 1684305011) {
                                                                Format.Builder builder10 = new Format.Builder();
                                                                builder10.f17081a = Integer.toString(i13);
                                                                builder10.k = str10;
                                                                builder10.x = iIntValue;
                                                                builder10.y = i32;
                                                                builder10.f17088n = drmInitData3;
                                                                builder10.f17083c = str;
                                                                stsdData.f17765b = new Format(builder10);
                                                            } else {
                                                                Format.Builder builder11 = new Format.Builder();
                                                                builder11.f17081a = Integer.toString(i13);
                                                                builder11.k = str10;
                                                                builder11.x = iIntValue;
                                                                builder11.y = i32;
                                                                builder11.f17088n = drmInitData3;
                                                                builder11.f17083c = str;
                                                                stsdData.f17765b = new Format(builder11);
                                                            }
                                                            i39 = i33;
                                                            str14 = str15;
                                                            i40 = i41;
                                                        }
                                                    }
                                                    i39 = i33;
                                                    str14 = str15;
                                                    i40 = i41;
                                                }
                                            }
                                            int i77 = i39 + i40;
                                            str17 = str14;
                                            i31 = i612;
                                            iG2 = i611;
                                            str20 = str20;
                                            i33 = i77;
                                        }
                                        str12 = str11;
                                        i29 = iG2;
                                        i34 = i31;
                                        if (stsdData.f17765b == null) {
                                            builder2 = new Format.Builder();
                                            builder2.f17081a = Integer.toString(i13);
                                            builder2.k = str10;
                                            builder2.f17085h = str12;
                                            builder2.x = iIntValue;
                                            builder2.y = i32;
                                            builder2.f17092z = i34;
                                            builder2.m = listZ2;
                                            builder2.f17088n = drmInitData3;
                                            builder2.f17083c = str;
                                            if (esdsData2 != null) {
                                                EsdsData esdsData6 = esdsData2;
                                                builder2.f = Ints.e(esdsData6.f17763c);
                                                builder2.g = Ints.e(esdsData6.d);
                                            }
                                            stsdData.f17765b = new Format(builder2);
                                        }
                                        str4 = str;
                                        stsdData4 = stsdData;
                                        i26 = i30;
                                        i25 = i29;
                                    } else {
                                        if (iG3 == 1414810956 || iG3 == 1954034535 || iG3 == 2004251764 || iG3 == 1937010800 || iG3 == 1664495672) {
                                            parsableByteArray2.F(i12 + 16);
                                            String str21 = "application/ttml+xml";
                                            if (iG3 == 1414810956) {
                                                j3 = Long.MAX_VALUE;
                                                immutableListZ = null;
                                            } else if (iG3 == 1954034535) {
                                                int i78 = iG2 - 16;
                                                byte[] bArr10 = new byte[i78];
                                                parsableByteArray2.e(bArr10, 0, i78);
                                                immutableListZ = ImmutableList.z(bArr10);
                                                str21 = "application/x-quicktime-tx3g";
                                                j3 = Long.MAX_VALUE;
                                            } else {
                                                if (iG3 == 2004251764) {
                                                    str21 = "application/x-mp4-vtt";
                                                } else {
                                                    if (iG3 == 1937010800) {
                                                        j3 = 0;
                                                    } else {
                                                        if (iG3 != 1664495672) {
                                                            throw new IllegalStateException();
                                                        }
                                                        stsdData.d = 1;
                                                        str21 = "application/x-mp4-cea-608";
                                                    }
                                                    immutableListZ = null;
                                                }
                                                j3 = Long.MAX_VALUE;
                                                immutableListZ = null;
                                            }
                                            Format.Builder builder12 = new Format.Builder();
                                            builder12.f17081a = Integer.toString(i13);
                                            builder12.k = str21;
                                            builder12.f17083c = str;
                                            builder12.o = j3;
                                            builder12.m = immutableListZ;
                                            stsdData.f17765b = new Format(builder12);
                                        } else if (iG3 == 1835365492) {
                                            parsableByteArray2.F(i12 + 16);
                                            if (iG3 == 1835365492) {
                                                parsableByteArray2.p();
                                                String strP = parsableByteArray2.p();
                                                if (strP != null) {
                                                    Format.Builder builder13 = new Format.Builder();
                                                    builder13.f17081a = Integer.toString(i13);
                                                    builder13.k = strP;
                                                    stsdData.f17765b = new Format(builder13);
                                                }
                                            }
                                        } else if (iG3 == 1667329389) {
                                            Format.Builder builder14 = new Format.Builder();
                                            builder14.f17081a = Integer.toString(i13);
                                            builder14.k = "application/x-camera-motion";
                                            stsdData.f17765b = new Format(builder14);
                                        }
                                        i26 = i4;
                                        i25 = iG2;
                                        containerAtom3 = containerAtom4;
                                        pair2 = pairCreate;
                                        tkhdData3 = tkhdData;
                                        str4 = str;
                                        stsdData4 = stsdData;
                                    }
                                }
                                parsableByteArray2.F(i12 + i25);
                                i8 = i15 + 1;
                                stsdData = stsdData4;
                                i4 = i26;
                                i2 = i52;
                                iG = i53;
                                i47 = i51;
                                iG12 = i13;
                                pairCreate = pair2;
                                str = str4;
                                containerAtom4 = containerAtom3;
                                arrayList2 = arrayList2;
                                tkhdData = tkhdData3;
                                drmInitData = drmInitData;
                            }
                        }
                        track2 = (Track) function.apply(track);
                        if (track2 == null) {
                            arrayList2 = arrayList;
                        } else {
                            Atom.ContainerAtom containerAtomC5 = containerAtom4.c(1835297121);
                            containerAtomC5.getClass();
                            Atom.ContainerAtom containerAtomC6 = containerAtomC5.c(1835626086);
                            containerAtomC6.getClass();
                            Atom.ContainerAtom containerAtomC7 = containerAtomC6.c(1937007212);
                            containerAtomC7.getClass();
                            TrackSampleTable trackSampleTableD = d(track2, containerAtomC7, gaplessInfoHolder);
                            arrayList2 = arrayList;
                            arrayList2.add(trackSampleTableD);
                        }
                    } else {
                        i3 = -65536;
                    }
                    if (iG13 == 0 && iG14 == i3) {
                        if (iG15 == 65536 && iG16 == 0) {
                            i4 = 270;
                        } else {
                            i3 = -65536;
                            if (iG13 != i3) {
                                i4 = 0;
                            } else {
                                i4 = 0;
                            }
                        }
                    } else if (iG13 != i3 && iG14 == 0 && iG15 == 0 && iG16 == i3) {
                        i4 = 180;
                    } else {
                        i4 = 0;
                    }
                    tkhdData = new TkhdData(iG12, jV, i4);
                    if (j == -9223372036854775807L) {
                        j2 = jV;
                    } else {
                        j2 = j;
                    }
                    parsableByteArray = leafAtomD3.f17753b;
                    parsableByteArray.F(8);
                    if (Atom.b(parsableByteArray.g()) == 0) {
                        i5 = 8;
                    } else {
                        i5 = 16;
                    }
                    parsableByteArray.G(i5);
                    jV2 = parsableByteArray.v();
                    if (j2 != -9223372036854775807L) {
                    }
                    Atom.ContainerAtom containerAtomC8 = containerAtomC2.c(1835626086);
                    containerAtomC8.getClass();
                    Atom.ContainerAtom containerAtomC9 = containerAtomC8.c(1937007212);
                    containerAtomC9.getClass();
                    Atom.LeafAtom leafAtomD7 = containerAtomC2.d(1835296868);
                    leafAtomD7.getClass();
                    ParsableByteArray parsableByteArray8 = leafAtomD7.f17753b;
                    parsableByteArray8.F(8);
                    iB = Atom.b(parsableByteArray8.g());
                    if (iB == 0) {
                        i6 = 8;
                    } else {
                        i6 = 16;
                    }
                    parsableByteArray8.G(i6);
                    long jV7 = parsableByteArray8.v();
                    if (iB == 0) {
                        i7 = 4;
                    } else {
                        i7 = 8;
                    }
                    parsableByteArray8.G(i7);
                    int iZ8 = parsableByteArray8.z();
                    pairCreate = Pair.create(Long.valueOf(jV7), "" + ((char) (((iZ8 >> 10) & 31) + 96)) + ((char) (((iZ8 >> 5) & 31) + 96)) + ((char) ((iZ8 & 31) + 96)));
                    leafAtomD = containerAtomC9.d(1937011556);
                    if (leafAtomD != null) {
                        throw ParserException.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                    }
                    str = (String) pairCreate.second;
                    parsableByteArray2 = leafAtomD.f17753b;
                    parsableByteArray2.F(12);
                    iG = parsableByteArray2.g();
                    stsdData = new StsdData(iG);
                    i8 = 0;
                    while (true) {
                        trackEncryptionBoxArr = stsdData.f17764a;
                        if (i8 < iG) {
                            arrayList = arrayList2;
                            i9 = i47;
                            containerAtom2 = containerAtom4;
                            pair = pairCreate;
                            tkhdData2 = tkhdData;
                            i10 = i2;
                            stsdData2 = stsdData;
                            if (!z2) {
                                containerAtom4 = containerAtom2;
                                containerAtomC = containerAtom4.c(1701082227);
                                if (containerAtomC == null) {
                                    leafAtomD2 = containerAtomC.d(1701606260);
                                    if (leafAtomD2 == null) {
                                        pairCreate2 = null;
                                    } else {
                                        parsableByteArray3 = leafAtomD2.f17753b;
                                        parsableByteArray3.F(8);
                                        iB2 = Atom.b(parsableByteArray3.g());
                                        iX = parsableByteArray3.x();
                                        jArr3 = new long[iX];
                                        jArr4 = new long[iX];
                                        while (i11 < iX) {
                                            if (iB2 == 1) {
                                                jV3 = parsableByteArray3.y();
                                            } else {
                                                jV3 = parsableByteArray3.v();
                                            }
                                            jArr3[i11] = jV3;
                                            if (iB2 == 1) {
                                                jG = parsableByteArray3.o();
                                            } else {
                                                jG = parsableByteArray3.g();
                                            }
                                            jArr4[i11] = jG;
                                            if (parsableByteArray3.r() == 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            parsableByteArray3.G(2);
                                        }
                                        pairCreate2 = Pair.create(jArr3, jArr4);
                                    }
                                    if (pairCreate2 != null) {
                                        long[] jArr6 = (long[]) pairCreate2.first;
                                        jArr2 = (long[]) pairCreate2.second;
                                        jArr = jArr6;
                                    }
                                }
                                if (stsdData2.f17765b == null) {
                                    Track track5 = new Track(tkhdData2.f17774a, i10, ((Long) pair.first).longValue(), jV2, jF, stsdData2.f17765b, stsdData2.d, trackEncryptionBoxArr, stsdData2.f17766c, jArr, jArr2);
                                    function = function;
                                    track = track5;
                                    break;
                                }
                            } else {
                                containerAtom4 = containerAtom2;
                            }
                            jArr = null;
                            jArr2 = null;
                            if (stsdData2.f17765b == null) {
                                Track track6 = new Track(tkhdData2.f17774a, i10, ((Long) pair.first).longValue(), jV2, jF, stsdData2.f17765b, stsdData2.d, trackEncryptionBoxArr, stsdData2.f17766c, jArr, jArr2);
                                function = function;
                                track = track6;
                                break;
                            }
                        } else {
                            i12 = parsableByteArray2.f18957b;
                            int i510 = i47;
                            iG2 = parsableByteArray2.g();
                            int i511 = i2;
                            if (iG2 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            int i512 = iG;
                            String str110 = "childAtomSize must be positive";
                            ExtractorUtil.a("childAtomSize must be positive", z4);
                            iG3 = parsableByteArray2.g();
                            i13 = iG12;
                            if (iG3 != 1635148593) {
                                arrayList2 = arrayList2;
                                i14 = i4;
                                containerAtom3 = containerAtom4;
                                pair2 = pairCreate;
                                tkhdData3 = tkhdData;
                                str2 = "childAtomSize must be positive";
                                i15 = i8;
                                parsableByteArray2.F(i12 + 16);
                                parsableByteArray2.G(16);
                                iZ = parsableByteArray2.z();
                                iZ2 = parsableByteArray2.z();
                                parsableByteArray2.G(50);
                                i16 = parsableByteArray2.f18957b;
                                if (iG3 == 1701733238) {
                                    i17 = i12;
                                    pairC = c(parsableByteArray2, i17, i18);
                                    if (pairC != null) {
                                        iG3 = ((Integer) pairC.first).intValue();
                                        if (drmInitData == null) {
                                            i18 = iG2;
                                            drmInitDataA = null;
                                        } else {
                                            i18 = iG2;
                                            drmInitDataA = drmInitData.a(((TrackEncryptionBox) pairC.second).f17837b);
                                        }
                                        trackEncryptionBoxArr[i15] = (TrackEncryptionBox) pairC.second;
                                    } else {
                                        i18 = iG2;
                                        drmInitDataA = drmInitData;
                                    }
                                    parsableByteArray2.F(i16);
                                } else {
                                    i17 = i12;
                                    i18 = iG2;
                                    drmInitDataA = drmInitData;
                                }
                                if (iG3 == 1831958048) {
                                    str3 = "video/mpeg";
                                } else if (iG3 == 1211250227) {
                                    str3 = "video/3gpp";
                                } else {
                                    str3 = null;
                                }
                                i19 = i16;
                                i12 = i17;
                                drmInitData2 = drmInitDataA;
                                str4 = str;
                                z5 = false;
                                str5 = str3;
                                fX = 1.0f;
                                i20 = -1;
                                i21 = -1;
                                iB3 = -1;
                                bArr = null;
                                str6 = null;
                                byteBufferOrder = null;
                                esdsData = null;
                                listZ = null;
                                i22 = -1;
                                while (true) {
                                    if (i19 - i12 >= i18) {
                                        bArr = bArr;
                                        break;
                                    }
                                    parsableByteArray2.F(i19);
                                    i27 = parsableByteArray2.f18957b;
                                    int i513 = i19;
                                    iG4 = parsableByteArray2.g();
                                    bArr = bArr;
                                    if (iG4 != 0) {
                                    }
                                    if (iG4 > 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    ExtractorUtil.a(str2, z6);
                                    iG5 = parsableByteArray2.g();
                                    int i514 = i18;
                                    if (iG5 == 1635148611) {
                                        if (str5 == null) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        ExtractorUtil.a(null, z8);
                                        parsableByteArray2.F(i27 + 8);
                                        avcConfigA = AvcConfig.a(parsableByteArray2);
                                        stsdData.f17766c = avcConfigA.f18988b;
                                        if (!z5) {
                                            fX = avcConfigA.f18990e;
                                        }
                                        ArrayList arrayList5 = avcConfigA.f18987a;
                                        iZ = iZ;
                                        iZ2 = iZ2;
                                        fX = fX;
                                        str6 = avcConfigA.f;
                                        listZ = arrayList5;
                                        str5 = "video/avc";
                                    } else {
                                        if (iG5 == 1752589123) {
                                            if (str5 == null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            ExtractorUtil.a(null, z7);
                                            parsableByteArray2.F(i27 + 8);
                                            hevcConfigA = HevcConfig.a(parsableByteArray2);
                                            stsdData.f17766c = hevcConfigA.f19003b;
                                            if (!z5) {
                                                fX = hevcConfigA.f19004c;
                                            }
                                            List list2 = hevcConfigA.f19002a;
                                            String str111 = hevcConfigA.g;
                                            int i515 = hevcConfigA.d;
                                            int i516 = hevcConfigA.f19005e;
                                            iB3 = hevcConfigA.f;
                                            i20 = i515;
                                            iZ = iZ;
                                            iZ2 = iZ2;
                                            fX = fX;
                                            listZ = list2;
                                            str2 = str2;
                                            str6 = str111;
                                            iG3 = iG3;
                                            i21 = i516;
                                            stsdData5 = stsdData;
                                            bArr = bArr;
                                            str5 = "video/hevc";
                                        } else if (iG5 != 1685480259) {
                                            iZ = iZ;
                                            iZ2 = iZ2;
                                            fX = fX;
                                            str2 = str2;
                                            iG3 = iG3;
                                            stsdData5 = stsdData;
                                            str8 = str6;
                                            dolbyVisionConfigA = DolbyVisionConfig.a(parsableByteArray2);
                                            if (dolbyVisionConfigA != null) {
                                                str6 = dolbyVisionConfigA.f18992a;
                                                str5 = "video/dolby-vision";
                                            } else {
                                                str6 = str8;
                                            }
                                            bArr = bArr;
                                        } else {
                                            iZ = iZ;
                                            iZ2 = iZ2;
                                            fX = fX;
                                            str2 = str2;
                                            iG3 = iG3;
                                            stsdData5 = stsdData;
                                            str8 = str6;
                                            dolbyVisionConfigA = DolbyVisionConfig.a(parsableByteArray2);
                                            if (dolbyVisionConfigA != null) {
                                                str6 = dolbyVisionConfigA.f18992a;
                                                str5 = "video/dolby-vision";
                                            } else {
                                                str6 = str8;
                                            }
                                            bArr = bArr;
                                        }
                                        i19 = i513 + iG4;
                                        i18 = i514;
                                        str2 = str2;
                                        iG3 = iG3;
                                        stsdData = stsdData5;
                                        fX = fX;
                                        iZ2 = iZ2;
                                        iZ = iZ;
                                    }
                                    stsdData5 = stsdData;
                                    i19 = i513 + iG4;
                                    i18 = i514;
                                    str2 = str2;
                                    iG3 = iG3;
                                    stsdData = stsdData5;
                                    fX = fX;
                                    iZ2 = iZ2;
                                    iZ = iZ;
                                }
                                i23 = iZ;
                                i24 = iZ2;
                                f = fX;
                                i25 = i18;
                                stsdData3 = stsdData;
                                str7 = str6;
                                if (str5 == null) {
                                    i26 = i14;
                                    stsdData4 = stsdData3;
                                } else {
                                    builder = new Format.Builder();
                                    builder.f17081a = Integer.toString(i13);
                                    builder.k = str5;
                                    builder.f17085h = str7;
                                    builder.f17089p = i23;
                                    builder.q = i24;
                                    builder.t = f;
                                    i26 = i14;
                                    builder.s = i26;
                                    builder.f17090u = bArr;
                                    builder.v = i22;
                                    builder.m = listZ;
                                    builder.f17088n = drmInitData2;
                                    if (i20 == -1) {
                                        if (byteBufferOrder != null) {
                                            bArrArray = byteBufferOrder.array();
                                        } else {
                                            bArrArray = null;
                                        }
                                        builder.f17091w = new ColorInfo(i20, i21, iB3, bArrArray);
                                    } else {
                                        if (byteBufferOrder != null) {
                                            bArrArray = byteBufferOrder.array();
                                        } else {
                                            bArrArray = null;
                                        }
                                        builder.f17091w = new ColorInfo(i20, i21, iB3, bArrArray);
                                    }
                                    if (esdsData != null) {
                                        EsdsData esdsData7 = esdsData;
                                        builder.f = Ints.e(esdsData7.f17763c);
                                        builder.g = Ints.e(esdsData7.d);
                                    }
                                    Format format2 = new Format(builder);
                                    stsdData4 = stsdData3;
                                    stsdData4.f17765b = format2;
                                }
                            } else {
                                arrayList2 = arrayList2;
                                i14 = i4;
                                containerAtom3 = containerAtom4;
                                pair2 = pairCreate;
                                tkhdData3 = tkhdData;
                                str2 = "childAtomSize must be positive";
                                i15 = i8;
                                parsableByteArray2.F(i12 + 16);
                                parsableByteArray2.G(16);
                                iZ = parsableByteArray2.z();
                                iZ2 = parsableByteArray2.z();
                                parsableByteArray2.G(50);
                                i16 = parsableByteArray2.f18957b;
                                if (iG3 == 1701733238) {
                                    i17 = i12;
                                    pairC = c(parsableByteArray2, i17, i18);
                                    if (pairC != null) {
                                        iG3 = ((Integer) pairC.first).intValue();
                                        if (drmInitData == null) {
                                            i18 = iG2;
                                            drmInitDataA = null;
                                        } else {
                                            i18 = iG2;
                                            drmInitDataA = drmInitData.a(((TrackEncryptionBox) pairC.second).f17837b);
                                        }
                                        trackEncryptionBoxArr[i15] = (TrackEncryptionBox) pairC.second;
                                    } else {
                                        i18 = iG2;
                                        drmInitDataA = drmInitData;
                                    }
                                    parsableByteArray2.F(i16);
                                } else {
                                    i17 = i12;
                                    i18 = iG2;
                                    drmInitDataA = drmInitData;
                                }
                                if (iG3 == 1831958048) {
                                    str3 = "video/mpeg";
                                } else if (iG3 == 1211250227) {
                                    str3 = "video/3gpp";
                                } else {
                                    str3 = null;
                                }
                                i19 = i16;
                                i12 = i17;
                                drmInitData2 = drmInitDataA;
                                str4 = str;
                                z5 = false;
                                str5 = str3;
                                fX = 1.0f;
                                i20 = -1;
                                i21 = -1;
                                iB3 = -1;
                                bArr = null;
                                str6 = null;
                                byteBufferOrder = null;
                                esdsData = null;
                                listZ = null;
                                i22 = -1;
                                while (true) {
                                    if (i19 - i12 >= i18) {
                                        bArr = bArr;
                                        break;
                                    }
                                    parsableByteArray2.F(i19);
                                    i27 = parsableByteArray2.f18957b;
                                    int i517 = i19;
                                    iG4 = parsableByteArray2.g();
                                    bArr = bArr;
                                    if (iG4 != 0) {
                                    }
                                    if (iG4 > 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    ExtractorUtil.a(str2, z6);
                                    iG5 = parsableByteArray2.g();
                                    int i518 = i18;
                                    if (iG5 == 1635148611) {
                                        if (str5 == null) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        ExtractorUtil.a(null, z8);
                                        parsableByteArray2.F(i27 + 8);
                                        avcConfigA = AvcConfig.a(parsableByteArray2);
                                        stsdData.f17766c = avcConfigA.f18988b;
                                        if (!z5) {
                                            fX = avcConfigA.f18990e;
                                        }
                                        ArrayList arrayList6 = avcConfigA.f18987a;
                                        iZ = iZ;
                                        iZ2 = iZ2;
                                        fX = fX;
                                        str6 = avcConfigA.f;
                                        listZ = arrayList6;
                                        str5 = "video/avc";
                                    } else {
                                        if (iG5 == 1752589123) {
                                            if (str5 == null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            ExtractorUtil.a(null, z7);
                                            parsableByteArray2.F(i27 + 8);
                                            hevcConfigA = HevcConfig.a(parsableByteArray2);
                                            stsdData.f17766c = hevcConfigA.f19003b;
                                            if (!z5) {
                                                fX = hevcConfigA.f19004c;
                                            }
                                            List list3 = hevcConfigA.f19002a;
                                            String str112 = hevcConfigA.g;
                                            int i519 = hevcConfigA.d;
                                            int i5110 = hevcConfigA.f19005e;
                                            iB3 = hevcConfigA.f;
                                            i20 = i519;
                                            iZ = iZ;
                                            iZ2 = iZ2;
                                            fX = fX;
                                            listZ = list3;
                                            str2 = str2;
                                            str6 = str112;
                                            iG3 = iG3;
                                            i21 = i5110;
                                            stsdData5 = stsdData;
                                            bArr = bArr;
                                            str5 = "video/hevc";
                                        } else if (iG5 != 1685480259) {
                                            iZ = iZ;
                                            iZ2 = iZ2;
                                            fX = fX;
                                            str2 = str2;
                                            iG3 = iG3;
                                            stsdData5 = stsdData;
                                            str8 = str6;
                                            dolbyVisionConfigA = DolbyVisionConfig.a(parsableByteArray2);
                                            if (dolbyVisionConfigA != null) {
                                                str6 = dolbyVisionConfigA.f18992a;
                                                str5 = "video/dolby-vision";
                                            } else {
                                                str6 = str8;
                                            }
                                            bArr = bArr;
                                        } else {
                                            iZ = iZ;
                                            iZ2 = iZ2;
                                            fX = fX;
                                            str2 = str2;
                                            iG3 = iG3;
                                            stsdData5 = stsdData;
                                            str8 = str6;
                                            dolbyVisionConfigA = DolbyVisionConfig.a(parsableByteArray2);
                                            if (dolbyVisionConfigA != null) {
                                                str6 = dolbyVisionConfigA.f18992a;
                                                str5 = "video/dolby-vision";
                                            } else {
                                                str6 = str8;
                                            }
                                            bArr = bArr;
                                        }
                                        i19 = i517 + iG4;
                                        i18 = i518;
                                        str2 = str2;
                                        iG3 = iG3;
                                        stsdData = stsdData5;
                                        fX = fX;
                                        iZ2 = iZ2;
                                        iZ = iZ;
                                    }
                                    stsdData5 = stsdData;
                                    i19 = i517 + iG4;
                                    i18 = i518;
                                    str2 = str2;
                                    iG3 = iG3;
                                    stsdData = stsdData5;
                                    fX = fX;
                                    iZ2 = iZ2;
                                    iZ = iZ;
                                }
                                i23 = iZ;
                                i24 = iZ2;
                                f = fX;
                                i25 = i18;
                                stsdData3 = stsdData;
                                str7 = str6;
                                if (str5 == null) {
                                    i26 = i14;
                                    stsdData4 = stsdData3;
                                } else {
                                    builder = new Format.Builder();
                                    builder.f17081a = Integer.toString(i13);
                                    builder.k = str5;
                                    builder.f17085h = str7;
                                    builder.f17089p = i23;
                                    builder.q = i24;
                                    builder.t = f;
                                    i26 = i14;
                                    builder.s = i26;
                                    builder.f17090u = bArr;
                                    builder.v = i22;
                                    builder.m = listZ;
                                    builder.f17088n = drmInitData2;
                                    if (i20 == -1) {
                                        if (byteBufferOrder != null) {
                                            bArrArray = byteBufferOrder.array();
                                        } else {
                                            bArrArray = null;
                                        }
                                        builder.f17091w = new ColorInfo(i20, i21, iB3, bArrArray);
                                    } else {
                                        if (byteBufferOrder != null) {
                                            bArrArray = byteBufferOrder.array();
                                        } else {
                                            bArrArray = null;
                                        }
                                        builder.f17091w = new ColorInfo(i20, i21, iB3, bArrArray);
                                    }
                                    if (esdsData != null) {
                                        EsdsData esdsData8 = esdsData;
                                        builder.f = Ints.e(esdsData8.f17763c);
                                        builder.g = Ints.e(esdsData8.d);
                                    }
                                    Format format3 = new Format(builder);
                                    stsdData4 = stsdData3;
                                    stsdData4.f17765b = format3;
                                }
                            }
                            parsableByteArray2.F(i12 + i25);
                            i8 = i15 + 1;
                            stsdData = stsdData4;
                            i4 = i26;
                            i2 = i511;
                            iG = i512;
                            i47 = i510;
                            iG12 = i13;
                            pairCreate = pair2;
                            str = str4;
                            containerAtom4 = containerAtom3;
                            arrayList2 = arrayList2;
                            tkhdData = tkhdData3;
                            drmInitData = drmInitData;
                        }
                    }
                    track2 = (Track) function.apply(track);
                    if (track2 == null) {
                        arrayList2 = arrayList;
                    } else {
                        Atom.ContainerAtom containerAtomC10 = containerAtom4.c(1835297121);
                        containerAtomC10.getClass();
                        Atom.ContainerAtom containerAtomC11 = containerAtomC10.c(1835626086);
                        containerAtomC11.getClass();
                        Atom.ContainerAtom containerAtomC12 = containerAtomC11.c(1937007212);
                        containerAtomC12.getClass();
                        TrackSampleTable trackSampleTableD2 = d(track2, containerAtomC12, gaplessInfoHolder);
                        arrayList2 = arrayList;
                        arrayList2.add(trackSampleTableD2);
                    }
                }
                track = null;
                track2 = (Track) function.apply(track);
                if (track2 == null) {
                    arrayList2 = arrayList;
                } else {
                    Atom.ContainerAtom containerAtomC13 = containerAtom4.c(1835297121);
                    containerAtomC13.getClass();
                    Atom.ContainerAtom containerAtomC14 = containerAtomC13.c(1835626086);
                    containerAtomC14.getClass();
                    Atom.ContainerAtom containerAtomC15 = containerAtomC14.c(1937007212);
                    containerAtomC15.getClass();
                    TrackSampleTable trackSampleTableD3 = d(track2, containerAtomC15, gaplessInfoHolder);
                    arrayList2 = arrayList;
                    arrayList2.add(trackSampleTableD3);
                }
            }
            i47 = i9 + 1;
        }
    }
}
