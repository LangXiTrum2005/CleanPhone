package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import com.applovin.shadow.okio.Segment;
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

/* JADX INFO: loaded from: classes.dex */
final class DefaultEbmlReader implements EbmlReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6963a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f6964b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VarintReader f6965c = new VarintReader();
    public EbmlProcessor d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6966e;
    public int f;
    public long g;

    public static final class MasterElement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6968b;

        public MasterElement(int i2, long j) {
            this.f6967a = i2;
            this.f6968b = j;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:232:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:514:0x0896  */
    /* JADX WARN: Code duplicated, block: B:519:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:520:0x08af  */
    /* JADX WARN: Code duplicated, block: B:523:0x08be  */
    /* JADX WARN: Code duplicated, block: B:524:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:526:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:528:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:530:0x08da  */
    /* JADX WARN: Code duplicated, block: B:533:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:535:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:538:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:541:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:544:0x0900  */
    /* JADX WARN: Code duplicated, block: B:546:0x0906  */
    /* JADX WARN: Code duplicated, block: B:566:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:568:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:571:0x09de  */
    /* JADX WARN: Code duplicated, block: B:574:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:577:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:596:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:598:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:600:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:616:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r46v0, types: [androidx.media3.extractor.DefaultExtractorInput] */
    /* JADX WARN: Type inference failed for: r8v24, types: [androidx.media3.extractor.mkv.MatroskaExtractor$Track, java.lang.Object] */
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
        ?? r14;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        String str2;
        ?? r15;
        long j;
        int iB;
        ?? r16;
        ?? r17;
        int iA;
        int i4;
        byte b2;
        byte b3;
        int iW;
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
        boolean zH;
        int i8;
        int i9;
        int i10;
        float f;
        ColorInfo colorInfoA;
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
        boolean z4;
        SeekMap unseekable;
        int i15;
        DefaultEbmlReader defaultEbmlReader = this;
        String str6 = "A_MPEG/L2";
        char c2 = 2;
        Assertions.f(defaultEbmlReader.d);
        ?? r4 = "A_VORBIS";
        while (true) {
            ArrayDeque arrayDeque = defaultEbmlReader.f6964b;
            MasterElement masterElement = (MasterElement) arrayDeque.peek();
            if (masterElement != null && defaultExtractorInput.d >= masterElement.f6968b) {
                EbmlProcessor ebmlProcessor = defaultEbmlReader.d;
                int i16 = ((MasterElement) arrayDeque.pop()).f6967a;
                MatroskaExtractor matroskaExtractor2 = MatroskaExtractor.this;
                Assertions.f(matroskaExtractor2.f6987d0);
                SparseArray sparseArray = matroskaExtractor2.f6985c;
                if (i16 == 160) {
                    if (matroskaExtractor2.f6973I != 2) {
                        return true;
                    }
                    MatroskaExtractor.Track track = (MatroskaExtractor.Track) sparseArray.get(matroskaExtractor2.O);
                    track.f7010Y.getClass();
                    if (matroskaExtractor2.T > 0 && "A_OPUS".equals(track.f7012b)) {
                        byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(matroskaExtractor2.T).array();
                        ParsableByteArray parsableByteArray = matroskaExtractor2.f6993p;
                        parsableByteArray.getClass();
                        parsableByteArray.E(bArrArray, bArrArray.length);
                    }
                    int i17 = 0;
                    for (int i18 = 0; i18 < matroskaExtractor2.M; i18++) {
                        i17 += matroskaExtractor2.f6975N[i18];
                    }
                    int i19 = 0;
                    while (i19 < matroskaExtractor2.M) {
                        long j2 = matroskaExtractor2.f6974J + ((long) ((track.f7014e * i19) / 1000));
                        int i20 = matroskaExtractor2.f6977Q;
                        if (i19 != 0 || matroskaExtractor2.S) {
                            i4 = 1;
                        } else {
                            i4 = 1;
                            i20 |= 1;
                        }
                        int i21 = i20;
                        int i22 = matroskaExtractor2.f6975N[i19];
                        int i23 = i17 - i22;
                        matroskaExtractor2.h(track, j2, i21, i22, i23);
                        i19 += i4;
                        i17 = i23;
                    }
                    matroskaExtractor2.f6973I = 0;
                    return true;
                }
                if (i16 != 174) {
                    if (i16 == 19899) {
                        int i24 = matroskaExtractor2.y;
                        if (i24 != -1) {
                            long j3 = matroskaExtractor2.f6996z;
                            if (j3 != -1) {
                                if (i24 == 475249515) {
                                    matroskaExtractor2.f6970B = j3;
                                    return true;
                                }
                            }
                        }
                        throw ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
                    }
                    if (i16 == 25152) {
                        matroskaExtractor2.g(i16);
                        MatroskaExtractor.Track track2 = matroskaExtractor2.f6995w;
                        if (track2.f7015h) {
                            TrackOutput.CryptoData cryptoData = track2.j;
                            if (cryptoData == null) {
                                throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                            }
                            track2.f7017l = new DrmInitData(new DrmInitData.SchemeData(C.f5378a, null, "video/webm", cryptoData.f6806b));
                            return true;
                        }
                    } else if (i16 == 28032) {
                        matroskaExtractor2.g(i16);
                        MatroskaExtractor.Track track3 = matroskaExtractor2.f6995w;
                        if (track3.f7015h && track3.f7016i != null) {
                            throw ParserException.a(null, "Combining encryption and compression is not supported");
                        }
                    } else {
                        if (i16 != 357149030) {
                            if (i16 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw ParserException.a(null, "No valid tracks were found");
                                }
                                matroskaExtractor2.f6987d0.endTracks();
                                return true;
                            }
                            if (i16 != 475249515) {
                                return true;
                            }
                            if (matroskaExtractor2.x) {
                                z4 = true;
                            } else {
                                ExtractorOutput extractorOutput = matroskaExtractor2.f6987d0;
                                LongArray longArray = matroskaExtractor2.f6971E;
                                LongArray longArray2 = matroskaExtractor2.f6972F;
                                if (matroskaExtractor2.s == -1 || matroskaExtractor2.v == -9223372036854775807L || longArray == null || (i15 = longArray.f5652a) == 0 || longArray2 == null || longArray2.f5652a != i15) {
                                    unseekable = new SeekMap.Unseekable(matroskaExtractor2.v);
                                } else {
                                    int[] iArrCopyOf = new int[i15];
                                    long[] jArrCopyOf = new long[i15];
                                    long[] jArrCopyOf2 = new long[i15];
                                    long[] jArrCopyOf3 = new long[i15];
                                    for (int i25 = 0; i25 < i15; i25++) {
                                        jArrCopyOf3[i25] = longArray.b(i25);
                                        jArrCopyOf[i25] = longArray2.b(i25) + matroskaExtractor2.s;
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
                                            iArrCopyOf[i27] = (int) ((matroskaExtractor2.s + matroskaExtractor2.r) - jArrCopyOf[i27]);
                                            long j4 = matroskaExtractor2.v - jArrCopyOf3[i27];
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
                                extractorOutput.e(unseekable);
                                z4 = true;
                                matroskaExtractor2.x = true;
                            }
                            matroskaExtractor2.f6971E = null;
                            matroskaExtractor2.f6972F = null;
                            return z4;
                        }
                        if (matroskaExtractor2.t == -9223372036854775807L) {
                            matroskaExtractor2.t = 1000000L;
                        }
                        long j5 = matroskaExtractor2.f6994u;
                        if (j5 != -9223372036854775807L) {
                            matroskaExtractor2.v = matroskaExtractor2.l(j5);
                            return true;
                        }
                    }
                    return true;
                }
                ?? r8 = matroskaExtractor2.f6995w;
                Assertions.f(r8);
                ?? r12 = r8.f7012b;
                if (r12 == 0) {
                    throw ParserException.a(null, "CodecId is missing in TrackEntry element");
                }
                switch (r12.hashCode()) {
                    case -2095576542:
                        if (r12.equals("V_MPEG4/ISO/AP")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -2095575984:
                        if (r12.equals("V_MPEG4/ISO/SP")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1985379776:
                        if (r12.equals("A_MS/ACM")) {
                            b2 = c2;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1784763192:
                        if (r12.equals("A_TRUEHD")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1730367663:
                        if (r12.equals(r4)) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1482641358:
                        if (r12.equals(str6)) {
                            b2 = 5;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1482641357:
                        if (r12.equals("A_MPEG/L3")) {
                            b2 = 6;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1373388978:
                        if (r12.equals("V_MS/VFW/FOURCC")) {
                            b2 = 7;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -933872740:
                        if (r12.equals("S_DVBSUB")) {
                            b2 = 8;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -538363189:
                        if (r12.equals("V_MPEG4/ISO/ASP")) {
                            b2 = 9;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -538363109:
                        if (r12.equals("V_MPEG4/ISO/AVC")) {
                            b2 = 10;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -425012669:
                        if (r12.equals("S_VOBSUB")) {
                            b2 = 11;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -356037306:
                        if (r12.equals("A_DTS/LOSSLESS")) {
                            b2 = 12;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 62923557:
                        if (r12.equals("A_AAC")) {
                            b2 = 13;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 62923603:
                        if (r12.equals("A_AC3")) {
                            b2 = 14;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 62927045:
                        if (r12.equals("A_DTS")) {
                            b2 = 15;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 82318131:
                        if (r12.equals("V_AV1")) {
                            b2 = 16;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 82338133:
                        if (r12.equals("V_VP8")) {
                            b2 = 17;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 82338134:
                        if (r12.equals("V_VP9")) {
                            b2 = 18;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 99146302:
                        if (r12.equals("S_HDMV/PGS")) {
                            b2 = 19;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 444813526:
                        if (r12.equals("V_THEORA")) {
                            b2 = 20;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 542569478:
                        if (r12.equals("A_DTS/EXPRESS")) {
                            b2 = 21;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 635596514:
                        if (r12.equals("A_PCM/FLOAT/IEEE")) {
                            b2 = 22;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 725948237:
                        if (r12.equals("A_PCM/INT/BIG")) {
                            b2 = 23;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 725957860:
                        if (r12.equals("A_PCM/INT/LIT")) {
                            b2 = 24;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 738597099:
                        if (r12.equals("S_TEXT/ASS")) {
                            b2 = 25;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 855502857:
                        if (r12.equals("V_MPEGH/ISO/HEVC")) {
                            b2 = 26;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1045209816:
                        if (r12.equals("S_TEXT/WEBVTT")) {
                            b2 = 27;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1422270023:
                        if (r12.equals("S_TEXT/UTF8")) {
                            b2 = 28;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1809237540:
                        if (r12.equals("V_MPEG2")) {
                            b2 = 29;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1950749482:
                        if (r12.equals("A_EAC3")) {
                            b2 = 30;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1950789798:
                        if (r12.equals("A_FLAC")) {
                            b2 = 31;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1951062397:
                        if (r12.equals("A_OPUS")) {
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
                        ExtractorOutput extractorOutput2 = matroskaExtractor2.f6987d0;
                        int i29 = r8.f7013c;
                        String str7 = "video/x-unknown";
                        switch (r12.hashCode()) {
                            case -2095576542:
                                if (r12.equals("V_MPEG4/ISO/AP")) {
                                    b3 = 0;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -2095575984:
                                if (r12.equals("V_MPEG4/ISO/SP")) {
                                    b3 = 1;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1985379776:
                                if (r12.equals("A_MS/ACM")) {
                                    b3 = c2;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1784763192:
                                if (r12.equals("A_TRUEHD")) {
                                    b3 = 3;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1730367663:
                                if (r12.equals(r4)) {
                                    b3 = 4;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1482641358:
                                if (r12.equals(str6)) {
                                    b3 = 5;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1482641357:
                                if (r12.equals("A_MPEG/L3")) {
                                    b3 = 6;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -1373388978:
                                if (r12.equals("V_MS/VFW/FOURCC")) {
                                    b3 = 7;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -933872740:
                                if (r12.equals("S_DVBSUB")) {
                                    b3 = 8;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -538363189:
                                if (r12.equals("V_MPEG4/ISO/ASP")) {
                                    b3 = 9;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -538363109:
                                if (r12.equals("V_MPEG4/ISO/AVC")) {
                                    b3 = 10;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -425012669:
                                if (r12.equals("S_VOBSUB")) {
                                    b3 = 11;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -356037306:
                                if (r12.equals("A_DTS/LOSSLESS")) {
                                    b3 = 12;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 62923557:
                                if (r12.equals("A_AAC")) {
                                    b3 = 13;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 62923603:
                                if (r12.equals("A_AC3")) {
                                    b3 = 14;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 62927045:
                                if (r12.equals("A_DTS")) {
                                    b3 = 15;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 82318131:
                                if (r12.equals("V_AV1")) {
                                    b3 = 16;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 82338133:
                                if (r12.equals("V_VP8")) {
                                    b3 = 17;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 82338134:
                                if (r12.equals("V_VP9")) {
                                    b3 = 18;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 99146302:
                                if (r12.equals("S_HDMV/PGS")) {
                                    b3 = 19;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 444813526:
                                if (r12.equals("V_THEORA")) {
                                    b3 = 20;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 542569478:
                                if (r12.equals("A_DTS/EXPRESS")) {
                                    b3 = 21;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 635596514:
                                if (r12.equals("A_PCM/FLOAT/IEEE")) {
                                    b3 = 22;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 725948237:
                                if (r12.equals("A_PCM/INT/BIG")) {
                                    b3 = 23;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 725957860:
                                if (r12.equals("A_PCM/INT/LIT")) {
                                    b3 = 24;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 738597099:
                                if (r12.equals("S_TEXT/ASS")) {
                                    b3 = 25;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 855502857:
                                if (r12.equals("V_MPEGH/ISO/HEVC")) {
                                    b3 = 26;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1045209816:
                                if (r12.equals("S_TEXT/WEBVTT")) {
                                    b3 = 27;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1422270023:
                                if (r12.equals("S_TEXT/UTF8")) {
                                    b3 = 28;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1809237540:
                                if (r12.equals("V_MPEG2")) {
                                    b3 = 29;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1950749482:
                                if (r12.equals("A_EAC3")) {
                                    b3 = 30;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1950789798:
                                if (r12.equals("A_FLAC")) {
                                    b3 = 31;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1951062397:
                                if (r12.equals("A_OPUS")) {
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
                                byte[] bArr2 = r8.k;
                                str7 = "video/mp4v-es";
                                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null && (dolbyVisionConfigA = DolbyVisionConfig.a(new ParsableByteArray(r8.O))) != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z5 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i30 = (z5 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9 || (i12 = r8.q) == i9) {
                                        f = -1.0f;
                                    } else {
                                        f = (r8.f7018n * i10) / (r8.m * i12);
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f || r8.f7001F == -1.0f || r8.G == -1.0f || r8.H == -1.0f || r8.f7002I == -1.0f || r8.f7003J == -1.0f || r8.K == -1.0f || r8.L == -1.0f || r8.M == -1.0f || r8.f7004N == -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = new byte[25];
                                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder.put((byte) 0);
                                            byteBufferOrder.putShort((short) ((r8.f7000E * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((r8.f7001F * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((r8.G * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((r8.H * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((r8.f7002I * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((r8.f7003J * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((r8.K * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((r8.L * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) (r8.M + 0.5f));
                                            byteBufferOrder.putShort((short) (r8.f7004N + 0.5f));
                                            byteBufferOrder.putShort((short) r8.C);
                                            byteBufferOrder.putShort((short) r8.D);
                                        }
                                        ColorInfo.Builder builder2 = new ColorInfo.Builder();
                                        builder2.f5387a = r8.f7022z;
                                        builder2.f5388b = r8.f6999B;
                                        builder2.f5389c = r8.f6998A;
                                        builder2.d = bArr;
                                        int i31 = r8.o;
                                        builder2.f5390e = i31;
                                        builder2.f = i31;
                                        colorInfoA = builder2.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null && map.containsKey(str4)) {
                                        iIntValue = ((Integer) map.get(r8.f7011a)).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0 || Float.compare(r8.t, 0.0f) != 0 || Float.compare(r8.f7020u, 0.0f) != 0) {
                                        i11 = iIntValue;
                                    } else if (Float.compare(r8.v, 0.0f) == 0) {
                                        i11 = 0;
                                    } else if (Float.compare(r8.v, 90.0f) == 0) {
                                        i11 = 90;
                                    } else if (Float.compare(r8.v, -180.0f) == 0 || Float.compare(r8.v, 180.0f) == 0) {
                                        i11 = 180;
                                    } else if (Float.compare(r8.v, -90.0f) == 0) {
                                        i11 = 270;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
                                        throw ParserException.a(null, "Unexpected MIME type.");
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null && !map.containsKey(str5)) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i30;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format = new Format(builder);
                                TrackOutput trackOutputTrack = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack;
                                trackOutputTrack.b(format);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 2:
                                ParsableByteArray parsableByteArray2 = new ParsableByteArray(r8.a(r8.f7012b));
                                try {
                                    int iN = parsableByteArray2.n();
                                    if (iN != 1) {
                                        if (iN == 65534) {
                                            parsableByteArray2.G(24);
                                            long jO = parsableByteArray2.o();
                                            UUID uuid = MatroskaExtractor.i0;
                                            if (jO != uuid.getMostSignificantBits() || parsableByteArray2.o() != uuid.getLeastSignificantBits()) {
                                            }
                                            str7 = "audio/x-unknown";
                                            listSingletonList = null;
                                            i5 = -1;
                                            list = listSingletonList;
                                            str3 = null;
                                            list4 = list;
                                            i6 = -1;
                                            list3 = list4;
                                            if (r8.O != null) {
                                                str3 = dolbyVisionConfigA.f6747a;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z6 = r8.W;
                                            if (r8.f7009V) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i32 = (z6 ? 1 : 0) | i7;
                                            builder = new Format.Builder();
                                            zH = MimeTypes.h(str7);
                                            Map map2 = MatroskaExtractor.j0;
                                            if (zH) {
                                                builder.f5434z = r8.f7005P;
                                                builder.f5418A = r8.f7007R;
                                                builder.f5419B = i6;
                                                i8 = 1;
                                            } else if (MimeTypes.k(str7)) {
                                                if (r8.r == 0) {
                                                    i13 = r8.f7019p;
                                                    i9 = -1;
                                                    if (i13 == -1) {
                                                        i13 = r8.m;
                                                    }
                                                    r8.f7019p = i13;
                                                    i14 = r8.q;
                                                    if (i14 == -1) {
                                                        i14 = r8.f7018n;
                                                    }
                                                    r8.q = i14;
                                                } else {
                                                    i9 = -1;
                                                }
                                                i10 = r8.f7019p;
                                                if (i10 != i9) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r8.y) {
                                                    if (r8.f7000E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    ColorInfo.Builder builder3 = new ColorInfo.Builder();
                                                    builder3.f5387a = r8.f7022z;
                                                    builder3.f5388b = r8.f6999B;
                                                    builder3.f5389c = r8.f6998A;
                                                    builder3.d = bArr;
                                                    int i33 = r8.o;
                                                    builder3.f5390e = i33;
                                                    builder3.f = i33;
                                                    colorInfoA = builder3.a();
                                                } else {
                                                    colorInfoA = null;
                                                }
                                                str4 = r8.f7011a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r8.s == 0) {
                                                    i11 = iIntValue;
                                                } else {
                                                    i11 = iIntValue;
                                                }
                                                builder.r = r8.m;
                                                builder.s = r8.f7018n;
                                                builder.v = f;
                                                builder.f5432u = i11;
                                                builder.f5433w = r8.f7021w;
                                                builder.x = r8.x;
                                                builder.y = colorInfoA;
                                                i8 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i8 = 3;
                                            }
                                            str5 = r8.f7011a;
                                            if (str5 != null) {
                                                builder.f5424b = r8.f7011a;
                                            }
                                            builder.f5423a = Integer.toString(i29);
                                            builder.f5429l = MimeTypes.l(str7);
                                            builder.m = i5;
                                            builder.d = r8.X;
                                            builder.f5426e = i32;
                                            builder.o = list3;
                                            builder.f5428i = str3;
                                            builder.f5431p = r8.f7017l;
                                            Format format2 = new Format(builder);
                                            TrackOutput trackOutputTrack2 = extractorOutput2.track(r8.f7013c, i8);
                                            r8.f7010Y = trackOutputTrack2;
                                            trackOutputTrack2.b(format2);
                                            sparseArray.put(r8.f7013c, r8);
                                            matroskaExtractor = matroskaExtractor2;
                                        }
                                        Log.g("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                        str7 = "audio/x-unknown";
                                        listSingletonList = null;
                                        i5 = -1;
                                        list = listSingletonList;
                                        str3 = null;
                                        list4 = list;
                                        i6 = -1;
                                        list3 = list4;
                                        if (r8.O != null) {
                                            str3 = dolbyVisionConfigA.f6747a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z7 = r8.W;
                                        if (r8.f7009V) {
                                            i7 = 2;
                                        } else {
                                            i7 = 0;
                                        }
                                        int i34 = (z7 ? 1 : 0) | i7;
                                        builder = new Format.Builder();
                                        zH = MimeTypes.h(str7);
                                        Map map3 = MatroskaExtractor.j0;
                                        if (zH) {
                                            builder.f5434z = r8.f7005P;
                                            builder.f5418A = r8.f7007R;
                                            builder.f5419B = i6;
                                            i8 = 1;
                                        } else if (MimeTypes.k(str7)) {
                                            if (r8.r == 0) {
                                                i13 = r8.f7019p;
                                                i9 = -1;
                                                if (i13 == -1) {
                                                    i13 = r8.m;
                                                }
                                                r8.f7019p = i13;
                                                i14 = r8.q;
                                                if (i14 == -1) {
                                                    i14 = r8.f7018n;
                                                }
                                                r8.q = i14;
                                            } else {
                                                i9 = -1;
                                            }
                                            i10 = r8.f7019p;
                                            if (i10 != i9) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (r8.y) {
                                                if (r8.f7000E != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                ColorInfo.Builder builder4 = new ColorInfo.Builder();
                                                builder4.f5387a = r8.f7022z;
                                                builder4.f5388b = r8.f6999B;
                                                builder4.f5389c = r8.f6998A;
                                                builder4.d = bArr;
                                                int i35 = r8.o;
                                                builder4.f5390e = i35;
                                                builder4.f = i35;
                                                colorInfoA = builder4.a();
                                            } else {
                                                colorInfoA = null;
                                            }
                                            str4 = r8.f7011a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (r8.s == 0) {
                                                i11 = iIntValue;
                                            } else {
                                                i11 = iIntValue;
                                            }
                                            builder.r = r8.m;
                                            builder.s = r8.f7018n;
                                            builder.v = f;
                                            builder.f5432u = i11;
                                            builder.f5433w = r8.f7021w;
                                            builder.x = r8.x;
                                            builder.y = colorInfoA;
                                            i8 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i8 = 3;
                                        }
                                        str5 = r8.f7011a;
                                        if (str5 != null) {
                                            builder.f5424b = r8.f7011a;
                                        }
                                        builder.f5423a = Integer.toString(i29);
                                        builder.f5429l = MimeTypes.l(str7);
                                        builder.m = i5;
                                        builder.d = r8.X;
                                        builder.f5426e = i34;
                                        builder.o = list3;
                                        builder.f5428i = str3;
                                        builder.f5431p = r8.f7017l;
                                        Format format3 = new Format(builder);
                                        TrackOutput trackOutputTrack3 = extractorOutput2.track(r8.f7013c, i8);
                                        r8.f7010Y = trackOutputTrack3;
                                        trackOutputTrack3.b(format3);
                                        sparseArray.put(r8.f7013c, r8);
                                        matroskaExtractor = matroskaExtractor2;
                                        break;
                                    }
                                    iW = Util.w(r8.f7006Q);
                                    if (iW == 0) {
                                        Log.g("MatroskaExtractor", "Unsupported PCM bit depth: " + r8.f7006Q + ". Setting mimeType to audio/x-unknown");
                                        str7 = "audio/x-unknown";
                                        listSingletonList = null;
                                        i5 = -1;
                                        list = listSingletonList;
                                        str3 = null;
                                        list4 = list;
                                        i6 = -1;
                                        list3 = list4;
                                        if (r8.O != null) {
                                            str3 = dolbyVisionConfigA.f6747a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z8 = r8.W;
                                        if (r8.f7009V) {
                                            i7 = 2;
                                        } else {
                                            i7 = 0;
                                        }
                                        int i36 = (z8 ? 1 : 0) | i7;
                                        builder = new Format.Builder();
                                        zH = MimeTypes.h(str7);
                                        Map map4 = MatroskaExtractor.j0;
                                        if (zH) {
                                            builder.f5434z = r8.f7005P;
                                            builder.f5418A = r8.f7007R;
                                            builder.f5419B = i6;
                                            i8 = 1;
                                        } else if (MimeTypes.k(str7)) {
                                            if (r8.r == 0) {
                                                i13 = r8.f7019p;
                                                i9 = -1;
                                                if (i13 == -1) {
                                                    i13 = r8.m;
                                                }
                                                r8.f7019p = i13;
                                                i14 = r8.q;
                                                if (i14 == -1) {
                                                    i14 = r8.f7018n;
                                                }
                                                r8.q = i14;
                                            } else {
                                                i9 = -1;
                                            }
                                            i10 = r8.f7019p;
                                            if (i10 != i9) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (r8.y) {
                                                if (r8.f7000E != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                ColorInfo.Builder builder5 = new ColorInfo.Builder();
                                                builder5.f5387a = r8.f7022z;
                                                builder5.f5388b = r8.f6999B;
                                                builder5.f5389c = r8.f6998A;
                                                builder5.d = bArr;
                                                int i37 = r8.o;
                                                builder5.f5390e = i37;
                                                builder5.f = i37;
                                                colorInfoA = builder5.a();
                                            } else {
                                                colorInfoA = null;
                                            }
                                            str4 = r8.f7011a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (r8.s == 0) {
                                                i11 = iIntValue;
                                            } else {
                                                i11 = iIntValue;
                                            }
                                            builder.r = r8.m;
                                            builder.s = r8.f7018n;
                                            builder.v = f;
                                            builder.f5432u = i11;
                                            builder.f5433w = r8.f7021w;
                                            builder.x = r8.x;
                                            builder.y = colorInfoA;
                                            i8 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i8 = 3;
                                        }
                                        str5 = r8.f7011a;
                                        if (str5 != null) {
                                            builder.f5424b = r8.f7011a;
                                        }
                                        builder.f5423a = Integer.toString(i29);
                                        builder.f5429l = MimeTypes.l(str7);
                                        builder.m = i5;
                                        builder.d = r8.X;
                                        builder.f5426e = i36;
                                        builder.o = list3;
                                        builder.f5428i = str3;
                                        builder.f5431p = r8.f7017l;
                                        Format format4 = new Format(builder);
                                        TrackOutput trackOutputTrack4 = extractorOutput2.track(r8.f7013c, i8);
                                        r8.f7010Y = trackOutputTrack4;
                                        trackOutputTrack4.b(format4);
                                        sparseArray.put(r8.f7013c, r8);
                                        matroskaExtractor = matroskaExtractor2;
                                    }
                                    i6 = iW;
                                    str7 = "audio/raw";
                                    list3 = null;
                                    i5 = -1;
                                    str3 = null;
                                    if (r8.O != null) {
                                        str3 = dolbyVisionConfigA.f6747a;
                                        str7 = "video/dolby-vision";
                                    }
                                    boolean z9 = r8.W;
                                    if (r8.f7009V) {
                                        i7 = 2;
                                    } else {
                                        i7 = 0;
                                    }
                                    int i38 = (z9 ? 1 : 0) | i7;
                                    builder = new Format.Builder();
                                    zH = MimeTypes.h(str7);
                                    Map map5 = MatroskaExtractor.j0;
                                    if (zH) {
                                        builder.f5434z = r8.f7005P;
                                        builder.f5418A = r8.f7007R;
                                        builder.f5419B = i6;
                                        i8 = 1;
                                    } else if (MimeTypes.k(str7)) {
                                        if (r8.r == 0) {
                                            i13 = r8.f7019p;
                                            i9 = -1;
                                            if (i13 == -1) {
                                                i13 = r8.m;
                                            }
                                            r8.f7019p = i13;
                                            i14 = r8.q;
                                            if (i14 == -1) {
                                                i14 = r8.f7018n;
                                            }
                                            r8.q = i14;
                                        } else {
                                            i9 = -1;
                                        }
                                        i10 = r8.f7019p;
                                        if (i10 != i9) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (r8.y) {
                                            if (r8.f7000E != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            ColorInfo.Builder builder6 = new ColorInfo.Builder();
                                            builder6.f5387a = r8.f7022z;
                                            builder6.f5388b = r8.f6999B;
                                            builder6.f5389c = r8.f6998A;
                                            builder6.d = bArr;
                                            int i39 = r8.o;
                                            builder6.f5390e = i39;
                                            builder6.f = i39;
                                            colorInfoA = builder6.a();
                                        } else {
                                            colorInfoA = null;
                                        }
                                        str4 = r8.f7011a;
                                        if (str4 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (r8.s == 0) {
                                            i11 = iIntValue;
                                        } else {
                                            i11 = iIntValue;
                                        }
                                        builder.r = r8.m;
                                        builder.s = r8.f7018n;
                                        builder.v = f;
                                        builder.f5432u = i11;
                                        builder.f5433w = r8.f7021w;
                                        builder.x = r8.x;
                                        builder.y = colorInfoA;
                                        i8 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str7)) {
                                        }
                                        i8 = 3;
                                    }
                                    str5 = r8.f7011a;
                                    if (str5 != null) {
                                        builder.f5424b = r8.f7011a;
                                    }
                                    builder.f5423a = Integer.toString(i29);
                                    builder.f5429l = MimeTypes.l(str7);
                                    builder.m = i5;
                                    builder.d = r8.X;
                                    builder.f5426e = i38;
                                    builder.o = list3;
                                    builder.f5428i = str3;
                                    builder.f5431p = r8.f7017l;
                                    Format format5 = new Format(builder);
                                    TrackOutput trackOutputTrack5 = extractorOutput2.track(r8.f7013c, i8);
                                    r8.f7010Y = trackOutputTrack5;
                                    trackOutputTrack5.b(format5);
                                    sparseArray.put(r8.f7013c, r8);
                                    matroskaExtractor = matroskaExtractor2;
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    throw ParserException.a(null, "Error parsing MS/ACM codec private");
                                }
                                break;
                            case 3:
                                r8.f7008U = new TrueHdSampleRechunker();
                                str7 = "audio/true-hd";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z10 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i310 = (z10 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map6 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder7 = new ColorInfo.Builder();
                                        builder7.f5387a = r8.f7022z;
                                        builder7.f5388b = r8.f6999B;
                                        builder7.f5389c = r8.f6998A;
                                        builder7.d = bArr;
                                        int i311 = r8.o;
                                        builder7.f5390e = i311;
                                        builder7.f = i311;
                                        colorInfoA = builder7.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i310;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format6 = new Format(builder);
                                TrackOutput trackOutputTrack6 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack6;
                                trackOutputTrack6.b(format6);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 4:
                                byte[] bArrA = r8.a(r12);
                                try {
                                    r3 = c2;
                                    try {
                                        if (bArrA[0] != r3) {
                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                        }
                                        int i40 = 0;
                                        int i41 = 1;
                                        while (true) {
                                            int i42 = bArrA[i41] & 255;
                                            if (i42 != 255) {
                                                int i43 = i41 + 1;
                                                int i44 = i40 + i42;
                                                int i45 = 0;
                                                while (true) {
                                                    int i46 = bArrA[i43] & 255;
                                                    if (i46 != 255) {
                                                        int i47 = i43 + 1;
                                                        int i48 = i45 + i46;
                                                        if (bArrA[i47] != 1) {
                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                        }
                                                        byte[] bArr3 = new byte[i44];
                                                        System.arraycopy(bArrA, i47, bArr3, 0, i44);
                                                        int i49 = i47 + i44;
                                                        if (bArrA[i49] != 3) {
                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                        }
                                                        int i50 = i49 + i48;
                                                        if (bArrA[i50] != 5) {
                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                        }
                                                        byte[] bArr4 = new byte[bArrA.length - i50];
                                                        System.arraycopy(bArrA, i50, bArr4, 0, bArrA.length - i50);
                                                        ArrayList arrayList = new ArrayList(2);
                                                        arrayList.add(bArr3);
                                                        arrayList.add(bArr4);
                                                        str7 = "audio/vorbis";
                                                        i5 = Segment.SIZE;
                                                        list = arrayList;
                                                        str3 = null;
                                                        list4 = list;
                                                        i6 = -1;
                                                        list3 = list4;
                                                        if (r8.O != null) {
                                                            str3 = dolbyVisionConfigA.f6747a;
                                                            str7 = "video/dolby-vision";
                                                        }
                                                        boolean z11 = r8.W;
                                                        if (r8.f7009V) {
                                                            i7 = 2;
                                                        } else {
                                                            i7 = 0;
                                                        }
                                                        int i312 = (z11 ? 1 : 0) | i7;
                                                        builder = new Format.Builder();
                                                        zH = MimeTypes.h(str7);
                                                        Map map7 = MatroskaExtractor.j0;
                                                        if (zH) {
                                                            builder.f5434z = r8.f7005P;
                                                            builder.f5418A = r8.f7007R;
                                                            builder.f5419B = i6;
                                                            i8 = 1;
                                                        } else if (MimeTypes.k(str7)) {
                                                            if (r8.r == 0) {
                                                                i13 = r8.f7019p;
                                                                i9 = -1;
                                                                if (i13 == -1) {
                                                                    i13 = r8.m;
                                                                }
                                                                r8.f7019p = i13;
                                                                i14 = r8.q;
                                                                if (i14 == -1) {
                                                                    i14 = r8.f7018n;
                                                                }
                                                                r8.q = i14;
                                                            } else {
                                                                i9 = -1;
                                                            }
                                                            i10 = r8.f7019p;
                                                            if (i10 != i9) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (r8.y) {
                                                                if (r8.f7000E != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                ColorInfo.Builder builder8 = new ColorInfo.Builder();
                                                                builder8.f5387a = r8.f7022z;
                                                                builder8.f5388b = r8.f6999B;
                                                                builder8.f5389c = r8.f6998A;
                                                                builder8.d = bArr;
                                                                int i313 = r8.o;
                                                                builder8.f5390e = i313;
                                                                builder8.f = i313;
                                                                colorInfoA = builder8.a();
                                                            } else {
                                                                colorInfoA = null;
                                                            }
                                                            str4 = r8.f7011a;
                                                            if (str4 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (r8.s == 0) {
                                                                i11 = iIntValue;
                                                            } else {
                                                                i11 = iIntValue;
                                                            }
                                                            builder.r = r8.m;
                                                            builder.s = r8.f7018n;
                                                            builder.v = f;
                                                            builder.f5432u = i11;
                                                            builder.f5433w = r8.f7021w;
                                                            builder.x = r8.x;
                                                            builder.y = colorInfoA;
                                                            i8 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str7)) {
                                                            }
                                                            i8 = 3;
                                                        }
                                                        str5 = r8.f7011a;
                                                        if (str5 != null) {
                                                            builder.f5424b = r8.f7011a;
                                                        }
                                                        builder.f5423a = Integer.toString(i29);
                                                        builder.f5429l = MimeTypes.l(str7);
                                                        builder.m = i5;
                                                        builder.d = r8.X;
                                                        builder.f5426e = i312;
                                                        builder.o = list3;
                                                        builder.f5428i = str3;
                                                        builder.f5431p = r8.f7017l;
                                                        Format format7 = new Format(builder);
                                                        TrackOutput trackOutputTrack7 = extractorOutput2.track(r8.f7013c, i8);
                                                        r8.f7010Y = trackOutputTrack7;
                                                        trackOutputTrack7.b(format7);
                                                        sparseArray.put(r8.f7013c, r8);
                                                        matroskaExtractor = matroskaExtractor2;
                                                    } else {
                                                        i45 += 255;
                                                        i43++;
                                                    }
                                                }
                                            } else {
                                                i40 += 255;
                                                i41++;
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
                                str7 = "audio/mpeg-L2";
                                list = null;
                                i5 = 4096;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z12 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i314 = (z12 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map8 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder9 = new ColorInfo.Builder();
                                        builder9.f5387a = r8.f7022z;
                                        builder9.f5388b = r8.f6999B;
                                        builder9.f5389c = r8.f6998A;
                                        builder9.d = bArr;
                                        int i315 = r8.o;
                                        builder9.f5390e = i315;
                                        builder9.f = i315;
                                        colorInfoA = builder9.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i314;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format8 = new Format(builder);
                                TrackOutput trackOutputTrack8 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack8;
                                trackOutputTrack8.b(format8);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 6:
                                str7 = "audio/mpeg";
                                list = null;
                                i5 = 4096;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z13 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i316 = (z13 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map9 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder10 = new ColorInfo.Builder();
                                        builder10.f5387a = r8.f7022z;
                                        builder10.f5388b = r8.f6999B;
                                        builder10.f5389c = r8.f6998A;
                                        builder10.d = bArr;
                                        int i317 = r8.o;
                                        builder10.f5390e = i317;
                                        builder10.f = i317;
                                        colorInfoA = builder10.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i316;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format9 = new Format(builder);
                                TrackOutput trackOutputTrack9 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack9;
                                trackOutputTrack9.b(format9);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 7:
                                ParsableByteArray parsableByteArray3 = new ParsableByteArray(r8.a(r8.f7012b));
                                try {
                                    parsableByteArray3.H(16);
                                    long jL = parsableByteArray3.l();
                                    try {
                                        if (jL == 1482049860) {
                                            pair = new Pair("video/divx", null);
                                        } else if (jL != 859189832) {
                                            if (jL == 826496599) {
                                                int i51 = parsableByteArray3.f5668b + 20;
                                                byte[] bArr5 = parsableByteArray3.f5667a;
                                                while (true) {
                                                    if (i51 >= bArr5.length - 4) {
                                                        throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");
                                                    }
                                                    if (bArr5[i51] == 0) {
                                                        if (bArr5[i51 + 1] == 0 && bArr5[i51 + 2] == 1) {
                                                            if (bArr5[i51 + 3] == 15) {
                                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr5, i51, bArr5.length)));
                                                            }
                                                        }
                                                        i51++;
                                                    }
                                                    i51++;
                                                }
                                            } else {
                                                Log.g("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                str3 = null;
                                                pair = new Pair("video/x-unknown", null);
                                            }
                                            str7 = (String) pair.first;
                                            list2 = (List) pair.second;
                                            i5 = -1;
                                            list4 = list2;
                                            i6 = -1;
                                            list3 = list4;
                                            if (r8.O != null) {
                                                str3 = dolbyVisionConfigA.f6747a;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z14 = r8.W;
                                            if (r8.f7009V) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i318 = (z14 ? 1 : 0) | i7;
                                            builder = new Format.Builder();
                                            zH = MimeTypes.h(str7);
                                            Map map10 = MatroskaExtractor.j0;
                                            if (zH) {
                                                builder.f5434z = r8.f7005P;
                                                builder.f5418A = r8.f7007R;
                                                builder.f5419B = i6;
                                                i8 = 1;
                                            } else if (MimeTypes.k(str7)) {
                                                if (r8.r == 0) {
                                                    i13 = r8.f7019p;
                                                    i9 = -1;
                                                    if (i13 == -1) {
                                                        i13 = r8.m;
                                                    }
                                                    r8.f7019p = i13;
                                                    i14 = r8.q;
                                                    if (i14 == -1) {
                                                        i14 = r8.f7018n;
                                                    }
                                                    r8.q = i14;
                                                } else {
                                                    i9 = -1;
                                                }
                                                i10 = r8.f7019p;
                                                if (i10 != i9) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r8.y) {
                                                    if (r8.f7000E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    ColorInfo.Builder builder11 = new ColorInfo.Builder();
                                                    builder11.f5387a = r8.f7022z;
                                                    builder11.f5388b = r8.f6999B;
                                                    builder11.f5389c = r8.f6998A;
                                                    builder11.d = bArr;
                                                    int i319 = r8.o;
                                                    builder11.f5390e = i319;
                                                    builder11.f = i319;
                                                    colorInfoA = builder11.a();
                                                } else {
                                                    colorInfoA = null;
                                                }
                                                str4 = r8.f7011a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r8.s == 0) {
                                                    i11 = iIntValue;
                                                } else {
                                                    i11 = iIntValue;
                                                }
                                                builder.r = r8.m;
                                                builder.s = r8.f7018n;
                                                builder.v = f;
                                                builder.f5432u = i11;
                                                builder.f5433w = r8.f7021w;
                                                builder.x = r8.x;
                                                builder.y = colorInfoA;
                                                i8 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i8 = 3;
                                            }
                                            str5 = r8.f7011a;
                                            if (str5 != null) {
                                                builder.f5424b = r8.f7011a;
                                            }
                                            builder.f5423a = Integer.toString(i29);
                                            builder.f5429l = MimeTypes.l(str7);
                                            builder.m = i5;
                                            builder.d = r8.X;
                                            builder.f5426e = i318;
                                            builder.o = list3;
                                            builder.f5428i = str3;
                                            builder.f5431p = r8.f7017l;
                                            Format format10 = new Format(builder);
                                            TrackOutput trackOutputTrack10 = extractorOutput2.track(r8.f7013c, i8);
                                            r8.f7010Y = trackOutputTrack10;
                                            trackOutputTrack10.b(format10);
                                            sparseArray.put(r8.f7013c, r8);
                                            matroskaExtractor = matroskaExtractor2;
                                        } else {
                                            pair = new Pair("video/3gpp", null);
                                        }
                                        str3 = null;
                                        str7 = (String) pair.first;
                                        list2 = (List) pair.second;
                                        i5 = -1;
                                        list4 = list2;
                                        i6 = -1;
                                        list3 = list4;
                                        if (r8.O != null) {
                                            str3 = dolbyVisionConfigA.f6747a;
                                            str7 = "video/dolby-vision";
                                        }
                                        boolean z15 = r8.W;
                                        if (r8.f7009V) {
                                            i7 = 2;
                                        } else {
                                            i7 = 0;
                                        }
                                        int i3110 = (z15 ? 1 : 0) | i7;
                                        builder = new Format.Builder();
                                        zH = MimeTypes.h(str7);
                                        Map map11 = MatroskaExtractor.j0;
                                        if (zH) {
                                            builder.f5434z = r8.f7005P;
                                            builder.f5418A = r8.f7007R;
                                            builder.f5419B = i6;
                                            i8 = 1;
                                        } else if (MimeTypes.k(str7)) {
                                            if (r8.r == 0) {
                                                i13 = r8.f7019p;
                                                i9 = -1;
                                                if (i13 == -1) {
                                                    i13 = r8.m;
                                                }
                                                r8.f7019p = i13;
                                                i14 = r8.q;
                                                if (i14 == -1) {
                                                    i14 = r8.f7018n;
                                                }
                                                r8.q = i14;
                                            } else {
                                                i9 = -1;
                                            }
                                            i10 = r8.f7019p;
                                            if (i10 != i9) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (r8.y) {
                                                if (r8.f7000E != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                ColorInfo.Builder builder12 = new ColorInfo.Builder();
                                                builder12.f5387a = r8.f7022z;
                                                builder12.f5388b = r8.f6999B;
                                                builder12.f5389c = r8.f6998A;
                                                builder12.d = bArr;
                                                int i3111 = r8.o;
                                                builder12.f5390e = i3111;
                                                builder12.f = i3111;
                                                colorInfoA = builder12.a();
                                            } else {
                                                colorInfoA = null;
                                            }
                                            str4 = r8.f7011a;
                                            if (str4 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (r8.s == 0) {
                                                i11 = iIntValue;
                                            } else {
                                                i11 = iIntValue;
                                            }
                                            builder.r = r8.m;
                                            builder.s = r8.f7018n;
                                            builder.v = f;
                                            builder.f5432u = i11;
                                            builder.f5433w = r8.f7021w;
                                            builder.x = r8.x;
                                            builder.y = colorInfoA;
                                            i8 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str7)) {
                                            }
                                            i8 = 3;
                                        }
                                        str5 = r8.f7011a;
                                        if (str5 != null) {
                                            builder.f5424b = r8.f7011a;
                                        }
                                        builder.f5423a = Integer.toString(i29);
                                        builder.f5429l = MimeTypes.l(str7);
                                        builder.m = i5;
                                        builder.d = r8.X;
                                        builder.f5426e = i3110;
                                        builder.o = list3;
                                        builder.f5428i = str3;
                                        builder.f5431p = r8.f7017l;
                                        Format format11 = new Format(builder);
                                        TrackOutput trackOutputTrack11 = extractorOutput2.track(r8.f7013c, i8);
                                        r8.f7010Y = trackOutputTrack11;
                                        trackOutputTrack11.b(format11);
                                        sparseArray.put(r8.f7013c, r8);
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
                                System.arraycopy(r8.a(r12), 0, bArr6, 0, 4);
                                ImmutableList immutableListZ = ImmutableList.z(bArr6);
                                str7 = "application/dvbsubs";
                                listSingletonList = immutableListZ;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z16 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3112 = (z16 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map12 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder13 = new ColorInfo.Builder();
                                        builder13.f5387a = r8.f7022z;
                                        builder13.f5388b = r8.f6999B;
                                        builder13.f5389c = r8.f6998A;
                                        builder13.d = bArr;
                                        int i3113 = r8.o;
                                        builder13.f5390e = i3113;
                                        builder13.f = i3113;
                                        colorInfoA = builder13.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i3112;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format12 = new Format(builder);
                                TrackOutput trackOutputTrack12 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack12;
                                trackOutputTrack12.b(format12);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 10:
                                AvcConfig avcConfigA = AvcConfig.a(new ParsableByteArray(r8.a(r8.f7012b)));
                                r8.Z = avcConfigA.f6710b;
                                ArrayList arrayList2 = avcConfigA.f6709a;
                                str3 = avcConfigA.f6715l;
                                list2 = arrayList2;
                                str7 = "video/avc";
                                i5 = -1;
                                list4 = list2;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z17 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3114 = (z17 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map13 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder14 = new ColorInfo.Builder();
                                        builder14.f5387a = r8.f7022z;
                                        builder14.f5388b = r8.f6999B;
                                        builder14.f5389c = r8.f6998A;
                                        builder14.d = bArr;
                                        int i3115 = r8.o;
                                        builder14.f5390e = i3115;
                                        builder14.f = i3115;
                                        colorInfoA = builder14.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i3114;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format13 = new Format(builder);
                                TrackOutput trackOutputTrack13 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack13;
                                trackOutputTrack13.b(format13);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 11:
                                str7 = "application/vobsub";
                                listSingletonList = ImmutableList.z(r8.a(r12));
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z18 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3116 = (z18 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map14 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder15 = new ColorInfo.Builder();
                                        builder15.f5387a = r8.f7022z;
                                        builder15.f5388b = r8.f6999B;
                                        builder15.f5389c = r8.f6998A;
                                        builder15.d = bArr;
                                        int i3117 = r8.o;
                                        builder15.f5390e = i3117;
                                        builder15.f = i3117;
                                        colorInfoA = builder15.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i3116;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format14 = new Format(builder);
                                TrackOutput trackOutputTrack14 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack14;
                                trackOutputTrack14.b(format14);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 12:
                                str7 = "audio/vnd.dts.hd";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z19 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3118 = (z19 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map15 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder16 = new ColorInfo.Builder();
                                        builder16.f5387a = r8.f7022z;
                                        builder16.f5388b = r8.f6999B;
                                        builder16.f5389c = r8.f6998A;
                                        builder16.d = bArr;
                                        int i3119 = r8.o;
                                        builder16.f5390e = i3119;
                                        builder16.f = i3119;
                                        colorInfoA = builder16.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i3118;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format15 = new Format(builder);
                                TrackOutput trackOutputTrack15 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack15;
                                trackOutputTrack15.b(format15);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 13:
                                List listSingletonList2 = Collections.singletonList(r8.a(r12));
                                byte[] bArr7 = r8.k;
                                AacUtil.Config configB = AacUtil.b(new ParsableBitArray(bArr7, bArr7.length), false);
                                r8.f7007R = configB.f6698a;
                                r8.f7005P = configB.f6699b;
                                str7 = "audio/mp4a-latm";
                                str3 = configB.f6700c;
                                list2 = listSingletonList2;
                                i5 = -1;
                                list4 = list2;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z110 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31110 = (z110 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map16 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder17 = new ColorInfo.Builder();
                                        builder17.f5387a = r8.f7022z;
                                        builder17.f5388b = r8.f6999B;
                                        builder17.f5389c = r8.f6998A;
                                        builder17.d = bArr;
                                        int i31111 = r8.o;
                                        builder17.f5390e = i31111;
                                        builder17.f = i31111;
                                        colorInfoA = builder17.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31110;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format16 = new Format(builder);
                                TrackOutput trackOutputTrack16 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack16;
                                trackOutputTrack16.b(format16);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 14:
                                str7 = "audio/ac3";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z111 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31112 = (z111 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map17 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder18 = new ColorInfo.Builder();
                                        builder18.f5387a = r8.f7022z;
                                        builder18.f5388b = r8.f6999B;
                                        builder18.f5389c = r8.f6998A;
                                        builder18.d = bArr;
                                        int i31113 = r8.o;
                                        builder18.f5390e = i31113;
                                        builder18.f = i31113;
                                        colorInfoA = builder18.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31112;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format17 = new Format(builder);
                                TrackOutput trackOutputTrack17 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack17;
                                trackOutputTrack17.b(format17);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 15:
                            case 21:
                                str7 = "audio/vnd.dts";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z112 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31114 = (z112 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map18 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder19 = new ColorInfo.Builder();
                                        builder19.f5387a = r8.f7022z;
                                        builder19.f5388b = r8.f6999B;
                                        builder19.f5389c = r8.f6998A;
                                        builder19.d = bArr;
                                        int i31115 = r8.o;
                                        builder19.f5390e = i31115;
                                        builder19.f = i31115;
                                        colorInfoA = builder19.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31114;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format18 = new Format(builder);
                                TrackOutput trackOutputTrack18 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack18;
                                trackOutputTrack18.b(format18);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 16:
                                str7 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z113 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31116 = (z113 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map19 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder110 = new ColorInfo.Builder();
                                        builder110.f5387a = r8.f7022z;
                                        builder110.f5388b = r8.f6999B;
                                        builder110.f5389c = r8.f6998A;
                                        builder110.d = bArr;
                                        int i31117 = r8.o;
                                        builder110.f5390e = i31117;
                                        builder110.f = i31117;
                                        colorInfoA = builder110.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31116;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format19 = new Format(builder);
                                TrackOutput trackOutputTrack19 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack19;
                                trackOutputTrack19.b(format19);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 17:
                                str7 = "video/x-vnd.on2.vp8";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z114 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31118 = (z114 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map110 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder111 = new ColorInfo.Builder();
                                        builder111.f5387a = r8.f7022z;
                                        builder111.f5388b = r8.f6999B;
                                        builder111.f5389c = r8.f6998A;
                                        builder111.d = bArr;
                                        int i31119 = r8.o;
                                        builder111.f5390e = i31119;
                                        builder111.f = i31119;
                                        colorInfoA = builder111.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31118;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format110 = new Format(builder);
                                TrackOutput trackOutputTrack110 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack110;
                                trackOutputTrack110.b(format110);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 18:
                                str7 = "video/x-vnd.on2.vp9";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z115 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i311110 = (z115 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map111 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder112 = new ColorInfo.Builder();
                                        builder112.f5387a = r8.f7022z;
                                        builder112.f5388b = r8.f6999B;
                                        builder112.f5389c = r8.f6998A;
                                        builder112.d = bArr;
                                        int i311111 = r8.o;
                                        builder112.f5390e = i311111;
                                        builder112.f = i311111;
                                        colorInfoA = builder112.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i311110;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format111 = new Format(builder);
                                TrackOutput trackOutputTrack111 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack111;
                                trackOutputTrack111.b(format111);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 19:
                                str7 = "application/pgs";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z116 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i311112 = (z116 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map112 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder113 = new ColorInfo.Builder();
                                        builder113.f5387a = r8.f7022z;
                                        builder113.f5388b = r8.f6999B;
                                        builder113.f5389c = r8.f6998A;
                                        builder113.d = bArr;
                                        int i311113 = r8.o;
                                        builder113.f5390e = i311113;
                                        builder113.f = i311113;
                                        colorInfoA = builder113.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i311112;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format112 = new Format(builder);
                                TrackOutput trackOutputTrack112 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack112;
                                trackOutputTrack112.b(format112);
                                sparseArray.put(r8.f7013c, r8);
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
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z117 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i311114 = (z117 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map113 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder114 = new ColorInfo.Builder();
                                        builder114.f5387a = r8.f7022z;
                                        builder114.f5388b = r8.f6999B;
                                        builder114.f5389c = r8.f6998A;
                                        builder114.d = bArr;
                                        int i311115 = r8.o;
                                        builder114.f5390e = i311115;
                                        builder114.f = i311115;
                                        colorInfoA = builder114.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i311114;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format113 = new Format(builder);
                                TrackOutput trackOutputTrack113 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack113;
                                trackOutputTrack113.b(format113);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 22:
                                if (r8.f7006Q == 32) {
                                    str7 = "audio/raw";
                                    list3 = null;
                                    i5 = -1;
                                    str3 = null;
                                    i6 = 4;
                                } else {
                                    Log.g("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + r8.f7006Q + ". Setting mimeType to audio/x-unknown");
                                    str7 = "audio/x-unknown";
                                    listSingletonList = null;
                                    i5 = -1;
                                    list = listSingletonList;
                                    str3 = null;
                                    list4 = list;
                                    i6 = -1;
                                    list3 = list4;
                                }
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z118 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i311116 = (z118 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map114 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder115 = new ColorInfo.Builder();
                                        builder115.f5387a = r8.f7022z;
                                        builder115.f5388b = r8.f6999B;
                                        builder115.f5389c = r8.f6998A;
                                        builder115.d = bArr;
                                        int i311117 = r8.o;
                                        builder115.f5390e = i311117;
                                        builder115.f = i311117;
                                        colorInfoA = builder115.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i311116;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format114 = new Format(builder);
                                TrackOutput trackOutputTrack114 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack114;
                                trackOutputTrack114.b(format114);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 23:
                                int i52 = r8.f7006Q;
                                if (i52 == 8) {
                                    str7 = "audio/raw";
                                    list3 = null;
                                    i5 = -1;
                                    str3 = null;
                                    i6 = 3;
                                } else {
                                    if (i52 == 16) {
                                        i6 = 268435456;
                                    } else if (i52 == 24) {
                                        i6 = 1342177280;
                                    } else if (i52 == 32) {
                                        i6 = 1610612736;
                                    } else {
                                        Log.g("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + r8.f7006Q + ". Setting mimeType to audio/x-unknown");
                                        str7 = "audio/x-unknown";
                                        listSingletonList = null;
                                        i5 = -1;
                                        list = listSingletonList;
                                        str3 = null;
                                        list4 = list;
                                        i6 = -1;
                                        list3 = list4;
                                    }
                                    str7 = "audio/raw";
                                    list3 = null;
                                    i5 = -1;
                                    str3 = null;
                                }
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z119 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i311118 = (z119 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map115 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder116 = new ColorInfo.Builder();
                                        builder116.f5387a = r8.f7022z;
                                        builder116.f5388b = r8.f6999B;
                                        builder116.f5389c = r8.f6998A;
                                        builder116.d = bArr;
                                        int i311119 = r8.o;
                                        builder116.f5390e = i311119;
                                        builder116.f = i311119;
                                        colorInfoA = builder116.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i311118;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format115 = new Format(builder);
                                TrackOutput trackOutputTrack115 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack115;
                                trackOutputTrack115.b(format115);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 24:
                                iW = Util.w(r8.f7006Q);
                                if (iW == 0) {
                                    Log.g("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + r8.f7006Q + ". Setting mimeType to audio/x-unknown");
                                    str7 = "audio/x-unknown";
                                    listSingletonList = null;
                                    i5 = -1;
                                    list = listSingletonList;
                                    str3 = null;
                                    list4 = list;
                                    i6 = -1;
                                    list3 = list4;
                                    if (r8.O != null) {
                                        str3 = dolbyVisionConfigA.f6747a;
                                        str7 = "video/dolby-vision";
                                    }
                                    boolean z1110 = r8.W;
                                    if (r8.f7009V) {
                                        i7 = 2;
                                    } else {
                                        i7 = 0;
                                    }
                                    int i3111110 = (z1110 ? 1 : 0) | i7;
                                    builder = new Format.Builder();
                                    zH = MimeTypes.h(str7);
                                    Map map116 = MatroskaExtractor.j0;
                                    if (zH) {
                                        builder.f5434z = r8.f7005P;
                                        builder.f5418A = r8.f7007R;
                                        builder.f5419B = i6;
                                        i8 = 1;
                                    } else if (MimeTypes.k(str7)) {
                                        if (r8.r == 0) {
                                            i13 = r8.f7019p;
                                            i9 = -1;
                                            if (i13 == -1) {
                                                i13 = r8.m;
                                            }
                                            r8.f7019p = i13;
                                            i14 = r8.q;
                                            if (i14 == -1) {
                                                i14 = r8.f7018n;
                                            }
                                            r8.q = i14;
                                        } else {
                                            i9 = -1;
                                        }
                                        i10 = r8.f7019p;
                                        if (i10 != i9) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (r8.y) {
                                            if (r8.f7000E != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            ColorInfo.Builder builder117 = new ColorInfo.Builder();
                                            builder117.f5387a = r8.f7022z;
                                            builder117.f5388b = r8.f6999B;
                                            builder117.f5389c = r8.f6998A;
                                            builder117.d = bArr;
                                            int i3111111 = r8.o;
                                            builder117.f5390e = i3111111;
                                            builder117.f = i3111111;
                                            colorInfoA = builder117.a();
                                        } else {
                                            colorInfoA = null;
                                        }
                                        str4 = r8.f7011a;
                                        if (str4 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (r8.s == 0) {
                                            i11 = iIntValue;
                                        } else {
                                            i11 = iIntValue;
                                        }
                                        builder.r = r8.m;
                                        builder.s = r8.f7018n;
                                        builder.v = f;
                                        builder.f5432u = i11;
                                        builder.f5433w = r8.f7021w;
                                        builder.x = r8.x;
                                        builder.y = colorInfoA;
                                        i8 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str7)) {
                                        }
                                        i8 = 3;
                                    }
                                    str5 = r8.f7011a;
                                    if (str5 != null) {
                                        builder.f5424b = r8.f7011a;
                                    }
                                    builder.f5423a = Integer.toString(i29);
                                    builder.f5429l = MimeTypes.l(str7);
                                    builder.m = i5;
                                    builder.d = r8.X;
                                    builder.f5426e = i3111110;
                                    builder.o = list3;
                                    builder.f5428i = str3;
                                    builder.f5431p = r8.f7017l;
                                    Format format116 = new Format(builder);
                                    TrackOutput trackOutputTrack116 = extractorOutput2.track(r8.f7013c, i8);
                                    r8.f7010Y = trackOutputTrack116;
                                    trackOutputTrack116.b(format116);
                                    sparseArray.put(r8.f7013c, r8);
                                    matroskaExtractor = matroskaExtractor2;
                                }
                                i6 = iW;
                                str7 = "audio/raw";
                                list3 = null;
                                i5 = -1;
                                str3 = null;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z1111 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3111112 = (z1111 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map117 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder118 = new ColorInfo.Builder();
                                        builder118.f5387a = r8.f7022z;
                                        builder118.f5388b = r8.f6999B;
                                        builder118.f5389c = r8.f6998A;
                                        builder118.d = bArr;
                                        int i3111113 = r8.o;
                                        builder118.f5390e = i3111113;
                                        builder118.f = i3111113;
                                        colorInfoA = builder118.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i3111112;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format117 = new Format(builder);
                                TrackOutput trackOutputTrack117 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack117;
                                trackOutputTrack117.b(format117);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 25:
                                str7 = "text/x-ssa";
                                listSingletonList = ImmutableList.A(MatroskaExtractor.f0, r8.a(r12));
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z1112 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3111114 = (z1112 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map118 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder119 = new ColorInfo.Builder();
                                        builder119.f5387a = r8.f7022z;
                                        builder119.f5388b = r8.f6999B;
                                        builder119.f5389c = r8.f6998A;
                                        builder119.d = bArr;
                                        int i3111115 = r8.o;
                                        builder119.f5390e = i3111115;
                                        builder119.f = i3111115;
                                        colorInfoA = builder119.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i3111114;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format118 = new Format(builder);
                                TrackOutput trackOutputTrack118 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack118;
                                trackOutputTrack118.b(format118);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 26:
                                HevcConfig hevcConfigA = HevcConfig.a(new ParsableByteArray(r8.a(r8.f7012b)));
                                r8.Z = hevcConfigA.f6776b;
                                str7 = "video/hevc";
                                List list5 = hevcConfigA.f6775a;
                                str3 = hevcConfigA.j;
                                list2 = list5;
                                i5 = -1;
                                list4 = list2;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z1113 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3111116 = (z1113 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map119 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder1110 = new ColorInfo.Builder();
                                        builder1110.f5387a = r8.f7022z;
                                        builder1110.f5388b = r8.f6999B;
                                        builder1110.f5389c = r8.f6998A;
                                        builder1110.d = bArr;
                                        int i3111117 = r8.o;
                                        builder1110.f5390e = i3111117;
                                        builder1110.f = i3111117;
                                        colorInfoA = builder1110.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i3111116;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format119 = new Format(builder);
                                TrackOutput trackOutputTrack119 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack119;
                                trackOutputTrack119.b(format119);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 27:
                                str7 = "text/vtt";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z1114 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i3111118 = (z1114 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map1110 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder1111 = new ColorInfo.Builder();
                                        builder1111.f5387a = r8.f7022z;
                                        builder1111.f5388b = r8.f6999B;
                                        builder1111.f5389c = r8.f6998A;
                                        builder1111.d = bArr;
                                        int i3111119 = r8.o;
                                        builder1111.f5390e = i3111119;
                                        builder1111.f = i3111119;
                                        colorInfoA = builder1111.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i3111118;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format1110 = new Format(builder);
                                TrackOutput trackOutputTrack1110 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack1110;
                                trackOutputTrack1110.b(format1110);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 28:
                                str7 = "application/x-subrip";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z1115 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31111110 = (z1115 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map1111 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder1112 = new ColorInfo.Builder();
                                        builder1112.f5387a = r8.f7022z;
                                        builder1112.f5388b = r8.f6999B;
                                        builder1112.f5389c = r8.f6998A;
                                        builder1112.d = bArr;
                                        int i31111111 = r8.o;
                                        builder1112.f5390e = i31111111;
                                        builder1112.f = i31111111;
                                        colorInfoA = builder1112.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31111110;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format1111 = new Format(builder);
                                TrackOutput trackOutputTrack1111 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack1111;
                                trackOutputTrack1111.b(format1111);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 29:
                                str7 = "video/mpeg2";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z1116 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31111112 = (z1116 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map1112 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder1113 = new ColorInfo.Builder();
                                        builder1113.f5387a = r8.f7022z;
                                        builder1113.f5388b = r8.f6999B;
                                        builder1113.f5389c = r8.f6998A;
                                        builder1113.d = bArr;
                                        int i31111113 = r8.o;
                                        builder1113.f5390e = i31111113;
                                        builder1113.f = i31111113;
                                        colorInfoA = builder1113.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31111112;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format1112 = new Format(builder);
                                TrackOutput trackOutputTrack1112 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack1112;
                                trackOutputTrack1112.b(format1112);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 30:
                                str7 = "audio/eac3";
                                listSingletonList = null;
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z1117 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31111114 = (z1117 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map1113 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder1114 = new ColorInfo.Builder();
                                        builder1114.f5387a = r8.f7022z;
                                        builder1114.f5388b = r8.f6999B;
                                        builder1114.f5389c = r8.f6998A;
                                        builder1114.d = bArr;
                                        int i31111115 = r8.o;
                                        builder1114.f5390e = i31111115;
                                        builder1114.f = i31111115;
                                        colorInfoA = builder1114.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31111114;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format1113 = new Format(builder);
                                TrackOutput trackOutputTrack1113 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack1113;
                                trackOutputTrack1113.b(format1113);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 31:
                                str7 = "audio/flac";
                                listSingletonList = Collections.singletonList(r8.a(r12));
                                i5 = -1;
                                list = listSingletonList;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z1118 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31111116 = (z1118 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map1114 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder1115 = new ColorInfo.Builder();
                                        builder1115.f5387a = r8.f7022z;
                                        builder1115.f5388b = r8.f6999B;
                                        builder1115.f5389c = r8.f6998A;
                                        builder1115.d = bArr;
                                        int i31111117 = r8.o;
                                        builder1115.f5390e = i31111117;
                                        builder1115.f = i31111117;
                                        colorInfoA = builder1115.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31111116;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format1114 = new Format(builder);
                                TrackOutput trackOutputTrack1114 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack1114;
                                trackOutputTrack1114.b(format1114);
                                sparseArray.put(r8.f7013c, r8);
                                matroskaExtractor = matroskaExtractor2;
                                break;
                            case 32:
                                ArrayList arrayList3 = new ArrayList(3);
                                arrayList3.add(r8.a(r8.f7012b));
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(r8.S).array());
                                arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r8.T).array());
                                str7 = "audio/opus";
                                i5 = 5760;
                                list = arrayList3;
                                str3 = null;
                                list4 = list;
                                i6 = -1;
                                list3 = list4;
                                if (r8.O != null) {
                                    str3 = dolbyVisionConfigA.f6747a;
                                    str7 = "video/dolby-vision";
                                }
                                boolean z1119 = r8.W;
                                if (r8.f7009V) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i31111118 = (z1119 ? 1 : 0) | i7;
                                builder = new Format.Builder();
                                zH = MimeTypes.h(str7);
                                Map map1115 = MatroskaExtractor.j0;
                                if (zH) {
                                    builder.f5434z = r8.f7005P;
                                    builder.f5418A = r8.f7007R;
                                    builder.f5419B = i6;
                                    i8 = 1;
                                } else if (MimeTypes.k(str7)) {
                                    if (r8.r == 0) {
                                        i13 = r8.f7019p;
                                        i9 = -1;
                                        if (i13 == -1) {
                                            i13 = r8.m;
                                        }
                                        r8.f7019p = i13;
                                        i14 = r8.q;
                                        if (i14 == -1) {
                                            i14 = r8.f7018n;
                                        }
                                        r8.q = i14;
                                    } else {
                                        i9 = -1;
                                    }
                                    i10 = r8.f7019p;
                                    if (i10 != i9) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r8.y) {
                                        if (r8.f7000E != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        ColorInfo.Builder builder1116 = new ColorInfo.Builder();
                                        builder1116.f5387a = r8.f7022z;
                                        builder1116.f5388b = r8.f6999B;
                                        builder1116.f5389c = r8.f6998A;
                                        builder1116.d = bArr;
                                        int i31111119 = r8.o;
                                        builder1116.f5390e = i31111119;
                                        builder1116.f = i31111119;
                                        colorInfoA = builder1116.a();
                                    } else {
                                        colorInfoA = null;
                                    }
                                    str4 = r8.f7011a;
                                    if (str4 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (r8.s == 0) {
                                        i11 = iIntValue;
                                    } else {
                                        i11 = iIntValue;
                                    }
                                    builder.r = r8.m;
                                    builder.s = r8.f7018n;
                                    builder.v = f;
                                    builder.f5432u = i11;
                                    builder.f5433w = r8.f7021w;
                                    builder.x = r8.x;
                                    builder.y = colorInfoA;
                                    i8 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str7)) {
                                    }
                                    i8 = 3;
                                }
                                str5 = r8.f7011a;
                                if (str5 != null) {
                                    builder.f5424b = r8.f7011a;
                                }
                                builder.f5423a = Integer.toString(i29);
                                builder.f5429l = MimeTypes.l(str7);
                                builder.m = i5;
                                builder.d = r8.X;
                                builder.f5426e = i31111118;
                                builder.o = list3;
                                builder.f5428i = str3;
                                builder.f5431p = r8.f7017l;
                                Format format1115 = new Format(builder);
                                TrackOutput trackOutputTrack1115 = extractorOutput2.track(r8.f7013c, i8);
                                r8.f7010Y = trackOutputTrack1115;
                                trackOutputTrack1115.b(format1115);
                                sparseArray.put(r8.f7013c, r8);
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
                matroskaExtractor.f6995w = null;
                return true;
            }
            boolean z20 = true;
            boolean z21 = false;
            ?? r0 = 0;
            int i53 = this.f6966e;
            VarintReader varintReader = this.f6965c;
            if (i53 == 0) {
                int i54 = 4;
                long jC = varintReader.c(defaultExtractorInput, true, false, 4);
                if (jC == -2) {
                    defaultExtractorInput.f = 0;
                    ?? r5 = r4;
                    while (true) {
                        byte[] bArr8 = this.f6963a;
                        defaultExtractorInput.peekFully(bArr8, r0, i54, r0);
                        iB = VarintReader.b(bArr8[r0]);
                        if (iB == -1 || iB > i54) {
                            str = str6;
                            r16 = r5;
                        } else {
                            str = str6;
                            r17 = r5;
                            iA = (int) VarintReader.a(bArr8, iB, r0);
                            MatroskaExtractor.this.getClass();
                            if (iA != 357149030 && iA != 524531317 && iA != 475249515) {
                                if (iA == 374648427) {
                                    r16 = r17;
                                }
                            }
                        }
                        r16 = r17;
                        defaultExtractorInput.skipFully(1);
                        str6 = str;
                        r5 = r16;
                        r0 = 0;
                        i54 = 4;
                    }
                    defaultExtractorInput.skipFully(iB);
                    j = iA;
                    r15 = r17;
                } else {
                    str = str6;
                    r15 = r4;
                    j = jC;
                }
                z20 = true;
                if (j == -1) {
                    return false;
                }
                z21 = false;
                this.f = (int) j;
                this.f6966e = 1;
                r14 = r15;
            } else {
                str = str6;
                r14 = r4;
            }
            if (this.f6966e == z20) {
                this.g = varintReader.c(defaultExtractorInput, z21, z20, 8);
                this.f6966e = 2;
            }
            EbmlProcessor ebmlProcessor2 = this.d;
            int i55 = this.f;
            MatroskaExtractor.this.getClass();
            switch (i55) {
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
                case 21938:
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
                    arrayDeque.push(new MasterElement(this.f, this.g + j6));
                    EbmlProcessor ebmlProcessor3 = this.d;
                    int i56 = this.f;
                    long j7 = this.g;
                    MatroskaExtractor matroskaExtractor3 = MatroskaExtractor.this;
                    Assertions.f(matroskaExtractor3.f6987d0);
                    if (i56 != 160) {
                        if (i56 == 174) {
                            MatroskaExtractor.Track track4 = new MatroskaExtractor.Track();
                            track4.m = -1;
                            track4.f7018n = -1;
                            track4.o = -1;
                            track4.f7019p = -1;
                            track4.q = -1;
                            track4.r = 0;
                            track4.s = -1;
                            track4.t = 0.0f;
                            track4.f7020u = 0.0f;
                            track4.v = 0.0f;
                            track4.f7021w = null;
                            track4.x = -1;
                            track4.y = false;
                            track4.f7022z = -1;
                            track4.f6998A = -1;
                            track4.f6999B = -1;
                            track4.C = 1000;
                            track4.D = 200;
                            track4.f7000E = -1.0f;
                            track4.f7001F = -1.0f;
                            track4.G = -1.0f;
                            track4.H = -1.0f;
                            track4.f7002I = -1.0f;
                            track4.f7003J = -1.0f;
                            track4.K = -1.0f;
                            track4.L = -1.0f;
                            track4.M = -1.0f;
                            track4.f7004N = -1.0f;
                            z2 = true;
                            track4.f7005P = 1;
                            track4.f7006Q = -1;
                            track4.f7007R = 8000;
                            track4.S = 0L;
                            track4.T = 0L;
                            track4.W = true;
                            track4.X = "eng";
                            matroskaExtractor3.f6995w = track4;
                        } else if (i56 != 187) {
                            if (i56 != 19899) {
                                if (i56 == 20533) {
                                    z3 = true;
                                    matroskaExtractor3.g(i56);
                                    matroskaExtractor3.f6995w.f7015h = true;
                                } else if (i56 == 21968) {
                                    matroskaExtractor3.g(i56);
                                    z3 = true;
                                    matroskaExtractor3.f6995w.y = true;
                                } else if (i56 == 408125543) {
                                    long j8 = matroskaExtractor3.s;
                                    if (j8 != -1 && j8 != j6) {
                                        throw ParserException.a(null, "Multiple Segment elements not supported");
                                    }
                                    matroskaExtractor3.s = j6;
                                    matroskaExtractor3.r = j7;
                                } else if (i56 == 475249515) {
                                    matroskaExtractor3.f6971E = new LongArray();
                                    matroskaExtractor3.f6972F = new LongArray();
                                } else if (i56 == 524531317 && !matroskaExtractor3.x) {
                                    if (!matroskaExtractor3.d || matroskaExtractor3.f6970B == -1) {
                                        z3 = true;
                                        matroskaExtractor3.f6987d0.e(new SeekMap.Unseekable(matroskaExtractor3.v));
                                        matroskaExtractor3.x = true;
                                    } else {
                                        z3 = true;
                                        matroskaExtractor3.f6969A = true;
                                    }
                                }
                                z2 = z3;
                            } else {
                                matroskaExtractor3.y = -1;
                                matroskaExtractor3.f6996z = -1L;
                            }
                            z2 = true;
                        } else {
                            matroskaExtractor3.G = false;
                            i3 = 0;
                            z2 = true;
                        }
                        i3 = 0;
                    } else {
                        z2 = true;
                        i3 = 0;
                        matroskaExtractor3.S = false;
                        matroskaExtractor3.T = 0L;
                    }
                    this.f6966e = i3;
                    return z2;
                }
                if (i2 == 2) {
                    long j9 = this.g;
                    if (j9 <= 8) {
                        ((MatroskaExtractor.InnerEbmlProcessor) this.d).b(this.f, b(defaultExtractorInput, (int) j9));
                        this.f6966e = 0;
                        return true;
                    }
                    throw ParserException.a(null, "Invalid integer size: " + this.g);
                }
                if (i2 == 3) {
                    long j10 = this.g;
                    if (j10 > 2147483647L) {
                        throw ParserException.a(null, "String element size: " + this.g);
                    }
                    EbmlProcessor ebmlProcessor4 = this.d;
                    int i57 = this.f;
                    int i58 = (int) j10;
                    if (i58 == 0) {
                        str2 = "";
                    } else {
                        byte[] bArr9 = new byte[i58];
                        defaultExtractorInput.readFully(bArr9, 0, i58, false);
                        while (i58 > 0 && bArr9[i58 - 1] == 0) {
                            i58--;
                        }
                        str2 = new String(bArr9, 0, i58);
                    }
                    MatroskaExtractor matroskaExtractor4 = MatroskaExtractor.this;
                    matroskaExtractor4.getClass();
                    if (i57 == 134) {
                        matroskaExtractor4.g(i57);
                        matroskaExtractor4.f6995w.f7012b = str2;
                    } else if (i57 != 17026) {
                        if (i57 == 21358) {
                            matroskaExtractor4.g(i57);
                            matroskaExtractor4.f6995w.f7011a = str2;
                        } else if (i57 == 2274716) {
                            matroskaExtractor4.g(i57);
                            matroskaExtractor4.f6995w.X = str2;
                        }
                    } else if (!"webm".equals(str2) && !"matroska".equals(str2)) {
                        throw ParserException.a(null, "DocType " + str2 + " not supported");
                    }
                    this.f6966e = 0;
                    return true;
                }
                if (i2 == 4) {
                    ((MatroskaExtractor.InnerEbmlProcessor) this.d).a(this.f, (int) this.g, defaultExtractorInput);
                    this.f6966e = 0;
                    return true;
                }
                if (i2 != 5) {
                    throw ParserException.a(null, "Invalid element type " + i2);
                }
                long j11 = this.g;
                if (j11 != 4 && j11 != 8) {
                    throw ParserException.a(null, "Invalid float size: " + this.g);
                }
                EbmlProcessor ebmlProcessor5 = this.d;
                int i59 = this.f;
                int i60 = (int) j11;
                long jB = b(defaultExtractorInput, i60);
                double dIntBitsToFloat = i60 == 4 ? Float.intBitsToFloat((int) jB) : Double.longBitsToDouble(jB);
                MatroskaExtractor matroskaExtractor5 = MatroskaExtractor.this;
                if (i59 == 181) {
                    matroskaExtractor5.g(i59);
                    matroskaExtractor5.f6995w.f7007R = (int) dIntBitsToFloat;
                } else if (i59 != 17545) {
                    switch (i59) {
                        case 21969:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.f7000E = (float) dIntBitsToFloat;
                            break;
                        case 21970:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.f7001F = (float) dIntBitsToFloat;
                            break;
                        case 21971:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.G = (float) dIntBitsToFloat;
                            break;
                        case 21972:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.H = (float) dIntBitsToFloat;
                            break;
                        case 21973:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.f7002I = (float) dIntBitsToFloat;
                            break;
                        case 21974:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.f7003J = (float) dIntBitsToFloat;
                            break;
                        case 21975:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.K = (float) dIntBitsToFloat;
                            break;
                        case 21976:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.L = (float) dIntBitsToFloat;
                            break;
                        case 21977:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.M = (float) dIntBitsToFloat;
                            break;
                        case 21978:
                            matroskaExtractor5.g(i59);
                            matroskaExtractor5.f6995w.f7004N = (float) dIntBitsToFloat;
                            break;
                        default:
                            switch (i59) {
                                case 30323:
                                    matroskaExtractor5.g(i59);
                                    matroskaExtractor5.f6995w.t = (float) dIntBitsToFloat;
                                    break;
                                case 30324:
                                    matroskaExtractor5.g(i59);
                                    matroskaExtractor5.f6995w.f7020u = (float) dIntBitsToFloat;
                                    break;
                                case 30325:
                                    matroskaExtractor5.g(i59);
                                    matroskaExtractor5.f6995w.v = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    matroskaExtractor5.getClass();
                                    break;
                            }
                            break;
                    }
                } else {
                    matroskaExtractor5.f6994u = (long) dIntBitsToFloat;
                }
                this.f6966e = 0;
                return true;
            }
            defaultExtractorInput.skipFully((int) this.g);
            this.f6966e = 0;
            c2 = 2;
            defaultEbmlReader = this;
            str6 = str;
            r4 = r14;
        }
    }

    public final long b(DefaultExtractorInput defaultExtractorInput, int i2) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f6963a;
        defaultExtractorInput.readFully(bArr, 0, i2, false);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j = (j << 8) | ((long) (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return j;
    }
}
