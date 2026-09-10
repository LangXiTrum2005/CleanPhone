package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import com.applovin.shadow.okio.Segment;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class AtomParsers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7057a;

    public static final class ChunkIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7060c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f7061e;
        public final ParsableByteArray f;
        public final ParsableByteArray g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7062h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7063i;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z2) throws ParserException {
            this.g = parsableByteArray;
            this.f = parsableByteArray2;
            this.f7061e = z2;
            parsableByteArray2.G(12);
            this.f7058a = parsableByteArray2.y();
            parsableByteArray.G(12);
            this.f7063i = parsableByteArray.y();
            ExtractorUtil.a("first_chunk must be 1", parsableByteArray.g() == 1);
            this.f7059b = -1;
        }

        public final boolean a() {
            int i2 = this.f7059b + 1;
            this.f7059b = i2;
            if (i2 == this.f7058a) {
                return false;
            }
            boolean z2 = this.f7061e;
            ParsableByteArray parsableByteArray = this.f;
            this.d = z2 ? parsableByteArray.z() : parsableByteArray.w();
            if (this.f7059b == this.f7062h) {
                ParsableByteArray parsableByteArray2 = this.g;
                this.f7060c = parsableByteArray2.y();
                parsableByteArray2.H(4);
                int i3 = this.f7063i - 1;
                this.f7063i = i3;
                this.f7062h = i3 > 0 ? parsableByteArray2.y() - 1 : -1;
            }
            return true;
        }
    }

    public static final class EsdsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f7065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7066c;
        public final long d;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.f7064a = str;
            this.f7065b = bArr;
            this.f7066c = j;
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
        public final TrackEncryptionBox[] f7067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Format f7068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7069c;
        public int d = 0;

        public StsdData(int i2) {
            this.f7067a = new TrackEncryptionBox[i2];
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParsableByteArray f7072c;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.f7056b;
            this.f7072c = parsableByteArray;
            parsableByteArray.G(12);
            int iY = parsableByteArray.y();
            if ("audio/raw".equals(format.m)) {
                int iX = Util.x(format.C, format.f5400A);
                if (iY == 0 || iY % iX != 0) {
                    Log.g("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iX + ", stsz sample size: " + iY);
                    iY = iX;
                }
            }
            this.f7070a = iY == 0 ? -1 : iY;
            this.f7071b = parsableByteArray.y();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public final int a() {
            return this.f7070a;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public final int getSampleCount() {
            return this.f7071b;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public final int readNextSampleSize() {
            int i2 = this.f7070a;
            return i2 == -1 ? this.f7072c.y() : i2;
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParsableByteArray f7073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7075c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7076e;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.f7056b;
            this.f7073a = parsableByteArray;
            parsableByteArray.G(12);
            this.f7075c = parsableByteArray.y() & 255;
            this.f7074b = parsableByteArray.y();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public final int a() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public final int getSampleCount() {
            return this.f7074b;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public final int readNextSampleSize() {
            ParsableByteArray parsableByteArray = this.f7073a;
            int i2 = this.f7075c;
            if (i2 == 8) {
                return parsableByteArray.u();
            }
            if (i2 == 16) {
                return parsableByteArray.A();
            }
            int i3 = this.d;
            this.d = i3 + 1;
            if (i3 % 2 != 0) {
                return this.f7076e & 15;
            }
            int iU = parsableByteArray.u();
            this.f7076e = iU;
            return (iU & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    public static final class TkhdData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7077a;

        public TkhdData(int i2, long j, int i3) {
            this.f7077a = i2;
        }
    }

    static {
        int i2 = Util.f5683a;
        f7057a = "OpusHead".getBytes(Charsets.f19705c);
    }

    public static EsdsData a(int i2, ParsableByteArray parsableByteArray) {
        parsableByteArray.G(i2 + 12);
        parsableByteArray.H(1);
        b(parsableByteArray);
        parsableByteArray.H(2);
        int iU = parsableByteArray.u();
        if ((iU & 128) != 0) {
            parsableByteArray.H(2);
        }
        if ((iU & 64) != 0) {
            parsableByteArray.H(parsableByteArray.u());
        }
        if ((iU & 32) != 0) {
            parsableByteArray.H(2);
        }
        parsableByteArray.H(1);
        b(parsableByteArray);
        String strD = MimeTypes.d(parsableByteArray.u());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new EsdsData(strD, null, -1L, -1L);
        }
        parsableByteArray.H(4);
        long jW = parsableByteArray.w();
        long jW2 = parsableByteArray.w();
        parsableByteArray.H(1);
        int iB = b(parsableByteArray);
        long j = jW2;
        byte[] bArr = new byte[iB];
        parsableByteArray.e(bArr, 0, iB);
        if (j <= 0) {
            j = -1;
        }
        return new EsdsData(strD, bArr, j, jW > 0 ? jW : -1L);
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

    public static Mp4TimestampData c(ParsableByteArray parsableByteArray) {
        long jO;
        long jO2;
        parsableByteArray.G(8);
        if (Atom.b(parsableByteArray.g()) == 0) {
            jO = parsableByteArray.w();
            jO2 = parsableByteArray.w();
        } else {
            jO = parsableByteArray.o();
            jO2 = parsableByteArray.o();
        }
        return new Mp4TimestampData(jO, jO2, parsableByteArray.w());
    }

    public static Pair d(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        TrackEncryptionBox trackEncryptionBox;
        Pair pairCreate;
        int i4;
        int i5;
        int i6 = parsableByteArray.f5668b;
        while (i6 - i2 < i3) {
            parsableByteArray.G(i6);
            int iG = parsableByteArray.g();
            ExtractorUtil.a("childAtomSize must be positive", iG > 0);
            if (parsableByteArray.g() == 1936289382) {
                int i7 = i6 + 8;
                int i8 = 0;
                int i9 = -1;
                Integer numValueOf = null;
                String strS = null;
                while (i7 - i6 < iG) {
                    parsableByteArray.G(i7);
                    int iG2 = parsableByteArray.g();
                    int iG3 = parsableByteArray.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(parsableByteArray.g());
                    } else if (iG3 == 1935894637) {
                        parsableByteArray.H(4);
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
                        parsableByteArray.G(i10);
                        int iG4 = parsableByteArray.g();
                        if (parsableByteArray.g() == 1952804451) {
                            int iB = Atom.b(parsableByteArray.g());
                            parsableByteArray.H(1);
                            if (iB == 0) {
                                parsableByteArray.H(1);
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
                    int i11 = Util.f5683a;
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

    /* JADX WARN: Code duplicated, block: B:163:0x0273  */
    /* JADX WARN: Code duplicated, block: B:213:0x0351  */
    /* JADX WARN: Code duplicated, block: B:317:0x059a  */
    /* JADX WARN: Code duplicated, block: B:502:0x0aba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:503:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:504:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:507:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:508:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:579:0x0c16  */
    /* JADX WARN: Code duplicated, block: B:580:0x0c18  */
    public static StsdData e(ParsableByteArray parsableByteArray, int i2, int i3, String str, DrmInitData drmInitData, boolean z2) throws ParserException {
        int i4;
        int i5;
        int i6;
        DrmInitData drmInitDataA;
        String str2;
        int i7;
        List listZ;
        int i8;
        StsdData stsdData;
        byte[] bArr;
        byte[] bArrCopyOfRange;
        int i9;
        int i10;
        ImmutableList immutableList;
        int i11;
        int i12;
        int iG;
        int i13;
        ColorInfo colorInfoA;
        int i14;
        int iG2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iA;
        int iRound;
        int i20;
        int i21;
        int i22;
        int i23;
        DrmInitData drmInitData2;
        String str3;
        String str4;
        int i24;
        String str5;
        EsdsData esdsData;
        String str6;
        EsdsData esdsData2;
        List list;
        String str7;
        String str8;
        String str9;
        int i25;
        int i26;
        ImmutableList immutableList2;
        parsableByteArray.G(12);
        int iG3 = parsableByteArray.g();
        StsdData stsdData2 = new StsdData(iG3);
        int i27 = 0;
        while (i27 < iG3) {
            int i28 = parsableByteArray.f5668b;
            int iG4 = parsableByteArray.g();
            String str10 = "childAtomSize must be positive";
            ExtractorUtil.a("childAtomSize must be positive", iG4 > 0);
            int iG5 = parsableByteArray.g();
            if (iG5 == 1635148593 || iG5 == 1635148595 || iG5 == 1701733238 || iG5 == 1831958048 || iG5 == 1836070006 || iG5 == 1752589105 || iG5 == 1751479857 || iG5 == 1932670515 || iG5 == 1211250227 || iG5 == 1987063864 || iG5 == 1987063865 || iG5 == 1635135537 || iG5 == 1685479798 || iG5 == 1685479729 || iG5 == 1685481573 || iG5 == 1685481521) {
                iG3 = iG3;
                i4 = i27;
                String str11 = "childAtomSize must be positive";
                parsableByteArray.G(i28 + 16);
                parsableByteArray.H(16);
                int iA2 = parsableByteArray.A();
                int iA3 = parsableByteArray.A();
                parsableByteArray.H(50);
                int i29 = parsableByteArray.f5668b;
                if (iG5 == 1701733238) {
                    i5 = i28;
                    i6 = iG4;
                    Pair pairD = d(parsableByteArray, i5, i6);
                    if (pairD != null) {
                        iG5 = ((Integer) pairD.first).intValue();
                        drmInitDataA = drmInitData == null ? null : drmInitData.a(((TrackEncryptionBox) pairD.second).f7146b);
                        stsdData2.f7067a[i4] = (TrackEncryptionBox) pairD.second;
                    } else {
                        drmInitDataA = drmInitData;
                    }
                    parsableByteArray.G(i29);
                } else {
                    i5 = i28;
                    i6 = iG4;
                    drmInitDataA = drmInitData;
                }
                if (iG5 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iG5 == 1211250227 ? "video/3gpp" : null;
                }
                String str12 = str2;
                int i30 = i29;
                i7 = i5;
                DrmInitData drmInitData3 = drmInitDataA;
                float fY = 1.0f;
                int iF = -1;
                List list2 = null;
                String str13 = null;
                int i31 = -1;
                int iG6 = -1;
                byte[] bArr2 = null;
                ByteBuffer byteBufferOrder = null;
                boolean z3 = false;
                int i32 = 8;
                int i33 = 8;
                int i34 = -1;
                EsdsData esdsData3 = null;
                int i35 = -1;
                while (true) {
                    if (i30 - i7 >= i6) {
                        listZ = list2;
                        break;
                    }
                    parsableByteArray.G(i30);
                    int i36 = parsableByteArray.f5668b;
                    int i37 = i30;
                    int iG7 = parsableByteArray.g();
                    listZ = list2;
                    if (iG7 == 0 && parsableByteArray.f5668b - i7 == i6) {
                        break;
                    }
                    ExtractorUtil.a(str11, iG7 > 0);
                    int iG8 = parsableByteArray.g();
                    int i38 = i6;
                    if (iG8 == 1635148611) {
                        ExtractorUtil.a(null, str12 == null);
                        parsableByteArray.G(i36 + 8);
                        AvcConfig avcConfigA = AvcConfig.a(parsableByteArray);
                        stsdData2.f7069c = avcConfigA.f6710b;
                        if (!z3) {
                            fY = avcConfigA.k;
                        }
                        ArrayList arrayList = avcConfigA.f6709a;
                        String str14 = avcConfigA.f6715l;
                        int i39 = avcConfigA.j;
                        i16 = avcConfigA.g;
                        int i40 = avcConfigA.f6713h;
                        i17 = avcConfigA.f6714i;
                        i18 = avcConfigA.f6712e;
                        i34 = i39;
                        fY = fY;
                        listZ = arrayList;
                        i35 = i40;
                        i32 = avcConfigA.f;
                        str12 = "video/avc";
                        str13 = str14;
                    } else {
                        if (iG8 == 1752589123) {
                            ExtractorUtil.a(null, str12 == null);
                            parsableByteArray.G(i36 + 8);
                            HevcConfig hevcConfigA = HevcConfig.a(parsableByteArray);
                            stsdData2.f7069c = hevcConfigA.f6776b;
                            if (!z3) {
                                fY = hevcConfigA.f6779h;
                            }
                            List list3 = hevcConfigA.f6775a;
                            int i41 = hevcConfigA.f6780i;
                            String str15 = hevcConfigA.j;
                            i16 = hevcConfigA.f6778e;
                            str12 = "video/hevc";
                            int i42 = hevcConfigA.f;
                            i17 = hevcConfigA.g;
                            i18 = hevcConfigA.f6777c;
                            listZ = list3;
                            i34 = i41;
                            str13 = str15;
                            fY = fY;
                            i35 = i42;
                            i32 = hevcConfigA.d;
                        } else {
                            if (iG8 == 1685480259 || iG8 == 1685485123) {
                                iA3 = iA3;
                                stsdData2 = stsdData2;
                                str11 = str11;
                                i31 = i31;
                                iG5 = iG5;
                                fY = fY;
                                bArr = bArr2;
                                DolbyVisionConfig dolbyVisionConfigA = DolbyVisionConfig.a(parsableByteArray);
                                if (dolbyVisionConfigA != null) {
                                    str13 = dolbyVisionConfigA.f6747a;
                                    str12 = "video/dolby-vision";
                                }
                            } else if (iG8 == 1987076931) {
                                ExtractorUtil.a(null, str12 == null);
                                String str16 = iG5 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                parsableByteArray.G(i36 + 12);
                                parsableByteArray.H(2);
                                int iU = parsableByteArray.u();
                                int i43 = iU >> 4;
                                boolean z4 = (iU & 1) != 0;
                                int iU2 = parsableByteArray.u();
                                int iU3 = parsableByteArray.u();
                                int iF2 = ColorInfo.f(iU2);
                                str12 = str16;
                                i35 = z4 ? 1 : 2;
                                i32 = i43;
                                i33 = i32;
                                str11 = str11;
                                iG5 = iG5;
                                iF = iF2;
                                iG6 = ColorInfo.g(iU3);
                            } else {
                                str11 = str11;
                                iG5 = iG5;
                                if (iG8 == 1635135811) {
                                    int i44 = iG7 - 8;
                                    byte[] bArr3 = new byte[i44];
                                    parsableByteArray.e(bArr3, 0, i44);
                                    ImmutableList immutableListZ = ImmutableList.z(bArr3);
                                    parsableByteArray.G(i36 + 8);
                                    ColorInfo.Builder builder = new ColorInfo.Builder();
                                    byte[] bArr4 = parsableByteArray.f5667a;
                                    ParsableBitArray parsableBitArray = new ParsableBitArray(bArr4, bArr4.length);
                                    parsableBitArray.m(parsableByteArray.f5668b * 8);
                                    parsableBitArray.p(1);
                                    int iG9 = parsableBitArray.g(3);
                                    parsableBitArray.o(6);
                                    boolean zF = parsableBitArray.f();
                                    boolean zF2 = parsableBitArray.f();
                                    int i45 = 2;
                                    if (iG9 != 2) {
                                        if (iG9 <= i45) {
                                            if (zF) {
                                                i9 = 10;
                                            } else {
                                                i9 = 8;
                                            }
                                            builder.f5390e = i9;
                                            if (zF) {
                                                i10 = 10;
                                            } else {
                                                i10 = 8;
                                            }
                                            builder.f = i10;
                                        }
                                    } else if (zF) {
                                        builder.f5390e = zF2 ? 12 : 10;
                                        builder.f = zF2 ? 12 : 10;
                                    } else {
                                        i45 = 2;
                                        if (iG9 <= i45) {
                                            if (zF) {
                                                i9 = 10;
                                            } else {
                                                i9 = 8;
                                            }
                                            builder.f5390e = i9;
                                            if (zF) {
                                                i10 = 10;
                                            } else {
                                                i10 = 8;
                                            }
                                            builder.f = i10;
                                        }
                                    }
                                    parsableBitArray.o(13);
                                    parsableBitArray.n();
                                    int iG10 = parsableBitArray.g(4);
                                    if (iG10 != 1) {
                                        Log.f("AtomParsers", "Unsupported obu_type: " + iG10);
                                        colorInfoA = builder.a();
                                    } else if (parsableBitArray.f()) {
                                        Log.f("AtomParsers", "Unsupported obu_extension_flag");
                                        colorInfoA = builder.a();
                                    } else {
                                        boolean zF3 = parsableBitArray.f();
                                        parsableBitArray.n();
                                        if (!zF3 || parsableBitArray.g(8) <= 127) {
                                            int iG11 = parsableBitArray.g(3);
                                            parsableBitArray.n();
                                            if (parsableBitArray.f()) {
                                                Log.f("AtomParsers", "Unsupported reduced_still_picture_header");
                                                colorInfoA = builder.a();
                                            } else if (parsableBitArray.f()) {
                                                Log.f("AtomParsers", "Unsupported timing_info_present_flag");
                                                colorInfoA = builder.a();
                                            } else {
                                                if (parsableBitArray.f()) {
                                                    Log.f("AtomParsers", "Unsupported initial_display_delay_present_flag");
                                                    colorInfoA = builder.a();
                                                } else {
                                                    int iG12 = parsableBitArray.g(5);
                                                    int i46 = 0;
                                                    while (i46 <= iG12) {
                                                        parsableBitArray.o(12);
                                                        ImmutableList immutableList3 = immutableListZ;
                                                        if (parsableBitArray.g(5) > 7) {
                                                            parsableBitArray.n();
                                                        }
                                                        i46++;
                                                        immutableListZ = immutableList3;
                                                    }
                                                    immutableList = immutableListZ;
                                                    int iG13 = parsableBitArray.g(4);
                                                    int iG14 = parsableBitArray.g(4);
                                                    parsableBitArray.o(iG13 + 1);
                                                    parsableBitArray.o(iG14 + 1);
                                                    if (parsableBitArray.f()) {
                                                        i11 = 7;
                                                        parsableBitArray.o(7);
                                                    } else {
                                                        i11 = 7;
                                                    }
                                                    parsableBitArray.o(i11);
                                                    boolean zF4 = parsableBitArray.f();
                                                    if (zF4) {
                                                        parsableBitArray.o(2);
                                                    }
                                                    if (parsableBitArray.f()) {
                                                        i12 = 1;
                                                        iG = 2;
                                                    } else {
                                                        i12 = 1;
                                                        iG = parsableBitArray.g(1);
                                                    }
                                                    if (iG > 0 && !parsableBitArray.f()) {
                                                        parsableBitArray.o(i12);
                                                    }
                                                    if (zF4) {
                                                        i13 = 3;
                                                        parsableBitArray.o(3);
                                                    } else {
                                                        i13 = 3;
                                                    }
                                                    parsableBitArray.o(i13);
                                                    boolean zF5 = parsableBitArray.f();
                                                    if (iG11 == 2 && zF5) {
                                                        parsableBitArray.n();
                                                    }
                                                    boolean z5 = iG11 != 1 && parsableBitArray.f();
                                                    if (parsableBitArray.f()) {
                                                        int iG15 = parsableBitArray.g(8);
                                                        int iG16 = parsableBitArray.g(8);
                                                        int iG17 = parsableBitArray.g(8);
                                                        if (z5) {
                                                            i14 = 1;
                                                        } else {
                                                            i14 = 1;
                                                            if (iG15 == 1 && iG16 == 13 && iG17 == 0) {
                                                                iG2 = 1;
                                                            }
                                                            builder.f5387a = ColorInfo.f(iG15);
                                                            if (iG2 == i14) {
                                                                i15 = 1;
                                                            } else {
                                                                i15 = 2;
                                                            }
                                                            builder.f5388b = i15;
                                                            builder.f5389c = ColorInfo.g(iG16);
                                                        }
                                                        iG2 = parsableBitArray.g(i14);
                                                        builder.f5387a = ColorInfo.f(iG15);
                                                        if (iG2 == i14) {
                                                            i15 = 1;
                                                        } else {
                                                            i15 = 2;
                                                        }
                                                        builder.f5388b = i15;
                                                        builder.f5389c = ColorInfo.g(iG16);
                                                    }
                                                    colorInfoA = builder.a();
                                                }
                                                int i47 = colorInfoA.f5386e;
                                                int i48 = colorInfoA.f;
                                                int i49 = colorInfoA.f5383a;
                                                int i50 = colorInfoA.f5384b;
                                                int i51 = colorInfoA.f5385c;
                                                str12 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                iA3 = iA3;
                                                stsdData2 = stsdData2;
                                                i33 = i47;
                                                iF = i49;
                                                i35 = i50;
                                                fY = fY;
                                                listZ = immutableList;
                                                iG6 = i51;
                                                i32 = i48;
                                            }
                                        } else {
                                            Log.f("AtomParsers", "Excessive obu_size");
                                            colorInfoA = builder.a();
                                        }
                                    }
                                    immutableList = immutableListZ;
                                    int i410 = colorInfoA.f5386e;
                                    int i411 = colorInfoA.f;
                                    int i412 = colorInfoA.f5383a;
                                    int i52 = colorInfoA.f5384b;
                                    int i53 = colorInfoA.f5385c;
                                    str12 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                    iA3 = iA3;
                                    stsdData2 = stsdData2;
                                    i33 = i410;
                                    iF = i412;
                                    i35 = i52;
                                    fY = fY;
                                    listZ = immutableList;
                                    iG6 = i53;
                                    i32 = i411;
                                } else if (iG8 == 1668050025) {
                                    if (byteBufferOrder == null) {
                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer = byteBufferOrder;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(parsableByteArray.r());
                                    byteBuffer.putShort(parsableByteArray.r());
                                    byteBufferOrder = byteBuffer;
                                } else if (iG8 == 1835295606) {
                                    if (byteBufferOrder == null) {
                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferOrder;
                                    short sR = parsableByteArray.r();
                                    short sR2 = parsableByteArray.r();
                                    short sR3 = parsableByteArray.r();
                                    short sR4 = parsableByteArray.r();
                                    short sR5 = parsableByteArray.r();
                                    int i54 = i31;
                                    short sR6 = parsableByteArray.r();
                                    byte[] bArr5 = bArr2;
                                    short sR7 = parsableByteArray.r();
                                    short sR8 = parsableByteArray.r();
                                    long jW = parsableByteArray.w();
                                    long jW2 = parsableByteArray.w();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sR5);
                                    byteBuffer2.putShort(sR6);
                                    byteBuffer2.putShort(sR);
                                    byteBuffer2.putShort(sR2);
                                    byteBuffer2.putShort(sR3);
                                    byteBuffer2.putShort(sR4);
                                    byteBuffer2.putShort(sR7);
                                    byteBuffer2.putShort(sR8);
                                    byteBuffer2.putShort((short) (jW / 10000));
                                    byteBuffer2.putShort((short) (jW2 / 10000));
                                    byteBufferOrder = byteBuffer2;
                                    i31 = i54;
                                    bArr2 = bArr5;
                                } else {
                                    iA3 = iA3;
                                    stsdData2 = stsdData2;
                                    i31 = i31;
                                    fY = fY;
                                    bArr = bArr2;
                                    if (iG8 == 1681012275) {
                                        ExtractorUtil.a(null, str12 == null);
                                        str12 = "video/3gpp";
                                    } else if (iG8 == 1702061171) {
                                        ExtractorUtil.a(null, str12 == null);
                                        EsdsData esdsDataA = a(i36, parsableByteArray);
                                        byte[] bArr6 = esdsDataA.f7065b;
                                        esdsData3 = esdsDataA;
                                        listZ = bArr6 != null ? ImmutableList.z(bArr6) : listZ;
                                        str12 = esdsDataA.f7064a;
                                    } else if (iG8 == 1885434736) {
                                        parsableByteArray.G(i36 + 8);
                                        fY = parsableByteArray.y() / parsableByteArray.y();
                                        i31 = i31;
                                        bArr2 = bArr;
                                        z3 = true;
                                    } else if (iG8 == 1937126244) {
                                        int i55 = i36 + 8;
                                        while (true) {
                                            if (i55 - i36 >= iG7) {
                                                bArrCopyOfRange = null;
                                                break;
                                            }
                                            parsableByteArray.G(i55);
                                            int iG18 = parsableByteArray.g();
                                            if (parsableByteArray.g() == 1886547818) {
                                                bArrCopyOfRange = Arrays.copyOfRange(parsableByteArray.f5667a, i55, iG18 + i55);
                                                break;
                                            }
                                            i55 += iG18;
                                        }
                                        bArr2 = bArrCopyOfRange;
                                    } else if (iG8 == 1936995172) {
                                        int iU4 = parsableByteArray.u();
                                        parsableByteArray.H(3);
                                        if (iU4 == 0) {
                                            int iU5 = parsableByteArray.u();
                                            if (iU5 == 0) {
                                                i31 = 0;
                                            } else if (iU5 == 1) {
                                                i31 = 1;
                                            } else if (iU5 == 2) {
                                                i31 = 2;
                                            } else if (iU5 == 3) {
                                                i31 = 3;
                                            }
                                            bArr2 = bArr;
                                        }
                                        i31 = i31;
                                        bArr2 = bArr;
                                    } else if (iG8 == 1668246642 && iF == -1 && iG6 == -1) {
                                        int iG19 = parsableByteArray.g();
                                        if (iG19 == 1852009592 || iG19 == 1852009571) {
                                            int iA4 = parsableByteArray.A();
                                            int iA5 = parsableByteArray.A();
                                            parsableByteArray.H(2);
                                            boolean z6 = iG7 == 19 && (parsableByteArray.u() & 128) != 0;
                                            iF = ColorInfo.f(iA4);
                                            int i56 = z6 ? 1 : 2;
                                            iG6 = ColorInfo.g(iA5);
                                            i35 = i56;
                                        } else {
                                            Log.g("AtomParsers", "Unsupported color type: " + Atom.a(iG19));
                                        }
                                    }
                                    bArr2 = bArr;
                                }
                            }
                            i31 = i31;
                            bArr2 = bArr;
                        }
                        i30 = i37 + iG7;
                        stsdData2 = stsdData2;
                        list2 = listZ;
                        i6 = i38;
                        str11 = str11;
                        iG5 = iG5;
                        fY = fY;
                        iA3 = iA3;
                    }
                    iF = i16;
                    iG6 = i17;
                    i33 = i18;
                    i30 = i37 + iG7;
                    stsdData2 = stsdData2;
                    list2 = listZ;
                    i6 = i38;
                    str11 = str11;
                    iG5 = iG5;
                    fY = fY;
                    iA3 = iA3;
                }
                int i57 = iA3;
                StsdData stsdData3 = stsdData2;
                i8 = i6;
                int i58 = i31;
                float f = fY;
                byte[] bArr7 = bArr2;
                if (str12 == null) {
                    stsdData = stsdData3;
                } else {
                    Format.Builder builder2 = new Format.Builder();
                    builder2.f5423a = Integer.toString(i2);
                    builder2.f5429l = MimeTypes.l(str12);
                    builder2.f5428i = str13;
                    builder2.r = iA2;
                    builder2.s = i57;
                    builder2.v = f;
                    builder2.f5432u = i3;
                    builder2.f5433w = bArr7;
                    builder2.x = i58;
                    builder2.o = listZ;
                    builder2.f5430n = i34;
                    builder2.f5431p = drmInitData3;
                    ColorInfo.Builder builder3 = new ColorInfo.Builder();
                    builder3.f5387a = iF;
                    builder3.f5388b = i35;
                    builder3.f5389c = iG6;
                    builder3.d = byteBufferOrder != null ? byteBufferOrder.array() : null;
                    builder3.f5390e = i33;
                    builder3.f = i32;
                    builder2.y = builder3.a();
                    EsdsData esdsData4 = esdsData3;
                    if (esdsData4 != null) {
                        builder2.g = Ints.e(esdsData4.f7066c);
                        builder2.f5427h = Ints.e(esdsData4.d);
                    }
                    Format format = new Format(builder2);
                    stsdData = stsdData3;
                    stsdData.f7068b = format;
                }
            } else if (iG5 == 1836069985 || iG5 == 1701733217 || iG5 == 1633889587 || iG5 == 1700998451 || iG5 == 1633889588 || iG5 == 1835823201 || iG5 == 1685353315 || iG5 == 1685353317 || iG5 == 1685353320 || iG5 == 1685353324 || iG5 == 1685353336 || iG5 == 1935764850 || iG5 == 1935767394 || iG5 == 1819304813 || iG5 == 1936684916 || iG5 == 1953984371 || iG5 == 778924082 || iG5 == 778924083 || iG5 == 1835557169 || iG5 == 1835560241 || iG5 == 1634492771 || iG5 == 1634492791 || iG5 == 1970037111 || iG5 == 1332770163 || iG5 == 1716281667) {
                parsableByteArray.G(i28 + 16);
                if (z2) {
                    int iA6 = parsableByteArray.A();
                    parsableByteArray.H(6);
                    i19 = iA6;
                } else {
                    parsableByteArray.H(8);
                    i19 = 0;
                }
                if (i19 == 0 || i19 == 1) {
                    iA = parsableByteArray.A();
                    parsableByteArray.H(6);
                    int iV = parsableByteArray.v();
                    parsableByteArray.G(parsableByteArray.f5668b - 4);
                    int iG20 = parsableByteArray.g();
                    if (i19 == 1) {
                        parsableByteArray.H(16);
                    }
                    iRound = iV;
                    i20 = iG20;
                    i21 = -1;
                } else {
                    if (i19 == 2) {
                        parsableByteArray.H(16);
                        iRound = (int) Math.round(Double.longBitsToDouble(parsableByteArray.o()));
                        iA = parsableByteArray.y();
                        parsableByteArray.H(4);
                        int iY = parsableByteArray.y();
                        int iY2 = parsableByteArray.y();
                        boolean z7 = (iY2 & 1) != 0;
                        boolean z8 = (iY2 & 2) != 0;
                        if (z7) {
                            if (iY == 32) {
                                i25 = 4;
                            } else {
                                i25 = -1;
                            }
                            i26 = 8;
                        } else if (iY == 8) {
                            i26 = 8;
                            i25 = 3;
                        } else {
                            if (iY == 16) {
                                i25 = z8 ? 268435456 : 2;
                            } else if (iY == 24) {
                                i25 = z8 ? 1342177280 : 21;
                            } else if (iY == 32) {
                                i25 = z8 ? 1610612736 : 22;
                            } else {
                                i25 = -1;
                            }
                            i26 = 8;
                        }
                        parsableByteArray.H(i26);
                        i21 = i25;
                        i20 = 0;
                    } else {
                        iG3 = iG3;
                        i4 = i27;
                        i23 = i28;
                        i22 = iG4;
                    }
                    stsdData = stsdData2;
                    i8 = i22;
                    i7 = i23;
                }
                int i59 = parsableByteArray.f5668b;
                if (iG5 == 1701733217) {
                    Pair pairD2 = d(parsableByteArray, i28, iG4);
                    if (pairD2 != null) {
                        iG5 = ((Integer) pairD2.first).intValue();
                        DrmInitData drmInitDataA2 = drmInitData == 0 ? null : drmInitData.a(((TrackEncryptionBox) pairD2.second).f7146b);
                        stsdData2.f7067a[i27] = (TrackEncryptionBox) pairD2.second;
                        drmInitData2 = drmInitDataA2;
                    } else {
                        iG3 = iG3;
                        drmInitData2 = drmInitData;
                    }
                    parsableByteArray.G(i59);
                } else {
                    iG3 = iG3;
                    drmInitData2 = drmInitData;
                }
                String str17 = "audio/mhm1";
                int i60 = iRound;
                if (iG5 == 1633889587) {
                    str3 = "audio/ac3";
                } else if (iG5 == 1700998451) {
                    str3 = "audio/eac3";
                } else if (iG5 == 1633889588) {
                    str3 = "audio/ac4";
                } else if (iG5 == 1685353315) {
                    str3 = "audio/vnd.dts";
                } else if (iG5 == 1685353320 || iG5 == 1685353324) {
                    str3 = "audio/vnd.dts.hd";
                } else if (iG5 == 1685353317) {
                    str3 = "audio/vnd.dts.hd;profile=lbr";
                } else if (iG5 == 1685353336) {
                    str3 = "audio/vnd.dts.uhd;profile=p2";
                } else if (iG5 == 1935764850) {
                    str3 = "audio/3gpp";
                } else if (iG5 == 1935767394) {
                    str3 = "audio/amr-wb";
                } else if (iG5 == 1936684916) {
                    str3 = "audio/raw";
                    i21 = 2;
                } else if (iG5 == 1953984371) {
                    str3 = "audio/raw";
                    i21 = 268435456;
                } else if (iG5 == 1819304813) {
                    if (i21 == -1) {
                        str3 = "audio/raw";
                        i21 = 2;
                    } else {
                        str3 = "audio/raw";
                    }
                } else if (iG5 == 778924082 || iG5 == 778924083) {
                    str3 = "audio/mpeg";
                } else if (iG5 == 1835557169) {
                    str3 = "audio/mha1";
                } else if (iG5 == 1835560241) {
                    str3 = "audio/mhm1";
                } else if (iG5 == 1634492771) {
                    str3 = "audio/alac";
                } else if (iG5 == 1634492791) {
                    str3 = "audio/g711-alaw";
                } else if (iG5 == 1970037111) {
                    str3 = "audio/g711-mlaw";
                } else if (iG5 == 1332770163) {
                    str3 = "audio/opus";
                } else if (iG5 == 1716281667) {
                    str3 = "audio/flac";
                } else {
                    str3 = iG5 == 1835823201 ? "audio/true-hd" : null;
                }
                i4 = i27;
                i23 = i28;
                int i61 = i60;
                List listA = null;
                String str18 = null;
                EsdsData esdsData5 = null;
                while (i59 - i23 < iG4) {
                    parsableByteArray.G(i59);
                    int iG21 = parsableByteArray.g();
                    int i62 = iG4;
                    ExtractorUtil.a(str10, iG21 > 0);
                    int iG22 = parsableByteArray.g();
                    int i63 = i21;
                    if (iG22 == 1835557187) {
                        parsableByteArray.G(i59 + 8);
                        parsableByteArray.H(1);
                        int iU6 = parsableByteArray.u();
                        parsableByteArray.H(1);
                        String str19 = Objects.equals(str3, str17) ? String.format("mhm1.%02X", Integer.valueOf(iU6)) : String.format("mha1.%02X", Integer.valueOf(iU6));
                        int iA7 = parsableByteArray.A();
                        byte[] bArr8 = new byte[iA7];
                        String str20 = str19;
                        parsableByteArray.e(bArr8, 0, iA7);
                        listA = listA == null ? ImmutableList.z(bArr8) : ImmutableList.A(bArr8, (byte[]) listA.get(0));
                        str5 = str10;
                        str4 = str17;
                        str18 = str20;
                    } else if (iG22 == 1835557200) {
                        parsableByteArray.G(i59 + 8);
                        int iU7 = parsableByteArray.u();
                        if (iU7 > 0) {
                            byte[] bArr9 = new byte[iU7];
                            str9 = str3;
                            parsableByteArray.e(bArr9, 0, iU7);
                            listA = listA == null ? ImmutableList.z(bArr9) : ImmutableList.A((byte[]) listA.get(0), bArr9);
                        } else {
                            str9 = str3;
                        }
                        str5 = str10;
                        str4 = str17;
                        str3 = str9;
                    } else {
                        str3 = str3;
                        if (iG22 == 1702061171 || (z2 && iG22 == 2002876005)) {
                            List list4 = listA;
                            String str21 = str18;
                            String str22 = str10;
                            str4 = str17;
                            if (iG22 != 1702061171) {
                                int i64 = parsableByteArray.f5668b;
                                ExtractorUtil.a(null, i64 >= i59);
                                i24 = i64;
                                while (true) {
                                    if (i24 - i59 >= iG21) {
                                        str5 = str22;
                                        i24 = -1;
                                        break;
                                    }
                                    parsableByteArray.G(i24);
                                    int iG23 = parsableByteArray.g();
                                    str5 = str22;
                                    ExtractorUtil.a(str5, iG23 > 0);
                                    if (parsableByteArray.g() == 1702061171) {
                                        break;
                                    }
                                    i24 += iG23;
                                    str22 = str5;
                                }
                            } else {
                                i24 = i59;
                                str5 = str22;
                            }
                            if (i24 != -1) {
                                EsdsData esdsDataA2 = a(i24, parsableByteArray);
                                str3 = esdsDataA2.f7064a;
                                byte[] bArr10 = esdsDataA2.f7065b;
                                if (bArr10 == null) {
                                    esdsData = esdsDataA2;
                                } else if ("audio/vorbis".equals(str3)) {
                                    ParsableByteArray parsableByteArray2 = new ParsableByteArray(bArr10);
                                    parsableByteArray2.H(1);
                                    int i65 = 0;
                                    while (true) {
                                        if (parsableByteArray2.a() <= 0) {
                                            esdsData2 = esdsDataA2;
                                            break;
                                        }
                                        esdsData2 = esdsDataA2;
                                        if ((parsableByteArray2.f5667a[parsableByteArray2.f5668b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) != 255) {
                                            break;
                                        }
                                        i65 += 255;
                                        parsableByteArray2.H(1);
                                        esdsDataA2 = esdsData2;
                                    }
                                    int iU8 = parsableByteArray2.u() + i65;
                                    int i66 = 0;
                                    while (true) {
                                        if (parsableByteArray2.a() <= 0) {
                                            iG21 = iG21;
                                            break;
                                        }
                                        iG21 = iG21;
                                        if ((parsableByteArray2.f5667a[parsableByteArray2.f5668b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) != 255) {
                                            break;
                                        }
                                        i66 += 255;
                                        parsableByteArray2.H(1);
                                        iG21 = iG21;
                                    }
                                    int iU9 = parsableByteArray2.u() + i66;
                                    byte[] bArr11 = new byte[iU8];
                                    int i67 = parsableByteArray2.f5668b;
                                    System.arraycopy(bArr10, i67, bArr11, 0, iU8);
                                    int i68 = i67 + iU8 + iU9;
                                    int length = bArr10.length - i68;
                                    byte[] bArr12 = new byte[length];
                                    System.arraycopy(bArr10, i68, bArr12, 0, length);
                                    listA = ImmutableList.A(bArr11, bArr12);
                                    esdsData = esdsData2;
                                    str18 = str21;
                                } else {
                                    iG21 = iG21;
                                    if ("audio/mp4a-latm".equals(str3)) {
                                        AacUtil.Config configB = AacUtil.b(new ParsableBitArray(bArr10, bArr10.length), false);
                                        i61 = configB.f6698a;
                                        iA = configB.f6699b;
                                        str6 = configB.f6700c;
                                    } else {
                                        str6 = str21;
                                    }
                                    ImmutableList immutableListZ2 = ImmutableList.z(bArr10);
                                    str18 = str6;
                                    listA = immutableListZ2;
                                    esdsData = esdsDataA2;
                                }
                                esdsData5 = esdsData;
                            } else {
                                esdsData = esdsData5;
                                str3 = str3;
                            }
                            listA = list4;
                            str18 = str21;
                            esdsData5 = esdsData;
                        } else {
                            if (iG22 == 1684103987) {
                                parsableByteArray.G(i59 + 8);
                                String string = Integer.toString(i2);
                                ParsableBitArray parsableBitArray2 = new ParsableBitArray();
                                parsableBitArray2.k(parsableByteArray);
                                int i69 = Ac3Util.f6702b[parsableBitArray2.g(2)];
                                str4 = str17;
                                parsableBitArray2.o(8);
                                int i70 = Ac3Util.d[parsableBitArray2.g(3)];
                                int i71 = parsableBitArray2.g(1) != 0 ? i70 + 1 : i70;
                                list = listA;
                                int i72 = Ac3Util.f6704e[parsableBitArray2.g(5)] * 1000;
                                parsableBitArray2.c();
                                parsableByteArray.G(parsableBitArray2.d());
                                Format.Builder builder4 = new Format.Builder();
                                builder4.f5423a = string;
                                builder4.f5429l = MimeTypes.l("audio/ac3");
                                builder4.f5434z = i71;
                                builder4.f5418A = i69;
                                builder4.f5431p = drmInitData2;
                                builder4.d = str;
                                builder4.g = i72;
                                builder4.f5427h = i72;
                                stsdData2.f7068b = new Format(builder4);
                                str18 = str18;
                                str7 = str10;
                            } else {
                                list = listA;
                                str4 = str17;
                                if (iG22 == 1684366131) {
                                    parsableByteArray.G(i59 + 8);
                                    String string2 = Integer.toString(i2);
                                    ParsableBitArray parsableBitArray3 = new ParsableBitArray();
                                    parsableBitArray3.k(parsableByteArray);
                                    int iG24 = parsableBitArray3.g(13) * 1000;
                                    parsableBitArray3.o(3);
                                    int i73 = Ac3Util.f6702b[parsableBitArray3.g(2)];
                                    parsableBitArray3.o(10);
                                    int i74 = Ac3Util.d[parsableBitArray3.g(3)];
                                    if (parsableBitArray3.g(1) != 0) {
                                        i74++;
                                    }
                                    parsableBitArray3.o(3);
                                    int iG25 = parsableBitArray3.g(4);
                                    parsableBitArray3.o(1);
                                    if (iG25 > 0) {
                                        parsableBitArray3.o(6);
                                        if (parsableBitArray3.g(1) != 0) {
                                            i74 += 2;
                                        }
                                        parsableBitArray3.o(1);
                                    }
                                    int i75 = i74;
                                    str7 = str10;
                                    if (parsableBitArray3.b() > 7) {
                                        parsableBitArray3.o(7);
                                        if (parsableBitArray3.g(1) != 0) {
                                            str8 = "audio/eac3-joc";
                                        } else {
                                            str8 = "audio/eac3";
                                        }
                                    } else {
                                        str8 = "audio/eac3";
                                    }
                                    parsableBitArray3.c();
                                    parsableByteArray.G(parsableBitArray3.d());
                                    Format.Builder builder5 = new Format.Builder();
                                    builder5.f5423a = string2;
                                    builder5.f5429l = MimeTypes.l(str8);
                                    builder5.f5434z = i75;
                                    builder5.f5418A = i73;
                                    builder5.f5431p = drmInitData2;
                                    builder5.d = str;
                                    builder5.f5427h = iG24;
                                    stsdData2.f7068b = new Format(builder5);
                                } else {
                                    str18 = str18;
                                    str7 = str10;
                                    if (iG22 == 1684103988) {
                                        parsableByteArray.G(i59 + 8);
                                        String string3 = Integer.toString(i2);
                                        parsableByteArray.H(1);
                                        int i76 = ((parsableByteArray.u() & 32) >> 5) == 1 ? 48000 : 44100;
                                        Format.Builder builder6 = new Format.Builder();
                                        builder6.f5423a = string3;
                                        builder6.f5429l = MimeTypes.l("audio/ac4");
                                        builder6.f5434z = 2;
                                        builder6.f5418A = i76;
                                        builder6.f5431p = drmInitData2;
                                        builder6.d = str;
                                        stsdData2.f7068b = new Format(builder6);
                                    } else if (iG22 != 1684892784) {
                                        if (iG22 == 1684305011 || iG22 == 1969517683) {
                                            Format.Builder builder7 = new Format.Builder();
                                            builder7.f5423a = Integer.toString(i2);
                                            builder7.f5429l = MimeTypes.l(str3);
                                            builder7.f5434z = iA;
                                            builder7.f5418A = i61;
                                            builder7.f5431p = drmInitData2;
                                            builder7.d = str;
                                            stsdData2.f7068b = new Format(builder7);
                                        } else if (iG22 == 1682927731) {
                                            int i77 = iG21 - 8;
                                            byte[] bArr13 = f7057a;
                                            byte[] bArrCopyOf = Arrays.copyOf(bArr13, bArr13.length + i77);
                                            parsableByteArray.G(i59 + 8);
                                            parsableByteArray.e(bArrCopyOf, bArr13.length, i77);
                                            listA = OpusUtil.a(bArrCopyOf);
                                            str3 = str3;
                                            str5 = str7;
                                            str18 = str18;
                                        } else if (iG22 == 1684425825) {
                                            byte[] bArr14 = new byte[iG21 - 8];
                                            bArr14[0] = 102;
                                            bArr14[1] = 76;
                                            bArr14[2] = 97;
                                            bArr14[3] = 67;
                                            parsableByteArray.G(i59 + 12);
                                            parsableByteArray.e(bArr14, 4, iG21 - 12);
                                            listA = ImmutableList.z(bArr14);
                                        } else if (iG22 == 1634492771) {
                                            int i78 = iG21 - 12;
                                            byte[] bArr15 = new byte[i78];
                                            parsableByteArray.G(i59 + 12);
                                            parsableByteArray.e(bArr15, 0, i78);
                                            ParsableByteArray parsableByteArray3 = new ParsableByteArray(bArr15);
                                            parsableByteArray3.G(9);
                                            int iU10 = parsableByteArray3.u();
                                            parsableByteArray3.G(20);
                                            Pair pairCreate = Pair.create(Integer.valueOf(parsableByteArray3.y()), Integer.valueOf(iU10));
                                            int iIntValue = ((Integer) pairCreate.first).intValue();
                                            iA = ((Integer) pairCreate.second).intValue();
                                            listA = ImmutableList.z(bArr15);
                                            i61 = iIntValue;
                                        }
                                        listA = list;
                                    } else {
                                        if (i20 <= 0) {
                                            throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + i20);
                                        }
                                        i61 = i20;
                                        str3 = str3;
                                        listA = list;
                                        str5 = str7;
                                        str18 = str18;
                                        iA = 2;
                                    }
                                    str5 = str7;
                                    str18 = str18;
                                }
                            }
                            listA = list;
                            str5 = str7;
                            str18 = str18;
                        }
                        i59 += iG21;
                        str10 = str5;
                        iG4 = i62;
                        i21 = i63;
                        str17 = str4;
                    }
                    i59 += iG21;
                    str10 = str5;
                    iG4 = i62;
                    i21 = i63;
                    str17 = str4;
                }
                List list5 = listA;
                int i79 = i21;
                String str23 = str3;
                String str24 = str18;
                i22 = iG4;
                if (stsdData2.f7068b == null && str23 != null) {
                    Format.Builder builder8 = new Format.Builder();
                    builder8.f5423a = Integer.toString(i2);
                    builder8.f5429l = MimeTypes.l(str23);
                    builder8.f5428i = str24;
                    builder8.f5434z = iA;
                    builder8.f5418A = i61;
                    builder8.f5419B = i79;
                    builder8.o = list5;
                    builder8.f5431p = drmInitData2;
                    builder8.d = str;
                    if (esdsData5 != null) {
                        EsdsData esdsData6 = esdsData5;
                        builder8.g = Ints.e(esdsData6.f7066c);
                        builder8.f5427h = Ints.e(esdsData6.d);
                    }
                    stsdData2.f7068b = new Format(builder8);
                }
                stsdData = stsdData2;
                i8 = i22;
                i7 = i23;
            } else {
                if (iG5 == 1414810956 || iG5 == 1954034535 || iG5 == 2004251764 || iG5 == 1937010800 || iG5 == 1664495672) {
                    parsableByteArray.G(i28 + 16);
                    String str25 = "application/ttml+xml";
                    long j = Long.MAX_VALUE;
                    if (iG5 == 1414810956) {
                        immutableList2 = null;
                    } else if (iG5 == 1954034535) {
                        int i80 = iG4 - 16;
                        byte[] bArr16 = new byte[i80];
                        parsableByteArray.e(bArr16, 0, i80);
                        ImmutableList immutableListZ3 = ImmutableList.z(bArr16);
                        str25 = "application/x-quicktime-tx3g";
                        immutableList2 = immutableListZ3;
                    } else {
                        if (iG5 == 2004251764) {
                            str25 = "application/x-mp4-vtt";
                        } else if (iG5 == 1937010800) {
                            j = 0;
                        } else {
                            if (iG5 != 1664495672) {
                                throw new IllegalStateException();
                            }
                            stsdData2.d = 1;
                            str25 = "application/x-mp4-cea-608";
                        }
                        immutableList2 = null;
                    }
                    Format.Builder builder9 = new Format.Builder();
                    builder9.f5423a = Integer.toString(i2);
                    builder9.f5429l = MimeTypes.l(str25);
                    builder9.d = str;
                    builder9.q = j;
                    builder9.o = immutableList2;
                    stsdData2.f7068b = new Format(builder9);
                } else if (iG5 == 1835365492) {
                    parsableByteArray.G(i28 + 16);
                    if (iG5 == 1835365492) {
                        parsableByteArray.p();
                        String strP = parsableByteArray.p();
                        if (strP != null) {
                            Format.Builder builder10 = new Format.Builder();
                            builder10.f5423a = Integer.toString(i2);
                            builder10.f5429l = MimeTypes.l(strP);
                            stsdData2.f7068b = new Format(builder10);
                        }
                    }
                } else if (iG5 == 1667329389) {
                    Format.Builder builder11 = new Format.Builder();
                    builder11.f5423a = Integer.toString(i2);
                    builder11.f5429l = MimeTypes.l("application/x-camera-motion");
                    stsdData2.f7068b = new Format(builder11);
                }
                iG3 = iG3;
                stsdData = stsdData2;
                i4 = i27;
                i7 = i28;
                i8 = iG4;
            }
            parsableByteArray.G(i7 + i8);
            i27 = i4 + 1;
            stsdData2 = stsdData;
            iG3 = iG3;
        }
        return stsdData2;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0278  */
    /* JADX WARN: Code duplicated, block: B:124:0x0283  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:360:0x088f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:81:0x014d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x019d  */
    /* JADX WARN: Code duplicated, block: B:91:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01de  */
    public static ArrayList f(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z2, boolean z3, Function function) {
        byte b2;
        ArrayList arrayList;
        long jO;
        long j2;
        int i2;
        int i3;
        TkhdData tkhdData;
        long j3;
        long j4;
        long j5;
        long j6;
        int iB;
        int i4;
        int i5;
        Pair pairCreate;
        Atom.LeafAtom leafAtomD;
        StsdData stsdDataE;
        long j7;
        long[] jArr;
        long[] jArr2;
        Track track;
        Atom.ContainerAtom containerAtomC;
        Pair pairCreate2;
        SampleSizeBox stz2SampleSizeBox;
        boolean z4;
        int iY;
        int iY2;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArrCopyOf;
        long[] jArr3;
        byte b3;
        boolean z5;
        int[] iArr;
        int i10;
        long j8;
        long[] jArr4;
        int[] iArr2;
        long[] jArr5;
        int i11;
        int i12;
        TrackSampleTable trackSampleTable;
        long j9;
        int[] iArr3;
        int i13;
        int i14;
        int i15;
        byte b4 = -1;
        ArrayList arrayList2 = new ArrayList();
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = containerAtom.d;
            if (i16 >= arrayList3.size()) {
                return arrayList2;
            }
            Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) arrayList3.get(i16);
            if (containerAtom2.f7053a != 1953653099) {
                b3 = b4;
                arrayList = arrayList2;
                i7 = i16;
            } else {
                Atom.LeafAtom leafAtomD2 = containerAtom.d(1836476516);
                leafAtomD2.getClass();
                Atom.ContainerAtom containerAtomC2 = containerAtom2.c(1835297121);
                containerAtomC2.getClass();
                Atom.LeafAtom leafAtomD3 = containerAtomC2.d(1751411826);
                leafAtomD3.getClass();
                ParsableByteArray parsableByteArray = leafAtomD3.f7056b;
                parsableByteArray.G(16);
                int iG = parsableByteArray.g();
                if (iG == 1936684398) {
                    b2 = 1;
                } else if (iG == 1986618469) {
                    b2 = 2;
                } else if (iG == 1952807028 || iG == 1935832172 || iG == 1937072756 || iG == 1668047728) {
                    b2 = 3;
                } else {
                    b2 = iG == 1835365473 ? (byte) 5 : b4;
                }
                arrayList = arrayList2;
                int i17 = 1;
                long j10 = 0;
                if (b2 == b4) {
                    track = null;
                } else {
                    Atom.LeafAtom leafAtomD4 = containerAtom2.d(1953196132);
                    leafAtomD4.getClass();
                    ParsableByteArray parsableByteArray2 = leafAtomD4.f7056b;
                    parsableByteArray2.G(8);
                    int iB2 = Atom.b(parsableByteArray2.g());
                    parsableByteArray2.H(iB2 == 0 ? 8 : 16);
                    int iG2 = parsableByteArray2.g();
                    parsableByteArray2.H(4);
                    int i18 = parsableByteArray2.f5668b;
                    int i19 = iB2 == 0 ? 4 : 8;
                    int i20 = 0;
                    while (true) {
                        jO = -9223372036854775807L;
                        if (i20 >= i19) {
                            parsableByteArray2.H(i19);
                        } else {
                            if (parsableByteArray2.f5667a[i18 + i20] != b4) {
                                long jW = iB2 == 0 ? parsableByteArray2.w() : parsableByteArray2.z();
                                if (jW != 0) {
                                    j2 = jW;
                                    break;
                                }
                                break;
                            }
                            i20++;
                        }
                        j2 = -9223372036854775807L;
                        break;
                    }
                    parsableByteArray2.H(16);
                    int iG3 = parsableByteArray2.g();
                    int iG4 = parsableByteArray2.g();
                    parsableByteArray2.H(4);
                    int iG5 = parsableByteArray2.g();
                    int iG6 = parsableByteArray2.g();
                    if (iG3 == 0 && iG4 == 65536) {
                        i2 = -65536;
                        if (iG5 == -65536 && iG6 == 0) {
                            i3 = 90;
                        }
                        tkhdData = new TkhdData(iG2, j2, i3);
                        if (j == -9223372036854775807L) {
                            j3 = j2;
                        } else {
                            j3 = j;
                        }
                        j4 = c(leafAtomD2.f7056b).Z;
                        if (j3 == -9223372036854775807L) {
                            j5 = j4;
                        } else {
                            int i21 = Util.f5683a;
                            j5 = j4;
                            jO = Util.O(j3, 1000000L, j5, RoundingMode.FLOOR);
                        }
                        j6 = jO;
                        Atom.ContainerAtom containerAtomC3 = containerAtomC2.c(1835626086);
                        containerAtomC3.getClass();
                        Atom.ContainerAtom containerAtomC4 = containerAtomC3.c(1937007212);
                        containerAtomC4.getClass();
                        Atom.LeafAtom leafAtomD5 = containerAtomC2.d(1835296868);
                        leafAtomD5.getClass();
                        ParsableByteArray parsableByteArray3 = leafAtomD5.f7056b;
                        parsableByteArray3.G(8);
                        iB = Atom.b(parsableByteArray3.g());
                        if (iB == 0) {
                            i4 = 8;
                        } else {
                            i4 = 16;
                        }
                        parsableByteArray3.H(i4);
                        long jW2 = parsableByteArray3.w();
                        if (iB == 0) {
                            i5 = 4;
                        } else {
                            i5 = 8;
                        }
                        parsableByteArray3.H(i5);
                        int iA = parsableByteArray3.A();
                        pairCreate = Pair.create(Long.valueOf(jW2), "" + ((char) (((iA >> 10) & 31) + 96)) + ((char) (((iA >> 5) & 31) + 96)) + ((char) ((iA & 31) + 96)));
                        leafAtomD = containerAtomC4.d(1937011556);
                        if (leafAtomD != null) {
                            throw ParserException.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                        }
                        stsdDataE = e(leafAtomD.f7056b, iG2, i3, (String) pairCreate.second, drmInitData, z3);
                        if (!z2 || (containerAtomC = containerAtom2.c(1701082227)) == null) {
                            j7 = j6;
                        } else {
                            Atom.LeafAtom leafAtomD6 = containerAtomC.d(1701606260);
                            if (leafAtomD6 == null) {
                                j7 = j6;
                                pairCreate2 = null;
                            } else {
                                ParsableByteArray parsableByteArray4 = leafAtomD6.f7056b;
                                parsableByteArray4.G(8);
                                int iB3 = Atom.b(parsableByteArray4.g());
                                int iY3 = parsableByteArray4.y();
                                long[] jArr6 = new long[iY3];
                                long[] jArr7 = new long[iY3];
                                int i22 = 0;
                                while (i22 < iY3) {
                                    int i23 = i22;
                                    int i24 = i17;
                                    jArr6[i23] = iB3 == i24 ? parsableByteArray4.z() : parsableByteArray4.w();
                                    jArr7[i23] = iB3 == i24 ? parsableByteArray4.o() : parsableByteArray4.g();
                                    if (parsableByteArray4.r() != 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    parsableByteArray4.H(2);
                                    i22 = i23 + 1;
                                    i17 = 1;
                                    j6 = j6;
                                }
                                j7 = j6;
                                pairCreate2 = Pair.create(jArr6, jArr7);
                            }
                            if (pairCreate2 != null) {
                                jArr = (long[]) pairCreate2.first;
                                jArr2 = (long[]) pairCreate2.second;
                            }
                            if (stsdDataE.f7068b == null) {
                                track = null;
                            } else {
                                track = new Track(tkhdData.f7077a, b2, ((Long) pairCreate.first).longValue(), j5, j7, stsdDataE.f7068b, stsdDataE.d, stsdDataE.f7067a, stsdDataE.f7069c, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (stsdDataE.f7068b == null) {
                            track = null;
                        } else {
                            track = new Track(tkhdData.f7077a, b2, ((Long) pairCreate.first).longValue(), j5, j7, stsdDataE.f7068b, stsdDataE.d, stsdDataE.f7067a, stsdDataE.f7069c, jArr, jArr2);
                        }
                    } else {
                        i2 = -65536;
                    }
                    if (iG3 == 0 && iG4 == i2) {
                        if (iG5 == 65536 && iG6 == 0) {
                            i3 = 270;
                        } else {
                            i2 = -65536;
                            if (iG3 != i2) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                            }
                        }
                    } else if (iG3 != i2 && iG4 == 0 && iG5 == 0 && iG6 == i2) {
                        i3 = 180;
                    } else {
                        i3 = 0;
                    }
                    tkhdData = new TkhdData(iG2, j2, i3);
                    if (j == -9223372036854775807L) {
                        j3 = j2;
                    } else {
                        j3 = j;
                    }
                    j4 = c(leafAtomD2.f7056b).Z;
                    if (j3 == -9223372036854775807L) {
                        j5 = j4;
                    } else {
                        int i25 = Util.f5683a;
                        j5 = j4;
                        jO = Util.O(j3, 1000000L, j5, RoundingMode.FLOOR);
                    }
                    j6 = jO;
                    Atom.ContainerAtom containerAtomC5 = containerAtomC2.c(1835626086);
                    containerAtomC5.getClass();
                    Atom.ContainerAtom containerAtomC6 = containerAtomC5.c(1937007212);
                    containerAtomC6.getClass();
                    Atom.LeafAtom leafAtomD7 = containerAtomC2.d(1835296868);
                    leafAtomD7.getClass();
                    ParsableByteArray parsableByteArray5 = leafAtomD7.f7056b;
                    parsableByteArray5.G(8);
                    iB = Atom.b(parsableByteArray5.g());
                    if (iB == 0) {
                        i4 = 8;
                    } else {
                        i4 = 16;
                    }
                    parsableByteArray5.H(i4);
                    long jW3 = parsableByteArray5.w();
                    if (iB == 0) {
                        i5 = 4;
                    } else {
                        i5 = 8;
                    }
                    parsableByteArray5.H(i5);
                    int iA2 = parsableByteArray5.A();
                    pairCreate = Pair.create(Long.valueOf(jW3), "" + ((char) (((iA2 >> 10) & 31) + 96)) + ((char) (((iA2 >> 5) & 31) + 96)) + ((char) ((iA2 & 31) + 96)));
                    leafAtomD = containerAtomC6.d(1937011556);
                    if (leafAtomD != null) {
                        throw ParserException.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                    }
                    stsdDataE = e(leafAtomD.f7056b, iG2, i3, (String) pairCreate.second, drmInitData, z3);
                    if (z2) {
                        j7 = j6;
                        jArr = null;
                        jArr2 = null;
                    } else {
                        j7 = j6;
                        jArr = null;
                        jArr2 = null;
                    }
                    if (stsdDataE.f7068b == null) {
                        track = null;
                    } else {
                        track = new Track(tkhdData.f7077a, b2, ((Long) pairCreate.first).longValue(), j5, j7, stsdDataE.f7068b, stsdDataE.d, stsdDataE.f7067a, stsdDataE.f7069c, jArr, jArr2);
                    }
                }
                Track track2 = (Track) function.apply(track);
                if (track2 == null) {
                    i7 = i16;
                    arrayList = arrayList;
                    b3 = -1;
                } else {
                    Atom.ContainerAtom containerAtomC7 = containerAtom2.c(1835297121);
                    containerAtomC7.getClass();
                    Atom.ContainerAtom containerAtomC8 = containerAtomC7.c(1835626086);
                    containerAtomC8.getClass();
                    Atom.ContainerAtom containerAtomC9 = containerAtomC8.c(1937007212);
                    containerAtomC9.getClass();
                    Atom.LeafAtom leafAtomD8 = containerAtomC9.d(1937011578);
                    Format format = track2.f;
                    if (leafAtomD8 != null) {
                        stz2SampleSizeBox = new StszSampleSizeBox(leafAtomD8, format);
                    } else {
                        Atom.LeafAtom leafAtomD9 = containerAtomC9.d(1937013298);
                        if (leafAtomD9 == null) {
                            throw ParserException.a(null, "Track has no sample table size information");
                        }
                        stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomD9);
                    }
                    int sampleCount = stz2SampleSizeBox.getSampleCount();
                    if (sampleCount == 0) {
                        trackSampleTable = new TrackSampleTable(track2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        i7 = i16;
                        b3 = -1;
                    } else {
                        Atom.LeafAtom leafAtomD10 = containerAtomC9.d(1937007471);
                        if (leafAtomD10 == null) {
                            leafAtomD10 = containerAtomC9.d(1668232756);
                            leafAtomD10.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Atom.LeafAtom leafAtomD11 = containerAtomC9.d(1937011555);
                        leafAtomD11.getClass();
                        Atom.LeafAtom leafAtomD12 = containerAtomC9.d(1937011827);
                        leafAtomD12.getClass();
                        Atom.LeafAtom leafAtomD13 = containerAtomC9.d(1937011571);
                        ParsableByteArray parsableByteArray6 = leafAtomD13 != null ? leafAtomD13.f7056b : null;
                        Atom.LeafAtom leafAtomD14 = containerAtomC9.d(1668576371);
                        ParsableByteArray parsableByteArray7 = leafAtomD14 != null ? leafAtomD14.f7056b : null;
                        ChunkIterator chunkIterator = new ChunkIterator(leafAtomD11.f7056b, leafAtomD10.f7056b, z4);
                        ParsableByteArray parsableByteArray8 = leafAtomD12.f7056b;
                        parsableByteArray8.G(12);
                        int iY4 = parsableByteArray8.y() - 1;
                        int iY5 = parsableByteArray8.y();
                        int iY6 = parsableByteArray8.y();
                        if (parsableByteArray7 != null) {
                            parsableByteArray7.G(12);
                            iY = parsableByteArray7.y();
                        } else {
                            iY = 0;
                        }
                        if (parsableByteArray6 != null) {
                            parsableByteArray6.G(12);
                            int iY7 = parsableByteArray6.y();
                            if (iY7 > 0) {
                                iY2 = parsableByteArray6.y() - 1;
                                i6 = iY7;
                            } else {
                                i6 = iY7;
                                parsableByteArray6 = null;
                                iY2 = -1;
                            }
                        } else {
                            iY2 = -1;
                            i6 = 0;
                        }
                        int iA3 = stz2SampleSizeBox.a();
                        String str = format.m;
                        ParsableByteArray parsableByteArray9 = parsableByteArray7;
                        if (iA3 == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iY4 == 0 && iY == 0 && i6 == 0)) {
                            i7 = i16;
                            long[] jArrCopyOf = new long[sampleCount];
                            int[] iArrCopyOf2 = new int[sampleCount];
                            long[] jArr8 = new long[sampleCount];
                            int[] iArr4 = new int[sampleCount];
                            int i26 = iY2;
                            SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
                            int iY8 = i26;
                            int i27 = i6;
                            ParsableByteArray parsableByteArray10 = parsableByteArray6;
                            long j11 = 0;
                            long j12 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            int iG7 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            while (true) {
                                if (i29 >= sampleCount) {
                                    i8 = iY4;
                                    i9 = iY5;
                                    iArrCopyOf = iArr4;
                                    jArr3 = jArr8;
                                    sampleCount = sampleCount;
                                    break;
                                }
                                boolean zA = true;
                                while (i30 == 0) {
                                    zA = chunkIterator.a();
                                    if (!zA) {
                                        break;
                                    }
                                    int i32 = iY4;
                                    long j13 = chunkIterator.d;
                                    i30 = chunkIterator.f7060c;
                                    j12 = j13;
                                    iY4 = i32;
                                    iY5 = iY5;
                                    sampleCount = sampleCount;
                                }
                                int i33 = sampleCount;
                                i8 = iY4;
                                i9 = iY5;
                                if (!zA) {
                                    Log.g("AtomParsers", "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i29);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i29);
                                    long[] jArrCopyOf2 = Arrays.copyOf(jArr8, i29);
                                    iArrCopyOf = Arrays.copyOf(iArr4, i29);
                                    jArr3 = jArrCopyOf2;
                                    sampleCount = i29;
                                    break;
                                }
                                if (parsableByteArray9 != null) {
                                    int iY9 = i31;
                                    while (iY9 == 0 && iY > 0) {
                                        iY9 = parsableByteArray9.y();
                                        iG7 = parsableByteArray9.g();
                                        iY--;
                                    }
                                    i31 = iY9 - 1;
                                }
                                int[] iArr5 = iArr4;
                                jArrCopyOf[i29] = j12;
                                int nextSampleSize = sampleSizeBox.readNextSampleSize();
                                iArrCopyOf2[i29] = nextSampleSize;
                                if (nextSampleSize > i28) {
                                    i28 = nextSampleSize;
                                }
                                jArr8[i29] = j11 + ((long) iG7);
                                iArr5[i29] = parsableByteArray10 == null ? 1 : 0;
                                if (i29 == iY8) {
                                    iArr5[i29] = 1;
                                    i27--;
                                    if (i27 > 0) {
                                        parsableByteArray10.getClass();
                                        iY8 = parsableByteArray10.y() - 1;
                                    }
                                }
                                j11 += (long) iY6;
                                iY5 = i9 - 1;
                                if (iY5 != 0 || i8 <= 0) {
                                    iY4 = i8;
                                } else {
                                    iY4 = i8 - 1;
                                    iY5 = parsableByteArray8.y();
                                    iY6 = parsableByteArray8.g();
                                }
                                j12 += (long) iArrCopyOf2[i29];
                                i30--;
                                i29++;
                                iArr4 = iArr5;
                                sampleCount = i33;
                            }
                            long[] jArr9 = jArrCopyOf;
                            int i34 = i30;
                            long j14 = j11 + ((long) iG7);
                            if (parsableByteArray9 == null) {
                                b3 = -1;
                                z5 = true;
                                break;
                            }
                            while (true) {
                                if (iY <= 0) {
                                    b3 = -1;
                                    z5 = true;
                                    break;
                                }
                                if (parsableByteArray9.y() != 0) {
                                    z5 = false;
                                    b3 = -1;
                                    break;
                                }
                                parsableByteArray9.g();
                                iY--;
                            }
                            if (i27 != 0 || i9 != 0 || i34 != 0 || i8 != 0 || i31 != 0 || !z5) {
                                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                boolean z6 = z5;
                                a.y(sb, track2.f7139a, ": remainingSynchronizationSamples ", i27, ", remainingSamplesAtTimestampDelta ");
                                a.y(sb, i9, ", remainingSamplesInChunk ", i34, ", remainingTimestampDeltaChanges ");
                                sb.append(i8);
                                sb.append(", remainingSamplesAtTimestampOffset ");
                                sb.append(i31);
                                sb.append(!z6 ? ", ctts invalid" : "");
                                Log.g("AtomParsers", sb.toString());
                            }
                            iArr = iArrCopyOf2;
                            i10 = i28;
                            j8 = j14;
                            jArr4 = jArr9;
                            iArr2 = iArrCopyOf;
                            jArr5 = jArr3;
                        } else {
                            int i35 = chunkIterator.f7058a;
                            long[] jArr10 = new long[i35];
                            int[] iArr6 = new int[i35];
                            while (chunkIterator.a()) {
                                int i36 = chunkIterator.f7059b;
                                jArr10[i36] = chunkIterator.d;
                                iArr6[i36] = chunkIterator.f7060c;
                            }
                            long j15 = iY6;
                            int i37 = Segment.SIZE / iA3;
                            int iF = 0;
                            for (int i38 = 0; i38 < i35; i38++) {
                                iF += Util.f(iArr6[i38], i37);
                            }
                            long[] jArr11 = new long[iF];
                            int[] iArr7 = new int[iF];
                            long[] jArr12 = new long[iF];
                            int[] iArr8 = new int[iF];
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            while (i39 < i35) {
                                int i43 = iArr6[i39];
                                long j16 = jArr10[i39];
                                int i44 = i42;
                                int i45 = i35;
                                int iMax = i41;
                                int i46 = i44;
                                int i47 = i39;
                                int i48 = i43;
                                while (i48 > 0) {
                                    int iMin = Math.min(i37, i48);
                                    jArr11[i46] = j16;
                                    int i49 = i48;
                                    int i50 = iA3 * iMin;
                                    iArr7[i46] = i50;
                                    iMax = Math.max(iMax, i50);
                                    jArr12[i46] = ((long) i40) * j15;
                                    iArr8[i46] = 1;
                                    j16 += (long) iArr7[i46];
                                    i40 += iMin;
                                    i46++;
                                    iArr6 = iArr6;
                                    i48 = i49 - iMin;
                                    i16 = i16;
                                }
                                int i51 = i16;
                                int i52 = i46;
                                i41 = iMax;
                                i35 = i45;
                                i42 = i52;
                                iArr6 = iArr6;
                                i39 = i47 + 1;
                                i16 = i51;
                            }
                            i7 = i16;
                            j8 = j15 * ((long) i40);
                            iArr = iArr7;
                            i10 = i41;
                            b3 = -1;
                            iArr2 = iArr8;
                            jArr5 = jArr12;
                            jArr4 = jArr11;
                        }
                        int i53 = Util.f5683a;
                        RoundingMode roundingMode = RoundingMode.FLOOR;
                        long jO2 = Util.O(j8, 1000000L, track2.f7141c, roundingMode);
                        long j17 = track2.f7141c;
                        long[] jArr13 = track2.f7143h;
                        if (jArr13 == null) {
                            Util.N(jArr5, j17);
                            trackSampleTable = new TrackSampleTable(track2, jArr4, iArr, i10, jArr5, iArr2, jO2);
                        } else {
                            long[] jArr14 = jArr5;
                            int length = jArr13.length;
                            int i54 = track2.f7140b;
                            long[] jArr15 = track2.f7144i;
                            if (length == 1 && i54 == 1 && jArr14.length >= 2) {
                                jArr15.getClass();
                                long j18 = jArr15[0];
                                i11 = i54;
                                long jO3 = Util.O(jArr13[0], track2.f7141c, track2.d, roundingMode) + j18;
                                int length2 = jArr14.length - 1;
                                int iJ = Util.j(4, 0, length2);
                                int iJ2 = Util.j(jArr14.length - 4, 0, length2);
                                long j19 = jArr14[0];
                                if (j19 <= j18 && j18 < jArr14[iJ] && jArr14[iJ2] < jO3 && jO3 <= j8) {
                                    long j20 = j8 - jO3;
                                    long j21 = j18 - j19;
                                    int i55 = format.f5401B;
                                    long jO4 = Util.O(j21, i55, track2.f7141c, roundingMode);
                                    long jO5 = Util.O(j20, i55, track2.f7141c, roundingMode);
                                    if ((jO4 != 0 || jO5 != 0) && jO4 <= 2147483647L && jO5 <= 2147483647L) {
                                        gaplessInfoHolder.f6773a = (int) jO4;
                                        gaplessInfoHolder.f6774b = (int) jO5;
                                        Util.N(jArr14, j17);
                                        trackSampleTable = new TrackSampleTable(track2, jArr4, iArr, i10, jArr14, iArr2, Util.O(jArr13[0], 1000000L, track2.d, roundingMode));
                                    }
                                }
                            } else {
                                i11 = i54;
                            }
                            if (jArr13.length != 1) {
                                i12 = 1;
                            } else if (jArr13[0] == 0) {
                                jArr15.getClass();
                                long j22 = jArr15[0];
                                for (int i56 = 0; i56 < jArr14.length; i56++) {
                                    jArr14[i56] = Util.O(jArr14[i56] - j22, 1000000L, track2.f7141c, RoundingMode.FLOOR);
                                }
                                trackSampleTable = new TrackSampleTable(track2, jArr4, iArr, i10, jArr14, iArr2, Util.O(j8 - j22, 1000000L, track2.f7141c, RoundingMode.FLOOR));
                            } else {
                                i12 = 1;
                            }
                            long[] jArr16 = jArr4;
                            int[] iArr9 = iArr;
                            int[] iArr10 = iArr2;
                            boolean z7 = i11 == i12;
                            int[] iArr11 = new int[jArr13.length];
                            int[] iArr12 = new int[jArr13.length];
                            jArr15.getClass();
                            int i57 = 0;
                            int i58 = 0;
                            boolean z8 = false;
                            int i59 = 0;
                            while (i58 < jArr13.length) {
                                int[] iArr13 = iArr11;
                                int[] iArr14 = iArr12;
                                long j23 = jArr15[i58];
                                if (j23 != -1) {
                                    i13 = i58;
                                    boolean z9 = z8;
                                    long jO6 = Util.O(jArr13[i58], track2.f7141c, track2.d, RoundingMode.FLOOR);
                                    iArr3 = iArr13;
                                    int i60 = 1;
                                    iArr3[i13] = Util.e(jArr14, j23, true);
                                    iArr14[i13] = Util.b(jArr14, j23 + jO6, z7);
                                    while (true) {
                                        i14 = iArr3[i13];
                                        i15 = iArr14[i13];
                                        if (i14 >= i15 || (iArr10[i14] & i60) != 0) {
                                            break;
                                        }
                                        iArr3[i13] = i14 + i60;
                                        i60 = 1;
                                    }
                                    int i61 = (i15 - i14) + i59;
                                    z8 = z9 | (i57 != i14);
                                    i59 = i61;
                                    i57 = i15;
                                } else {
                                    iArr3 = iArr13;
                                    i13 = i58;
                                }
                                i58 = i13 + 1;
                                iArr12 = iArr14;
                                iArr11 = iArr3;
                            }
                            int[] iArr15 = iArr11;
                            int[] iArr16 = iArr12;
                            boolean z10 = z8 | (i59 != sampleCount);
                            long[] jArr17 = z10 ? new long[i59] : jArr16;
                            int[] iArr17 = z10 ? new int[i59] : iArr9;
                            if (z10) {
                                i10 = 0;
                            }
                            int[] iArr18 = z10 ? new int[i59] : iArr10;
                            long[] jArr18 = new long[i59];
                            int i62 = 0;
                            int i63 = 0;
                            long j24 = 0;
                            while (i62 < jArr13.length) {
                                long j25 = jArr15[i62];
                                boolean z11 = z10;
                                int i64 = iArr15[i62];
                                long[] jArr19 = jArr13;
                                int i65 = iArr16[i62];
                                long[] jArr20 = jArr18;
                                if (z11) {
                                    int i66 = i65 - i64;
                                    System.arraycopy(jArr16, i64, jArr17, i63, i66);
                                    System.arraycopy(iArr9, i64, iArr17, i63, i66);
                                    System.arraycopy(iArr10, i64, iArr18, i63, i66);
                                }
                                int i67 = i10;
                                while (i64 < i65) {
                                    RoundingMode roundingMode2 = RoundingMode.FLOOR;
                                    int i68 = i64;
                                    long[] jArr21 = jArr17;
                                    long jO7 = Util.O(j24, 1000000L, track2.d, roundingMode2);
                                    long jO8 = Util.O(jArr14[i68] - j25, 1000000L, track2.f7141c, roundingMode2);
                                    int[] iArr19 = iArr17;
                                    int i69 = i65;
                                    if (i11 != 1) {
                                        j9 = j10;
                                        jO8 = Math.max(j9, jO8);
                                    } else {
                                        j9 = j10;
                                    }
                                    jArr20[i63] = jO7 + jO8;
                                    if (z11 && iArr19[i63] > i67) {
                                        i67 = iArr9[i68];
                                    }
                                    i63++;
                                    i64 = i68 + 1;
                                    j10 = j9;
                                    jArr17 = jArr21;
                                    iArr17 = iArr19;
                                    i65 = i69;
                                }
                                j24 += jArr19[i62];
                                i62++;
                                i10 = i67;
                                z10 = z11;
                                jArr13 = jArr19;
                                jArr18 = jArr20;
                                jArr17 = jArr17;
                                iArr17 = iArr17;
                            }
                            trackSampleTable = new TrackSampleTable(track2, jArr17, iArr17, i10, jArr18, iArr18, Util.O(j24, 1000000L, track2.d, RoundingMode.FLOOR));
                        }
                    }
                    arrayList.add(trackSampleTable);
                }
                i16 = i7 + 1;
                arrayList2 = arrayList;
                b4 = b3;
            }
            i16 = i7 + 1;
            arrayList2 = arrayList;
            b4 = b3;
        }
    }
}
