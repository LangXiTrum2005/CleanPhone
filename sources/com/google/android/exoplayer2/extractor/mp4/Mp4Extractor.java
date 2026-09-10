package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.analytics.f;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Mp4Extractor implements Extractor, SeekMap {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f17805w = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17811i;
    public long j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ParsableByteArray f17812l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17813n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17814p;
    public long[][] s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f17815u;
    public int v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17810h = 0;
    public final SefReader f = new SefReader();
    public final ArrayList g = new ArrayList();
    public final ParsableByteArray d = new ParsableByteArray(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f17809e = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f17806a = new ParsableByteArray(NalUnitUtil.f18927a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17807b = new ParsableByteArray(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f17808c = new ParsableByteArray();
    public int m = -1;
    public ExtractorOutput q = ExtractorOutput.Q8;
    public Mp4Track[] r = new Mp4Track[0];

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class Mp4Track {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Track f17816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackSampleTable f17817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TrackOutput f17818c;
        public final TrueHdSampleRechunker d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17819e;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.f17816a = track;
            this.f17817b = trackSampleTable;
            this.f17818c = trackOutput;
            this.d = "audio/true-hd".equals(track.f.m0) ? new TrueHdSampleRechunker() : null;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) {
        return Sniffer.a(extractorInput, false, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:234:0x0474  */
    /* JADX WARN: Code duplicated, block: B:237:0x047b  */
    /* JADX WARN: Code duplicated, block: B:345:0x047a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x047d A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) {
        ArrayDeque arrayDeque;
        ParsableByteArray parsableByteArray;
        Atom.ContainerAtom containerAtom;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        char c2;
        boolean z2;
        int i7;
        boolean z3;
        int i8 = 3;
        int i9 = 2;
        int i10 = 0;
        int i11 = 4;
        while (true) {
            boolean z4 = true;
            while (true) {
                int i12 = this.f17810h;
                arrayDeque = this.f17809e;
                parsableByteArray = this.f17808c;
                if (i12 != 0) {
                    if (i12 != z4) {
                        if (i12 == i9) {
                            int i13 = i11;
                            long position = extractorInput.getPosition();
                            if (this.m == -1) {
                                int i14 = -1;
                                int i15 = -1;
                                boolean z5 = true;
                                boolean z6 = true;
                                int i16 = 0;
                                long j2 = Long.MAX_VALUE;
                                long j3 = Long.MAX_VALUE;
                                long j4 = Long.MAX_VALUE;
                                while (true) {
                                    Mp4Track[] mp4TrackArr = this.r;
                                    if (i16 >= mp4TrackArr.length) {
                                        break;
                                    }
                                    Mp4Track mp4Track = mp4TrackArr[i16];
                                    int i17 = mp4Track.f17819e;
                                    TrackSampleTable trackSampleTable = mp4Track.f17817b;
                                    if (i17 != trackSampleTable.f17850b) {
                                        long j5 = trackSampleTable.f17851c[i17];
                                        long[][] jArr = this.s;
                                        int i18 = Util.f18979a;
                                        long j6 = jArr[i16][i17];
                                        long j7 = j5 - position;
                                        boolean z7 = j7 < 0 || j7 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                        if ((!z7 && z6) || (z7 == z6 && j7 < j4)) {
                                            z6 = z7;
                                            j3 = j6;
                                            i15 = i16;
                                            j4 = j7;
                                        }
                                        if (j6 < j2) {
                                            z5 = z7;
                                            j2 = j6;
                                            i14 = i16;
                                        }
                                    }
                                    i16++;
                                }
                                if (j2 == Long.MAX_VALUE || !z5 || j3 < j2 + 10485760) {
                                    i14 = i15;
                                }
                                this.m = i14;
                                if (i14 == -1) {
                                    return -1;
                                }
                            }
                            Mp4Track mp4Track2 = this.r[this.m];
                            TrackOutput trackOutput = mp4Track2.f17818c;
                            int i19 = mp4Track2.f17819e;
                            TrackSampleTable trackSampleTable2 = mp4Track2.f17817b;
                            long j8 = trackSampleTable2.f17851c[i19];
                            int i20 = trackSampleTable2.d[i19];
                            long j9 = (j8 - position) + ((long) this.f17813n);
                            if (j9 < 0 || j9 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                                positionHolder.f17554a = j8;
                                return 1;
                            }
                            Track track = mp4Track2.f17816a;
                            if (track.g == 1) {
                                j9 += 8;
                                i20 -= 8;
                            }
                            extractorInput.skipFully((int) j9);
                            int i21 = track.j;
                            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track2.d;
                            if (i21 == 0) {
                                if ("audio/ac4".equals(track.f.m0)) {
                                    if (this.o == 0) {
                                        Ac4Util.a(i20, parsableByteArray);
                                        i4 = 7;
                                        trackOutput.e(7, parsableByteArray);
                                        this.o += 7;
                                    } else {
                                        i4 = 7;
                                    }
                                    i20 += i4;
                                } else if (trueHdSampleRechunker != null) {
                                    trueHdSampleRechunker.c(extractorInput);
                                }
                                while (true) {
                                    int i22 = this.o;
                                    if (i22 >= i20) {
                                        break;
                                    }
                                    int iD = trackOutput.d(extractorInput, i20 - i22, false);
                                    this.f17813n += iD;
                                    this.o += iD;
                                    this.f17814p -= iD;
                                }
                            } else {
                                ParsableByteArray parsableByteArray2 = this.f17807b;
                                byte[] bArr = parsableByteArray2.f18956a;
                                boolean z8 = false;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i23 = 4 - i21;
                                while (this.o < i20) {
                                    int i24 = this.f17814p;
                                    if (i24 == 0) {
                                        extractorInput.readFully(bArr, i23, i21);
                                        this.f17813n += i21;
                                        parsableByteArray2.F(z8 ? 1 : 0);
                                        int iG = parsableByteArray2.g();
                                        if (iG < 0) {
                                            throw ParserException.a(null, "Invalid NAL length");
                                        }
                                        this.f17814p = iG;
                                        ParsableByteArray parsableByteArray3 = this.f17806a;
                                        parsableByteArray3.F(z8 ? 1 : 0);
                                        int i25 = i13;
                                        trackOutput.e(i25, parsableByteArray3);
                                        this.o += i25;
                                        i20 += i23;
                                    } else {
                                        int iD2 = trackOutput.d(extractorInput, i24, z8);
                                        this.f17813n += iD2;
                                        this.o += iD2;
                                        this.f17814p -= iD2;
                                        z8 = false;
                                    }
                                    i13 = 4;
                                }
                            }
                            int i26 = i20;
                            long j10 = trackSampleTable2.f[i19];
                            int i27 = trackSampleTable2.g[i19];
                            if (trueHdSampleRechunker != null) {
                                trueHdSampleRechunker.b(trackOutput, j10, i27, i26, 0, null);
                                if (i19 + 1 == trackSampleTable2.f17850b) {
                                    trueHdSampleRechunker.a(trackOutput, null);
                                }
                            } else {
                                trackOutput.f(j10, i27, i26, 0, null);
                            }
                            mp4Track2.f17819e++;
                            this.m = -1;
                            this.f17813n = 0;
                            this.o = 0;
                            this.f17814p = 0;
                            return 0;
                        }
                        if (i12 != i8) {
                            throw new IllegalStateException();
                        }
                        ArrayList arrayList = this.g;
                        SefReader sefReader = this.f;
                        int i28 = sefReader.f17825b;
                        if (i28 != 0) {
                            if (i28 != z4) {
                                ArrayList arrayList2 = sefReader.f17824a;
                                int i29 = 8;
                                short s = 2817;
                                if (i28 == i9) {
                                    long length = extractorInput.getLength();
                                    int i30 = sefReader.f17826c - 20;
                                    ParsableByteArray parsableByteArray4 = new ParsableByteArray(i30);
                                    extractorInput.readFully(parsableByteArray4.f18956a, 0, i30);
                                    int i31 = 0;
                                    while (i31 < i30 / 12) {
                                        parsableByteArray4.G(2);
                                        short sK = parsableByteArray4.k();
                                        if (sK != 2192 && sK != 2816 && sK != s) {
                                            if (sK != 2819 && sK != 2820) {
                                                parsableByteArray4.G(i29);
                                                j = length;
                                            }
                                            i31++;
                                            length = j;
                                            s = 2817;
                                            i29 = 8;
                                        }
                                        j = length;
                                        arrayList2.add(new SefReader.DataReference((j - ((long) sefReader.f17826c)) - ((long) parsableByteArray4.i()), parsableByteArray4.i()));
                                        i31++;
                                        length = j;
                                        s = 2817;
                                        i29 = 8;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        positionHolder.f17554a = 0L;
                                    } else {
                                        sefReader.f17825b = i8;
                                        positionHolder.f17554a = ((SefReader.DataReference) arrayList2.get(0)).f17827a;
                                    }
                                } else {
                                    if (i28 != i8) {
                                        throw new IllegalStateException();
                                    }
                                    long position2 = extractorInput.getPosition();
                                    int length2 = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - ((long) sefReader.f17826c));
                                    ParsableByteArray parsableByteArray5 = new ParsableByteArray(length2);
                                    extractorInput.readFully(parsableByteArray5.f18956a, i10, length2);
                                    int i32 = i10;
                                    while (i32 < arrayList2.size()) {
                                        SefReader.DataReference dataReference = (SefReader.DataReference) arrayList2.get(i32);
                                        parsableByteArray5.F((int) (dataReference.f17827a - position2));
                                        parsableByteArray5.G(i11);
                                        int i33 = parsableByteArray5.i();
                                        Charset charset = Charsets.f19705c;
                                        int i34 = i11;
                                        String strS = parsableByteArray5.s(i33, charset);
                                        switch (strS.hashCode()) {
                                            case -1711564334:
                                                if (strS.equals("SlowMotion_Data")) {
                                                    i6 = 0;
                                                } else {
                                                    i6 = -1;
                                                }
                                                break;
                                            case -1332107749:
                                                if (strS.equals("Super_SlowMotion_Edit_Data")) {
                                                    i6 = 1;
                                                } else {
                                                    i6 = -1;
                                                }
                                                break;
                                            case -1251387154:
                                                if (strS.equals("Super_SlowMotion_Data")) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = -1;
                                                }
                                                break;
                                            case -830665521:
                                                if (strS.equals("Super_SlowMotion_Deflickering_On")) {
                                                    i6 = i8;
                                                } else {
                                                    i6 = -1;
                                                }
                                                break;
                                            case 1760745220:
                                                if (strS.equals("Super_SlowMotion_BGM")) {
                                                    i6 = i34;
                                                } else {
                                                    i6 = -1;
                                                }
                                                break;
                                            default:
                                                i6 = -1;
                                                break;
                                        }
                                        switch (i6) {
                                            case 0:
                                                c2 = 2192;
                                                break;
                                            case 1:
                                                c2 = 2819;
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
                                        int i35 = dataReference.f17828b - (i33 + 8);
                                        if (c2 == 2192) {
                                            ArrayList arrayList3 = new ArrayList();
                                            List listC = SefReader.f17823e.c(parsableByteArray5.s(i35, charset));
                                            for (int i36 = 0; i36 < listC.size(); i36++) {
                                                List listC2 = SefReader.d.c((CharSequence) listC.get(i36));
                                                if (listC2.size() != i8) {
                                                    throw ParserException.a(null, null);
                                                }
                                                try {
                                                    arrayList3.add(new SlowMotionData.Segment(Long.parseLong((String) listC2.get(0)), Long.parseLong((String) listC2.get(1)), 1 << (Integer.parseInt((String) listC2.get(2)) - 1)));
                                                } catch (NumberFormatException e2) {
                                                    throw ParserException.a(e2, null);
                                                }
                                            }
                                            arrayList.add(new SlowMotionData(arrayList3));
                                        } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                            throw new IllegalStateException();
                                        }
                                        i32++;
                                        i11 = i34;
                                    }
                                    positionHolder.f17554a = 0L;
                                }
                            } else {
                                ParsableByteArray parsableByteArray6 = new ParsableByteArray(8);
                                extractorInput.readFully(parsableByteArray6.f18956a, i10, 8);
                                sefReader.f17826c = parsableByteArray6.i() + 8;
                                if (parsableByteArray6.g() != 1397048916) {
                                    positionHolder.f17554a = 0L;
                                } else {
                                    positionHolder.f17554a = extractorInput.getPosition() - ((long) (sefReader.f17826c - 12));
                                    sefReader.f17825b = 2;
                                }
                            }
                            i5 = 1;
                        } else {
                            long length3 = extractorInput.getLength();
                            positionHolder.f17554a = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                            i5 = 1;
                            sefReader.f17825b = 1;
                        }
                        if (positionHolder.f17554a != 0) {
                            return i5;
                        }
                        this.f17810h = 0;
                        this.k = 0;
                        return i5;
                    }
                    long j11 = this.j - ((long) this.k);
                    long position3 = extractorInput.getPosition() + j11;
                    ParsableByteArray parsableByteArray7 = this.f17812l;
                    if (parsableByteArray7 != null) {
                        extractorInput.readFully(parsableByteArray7.f18956a, this.k, (int) j11);
                        if (this.f17811i == 1718909296) {
                            parsableByteArray7.F(8);
                            int iG2 = parsableByteArray7.g();
                            int i37 = iG2 != 1751476579 ? iG2 != 1903435808 ? 0 : 1 : 2;
                            if (i37 == 0) {
                                parsableByteArray7.G(4);
                                do {
                                    if (parsableByteArray7.a() <= 0) {
                                        i37 = 0;
                                        break;
                                    }
                                    int iG3 = parsableByteArray7.g();
                                    i37 = iG3 != 1751476579 ? iG3 != 1903435808 ? 0 : 1 : 2;
                                } while (i37 == 0);
                            }
                            this.v = i37;
                        } else if (!arrayDeque.isEmpty()) {
                            ((Atom.ContainerAtom) arrayDeque.peek()).f17752c.add(new Atom.LeafAtom(this.f17811i, parsableByteArray7));
                        }
                    } else {
                        if (j11 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            extractorInput.skipFully((int) j11);
                        } else {
                            positionHolder.f17554a = extractorInput.getPosition() + j11;
                            z2 = true;
                        }
                        e(position3);
                        if (z2) {
                            i7 = 2;
                            z3 = true;
                            if (this.f17810h != 2) {
                                return 1;
                            }
                        } else {
                            i7 = 2;
                            z3 = true;
                        }
                        i9 = i7;
                        z4 = z3;
                        i10 = 0;
                        i11 = 4;
                    }
                    z2 = false;
                    e(position3);
                    if (z2) {
                        i7 = 2;
                        z3 = true;
                        if (this.f17810h != 2) {
                            return 1;
                        }
                    } else {
                        i7 = 2;
                        z3 = true;
                    }
                    i9 = i7;
                    z4 = z3;
                    i10 = 0;
                    i11 = 4;
                }
            }
            boolean z9 = z4;
            int i38 = this.k;
            ParsableByteArray parsableByteArray8 = this.d;
            if (i38 == 0) {
                if (!extractorInput.readFully(parsableByteArray8.f18956a, 0, 8, z9)) {
                    return -1;
                }
                this.k = 8;
                parsableByteArray8.F(0);
                this.j = parsableByteArray8.v();
                this.f17811i = parsableByteArray8.g();
            }
            long j12 = this.j;
            if (j12 == 1) {
                extractorInput.readFully(parsableByteArray8.f18956a, 8, 8);
                this.k += 8;
                this.j = parsableByteArray8.y();
            } else if (j12 == 0) {
                long length4 = extractorInput.getLength();
                if (length4 == -1 && (containerAtom = (Atom.ContainerAtom) arrayDeque.peek()) != null) {
                    length4 = containerAtom.f17751b;
                }
                if (length4 != -1) {
                    this.j = (length4 - extractorInput.getPosition()) + ((long) this.k);
                }
            }
            long j13 = this.j;
            int i39 = this.k;
            if (j13 < i39) {
                throw ParserException.b("Atom size less than header length (unsupported).");
            }
            int i40 = this.f17811i;
            if (i40 == 1836019574 || i40 == 1953653099 || i40 == 1835297121 || i40 == 1835626086 || i40 == 1937007212 || i40 == 1701082227 || i40 == 1835365473) {
                long position4 = extractorInput.getPosition();
                long j14 = this.j;
                long j15 = this.k;
                long j16 = (position4 + j14) - j15;
                if (j14 == j15 || this.f17811i != 1835365473) {
                    i2 = 4;
                } else {
                    parsableByteArray.C(8);
                    extractorInput.peekFully(parsableByteArray.f18956a, 0, 8);
                    byte[] bArr2 = AtomParsers.f17754a;
                    int i41 = parsableByteArray.f18957b;
                    i2 = 4;
                    parsableByteArray.G(4);
                    if (parsableByteArray.g() != 1751411826) {
                        i41 += 4;
                    }
                    parsableByteArray.F(i41);
                    extractorInput.skipFully(parsableByteArray.f18957b);
                    extractorInput.resetPeekPosition();
                }
                arrayDeque.push(new Atom.ContainerAtom(this.f17811i, j16));
                if (this.j == this.k) {
                    e(j16);
                    i3 = 0;
                } else {
                    i3 = 0;
                    this.f17810h = 0;
                    this.k = 0;
                }
            } else {
                if (i40 == 1835296868 || i40 == 1836476516 || i40 == 1751411826 || i40 == 1937011556 || i40 == 1937011827 || i40 == 1937011571 || i40 == 1668576371 || i40 == 1701606260 || i40 == 1937011555 || i40 == 1937011578 || i40 == 1937013298 || i40 == 1937007471 || i40 == 1668232756 || i40 == 1953196132 || i40 == 1718909296 || i40 == 1969517665 || i40 == 1801812339 || i40 == 1768715124) {
                    Assertions.d(i39 == 8);
                    Assertions.d(this.j <= 2147483647L);
                    ParsableByteArray parsableByteArray9 = new ParsableByteArray((int) this.j);
                    System.arraycopy(parsableByteArray8.f18956a, 0, parsableByteArray9.f18956a, 0, 8);
                    this.f17812l = parsableByteArray9;
                    this.f17810h = 1;
                } else {
                    long position5 = extractorInput.getPosition();
                    long j17 = this.k;
                    long j18 = position5 - j17;
                    if (this.f17811i == 1836086884) {
                        new MotionPhotoMetadata(0L, j18, -9223372036854775807L, j18 + j17, this.j - j17);
                    }
                    this.f17812l = null;
                    this.f17810h = 1;
                }
                i3 = 0;
                i2 = 4;
            }
            i10 = i3;
            i11 = i2;
            i8 = 3;
            i9 = 2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.q = extractorOutput;
    }

    /* JADX WARN: Code duplicated, block: B:237:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:275:0x059b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(long j) {
        int i2;
        int i3;
        int i4;
        ArrayDeque arrayDeque;
        int i5;
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        Atom.ContainerAtom containerAtom;
        Metadata metadata4;
        int i6;
        Metadata metadata5;
        int i7;
        int i8;
        int i9;
        Metadata metadata6;
        MdtaMetadataEntry mdtaMetadataEntry;
        int i10;
        ArrayDeque arrayDeque2;
        ArrayDeque arrayDeque3;
        Id3Frame id3FrameD;
        Id3Frame id3FrameE;
        int i11 = 4;
        int i12 = 1;
        while (true) {
            ArrayDeque arrayDeque4 = this.f17809e;
            if (arrayDeque4.isEmpty() || ((Atom.ContainerAtom) arrayDeque4.peek()).f17751b != j) {
                break;
            }
            Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) arrayDeque4.pop();
            if (containerAtom2.f17750a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = this.v == i12 ? i12 : 0;
                GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
                Atom.LeafAtom leafAtomD = containerAtom2.d(1969517665);
                int i13 = 1751411826;
                int i14 = 1768715124;
                int i15 = 12;
                int i16 = 1835365473;
                int i17 = 8;
                if (leafAtomD != null) {
                    byte[] bArr = AtomParsers.f17754a;
                    ParsableByteArray parsableByteArray = leafAtomD.f17753b;
                    parsableByteArray.F(8);
                    Metadata metadata7 = null;
                    Metadata metadata8 = null;
                    while (parsableByteArray.a() >= i17) {
                        int i18 = parsableByteArray.f18957b;
                        int iG = parsableByteArray.g();
                        int iG2 = parsableByteArray.g();
                        if (iG2 == i16) {
                            parsableByteArray.F(i18);
                            int i19 = i18 + iG;
                            parsableByteArray.G(i17);
                            int i20 = parsableByteArray.f18957b;
                            parsableByteArray.G(i11);
                            int i21 = i11;
                            if (parsableByteArray.g() != i13) {
                                i20 += 4;
                            }
                            parsableByteArray.F(i20);
                            while (true) {
                                int i22 = parsableByteArray.f18957b;
                                if (i22 < i19) {
                                    int iG3 = parsableByteArray.g();
                                    if (parsableByteArray.g() == i14) {
                                        parsableByteArray.F(i22);
                                        int i23 = i22 + iG3;
                                        parsableByteArray.G(i17);
                                        ArrayList arrayList2 = new ArrayList();
                                        while (true) {
                                            int i24 = parsableByteArray.f18957b;
                                            if (i24 >= i23) {
                                                break;
                                            }
                                            int iG4 = parsableByteArray.g() + i24;
                                            int i25 = i17;
                                            int iG5 = parsableByteArray.g();
                                            int i26 = (iG5 >> 24) & 255;
                                            boolean z3 = i12;
                                            int i27 = i23;
                                            if (i26 == 169 || i26 == 253) {
                                                arrayDeque3 = arrayDeque4;
                                                int i28 = 16777215 & iG5;
                                                if (i28 == 6516084) {
                                                    id3FrameD = MetadataUtil.a(iG5, parsableByteArray);
                                                } else if (i28 == 7233901 || i28 == 7631467) {
                                                    id3FrameD = MetadataUtil.d(iG5, "TIT2", parsableByteArray);
                                                } else if (i28 == 6516589 || i28 == 7828084) {
                                                    id3FrameD = MetadataUtil.d(iG5, "TCOM", parsableByteArray);
                                                } else if (i28 == 6578553) {
                                                    id3FrameD = MetadataUtil.d(iG5, "TDRC", parsableByteArray);
                                                } else if (i28 == 4280916) {
                                                    id3FrameD = MetadataUtil.d(iG5, "TPE1", parsableByteArray);
                                                } else if (i28 == 7630703) {
                                                    id3FrameD = MetadataUtil.d(iG5, "TSSE", parsableByteArray);
                                                } else if (i28 == 6384738) {
                                                    id3FrameD = MetadataUtil.d(iG5, "TALB", parsableByteArray);
                                                } else if (i28 == 7108978) {
                                                    id3FrameD = MetadataUtil.d(iG5, "USLT", parsableByteArray);
                                                } else if (i28 == 6776174) {
                                                    id3FrameD = MetadataUtil.d(iG5, "TCON", parsableByteArray);
                                                } else if (i28 == 6779504) {
                                                    id3FrameD = MetadataUtil.d(iG5, "TIT1", parsableByteArray);
                                                } else {
                                                    Log.b("MetadataUtil", "Skipped unknown metadata entry: " + Atom.a(iG5));
                                                    parsableByteArray.F(iG4);
                                                    id3FrameD = null;
                                                }
                                                parsableByteArray.F(iG4);
                                            } else {
                                                if (iG5 == 1735291493) {
                                                    try {
                                                        int iF = MetadataUtil.f(parsableByteArray);
                                                        String str = (iF <= 0 || iF > 192) ? null : MetadataUtil.f17804a[iF - 1];
                                                        if (str != null) {
                                                            id3FrameD = new TextInformationFrame("TCON", null, ImmutableList.z(str));
                                                        } else {
                                                            Log.g("MetadataUtil", "Failed to parse standard genre code");
                                                            id3FrameD = null;
                                                        }
                                                    } catch (Throwable th) {
                                                        parsableByteArray.F(iG4);
                                                        throw th;
                                                    }
                                                } else if (iG5 == 1684632427) {
                                                    id3FrameD = MetadataUtil.c(iG5, "TPOS", parsableByteArray);
                                                } else if (iG5 == 1953655662) {
                                                    id3FrameD = MetadataUtil.c(iG5, "TRCK", parsableByteArray);
                                                } else {
                                                    if (iG5 == 1953329263) {
                                                        id3FrameE = MetadataUtil.e(iG5, "TBPM", parsableByteArray, z3, false);
                                                    } else if (iG5 == 1668311404) {
                                                        id3FrameE = MetadataUtil.e(iG5, "TCMP", parsableByteArray, true, true);
                                                    } else if (iG5 == 1668249202) {
                                                        id3FrameD = MetadataUtil.b(parsableByteArray);
                                                    } else if (iG5 == 1631670868) {
                                                        id3FrameD = MetadataUtil.d(iG5, "TPE2", parsableByteArray);
                                                    } else if (iG5 == 1936682605) {
                                                        id3FrameD = MetadataUtil.d(iG5, "TSOT", parsableByteArray);
                                                    } else if (iG5 == 1936679276) {
                                                        id3FrameD = MetadataUtil.d(iG5, "TSO2", parsableByteArray);
                                                    } else if (iG5 == 1936679282) {
                                                        id3FrameD = MetadataUtil.d(iG5, "TSOA", parsableByteArray);
                                                    } else if (iG5 == 1936679265) {
                                                        id3FrameD = MetadataUtil.d(iG5, "TSOP", parsableByteArray);
                                                    } else if (iG5 == 1936679791) {
                                                        id3FrameD = MetadataUtil.d(iG5, "TSOC", parsableByteArray);
                                                    } else if (iG5 == 1920233063) {
                                                        id3FrameD = MetadataUtil.e(iG5, "ITUNESADVISORY", parsableByteArray, false, false);
                                                    } else if (iG5 == 1885823344) {
                                                        id3FrameE = MetadataUtil.e(iG5, "ITUNESGAPLESS", parsableByteArray, false, true);
                                                    } else if (iG5 == 1936683886) {
                                                        id3FrameD = MetadataUtil.d(iG5, "TVSHOWSORT", parsableByteArray);
                                                    } else if (iG5 == 1953919848) {
                                                        id3FrameD = MetadataUtil.d(iG5, "TVSHOW", parsableByteArray);
                                                    } else if (iG5 == 757935405) {
                                                        String strQ = null;
                                                        String strQ2 = null;
                                                        int i29 = -1;
                                                        int i30 = -1;
                                                        while (true) {
                                                            int i31 = parsableByteArray.f18957b;
                                                            if (i31 >= iG4) {
                                                                break;
                                                            }
                                                            int iG6 = parsableByteArray.g();
                                                            int iG7 = parsableByteArray.g();
                                                            ArrayDeque arrayDeque5 = arrayDeque4;
                                                            parsableByteArray.G(i21);
                                                            if (iG7 == 1835360622) {
                                                                strQ = parsableByteArray.q(iG6 - 12);
                                                            } else if (iG7 == 1851878757) {
                                                                strQ2 = parsableByteArray.q(iG6 - 12);
                                                            } else {
                                                                if (iG7 == 1684108385) {
                                                                    i29 = i31;
                                                                    i30 = iG6;
                                                                }
                                                                parsableByteArray.G(iG6 - 12);
                                                            }
                                                            arrayDeque4 = arrayDeque5;
                                                            i21 = 4;
                                                        }
                                                        arrayDeque3 = arrayDeque4;
                                                        if (strQ == null || strQ2 == null || i29 == -1) {
                                                            id3FrameD = null;
                                                        } else {
                                                            parsableByteArray.F(i29);
                                                            parsableByteArray.G(16);
                                                            id3FrameD = new InternalFrame(strQ, strQ2, parsableByteArray.q(i30 - 16));
                                                        }
                                                        parsableByteArray.F(iG4);
                                                    } else {
                                                        arrayDeque3 = arrayDeque4;
                                                        Log.b("MetadataUtil", "Skipped unknown metadata entry: " + Atom.a(iG5));
                                                        parsableByteArray.F(iG4);
                                                        id3FrameD = null;
                                                    }
                                                    parsableByteArray.F(iG4);
                                                    id3FrameD = id3FrameE;
                                                    arrayDeque3 = arrayDeque4;
                                                }
                                                parsableByteArray.F(iG4);
                                                arrayDeque3 = arrayDeque4;
                                            }
                                            if (id3FrameD != null) {
                                                arrayList2.add(id3FrameD);
                                            }
                                            i23 = i27;
                                            i17 = i25;
                                            arrayDeque4 = arrayDeque3;
                                            i12 = 1;
                                            i21 = 4;
                                        }
                                        i10 = i17;
                                        arrayDeque2 = arrayDeque4;
                                        if (!arrayList2.isEmpty()) {
                                            metadata7 = new Metadata(arrayList2);
                                            break;
                                        }
                                    } else {
                                        parsableByteArray.F(i22 + iG3);
                                        arrayDeque4 = arrayDeque4;
                                        i12 = 1;
                                        i14 = 1768715124;
                                        i21 = 4;
                                    }
                                } else {
                                    i10 = i17;
                                    arrayDeque2 = arrayDeque4;
                                }
                                metadata7 = null;
                                break;
                            }
                        } else {
                            i10 = i17;
                            arrayDeque2 = arrayDeque4;
                            if (iG2 == 1936553057) {
                                parsableByteArray.F(i18);
                                int i32 = i18 + iG;
                                parsableByteArray.G(i15);
                                while (true) {
                                    int i33 = parsableByteArray.f18957b;
                                    if (i33 < i32) {
                                        int iG8 = parsableByteArray.g();
                                        if (parsableByteArray.g() != 1935766900) {
                                            parsableByteArray.F(i33 + iG8);
                                        } else if (iG8 >= 14) {
                                            parsableByteArray.G(5);
                                            int iU = parsableByteArray.u();
                                            if (iU == 12 || iU == 13) {
                                                float f = iU == 12 ? 240.0f : 120.0f;
                                                parsableByteArray.G(1);
                                                metadata8 = new Metadata(new SmtaMetadataEntry(f, parsableByteArray.u()));
                                                break;
                                            }
                                        }
                                    }
                                    metadata8 = null;
                                    break;
                                }
                            }
                        }
                        parsableByteArray.F(i18 + iG);
                        i17 = i10;
                        arrayDeque4 = arrayDeque2;
                        i11 = 4;
                        i16 = 1835365473;
                        i12 = 1;
                        i14 = 1768715124;
                        i13 = 1751411826;
                        i15 = 12;
                    }
                    i4 = i17;
                    arrayDeque = arrayDeque4;
                    Pair pairCreate = Pair.create(metadata7, metadata8);
                    metadata2 = (Metadata) pairCreate.first;
                    metadata = (Metadata) pairCreate.second;
                    if (metadata2 != null) {
                        gaplessInfoHolder.b(metadata2);
                    }
                    i5 = 1835365473;
                } else {
                    i4 = 8;
                    arrayDeque = arrayDeque4;
                    i5 = 1835365473;
                    metadata = null;
                    metadata2 = null;
                }
                Atom.ContainerAtom containerAtomC = containerAtom2.c(i5);
                if (containerAtomC != null) {
                    byte[] bArr2 = AtomParsers.f17754a;
                    Atom.LeafAtom leafAtomD2 = containerAtomC.d(1751411826);
                    Atom.LeafAtom leafAtomD3 = containerAtomC.d(1801812339);
                    Atom.LeafAtom leafAtomD4 = containerAtomC.d(1768715124);
                    if (leafAtomD2 == null || leafAtomD3 == null || leafAtomD4 == null) {
                        metadata3 = metadata2;
                        containerAtom = containerAtom2;
                        metadata4 = null;
                    } else {
                        ParsableByteArray parsableByteArray2 = leafAtomD2.f17753b;
                        parsableByteArray2.F(16);
                        if (parsableByteArray2.g() != 1835299937) {
                            metadata3 = metadata2;
                            containerAtom = containerAtom2;
                        } else {
                            ParsableByteArray parsableByteArray3 = leafAtomD3.f17753b;
                            parsableByteArray3.F(12);
                            int iG9 = parsableByteArray3.g();
                            String[] strArr = new String[iG9];
                            for (int i34 = 0; i34 < iG9; i34++) {
                                int iG10 = parsableByteArray3.g();
                                parsableByteArray3.G(4);
                                strArr[i34] = parsableByteArray3.s(iG10 - 8, Charsets.f19705c);
                            }
                            ParsableByteArray parsableByteArray4 = leafAtomD4.f17753b;
                            int i35 = i4;
                            parsableByteArray4.F(i35);
                            ArrayList arrayList3 = new ArrayList();
                            while (parsableByteArray4.a() > i35) {
                                int i36 = parsableByteArray4.f18957b;
                                int iG11 = parsableByteArray4.g();
                                int iG12 = parsableByteArray4.g() - 1;
                                if (iG12 < 0 || iG12 >= iG9) {
                                    metadata6 = metadata2;
                                    iG9 = iG9;
                                    containerAtom2 = containerAtom2;
                                    Z.s(iG12, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str2 = strArr[iG12];
                                    int i37 = i36 + iG11;
                                    while (true) {
                                        int i38 = parsableByteArray4.f18957b;
                                        if (i38 >= i37) {
                                            metadata6 = metadata2;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int iG13 = parsableByteArray4.g();
                                        metadata6 = metadata2;
                                        int i39 = i37;
                                        if (parsableByteArray4.g() == 1684108385) {
                                            int iG14 = parsableByteArray4.g();
                                            int iG15 = parsableByteArray4.g();
                                            int i40 = iG13 - 16;
                                            byte[] bArr3 = new byte[i40];
                                            parsableByteArray4.e(bArr3, 0, i40);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(str2, bArr3, iG15, iG14);
                                            break;
                                        }
                                        parsableByteArray4.F(i38 + iG13);
                                        metadata2 = metadata6;
                                        i37 = i39;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList3.add(mdtaMetadataEntry);
                                    }
                                }
                                parsableByteArray4.F(i36 + iG11);
                                metadata2 = metadata6;
                                iG9 = iG9;
                                containerAtom2 = containerAtom2;
                                i35 = 8;
                            }
                            metadata3 = metadata2;
                            containerAtom = containerAtom2;
                            if (!arrayList3.isEmpty()) {
                                metadata4 = new Metadata(arrayList3);
                            }
                        }
                        metadata4 = null;
                    }
                } else {
                    metadata3 = metadata2;
                    containerAtom = containerAtom2;
                    metadata4 = null;
                }
                int i41 = -1;
                i2 = 4;
                ArrayList arrayListE = AtomParsers.e(containerAtom, gaplessInfoHolder, -9223372036854775807L, null, false, z2, new f(20));
                int size = arrayListE.size();
                int size2 = -1;
                int i42 = 0;
                long jMax = -9223372036854775807L;
                while (i42 < size) {
                    TrackSampleTable trackSampleTable = (TrackSampleTable) arrayListE.get(i42);
                    if (trackSampleTable.f17850b == 0) {
                        metadata5 = metadata;
                        i7 = i41;
                    } else {
                        Track track = trackSampleTable.f17849a;
                        long j2 = track.f17833e;
                        if (j2 == -9223372036854775807L) {
                            j2 = trackSampleTable.f17853h;
                        }
                        jMax = Math.max(jMax, j2);
                        ExtractorOutput extractorOutput = this.q;
                        int i43 = track.f17831b;
                        Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, extractorOutput.track(i42, i43));
                        Format format = track.f;
                        boolean zEquals = "audio/true-hd".equals(format.m0);
                        int i44 = trackSampleTable.f17852e;
                        int i45 = zEquals ? i44 * 16 : i44 + 30;
                        Format.Builder builderA = format.a();
                        builderA.f17087l = i45;
                        if (i43 != 2 || j2 <= 0) {
                            i6 = 1;
                        } else {
                            int i46 = trackSampleTable.f17850b;
                            i6 = 1;
                            if (i46 > 1) {
                                builderA.r = i46 / (j2 / 1000000.0f);
                                i6 = 1;
                            }
                        }
                        if (i43 == i6 && (i8 = gaplessInfoHolder.f17548a) != -1 && (i9 = gaplessInfoHolder.f17549b) != -1) {
                            builderA.f17077A = i8;
                            builderA.f17078B = i9;
                        }
                        ArrayList arrayList4 = this.g;
                        Metadata[] metadataArr = {metadata, arrayList4.isEmpty() ? null : new Metadata(arrayList4)};
                        Metadata metadata9 = new Metadata(new Metadata.Entry[0]);
                        if (i43 != 1) {
                            if (i43 == 2 && metadata4 != null) {
                                int i47 = 0;
                                while (true) {
                                    Metadata.Entry[] entryArr = metadata4.X;
                                    metadata5 = metadata;
                                    if (i47 >= entryArr.length) {
                                        break;
                                    }
                                    Metadata.Entry entry = entryArr[i47];
                                    if (entry instanceof MdtaMetadataEntry) {
                                        MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry;
                                        if ("com.android.capture.fps".equals(mdtaMetadataEntry2.X)) {
                                            metadata9 = new Metadata(mdtaMetadataEntry2);
                                            break;
                                        }
                                    }
                                    i47++;
                                    metadata = metadata5;
                                }
                            } else {
                                metadata5 = metadata;
                            }
                        } else if (metadata3 != null) {
                            metadata5 = metadata;
                            metadata9 = metadata3;
                        } else {
                            metadata5 = metadata;
                        }
                        for (int i48 = 0; i48 < 2; i48++) {
                            Metadata metadata10 = metadataArr[i48];
                            if (metadata10 != null) {
                                metadata9 = metadata9.a(metadata10.X);
                            }
                        }
                        if (metadata9.X.length > 0) {
                            builderA.f17086i = metadata9;
                        }
                        mp4Track.f17818c.c(new Format(builderA));
                        i7 = -1;
                        if (i43 == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(mp4Track);
                    }
                    i42++;
                    i41 = i7;
                    arrayListE = arrayListE;
                    size = size;
                    metadata = metadata5;
                }
                int i49 = i41;
                this.t = size2;
                this.f17815u = jMax;
                Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList.toArray(new Mp4Track[0]);
                this.r = mp4TrackArr;
                long[][] jArr = new long[mp4TrackArr.length][];
                int[] iArr = new int[mp4TrackArr.length];
                long[] jArr2 = new long[mp4TrackArr.length];
                boolean[] zArr = new boolean[mp4TrackArr.length];
                for (int i50 = 0; i50 < mp4TrackArr.length; i50++) {
                    jArr[i50] = new long[mp4TrackArr[i50].f17817b.f17850b];
                    jArr2[i50] = mp4TrackArr[i50].f17817b.f[0];
                }
                long j3 = 0;
                int i51 = 0;
                while (i51 < mp4TrackArr.length) {
                    long j4 = Long.MAX_VALUE;
                    int i52 = i49;
                    for (int i53 = 0; i53 < mp4TrackArr.length; i53++) {
                        if (!zArr[i53]) {
                            long j5 = jArr2[i53];
                            if (j5 <= j4) {
                                i52 = i53;
                                j4 = j5;
                            }
                        }
                    }
                    int i54 = iArr[i52];
                    long[] jArr3 = jArr[i52];
                    jArr3[i54] = j3;
                    TrackSampleTable trackSampleTable2 = mp4TrackArr[i52].f17817b;
                    j3 += (long) trackSampleTable2.d[i54];
                    int i55 = i54 + 1;
                    iArr[i52] = i55;
                    if (i55 < jArr3.length) {
                        jArr2[i52] = trackSampleTable2.f[i55];
                    } else {
                        zArr[i52] = true;
                        i51++;
                    }
                }
                i3 = 1;
                this.s = jArr;
                this.q.endTracks();
                this.q.g(this);
                arrayDeque.clear();
                this.f17810h = 2;
            } else {
                i2 = i11;
                i3 = i12;
                if (!arrayDeque4.isEmpty()) {
                    ((Atom.ContainerAtom) arrayDeque4.peek()).d.add(containerAtom2);
                }
            }
            i11 = i2;
            i12 = i3;
        }
        if (this.f17810h != 2) {
            this.f17810h = 0;
            this.k = 0;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.f17815u;
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
    @Override // com.google.android.exoplayer2.extractor.SeekMap
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
        int iF;
        int[] iArr;
        long[] jArr2;
        int iF2;
        int iA;
        Mp4Track[] mp4TrackArr2 = this.r;
        int length = mp4TrackArr2.length;
        SeekPoint seekPoint = SeekPoint.f17559c;
        if (length == 0) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i4 = this.t;
        boolean z2 = false;
        int i5 = -1;
        long jMin2 = -1;
        if (i4 != -1) {
            TrackSampleTable trackSampleTable2 = mp4TrackArr2[i4].f17817b;
            long[] jArr3 = trackSampleTable2.f;
            int iF3 = Util.f(jArr3, j, false);
            while (true) {
                if (iF3 < 0) {
                    iF3 = -1;
                    break;
                }
                if ((trackSampleTable2.g[iF3] & 1) != 0) {
                    break;
                }
                iF3--;
            }
            if (iF3 == -1) {
                iF3 = trackSampleTable2.a(j);
            }
            if (iF3 == -1) {
                return new SeekMap.SeekPoints(seekPoint, seekPoint);
            }
            j4 = jArr3[iF3];
            long[] jArr4 = trackSampleTable2.f17851c;
            j3 = jArr4[iF3];
            if (j4 < j) {
                j2 = -9223372036854775807L;
                if (iF3 < trackSampleTable2.f17850b - 1 && (iA = trackSampleTable2.a(j)) != -1 && iA != iF3) {
                    j5 = jArr3[iA];
                    jMin2 = jArr4[iA];
                }
                i2 = 0;
                jMin = j3;
                while (true) {
                    mp4TrackArr = this.r;
                    if (i2 < mp4TrackArr.length) {
                        break;
                    }
                    if (i2 != this.t) {
                        trackSampleTable = mp4TrackArr[i2].f17817b;
                        jArr = trackSampleTable.f;
                        iF = Util.f(jArr, j4, z2);
                        while (true) {
                            iArr = trackSampleTable.g;
                            if (iF >= 0) {
                                iF = i5;
                                break;
                            }
                            if ((iArr[iF] & 1) != 0) {
                                break;
                            }
                            iF--;
                        }
                        if (iF == i5) {
                            iF = trackSampleTable.a(j4);
                        }
                        jArr2 = trackSampleTable.f17851c;
                        if (iF == i5) {
                            jMin = Math.min(jArr2[iF], jMin);
                        }
                        if (j5 != j2) {
                            iF2 = Util.f(jArr, j5, false);
                            while (true) {
                                if (iF2 >= 0) {
                                    iF2 = -1;
                                    break;
                                }
                                if ((iArr[iF2] & 1) != 0) {
                                    break;
                                }
                                iF2--;
                            }
                            i3 = -1;
                            if (iF2 == -1) {
                                iF2 = trackSampleTable.a(j5);
                            }
                            if (iF2 == -1) {
                                jMin2 = Math.min(jArr2[iF2], jMin2);
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
            mp4TrackArr = this.r;
            if (i2 < mp4TrackArr.length) {
                break;
                break;
            }
            if (i2 != this.t) {
                trackSampleTable = mp4TrackArr[i2].f17817b;
                jArr = trackSampleTable.f;
                iF = Util.f(jArr, j4, z2);
                while (true) {
                    iArr = trackSampleTable.g;
                    if (iF >= 0) {
                        iF = i5;
                        break;
                    }
                    if ((iArr[iF] & 1) != 0) {
                        break;
                        break;
                    }
                    iF--;
                }
                if (iF == i5) {
                    iF = trackSampleTable.a(j4);
                }
                jArr2 = trackSampleTable.f17851c;
                if (iF == i5) {
                    jMin = Math.min(jArr2[iF], jMin);
                }
                if (j5 != j2) {
                    iF2 = Util.f(jArr, j5, false);
                    while (true) {
                        if (iF2 >= 0) {
                            iF2 = -1;
                            break;
                        }
                        if ((iArr[iF2] & 1) != 0) {
                            break;
                            break;
                        }
                        iF2--;
                    }
                    i3 = -1;
                    if (iF2 == -1) {
                        iF2 = trackSampleTable.a(j5);
                    }
                    if (iF2 == -1) {
                        jMin2 = Math.min(jArr2[iF2], jMin2);
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

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f17809e.clear();
        this.k = 0;
        this.m = -1;
        this.f17813n = 0;
        this.o = 0;
        this.f17814p = 0;
        if (j == 0) {
            if (this.f17810h != 3) {
                this.f17810h = 0;
                this.k = 0;
                return;
            } else {
                SefReader sefReader = this.f;
                sefReader.f17824a.clear();
                sefReader.f17825b = 0;
                this.g.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.r) {
            TrackSampleTable trackSampleTable = mp4Track.f17817b;
            int iF = Util.f(trackSampleTable.f, j2, false);
            while (true) {
                if (iF < 0) {
                    iF = -1;
                    break;
                } else if ((trackSampleTable.g[iF] & 1) != 0) {
                    break;
                } else {
                    iF--;
                }
            }
            if (iF == -1) {
                iF = trackSampleTable.a(j2);
            }
            mp4Track.f17819e = iF;
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.d;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.f17566b = false;
                trueHdSampleRechunker.f17567c = 0;
            }
        }
    }
}
