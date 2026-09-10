package androidx.media3.extractor.mp4;

import A.C0880a0;
import android.support.v4.media.a;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class FragmentedMp4Extractor implements Extractor {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Format f7081I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f7082A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f7083B;
    public boolean C;
    public ExtractorOutput D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TrackOutput[] f7084E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TrackOutput[] f7085F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubtitleParser.Factory f7086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7088c;
    public final SparseArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ParsableByteArray f7089e;
    public final ParsableByteArray f;
    public final ParsableByteArray g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f7090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ParsableByteArray f7091i;
    public final EventMessageEncoder j;
    public final ParsableByteArray k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f7092l;
    public final ArrayDeque m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImmutableList f7093n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7094p;
    public long q;
    public int r;
    public ParsableByteArray s;
    public long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7095u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f7096w;
    public long x;
    public TrackBundle y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7097z;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class MetadataSampleInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7100c;

        public MetadataSampleInfo(long j, boolean z2, int i2) {
            this.f7098a = j;
            this.f7099b = z2;
            this.f7100c = i2;
        }
    }

    public static final class TrackBundle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackOutput f7101a;
        public TrackSampleTable d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DefaultSampleValues f7104e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7105h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7106i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f7107l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackFragment f7102b = new TrackFragment();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParsableByteArray f7103c = new ParsableByteArray();
        public final ParsableByteArray j = new ParsableByteArray(1);
        public final ParsableByteArray k = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.f7101a = trackOutput;
            this.d = trackSampleTable;
            this.f7104e = defaultSampleValues;
            this.d = trackSampleTable;
            this.f7104e = defaultSampleValues;
            trackOutput.b(trackSampleTable.f7158a.f);
            d();
        }

        public final TrackEncryptionBox a() {
            if (!this.f7107l) {
                return null;
            }
            TrackFragment trackFragment = this.f7102b;
            DefaultSampleValues defaultSampleValues = trackFragment.f7149a;
            int i2 = Util.f5683a;
            int i3 = defaultSampleValues.f7078a;
            TrackEncryptionBox trackEncryptionBox = trackFragment.m;
            if (trackEncryptionBox == null) {
                trackEncryptionBox = this.d.f7158a.k[i3];
            }
            if (trackEncryptionBox == null || !trackEncryptionBox.f7145a) {
                return null;
            }
            return trackEncryptionBox;
        }

        public final boolean b() {
            this.f++;
            if (!this.f7107l) {
                return false;
            }
            int i2 = this.g + 1;
            this.g = i2;
            int[] iArr = this.f7102b.g;
            int i3 = this.f7105h;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.f7105h = i3 + 1;
            this.g = 0;
            return false;
        }

        public final int c(int i2, int i3) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox trackEncryptionBoxA = a();
            if (trackEncryptionBoxA == null) {
                return 0;
            }
            TrackFragment trackFragment = this.f7102b;
            int length = trackEncryptionBoxA.d;
            if (length != 0) {
                parsableByteArray = trackFragment.f7156n;
            } else {
                int i4 = Util.f5683a;
                byte[] bArr = trackEncryptionBoxA.f7148e;
                int length2 = bArr.length;
                ParsableByteArray parsableByteArray2 = this.k;
                parsableByteArray2.E(bArr, length2);
                length = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean z2 = trackFragment.k && trackFragment.f7155l[this.f];
            boolean z3 = z2 || i3 != 0;
            ParsableByteArray parsableByteArray3 = this.j;
            parsableByteArray3.f5667a[0] = (byte) ((z3 ? 128 : 0) | length);
            parsableByteArray3.G(0);
            TrackOutput trackOutput = this.f7101a;
            trackOutput.a(parsableByteArray3, 1, 1);
            trackOutput.a(parsableByteArray, length, 1);
            if (!z3) {
                return length + 1;
            }
            ParsableByteArray parsableByteArray4 = this.f7103c;
            if (!z2) {
                parsableByteArray4.D(8);
                byte[] bArr2 = parsableByteArray4.f5667a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) (i3 & 255);
                bArr2[4] = (byte) ((i2 >> 24) & 255);
                bArr2[5] = (byte) ((i2 >> 16) & 255);
                bArr2[6] = (byte) ((i2 >> 8) & 255);
                bArr2[7] = (byte) (i2 & 255);
                trackOutput.a(parsableByteArray4, 8, 1);
                return length + 9;
            }
            ParsableByteArray parsableByteArray5 = trackFragment.f7156n;
            int iA = parsableByteArray5.A();
            parsableByteArray5.H(-2);
            int i5 = (iA * 6) + 2;
            if (i3 != 0) {
                parsableByteArray4.D(i5);
                byte[] bArr3 = parsableByteArray4.f5667a;
                parsableByteArray5.e(bArr3, 0, i5);
                int i6 = (((bArr3[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr3[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i3;
                bArr3[2] = (byte) ((i6 >> 8) & 255);
                bArr3[3] = (byte) (i6 & 255);
            } else {
                parsableByteArray4 = parsableByteArray5;
            }
            trackOutput.a(parsableByteArray4, i5, 1);
            return length + 1 + i5;
        }

        public final void d() {
            TrackFragment trackFragment = this.f7102b;
            trackFragment.d = 0;
            trackFragment.f7157p = 0L;
            trackFragment.q = false;
            trackFragment.k = false;
            trackFragment.o = false;
            trackFragment.m = null;
            this.f = 0;
            this.f7105h = 0;
            this.g = 0;
            this.f7106i = 0;
            this.f7107l = false;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.f5429l = MimeTypes.l("application/x-emsg");
        f7081I = new Format(builder);
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i2) {
        ImmutableList immutableListX = ImmutableList.x();
        this.f7086a = factory;
        this.f7087b = i2;
        this.f7088c = Collections.unmodifiableList(immutableListX);
        this.j = new EventMessageEncoder();
        this.k = new ParsableByteArray(16);
        this.f7089e = new ParsableByteArray(NalUnitUtil.f5695a);
        this.f = new ParsableByteArray(5);
        this.g = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.f7090h = bArr;
        this.f7091i = new ParsableByteArray(bArr);
        this.f7092l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.d = new SparseArray();
        this.f7093n = ImmutableList.x();
        this.f7096w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.D = ExtractorOutput.M8;
        this.f7084E = new TrackOutput[0];
        this.f7085F = new TrackOutput[0];
    }

    public static DrmInitData a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Atom.LeafAtom leafAtom = (Atom.LeafAtom) arrayList.get(i2);
            if (leafAtom.f7053a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = leafAtom.f7056b.f5667a;
                PsshAtomUtil.PsshAtom psshAtomA = PsshAtomUtil.a(bArr);
                UUID uuid = psshAtomA == null ? null : psshAtomA.f7129a;
                if (uuid == null) {
                    Log.g("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void g(ParsableByteArray parsableByteArray, int i2, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.G(i2 + 8);
        int iG = parsableByteArray.g();
        if ((iG & 1) != 0) {
            throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iG & 2) != 0;
        int iY = parsableByteArray.y();
        if (iY == 0) {
            Arrays.fill(trackFragment.f7155l, 0, trackFragment.f7152e, false);
            return;
        }
        if (iY != trackFragment.f7152e) {
            StringBuilder sbU = a.u(iY, "Senc sample count ", " is different from fragment sample count");
            sbU.append(trackFragment.f7152e);
            throw ParserException.a(null, sbU.toString());
        }
        Arrays.fill(trackFragment.f7155l, 0, iY, z2);
        int iA = parsableByteArray.a();
        ParsableByteArray parsableByteArray2 = trackFragment.f7156n;
        parsableByteArray2.D(iA);
        trackFragment.k = true;
        trackFragment.o = true;
        parsableByteArray.e(parsableByteArray2.f5667a, 0, parsableByteArray2.f5669c);
        parsableByteArray2.G(0);
        trackFragment.o = false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        SniffFailure sniffFailureB = Sniffer.b(extractorInput, true, false);
        this.f7093n = sniffFailureB != null ? ImmutableList.z(sniffFailureB) : ImmutableList.x();
        return sniffFailureB == null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        int i2;
        int i3 = this.f7087b;
        if ((i3 & 32) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.f7086a);
        }
        this.D = extractorOutput;
        int i4 = 0;
        this.o = 0;
        this.r = 0;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.f7084E = trackOutputArr;
        int i5 = 100;
        if ((i3 & 4) != 0) {
            trackOutputArr[0] = extractorOutput.track(100, 5);
            i2 = 1;
            i5 = 101;
        } else {
            i2 = 0;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.K(this.f7084E, i2);
        this.f7084E = trackOutputArr2;
        for (TrackOutput trackOutput : trackOutputArr2) {
            trackOutput.b(f7081I);
        }
        List list = this.f7088c;
        this.f7085F = new TrackOutput[list.size()];
        while (i4 < this.f7085F.length) {
            TrackOutput trackOutputTrack = this.D.track(i5, 3);
            trackOutputTrack.b((Format) list.get(i4));
            this.f7085F[i4] = trackOutputTrack;
            i4++;
            i5++;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final List e() {
        return this.f7093n;
    }

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
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        ExtractorInput extractorInput2;
        ArrayDeque arrayDeque;
        ArrayDeque arrayDeque2;
        String strP;
        String strP2;
        long jO;
        long jW;
        long j;
        long jO2;
        long j2;
        long jZ;
        long jZ2;
        TrackBundle trackBundle;
        int i2;
        char c2;
        int i3;
        int i4;
        char c3;
        boolean z2;
        int iC;
        int i5;
        loop0: while (true) {
            extractorInput2 = extractorInput;
            while (true) {
                int i6 = 1;
                while (true) {
                    int i7 = this.o;
                    arrayDeque = this.f7092l;
                    SparseArray sparseArray = this.d;
                    char c4 = 2;
                    if (i7 != 0) {
                        arrayDeque2 = this.m;
                        if (i7 != i6) {
                            long j3 = Long.MAX_VALUE;
                            if (i7 != 2) {
                                trackBundle = this.y;
                                if (trackBundle != null) {
                                    i2 = i6;
                                    c2 = 2;
                                    i3 = 8;
                                    break loop0;
                                }
                                int size = sparseArray.size();
                                long j4 = Long.MAX_VALUE;
                                TrackBundle trackBundle2 = null;
                                int i8 = 0;
                                while (i8 < size) {
                                    char c5 = c4;
                                    TrackBundle trackBundle3 = (TrackBundle) sparseArray.valueAt(i8);
                                    boolean z3 = trackBundle3.f7107l;
                                    if (z3) {
                                        i5 = i6;
                                    } else {
                                        i5 = i6;
                                        if (trackBundle3.f != trackBundle3.d.f7159b) {
                                        }
                                        i8++;
                                        c4 = c5;
                                        i6 = i5;
                                    }
                                    TrackFragment trackFragment = trackBundle3.f7102b;
                                    if (!z3 || trackBundle3.f7105h != trackFragment.d) {
                                        long j5 = !z3 ? trackBundle3.d.f7160c[trackBundle3.f] : trackFragment.f[trackBundle3.f7105h];
                                        if (j5 < j4) {
                                            trackBundle2 = trackBundle3;
                                            j4 = j5;
                                        }
                                    }
                                    i8++;
                                    c4 = c5;
                                    i6 = i5;
                                }
                                i2 = i6;
                                c2 = c4;
                                i3 = 8;
                                if (trackBundle2 != null) {
                                    int i9 = (int) ((!trackBundle2.f7107l ? trackBundle2.d.f7160c[trackBundle2.f] : trackBundle2.f7102b.f[trackBundle2.f7105h]) - ((DefaultExtractorInput) extractorInput2).d);
                                    if (i9 < 0) {
                                        Log.g("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        i9 = 0;
                                    }
                                    ((DefaultExtractorInput) extractorInput2).skipFully(i9);
                                    this.y = trackBundle2;
                                    trackBundle = trackBundle2;
                                    break loop0;
                                }
                                int i10 = (int) (this.t - ((DefaultExtractorInput) extractorInput2).d);
                                if (i10 < 0) {
                                    throw ParserException.a(null, "Offset to end of mdat was negative.");
                                }
                                ((DefaultExtractorInput) extractorInput2).skipFully(i10);
                                this.o = 0;
                                this.r = 0;
                                i6 = i2;
                            } else {
                                int size2 = sparseArray.size();
                                TrackBundle trackBundle4 = null;
                                for (int i11 = 0; i11 < size2; i11++) {
                                    TrackFragment trackFragment2 = ((TrackBundle) sparseArray.valueAt(i11)).f7102b;
                                    if (trackFragment2.o) {
                                        long j6 = trackFragment2.f7151c;
                                        if (j6 < j3) {
                                            trackBundle4 = (TrackBundle) sparseArray.valueAt(i11);
                                            j3 = j6;
                                        }
                                    }
                                }
                                if (trackBundle4 == null) {
                                    this.o = 3;
                                } else {
                                    int i12 = (int) (j3 - ((DefaultExtractorInput) extractorInput2).d);
                                    if (i12 < 0) {
                                        throw ParserException.a(null, "Offset to encryption data was negative.");
                                    }
                                    DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput2;
                                    defaultExtractorInput.skipFully(i12);
                                    TrackFragment trackFragment3 = trackBundle4.f7102b;
                                    ParsableByteArray parsableByteArray = trackFragment3.f7156n;
                                    defaultExtractorInput.readFully(parsableByteArray.f5667a, 0, parsableByteArray.f5669c, false);
                                    parsableByteArray.G(0);
                                    trackFragment3.o = false;
                                }
                            }
                        }
                    } else {
                        int i13 = this.r;
                        ParsableByteArray parsableByteArray2 = this.k;
                        if (i13 == 0) {
                            if (!((DefaultExtractorInput) extractorInput).readFully(parsableByteArray2.f5667a, 0, 8, true)) {
                                return -1;
                            }
                            this.r = 8;
                            parsableByteArray2.G(0);
                            this.q = parsableByteArray2.w();
                            this.f7094p = parsableByteArray2.g();
                        }
                        long j7 = this.q;
                        if (j7 == 1) {
                            ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray2.f5667a, 8, 8, false);
                            this.r += 8;
                            this.q = parsableByteArray2.z();
                        } else if (j7 == 0) {
                            long j8 = ((DefaultExtractorInput) extractorInput).f6741c;
                            if (j8 == -1 && !arrayDeque.isEmpty()) {
                                j8 = ((Atom.ContainerAtom) arrayDeque.peek()).f7054b;
                            }
                            if (j8 != -1) {
                                this.q = (j8 - ((DefaultExtractorInput) extractorInput).d) + ((long) this.r);
                            }
                        }
                        long j9 = this.q;
                        int i14 = this.r;
                        if (j9 < i14) {
                            throw ParserException.b("Atom size less than header length (unsupported).");
                        }
                        long j10 = ((DefaultExtractorInput) extractorInput).d - ((long) i14);
                        int i15 = this.f7094p;
                        if ((i15 == 1836019558 || i15 == 1835295092) && !this.G) {
                            this.D.e(new SeekMap.Unseekable(this.f7096w, j10));
                            this.G = true;
                        }
                        if (this.f7094p == 1836019558) {
                            int size3 = sparseArray.size();
                            for (int i16 = 0; i16 < size3; i16++) {
                                TrackFragment trackFragment4 = ((TrackBundle) sparseArray.valueAt(i16)).f7102b;
                                trackFragment4.getClass();
                                trackFragment4.f7151c = j10;
                                trackFragment4.f7150b = j10;
                            }
                        }
                        int i17 = this.f7094p;
                        if (i17 == 1835295092) {
                            this.y = null;
                            this.t = j10 + this.q;
                            this.o = 2;
                            i6 = 1;
                        } else if (i17 == 1836019574 || i17 == 1953653099 || i17 == 1835297121 || i17 == 1835626086 || i17 == 1937007212 || i17 == 1836019558 || i17 == 1953653094 || i17 == 1836475768 || i17 == 1701082227) {
                            i6 = 1;
                            long j11 = (((DefaultExtractorInput) extractorInput).d + this.q) - 8;
                            arrayDeque.push(new Atom.ContainerAtom(i17, j11));
                            if (this.q == this.r) {
                                h(j11);
                            } else {
                                this.o = 0;
                                this.r = 0;
                            }
                        } else if (i17 == 1751411826 || i17 == 1835296868 || i17 == 1836476516 || i17 == 1936286840 || i17 == 1937011556 || i17 == 1937011827 || i17 == 1668576371 || i17 == 1937011555 || i17 == 1937011578 || i17 == 1937013298 || i17 == 1937007471 || i17 == 1668232756 || i17 == 1937011571 || i17 == 1952867444 || i17 == 1952868452 || i17 == 1953196132 || i17 == 1953654136 || i17 == 1953658222 || i17 == 1886614376 || i17 == 1935763834 || i17 == 1935763823 || i17 == 1936027235 || i17 == 1970628964 || i17 == 1935828848 || i17 == 1936158820 || i17 == 1701606260 || i17 == 1835362404 || i17 == 1701671783) {
                            if (this.r != 8) {
                                throw ParserException.b("Leaf atom defines extended atom size (unsupported).");
                            }
                            if (this.q > 2147483647L) {
                                throw ParserException.b("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            ParsableByteArray parsableByteArray3 = new ParsableByteArray((int) this.q);
                            System.arraycopy(parsableByteArray2.f5667a, 0, parsableByteArray3.f5667a, 0, 8);
                            this.s = parsableByteArray3;
                            i6 = 1;
                            this.o = 1;
                        } else {
                            if (this.q > 2147483647L) {
                                throw ParserException.b("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            this.s = null;
                            i6 = 1;
                            this.o = 1;
                        }
                        extractorInput2 = extractorInput;
                    }
                }
            }
            int i18 = ((int) this.q) - this.r;
            ParsableByteArray parsableByteArray4 = this.s;
            if (parsableByteArray4 != null) {
                ((DefaultExtractorInput) extractorInput2).readFully(parsableByteArray4.f5667a, 8, i18, false);
                int i19 = this.f7094p;
                Atom.LeafAtom leafAtom = new Atom.LeafAtom(i19, parsableByteArray4);
                long j12 = ((DefaultExtractorInput) extractorInput2).d;
                if (!arrayDeque.isEmpty()) {
                    ((Atom.ContainerAtom) arrayDeque.peek()).f7055c.add(leafAtom);
                } else if (i19 == 1936286840) {
                    parsableByteArray4.G(8);
                    int iB = Atom.b(parsableByteArray4.g());
                    parsableByteArray4.H(4);
                    long jW2 = parsableByteArray4.w();
                    if (iB == 0) {
                        jZ = parsableByteArray4.w();
                        jZ2 = parsableByteArray4.w();
                    } else {
                        jZ = parsableByteArray4.z();
                        jZ2 = parsableByteArray4.z();
                    }
                    long j13 = jZ2 + j12;
                    long j14 = jZ;
                    int i20 = Util.f5683a;
                    long jO3 = Util.O(j14, 1000000L, jW2, RoundingMode.FLOOR);
                    parsableByteArray4.H(2);
                    int iA = parsableByteArray4.A();
                    int[] iArr = new int[iA];
                    long[] jArr = new long[iA];
                    long[] jArr2 = new long[iA];
                    long[] jArr3 = new long[iA];
                    long jO4 = jO3;
                    long j15 = j13;
                    int i21 = 0;
                    while (i21 < iA) {
                        int iG = parsableByteArray4.g();
                        if ((iG & Integer.MIN_VALUE) != 0) {
                            throw ParserException.a(null, "Unhandled indirect reference");
                        }
                        long jW3 = parsableByteArray4.w();
                        iArr[i21] = iG & Integer.MAX_VALUE;
                        jArr[i21] = j15;
                        jArr3[i21] = jO4;
                        j14 += jW3;
                        jO4 = Util.O(j14, 1000000L, jW2, RoundingMode.FLOOR);
                        jArr2[i21] = jO4 - jArr3[i21];
                        parsableByteArray4.H(4);
                        j15 += (long) iArr[i21];
                        i21++;
                        jO3 = jO3;
                    }
                    Pair pairCreate = Pair.create(Long.valueOf(jO3), new ChunkIndex(iArr, jArr, jArr2, jArr3));
                    this.x = ((Long) pairCreate.first).longValue();
                    this.D.e((SeekMap) pairCreate.second);
                    this.G = true;
                } else if (i19 == 1701671783 && this.f7084E.length != 0) {
                    parsableByteArray4.G(8);
                    int iB2 = Atom.b(parsableByteArray4.g());
                    if (iB2 == 0) {
                        strP = parsableByteArray4.p();
                        strP.getClass();
                        strP2 = parsableByteArray4.p();
                        strP2.getClass();
                        long jW4 = parsableByteArray4.w();
                        long jW5 = parsableByteArray4.w();
                        RoundingMode roundingMode = RoundingMode.FLOOR;
                        long jO5 = Util.O(jW5, 1000000L, jW4, roundingMode);
                        long j16 = this.x;
                        long j17 = j16 != -9223372036854775807L ? j16 + jO5 : -9223372036854775807L;
                        jO = Util.O(parsableByteArray4.w(), 1000L, jW4, roundingMode);
                        jW = parsableByteArray4.w();
                        long j18 = j17;
                        j = jO5;
                        jO2 = j18;
                        j2 = -9223372036854775807L;
                    } else if (iB2 != 1) {
                        androidx.datastore.preferences.protobuf.a.C(iB2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                    } else {
                        long jW6 = parsableByteArray4.w();
                        long jZ3 = parsableByteArray4.z();
                        RoundingMode roundingMode2 = RoundingMode.FLOOR;
                        jO2 = Util.O(jZ3, 1000000L, jW6, roundingMode2);
                        long jO6 = Util.O(parsableByteArray4.w(), 1000L, jW6, roundingMode2);
                        long jW7 = parsableByteArray4.w();
                        strP = parsableByteArray4.p();
                        strP.getClass();
                        strP2 = parsableByteArray4.p();
                        strP2.getClass();
                        j2 = -9223372036854775807L;
                        jW = jW7;
                        jO = jO6;
                        j = -9223372036854775807L;
                    }
                    byte[] bArr = new byte[parsableByteArray4.a()];
                    parsableByteArray4.e(bArr, 0, parsableByteArray4.a());
                    EventMessageEncoder eventMessageEncoder = this.j;
                    ByteArrayOutputStream byteArrayOutputStream = eventMessageEncoder.f6917a;
                    byteArrayOutputStream.reset();
                    DataOutputStream dataOutputStream = eventMessageEncoder.f6918b;
                    try {
                        dataOutputStream.writeBytes(strP);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeBytes(strP2);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeLong(jO);
                        dataOutputStream.writeLong(jW);
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        ParsableByteArray parsableByteArray5 = new ParsableByteArray(byteArrayOutputStream.toByteArray());
                        int iA2 = parsableByteArray5.a();
                        for (TrackOutput trackOutput : this.f7084E) {
                            parsableByteArray5.G(0);
                            trackOutput.e(iA2, parsableByteArray5);
                        }
                        if (jO2 == j2) {
                            arrayDeque2.addLast(new MetadataSampleInfo(j, true, iA2));
                            this.f7095u += iA2;
                        } else if (arrayDeque2.isEmpty()) {
                            for (TrackOutput trackOutput2 : this.f7084E) {
                                trackOutput2.f(jO2, 1, iA2, 0, null);
                            }
                        } else {
                            arrayDeque2.addLast(new MetadataSampleInfo(jO2, false, iA2));
                            this.f7095u += iA2;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            } else {
                ((DefaultExtractorInput) extractorInput).skipFully(i18);
            }
            h(((DefaultExtractorInput) extractorInput).d);
        }
        int i22 = this.o;
        TrackFragment trackFragment5 = trackBundle.f7102b;
        if (i22 == 3) {
            int i23 = !trackBundle.f7107l ? trackBundle.d.d[trackBundle.f] : trackFragment5.f7153h[trackBundle.f];
            this.f7097z = i23;
            if (trackBundle.f < trackBundle.f7106i) {
                ((DefaultExtractorInput) extractorInput2).skipFully(i23);
                TrackEncryptionBox trackEncryptionBoxA = trackBundle.a();
                if (trackEncryptionBoxA != null) {
                    ParsableByteArray parsableByteArray6 = trackFragment5.f7156n;
                    int i24 = trackEncryptionBoxA.d;
                    if (i24 != 0) {
                        parsableByteArray6.H(i24);
                    }
                    int i25 = trackBundle.f;
                    if (trackFragment5.k && trackFragment5.f7155l[i25]) {
                        parsableByteArray6.H(parsableByteArray6.A() * 6);
                    }
                }
                if (!trackBundle.b()) {
                    this.y = null;
                }
                this.o = 3;
                return 0;
            }
            if (trackBundle.d.f7158a.g == i2) {
                this.f7097z = i23 - 8;
                ((DefaultExtractorInput) extractorInput2).skipFully(i3);
            }
            if ("audio/ac4".equals(trackBundle.d.f7158a.f.m)) {
                this.f7082A = trackBundle.c(this.f7097z, 7);
                int i26 = this.f7097z;
                ParsableByteArray parsableByteArray7 = this.f7091i;
                Ac4Util.a(i26, parsableByteArray7);
                trackBundle.f7101a.e(7, parsableByteArray7);
                this.f7082A += 7;
            } else {
                this.f7082A = trackBundle.c(this.f7097z, 0);
            }
            this.f7097z += this.f7082A;
            this.o = 4;
            this.f7083B = 0;
        }
        TrackSampleTable trackSampleTable = trackBundle.d;
        long j19 = trackBundle.f7107l ? trackFragment5.f7154i[trackBundle.f] : trackSampleTable.f[trackBundle.f];
        Track track = trackSampleTable.f7158a;
        int i27 = track.j;
        TrackOutput trackOutput3 = trackBundle.f7101a;
        if (i27 == 0) {
            while (true) {
                int i28 = this.f7082A;
                int i29 = this.f7097z;
                if (i28 >= i29) {
                    break;
                }
                this.f7082A += trackOutput3.c(extractorInput2, i29 - i28, false);
            }
        } else {
            ParsableByteArray parsableByteArray8 = this.f;
            byte[] bArr2 = parsableByteArray8.f5667a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[c2] = 0;
            int i30 = i27 + 1;
            int i31 = 4 - i27;
            while (this.f7082A < this.f7097z) {
                int i32 = this.f7083B;
                Format format = track.f;
                if (i32 == 0) {
                    Track track2 = track;
                    ((DefaultExtractorInput) extractorInput2).readFully(bArr2, i31, i30, false);
                    parsableByteArray8.G(0);
                    int iG2 = parsableByteArray8.g();
                    if (iG2 < 1) {
                        throw ParserException.a(null, "Invalid NAL length");
                    }
                    this.f7083B = iG2 - 1;
                    ParsableByteArray parsableByteArray9 = this.f7089e;
                    parsableByteArray9.G(0);
                    trackOutput3.e(4, parsableByteArray9);
                    trackOutput3.e(1, parsableByteArray8);
                    if (this.f7085F.length > 0) {
                        String str = format.m;
                        int i33 = bArr2[4];
                        if ("video/avc".equals(str)) {
                            i4 = i31;
                            c3 = 6;
                            if ((i33 & 31) != 6) {
                            }
                            z2 = true;
                            this.C = z2;
                            this.f7082A += 5;
                            this.f7097z += i4;
                            track = track2;
                            i31 = i4;
                        } else {
                            i4 = i31;
                            c3 = 6;
                        }
                        if ("video/hevc".equals(str) && ((i33 & 126) >> 1) == 39) {
                            z2 = true;
                        }
                        this.C = z2;
                        this.f7082A += 5;
                        this.f7097z += i4;
                        track = track2;
                        i31 = i4;
                    } else {
                        i4 = i31;
                        c3 = 6;
                    }
                    z2 = false;
                    this.C = z2;
                    this.f7082A += 5;
                    this.f7097z += i4;
                    track = track2;
                    i31 = i4;
                } else {
                    Track track3 = track;
                    int i34 = i31;
                    if (this.C) {
                        ParsableByteArray parsableByteArray10 = this.g;
                        parsableByteArray10.D(i32);
                        ((DefaultExtractorInput) extractorInput2).readFully(parsableByteArray10.f5667a, 0, this.f7083B, false);
                        trackOutput3.e(this.f7083B, parsableByteArray10);
                        iC = this.f7083B;
                        int iF = NalUnitUtil.f(parsableByteArray10.f5667a, parsableByteArray10.f5669c);
                        parsableByteArray10.G("video/hevc".equals(format.m) ? 1 : 0);
                        parsableByteArray10.F(iF);
                        CeaUtil.a(j19, parsableByteArray10, this.f7085F);
                    } else {
                        iC = trackOutput3.c(extractorInput2, i32, false);
                    }
                    this.f7082A += iC;
                    this.f7083B -= iC;
                    i31 = i34;
                    track = track3;
                    parsableByteArray8 = parsableByteArray8;
                    bArr2 = bArr2;
                }
            }
        }
        int i35 = trackBundle.f7107l ? trackFragment5.j[trackBundle.f] ? 1 : 0 : trackBundle.d.g[trackBundle.f];
        if (trackBundle.a() != null) {
            i35 |= 1073741824;
        }
        int i36 = i35;
        TrackEncryptionBox trackEncryptionBoxA2 = trackBundle.a();
        long j20 = j19;
        trackOutput3.f(j20, i36, this.f7097z, 0, trackEncryptionBoxA2 != null ? trackEncryptionBoxA2.f7147c : null);
        while (!arrayDeque2.isEmpty()) {
            MetadataSampleInfo metadataSampleInfo = (MetadataSampleInfo) arrayDeque2.removeFirst();
            this.f7095u -= metadataSampleInfo.f7100c;
            boolean z4 = metadataSampleInfo.f7099b;
            long j21 = metadataSampleInfo.f7098a;
            if (z4) {
                j21 += j20;
            }
            long j22 = j21;
            for (TrackOutput trackOutput4 : this.f7084E) {
                trackOutput4.f(j22, 1, metadataSampleInfo.f7100c, this.f7095u, null);
            }
        }
        if (!trackBundle.b()) {
            this.y = null;
        }
        this.o = 3;
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9  */
    public final void h(long j) throws ParserException {
        DefaultSampleValues defaultSampleValues;
        DefaultSampleValues defaultSampleValues2;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        long[] jArr;
        char c2;
        while (true) {
            ArrayDeque arrayDeque = this.f7092l;
            if (arrayDeque.isEmpty() || ((Atom.ContainerAtom) arrayDeque.peek()).f7054b != j) {
                break;
            }
            Atom.ContainerAtom containerAtom = (Atom.ContainerAtom) arrayDeque.pop();
            int i9 = containerAtom.f7053a;
            SparseArray sparseArray = this.d;
            ArrayList arrayList3 = containerAtom.f7055c;
            int i10 = this.f7087b;
            int i11 = 12;
            int i12 = 1;
            if (i9 == 1836019574) {
                DrmInitData drmInitDataA = a(arrayList3);
                Atom.ContainerAtom containerAtomC = containerAtom.c(1836475768);
                containerAtomC.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList4 = containerAtomC.f7055c;
                int size = arrayList4.size();
                int i13 = 0;
                long jW = -9223372036854775807L;
                while (i13 < size) {
                    Atom.LeafAtom leafAtom = (Atom.LeafAtom) arrayList4.get(i13);
                    int i14 = leafAtom.f7053a;
                    ParsableByteArray parsableByteArray = leafAtom.f7056b;
                    if (i14 == 1953654136) {
                        parsableByteArray.G(i11);
                        i2 = i13;
                        Pair pairCreate = Pair.create(Integer.valueOf(parsableByteArray.g()), new DefaultSampleValues(parsableByteArray.g() - 1, parsableByteArray.g(), parsableByteArray.g(), parsableByteArray.g()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (DefaultSampleValues) pairCreate.second);
                    } else {
                        i2 = i13;
                        if (i14 == 1835362404) {
                            parsableByteArray.G(8);
                            jW = Atom.b(parsableByteArray.g()) == 0 ? parsableByteArray.w() : parsableByteArray.z();
                        }
                    }
                    i13 = i2 + 1;
                    i11 = 12;
                }
                ArrayList arrayListF = AtomParsers.f(containerAtom, new GaplessInfoHolder(), jW, drmInitDataA, (i10 & 16) != 0, false, new C0880a0(this, 2));
                int size2 = arrayListF.size();
                if (sparseArray.size() == 0) {
                    int i15 = 0;
                    while (i15 < size2) {
                        TrackSampleTable trackSampleTable = (TrackSampleTable) arrayListF.get(i15);
                        Track track = trackSampleTable.f7158a;
                        TrackOutput trackOutputTrack = this.D.track(i15, track.f7140b);
                        int size3 = sparseArray2.size();
                        int i16 = track.f7139a;
                        if (size3 == i12) {
                            defaultSampleValues2 = (DefaultSampleValues) sparseArray2.valueAt(0);
                        } else {
                            defaultSampleValues2 = (DefaultSampleValues) sparseArray2.get(i16);
                            defaultSampleValues2.getClass();
                        }
                        sparseArray.put(i16, new TrackBundle(trackOutputTrack, trackSampleTable, defaultSampleValues2));
                        this.f7096w = Math.max(this.f7096w, track.f7142e);
                        i15++;
                        i12 = 1;
                    }
                    this.D.endTracks();
                } else {
                    Assertions.e(sparseArray.size() == size2);
                    for (int i17 = 0; i17 < size2; i17++) {
                        TrackSampleTable trackSampleTable2 = (TrackSampleTable) arrayListF.get(i17);
                        Track track2 = trackSampleTable2.f7158a;
                        TrackBundle trackBundle = (TrackBundle) sparseArray.get(track2.f7139a);
                        if (sparseArray2.size() == 1) {
                            defaultSampleValues = (DefaultSampleValues) sparseArray2.valueAt(0);
                        } else {
                            defaultSampleValues = (DefaultSampleValues) sparseArray2.get(track2.f7139a);
                            defaultSampleValues.getClass();
                        }
                        trackBundle.d = trackSampleTable2;
                        trackBundle.f7104e = defaultSampleValues;
                        trackBundle.f7101a.b(trackSampleTable2.f7158a.f);
                        trackBundle.d();
                    }
                }
            } else {
                int i18 = 16;
                int i19 = 4;
                if (i9 == 1836019558) {
                    ArrayList arrayList5 = containerAtom.d;
                    int size4 = arrayList5.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) arrayList5.get(i20);
                        if (containerAtom2.f7053a == 1953653094) {
                            Atom.LeafAtom leafAtomD = containerAtom2.d(1952868452);
                            leafAtomD.getClass();
                            ParsableByteArray parsableByteArray2 = leafAtomD.f7056b;
                            parsableByteArray2.G(8);
                            int iG = parsableByteArray2.g();
                            TrackBundle trackBundle2 = (TrackBundle) sparseArray.get(parsableByteArray2.g());
                            if (trackBundle2 == null) {
                                trackBundle2 = null;
                            } else {
                                int i21 = iG & 1;
                                TrackFragment trackFragment = trackBundle2.f7102b;
                                if (i21 != 0) {
                                    long jZ = parsableByteArray2.z();
                                    trackFragment.f7150b = jZ;
                                    trackFragment.f7151c = jZ;
                                }
                                DefaultSampleValues defaultSampleValues3 = trackBundle2.f7104e;
                                trackFragment.f7149a = new DefaultSampleValues((iG & 2) != 0 ? parsableByteArray2.g() - 1 : defaultSampleValues3.f7078a, (iG & 8) != 0 ? parsableByteArray2.g() : defaultSampleValues3.f7079b, (iG & 16) != 0 ? parsableByteArray2.g() : defaultSampleValues3.f7080c, (iG & 32) != 0 ? parsableByteArray2.g() : defaultSampleValues3.d);
                            }
                            if (trackBundle2 != null) {
                                TrackFragment trackFragment2 = trackBundle2.f7102b;
                                long j2 = trackFragment2.f7157p;
                                boolean z4 = trackFragment2.q;
                                trackBundle2.d();
                                trackBundle2.f7107l = true;
                                Atom.LeafAtom leafAtomD2 = containerAtom2.d(1952867444);
                                if (leafAtomD2 == null || (i10 & 2) != 0) {
                                    trackFragment2.f7157p = j2;
                                    trackFragment2.q = z4;
                                } else {
                                    ParsableByteArray parsableByteArray3 = leafAtomD2.f7056b;
                                    parsableByteArray3.G(8);
                                    trackFragment2.f7157p = Atom.b(parsableByteArray3.g()) == 1 ? parsableByteArray3.z() : parsableByteArray3.w();
                                    trackFragment2.q = true;
                                }
                                ArrayList arrayList6 = containerAtom2.f7055c;
                                int size5 = arrayList6.size();
                                int i22 = 0;
                                int i23 = 0;
                                int i24 = 0;
                                while (true) {
                                    i7 = 1953658222;
                                    if (i22 >= size5) {
                                        break;
                                    }
                                    ArrayList arrayList7 = arrayList5;
                                    Atom.LeafAtom leafAtom2 = (Atom.LeafAtom) arrayList6.get(i22);
                                    int i25 = size4;
                                    if (leafAtom2.f7053a == 1953658222) {
                                        ParsableByteArray parsableByteArray4 = leafAtom2.f7056b;
                                        parsableByteArray4.G(12);
                                        int iY = parsableByteArray4.y();
                                        if (iY > 0) {
                                            i24 += iY;
                                            i23++;
                                        }
                                    }
                                    i22++;
                                    size4 = i25;
                                    arrayList5 = arrayList7;
                                }
                                arrayList = arrayList5;
                                i3 = size4;
                                trackBundle2.f7105h = 0;
                                trackBundle2.g = 0;
                                trackBundle2.f = 0;
                                trackFragment2.d = i23;
                                trackFragment2.f7152e = i24;
                                if (trackFragment2.g.length < i23) {
                                    trackFragment2.f = new long[i23];
                                    trackFragment2.g = new int[i23];
                                }
                                if (trackFragment2.f7153h.length < i24) {
                                    int i26 = (i24 * 125) / 100;
                                    trackFragment2.f7153h = new int[i26];
                                    trackFragment2.f7154i = new long[i26];
                                    trackFragment2.j = new boolean[i26];
                                    trackFragment2.f7155l = new boolean[i26];
                                }
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    long j3 = 0;
                                    if (i27 >= size5) {
                                        i4 = i20;
                                        arrayList2 = arrayList3;
                                        TrackSampleTable trackSampleTable3 = trackBundle2.d;
                                        DefaultSampleValues defaultSampleValues4 = trackFragment2.f7149a;
                                        defaultSampleValues4.getClass();
                                        TrackEncryptionBox trackEncryptionBox = trackSampleTable3.f7158a.k[defaultSampleValues4.f7078a];
                                        Atom.LeafAtom leafAtomD3 = containerAtom2.d(1935763834);
                                        if (leafAtomD3 != null) {
                                            trackEncryptionBox.getClass();
                                            ParsableByteArray parsableByteArray5 = leafAtomD3.f7056b;
                                            parsableByteArray5.G(8);
                                            if ((parsableByteArray5.g() & 1) == 1) {
                                                parsableByteArray5.H(8);
                                            }
                                            int iU = parsableByteArray5.u();
                                            int iY2 = parsableByteArray5.y();
                                            if (iY2 > trackFragment2.f7152e) {
                                                StringBuilder sbU = a.u(iY2, "Saiz sample count ", " is greater than fragment sample count");
                                                sbU.append(trackFragment2.f7152e);
                                                throw ParserException.a(null, sbU.toString());
                                            }
                                            int i30 = trackEncryptionBox.d;
                                            if (iU == 0) {
                                                boolean[] zArr = trackFragment2.f7155l;
                                                i8 = 0;
                                                for (int i31 = 0; i31 < iY2; i31++) {
                                                    int iU2 = parsableByteArray5.u();
                                                    i8 += iU2;
                                                    zArr[i31] = iU2 > i30;
                                                }
                                                z2 = false;
                                            } else {
                                                i8 = iU * iY2;
                                                z2 = false;
                                                Arrays.fill(trackFragment2.f7155l, 0, iY2, iU > i30);
                                            }
                                            Arrays.fill(trackFragment2.f7155l, iY2, trackFragment2.f7152e, z2);
                                            if (i8 > 0) {
                                                trackFragment2.f7156n.D(i8);
                                                trackFragment2.k = true;
                                                trackFragment2.o = true;
                                            }
                                        }
                                        Atom.LeafAtom leafAtomD4 = containerAtom2.d(1935763823);
                                        if (leafAtomD4 != null) {
                                            ParsableByteArray parsableByteArray6 = leafAtomD4.f7056b;
                                            parsableByteArray6.G(8);
                                            int iG2 = parsableByteArray6.g();
                                            if ((iG2 & 1) == 1) {
                                                parsableByteArray6.H(8);
                                            }
                                            int iY3 = parsableByteArray6.y();
                                            if (iY3 != 1) {
                                                throw ParserException.a(null, "Unexpected saio entry count: " + iY3);
                                            }
                                            trackFragment2.f7151c += Atom.b(iG2) == 0 ? parsableByteArray6.w() : parsableByteArray6.z();
                                        }
                                        byte[] bArr = null;
                                        Atom.LeafAtom leafAtomD5 = containerAtom2.d(1936027235);
                                        if (leafAtomD5 != null) {
                                            g(leafAtomD5.f7056b, 0, trackFragment2);
                                        }
                                        String str = trackEncryptionBox != null ? trackEncryptionBox.f7146b : null;
                                        ParsableByteArray parsableByteArray7 = null;
                                        ParsableByteArray parsableByteArray8 = null;
                                        for (int i32 = 0; i32 < arrayList6.size(); i32++) {
                                            Atom.LeafAtom leafAtom3 = (Atom.LeafAtom) arrayList6.get(i32);
                                            ParsableByteArray parsableByteArray9 = leafAtom3.f7056b;
                                            int i33 = leafAtom3.f7053a;
                                            if (i33 == 1935828848) {
                                                parsableByteArray9.G(12);
                                                if (parsableByteArray9.g() == 1936025959) {
                                                    parsableByteArray7 = parsableByteArray9;
                                                }
                                            } else if (i33 == 1936158820) {
                                                parsableByteArray9.G(12);
                                                if (parsableByteArray9.g() == 1936025959) {
                                                    parsableByteArray8 = parsableByteArray9;
                                                }
                                            }
                                        }
                                        if (parsableByteArray7 == null || parsableByteArray8 == null) {
                                            i6 = i19;
                                        } else {
                                            parsableByteArray7.G(8);
                                            int iB = Atom.b(parsableByteArray7.g());
                                            i6 = i19;
                                            parsableByteArray7.H(i6);
                                            if (iB == 1) {
                                                parsableByteArray7.H(i6);
                                            }
                                            if (parsableByteArray7.g() != 1) {
                                                throw ParserException.b("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            parsableByteArray8.G(8);
                                            int iB2 = Atom.b(parsableByteArray8.g());
                                            parsableByteArray8.H(i6);
                                            if (iB2 == 1) {
                                                if (parsableByteArray8.w() == 0) {
                                                    throw ParserException.b("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iB2 >= 2) {
                                                parsableByteArray8.H(i6);
                                            }
                                            if (parsableByteArray8.w() != 1) {
                                                throw ParserException.b("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            parsableByteArray8.H(1);
                                            int iU3 = parsableByteArray8.u();
                                            int i34 = (iU3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                            int i35 = iU3 & 15;
                                            boolean z5 = parsableByteArray8.u() == 1;
                                            if (z5) {
                                                int iU4 = parsableByteArray8.u();
                                                int i36 = i18;
                                                byte[] bArr2 = new byte[i36];
                                                parsableByteArray8.e(bArr2, 0, i36);
                                                if (iU4 == 0) {
                                                    int iU5 = parsableByteArray8.u();
                                                    bArr = new byte[iU5];
                                                    parsableByteArray8.e(bArr, 0, iU5);
                                                }
                                                trackFragment2.k = true;
                                                trackFragment2.m = new TrackEncryptionBox(z5, str, iU4, bArr2, i34, i35, bArr);
                                            }
                                        }
                                        int size6 = arrayList6.size();
                                        for (int i37 = 0; i37 < size6; i37++) {
                                            Atom.LeafAtom leafAtom4 = (Atom.LeafAtom) arrayList6.get(i37);
                                            if (leafAtom4.f7053a == 1970628964) {
                                                ParsableByteArray parsableByteArray10 = leafAtom4.f7056b;
                                                parsableByteArray10.G(8);
                                                byte[] bArr3 = this.f7090h;
                                                parsableByteArray10.e(bArr3, 0, 16);
                                                if (Arrays.equals(bArr3, H)) {
                                                    g(parsableByteArray10, 16, trackFragment2);
                                                }
                                            }
                                        }
                                        i5 = 16;
                                        break;
                                    }
                                    Atom.LeafAtom leafAtom5 = (Atom.LeafAtom) arrayList6.get(i27);
                                    if (leafAtom5.f7053a == i7) {
                                        int i38 = i28 + 1;
                                        ParsableByteArray parsableByteArray11 = leafAtom5.f7056b;
                                        parsableByteArray11.G(8);
                                        int iG3 = parsableByteArray11.g();
                                        TrackSampleTable trackSampleTable4 = trackBundle2.d;
                                        int i39 = i28;
                                        DefaultSampleValues defaultSampleValues5 = trackFragment2.f7149a;
                                        int i40 = Util.f5683a;
                                        trackFragment2.g[i39] = parsableByteArray11.y();
                                        long[] jArr2 = trackFragment2.f;
                                        int i41 = i29;
                                        long j4 = trackFragment2.f7150b;
                                        jArr2[i39] = j4;
                                        if ((iG3 & 1) != 0) {
                                            jArr2[i39] = j4 + ((long) parsableByteArray11.g());
                                        }
                                        boolean z6 = (iG3 & 4) != 0;
                                        int iG4 = defaultSampleValues5.d;
                                        if (z6) {
                                            iG4 = parsableByteArray11.g();
                                        }
                                        boolean z7 = (iG3 & 256) != 0;
                                        boolean z8 = z6;
                                        boolean z9 = (iG3 & 512) != 0;
                                        boolean z10 = (iG3 & 1024) != 0;
                                        boolean z11 = (iG3 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0;
                                        Track track3 = trackSampleTable4.f7158a;
                                        boolean z12 = z10;
                                        long[] jArr3 = track3.f7143h;
                                        int i42 = iG4;
                                        if (jArr3 == null || jArr3.length != 1 || (jArr = track3.f7144i) == null) {
                                            z3 = z7;
                                        } else {
                                            long j5 = jArr3[0];
                                            if (j5 == 0) {
                                                z3 = z7;
                                            } else {
                                                z3 = z7;
                                                c2 = Util.O(j5 + jArr[0], 1000000L, track3.d, RoundingMode.FLOOR) >= track3.f7142e ? (char) 0 : (char) 0;
                                            }
                                            j3 = jArr[c2];
                                        }
                                        int[] iArr = trackFragment2.f7153h;
                                        long[] jArr4 = trackFragment2.f7154i;
                                        boolean[] zArr2 = trackFragment2.j;
                                        boolean z13 = track3.f7140b == 2 && (i10 & 1) != 0;
                                        int i43 = i41 + trackFragment2.g[i39];
                                        long j6 = trackFragment2.f7157p;
                                        int i44 = i41;
                                        while (i44 < i43) {
                                            int iG5 = z3 ? parsableByteArray11.g() : defaultSampleValues5.f7079b;
                                            int i45 = i43;
                                            if (iG5 < 0) {
                                                throw ParserException.a(null, "Unexpected negative value: " + iG5);
                                            }
                                            int iG6 = z9 ? parsableByteArray11.g() : defaultSampleValues5.f7080c;
                                            if (iG6 < 0) {
                                                throw ParserException.a(null, "Unexpected negative value: " + iG6);
                                            }
                                            int iG7 = z12 ? parsableByteArray11.g() : (i44 == 0 && z8) ? i42 : defaultSampleValues5.d;
                                            int i46 = i38;
                                            boolean z14 = z11;
                                            long jO = Util.O((((long) (z11 ? parsableByteArray11.g() : 0)) + j6) - j3, 1000000L, track3.f7141c, RoundingMode.FLOOR);
                                            jArr4[i44] = jO;
                                            if (!trackFragment2.q) {
                                                jArr4[i44] = jO + trackBundle2.d.f7162h;
                                            }
                                            iArr[i44] = iG6;
                                            zArr2[i44] = ((iG7 >> 16) & 1) == 0 && (!z13 || i44 == 0);
                                            j6 += (long) iG5;
                                            i44++;
                                            i43 = i45;
                                            z13 = z13;
                                            defaultSampleValues5 = defaultSampleValues5;
                                            i38 = i46;
                                            z11 = z14;
                                            track3 = track3;
                                        }
                                        trackFragment2.f7157p = j6;
                                        i29 = i43;
                                        i28 = i38;
                                    }
                                    i27++;
                                    size5 = size5;
                                    i20 = i20;
                                    arrayList3 = arrayList3;
                                    i7 = 1953658222;
                                }
                            } else {
                                arrayList = arrayList5;
                                i3 = size4;
                                i4 = i20;
                                arrayList2 = arrayList3;
                                i5 = i18;
                                i6 = i19;
                            }
                        } else {
                            arrayList = arrayList5;
                            i3 = size4;
                            i4 = i20;
                            arrayList2 = arrayList3;
                            i5 = i18;
                            i6 = i19;
                        }
                        i20 = i4 + 1;
                        i19 = i6;
                        i18 = i5;
                        size4 = i3;
                        arrayList5 = arrayList;
                        arrayList3 = arrayList2;
                    }
                    DrmInitData drmInitDataA2 = a(arrayList3);
                    if (drmInitDataA2 != null) {
                        int size7 = sparseArray.size();
                        for (int i47 = 0; i47 < size7; i47++) {
                            TrackBundle trackBundle3 = (TrackBundle) sparseArray.valueAt(i47);
                            TrackSampleTable trackSampleTable5 = trackBundle3.d;
                            DefaultSampleValues defaultSampleValues6 = trackBundle3.f7102b.f7149a;
                            int i48 = Util.f5683a;
                            TrackEncryptionBox trackEncryptionBox2 = trackSampleTable5.f7158a.k[defaultSampleValues6.f7078a];
                            DrmInitData drmInitDataA3 = drmInitDataA2.a(trackEncryptionBox2 != null ? trackEncryptionBox2.f7146b : null);
                            Format.Builder builderA = trackBundle3.d.f7158a.f.a();
                            builderA.f5431p = drmInitDataA3;
                            trackBundle3.f7101a.b(new Format(builderA));
                        }
                    }
                    if (this.v != -9223372036854775807L) {
                        int size8 = sparseArray.size();
                        for (int i49 = 0; i49 < size8; i49++) {
                            TrackBundle trackBundle4 = (TrackBundle) sparseArray.valueAt(i49);
                            long j7 = this.v;
                            int i50 = trackBundle4.f;
                            while (true) {
                                TrackFragment trackFragment3 = trackBundle4.f7102b;
                                if (i50 >= trackFragment3.f7152e || trackFragment3.f7154i[i50] > j7) {
                                    break;
                                }
                                if (trackFragment3.j[i50]) {
                                    trackBundle4.f7106i = i50;
                                }
                                i50++;
                            }
                        }
                        this.v = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((Atom.ContainerAtom) arrayDeque.peek()).d.add(containerAtom);
                }
            }
        }
        this.o = 0;
        this.r = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TrackBundle) sparseArray.valueAt(i2)).d();
        }
        this.m.clear();
        this.f7095u = 0;
        this.v = j2;
        this.f7092l.clear();
        this.o = 0;
        this.r = 0;
    }
}
