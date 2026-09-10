package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.shadow.okio.Segment;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
final class DefaultEbmlReader implements EbmlReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17665a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f17666b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VarintReader f17667c = new VarintReader();
    public EbmlProcessor d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17668e;
    public int f;
    public long g;

    public static final class MasterElement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17670b;

        public MasterElement(int i2, long j) {
            this.f17669a = i2;
            this.f17670b = j;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:234:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:510:0x088b  */
    /* JADX WARN: Code duplicated, block: B:515:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:516:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:519:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:520:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:522:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:524:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:526:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:529:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:531:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:534:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:537:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:540:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:542:0x0901  */
    /* JADX WARN: Code duplicated, block: B:562:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:564:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:567:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:570:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:573:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:592:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:594:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:596:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:612:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r47v0, types: [com.google.android.exoplayer2.extractor.DefaultExtractorInput] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean a(DefaultExtractorInput defaultExtractorInput) {
        String str;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        String str2;
        long j;
        int iB;
        int iA;
        int i4;
        byte b2;
        byte b3;
        int iS;
        ?? r3;
        int i5;
        List list;
        Pair pair;
        String str3;
        List list2;
        List list3;
        int i6;
        List listSingletonList;
        int i7;
        Format.Builder builder;
        boolean zG;
        int i8;
        int i9;
        int i10;
        float f;
        ColorInfo colorInfo;
        String str4;
        int iIntValue;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        String str5;
        MatroskaExtractor matroskaExtractor;
        DolbyVisionConfig dolbyVisionConfigA;
        List list4;
        boolean z5;
        SeekMap unseekable;
        int i15;
        DefaultEbmlReader defaultEbmlReader = this;
        ?? r4 = "A_VORBIS";
        String str6 = "A_OPUS";
        char c2 = 2;
        Assertions.e(defaultEbmlReader.d);
        while (true) {
            ArrayDeque arrayDeque = defaultEbmlReader.f17666b;
            MasterElement masterElement = (MasterElement) arrayDeque.peek();
            if (masterElement != null && defaultExtractorInput.d >= masterElement.f17670b) {
                EbmlProcessor ebmlProcessor = defaultEbmlReader.d;
                int i16 = ((MasterElement) arrayDeque.pop()).f17669a;
                MatroskaExtractor matroskaExtractor2 = MatroskaExtractor.this;
                Assertions.e(matroskaExtractor2.f17688b0);
                SparseArray sparseArray = matroskaExtractor2.f17689c;
                if (i16 == 160) {
                    if (matroskaExtractor2.G != 2) {
                        return true;
                    }
                    MatroskaExtractor.Track track = (MatroskaExtractor.Track) sparseArray.get(matroskaExtractor2.M);
                    track.X.getClass();
                    if (matroskaExtractor2.f17682R > 0 && str6.equals(track.f17714b)) {
                        byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(matroskaExtractor2.f17682R).array();
                        ParsableByteArray parsableByteArray = matroskaExtractor2.f17694n;
                        parsableByteArray.getClass();
                        parsableByteArray.D(bArrArray, bArrArray.length);
                    }
                    int i17 = 0;
                    for (int i18 = 0; i18 < matroskaExtractor2.K; i18++) {
                        i17 += matroskaExtractor2.L[i18];
                    }
                    int i19 = 0;
                    while (i19 < matroskaExtractor2.K) {
                        long j2 = matroskaExtractor2.H + ((long) ((track.f17716e * i19) / 1000));
                        int i20 = matroskaExtractor2.O;
                        if (i19 != 0 || matroskaExtractor2.f17681Q) {
                            i4 = 1;
                        } else {
                            i4 = 1;
                            i20 |= 1;
                        }
                        int i21 = i20;
                        int i22 = matroskaExtractor2.L[i19];
                        int i23 = i17 - i22;
                        matroskaExtractor2.f(track, j2, i21, i22, i23);
                        i19 += i4;
                        i17 = i23;
                    }
                    matroskaExtractor2.G = 0;
                    return true;
                }
                if (i16 != 174) {
                    if (i16 == 19899) {
                        int i24 = matroskaExtractor2.f17697w;
                        if (i24 != -1) {
                            long j3 = matroskaExtractor2.x;
                            if (j3 != -1) {
                                if (i24 == 475249515) {
                                    matroskaExtractor2.f17698z = j3;
                                    return true;
                                }
                            }
                        }
                        throw ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
                    }
                    if (i16 == 25152) {
                        matroskaExtractor2.e(i16);
                        MatroskaExtractor.Track track2 = matroskaExtractor2.f17696u;
                        if (track2.f17717h) {
                            TrackOutput.CryptoData cryptoData = track2.j;
                            if (cryptoData == null) {
                                throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                            }
                            track2.f17719l = new DrmInitData(new DrmInitData.SchemeData(C.f16997a, null, "video/webm", cryptoData.f17563b));
                            return true;
                        }
                    } else if (i16 == 28032) {
                        matroskaExtractor2.e(i16);
                        MatroskaExtractor.Track track3 = matroskaExtractor2.f17696u;
                        if (track3.f17717h && track3.f17718i != null) {
                            throw ParserException.a(null, "Combining encryption and compression is not supported");
                        }
                    } else {
                        if (i16 != 357149030) {
                            if (i16 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw ParserException.a(null, "No valid tracks were found");
                                }
                                matroskaExtractor2.f17688b0.endTracks();
                                return true;
                            }
                            if (i16 != 475249515) {
                                return true;
                            }
                            if (matroskaExtractor2.v) {
                                z5 = true;
                            } else {
                                ExtractorOutput extractorOutput = matroskaExtractor2.f17688b0;
                                LongArray longArray = matroskaExtractor2.C;
                                LongArray longArray2 = matroskaExtractor2.D;
                                if (matroskaExtractor2.q == -1 || matroskaExtractor2.t == -9223372036854775807L || longArray == null || (i15 = longArray.f18922a) == 0 || longArray2 == null || longArray2.f18922a != i15) {
                                    unseekable = new SeekMap.Unseekable(matroskaExtractor2.t);
                                } else {
                                    int[] iArrCopyOf = new int[i15];
                                    long[] jArrCopyOf = new long[i15];
                                    long[] jArrCopyOf2 = new long[i15];
                                    long[] jArrCopyOf3 = new long[i15];
                                    for (int i25 = 0; i25 < i15; i25++) {
                                        jArrCopyOf3[i25] = longArray.b(i25);
                                        jArrCopyOf[i25] = longArray2.b(i25) + matroskaExtractor2.q;
                                    }
                                    int i26 = 0;
                                    while (true) {
                                        int i27 = i15 - 1;
                                        if (i26 < i27) {
                                            int i28 = i26 + 1;
                                            iArrCopyOf[i26] = (int) (jArrCopyOf[i28] - jArrCopyOf[i26]);
                                            jArrCopyOf2[i26] = jArrCopyOf3[i28] - jArrCopyOf3[i26];
                                            i26 = i28;
                                        } else {
                                            iArrCopyOf[i27] = (int) ((matroskaExtractor2.q + matroskaExtractor2.f17695p) - jArrCopyOf[i27]);
                                            long j4 = matroskaExtractor2.t - jArrCopyOf3[i27];
                                            jArrCopyOf2[i27] = j4;
                                            if (j4 <= 0) {
                                                Log.g("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i27);
                                                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i27);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i27);
                                                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i27);
                                            }
                                            unseekable = new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                        }
                                    }
                                }
                                extractorOutput.g(unseekable);
                                z5 = true;
                                matroskaExtractor2.v = true;
                            }
                            matroskaExtractor2.C = null;
                            matroskaExtractor2.D = null;
                            return z5;
                        }
                        if (matroskaExtractor2.r == -9223372036854775807L) {
                            matroskaExtractor2.r = 1000000L;
                        }
                        long j5 = matroskaExtractor2.s;
                        if (j5 != -9223372036854775807L) {
                            matroskaExtractor2.t = matroskaExtractor2.j(j5);
                            return true;
                        }
                    }
                    return true;
                }
                MatroskaExtractor.Track track4 = matroskaExtractor2.f17696u;
                Assertions.e(track4);
                String str7 = track4.f17714b;
                if (str7 == null) {
                    throw ParserException.a(null, "CodecId is missing in TrackEntry element");
                }
                switch (str7.hashCode()) {
                    case -2095576542:
                        if (str7.equals("V_MPEG4/ISO/AP")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -2095575984:
                        if (str7.equals("V_MPEG4/ISO/SP")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1985379776:
                        if (str7.equals("A_MS/ACM")) {
                            b2 = c2;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1784763192:
                        if (str7.equals("A_TRUEHD")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1730367663:
                        if (str7.equals("A_VORBIS")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1482641358:
                        if (str7.equals("A_MPEG/L2")) {
                            b2 = 5;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1482641357:
                        if (str7.equals("A_MPEG/L3")) {
                            b2 = 6;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1373388978:
                        if (str7.equals("V_MS/VFW/FOURCC")) {
                            b2 = 7;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -933872740:
                        if (str7.equals("S_DVBSUB")) {
                            b2 = 8;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -538363189:
                        if (str7.equals("V_MPEG4/ISO/ASP")) {
                            b2 = 9;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -538363109:
                        if (str7.equals("V_MPEG4/ISO/AVC")) {
                            b2 = 10;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -425012669:
                        if (str7.equals("S_VOBSUB")) {
                            b2 = 11;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -356037306:
                        if (str7.equals("A_DTS/LOSSLESS")) {
                            b2 = 12;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 62923557:
                        if (str7.equals("A_AAC")) {
                            b2 = 13;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 62923603:
                        if (str7.equals("A_AC3")) {
                            b2 = 14;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 62927045:
                        if (str7.equals("A_DTS")) {
                            b2 = 15;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 82318131:
                        if (str7.equals("V_AV1")) {
                            b2 = 16;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 82338133:
                        if (str7.equals("V_VP8")) {
                            b2 = 17;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 82338134:
                        if (str7.equals("V_VP9")) {
                            b2 = 18;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 99146302:
                        if (str7.equals("S_HDMV/PGS")) {
                            b2 = 19;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 444813526:
                        if (str7.equals("V_THEORA")) {
                            b2 = 20;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 542569478:
                        if (str7.equals("A_DTS/EXPRESS")) {
                            b2 = 21;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 635596514:
                        if (str7.equals("A_PCM/FLOAT/IEEE")) {
                            b2 = 22;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 725948237:
                        if (str7.equals("A_PCM/INT/BIG")) {
                            b2 = 23;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 725957860:
                        if (str7.equals("A_PCM/INT/LIT")) {
                            b2 = 24;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 738597099:
                        if (str7.equals("S_TEXT/ASS")) {
                            b2 = 25;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 855502857:
                        if (str7.equals("V_MPEGH/ISO/HEVC")) {
                            b2 = 26;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1045209816:
                        if (str7.equals("S_TEXT/WEBVTT")) {
                            b2 = 27;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1422270023:
                        if (str7.equals("S_TEXT/UTF8")) {
                            b2 = 28;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1809237540:
                        if (str7.equals("V_MPEG2")) {
                            b2 = 29;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1950749482:
                        if (str7.equals("A_EAC3")) {
                            b2 = 30;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1950789798:
                        if (str7.equals("A_FLAC")) {
                            b2 = 31;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1951062397:
                        if (str7.equals(str6)) {
                            b2 = 32;
                        } else {
                            b2 = -1;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        ExtractorOutput extractorOutput2 = matroskaExtractor2.f17688b0;
                        int i29 = track4.f17715c;
                        String str8 = "video/x-unknown";
                        switch (str7.hashCode()) {
                            case -2095576542:
                                if (str7.equals("V_MPEG4/ISO/AP")) {
                                    b3 = 0;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -2095575984:
                                if (str7.equals("V_MPEG4/ISO/SP")) {
                                    b3 = 1;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1985379776:
                                if (str7.equals("A_MS/ACM")) {
                                    b3 = c2;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1784763192:
                                if (str7.equals("A_TRUEHD")) {
                                    b3 = 3;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1730367663:
                                if (str7.equals("A_VORBIS")) {
                                    b3 = 4;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1482641358:
                                if (str7.equals("A_MPEG/L2")) {
                                    b3 = 5;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1482641357:
                                if (str7.equals("A_MPEG/L3")) {
                                    b3 = 6;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1373388978:
                                if (str7.equals("V_MS/VFW/FOURCC")) {
                                    b3 = 7;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -933872740:
                                if (str7.equals("S_DVBSUB")) {
                                    b3 = 8;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -538363189:
                                if (str7.equals("V_MPEG4/ISO/ASP")) {
                                    b3 = 9;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -538363109:
                                if (str7.equals("V_MPEG4/ISO/AVC")) {
                                    b3 = 10;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -425012669:
                                if (str7.equals("S_VOBSUB")) {
                                    b3 = 11;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -356037306:
                                if (str7.equals("A_DTS/LOSSLESS")) {
                                    b3 = 12;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 62923557:
                                if (str7.equals("A_AAC")) {
                                    b3 = 13;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 62923603:
                                if (str7.equals("A_AC3")) {
                                    b3 = 14;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 62927045:
                                if (str7.equals("A_DTS")) {
                                    b3 = 15;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 82318131:
                                if (str7.equals("V_AV1")) {
                                    b3 = 16;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 82338133:
                                if (str7.equals("V_VP8")) {
                                    b3 = 17;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 82338134:
                                if (str7.equals("V_VP9")) {
                                    b3 = 18;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 99146302:
                                if (str7.equals("S_HDMV/PGS")) {
                                    b3 = 19;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 444813526:
                                if (str7.equals("V_THEORA")) {
                                    b3 = 20;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 542569478:
                                if (str7.equals("A_DTS/EXPRESS")) {
                                    b3 = 21;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 635596514:
                                if (str7.equals("A_PCM/FLOAT/IEEE")) {
                                    b3 = 22;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 725948237:
                                if (str7.equals("A_PCM/INT/BIG")) {
                                    b3 = 23;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 725957860:
                                if (str7.equals("A_PCM/INT/LIT")) {
                                    b3 = 24;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 738597099:
                                if (str7.equals("S_TEXT/ASS")) {
                                    b3 = 25;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 855502857:
                                if (str7.equals("V_MPEGH/ISO/HEVC")) {
                                    b3 = 26;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1045209816:
                                if (str7.equals("S_TEXT/WEBVTT")) {
                                    b3 = 27;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1422270023:
                                if (str7.equals("S_TEXT/UTF8")) {
                                    b3 = 28;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1809237540:
                                if (str7.equals("V_MPEG2")) {
                                    b3 = 29;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1950749482:
                                if (str7.equals("A_EAC3")) {
                                    b3 = 30;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1950789798:
                                if (str7.equals("A_FLAC")) {
                                    b3 = 31;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1951062397:
                                if (str7.equals(str6)) {
                                    b3 = 32;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                            case 1:
                            case 9:
                                byte[] bArr2 = track4.k;
                                str8 = "video/mp4v-es";
                                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null && (dolbyVisionConfigA = DolbyVisionConfig.a(new ParsableByteArray(track4.f17706N))) != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z6 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i30 = (z6 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9 || (i12 = track4.f17721p) == i9) {
                                        f = -1.0f;
                                    } else {
                                        f = (track4.f17720n * i10) / (track4.m * i12);
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f || track4.f17702E == -1.0f || track4.f17703F == -1.0f || track4.G == -1.0f || track4.H == -1.0f || track4.f17704I == -1.0f || track4.f17705J == -1.0f || track4.K == -1.0f || track4.L == -1.0f || track4.M == -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = new byte[25];
                                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder.put((byte) 0);
                                            byteBufferOrder.putShort((short) ((track4.D * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((track4.f17702E * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((track4.f17703F * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((track4.G * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((track4.H * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((track4.f17704I * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((track4.f17705J * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((track4.K * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) (track4.L + 0.5f));
                                            byteBufferOrder.putShort((short) (track4.M + 0.5f));
                                            byteBufferOrder.putShort((short) track4.f17701B);
                                            byteBufferOrder.putShort((short) track4.C);
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null && map.containsKey(str4)) {
                                        iIntValue = ((Integer) map.get(track4.f17713a)).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0 || Float.compare(track4.s, 0.0f) != 0 || Float.compare(track4.t, 0.0f) != 0) {
                                        i11 = iIntValue;
                                    } else if (Float.compare(track4.f17722u, 0.0f) == 0) {
                                        i11 = 0;
                                    } else if (Float.compare(track4.t, 90.0f) == 0) {
                                        i11 = 90;
                                    } else if (Float.compare(track4.t, -180.0f) == 0 || Float.compare(track4.t, 180.0f) == 0) {
                                        i11 = 180;
                                    } else if (Float.compare(track4.t, -90.0f) == 0) {
                                        i11 = 270;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8) && !"text/x-ssa".equals(str8) && !"text/vtt".equals(str8) && !"application/vobsub".equals(str8) && !"application/pgs".equals(str8) && !"application/dvbsubs".equals(str8)) {
                                        throw ParserException.a(null, "Unexpected MIME type.");
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null && !map.containsKey(str5)) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i30;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format = new Format(builder);
                                TrackOutput trackOutputTrack = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack;
                                trackOutputTrack.c(format);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 2:
                                ParsableByteArray parsableByteArray2 = new ParsableByteArray(track4.a(track4.f17714b));
                                try {
                                    int iN = parsableByteArray2.n();
                                    if (iN != 1) {
                                        if (iN == 65534) {
                                            parsableByteArray2.F(24);
                                            long jO = parsableByteArray2.o();
                                            UUID uuid = MatroskaExtractor.g0;
                                            if (jO != uuid.getMostSignificantBits() || parsableByteArray2.o() != uuid.getLeastSignificantBits()) {
                                            }
                                            str8 = "audio/x-unknown";
                                            listSingletonList = null;
                                            i5 = -1;
                                            list = listSingletonList;
                                            str3 = null;
                                            list4 = list;
                                            i6 = -1;
                                            list3 = list4;
                                            if (track4.f17706N != null) {
                                                str3 = dolbyVisionConfigA.f18992a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z7 = track4.f17711V;
                                            if (track4.f17710U) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i31 = (z7 ? 1 : 0) | i7;
                                            builder = new Format.Builder();
                                            zG = MimeTypes.g(str8);
                                            Map map2 = MatroskaExtractor.h0;
                                            if (zG) {
                                                builder.x = track4.O;
                                                builder.y = track4.f17708Q;
                                                builder.f17092z = i6;
                                                i8 = 1;
                                            } else if ("video".equals(MimeTypes.e(str8))) {
                                                if (track4.q == 0) {
                                                    i13 = track4.o;
                                                    i9 = -1;
                                                    if (i13 == -1) {
                                                        i13 = track4.m;
                                                    }
                                                    track4.o = i13;
                                                    i14 = track4.f17721p;
                                                    if (i14 == -1) {
                                                        i14 = track4.f17720n;
                                                    }
                                                    track4.f17721p = i14;
                                                } else {
                                                    i9 = -1;
                                                }
                                                i10 = track4.o;
                                                if (i10 != i9) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (track4.x) {
                                                    if (track4.D != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                                } else {
                                                    colorInfo = null;
                                                }
                                                str4 = track4.f17713a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (track4.r == 0) {
                                                    i11 = iIntValue;
                                                } else {
                                                    i11 = iIntValue;
                                                }
                                                builder.f17089p = track4.m;
                                                builder.q = track4.f17720n;
                                                builder.t = f;
                                                builder.s = i11;
                                                builder.f17090u = track4.v;
                                                builder.v = track4.f17723w;
                                                builder.f17091w = colorInfo;
                                                i8 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i8 = 3;
                                            }
                                            str5 = track4.f17713a;
                                            if (str5 != null) {
                                                builder.f17082b = track4.f17713a;
                                            }
                                            builder.f17081a = Integer.toString(i29);
                                            builder.k = str8;
                                            builder.f17087l = i5;
                                            builder.f17083c = track4.W;
                                            builder.d = i31;
                                            builder.m = list3;
                                            builder.f17085h = str3;
                                            builder.f17088n = track4.f17719l;
                                            Format format2 = new Format(builder);
                                            TrackOutput trackOutputTrack2 = extractorOutput2.track(track4.f17715c, i8);
                                            track4.X = trackOutputTrack2;
                                            trackOutputTrack2.c(format2);
                                            sparseArray.put(track4.f17715c, track4);
                                            matroskaExtractor = matroskaExtractor2;
                                        }
                                        Log.g("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                        str8 = "audio/x-unknown";
                                        listSingletonList = null;
                                        i5 = -1;
                                        list = listSingletonList;
                                        str3 = null;
                                        list4 = list;
                                        i6 = -1;
                                        list3 = list4;
                                        if (track4.f17706N != null) {
                                            str3 = dolbyVisionConfigA.f18992a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z8 = track4.f17711V;
                                        if (track4.f17710U) {
                                            i7 = 2;
                                        } else {
                                            i7 = 0;
                                        }
                                        int i32 = (z8 ? 1 : 0) | i7;
                                        builder = new Format.Builder();
                                        zG = MimeTypes.g(str8);
                                        Map map3 = MatroskaExtractor.h0;
                                        if (zG) {
                                            builder.x = track4.O;
                                            builder.y = track4.f17708Q;
                                            builder.f17092z = i6;
                                            i8 = 1;
                                        } else if ("video".equals(MimeTypes.e(str8))) {
                                            if (track4.q == 0) {
                                                i13 = track4.o;
                                                i9 = -1;
                                                if (i13 == -1) {
                                                    i13 = track4.m;
                                                }
                                                track4.o = i13;
                                                i14 = track4.f17721p;
                                                if (i14 == -1) {
                                                    i14 = track4.f17720n;
                                                }
                                                track4.f17721p = i14;
                                            } else {
                                                i9 = -1;
                                            }
                                            i10 = track4.o;
                                            if (i10 != i9) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (track4.x) {
                                                if (track4.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                            } else {
                                                colorInfo = null;
                                            }
                                            str4 = track4.f17713a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (track4.r == 0) {
                                                i11 = iIntValue;
                                            } else {
                                                i11 = iIntValue;
                                            }
                                            builder.f17089p = track4.m;
                                            builder.q = track4.f17720n;
                                            builder.t = f;
                                            builder.s = i11;
                                            builder.f17090u = track4.v;
                                            builder.v = track4.f17723w;
                                            builder.f17091w = colorInfo;
                                            i8 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i8 = 3;
                                        }
                                        str5 = track4.f17713a;
                                        if (str5 != null) {
                                            builder.f17082b = track4.f17713a;
                                        }
                                        builder.f17081a = Integer.toString(i29);
                                        builder.k = str8;
                                        builder.f17087l = i5;
                                        builder.f17083c = track4.W;
                                        builder.d = i32;
                                        builder.m = list3;
                                        builder.f17085h = str3;
                                        builder.f17088n = track4.f17719l;
                                        Format format3 = new Format(builder);
                                        TrackOutput trackOutputTrack3 = extractorOutput2.track(track4.f17715c, i8);
                                        track4.X = trackOutputTrack3;
                                        trackOutputTrack3.c(format3);
                                        sparseArray.put(track4.f17715c, track4);
                                        matroskaExtractor = matroskaExtractor2;
                                        break;
                                    }
                                    iS = Util.s(track4.f17707P);
                                    if (iS == 0) {
                                        Log.g("MatroskaExtractor", "Unsupported PCM bit depth: " + track4.f17707P + ". Setting mimeType to audio/x-unknown");
                                        str8 = "audio/x-unknown";
                                        listSingletonList = null;
                                        i5 = -1;
                                        list = listSingletonList;
                                        str3 = null;
                                        list4 = list;
                                        i6 = -1;
                                        list3 = list4;
                                        if (track4.f17706N != null) {
                                            str3 = dolbyVisionConfigA.f18992a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z9 = track4.f17711V;
                                        if (track4.f17710U) {
                                            i7 = 2;
                                        } else {
                                            i7 = 0;
                                        }
                                        int i33 = (z9 ? 1 : 0) | i7;
                                        builder = new Format.Builder();
                                        zG = MimeTypes.g(str8);
                                        Map map4 = MatroskaExtractor.h0;
                                        if (zG) {
                                            builder.x = track4.O;
                                            builder.y = track4.f17708Q;
                                            builder.f17092z = i6;
                                            i8 = 1;
                                        } else if ("video".equals(MimeTypes.e(str8))) {
                                            if (track4.q == 0) {
                                                i13 = track4.o;
                                                i9 = -1;
                                                if (i13 == -1) {
                                                    i13 = track4.m;
                                                }
                                                track4.o = i13;
                                                i14 = track4.f17721p;
                                                if (i14 == -1) {
                                                    i14 = track4.f17720n;
                                                }
                                                track4.f17721p = i14;
                                            } else {
                                                i9 = -1;
                                            }
                                            i10 = track4.o;
                                            if (i10 != i9) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (track4.x) {
                                                if (track4.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                            } else {
                                                colorInfo = null;
                                            }
                                            str4 = track4.f17713a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (track4.r == 0) {
                                                i11 = iIntValue;
                                            } else {
                                                i11 = iIntValue;
                                            }
                                            builder.f17089p = track4.m;
                                            builder.q = track4.f17720n;
                                            builder.t = f;
                                            builder.s = i11;
                                            builder.f17090u = track4.v;
                                            builder.v = track4.f17723w;
                                            builder.f17091w = colorInfo;
                                            i8 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i8 = 3;
                                        }
                                        str5 = track4.f17713a;
                                        if (str5 != null) {
                                            builder.f17082b = track4.f17713a;
                                        }
                                        builder.f17081a = Integer.toString(i29);
                                        builder.k = str8;
                                        builder.f17087l = i5;
                                        builder.f17083c = track4.W;
                                        builder.d = i33;
                                        builder.m = list3;
                                        builder.f17085h = str3;
                                        builder.f17088n = track4.f17719l;
                                        Format format4 = new Format(builder);
                                        TrackOutput trackOutputTrack4 = extractorOutput2.track(track4.f17715c, i8);
                                        track4.X = trackOutputTrack4;
                                        trackOutputTrack4.c(format4);
                                        sparseArray.put(track4.f17715c, track4);
                                        matroskaExtractor = matroskaExtractor2;
                                    }
                                    i6 = iS;
                                    str8 = "audio/raw";
                                    list3 = null;
                                    i5 = -1;
                                    str3 = null;
                                    if (track4.f17706N != null) {
                                        str3 = dolbyVisionConfigA.f18992a;
                                        str8 = "video/dolby-vision";
                                    }
                                    boolean z10 = track4.f17711V;
                                    if (track4.f17710U) {
                                        i7 = 2;
                                    } else {
                                        i7 = 0;
                                    }
                                    int i34 = (z10 ? 1 : 0) | i7;
                                    builder = new Format.Builder();
                                    zG = MimeTypes.g(str8);
                                    Map map5 = MatroskaExtractor.h0;
                                    if (zG) {
                                        builder.x = track4.O;
                                        builder.y = track4.f17708Q;
                                        builder.f17092z = i6;
                                        i8 = 1;
                                    } else if ("video".equals(MimeTypes.e(str8))) {
                                        if (track4.q == 0) {
                                            i13 = track4.o;
                                            i9 = -1;
                                            if (i13 == -1) {
                                                i13 = track4.m;
                                            }
                                            track4.o = i13;
                                            i14 = track4.f17721p;
                                            if (i14 == -1) {
                                                i14 = track4.f17720n;
                                            }
                                            track4.f17721p = i14;
                                        } else {
                                            i9 = -1;
                                        }
                                        i10 = track4.o;
                                        if (i10 != i9) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (track4.x) {
                                            if (track4.D != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                        } else {
                                            colorInfo = null;
                                        }
                                        str4 = track4.f17713a;
                                        if (str4 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (track4.r == 0) {
                                            i11 = iIntValue;
                                        } else {
                                            i11 = iIntValue;
                                        }
                                        builder.f17089p = track4.m;
                                        builder.q = track4.f17720n;
                                        builder.t = f;
                                        builder.s = i11;
                                        builder.f17090u = track4.v;
                                        builder.v = track4.f17723w;
                                        builder.f17091w = colorInfo;
                                        i8 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str8)) {
                                        }
                                        i8 = 3;
                                    }
                                    str5 = track4.f17713a;
                                    if (str5 != null) {
                                        builder.f17082b = track4.f17713a;
                                    }
                                    builder.f17081a = Integer.toString(i29);
                                    builder.k = str8;
                                    builder.f17087l = i5;
                                    builder.f17083c = track4.W;
                                    builder.d = i34;
                                    builder.m = list3;
                                    builder.f17085h = str3;
                                    builder.f17088n = track4.f17719l;
                                    Format format5 = new Format(builder);
                                    TrackOutput trackOutputTrack5 = extractorOutput2.track(track4.f17715c, i8);
                                    track4.X = trackOutputTrack5;
                                    trackOutputTrack5.c(format5);
                                    sparseArray.put(track4.f17715c, track4);
                                    matroskaExtractor = matroskaExtractor2;
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    throw ParserException.a(null, "Error parsing MS/ACM codec private");
                                }
                                break;
                            case 3:
                                track4.T = new TrueHdSampleRechunker();
                                str8 = "audio/true-hd";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z11 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i35 = (z11 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map6 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i35;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format6 = new Format(builder);
                                TrackOutput trackOutputTrack6 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack6;
                                trackOutputTrack6.c(format6);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 4:
                                byte[] bArrA = track4.a(str7);
                                try {
                                    r3 = c2;
                                    try {
                                        if (bArrA[0] != r3) {
                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                        }
                                        int i36 = 0;
                                        int i37 = 1;
                                        while (true) {
                                            int i38 = bArrA[i37] & 255;
                                            if (i38 != 255) {
                                                int i39 = i37 + 1;
                                                int i40 = i36 + i38;
                                                int i41 = 0;
                                                while (true) {
                                                    int i42 = bArrA[i39] & 255;
                                                    if (i42 != 255) {
                                                        int i43 = i39 + 1;
                                                        int i44 = i41 + i42;
                                                        if (bArrA[i43] != 1) {
                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                        }
                                                        byte[] bArr3 = new byte[i40];
                                                        System.arraycopy(bArrA, i43, bArr3, 0, i40);
                                                        int i45 = i43 + i40;
                                                        if (bArrA[i45] != 3) {
                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                        }
                                                        int i46 = i45 + i44;
                                                        if (bArrA[i46] != 5) {
                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                        }
                                                        byte[] bArr4 = new byte[bArrA.length - i46];
                                                        System.arraycopy(bArrA, i46, bArr4, 0, bArrA.length - i46);
                                                        ArrayList arrayList = new ArrayList(2);
                                                        arrayList.add(bArr3);
                                                        arrayList.add(bArr4);
                                                        str8 = "audio/vorbis";
                                                        i5 = Segment.SIZE;
                                                        list = arrayList;
                                                        str3 = null;
                                                        list4 = list;
                                                        i6 = -1;
                                                        list3 = list4;
                                                        if (track4.f17706N != null) {
                                                            str3 = dolbyVisionConfigA.f18992a;
                                                            str8 = "video/dolby-vision";
                                                        }
                                                        boolean z12 = track4.f17711V;
                                                        if (track4.f17710U) {
                                                            i7 = 2;
                                                        } else {
                                                            i7 = 0;
                                                        }
                                                        int i310 = (z12 ? 1 : 0) | i7;
                                                        builder = new Format.Builder();
                                                        zG = MimeTypes.g(str8);
                                                        Map map7 = MatroskaExtractor.h0;
                                                        if (zG) {
                                                            builder.x = track4.O;
                                                            builder.y = track4.f17708Q;
                                                            builder.f17092z = i6;
                                                            i8 = 1;
                                                        } else if ("video".equals(MimeTypes.e(str8))) {
                                                            if (track4.q == 0) {
                                                                i13 = track4.o;
                                                                i9 = -1;
                                                                if (i13 == -1) {
                                                                    i13 = track4.m;
                                                                }
                                                                track4.o = i13;
                                                                i14 = track4.f17721p;
                                                                if (i14 == -1) {
                                                                    i14 = track4.f17720n;
                                                                }
                                                                track4.f17721p = i14;
                                                            } else {
                                                                i9 = -1;
                                                            }
                                                            i10 = track4.o;
                                                            if (i10 != i9) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (track4.x) {
                                                                if (track4.D != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                                            } else {
                                                                colorInfo = null;
                                                            }
                                                            str4 = track4.f17713a;
                                                            if (str4 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (track4.r == 0) {
                                                                i11 = iIntValue;
                                                            } else {
                                                                i11 = iIntValue;
                                                            }
                                                            builder.f17089p = track4.m;
                                                            builder.q = track4.f17720n;
                                                            builder.t = f;
                                                            builder.s = i11;
                                                            builder.f17090u = track4.v;
                                                            builder.v = track4.f17723w;
                                                            builder.f17091w = colorInfo;
                                                            i8 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str8)) {
                                                            }
                                                            i8 = 3;
                                                        }
                                                        str5 = track4.f17713a;
                                                        if (str5 != null) {
                                                            builder.f17082b = track4.f17713a;
                                                        }
                                                        builder.f17081a = Integer.toString(i29);
                                                        builder.k = str8;
                                                        builder.f17087l = i5;
                                                        builder.f17083c = track4.W;
                                                        builder.d = i310;
                                                        builder.m = list3;
                                                        builder.f17085h = str3;
                                                        builder.f17088n = track4.f17719l;
                                                        Format format7 = new Format(builder);
                                                        TrackOutput trackOutputTrack7 = extractorOutput2.track(track4.f17715c, i8);
                                                        track4.X = trackOutputTrack7;
                                                        trackOutputTrack7.c(format7);
                                                        sparseArray.put(track4.f17715c, track4);
                                                        matroskaExtractor = matroskaExtractor2;
                                                    } else {
                                                        i41 += 255;
                                                        i39++;
                                                    }
                                                }
                                            } else {
                                                i36 += 255;
                                                i37++;
                                            }
                                            break;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused2) {
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                    r3 = 0;
                                }
                                throw ParserException.a(r3, "Error parsing vorbis codec private");
                            case 5:
                                str8 = "audio/mpeg-L2";
                                list = null;
                                i5 = 4096;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z13 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i311 = (z13 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map8 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i311;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format8 = new Format(builder);
                                TrackOutput trackOutputTrack8 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack8;
                                trackOutputTrack8.c(format8);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 6:
                                str8 = "audio/mpeg";
                                list = null;
                                i5 = 4096;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z14 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i312 = (z14 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map9 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i312;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format9 = new Format(builder);
                                TrackOutput trackOutputTrack9 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack9;
                                trackOutputTrack9.c(format9);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 7:
                                ParsableByteArray parsableByteArray3 = new ParsableByteArray(track4.a(track4.f17714b));
                                try {
                                    parsableByteArray3.G(16);
                                    long jL = parsableByteArray3.l();
                                    try {
                                        if (jL == 1482049860) {
                                            pair = new Pair("video/divx", null);
                                        } else if (jL != 859189832) {
                                            if (jL == 826496599) {
                                                int i47 = parsableByteArray3.f18957b + 20;
                                                byte[] bArr5 = parsableByteArray3.f18956a;
                                                while (true) {
                                                    if (i47 >= bArr5.length - 4) {
                                                        throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");
                                                    }
                                                    if (bArr5[i47] == 0) {
                                                        if (bArr5[i47 + 1] == 0 && bArr5[i47 + 2] == 1) {
                                                            if (bArr5[i47 + 3] == 15) {
                                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr5, i47, bArr5.length)));
                                                            }
                                                        }
                                                        i47++;
                                                    }
                                                    i47++;
                                                }
                                            } else {
                                                Log.g("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                str3 = null;
                                                pair = new Pair("video/x-unknown", null);
                                            }
                                            str8 = (String) pair.first;
                                            list2 = (List) pair.second;
                                            i5 = -1;
                                            list4 = list2;
                                            i6 = -1;
                                            list3 = list4;
                                            if (track4.f17706N != null) {
                                                str3 = dolbyVisionConfigA.f18992a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z15 = track4.f17711V;
                                            if (track4.f17710U) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i313 = (z15 ? 1 : 0) | i7;
                                            builder = new Format.Builder();
                                            zG = MimeTypes.g(str8);
                                            Map map10 = MatroskaExtractor.h0;
                                            if (zG) {
                                                builder.x = track4.O;
                                                builder.y = track4.f17708Q;
                                                builder.f17092z = i6;
                                                i8 = 1;
                                            } else if ("video".equals(MimeTypes.e(str8))) {
                                                if (track4.q == 0) {
                                                    i13 = track4.o;
                                                    i9 = -1;
                                                    if (i13 == -1) {
                                                        i13 = track4.m;
                                                    }
                                                    track4.o = i13;
                                                    i14 = track4.f17721p;
                                                    if (i14 == -1) {
                                                        i14 = track4.f17720n;
                                                    }
                                                    track4.f17721p = i14;
                                                } else {
                                                    i9 = -1;
                                                }
                                                i10 = track4.o;
                                                if (i10 != i9) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (track4.x) {
                                                    if (track4.D != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                                } else {
                                                    colorInfo = null;
                                                }
                                                str4 = track4.f17713a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (track4.r == 0) {
                                                    i11 = iIntValue;
                                                } else {
                                                    i11 = iIntValue;
                                                }
                                                builder.f17089p = track4.m;
                                                builder.q = track4.f17720n;
                                                builder.t = f;
                                                builder.s = i11;
                                                builder.f17090u = track4.v;
                                                builder.v = track4.f17723w;
                                                builder.f17091w = colorInfo;
                                                i8 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i8 = 3;
                                            }
                                            str5 = track4.f17713a;
                                            if (str5 != null) {
                                                builder.f17082b = track4.f17713a;
                                            }
                                            builder.f17081a = Integer.toString(i29);
                                            builder.k = str8;
                                            builder.f17087l = i5;
                                            builder.f17083c = track4.W;
                                            builder.d = i313;
                                            builder.m = list3;
                                            builder.f17085h = str3;
                                            builder.f17088n = track4.f17719l;
                                            Format format10 = new Format(builder);
                                            TrackOutput trackOutputTrack10 = extractorOutput2.track(track4.f17715c, i8);
                                            track4.X = trackOutputTrack10;
                                            trackOutputTrack10.c(format10);
                                            sparseArray.put(track4.f17715c, track4);
                                            matroskaExtractor = matroskaExtractor2;
                                        } else {
                                            pair = new Pair("video/3gpp", null);
                                        }
                                        str3 = null;
                                        str8 = (String) pair.first;
                                        list2 = (List) pair.second;
                                        i5 = -1;
                                        list4 = list2;
                                        i6 = -1;
                                        list3 = list4;
                                        if (track4.f17706N != null) {
                                            str3 = dolbyVisionConfigA.f18992a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z16 = track4.f17711V;
                                        if (track4.f17710U) {
                                            i7 = 2;
                                        } else {
                                            i7 = 0;
                                        }
                                        int i314 = (z16 ? 1 : 0) | i7;
                                        builder = new Format.Builder();
                                        zG = MimeTypes.g(str8);
                                        Map map11 = MatroskaExtractor.h0;
                                        if (zG) {
                                            builder.x = track4.O;
                                            builder.y = track4.f17708Q;
                                            builder.f17092z = i6;
                                            i8 = 1;
                                        } else if ("video".equals(MimeTypes.e(str8))) {
                                            if (track4.q == 0) {
                                                i13 = track4.o;
                                                i9 = -1;
                                                if (i13 == -1) {
                                                    i13 = track4.m;
                                                }
                                                track4.o = i13;
                                                i14 = track4.f17721p;
                                                if (i14 == -1) {
                                                    i14 = track4.f17720n;
                                                }
                                                track4.f17721p = i14;
                                            } else {
                                                i9 = -1;
                                            }
                                            i10 = track4.o;
                                            if (i10 != i9) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (track4.x) {
                                                if (track4.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                            } else {
                                                colorInfo = null;
                                            }
                                            str4 = track4.f17713a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (track4.r == 0) {
                                                i11 = iIntValue;
                                            } else {
                                                i11 = iIntValue;
                                            }
                                            builder.f17089p = track4.m;
                                            builder.q = track4.f17720n;
                                            builder.t = f;
                                            builder.s = i11;
                                            builder.f17090u = track4.v;
                                            builder.v = track4.f17723w;
                                            builder.f17091w = colorInfo;
                                            i8 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i8 = 3;
                                        }
                                        str5 = track4.f17713a;
                                        if (str5 != null) {
                                            builder.f17082b = track4.f17713a;
                                        }
                                        builder.f17081a = Integer.toString(i29);
                                        builder.k = str8;
                                        builder.f17087l = i5;
                                        builder.f17083c = track4.W;
                                        builder.d = i314;
                                        builder.m = list3;
                                        builder.f17085h = str3;
                                        builder.f17088n = track4.f17719l;
                                        Format format11 = new Format(builder);
                                        TrackOutput trackOutputTrack11 = extractorOutput2.track(track4.f17715c, i8);
                                        track4.X = trackOutputTrack11;
                                        trackOutputTrack11.c(format11);
                                        sparseArray.put(track4.f17715c, track4);
                                        matroskaExtractor = matroskaExtractor2;
                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                        throw ParserException.a(r4, "Error parsing FourCC private data");
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused5) {
                                    r4 = 0;
                                }
                                break;
                            case 8:
                                byte[] bArr6 = new byte[4];
                                System.arraycopy(track4.a(str7), 0, bArr6, 0, 4);
                                ImmutableList immutableListZ = ImmutableList.z(bArr6);
                                str8 = "application/dvbsubs";
                                listSingletonList = immutableListZ;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z17 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i315 = (z17 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map12 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i315;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format12 = new Format(builder);
                                TrackOutput trackOutputTrack12 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack12;
                                trackOutputTrack12.c(format12);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 10:
                                AvcConfig avcConfigA = AvcConfig.a(new ParsableByteArray(track4.a(track4.f17714b)));
                                track4.f17712Y = avcConfigA.f18988b;
                                ArrayList arrayList2 = avcConfigA.f18987a;
                                str3 = avcConfigA.f;
                                list2 = arrayList2;
                                str8 = "video/avc";
                                i5 = -1;
                                list4 = list2;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z18 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i316 = (z18 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map13 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i316;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format13 = new Format(builder);
                                TrackOutput trackOutputTrack13 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack13;
                                trackOutputTrack13.c(format13);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 11:
                                str8 = "application/vobsub";
                                listSingletonList = ImmutableList.z(track4.a(str7));
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z19 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i317 = (z19 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map14 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i317;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format14 = new Format(builder);
                                TrackOutput trackOutputTrack14 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack14;
                                trackOutputTrack14.c(format14);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 12:
                                str8 = "audio/vnd.dts.hd";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z110 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i318 = (z110 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map15 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i318;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format15 = new Format(builder);
                                TrackOutput trackOutputTrack15 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack15;
                                trackOutputTrack15.c(format15);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 13:
                                List listSingletonList2 = Collections.singletonList(track4.a(str7));
                                byte[] bArr7 = track4.k;
                                AacUtil.Config configB = AacUtil.b(new ParsableBitArray(bArr7, bArr7.length), false);
                                track4.f17708Q = configB.f17268a;
                                track4.O = configB.f17269b;
                                str8 = "audio/mp4a-latm";
                                str3 = configB.f17270c;
                                list2 = listSingletonList2;
                                i5 = -1;
                                list4 = list2;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z111 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i319 = (z111 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map16 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i319;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format16 = new Format(builder);
                                TrackOutput trackOutputTrack16 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack16;
                                trackOutputTrack16.c(format16);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 14:
                                str8 = "audio/ac3";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z112 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3110 = (z112 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map17 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i3110;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format17 = new Format(builder);
                                TrackOutput trackOutputTrack17 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack17;
                                trackOutputTrack17.c(format17);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 15:
                            case 21:
                                str8 = "audio/vnd.dts";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z113 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3111 = (z113 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map18 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i3111;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format18 = new Format(builder);
                                TrackOutput trackOutputTrack18 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack18;
                                trackOutputTrack18.c(format18);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 16:
                                str8 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z114 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3112 = (z114 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map19 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i3112;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format19 = new Format(builder);
                                TrackOutput trackOutputTrack19 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack19;
                                trackOutputTrack19.c(format19);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 17:
                                str8 = "video/x-vnd.on2.vp8";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z115 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3113 = (z115 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map110 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i3113;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format110 = new Format(builder);
                                TrackOutput trackOutputTrack110 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack110;
                                trackOutputTrack110.c(format110);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 18:
                                str8 = "video/x-vnd.on2.vp9";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z116 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3114 = (z116 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map111 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i3114;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format111 = new Format(builder);
                                TrackOutput trackOutputTrack111 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack111;
                                trackOutputTrack111.c(format111);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 19:
                                str8 = "application/pgs";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z117 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3115 = (z117 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map112 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i3115;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format112 = new Format(builder);
                                TrackOutput trackOutputTrack112 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack112;
                                trackOutputTrack112.c(format112);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 20:
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z118 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3116 = (z118 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map113 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i3116;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format113 = new Format(builder);
                                TrackOutput trackOutputTrack113 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack113;
                                trackOutputTrack113.c(format113);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 22:
                                if (track4.f17707P == 32) {
                                    str8 = "audio/raw";
                                    list3 = null;
                                    i5 = -1;
                                    str3 = null;
                                    i6 = 4;
                                } else {
                                    Log.g("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + track4.f17707P + ". Setting mimeType to audio/x-unknown");
                                    str8 = "audio/x-unknown";
                                    listSingletonList = null;
                                    i5 = -1;
                                    list = listSingletonList;
                                    str3 = null;
                                    list4 = list;
                                    i6 = -1;
                                    list3 = list4;
                                }
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z119 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3117 = (z119 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map114 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i3117;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format114 = new Format(builder);
                                TrackOutput trackOutputTrack114 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack114;
                                trackOutputTrack114.c(format114);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 23:
                                int i48 = track4.f17707P;
                                if (i48 == 8) {
                                    str8 = "audio/raw";
                                    list3 = null;
                                    i5 = -1;
                                    str3 = null;
                                    i6 = 3;
                                } else if (i48 == 16) {
                                    i6 = 268435456;
                                    str8 = "audio/raw";
                                    list3 = null;
                                    i5 = -1;
                                    str3 = null;
                                } else {
                                    Log.g("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + track4.f17707P + ". Setting mimeType to audio/x-unknown");
                                    str8 = "audio/x-unknown";
                                    listSingletonList = null;
                                    i5 = -1;
                                    list = listSingletonList;
                                    str3 = null;
                                    list4 = list;
                                    i6 = -1;
                                    list3 = list4;
                                }
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z1110 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3118 = (z1110 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map115 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i3118;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format115 = new Format(builder);
                                TrackOutput trackOutputTrack115 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack115;
                                trackOutputTrack115.c(format115);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 24:
                                iS = Util.s(track4.f17707P);
                                if (iS == 0) {
                                    Log.g("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + track4.f17707P + ". Setting mimeType to audio/x-unknown");
                                    str8 = "audio/x-unknown";
                                    listSingletonList = null;
                                    i5 = -1;
                                    list = listSingletonList;
                                    str3 = null;
                                    list4 = list;
                                    i6 = -1;
                                    list3 = list4;
                                    if (track4.f17706N != null) {
                                        str3 = dolbyVisionConfigA.f18992a;
                                        str8 = "video/dolby-vision";
                                    }
                                    boolean z1111 = track4.f17711V;
                                    if (track4.f17710U) {
                                        i7 = 2;
                                    } else {
                                        i7 = 0;
                                    }
                                    int i3119 = (z1111 ? 1 : 0) | i7;
                                    builder = new Format.Builder();
                                    zG = MimeTypes.g(str8);
                                    Map map116 = MatroskaExtractor.h0;
                                    if (zG) {
                                        builder.x = track4.O;
                                        builder.y = track4.f17708Q;
                                        builder.f17092z = i6;
                                        i8 = 1;
                                    } else if ("video".equals(MimeTypes.e(str8))) {
                                        if (track4.q == 0) {
                                            i13 = track4.o;
                                            i9 = -1;
                                            if (i13 == -1) {
                                                i13 = track4.m;
                                            }
                                            track4.o = i13;
                                            i14 = track4.f17721p;
                                            if (i14 == -1) {
                                                i14 = track4.f17720n;
                                            }
                                            track4.f17721p = i14;
                                        } else {
                                            i9 = -1;
                                        }
                                        i10 = track4.o;
                                        if (i10 != i9) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (track4.x) {
                                            if (track4.D != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                        } else {
                                            colorInfo = null;
                                        }
                                        str4 = track4.f17713a;
                                        if (str4 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (track4.r == 0) {
                                            i11 = iIntValue;
                                        } else {
                                            i11 = iIntValue;
                                        }
                                        builder.f17089p = track4.m;
                                        builder.q = track4.f17720n;
                                        builder.t = f;
                                        builder.s = i11;
                                        builder.f17090u = track4.v;
                                        builder.v = track4.f17723w;
                                        builder.f17091w = colorInfo;
                                        i8 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str8)) {
                                        }
                                        i8 = 3;
                                    }
                                    str5 = track4.f17713a;
                                    if (str5 != null) {
                                        builder.f17082b = track4.f17713a;
                                    }
                                    builder.f17081a = Integer.toString(i29);
                                    builder.k = str8;
                                    builder.f17087l = i5;
                                    builder.f17083c = track4.W;
                                    builder.d = i3119;
                                    builder.m = list3;
                                    builder.f17085h = str3;
                                    builder.f17088n = track4.f17719l;
                                    Format format116 = new Format(builder);
                                    TrackOutput trackOutputTrack116 = extractorOutput2.track(track4.f17715c, i8);
                                    track4.X = trackOutputTrack116;
                                    trackOutputTrack116.c(format116);
                                    sparseArray.put(track4.f17715c, track4);
                                    matroskaExtractor = matroskaExtractor2;
                                }
                                i6 = iS;
                                str8 = "audio/raw";
                                list3 = null;
                                i5 = -1;
                                str3 = null;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z1112 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31110 = (z1112 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map117 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i31110;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format117 = new Format(builder);
                                TrackOutput trackOutputTrack117 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack117;
                                trackOutputTrack117.c(format117);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 25:
                                str8 = "text/x-ssa";
                                listSingletonList = ImmutableList.A(MatroskaExtractor.f17672d0, track4.a(str7));
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z1113 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31111 = (z1113 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map118 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i31111;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format118 = new Format(builder);
                                TrackOutput trackOutputTrack118 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack118;
                                trackOutputTrack118.c(format118);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 26:
                                HevcConfig hevcConfigA = HevcConfig.a(new ParsableByteArray(track4.a(track4.f17714b)));
                                track4.f17712Y = hevcConfigA.f19003b;
                                str8 = "video/hevc";
                                List list5 = hevcConfigA.f19002a;
                                str3 = hevcConfigA.g;
                                list2 = list5;
                                i5 = -1;
                                list4 = list2;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z1114 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31112 = (z1114 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map119 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i31112;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format119 = new Format(builder);
                                TrackOutput trackOutputTrack119 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack119;
                                trackOutputTrack119.c(format119);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 27:
                                str8 = "text/vtt";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z1115 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31113 = (z1115 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map1110 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i31113;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format1110 = new Format(builder);
                                TrackOutput trackOutputTrack1110 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack1110;
                                trackOutputTrack1110.c(format1110);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 28:
                                str8 = "application/x-subrip";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z1116 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31114 = (z1116 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map1111 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i31114;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format1111 = new Format(builder);
                                TrackOutput trackOutputTrack1111 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack1111;
                                trackOutputTrack1111.c(format1111);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 29:
                                str8 = "video/mpeg2";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z1117 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31115 = (z1117 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map1112 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i31115;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format1112 = new Format(builder);
                                TrackOutput trackOutputTrack1112 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack1112;
                                trackOutputTrack1112.c(format1112);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 30:
                                str8 = "audio/eac3";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z1118 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31116 = (z1118 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map1113 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i31116;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format1113 = new Format(builder);
                                TrackOutput trackOutputTrack1113 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack1113;
                                trackOutputTrack1113.c(format1113);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 31:
                                str8 = "audio/flac";
                                listSingletonList = Collections.singletonList(track4.a(str7));
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z1119 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31117 = (z1119 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map1114 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i31117;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format1114 = new Format(builder);
                                TrackOutput trackOutputTrack1114 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack1114;
                                trackOutputTrack1114.c(format1114);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 32:
                                ArrayList arrayList3 = new ArrayList(3);
                                arrayList3.add(track4.a(track4.f17714b));
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(track4.f17709R).array());
                                arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(track4.S).array());
                                str8 = "audio/opus";
                                i5 = 5760;
                                list = arrayList3;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (track4.f17706N != null) {
                                    str3 = dolbyVisionConfigA.f18992a;
                                    str8 = "video/dolby-vision";
                                }
                                boolean z11110 = track4.f17711V;
                                if (track4.f17710U) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31118 = (z11110 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zG = MimeTypes.g(str8);
                                Map map1115 = MatroskaExtractor.h0;
                                if (zG) {
                                    builder.x = track4.O;
                                    builder.y = track4.f17708Q;
                                    builder.f17092z = i6;
                                    i8 = 1;
                                } else if ("video".equals(MimeTypes.e(str8))) {
                                    if (track4.q == 0) {
                                        i13 = track4.o;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = track4.m;
                                        }
                                        track4.o = i13;
                                        i14 = track4.f17721p;
                                        if (i14 == -1) {
                                            i14 = track4.f17720n;
                                        }
                                        track4.f17721p = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = track4.o;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (track4.x) {
                                        if (track4.D != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        colorInfo = new ColorInfo(track4.y, track4.f17700A, track4.f17724z, bArr);
                                    } else {
                                        colorInfo = null;
                                    }
                                    str4 = track4.f17713a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (track4.r == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.f17089p = track4.m;
                                    builder.q = track4.f17720n;
                                    builder.t = f;
                                    builder.s = i11;
                                    builder.f17090u = track4.v;
                                    builder.v = track4.f17723w;
                                    builder.f17091w = colorInfo;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str8)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = track4.f17713a;
                                if (str5 != null) {
                                    builder.f17082b = track4.f17713a;
                                }
                                builder.f17081a = Integer.toString(i29);
                                builder.k = str8;
                                builder.f17087l = i5;
                                builder.f17083c = track4.W;
                                builder.d = i31118;
                                builder.m = list3;
                                builder.f17085h = str3;
                                builder.f17088n = track4.f17719l;
                                Format format1115 = new Format(builder);
                                TrackOutput trackOutputTrack1115 = extractorOutput2.track(track4.f17715c, i8);
                                track4.X = trackOutputTrack1115;
                                trackOutputTrack1115.c(format1115);
                                sparseArray.put(track4.f17715c, track4);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            default:
                                throw ParserException.a(null, "Unrecognized codec identifier.");
                        }
                        break;
                    default:
                        matroskaExtractor = matroskaExtractor2;
                        break;
                }
                matroskaExtractor.f17696u = null;
                return true;
            }
            boolean z20 = false;
            ?? r14 = 0;
            defaultEbmlReader = this;
            int i49 = defaultEbmlReader.f17668e;
            VarintReader varintReader = defaultEbmlReader.f17667c;
            if (i49 == 0) {
                int i50 = 4;
                long jC = varintReader.c(defaultExtractorInput, true, false, 4);
                if (jC == -2) {
                    defaultExtractorInput.f = 0;
                    while (true) {
                        byte[] bArr8 = defaultEbmlReader.f17665a;
                        defaultExtractorInput.peekFully(bArr8, r14, i50, r14);
                        iB = VarintReader.b(bArr8[r14]);
                        if (iB == -1 || iB > i50) {
                            str = str6;
                        } else {
                            str = str6;
                            iA = (int) VarintReader.a(bArr8, iB, r14);
                            MatroskaExtractor.this.getClass();
                            if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                            }
                        }
                        defaultExtractorInput.skipFully(1);
                        str6 = str;
                        r14 = 0;
                        i50 = 4;
                    }
                    defaultExtractorInput.skipFully(iB);
                    j = iA;
                } else {
                    str = str6;
                    j = jC;
                }
                z2 = true;
                if (j == -1) {
                    return false;
                }
                z20 = false;
                defaultEbmlReader.f = (int) j;
                defaultEbmlReader.f17668e = 1;
            } else {
                str = str6;
                z2 = true;
            }
            if (defaultEbmlReader.f17668e == z2) {
                defaultEbmlReader.g = varintReader.c(defaultExtractorInput, z20, z2, 8);
                defaultEbmlReader.f17668e = 2;
            }
            EbmlProcessor ebmlProcessor2 = defaultEbmlReader.d;
            int i51 = defaultEbmlReader.f;
            MatroskaExtractor.this.getClass();
            switch (i51) {
                case 131:
                case PRIVACY_URL_ERROR_VALUE:
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i2 = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i2 = 3;
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i2 = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i2 = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i2 = 5;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    long j6 = defaultExtractorInput.d;
                    arrayDeque.push(new MasterElement(defaultEbmlReader.f, defaultEbmlReader.g + j6));
                    EbmlProcessor ebmlProcessor3 = defaultEbmlReader.d;
                    int i52 = defaultEbmlReader.f;
                    long j7 = defaultEbmlReader.g;
                    MatroskaExtractor matroskaExtractor3 = MatroskaExtractor.this;
                    Assertions.e(matroskaExtractor3.f17688b0);
                    if (i52 != 160) {
                        if (i52 != 174) {
                            if (i52 != 187) {
                                if (i52 != 19899) {
                                    if (i52 == 20533) {
                                        z4 = true;
                                        matroskaExtractor3.e(i52);
                                        matroskaExtractor3.f17696u.f17717h = true;
                                    } else if (i52 == 21968) {
                                        matroskaExtractor3.e(i52);
                                        z4 = true;
                                        matroskaExtractor3.f17696u.x = true;
                                    } else if (i52 == 408125543) {
                                        long j8 = matroskaExtractor3.q;
                                        if (j8 != -1 && j8 != j6) {
                                            throw ParserException.a(null, "Multiple Segment elements not supported");
                                        }
                                        matroskaExtractor3.q = j6;
                                        matroskaExtractor3.f17695p = j7;
                                    } else if (i52 == 475249515) {
                                        matroskaExtractor3.C = new LongArray();
                                        matroskaExtractor3.D = new LongArray();
                                    } else if (i52 == 524531317 && !matroskaExtractor3.v) {
                                        if (!matroskaExtractor3.d || matroskaExtractor3.f17698z == -1) {
                                            z4 = true;
                                            matroskaExtractor3.f17688b0.g(new SeekMap.Unseekable(matroskaExtractor3.t));
                                            matroskaExtractor3.v = true;
                                        } else {
                                            z4 = true;
                                            matroskaExtractor3.y = true;
                                        }
                                    }
                                    z3 = z4;
                                } else {
                                    matroskaExtractor3.f17697w = -1;
                                    matroskaExtractor3.x = -1L;
                                }
                                i3 = 0;
                            } else {
                                matroskaExtractor3.f17675E = false;
                                i3 = 0;
                            }
                            z3 = true;
                        } else {
                            MatroskaExtractor.Track track5 = new MatroskaExtractor.Track();
                            track5.m = -1;
                            track5.f17720n = -1;
                            track5.o = -1;
                            track5.f17721p = -1;
                            track5.q = 0;
                            track5.r = -1;
                            track5.s = 0.0f;
                            track5.t = 0.0f;
                            track5.f17722u = 0.0f;
                            track5.v = null;
                            track5.f17723w = -1;
                            track5.x = false;
                            track5.y = -1;
                            track5.f17724z = -1;
                            track5.f17700A = -1;
                            track5.f17701B = 1000;
                            track5.C = 200;
                            track5.D = -1.0f;
                            track5.f17702E = -1.0f;
                            track5.f17703F = -1.0f;
                            track5.G = -1.0f;
                            track5.H = -1.0f;
                            track5.f17704I = -1.0f;
                            track5.f17705J = -1.0f;
                            track5.K = -1.0f;
                            track5.L = -1.0f;
                            track5.M = -1.0f;
                            z3 = true;
                            track5.O = 1;
                            track5.f17707P = -1;
                            track5.f17708Q = 8000;
                            track5.f17709R = 0L;
                            track5.S = 0L;
                            track5.f17711V = true;
                            track5.W = "eng";
                            matroskaExtractor3.f17696u = track5;
                        }
                        i3 = 0;
                    } else {
                        i3 = 0;
                        z3 = true;
                        matroskaExtractor3.f17681Q = false;
                        matroskaExtractor3.f17682R = 0L;
                    }
                    defaultEbmlReader.f17668e = i3;
                    return z3;
                }
                if (i2 == 2) {
                    long j9 = defaultEbmlReader.g;
                    if (j9 <= 8) {
                        ((MatroskaExtractor.InnerEbmlProcessor) defaultEbmlReader.d).b(defaultEbmlReader.f, defaultEbmlReader.b(defaultExtractorInput, (int) j9));
                        defaultEbmlReader.f17668e = 0;
                        return true;
                    }
                    throw ParserException.a(null, "Invalid integer size: " + defaultEbmlReader.g);
                }
                if (i2 == 3) {
                    long j10 = defaultEbmlReader.g;
                    if (j10 > 2147483647L) {
                        throw ParserException.a(null, "String element size: " + defaultEbmlReader.g);
                    }
                    EbmlProcessor ebmlProcessor4 = defaultEbmlReader.d;
                    int i53 = defaultEbmlReader.f;
                    int i54 = (int) j10;
                    if (i54 == 0) {
                        str2 = "";
                    } else {
                        byte[] bArr9 = new byte[i54];
                        defaultExtractorInput.readFully(bArr9, 0, i54, false);
                        while (i54 > 0 && bArr9[i54 - 1] == 0) {
                            i54--;
                        }
                        str2 = new String(bArr9, 0, i54);
                    }
                    MatroskaExtractor matroskaExtractor4 = MatroskaExtractor.this;
                    matroskaExtractor4.getClass();
                    if (i53 == 134) {
                        matroskaExtractor4.e(i53);
                        matroskaExtractor4.f17696u.f17714b = str2;
                    } else if (i53 != 17026) {
                        if (i53 == 21358) {
                            matroskaExtractor4.e(i53);
                            matroskaExtractor4.f17696u.f17713a = str2;
                        } else if (i53 == 2274716) {
                            matroskaExtractor4.e(i53);
                            matroskaExtractor4.f17696u.W = str2;
                        }
                    } else if (!"webm".equals(str2) && !"matroska".equals(str2)) {
                        throw ParserException.a(null, "DocType " + str2 + " not supported");
                    }
                    defaultEbmlReader.f17668e = 0;
                    return true;
                }
                if (i2 == 4) {
                    ((MatroskaExtractor.InnerEbmlProcessor) defaultEbmlReader.d).a(defaultEbmlReader.f, (int) defaultEbmlReader.g, defaultExtractorInput);
                    defaultEbmlReader.f17668e = 0;
                    return true;
                }
                if (i2 != 5) {
                    throw ParserException.a(null, "Invalid element type " + i2);
                }
                long j11 = defaultEbmlReader.g;
                if (j11 != 4 && j11 != 8) {
                    throw ParserException.a(null, "Invalid float size: " + defaultEbmlReader.g);
                }
                EbmlProcessor ebmlProcessor5 = defaultEbmlReader.d;
                int i55 = defaultEbmlReader.f;
                int i56 = (int) j11;
                long jB = defaultEbmlReader.b(defaultExtractorInput, i56);
                double dIntBitsToFloat = i56 == 4 ? Float.intBitsToFloat((int) jB) : Double.longBitsToDouble(jB);
                MatroskaExtractor matroskaExtractor5 = MatroskaExtractor.this;
                if (i55 == 181) {
                    matroskaExtractor5.e(i55);
                    matroskaExtractor5.f17696u.f17708Q = (int) dIntBitsToFloat;
                } else if (i55 != 17545) {
                    switch (i55) {
                        case 21969:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.D = (float) dIntBitsToFloat;
                            break;
                        case 21970:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.f17702E = (float) dIntBitsToFloat;
                            break;
                        case 21971:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.f17703F = (float) dIntBitsToFloat;
                            break;
                        case 21972:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.G = (float) dIntBitsToFloat;
                            break;
                        case 21973:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.H = (float) dIntBitsToFloat;
                            break;
                        case 21974:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.f17704I = (float) dIntBitsToFloat;
                            break;
                        case 21975:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.f17705J = (float) dIntBitsToFloat;
                            break;
                        case 21976:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.K = (float) dIntBitsToFloat;
                            break;
                        case 21977:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.L = (float) dIntBitsToFloat;
                            break;
                        case 21978:
                            matroskaExtractor5.e(i55);
                            matroskaExtractor5.f17696u.M = (float) dIntBitsToFloat;
                            break;
                        default:
                            switch (i55) {
                                case 30323:
                                    matroskaExtractor5.e(i55);
                                    matroskaExtractor5.f17696u.s = (float) dIntBitsToFloat;
                                    break;
                                case 30324:
                                    matroskaExtractor5.e(i55);
                                    matroskaExtractor5.f17696u.t = (float) dIntBitsToFloat;
                                    break;
                                case 30325:
                                    matroskaExtractor5.e(i55);
                                    matroskaExtractor5.f17696u.f17722u = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    matroskaExtractor5.getClass();
                                    break;
                            }
                            break;
                    }
                } else {
                    matroskaExtractor5.s = (long) dIntBitsToFloat;
                }
                defaultEbmlReader.f17668e = 0;
                return true;
            }
            defaultExtractorInput.skipFully((int) defaultEbmlReader.g);
            defaultEbmlReader.f17668e = 0;
            str6 = str;
            c2 = 2;
        }
    }

    public final long b(DefaultExtractorInput defaultExtractorInput, int i2) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f17665a;
        defaultExtractorInput.readFully(bArr, 0, i2, false);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j = (j << 8) | ((long) (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return j;
    }
}
