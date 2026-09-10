package com.google.android.exoplayer2.extractor.mp4;

import A.C0880a0;
import android.support.v4.media.a;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class FragmentedMp4Extractor implements Extractor {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final byte[] f17778E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Format f17779F;
    public boolean D;
    public final byte[] f;
    public final ParsableByteArray g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17788l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17789n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ParsableByteArray f17790p;
    public long q;
    public int r;
    public TrackBundle v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17792w;
    public int x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17793z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17782a = Collections.unmodifiableList(Collections.EMPTY_LIST);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EventMessageEncoder f17786h = new EventMessageEncoder();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ParsableByteArray f17787i = new ParsableByteArray(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f17784c = new ParsableByteArray(NalUnitUtil.f18927a);
    public final ParsableByteArray d = new ParsableByteArray(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ParsableByteArray f17785e = new ParsableByteArray();
    public final ArrayDeque j = new ArrayDeque();
    public final ArrayDeque k = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f17783b = new SparseArray();
    public long t = -9223372036854775807L;
    public long s = -9223372036854775807L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f17791u = -9223372036854775807L;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ExtractorOutput f17780A = ExtractorOutput.Q8;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TrackOutput[] f17781B = new TrackOutput[0];
    public TrackOutput[] C = new TrackOutput[0];

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class MetadataSampleInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17796c;

        public MetadataSampleInfo(long j, boolean z2, int i2) {
            this.f17794a = j;
            this.f17795b = z2;
            this.f17796c = i2;
        }
    }

    public static final class TrackBundle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackOutput f17797a;
        public TrackSampleTable d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DefaultSampleValues f17800e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17801h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17802i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f17803l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackFragment f17798b = new TrackFragment();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParsableByteArray f17799c = new ParsableByteArray();
        public final ParsableByteArray j = new ParsableByteArray(1);
        public final ParsableByteArray k = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.f17797a = trackOutput;
            this.d = trackSampleTable;
            this.f17800e = defaultSampleValues;
            this.d = trackSampleTable;
            this.f17800e = defaultSampleValues;
            trackOutput.c(trackSampleTable.f17849a.f);
            d();
        }

        public final TrackEncryptionBox a() {
            if (!this.f17803l) {
                return null;
            }
            TrackFragment trackFragment = this.f17798b;
            DefaultSampleValues defaultSampleValues = trackFragment.f17840a;
            int i2 = Util.f18979a;
            int i3 = defaultSampleValues.f17775a;
            TrackEncryptionBox trackEncryptionBox = trackFragment.m;
            if (trackEncryptionBox == null) {
                trackEncryptionBox = this.d.f17849a.k[i3];
            }
            if (trackEncryptionBox == null || !trackEncryptionBox.f17836a) {
                return null;
            }
            return trackEncryptionBox;
        }

        public final boolean b() {
            this.f++;
            if (!this.f17803l) {
                return false;
            }
            int i2 = this.g + 1;
            this.g = i2;
            int[] iArr = this.f17798b.g;
            int i3 = this.f17801h;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.f17801h = i3 + 1;
            this.g = 0;
            return false;
        }

        public final int c(int i2, int i3) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox trackEncryptionBoxA = a();
            if (trackEncryptionBoxA == null) {
                return 0;
            }
            TrackFragment trackFragment = this.f17798b;
            int length = trackEncryptionBoxA.d;
            if (length != 0) {
                parsableByteArray = trackFragment.f17847n;
            } else {
                int i4 = Util.f18979a;
                byte[] bArr = trackEncryptionBoxA.f17839e;
                int length2 = bArr.length;
                ParsableByteArray parsableByteArray2 = this.k;
                parsableByteArray2.D(bArr, length2);
                length = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean z2 = trackFragment.k && trackFragment.f17846l[this.f];
            boolean z3 = z2 || i3 != 0;
            ParsableByteArray parsableByteArray3 = this.j;
            parsableByteArray3.f18956a[0] = (byte) ((z3 ? 128 : 0) | length);
            parsableByteArray3.F(0);
            TrackOutput trackOutput = this.f17797a;
            trackOutput.b(1, parsableByteArray3);
            trackOutput.b(length, parsableByteArray);
            if (!z3) {
                return length + 1;
            }
            ParsableByteArray parsableByteArray4 = this.f17799c;
            if (!z2) {
                parsableByteArray4.C(8);
                byte[] bArr2 = parsableByteArray4.f18956a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) (i3 & 255);
                bArr2[4] = (byte) ((i2 >> 24) & 255);
                bArr2[5] = (byte) ((i2 >> 16) & 255);
                bArr2[6] = (byte) ((i2 >> 8) & 255);
                bArr2[7] = (byte) (i2 & 255);
                trackOutput.b(8, parsableByteArray4);
                return length + 9;
            }
            ParsableByteArray parsableByteArray5 = trackFragment.f17847n;
            int iZ = parsableByteArray5.z();
            parsableByteArray5.G(-2);
            int i5 = (iZ * 6) + 2;
            if (i3 != 0) {
                parsableByteArray4.C(i5);
                byte[] bArr3 = parsableByteArray4.f18956a;
                parsableByteArray5.e(bArr3, 0, i5);
                int i6 = (((bArr3[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr3[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i3;
                bArr3[2] = (byte) ((i6 >> 8) & 255);
                bArr3[3] = (byte) (i6 & 255);
            } else {
                parsableByteArray4 = parsableByteArray5;
            }
            trackOutput.b(i5, parsableByteArray4);
            return length + 1 + i5;
        }

        public final void d() {
            TrackFragment trackFragment = this.f17798b;
            trackFragment.d = 0;
            trackFragment.f17848p = 0L;
            trackFragment.q = false;
            trackFragment.k = false;
            trackFragment.o = false;
            trackFragment.m = null;
            this.f = 0;
            this.f17801h = 0;
            this.g = 0;
            this.f17802i = 0;
            this.f17803l = false;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.k = "application/x-emsg";
        f17779F = new Format(builder);
    }

    public FragmentedMp4Extractor() {
        byte[] bArr = new byte[16];
        this.f = bArr;
        this.g = new ParsableByteArray(bArr);
    }

    public static DrmInitData a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Atom.LeafAtom leafAtom = (Atom.LeafAtom) arrayList.get(i2);
            if (leafAtom.f17750a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = leafAtom.f17753b.f18956a;
                PsshAtomUtil.PsshAtom psshAtomA = PsshAtomUtil.a(bArr);
                UUID uuid = psshAtomA == null ? null : psshAtomA.f17820a;
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

    public static void e(ParsableByteArray parsableByteArray, int i2, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.F(i2 + 8);
        int iG = parsableByteArray.g();
        if ((iG & 1) != 0) {
            throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iG & 2) != 0;
        int iX = parsableByteArray.x();
        if (iX == 0) {
            Arrays.fill(trackFragment.f17846l, 0, trackFragment.f17843e, false);
            return;
        }
        if (iX != trackFragment.f17843e) {
            StringBuilder sbU = a.u(iX, "Senc sample count ", " is different from fragment sample count");
            sbU.append(trackFragment.f17843e);
            throw ParserException.a(null, sbU.toString());
        }
        Arrays.fill(trackFragment.f17846l, 0, iX, z2);
        int iA = parsableByteArray.a();
        ParsableByteArray parsableByteArray2 = trackFragment.f17847n;
        parsableByteArray2.C(iA);
        trackFragment.k = true;
        trackFragment.o = true;
        parsableByteArray.e(parsableByteArray2.f18956a, 0, parsableByteArray2.f18958c);
        parsableByteArray2.F(0);
        trackFragment.o = false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) {
        return Sniffer.a(extractorInput, true, false);
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
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        ArrayDeque arrayDeque;
        String strP;
        String strP2;
        long jF;
        long jV;
        long j;
        long jF2;
        long j2;
        long jY;
        long jY2;
        TrackBundle trackBundle;
        char c2;
        int i2;
        int i3;
        char c3;
        boolean z2;
        int iD;
        loop0: while (true) {
            while (true) {
                int i4 = this.f17788l;
                ArrayDeque arrayDeque2 = this.j;
                SparseArray sparseArray = this.f17783b;
                char c4 = 2;
                if (i4 == 0) {
                    int i5 = this.o;
                    ParsableByteArray parsableByteArray = this.f17787i;
                    if (i5 == 0) {
                        if (!((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f18956a, 0, 8, true)) {
                            return -1;
                        }
                        this.o = 8;
                        parsableByteArray.F(0);
                        this.f17789n = parsableByteArray.v();
                        this.m = parsableByteArray.g();
                    }
                    long j3 = this.f17789n;
                    if (j3 == 1) {
                        ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray.f18956a, 8, 8, false);
                        this.o += 8;
                        this.f17789n = parsableByteArray.y();
                    } else if (j3 == 0) {
                        long j4 = ((DefaultExtractorInput) extractorInput).f17527c;
                        if (j4 == -1 && !arrayDeque2.isEmpty()) {
                            j4 = ((Atom.ContainerAtom) arrayDeque2.peek()).f17751b;
                        }
                        if (j4 != -1) {
                            this.f17789n = (j4 - ((DefaultExtractorInput) extractorInput).d) + ((long) this.o);
                        }
                    }
                    long j5 = this.f17789n;
                    int i6 = this.o;
                    if (j5 < i6) {
                        throw ParserException.b("Atom size less than header length (unsupported).");
                    }
                    long j6 = ((DefaultExtractorInput) extractorInput).d - ((long) i6);
                    int i7 = this.m;
                    if ((i7 == 1836019558 || i7 == 1835295092) && !this.D) {
                        this.f17780A.g(new SeekMap.Unseekable(this.t, j6));
                        this.D = true;
                    }
                    if (this.m == 1836019558) {
                        int size = sparseArray.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            TrackFragment trackFragment = ((TrackBundle) sparseArray.valueAt(i8)).f17798b;
                            trackFragment.getClass();
                            trackFragment.f17842c = j6;
                            trackFragment.f17841b = j6;
                        }
                    }
                    int i9 = this.m;
                    if (i9 == 1835295092) {
                        this.v = null;
                        this.q = j6 + this.f17789n;
                        this.f17788l = 2;
                        break;
                    }
                    if (i9 == 1836019574 || i9 == 1953653099 || i9 == 1835297121 || i9 == 1835626086 || i9 == 1937007212 || i9 == 1836019558 || i9 == 1953653094 || i9 == 1836475768 || i9 == 1701082227) {
                        long j7 = (((DefaultExtractorInput) extractorInput).d + this.f17789n) - 8;
                        arrayDeque2.push(new Atom.ContainerAtom(i9, j7));
                        if (this.f17789n != this.o) {
                            this.f17788l = 0;
                            this.o = 0;
                            break;
                        }
                        f(j7);
                        break;
                    }
                    if (i9 != 1751411826 && i9 != 1835296868 && i9 != 1836476516 && i9 != 1936286840 && i9 != 1937011556 && i9 != 1937011827 && i9 != 1668576371 && i9 != 1937011555 && i9 != 1937011578 && i9 != 1937013298 && i9 != 1937007471 && i9 != 1668232756 && i9 != 1937011571 && i9 != 1952867444 && i9 != 1952868452 && i9 != 1953196132 && i9 != 1953654136 && i9 != 1953658222 && i9 != 1886614376 && i9 != 1935763834 && i9 != 1935763823 && i9 != 1936027235 && i9 != 1970628964 && i9 != 1935828848 && i9 != 1936158820 && i9 != 1701606260 && i9 != 1835362404 && i9 != 1701671783) {
                        if (this.f17789n > 2147483647L) {
                            throw ParserException.b("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f17790p = null;
                        this.f17788l = 1;
                        break;
                    }
                    if (this.o != 8) {
                        throw ParserException.b("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f17789n > 2147483647L) {
                        throw ParserException.b("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    ParsableByteArray parsableByteArray2 = new ParsableByteArray((int) this.f17789n);
                    System.arraycopy(parsableByteArray.f18956a, 0, parsableByteArray2.f18956a, 0, 8);
                    this.f17790p = parsableByteArray2;
                    this.f17788l = 1;
                    break;
                }
                arrayDeque = this.k;
                if (i4 == 1) {
                    int i10 = ((int) this.f17789n) - this.o;
                    ParsableByteArray parsableByteArray3 = this.f17790p;
                    if (parsableByteArray3 != null) {
                        ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray3.f18956a, 8, i10, false);
                        int i11 = this.m;
                        Atom.LeafAtom leafAtom = new Atom.LeafAtom(i11, parsableByteArray3);
                        long j8 = ((DefaultExtractorInput) extractorInput).d;
                        if (!arrayDeque2.isEmpty()) {
                            ((Atom.ContainerAtom) arrayDeque2.peek()).f17752c.add(leafAtom);
                        } else if (i11 == 1936286840) {
                            parsableByteArray3.F(8);
                            int iB = Atom.b(parsableByteArray3.g());
                            parsableByteArray3.G(4);
                            long jV2 = parsableByteArray3.v();
                            if (iB == 0) {
                                jY = parsableByteArray3.v();
                                jY2 = parsableByteArray3.v();
                            } else {
                                jY = parsableByteArray3.y();
                                jY2 = parsableByteArray3.y();
                            }
                            long j9 = jY2 + j8;
                            long j10 = jY;
                            long jF3 = Util.F(j10, 1000000L, jV2);
                            parsableByteArray3.G(2);
                            int iZ = parsableByteArray3.z();
                            int[] iArr = new int[iZ];
                            long[] jArr = new long[iZ];
                            long[] jArr2 = new long[iZ];
                            long[] jArr3 = new long[iZ];
                            long jF4 = jF3;
                            int i12 = 0;
                            while (i12 < iZ) {
                                int iG = parsableByteArray3.g();
                                if ((iG & Integer.MIN_VALUE) != 0) {
                                    throw ParserException.a(null, "Unhandled indirect reference");
                                }
                                long jV3 = parsableByteArray3.v();
                                iArr[i12] = iG & Integer.MAX_VALUE;
                                jArr[i12] = j9;
                                jArr3[i12] = jF4;
                                j10 += jV3;
                                jF4 = Util.F(j10, 1000000L, jV2);
                                jArr2[i12] = jF4 - jArr3[i12];
                                parsableByteArray3.G(4);
                                j9 += (long) iArr[i12];
                                i12++;
                                jF3 = jF3;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jF3), new ChunkIndex(iArr, jArr, jArr2, jArr3));
                            this.f17791u = ((Long) pairCreate.first).longValue();
                            this.f17780A.g((SeekMap) pairCreate.second);
                            this.D = true;
                        } else if (i11 == 1701671783 && this.f17781B.length != 0) {
                            parsableByteArray3.F(8);
                            int iB2 = Atom.b(parsableByteArray3.g());
                            if (iB2 == 0) {
                                strP = parsableByteArray3.p();
                                strP.getClass();
                                strP2 = parsableByteArray3.p();
                                strP2.getClass();
                                long jV4 = parsableByteArray3.v();
                                long jF5 = Util.F(parsableByteArray3.v(), 1000000L, jV4);
                                long j11 = this.f17791u;
                                long j12 = j11 != -9223372036854775807L ? j11 + jF5 : -9223372036854775807L;
                                jF = Util.F(parsableByteArray3.v(), 1000L, jV4);
                                jV = parsableByteArray3.v();
                                long j13 = j12;
                                j = jF5;
                                jF2 = j13;
                                j2 = -9223372036854775807L;
                            } else if (iB2 != 1) {
                                Z.s(iB2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jV5 = parsableByteArray3.v();
                                jF2 = Util.F(parsableByteArray3.y(), 1000000L, jV5);
                                long jF6 = Util.F(parsableByteArray3.v(), 1000L, jV5);
                                long jV6 = parsableByteArray3.v();
                                strP = parsableByteArray3.p();
                                strP.getClass();
                                strP2 = parsableByteArray3.p();
                                strP2.getClass();
                                j2 = -9223372036854775807L;
                                jV = jV6;
                                jF = jF6;
                                j = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[parsableByteArray3.a()];
                            parsableByteArray3.e(bArr, 0, parsableByteArray3.a());
                            EventMessageEncoder eventMessageEncoder = this.f17786h;
                            ByteArrayOutputStream byteArrayOutputStream = eventMessageEncoder.f18201a;
                            byteArrayOutputStream.reset();
                            DataOutputStream dataOutputStream = eventMessageEncoder.f18202b;
                            try {
                                dataOutputStream.writeBytes(strP);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(strP2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jF);
                                dataOutputStream.writeLong(jV);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                ParsableByteArray parsableByteArray4 = new ParsableByteArray(byteArrayOutputStream.toByteArray());
                                int iA = parsableByteArray4.a();
                                for (TrackOutput trackOutput : this.f17781B) {
                                    parsableByteArray4.F(0);
                                    trackOutput.e(iA, parsableByteArray4);
                                }
                                if (jF2 == j2) {
                                    arrayDeque.addLast(new MetadataSampleInfo(j, true, iA));
                                    this.r += iA;
                                } else if (arrayDeque.isEmpty()) {
                                    for (TrackOutput trackOutput2 : this.f17781B) {
                                        trackOutput2.f(jF2, 1, iA, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new MetadataSampleInfo(jF2, false, iA));
                                    this.r += iA;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    } else {
                        ((DefaultExtractorInput) extractorInput).skipFully(i10);
                    }
                    f(((DefaultExtractorInput) extractorInput).d);
                    break;
                }
                long j14 = Long.MAX_VALUE;
                if (i4 != 2) {
                    trackBundle = this.v;
                    if (trackBundle != null) {
                        c2 = 2;
                        i2 = 8;
                        break loop0;
                    }
                    int size2 = sparseArray.size();
                    long j15 = Long.MAX_VALUE;
                    TrackBundle trackBundle2 = null;
                    int i13 = 0;
                    while (i13 < size2) {
                        char c5 = c4;
                        TrackBundle trackBundle3 = (TrackBundle) sparseArray.valueAt(i13);
                        boolean z3 = trackBundle3.f17803l;
                        if (z3 || trackBundle3.f != trackBundle3.d.f17850b) {
                            TrackFragment trackFragment2 = trackBundle3.f17798b;
                            if (!z3 || trackBundle3.f17801h != trackFragment2.d) {
                                long j16 = !z3 ? trackBundle3.d.f17851c[trackBundle3.f] : trackFragment2.f[trackBundle3.f17801h];
                                if (j16 < j15) {
                                    trackBundle2 = trackBundle3;
                                    j15 = j16;
                                }
                            }
                        }
                        i13++;
                        c4 = c5;
                    }
                    c2 = c4;
                    i2 = 8;
                    if (trackBundle2 != null) {
                        int i14 = (int) ((!trackBundle2.f17803l ? trackBundle2.d.f17851c[trackBundle2.f] : trackBundle2.f17798b.f[trackBundle2.f17801h]) - ((DefaultExtractorInput) extractorInput).d);
                        if (i14 < 0) {
                            Log.g("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i14 = 0;
                        }
                        ((DefaultExtractorInput) extractorInput).skipFully(i14);
                        this.v = trackBundle2;
                        trackBundle = trackBundle2;
                        break loop0;
                    }
                    int i15 = (int) (this.q - ((DefaultExtractorInput) extractorInput).d);
                    if (i15 < 0) {
                        throw ParserException.a(null, "Offset to end of mdat was negative.");
                    }
                    ((DefaultExtractorInput) extractorInput).skipFully(i15);
                    this.f17788l = 0;
                    this.o = 0;
                } else {
                    int size3 = sparseArray.size();
                    TrackBundle trackBundle4 = null;
                    for (int i16 = 0; i16 < size3; i16++) {
                        TrackFragment trackFragment3 = ((TrackBundle) sparseArray.valueAt(i16)).f17798b;
                        if (trackFragment3.o) {
                            long j17 = trackFragment3.f17842c;
                            if (j17 < j14) {
                                trackBundle4 = (TrackBundle) sparseArray.valueAt(i16);
                                j14 = j17;
                            }
                        }
                    }
                    if (trackBundle4 == null) {
                        this.f17788l = 3;
                    } else {
                        int i17 = (int) (j14 - ((DefaultExtractorInput) extractorInput).d);
                        if (i17 < 0) {
                            throw ParserException.a(null, "Offset to encryption data was negative.");
                        }
                        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                        defaultExtractorInput.skipFully(i17);
                        TrackFragment trackFragment4 = trackBundle4.f17798b;
                        ParsableByteArray parsableByteArray5 = trackFragment4.f17847n;
                        defaultExtractorInput.readFully(parsableByteArray5.f18956a, 0, parsableByteArray5.f18958c, false);
                        parsableByteArray5.F(0);
                        trackFragment4.o = false;
                    }
                }
            }
        }
        int i18 = this.f17788l;
        TrackFragment trackFragment5 = trackBundle.f17798b;
        if (i18 == 3) {
            int i19 = !trackBundle.f17803l ? trackBundle.d.d[trackBundle.f] : trackFragment5.f17844h[trackBundle.f];
            this.f17792w = i19;
            if (trackBundle.f < trackBundle.f17802i) {
                ((DefaultExtractorInput) extractorInput).skipFully(i19);
                TrackEncryptionBox trackEncryptionBoxA = trackBundle.a();
                if (trackEncryptionBoxA != null) {
                    ParsableByteArray parsableByteArray6 = trackFragment5.f17847n;
                    int i20 = trackEncryptionBoxA.d;
                    if (i20 != 0) {
                        parsableByteArray6.G(i20);
                    }
                    int i21 = trackBundle.f;
                    if (trackFragment5.k && trackFragment5.f17846l[i21]) {
                        parsableByteArray6.G(parsableByteArray6.z() * 6);
                    }
                }
                if (!trackBundle.b()) {
                    this.v = null;
                }
                this.f17788l = 3;
                return 0;
            }
            if (trackBundle.d.f17849a.g == 1) {
                this.f17792w = i19 - 8;
                ((DefaultExtractorInput) extractorInput).skipFully(i2);
            }
            if ("audio/ac4".equals(trackBundle.d.f17849a.f.m0)) {
                this.x = trackBundle.c(this.f17792w, 7);
                int i22 = this.f17792w;
                ParsableByteArray parsableByteArray7 = this.g;
                Ac4Util.a(i22, parsableByteArray7);
                trackBundle.f17797a.e(7, parsableByteArray7);
                this.x += 7;
            } else {
                this.x = trackBundle.c(this.f17792w, 0);
            }
            this.f17792w += this.x;
            this.f17788l = 4;
            this.y = 0;
        }
        TrackSampleTable trackSampleTable = trackBundle.d;
        long j18 = trackBundle.f17803l ? trackFragment5.f17845i[trackBundle.f] : trackSampleTable.f[trackBundle.f];
        Track track = trackSampleTable.f17849a;
        int i23 = track.j;
        TrackOutput trackOutput3 = trackBundle.f17797a;
        if (i23 == 0) {
            while (true) {
                int i24 = this.x;
                int i25 = this.f17792w;
                if (i24 >= i25) {
                    break;
                }
                this.x += trackOutput3.d(extractorInput, i25 - i24, false);
            }
        } else {
            ParsableByteArray parsableByteArray8 = this.d;
            byte[] bArr2 = parsableByteArray8.f18956a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[c2] = 0;
            int i26 = i23 + 1;
            int i27 = 4 - i23;
            while (this.x < this.f17792w) {
                int i28 = this.y;
                Format format = track.f;
                if (i28 == 0) {
                    Track track2 = track;
                    ((DefaultExtractorInput) extractorInput).readFully(bArr2, i27, i26, false);
                    parsableByteArray8.F(0);
                    int iG2 = parsableByteArray8.g();
                    if (iG2 < 1) {
                        throw ParserException.a(null, "Invalid NAL length");
                    }
                    this.y = iG2 - 1;
                    ParsableByteArray parsableByteArray9 = this.f17784c;
                    parsableByteArray9.F(0);
                    trackOutput3.e(4, parsableByteArray9);
                    trackOutput3.e(1, parsableByteArray8);
                    if (this.C.length > 0) {
                        String str = format.m0;
                        int i29 = bArr2[4];
                        if ("video/avc".equals(str)) {
                            i3 = i27;
                            c3 = 6;
                            if ((i29 & 31) != 6) {
                            }
                            z2 = true;
                            this.f17793z = z2;
                            this.x += 5;
                            this.f17792w += i3;
                            track = track2;
                            i27 = i3;
                        } else {
                            i3 = i27;
                            c3 = 6;
                        }
                        if ("video/hevc".equals(str) && ((i29 & 126) >> 1) == 39) {
                            z2 = true;
                        }
                        this.f17793z = z2;
                        this.x += 5;
                        this.f17792w += i3;
                        track = track2;
                        i27 = i3;
                    } else {
                        i3 = i27;
                        c3 = 6;
                    }
                    z2 = false;
                    this.f17793z = z2;
                    this.x += 5;
                    this.f17792w += i3;
                    track = track2;
                    i27 = i3;
                } else {
                    Track track3 = track;
                    int i30 = i27;
                    if (this.f17793z) {
                        ParsableByteArray parsableByteArray10 = this.f17785e;
                        parsableByteArray10.C(i28);
                        ((DefaultExtractorInput) extractorInput).readFully(parsableByteArray10.f18956a, 0, this.y, false);
                        trackOutput3.e(this.y, parsableByteArray10);
                        iD = this.y;
                        int iE = NalUnitUtil.e(parsableByteArray10.f18956a, parsableByteArray10.f18958c);
                        parsableByteArray10.F("video/hevc".equals(format.m0) ? 1 : 0);
                        parsableByteArray10.E(iE);
                        CeaUtil.a(j18, parsableByteArray10, this.C);
                    } else {
                        iD = trackOutput3.d(extractorInput, i28, false);
                    }
                    this.x += iD;
                    this.y -= iD;
                    i27 = i30;
                    track = track3;
                    parsableByteArray8 = parsableByteArray8;
                    bArr2 = bArr2;
                }
            }
        }
        int i31 = trackBundle.f17803l ? trackFragment5.j[trackBundle.f] ? 1 : 0 : trackBundle.d.g[trackBundle.f];
        if (trackBundle.a() != null) {
            i31 |= 1073741824;
        }
        int i32 = i31;
        TrackEncryptionBox trackEncryptionBoxA2 = trackBundle.a();
        long j19 = j18;
        trackOutput3.f(j19, i32, this.f17792w, 0, trackEncryptionBoxA2 != null ? trackEncryptionBoxA2.f17838c : null);
        while (!arrayDeque.isEmpty()) {
            MetadataSampleInfo metadataSampleInfo = (MetadataSampleInfo) arrayDeque.removeFirst();
            this.r -= metadataSampleInfo.f17796c;
            boolean z4 = metadataSampleInfo.f17795b;
            long j20 = metadataSampleInfo.f17794a;
            if (z4) {
                j20 += j19;
            }
            long j21 = j20;
            for (TrackOutput trackOutput4 : this.f17781B) {
                trackOutput4.f(j21, 1, metadataSampleInfo.f17796c, this.r, null);
            }
        }
        if (!trackBundle.b()) {
            this.v = null;
        }
        this.f17788l = 3;
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f17780A = extractorOutput;
        int i2 = 0;
        this.f17788l = 0;
        this.o = 0;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.f17781B = trackOutputArr;
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.D(trackOutputArr, 0);
        this.f17781B = trackOutputArr2;
        for (TrackOutput trackOutput : trackOutputArr2) {
            trackOutput.c(f17779F);
        }
        List list = this.f17782a;
        this.C = new TrackOutput[list.size()];
        int i3 = 100;
        while (i2 < this.C.length) {
            int i4 = i3 + 1;
            TrackOutput trackOutputTrack = this.f17780A.track(i3, 3);
            trackOutputTrack.c((Format) list.get(i2));
            this.C[i2] = trackOutputTrack;
            i2++;
            i3 = i4;
        }
    }

    public final void f(long j) throws ParserException {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        ArrayList arrayList3;
        long[] jArr;
        int i13;
        int i14;
        DefaultSampleValues defaultSampleValues;
        DefaultSampleValues defaultSampleValues2;
        int i15;
        int i16 = 12;
        int i17 = 8;
        int i18 = 1;
        while (true) {
            ArrayDeque arrayDeque = this.j;
            if (arrayDeque.isEmpty() || ((Atom.ContainerAtom) arrayDeque.peek()).f17751b != j) {
                break;
            }
            Atom.ContainerAtom containerAtom = (Atom.ContainerAtom) arrayDeque.pop();
            int i19 = containerAtom.f17750a;
            SparseArray sparseArray = this.f17783b;
            ArrayList arrayList4 = containerAtom.f17752c;
            if (i19 == 1836019574) {
                DrmInitData drmInitDataA = a(arrayList4);
                Atom.ContainerAtom containerAtomC = containerAtom.c(1836475768);
                containerAtomC.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList5 = containerAtomC.f17752c;
                int size = arrayList5.size();
                int i20 = 0;
                long jV = -9223372036854775807L;
                while (i20 < size) {
                    Atom.LeafAtom leafAtom = (Atom.LeafAtom) arrayList5.get(i20);
                    int i21 = leafAtom.f17750a;
                    ParsableByteArray parsableByteArray = leafAtom.f17753b;
                    if (i21 == 1953654136) {
                        parsableByteArray.F(i16);
                        i15 = i18;
                        Pair pairCreate = Pair.create(Integer.valueOf(parsableByteArray.g()), new DefaultSampleValues(parsableByteArray.g() - i18, parsableByteArray.g(), parsableByteArray.g(), parsableByteArray.g()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (DefaultSampleValues) pairCreate.second);
                    } else {
                        i15 = i18;
                        if (i21 == 1835362404) {
                            parsableByteArray.F(i17);
                            jV = Atom.b(parsableByteArray.g()) == 0 ? parsableByteArray.v() : parsableByteArray.y();
                        }
                    }
                    i20++;
                    i18 = i15;
                }
                int i22 = i18;
                ArrayList arrayListE = AtomParsers.e(containerAtom, new GaplessInfoHolder(), jV, drmInitDataA, false, false, new C0880a0(this, i16));
                int size2 = arrayListE.size();
                if (sparseArray.size() == 0) {
                    int i23 = 0;
                    while (i23 < size2) {
                        TrackSampleTable trackSampleTable = (TrackSampleTable) arrayListE.get(i23);
                        Track track = trackSampleTable.f17849a;
                        TrackOutput trackOutputTrack = this.f17780A.track(i23, track.f17831b);
                        int size3 = sparseArray2.size();
                        int i24 = track.f17830a;
                        if (size3 == i22) {
                            defaultSampleValues2 = (DefaultSampleValues) sparseArray2.valueAt(0);
                        } else {
                            defaultSampleValues2 = (DefaultSampleValues) sparseArray2.get(i24);
                            defaultSampleValues2.getClass();
                        }
                        sparseArray.put(i24, new TrackBundle(trackOutputTrack, trackSampleTable, defaultSampleValues2));
                        this.t = Math.max(this.t, track.f17833e);
                        i23++;
                        i22 = 1;
                    }
                    this.f17780A.endTracks();
                } else {
                    Assertions.d(sparseArray.size() == size2);
                    for (int i25 = 0; i25 < size2; i25++) {
                        TrackSampleTable trackSampleTable2 = (TrackSampleTable) arrayListE.get(i25);
                        Track track2 = trackSampleTable2.f17849a;
                        TrackBundle trackBundle = (TrackBundle) sparseArray.get(track2.f17830a);
                        if (sparseArray2.size() == 1) {
                            defaultSampleValues = (DefaultSampleValues) sparseArray2.valueAt(0);
                        } else {
                            defaultSampleValues = (DefaultSampleValues) sparseArray2.get(track2.f17830a);
                            defaultSampleValues.getClass();
                        }
                        trackBundle.d = trackSampleTable2;
                        trackBundle.f17800e = defaultSampleValues;
                        trackBundle.f17797a.c(trackSampleTable2.f17849a.f);
                        trackBundle.d();
                    }
                }
                i2 = i16;
                i3 = i17;
            } else {
                int i26 = 16;
                int i27 = 2;
                int i28 = 4;
                if (i19 == 1836019558) {
                    ArrayList arrayList6 = containerAtom.d;
                    int size4 = arrayList6.size();
                    int i29 = 0;
                    while (i29 < size4) {
                        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) arrayList6.get(i29);
                        if (containerAtom2.f17750a == 1953653094) {
                            Atom.LeafAtom leafAtomD = containerAtom2.d(1952868452);
                            leafAtomD.getClass();
                            ParsableByteArray parsableByteArray2 = leafAtomD.f17753b;
                            parsableByteArray2.F(i17);
                            int iG = parsableByteArray2.g();
                            TrackBundle trackBundle2 = (TrackBundle) sparseArray.get(parsableByteArray2.g());
                            if (trackBundle2 == null) {
                                trackBundle2 = null;
                            } else {
                                int i30 = iG & 1;
                                TrackFragment trackFragment = trackBundle2.f17798b;
                                if (i30 != 0) {
                                    long jY = parsableByteArray2.y();
                                    trackFragment.f17841b = jY;
                                    trackFragment.f17842c = jY;
                                }
                                DefaultSampleValues defaultSampleValues3 = trackBundle2.f17800e;
                                trackFragment.f17840a = new DefaultSampleValues((iG & 2) != 0 ? parsableByteArray2.g() - 1 : defaultSampleValues3.f17775a, (iG & 8) != 0 ? parsableByteArray2.g() : defaultSampleValues3.f17776b, (iG & 16) != 0 ? parsableByteArray2.g() : defaultSampleValues3.f17777c, (iG & 32) != 0 ? parsableByteArray2.g() : defaultSampleValues3.d);
                            }
                            if (trackBundle2 != null) {
                                TrackFragment trackFragment2 = trackBundle2.f17798b;
                                long j2 = trackFragment2.f17848p;
                                boolean z3 = trackFragment2.q;
                                trackBundle2.d();
                                trackBundle2.f17803l = true;
                                Atom.LeafAtom leafAtomD2 = containerAtom2.d(1952867444);
                                if (leafAtomD2 != null) {
                                    ParsableByteArray parsableByteArray3 = leafAtomD2.f17753b;
                                    parsableByteArray3.F(8);
                                    trackFragment2.f17848p = Atom.b(parsableByteArray3.g()) == 1 ? parsableByteArray3.y() : parsableByteArray3.v();
                                    trackFragment2.q = true;
                                } else {
                                    trackFragment2.f17848p = j2;
                                    trackFragment2.q = z3;
                                }
                                ArrayList arrayList7 = containerAtom2.f17752c;
                                int size5 = arrayList7.size();
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    i10 = 1953658222;
                                    if (i31 >= size5) {
                                        break;
                                    }
                                    Atom.LeafAtom leafAtom2 = (Atom.LeafAtom) arrayList7.get(i31);
                                    ArrayList arrayList8 = arrayList6;
                                    if (leafAtom2.f17750a == 1953658222) {
                                        ParsableByteArray parsableByteArray4 = leafAtom2.f17753b;
                                        parsableByteArray4.F(12);
                                        i13 = i32;
                                        int iX = parsableByteArray4.x();
                                        if (iX > 0) {
                                            i14 = iX + i13;
                                            i33++;
                                        }
                                        i31++;
                                        i32 = i14;
                                        arrayList6 = arrayList8;
                                    } else {
                                        i13 = i32;
                                    }
                                    i14 = i13;
                                    i31++;
                                    i32 = i14;
                                    arrayList6 = arrayList8;
                                }
                                arrayList = arrayList6;
                                int i34 = i32;
                                trackBundle2.f17801h = 0;
                                trackBundle2.g = 0;
                                trackBundle2.f = 0;
                                trackFragment2.d = i33;
                                trackFragment2.f17843e = i34;
                                if (trackFragment2.g.length < i33) {
                                    trackFragment2.f = new long[i33];
                                    trackFragment2.g = new int[i33];
                                }
                                if (trackFragment2.f17844h.length < i34) {
                                    int i35 = (i34 * 125) / 100;
                                    trackFragment2.f17844h = new int[i35];
                                    trackFragment2.f17845i = new long[i35];
                                    trackFragment2.j = new boolean[i35];
                                    trackFragment2.f17846l = new boolean[i35];
                                }
                                int i36 = 0;
                                int i37 = 0;
                                int i38 = 0;
                                while (true) {
                                    long j3 = 0;
                                    if (i36 >= size5) {
                                        i5 = size4;
                                        i8 = i29;
                                        arrayList2 = arrayList4;
                                        TrackSampleTable trackSampleTable3 = trackBundle2.d;
                                        DefaultSampleValues defaultSampleValues4 = trackFragment2.f17840a;
                                        defaultSampleValues4.getClass();
                                        TrackEncryptionBox trackEncryptionBox = trackSampleTable3.f17849a.k[defaultSampleValues4.f17775a];
                                        Atom.LeafAtom leafAtomD3 = containerAtom2.d(1935763834);
                                        if (leafAtomD3 != null) {
                                            trackEncryptionBox.getClass();
                                            ParsableByteArray parsableByteArray5 = leafAtomD3.f17753b;
                                            parsableByteArray5.F(8);
                                            if ((parsableByteArray5.g() & 1) == 1) {
                                                parsableByteArray5.G(8);
                                            }
                                            int iU = parsableByteArray5.u();
                                            int iX2 = parsableByteArray5.x();
                                            if (iX2 > trackFragment2.f17843e) {
                                                StringBuilder sbU = a.u(iX2, "Saiz sample count ", " is greater than fragment sample count");
                                                sbU.append(trackFragment2.f17843e);
                                                throw ParserException.a(null, sbU.toString());
                                            }
                                            int i39 = trackEncryptionBox.d;
                                            if (iU == 0) {
                                                boolean[] zArr = trackFragment2.f17846l;
                                                i12 = 0;
                                                for (int i40 = 0; i40 < iX2; i40++) {
                                                    int iU2 = parsableByteArray5.u();
                                                    i12 += iU2;
                                                    zArr[i40] = iU2 > i39;
                                                }
                                                z2 = false;
                                            } else {
                                                i12 = iU * iX2;
                                                z2 = false;
                                                Arrays.fill(trackFragment2.f17846l, 0, iX2, iU > i39);
                                            }
                                            Arrays.fill(trackFragment2.f17846l, iX2, trackFragment2.f17843e, z2);
                                            if (i12 > 0) {
                                                trackFragment2.f17847n.C(i12);
                                                trackFragment2.k = true;
                                                trackFragment2.o = true;
                                            }
                                        }
                                        Atom.LeafAtom leafAtomD4 = containerAtom2.d(1935763823);
                                        if (leafAtomD4 != null) {
                                            ParsableByteArray parsableByteArray6 = leafAtomD4.f17753b;
                                            parsableByteArray6.F(8);
                                            int iG2 = parsableByteArray6.g();
                                            if ((iG2 & 1) == 1) {
                                                parsableByteArray6.G(8);
                                            }
                                            int iX3 = parsableByteArray6.x();
                                            if (iX3 != 1) {
                                                throw ParserException.a(null, "Unexpected saio entry count: " + iX3);
                                            }
                                            trackFragment2.f17842c += Atom.b(iG2) == 0 ? parsableByteArray6.v() : parsableByteArray6.y();
                                        }
                                        byte[] bArr = null;
                                        Atom.LeafAtom leafAtomD5 = containerAtom2.d(1936027235);
                                        if (leafAtomD5 != null) {
                                            e(leafAtomD5.f17753b, 0, trackFragment2);
                                        }
                                        String str = trackEncryptionBox != null ? trackEncryptionBox.f17837b : null;
                                        ParsableByteArray parsableByteArray7 = null;
                                        ParsableByteArray parsableByteArray8 = null;
                                        for (int i41 = 0; i41 < arrayList7.size(); i41++) {
                                            Atom.LeafAtom leafAtom3 = (Atom.LeafAtom) arrayList7.get(i41);
                                            ParsableByteArray parsableByteArray9 = leafAtom3.f17753b;
                                            int i42 = leafAtom3.f17750a;
                                            if (i42 == 1935828848) {
                                                parsableByteArray9.F(12);
                                                if (parsableByteArray9.g() == 1936025959) {
                                                    parsableByteArray7 = parsableByteArray9;
                                                }
                                            } else if (i42 == 1936158820) {
                                                parsableByteArray9.F(12);
                                                if (parsableByteArray9.g() == 1936025959) {
                                                    parsableByteArray8 = parsableByteArray9;
                                                }
                                            }
                                        }
                                        i6 = 12;
                                        if (parsableByteArray7 != null && parsableByteArray8 != null) {
                                            parsableByteArray7.F(8);
                                            int iB = Atom.b(parsableByteArray7.g());
                                            int i43 = i28;
                                            parsableByteArray7.G(i43);
                                            if (iB == 1) {
                                                parsableByteArray7.G(i43);
                                            }
                                            if (parsableByteArray7.g() != 1) {
                                                throw ParserException.b("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            parsableByteArray8.F(8);
                                            int iB2 = Atom.b(parsableByteArray8.g());
                                            parsableByteArray8.G(i43);
                                            if (iB2 != 1) {
                                                i11 = i27;
                                                if (iB2 >= i11) {
                                                    parsableByteArray8.G(i43);
                                                }
                                            } else {
                                                if (parsableByteArray8.v() == 0) {
                                                    throw ParserException.b("Variable length description in sgpd found (unsupported)");
                                                }
                                                i11 = i27;
                                            }
                                            if (parsableByteArray8.v() != 1) {
                                                throw ParserException.b("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            parsableByteArray8.G(1);
                                            int iU3 = parsableByteArray8.u();
                                            int i44 = (iU3 & PsExtractor.VIDEO_STREAM_MASK) >> i43;
                                            int i45 = iU3 & 15;
                                            i27 = i11;
                                            boolean z4 = parsableByteArray8.u() == 1;
                                            if (z4) {
                                                int iU4 = parsableByteArray8.u();
                                                i28 = i43;
                                                int i46 = i26;
                                                byte[] bArr2 = new byte[i46];
                                                parsableByteArray8.e(bArr2, 0, i46);
                                                if (iU4 == 0) {
                                                    int iU5 = parsableByteArray8.u();
                                                    bArr = new byte[iU5];
                                                    parsableByteArray8.e(bArr, 0, iU5);
                                                }
                                                trackFragment2.k = true;
                                                trackFragment2.m = new TrackEncryptionBox(z4, str, iU4, bArr2, i44, i45, bArr);
                                            } else {
                                                i28 = i43;
                                            }
                                        }
                                        int size6 = arrayList7.size();
                                        for (int i47 = 0; i47 < size6; i47++) {
                                            Atom.LeafAtom leafAtom4 = (Atom.LeafAtom) arrayList7.get(i47);
                                            if (leafAtom4.f17750a == 1970628964) {
                                                ParsableByteArray parsableByteArray10 = leafAtom4.f17753b;
                                                parsableByteArray10.F(8);
                                                byte[] bArr3 = this.f;
                                                parsableByteArray10.e(bArr3, 0, 16);
                                                if (Arrays.equals(bArr3, f17778E)) {
                                                    e(parsableByteArray10, 16, trackFragment2);
                                                }
                                            }
                                        }
                                        i9 = 16;
                                        break;
                                    }
                                    Atom.LeafAtom leafAtom5 = (Atom.LeafAtom) arrayList7.get(i36);
                                    if (leafAtom5.f17750a == i10) {
                                        int i48 = i37 + 1;
                                        ParsableByteArray parsableByteArray11 = leafAtom5.f17753b;
                                        parsableByteArray11.F(8);
                                        int iG3 = parsableByteArray11.g();
                                        TrackSampleTable trackSampleTable4 = trackBundle2.d;
                                        DefaultSampleValues defaultSampleValues5 = trackFragment2.f17840a;
                                        int i49 = Util.f18979a;
                                        trackFragment2.g[i37] = parsableByteArray11.x();
                                        long[] jArr2 = trackFragment2.f;
                                        int i50 = i37;
                                        long j4 = trackFragment2.f17841b;
                                        jArr2[i50] = j4;
                                        if ((iG3 & 1) != 0) {
                                            jArr2[i50] = j4 + ((long) parsableByteArray11.g());
                                        }
                                        boolean z5 = (iG3 & 4) != 0;
                                        int iG4 = defaultSampleValues5.d;
                                        if (z5) {
                                            iG4 = parsableByteArray11.g();
                                        }
                                        boolean z6 = z5;
                                        boolean z7 = (iG3 & 256) != 0;
                                        boolean z8 = (iG3 & 512) != 0;
                                        boolean z9 = (iG3 & 1024) != 0;
                                        boolean z10 = (iG3 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0;
                                        Track track3 = trackSampleTable4.f17849a;
                                        boolean z11 = z9;
                                        long[] jArr3 = track3.f17834h;
                                        int i51 = iG4;
                                        if (jArr3 != null && jArr3.length == 1 && (jArr = track3.f17835i) != null) {
                                            long j5 = jArr3[0];
                                            if (j5 == 0 || Util.F(j5 + jArr[0], 1000000L, track3.d) >= track3.f17833e) {
                                                j3 = jArr[0];
                                            }
                                        }
                                        int[] iArr = trackFragment2.f17844h;
                                        long[] jArr4 = trackFragment2.f17845i;
                                        boolean[] zArr2 = trackFragment2.j;
                                        int i52 = trackFragment2.g[i50] + i38;
                                        long j6 = trackFragment2.f17848p;
                                        int i53 = i38;
                                        while (i53 < i52) {
                                            int iG5 = z7 ? parsableByteArray11.g() : defaultSampleValues5.f17776b;
                                            int i54 = i53;
                                            if (iG5 < 0) {
                                                throw ParserException.a(null, "Unexpected negative value: " + iG5);
                                            }
                                            int iG6 = z8 ? parsableByteArray11.g() : defaultSampleValues5.f17777c;
                                            if (iG6 < 0) {
                                                throw ParserException.a(null, "Unexpected negative value: " + iG6);
                                            }
                                            int iG7 = z11 ? parsableByteArray11.g() : (i54 == 0 && z6) ? i51 : defaultSampleValues5.d;
                                            int i55 = i48;
                                            ParsableByteArray parsableByteArray12 = parsableByteArray11;
                                            long jF = Util.F((((long) (z10 ? parsableByteArray11.g() : 0)) + j6) - j3, 1000000L, track3.f17832c);
                                            jArr4[i54] = jF;
                                            if (!trackFragment2.q) {
                                                jArr4[i54] = jF + trackBundle2.d.f17853h;
                                            }
                                            iArr[i54] = iG6;
                                            zArr2[i54] = ((iG7 >> 16) & 1) == 0;
                                            j6 += (long) iG5;
                                            i53 = i54 + 1;
                                            i52 = i52;
                                            arrayList4 = arrayList4;
                                            defaultSampleValues5 = defaultSampleValues5;
                                            i48 = i55;
                                            parsableByteArray11 = parsableByteArray12;
                                            track3 = track3;
                                        }
                                        arrayList3 = arrayList4;
                                        trackFragment2.f17848p = j6;
                                        i38 = i52;
                                        i37 = i48;
                                    } else {
                                        arrayList3 = arrayList4;
                                    }
                                    i36++;
                                    size4 = size4;
                                    i29 = i29;
                                    size5 = size5;
                                    arrayList4 = arrayList3;
                                    i10 = 1953658222;
                                }
                            } else {
                                arrayList = arrayList6;
                                i5 = size4;
                                i8 = i29;
                                arrayList2 = arrayList4;
                                i9 = i26;
                                i6 = 12;
                            }
                            i7 = 8;
                        } else {
                            arrayList = arrayList6;
                            i5 = size4;
                            i6 = i16;
                            i7 = i17;
                            i8 = i29;
                            arrayList2 = arrayList4;
                            i9 = i26;
                        }
                        i29 = i8 + 1;
                        i26 = i9;
                        i16 = i6;
                        i17 = i7;
                        arrayList6 = arrayList;
                        size4 = i5;
                        arrayList4 = arrayList2;
                    }
                    i2 = i16;
                    i3 = i17;
                    DrmInitData drmInitDataA2 = a(arrayList4);
                    if (drmInitDataA2 != null) {
                        int size7 = sparseArray.size();
                        for (int i56 = 0; i56 < size7; i56++) {
                            TrackBundle trackBundle3 = (TrackBundle) sparseArray.valueAt(i56);
                            TrackSampleTable trackSampleTable5 = trackBundle3.d;
                            DefaultSampleValues defaultSampleValues6 = trackBundle3.f17798b.f17840a;
                            int i57 = Util.f18979a;
                            TrackEncryptionBox trackEncryptionBox2 = trackSampleTable5.f17849a.k[defaultSampleValues6.f17775a];
                            DrmInitData drmInitDataA3 = drmInitDataA2.a(trackEncryptionBox2 != null ? trackEncryptionBox2.f17837b : null);
                            Format.Builder builderA = trackBundle3.d.f17849a.f.a();
                            builderA.f17088n = drmInitDataA3;
                            trackBundle3.f17797a.c(new Format(builderA));
                        }
                    }
                    if (this.s != -9223372036854775807L) {
                        int size8 = sparseArray.size();
                        for (int i58 = 0; i58 < size8; i58++) {
                            TrackBundle trackBundle4 = (TrackBundle) sparseArray.valueAt(i58);
                            long j7 = this.s;
                            int i59 = trackBundle4.f;
                            while (true) {
                                TrackFragment trackFragment3 = trackBundle4.f17798b;
                                if (i59 >= trackFragment3.f17843e || trackFragment3.f17845i[i59] > j7) {
                                    break;
                                }
                                if (trackFragment3.j[i59]) {
                                    trackBundle4.f17802i = i59;
                                }
                                i59++;
                            }
                        }
                        i4 = 1;
                        this.s = -9223372036854775807L;
                    }
                } else {
                    i2 = i16;
                    i3 = i17;
                    i4 = 1;
                    if (!arrayDeque.isEmpty()) {
                        ((Atom.ContainerAtom) arrayDeque.peek()).d.add(containerAtom);
                    }
                }
                i16 = i2;
                i17 = i3;
                i18 = i4;
            }
            i4 = 1;
            i16 = i2;
            i17 = i3;
            i18 = i4;
        }
        this.f17788l = 0;
        this.o = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        SparseArray sparseArray = this.f17783b;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TrackBundle) sparseArray.valueAt(i2)).d();
        }
        this.k.clear();
        this.r = 0;
        this.s = j2;
        this.j.clear();
        this.f17788l = 0;
        this.o = 0;
    }
}
