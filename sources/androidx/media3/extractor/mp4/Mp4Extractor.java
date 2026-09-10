package androidx.media3.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.Id3Util;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4Extractor implements Extractor, SeekMap {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f7110B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MotionPhotoMetadata f7111A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubtitleParser.Factory f7112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7114c;
    public final ParsableByteArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ParsableByteArray f7115e;
    public final ParsableByteArray f;
    public final ArrayDeque g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SefReader f7116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f7117i;
    public ImmutableList j = ImmutableList.x();
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7118l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7119n;
    public ParsableByteArray o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7120p;
    public int q;
    public int r;
    public int s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ExtractorOutput f7121u;
    public Mp4Track[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long[][] f7122w;
    public int x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7123z;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class Mp4Track {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Track f7124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackSampleTable f7125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TrackOutput f7126c;
        public final TrueHdSampleRechunker d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7127e;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.f7124a = track;
            this.f7125b = trackSampleTable;
            this.f7126c = trackOutput;
            this.d = "audio/true-hd".equals(track.f.m) ? new TrueHdSampleRechunker() : null;
        }
    }

    public Mp4Extractor(SubtitleParser.Factory factory, int i2) {
        this.f7112a = factory;
        this.f7113b = i2;
        this.k = (i2 & 4) != 0 ? 3 : 0;
        this.f7116h = new SefReader();
        this.f7117i = new ArrayList();
        this.f = new ParsableByteArray(16);
        this.g = new ArrayDeque();
        this.f7114c = new ParsableByteArray(NalUnitUtil.f5695a);
        this.d = new ParsableByteArray(4);
        this.f7115e = new ParsableByteArray();
        this.f7120p = -1;
        this.f7121u = ExtractorOutput.M8;
        this.v = new Mp4Track[0];
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        SniffFailure sniffFailureB = Sniffer.b(extractorInput, false, (this.f7113b & 2) != 0);
        this.j = sniffFailureB != null ? ImmutableList.z(sniffFailureB) : ImmutableList.x();
        return sniffFailureB == null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        if ((this.f7113b & 16) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.f7112a);
        }
        this.f7121u = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final List e() {
        return this.j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        ArrayDeque arrayDeque;
        ParsableByteArray parsableByteArray;
        Atom.ContainerAtom containerAtom;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        char c2;
        boolean z2;
        int i6 = 3;
        int i7 = 2;
        int i8 = 4;
        while (true) {
            boolean z3 = true;
            while (true) {
                int i9 = this.k;
                arrayDeque = this.g;
                parsableByteArray = this.f7115e;
                if (i9 != 0) {
                    if (i9 != z3) {
                        if (i9 == i7) {
                            int i10 = i8;
                            long position = extractorInput.getPosition();
                            if (this.f7120p == -1) {
                                int i11 = 0;
                                int i12 = -1;
                                int i13 = -1;
                                boolean z4 = true;
                                boolean z5 = true;
                                long j = Long.MAX_VALUE;
                                long j2 = Long.MAX_VALUE;
                                long j3 = Long.MAX_VALUE;
                                while (true) {
                                    Mp4Track[] mp4TrackArr = this.v;
                                    if (i11 >= mp4TrackArr.length) {
                                        break;
                                    }
                                    Mp4Track mp4Track = mp4TrackArr[i11];
                                    int i14 = mp4Track.f7127e;
                                    TrackSampleTable trackSampleTable = mp4Track.f7125b;
                                    if (i14 != trackSampleTable.f7159b) {
                                        long j4 = trackSampleTable.f7160c[i14];
                                        long[][] jArr = this.f7122w;
                                        int i15 = Util.f5683a;
                                        long j5 = jArr[i11][i14];
                                        long j6 = j4 - position;
                                        boolean z6 = j6 < 0 || j6 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                        if ((!z6 && z5) || (z6 == z5 && j6 < j3)) {
                                            z5 = z6;
                                            i13 = i11;
                                            j3 = j6;
                                            j2 = j5;
                                        }
                                        if (j5 < j) {
                                            z4 = z6;
                                            i12 = i11;
                                            j = j5;
                                        }
                                    }
                                    i11++;
                                }
                                if (j == Long.MAX_VALUE || !z4 || j2 < j + 10485760) {
                                    i12 = i13;
                                }
                                this.f7120p = i12;
                                if (i12 == -1) {
                                    return -1;
                                }
                            }
                            Mp4Track mp4Track2 = this.v[this.f7120p];
                            TrackOutput trackOutput = mp4Track2.f7126c;
                            int i16 = mp4Track2.f7127e;
                            TrackSampleTable trackSampleTable2 = mp4Track2.f7125b;
                            long j7 = trackSampleTable2.f7160c[i16];
                            int i17 = trackSampleTable2.d[i16];
                            long j8 = (j7 - position) + ((long) this.q);
                            if (j8 < 0 || j8 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                                positionHolder.f6793a = j7;
                                return 1;
                            }
                            Track track = mp4Track2.f7124a;
                            if (track.g == 1) {
                                j8 += 8;
                                i17 -= 8;
                            }
                            extractorInput.skipFully((int) j8);
                            int i18 = track.j;
                            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track2.d;
                            if (i18 == 0) {
                                if ("audio/ac4".equals(track.f.m)) {
                                    if (this.r == 0) {
                                        Ac4Util.a(i17, parsableByteArray);
                                        i3 = 7;
                                        trackOutput.e(7, parsableByteArray);
                                        this.r += 7;
                                    } else {
                                        i3 = 7;
                                    }
                                    i17 += i3;
                                } else if (trueHdSampleRechunker != null) {
                                    trueHdSampleRechunker.c(extractorInput);
                                }
                                while (true) {
                                    int i19 = this.r;
                                    if (i19 >= i17) {
                                        break;
                                    }
                                    int iC = trackOutput.c(extractorInput, i17 - i19, false);
                                    this.q += iC;
                                    this.r += iC;
                                    this.s -= iC;
                                }
                            } else {
                                ParsableByteArray parsableByteArray2 = this.d;
                                byte[] bArr = parsableByteArray2.f5667a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i20 = 4 - i18;
                                while (this.r < i17) {
                                    int i21 = this.s;
                                    if (i21 == 0) {
                                        extractorInput.readFully(bArr, i20, i18);
                                        this.q += i18;
                                        parsableByteArray2.G(0);
                                        int iG = parsableByteArray2.g();
                                        if (iG < 0) {
                                            throw ParserException.a(null, "Invalid NAL length");
                                        }
                                        this.s = iG;
                                        ParsableByteArray parsableByteArray3 = this.f7114c;
                                        parsableByteArray3.G(0);
                                        int i22 = i10;
                                        trackOutput.e(i22, parsableByteArray3);
                                        this.r += i22;
                                        i17 += i20;
                                    } else {
                                        int iC2 = trackOutput.c(extractorInput, i21, false);
                                        this.q += iC2;
                                        this.r += iC2;
                                        this.s -= iC2;
                                    }
                                    i10 = 4;
                                }
                            }
                            int i23 = i17;
                            long j9 = trackSampleTable2.f[i16];
                            int i24 = trackSampleTable2.g[i16];
                            if (trueHdSampleRechunker != null) {
                                trueHdSampleRechunker.b(trackOutput, j9, i24, i23, 0, null);
                                if (i16 + 1 == trackSampleTable2.f7159b) {
                                    trueHdSampleRechunker.a(trackOutput, null);
                                }
                            } else {
                                trackOutput.f(j9, i24, i23, 0, null);
                            }
                            mp4Track2.f7127e++;
                            this.f7120p = -1;
                            this.q = 0;
                            this.r = 0;
                            this.s = 0;
                            return 0;
                        }
                        if (i9 != i6) {
                            throw new IllegalStateException();
                        }
                        ArrayList arrayList2 = this.f7117i;
                        SefReader sefReader = this.f7116h;
                        int i25 = sefReader.f7134b;
                        if (i25 != 0) {
                            if (i25 != z3) {
                                ArrayList arrayList3 = sefReader.f7133a;
                                int i26 = 8;
                                short s = 2816;
                                char c3 = 2819;
                                short s2 = 2192;
                                if (i25 == i7) {
                                    ArrayList arrayList4 = arrayList3;
                                    long length = extractorInput.getLength();
                                    int i27 = sefReader.f7135c - 20;
                                    ParsableByteArray parsableByteArray4 = new ParsableByteArray(i27);
                                    extractorInput.readFully(parsableByteArray4.f5667a, 0, i27);
                                    int i28 = 0;
                                    while (i28 < i27 / 12) {
                                        parsableByteArray4.H(2);
                                        short sK = parsableByteArray4.k();
                                        if (sK != s2 && sK != s && sK != 2817) {
                                            if (sK != 2819 && sK != 2820) {
                                                parsableByteArray4.H(i26);
                                                arrayList = arrayList4;
                                            }
                                            i28++;
                                            arrayList4 = arrayList;
                                            s2 = 2192;
                                            s = 2816;
                                            i26 = 8;
                                        }
                                        arrayList = arrayList4;
                                        arrayList.add(new SefReader.DataReference((length - ((long) sefReader.f7135c)) - ((long) parsableByteArray4.i()), parsableByteArray4.i()));
                                        i28++;
                                        arrayList4 = arrayList;
                                        s2 = 2192;
                                        s = 2816;
                                        i26 = 8;
                                    }
                                    ArrayList arrayList5 = arrayList4;
                                    if (arrayList5.isEmpty()) {
                                        positionHolder.f6793a = 0L;
                                    } else {
                                        sefReader.f7134b = 3;
                                        positionHolder.f6793a = ((SefReader.DataReference) arrayList5.get(0)).f7136a;
                                    }
                                } else {
                                    if (i25 != i6) {
                                        throw new IllegalStateException();
                                    }
                                    long position2 = extractorInput.getPosition();
                                    int length2 = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - ((long) sefReader.f7135c));
                                    ParsableByteArray parsableByteArray5 = new ParsableByteArray(length2);
                                    extractorInput.readFully(parsableByteArray5.f5667a, 0, length2);
                                    int i29 = 0;
                                    while (i29 < arrayList3.size()) {
                                        SefReader.DataReference dataReference = (SefReader.DataReference) arrayList3.get(i29);
                                        ArrayList arrayList6 = arrayList3;
                                        parsableByteArray5.G((int) (dataReference.f7136a - position2));
                                        parsableByteArray5.H(i8);
                                        int i30 = parsableByteArray5.i();
                                        Charset charset = Charsets.f19705c;
                                        String strS = parsableByteArray5.s(i30, charset);
                                        int i31 = i8;
                                        switch (strS.hashCode()) {
                                            case -1711564334:
                                                if (strS.equals("SlowMotion_Data")) {
                                                    i5 = 0;
                                                } else {
                                                    i5 = -1;
                                                }
                                                break;
                                            case -1332107749:
                                                if (strS.equals("Super_SlowMotion_Edit_Data")) {
                                                    i5 = 1;
                                                } else {
                                                    i5 = -1;
                                                }
                                                break;
                                            case -1251387154:
                                                if (strS.equals("Super_SlowMotion_Data")) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = -1;
                                                }
                                                break;
                                            case -830665521:
                                                if (strS.equals("Super_SlowMotion_Deflickering_On")) {
                                                    i5 = 3;
                                                } else {
                                                    i5 = -1;
                                                }
                                                break;
                                            case 1760745220:
                                                if (strS.equals("Super_SlowMotion_BGM")) {
                                                    i5 = i31;
                                                } else {
                                                    i5 = -1;
                                                }
                                                break;
                                            default:
                                                i5 = -1;
                                                break;
                                        }
                                        switch (i5) {
                                            case 0:
                                                c2 = 2192;
                                                break;
                                            case 1:
                                                c2 = c3;
                                                break;
                                            case 2:
                                                c2 = 2816;
                                                break;
                                            case 3:
                                                c2 = 2820;
                                                break;
                                            case 4:
                                                c2 = 2817;
                                                break;
                                            default:
                                                throw ParserException.a(null, "Invalid SEF name");
                                        }
                                        int i32 = dataReference.f7137b - (i30 + 8);
                                        if (c2 == 2192) {
                                            ArrayList arrayList7 = new ArrayList();
                                            List listC = SefReader.f7132e.c(parsableByteArray5.s(i32, charset));
                                            for (int i33 = 0; i33 < listC.size(); i33++) {
                                                List listC2 = SefReader.d.c((CharSequence) listC.get(i33));
                                                if (listC2.size() != 3) {
                                                    throw ParserException.a(null, null);
                                                }
                                                try {
                                                    arrayList7.add(new SlowMotionData.Segment(Long.parseLong((String) listC2.get(0)), Long.parseLong((String) listC2.get(1)), 1 << (Integer.parseInt((String) listC2.get(2)) - 1)));
                                                } catch (NumberFormatException e2) {
                                                    throw ParserException.a(e2, null);
                                                }
                                            }
                                            arrayList2.add(new SlowMotionData(arrayList7));
                                        } else if (c2 != 2816 && c2 != 2817 && c2 != c3 && c2 != 2820) {
                                            throw new IllegalStateException();
                                        }
                                        i29++;
                                        arrayList3 = arrayList6;
                                        i8 = i31;
                                        c3 = 2819;
                                    }
                                    positionHolder.f6793a = 0L;
                                }
                            } else {
                                ParsableByteArray parsableByteArray6 = new ParsableByteArray(8);
                                extractorInput.readFully(parsableByteArray6.f5667a, 0, 8);
                                sefReader.f7135c = parsableByteArray6.i() + 8;
                                if (parsableByteArray6.g() != 1397048916) {
                                    positionHolder.f6793a = 0L;
                                } else {
                                    positionHolder.f6793a = extractorInput.getPosition() - ((long) (sefReader.f7135c - 12));
                                    sefReader.f7134b = 2;
                                }
                            }
                            i4 = 1;
                        } else {
                            long length3 = extractorInput.getLength();
                            positionHolder.f6793a = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                            i4 = 1;
                            sefReader.f7134b = 1;
                        }
                        if (positionHolder.f6793a != 0) {
                            return i4;
                        }
                        this.k = 0;
                        this.f7119n = 0;
                        return i4;
                    }
                    int i34 = i6;
                    long j10 = this.m - ((long) this.f7119n);
                    long position3 = extractorInput.getPosition() + j10;
                    ParsableByteArray parsableByteArray7 = this.o;
                    if (parsableByteArray7 != null) {
                        extractorInput.readFully(parsableByteArray7.f5667a, this.f7119n, (int) j10);
                        if (this.f7118l == 1718909296) {
                            this.t = true;
                            parsableByteArray7.G(8);
                            int iG2 = parsableByteArray7.g();
                            int i35 = iG2 != 1751476579 ? iG2 != 1903435808 ? 0 : 1 : 2;
                            if (i35 == 0) {
                                parsableByteArray7.H(4);
                                do {
                                    if (parsableByteArray7.a() <= 0) {
                                        i35 = 0;
                                        break;
                                    }
                                    int iG3 = parsableByteArray7.g();
                                    i35 = iG3 != 1751476579 ? iG3 != 1903435808 ? 0 : 1 : 2;
                                } while (i35 == 0);
                            }
                            this.f7123z = i35;
                        } else if (!arrayDeque.isEmpty()) {
                            ((Atom.ContainerAtom) arrayDeque.peek()).f7055c.add(new Atom.LeafAtom(this.f7118l, parsableByteArray7));
                        }
                    } else {
                        if (!this.t && this.f7118l == 1835295092) {
                            this.f7123z = 1;
                        }
                        if (j10 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            extractorInput.skipFully((int) j10);
                        } else {
                            positionHolder.f6793a = extractorInput.getPosition() + j10;
                            z2 = true;
                        }
                        h(position3);
                        if (!z2 && this.k != 2) {
                            return 1;
                        }
                        z3 = true;
                        i6 = i34;
                        i7 = 2;
                        i8 = 4;
                    }
                    z2 = false;
                    h(position3);
                    if (!z2) {
                    }
                    z3 = true;
                    i6 = i34;
                    i7 = 2;
                    i8 = 4;
                }
            }
            boolean z7 = z3;
            int i36 = i6;
            int i37 = this.f7119n;
            ParsableByteArray parsableByteArray8 = this.f;
            if (i37 == 0) {
                if (!extractorInput.readFully(parsableByteArray8.f5667a, 0, 8, z7)) {
                    if (this.f7123z != 2 || (this.f7113b & 2) == 0) {
                        return -1;
                    }
                    TrackOutput trackOutputTrack = this.f7121u.track(0, 4);
                    MotionPhotoMetadata motionPhotoMetadata = this.f7111A;
                    Metadata metadata = motionPhotoMetadata != null ? new Metadata(motionPhotoMetadata) : null;
                    Format.Builder builder = new Format.Builder();
                    builder.j = metadata;
                    trackOutputTrack.b(new Format(builder));
                    this.f7121u.endTracks();
                    this.f7121u.e(new SeekMap.Unseekable(-9223372036854775807L));
                    return -1;
                }
                this.f7119n = 8;
                parsableByteArray8.G(0);
                this.m = parsableByteArray8.w();
                this.f7118l = parsableByteArray8.g();
            }
            long j11 = this.m;
            if (j11 == 1) {
                extractorInput.readFully(parsableByteArray8.f5667a, 8, 8);
                this.f7119n += 8;
                this.m = parsableByteArray8.z();
            } else if (j11 == 0) {
                long length4 = extractorInput.getLength();
                if (length4 == -1 && (containerAtom = (Atom.ContainerAtom) arrayDeque.peek()) != null) {
                    length4 = containerAtom.f7054b;
                }
                if (length4 != -1) {
                    this.m = (length4 - extractorInput.getPosition()) + ((long) this.f7119n);
                }
            }
            long j12 = this.m;
            int i38 = this.f7119n;
            if (j12 < i38) {
                throw ParserException.b("Atom size less than header length (unsupported).");
            }
            int i39 = this.f7118l;
            if (i39 == 1836019574 || i39 == 1953653099 || i39 == 1835297121 || i39 == 1835626086 || i39 == 1937007212 || i39 == 1701082227 || i39 == 1835365473) {
                long position4 = extractorInput.getPosition();
                long j13 = this.m;
                long j14 = this.f7119n;
                long j15 = (position4 + j13) - j14;
                if (j13 == j14 || this.f7118l != 1835365473) {
                    i2 = 4;
                } else {
                    parsableByteArray.D(8);
                    extractorInput.peekFully(parsableByteArray.f5667a, 0, 8);
                    byte[] bArr2 = AtomParsers.f7057a;
                    int i40 = parsableByteArray.f5668b;
                    i2 = 4;
                    parsableByteArray.H(4);
                    if (parsableByteArray.g() != 1751411826) {
                        i40 += 4;
                    }
                    parsableByteArray.G(i40);
                    extractorInput.skipFully(parsableByteArray.f5668b);
                    extractorInput.resetPeekPosition();
                }
                arrayDeque.push(new Atom.ContainerAtom(this.f7118l, j15));
                if (this.m == this.f7119n) {
                    h(j15);
                } else {
                    this.k = 0;
                    this.f7119n = 0;
                }
            } else {
                if (i39 == 1835296868 || i39 == 1836476516 || i39 == 1751411826 || i39 == 1937011556 || i39 == 1937011827 || i39 == 1937011571 || i39 == 1668576371 || i39 == 1701606260 || i39 == 1937011555 || i39 == 1937011578 || i39 == 1937013298 || i39 == 1937007471 || i39 == 1668232756 || i39 == 1953196132 || i39 == 1718909296 || i39 == 1969517665 || i39 == 1801812339 || i39 == 1768715124) {
                    Assertions.e(i38 == 8);
                    Assertions.e(this.m <= 2147483647L);
                    ParsableByteArray parsableByteArray9 = new ParsableByteArray((int) this.m);
                    System.arraycopy(parsableByteArray8.f5667a, 0, parsableByteArray9.f5667a, 0, 8);
                    this.o = parsableByteArray9;
                    this.k = 1;
                } else {
                    long position5 = extractorInput.getPosition();
                    long j16 = this.f7119n;
                    long j17 = position5 - j16;
                    if (this.f7118l == 1836086884) {
                        this.f7111A = new MotionPhotoMetadata(0L, j17, -9223372036854775807L, j17 + j16, this.m - j16);
                    }
                    this.o = null;
                    this.k = 1;
                }
                i2 = 4;
            }
            i6 = i36;
            i8 = i2;
            i7 = 2;
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.y;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[LOOP:2: B:37:0x008a->B:42:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1 A[LOOP:3: B:53:0x00b7->B:57:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0 A[EDGE_INSN: B:75:0x00e0->B:67:0x00e0 BREAK  A[LOOP:1: B:32:0x0077->B:66:0x00db], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0099 A[EDGE_INSN: B:81:0x0099->B:44:0x0099 BREAK  A[LOOP:2: B:37:0x008a->B:42:0x0095], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00bf A[EDGE_INSN: B:83:0x00bf->B:56:0x00bf BREAK  A[LOOP:3: B:53:0x00b7->B:57:0x00c1], SYNTHETIC] */
    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        long jMin;
        Mp4Track[] mp4TrackArr;
        int i3;
        TrackSampleTable trackSampleTable;
        long[] jArr;
        int iE;
        int[] iArr;
        long[] jArr2;
        int iE2;
        int iA;
        Mp4Track[] mp4TrackArr2 = this.v;
        int length = mp4TrackArr2.length;
        SeekPoint seekPoint = SeekPoint.f6798c;
        if (length == 0) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i4 = this.x;
        boolean z2 = false;
        int i5 = -1;
        long jMin2 = -1;
        if (i4 != -1) {
            TrackSampleTable trackSampleTable2 = mp4TrackArr2[i4].f7125b;
            long[] jArr3 = trackSampleTable2.f;
            int iE3 = Util.e(jArr3, j, false);
            while (true) {
                if (iE3 < 0) {
                    iE3 = -1;
                    break;
                }
                if ((trackSampleTable2.g[iE3] & 1) != 0) {
                    break;
                }
                iE3--;
            }
            if (iE3 == -1) {
                iE3 = trackSampleTable2.a(j);
            }
            if (iE3 == -1) {
                return new SeekMap.SeekPoints(seekPoint, seekPoint);
            }
            j4 = jArr3[iE3];
            long[] jArr4 = trackSampleTable2.f7160c;
            j3 = jArr4[iE3];
            if (j4 < j) {
                j2 = -9223372036854775807L;
                if (iE3 < trackSampleTable2.f7159b - 1 && (iA = trackSampleTable2.a(j)) != -1 && iA != iE3) {
                    j5 = jArr3[iA];
                    jMin2 = jArr4[iA];
                }
                i2 = 0;
                jMin = j3;
                while (true) {
                    mp4TrackArr = this.v;
                    if (i2 < mp4TrackArr.length) {
                        break;
                    }
                    if (i2 != this.x) {
                        trackSampleTable = mp4TrackArr[i2].f7125b;
                        jArr = trackSampleTable.f;
                        iE = Util.e(jArr, j4, z2);
                        while (true) {
                            iArr = trackSampleTable.g;
                            if (iE >= 0) {
                                iE = i5;
                                break;
                            }
                            if ((iArr[iE] & 1) != 0) {
                                break;
                            }
                            iE--;
                        }
                        if (iE == i5) {
                            iE = trackSampleTable.a(j4);
                        }
                        jArr2 = trackSampleTable.f7160c;
                        if (iE == i5) {
                            jMin = Math.min(jArr2[iE], jMin);
                        }
                        if (j5 != j2) {
                            iE2 = Util.e(jArr, j5, false);
                            while (true) {
                                if (iE2 >= 0) {
                                    iE2 = -1;
                                    break;
                                }
                                if ((iArr[iE2] & 1) != 0) {
                                    break;
                                }
                                iE2--;
                            }
                            i3 = -1;
                            if (iE2 == -1) {
                                iE2 = trackSampleTable.a(j5);
                            }
                            if (iE2 == -1) {
                                jMin2 = Math.min(jArr2[iE2], jMin2);
                            }
                        } else {
                            i3 = -1;
                        }
                    } else {
                        i3 = i5;
                    }
                    i2++;
                    i5 = i3;
                    z2 = false;
                }
                SeekPoint seekPoint2 = new SeekPoint(j4, jMin);
                return j5 == j2 ? new SeekMap.SeekPoints(seekPoint2, seekPoint2) : new SeekMap.SeekPoints(seekPoint2, new SeekPoint(j5, jMin2));
            }
            j2 = -9223372036854775807L;
        } else {
            j2 = -9223372036854775807L;
            j3 = Long.MAX_VALUE;
            j4 = j;
        }
        j5 = j2;
        i2 = 0;
        jMin = j3;
        while (true) {
            mp4TrackArr = this.v;
            if (i2 < mp4TrackArr.length) {
                break;
                break;
            }
            if (i2 != this.x) {
                trackSampleTable = mp4TrackArr[i2].f7125b;
                jArr = trackSampleTable.f;
                iE = Util.e(jArr, j4, z2);
                while (true) {
                    iArr = trackSampleTable.g;
                    if (iE >= 0) {
                        iE = i5;
                        break;
                    }
                    if ((iArr[iE] & 1) != 0) {
                        break;
                        break;
                    }
                    iE--;
                }
                if (iE == i5) {
                    iE = trackSampleTable.a(j4);
                }
                jArr2 = trackSampleTable.f7160c;
                if (iE == i5) {
                    jMin = Math.min(jArr2[iE], jMin);
                }
                if (j5 != j2) {
                    iE2 = Util.e(jArr, j5, false);
                    while (true) {
                        if (iE2 >= 0) {
                            iE2 = -1;
                            break;
                        }
                        if ((iArr[iE2] & 1) != 0) {
                            break;
                            break;
                        }
                        iE2--;
                    }
                    i3 = -1;
                    if (iE2 == -1) {
                        iE2 = trackSampleTable.a(j5);
                    }
                    if (iE2 == -1) {
                        jMin2 = Math.min(jArr2[iE2], jMin2);
                    }
                } else {
                    i3 = -1;
                }
            } else {
                i3 = i5;
            }
            i2++;
            i5 = i3;
            z2 = false;
        }
        SeekPoint seekPoint3 = new SeekPoint(j4, jMin);
        if (j5 == j2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:201:0x0373  */
    /* JADX WARN: Code duplicated, block: B:262:0x051d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(long j) {
        int i2;
        int i3;
        int i4;
        ArrayDeque arrayDeque;
        int i5;
        Metadata metadata;
        Metadata metadata2;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        MdtaMetadataEntry mdtaMetadataEntry;
        ArrayDeque arrayDeque2;
        Metadata metadata3;
        Metadata metadataB;
        Metadata metadata4;
        int iV;
        int i11;
        Metadata metadata5;
        ArrayDeque arrayDeque3;
        Id3Frame id3FrameF;
        Id3Frame id3FrameE;
        int i12 = 4;
        int i13 = 8;
        int i14 = 0;
        int i15 = 1;
        while (true) {
            ArrayDeque arrayDeque4 = this.g;
            if (arrayDeque4.isEmpty() || ((Atom.ContainerAtom) arrayDeque4.peek()).f7054b != j) {
                break;
            }
            Atom.ContainerAtom containerAtom = (Atom.ContainerAtom) arrayDeque4.pop();
            if (containerAtom.f7053a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = this.f7123z == i15 ? i15 : i14;
                GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
                Atom.LeafAtom leafAtomD = containerAtom.d(1969517665);
                int i16 = 1751411826;
                int i17 = 1768715124;
                int i18 = 12;
                int i19 = 1835365473;
                if (leafAtomD != null) {
                    byte[] bArr = AtomParsers.f7057a;
                    ParsableByteArray parsableByteArray = leafAtomD.f7056b;
                    parsableByteArray.G(i13);
                    Metadata metadata6 = new Metadata(new Metadata.Entry[i14]);
                    while (parsableByteArray.a() >= i13) {
                        int i20 = parsableByteArray.f5668b;
                        int iG = parsableByteArray.g();
                        int iG2 = parsableByteArray.g();
                        if (iG2 == i19) {
                            parsableByteArray.G(i20);
                            int i21 = i20 + iG;
                            parsableByteArray.H(i13);
                            int i22 = parsableByteArray.f5668b;
                            parsableByteArray.H(i12);
                            int i23 = i12;
                            if (parsableByteArray.g() != i16) {
                                i22 += 4;
                            }
                            parsableByteArray.G(i22);
                            while (true) {
                                int i24 = parsableByteArray.f5668b;
                                if (i24 < i21) {
                                    int iG3 = parsableByteArray.g();
                                    if (parsableByteArray.g() == i17) {
                                        parsableByteArray.G(i24);
                                        int i25 = i24 + iG3;
                                        parsableByteArray.H(i13);
                                        ArrayList arrayList2 = new ArrayList();
                                        while (true) {
                                            int i26 = parsableByteArray.f5668b;
                                            if (i26 >= i25) {
                                                break;
                                            }
                                            int iG4 = parsableByteArray.g() + i26;
                                            int iG5 = parsableByteArray.g();
                                            int i27 = (iG5 >> 24) & 255;
                                            boolean z3 = i15;
                                            int i28 = i25;
                                            if (i27 == 169 || i27 == 253) {
                                                arrayDeque3 = arrayDeque4;
                                                int i29 = 16777215 & iG5;
                                                if (i29 == 6516084) {
                                                    id3FrameF = MetadataUtil.a(iG5, parsableByteArray);
                                                } else if (i29 == 7233901 || i29 == 7631467) {
                                                    id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TIT2");
                                                } else if (i29 == 6516589 || i29 == 7828084) {
                                                    id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TCOM");
                                                } else if (i29 == 6578553) {
                                                    id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TDRC");
                                                } else if (i29 == 4280916) {
                                                    id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TPE1");
                                                } else if (i29 == 7630703) {
                                                    id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TSSE");
                                                } else if (i29 == 6384738) {
                                                    id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TALB");
                                                } else if (i29 == 7108978) {
                                                    id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "USLT");
                                                } else if (i29 == 6776174) {
                                                    id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TCON");
                                                } else if (i29 == 6779504) {
                                                    id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TIT1");
                                                } else {
                                                    Log.b("MetadataUtil", "Skipped unknown metadata entry: " + Atom.a(iG5));
                                                    parsableByteArray.G(iG4);
                                                    id3FrameF = null;
                                                }
                                                parsableByteArray.G(iG4);
                                            } else {
                                                if (iG5 == 1735291493) {
                                                    try {
                                                        String strA = Id3Util.a(MetadataUtil.d(parsableByteArray) - 1);
                                                        if (strA != null) {
                                                            id3FrameF = new TextInformationFrame("TCON", null, ImmutableList.z(strA));
                                                        } else {
                                                            Log.g("MetadataUtil", "Failed to parse standard genre code");
                                                            id3FrameF = null;
                                                        }
                                                    } catch (Throwable th) {
                                                        parsableByteArray.G(iG4);
                                                        throw th;
                                                    }
                                                } else if (iG5 == 1684632427) {
                                                    id3FrameF = MetadataUtil.c(iG5, parsableByteArray, "TPOS");
                                                } else if (iG5 == 1953655662) {
                                                    id3FrameF = MetadataUtil.c(iG5, parsableByteArray, "TRCK");
                                                } else {
                                                    if (iG5 == 1953329263) {
                                                        id3FrameE = MetadataUtil.e(iG5, "TBPM", parsableByteArray, z3, false);
                                                    } else if (iG5 == 1668311404) {
                                                        id3FrameF = MetadataUtil.e(iG5, "TCMP", parsableByteArray, true, true);
                                                    } else if (iG5 == 1668249202) {
                                                        id3FrameF = MetadataUtil.b(parsableByteArray);
                                                    } else if (iG5 == 1631670868) {
                                                        id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TPE2");
                                                    } else if (iG5 == 1936682605) {
                                                        id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TSOT");
                                                    } else if (iG5 == 1936679276) {
                                                        id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TSOA");
                                                    } else if (iG5 == 1936679282) {
                                                        id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TSOP");
                                                    } else if (iG5 == 1936679265) {
                                                        id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TSO2");
                                                    } else if (iG5 == 1936679791) {
                                                        id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TSOC");
                                                    } else if (iG5 == 1920233063) {
                                                        id3FrameE = MetadataUtil.e(iG5, "ITUNESADVISORY", parsableByteArray, false, false);
                                                    } else if (iG5 == 1885823344) {
                                                        id3FrameE = MetadataUtil.e(iG5, "ITUNESGAPLESS", parsableByteArray, false, true);
                                                    } else if (iG5 == 1936683886) {
                                                        id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TVSHOWSORT");
                                                    } else if (iG5 == 1953919848) {
                                                        id3FrameF = MetadataUtil.f(iG5, parsableByteArray, "TVSHOW");
                                                    } else if (iG5 == 757935405) {
                                                        String strQ = null;
                                                        String strQ2 = null;
                                                        int i30 = -1;
                                                        int i31 = -1;
                                                        while (true) {
                                                            int i32 = parsableByteArray.f5668b;
                                                            if (i32 >= iG4) {
                                                                break;
                                                            }
                                                            int iG6 = parsableByteArray.g();
                                                            int iG7 = parsableByteArray.g();
                                                            ArrayDeque arrayDeque5 = arrayDeque4;
                                                            parsableByteArray.H(i23);
                                                            if (iG7 == 1835360622) {
                                                                strQ = parsableByteArray.q(iG6 - 12);
                                                            } else if (iG7 == 1851878757) {
                                                                strQ2 = parsableByteArray.q(iG6 - 12);
                                                            } else {
                                                                if (iG7 == 1684108385) {
                                                                    i30 = i32;
                                                                    i31 = iG6;
                                                                }
                                                                parsableByteArray.H(iG6 - 12);
                                                            }
                                                            arrayDeque4 = arrayDeque5;
                                                            i23 = 4;
                                                        }
                                                        arrayDeque3 = arrayDeque4;
                                                        if (strQ == null || strQ2 == null || i30 == -1) {
                                                            id3FrameF = null;
                                                        } else {
                                                            parsableByteArray.G(i30);
                                                            parsableByteArray.H(16);
                                                            id3FrameF = new InternalFrame(strQ, strQ2, parsableByteArray.q(i31 - 16));
                                                        }
                                                        parsableByteArray.G(iG4);
                                                    } else {
                                                        arrayDeque3 = arrayDeque4;
                                                        Log.b("MetadataUtil", "Skipped unknown metadata entry: " + Atom.a(iG5));
                                                        parsableByteArray.G(iG4);
                                                        id3FrameF = null;
                                                    }
                                                    parsableByteArray.G(iG4);
                                                    id3FrameF = id3FrameE;
                                                    arrayDeque3 = arrayDeque4;
                                                }
                                                parsableByteArray.G(iG4);
                                                arrayDeque3 = arrayDeque4;
                                            }
                                            if (id3FrameF != null) {
                                                arrayList2.add(id3FrameF);
                                            }
                                            i25 = i28;
                                            arrayDeque4 = arrayDeque3;
                                            i15 = 1;
                                            i23 = 4;
                                        }
                                        arrayDeque2 = arrayDeque4;
                                        if (!arrayList2.isEmpty()) {
                                            metadata5 = new Metadata(arrayList2);
                                            break;
                                        }
                                        break;
                                    }
                                    parsableByteArray.G(i24 + iG3);
                                    i13 = 8;
                                    i15 = 1;
                                    i17 = 1768715124;
                                    i23 = 4;
                                } else {
                                    arrayDeque2 = arrayDeque4;
                                }
                                metadata5 = null;
                                break;
                            }
                            metadataB = metadata6.b(metadata5);
                        } else {
                            arrayDeque2 = arrayDeque4;
                            if (iG2 == 1936553057) {
                                parsableByteArray.G(i20);
                                int i33 = i20 + iG;
                                parsableByteArray.H(i18);
                                while (true) {
                                    int i34 = parsableByteArray.f5668b;
                                    if (i34 < i33) {
                                        int iG8 = parsableByteArray.g();
                                        if (parsableByteArray.g() == 1935766900) {
                                            if (iG8 >= 16) {
                                                parsableByteArray.H(4);
                                                int i35 = -1;
                                                int i36 = 0;
                                                int i37 = 0;
                                                while (i36 < 2) {
                                                    int iU = parsableByteArray.u();
                                                    int iU2 = parsableByteArray.u();
                                                    if (iU == 0) {
                                                        i35 = iU2;
                                                        i11 = 1;
                                                    } else {
                                                        i11 = 1;
                                                        if (iU == 1) {
                                                            i37 = iU2;
                                                        }
                                                    }
                                                    i36 += i11;
                                                }
                                                if (i35 == 12) {
                                                    iV = PsExtractor.VIDEO_STREAM_MASK;
                                                } else if (i35 == 13) {
                                                    iV = 120;
                                                } else if (i35 == 21 && parsableByteArray.a() >= 8 && parsableByteArray.f5668b + 8 <= i33) {
                                                    int iG9 = parsableByteArray.g();
                                                    int iG10 = parsableByteArray.g();
                                                    if (iG9 < 12 || iG10 != 1936877170) {
                                                        iV = -2147483647;
                                                    } else {
                                                        iV = parsableByteArray.v();
                                                    }
                                                } else {
                                                    iV = -2147483647;
                                                }
                                                if (iV != -2147483647) {
                                                    metadata4 = new Metadata(new SmtaMetadataEntry(iV, i37));
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        parsableByteArray.G(i34 + iG8);
                                    }
                                    metadata4 = null;
                                    break;
                                }
                                metadataB = metadata6.b(metadata4);
                            } else {
                                if (iG2 == -1451722374) {
                                    short sR = parsableByteArray.r();
                                    parsableByteArray.H(2);
                                    String strS = parsableByteArray.s(sR, Charsets.f19705c);
                                    int iMax = Math.max(strS.lastIndexOf(43), strS.lastIndexOf(45));
                                    try {
                                        metadata3 = new Metadata(new Mp4LocationData(Float.parseFloat(strS.substring(0, iMax)), Float.parseFloat(strS.substring(iMax, strS.length() - 1))));
                                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                        metadata3 = null;
                                    }
                                    metadataB = metadata6.b(metadata3);
                                }
                                parsableByteArray.G(i20 + iG);
                                arrayDeque4 = arrayDeque2;
                                i12 = 4;
                                i13 = 8;
                                i19 = 1835365473;
                                i15 = 1;
                                i17 = 1768715124;
                                i16 = 1751411826;
                                i18 = 12;
                            }
                        }
                        metadata6 = metadataB;
                        parsableByteArray.G(i20 + iG);
                        arrayDeque4 = arrayDeque2;
                        i12 = 4;
                        i13 = 8;
                        i19 = 1835365473;
                        i15 = 1;
                        i17 = 1768715124;
                        i16 = 1751411826;
                        i18 = 12;
                    }
                    arrayDeque = arrayDeque4;
                    gaplessInfoHolder.b(metadata6);
                    metadata = metadata6;
                    i5 = 1835365473;
                } else {
                    arrayDeque = arrayDeque4;
                    i5 = 1835365473;
                    metadata = null;
                }
                Atom.ContainerAtom containerAtomC = containerAtom.c(i5);
                if (containerAtomC != null) {
                    byte[] bArr2 = AtomParsers.f7057a;
                    Atom.LeafAtom leafAtomD2 = containerAtomC.d(1751411826);
                    Atom.LeafAtom leafAtomD3 = containerAtomC.d(1801812339);
                    Atom.LeafAtom leafAtomD4 = containerAtomC.d(1768715124);
                    if (leafAtomD2 == null || leafAtomD3 == null || leafAtomD4 == null) {
                        metadata2 = null;
                    } else {
                        ParsableByteArray parsableByteArray2 = leafAtomD2.f7056b;
                        parsableByteArray2.G(16);
                        if (parsableByteArray2.g() != 1835299937) {
                            metadata2 = null;
                        } else {
                            ParsableByteArray parsableByteArray3 = leafAtomD3.f7056b;
                            parsableByteArray3.G(12);
                            int iG11 = parsableByteArray3.g();
                            String[] strArr = new String[iG11];
                            for (int i38 = 0; i38 < iG11; i38++) {
                                int iG12 = parsableByteArray3.g();
                                parsableByteArray3.H(4);
                                strArr[i38] = parsableByteArray3.s(iG12 - 8, Charsets.f19705c);
                            }
                            ParsableByteArray parsableByteArray4 = leafAtomD4.f7056b;
                            parsableByteArray4.G(8);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i39 = 8; parsableByteArray4.a() > i39; i39 = 8) {
                                int i40 = parsableByteArray4.f5668b;
                                int iG13 = parsableByteArray4.g();
                                int iG14 = parsableByteArray4.g() - 1;
                                if (iG14 < 0 || iG14 >= iG11) {
                                    iG11 = iG11;
                                    a.C(iG14, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str = strArr[iG14];
                                    int i41 = i40 + iG13;
                                    while (true) {
                                        int i42 = parsableByteArray4.f5668b;
                                        if (i42 >= i41) {
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int iG15 = parsableByteArray4.g();
                                        if (parsableByteArray4.g() == 1684108385) {
                                            int iG16 = parsableByteArray4.g();
                                            int iG17 = parsableByteArray4.g();
                                            int i43 = iG15 - 16;
                                            byte[] bArr3 = new byte[i43];
                                            parsableByteArray4.e(bArr3, 0, i43);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(str, bArr3, iG17, iG16);
                                            break;
                                        }
                                        parsableByteArray4.G(i42 + iG15);
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList3.add(mdtaMetadataEntry);
                                    }
                                }
                                parsableByteArray4.G(i40 + iG13);
                                iG11 = iG11;
                            }
                            if (arrayList3.isEmpty()) {
                                metadata2 = null;
                            } else {
                                metadata2 = new Metadata(arrayList3);
                            }
                        }
                    }
                } else {
                    metadata2 = null;
                }
                Atom.LeafAtom leafAtomD5 = containerAtom.d(1836476516);
                leafAtomD5.getClass();
                Metadata metadata7 = new Metadata(AtomParsers.c(leafAtomD5.f7056b));
                int i44 = this.f7113b;
                int i45 = -1;
                i2 = 4;
                ArrayList arrayListF = AtomParsers.f(containerAtom, gaplessInfoHolder, -9223372036854775807L, null, (i44 & 1) != 0, z2, new I.a(27));
                int size = -1;
                int i46 = 0;
                long j3 = -9223372036854775807L;
                int i47 = 0;
                long j4 = -9223372036854775807L;
                while (true) {
                    j2 = 0;
                    if (i46 >= arrayListF.size()) {
                        break;
                    }
                    TrackSampleTable trackSampleTable = (TrackSampleTable) arrayListF.get(i46);
                    long j5 = j4;
                    if (trackSampleTable.f7159b == 0) {
                        i6 = i44;
                    } else {
                        Track track = trackSampleTable.f7158a;
                        long j6 = track.f7142e;
                        if (j6 == j5) {
                            j6 = trackSampleTable.f7162h;
                        }
                        long jMax = Math.max(j3, j6);
                        i6 = i44;
                        ExtractorOutput extractorOutput = this.f7121u;
                        int i48 = i47 + 1;
                        int i49 = track.f7140b;
                        Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, extractorOutput.track(i47, i49));
                        Format format = track.f;
                        boolean zEquals = "audio/true-hd".equals(format.m);
                        int i50 = trackSampleTable.f7161e;
                        int i51 = zEquals ? i50 * 16 : i50 + 30;
                        Format.Builder builderA = format.a();
                        builderA.m = i51;
                        if (i49 == 2) {
                            if ((i6 & 8) != 0) {
                                builderA.f = format.f | (size == -1 ? 1 : 2);
                            }
                            if (j6 > 0 && (i10 = trackSampleTable.f7159b) > 0) {
                                builderA.t = i10 / (j6 / 1000000.0f);
                            }
                        }
                        if (i49 == 1 && (i8 = gaplessInfoHolder.f6773a) != -1 && (i9 = gaplessInfoHolder.f6774b) != -1) {
                            builderA.C = i8;
                            builderA.D = i9;
                        }
                        ArrayList arrayList4 = this.f7117i;
                        Metadata[] metadataArr = {arrayList4.isEmpty() ? null : new Metadata(arrayList4), metadata, metadata7};
                        Metadata metadata8 = new Metadata(new Metadata.Entry[0]);
                        if (metadata2 != null) {
                            int i52 = 0;
                            while (true) {
                                Metadata.Entry[] entryArr = metadata2.X;
                                if (i52 >= entryArr.length) {
                                    break;
                                }
                                Metadata.Entry entry = entryArr[i52];
                                if (entry instanceof MdtaMetadataEntry) {
                                    MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry;
                                    if (!mdtaMetadataEntry2.X.equals("com.android.capture.fps")) {
                                        i7 = 1;
                                        metadata8 = metadata8.a(mdtaMetadataEntry2);
                                    } else if (i49 == 2) {
                                        i7 = 1;
                                        metadata8 = metadata8.a(mdtaMetadataEntry2);
                                    } else {
                                        i7 = 1;
                                    }
                                } else {
                                    i7 = 1;
                                }
                                i52 += i7;
                            }
                        }
                        for (int i53 = 0; i53 < 3; i53++) {
                            metadata8 = metadata8.b(metadataArr[i53]);
                        }
                        if (metadata8.X.length > 0) {
                            builderA.j = metadata8;
                        }
                        mp4Track.f7126c.b(new Format(builderA));
                        i45 = -1;
                        if (i49 == 2 && size == -1) {
                            size = arrayList.size();
                        }
                        arrayList.add(mp4Track);
                        i47 = i48;
                        j3 = jMax;
                    }
                    i46++;
                    i44 = i6;
                    j4 = j5;
                    arrayListF = arrayListF;
                }
                i3 = 8;
                this.x = size;
                this.y = j3;
                Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList.toArray(new Mp4Track[0]);
                this.v = mp4TrackArr;
                long[][] jArr = new long[mp4TrackArr.length][];
                int[] iArr = new int[mp4TrackArr.length];
                long[] jArr2 = new long[mp4TrackArr.length];
                boolean[] zArr = new boolean[mp4TrackArr.length];
                for (int i54 = 0; i54 < mp4TrackArr.length; i54++) {
                    jArr[i54] = new long[mp4TrackArr[i54].f7125b.f7159b];
                    jArr2[i54] = mp4TrackArr[i54].f7125b.f[0];
                }
                int i55 = 0;
                while (i55 < mp4TrackArr.length) {
                    int i56 = i45;
                    long j7 = Long.MAX_VALUE;
                    for (int i57 = 0; i57 < mp4TrackArr.length; i57++) {
                        if (!zArr[i57]) {
                            long j8 = jArr2[i57];
                            if (j8 <= j7) {
                                i56 = i57;
                                j7 = j8;
                            }
                        }
                    }
                    int i58 = iArr[i56];
                    long[] jArr3 = jArr[i56];
                    jArr3[i58] = j2;
                    TrackSampleTable trackSampleTable2 = mp4TrackArr[i56].f7125b;
                    j2 += (long) trackSampleTable2.d[i58];
                    int i59 = i58 + 1;
                    iArr[i56] = i59;
                    if (i59 < jArr3.length) {
                        jArr2[i56] = trackSampleTable2.f[i59];
                    } else {
                        zArr[i56] = true;
                        i55++;
                    }
                }
                i4 = 1;
                this.f7122w = jArr;
                this.f7121u.endTracks();
                this.f7121u.e(this);
                arrayDeque.clear();
                this.k = 2;
            } else {
                i2 = i12;
                i3 = i13;
                i4 = i15;
                if (!arrayDeque4.isEmpty()) {
                    ((Atom.ContainerAtom) arrayDeque4.peek()).d.add(containerAtom);
                }
            }
            i12 = i2;
            i13 = i3;
            i15 = i4;
            i14 = 0;
        }
        if (this.k != 2) {
            this.k = 0;
            this.f7119n = 0;
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.g.clear();
        this.f7119n = 0;
        this.f7120p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        if (j == 0) {
            if (this.k != 3) {
                this.k = 0;
                this.f7119n = 0;
                return;
            } else {
                SefReader sefReader = this.f7116h;
                sefReader.f7133a.clear();
                sefReader.f7134b = 0;
                this.f7117i.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.v) {
            TrackSampleTable trackSampleTable = mp4Track.f7125b;
            int iE = Util.e(trackSampleTable.f, j2, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((trackSampleTable.g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = trackSampleTable.a(j2);
            }
            mp4Track.f7127e = iE;
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.d;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.f6809b = false;
                trueHdSampleRechunker.f6810c = 0;
            }
        }
    }
}
