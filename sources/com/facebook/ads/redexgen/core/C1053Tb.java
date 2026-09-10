package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.mp4.MotionPhotoMetadata;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1053Tb implements UK, Uj {
    public static byte[] A0Q;
    public static String[] A0R = {"NUT6ypXSHiS4J1Qe9g4LOXxZvmmU7mnX", "JH5e6JiDLqpQkmQeK07Zz6ngW1v2lGkJ", "I5aweA8RGWIFypEejOu6", "Q5w5ismp6kt0KnxqTdEJCbmbthzdLpcQ", "mvrYhRWEJPsztg67rX76Ookp6Zk7pVOx", "T99H6ErOcdo6LgjhhlFbccuqSDdx1PBc", "NGnQsXxOXXsOwnBVwWcfQbm7HiQdaJGD", "Tm7Ky6D3rFaIAf5wuTE1sGpz4jcDe75W"};
    public static final UO A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0A;
    public long A0B;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0C;
    public UL A0D;
    public MotionPhotoMetadata A0E;
    public C1576fq A0F;
    public WP[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final WW A0J;
    public final C1576fq A0K;
    public final C1576fq A0L;
    public final C1576fq A0M;
    public final C1576fq A0N;
    public final ArrayDeque<C1063Tm> A0O;
    public final List<Metadata.Entry> A0P;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private int A02(WJ wj, C1081Ug c1081Ug) throws IOException {
        int i;
        long jA8d = wj.A8d();
        if (this.A08 == -1) {
            this.A08 = A01(jA8d);
            if (this.A08 == -1) {
                return -1;
            }
        }
        WP wp = this.A0G[this.A08];
        InterfaceC1086Uo interfaceC1086Uo = wp.A01;
        int i2 = wp.A00;
        long j = wp.A04.A06[i2];
        int i3 = wp.A04.A05[i2];
        C1087Up c1087Up = wp.A02;
        long j2 = (j - jA8d) + ((long) this.A05);
        if (j2 < 0 || j2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            c1081Ug.A00 = j;
            return 1;
        }
        if (wp.A03.A02 == 1) {
            j2 += 8;
            i3 -= 8;
        }
        wj.AJ9((int) j2);
        WZ wz = wp.A03;
        if (A0R[4].charAt(0) == 'm') {
            String[] strArr = A0R;
            strArr[6] = "V5VPNaDOx7L3pxLqCvlnTCZLNa4LXGZn";
            strArr[5] = "WTXU2x7OL0C6DOLdbcfsxjQxykFDhBKM";
            if (wz.A01 != 0) {
                byte[] bArrA0l = this.A0L.A0l();
                bArrA0l[0] = 0;
                bArrA0l[1] = 0;
                bArrA0l[2] = 0;
                int i4 = wp.A03.A01;
                int i5 = 4 - wp.A03.A01;
                while (this.A06 < i3) {
                    if (this.A07 == 0) {
                        wj.readFully(bArrA0l, i5, i4);
                        this.A05 += i4;
                        this.A0L.A0f(0);
                        int iA0C = this.A0L.A0C();
                        if (iA0C < 0) {
                            throw Q6.A01(A09(48, 18, 63), null);
                        }
                        this.A07 = iA0C;
                        this.A0M.A0f(0);
                        interfaceC1086Uo.AHx(this.A0M, 4);
                        this.A06 += 4;
                        i3 += i5;
                    } else {
                        int iAHv = interfaceC1086Uo.AHv(wj, this.A07, false);
                        this.A05 += iAHv;
                        this.A06 += iAHv;
                        this.A07 -= iAHv;
                    }
                }
            } else {
                if (A09(66, 9, 40).equals(wp.A03.A07.A0W)) {
                    if (this.A06 == 0) {
                        U5.A07(i3, this.A0N);
                        interfaceC1086Uo.AHx(this.A0N, 7);
                        this.A06 += 7;
                    }
                    i3 += 7;
                } else if (c1087Up != null) {
                    c1087Up.A03(wj);
                }
                while (this.A06 < i3) {
                    int iAHv2 = interfaceC1086Uo.AHv(wj, i3 - this.A06, false);
                    this.A05 += iAHv2;
                    this.A06 += iAHv2;
                    this.A07 -= iAHv2;
                }
            }
            long j3 = wp.A04.A07[i2];
            int i6 = wp.A04.A04[i2];
            if (c1087Up != null) {
                i = 0;
                c1087Up.A04(interfaceC1086Uo, j3, i6, i3, 0, null);
                if (i2 + 1 == wp.A04.A01) {
                    String[] strArr2 = A0R;
                    if (strArr2[7].charAt(18) == strArr2[3].charAt(18)) {
                        A0R[0] = "pfKdmMtqQATW4tq2F1tkx3HXWBYLJOh7";
                        c1087Up.A05(interfaceC1086Uo, null);
                    }
                }
            } else {
                i = 0;
                interfaceC1086Uo.AI0(j3, i6, i3, 0, null);
            }
            wp.A00++;
            this.A08 = -1;
            this.A05 = i;
            this.A06 = i;
            this.A07 = i;
            return i;
        }
        throw new RuntimeException();
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0Q = new byte[]{3, 54, 45, 47, 98, 49, 43, 56, 39, 98, 46, 39, 49, 49, 98, 54, 42, 35, 44, 98, 42, 39, 35, 38, 39, 48, 98, 46, 39, 44, 37, 54, 42, 98, 106, 55, 44, 49, 55, 50, 50, 45, 48, 54, 39, 38, 107, 108, 52, 19, 11, 28, 17, 20, 25, 93, 51, 60, 49, 93, 17, 24, 19, 26, 9, 21, 11, 31, cw.l, 3, 5, 69, 11, 9, 94, 77, 89, 72, 69, 67, 3, 88, 94, 89, 73, 1, 68, 72};
    }

    static {
        A0C();
        A0S = new UO() { // from class: com.facebook.ads.redexgen.X.Tc
            @Override // com.facebook.ads.redexgen.core.UO
            public final UK[] A5D() {
                return C1053Tb.A0M();
            }

            @Override // com.facebook.ads.redexgen.core.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
    }

    public C1053Tb() {
        this(0);
    }

    public C1053Tb(int i) {
        this.A0I = i;
        this.A04 = (i & 4) != 0 ? 3 : 0;
        this.A0J = new WW();
        this.A0P = new ArrayList();
        this.A0K = new C1576fq(16);
        this.A0O = new ArrayDeque<>();
        this.A0M = new C1576fq(AbstractC1078Ud.A03);
        this.A0L = new C1576fq(4);
        this.A0N = new C1576fq();
        this.A08 = -1;
        this.A0D = UL.A00;
        this.A0G = new WP[0];
    }

    public static int A00(int i) {
        switch (i) {
            case 1751476579:
                return 2;
            case 1903435808:
                return 1;
            default:
                return 0;
        }
    }

    private int A01(long j) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        for (int i3 = 0; i3 < this.A0G.length; i3++) {
            WP wp = this.A0G[i3];
            int i4 = wp.A00;
            if (i4 != wp.A04.A01) {
                long j4 = wp.A04.A06[i4];
                long j5 = ((long[][]) AbstractC1600gE.A0f(this.A0H))[i3][i4];
                long j6 = j4 - j;
                int i5 = (j6 < 0 || j6 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) ? 1 : 0;
                if ((i5 == 0 && i != 0) || (i5 == i && j6 < sampleAccumulatedBytes)) {
                    i = i5;
                    sampleAccumulatedBytes = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j3) {
                    j3 = j5;
                    trackIndex = i5;
                    minAccumulatedBytesTrackIndex = i3;
                }
            }
        }
        if (j3 == Long.MAX_VALUE || trackIndex == 0) {
            return i2;
        }
        long preferredSkipAmount = 10485760 + j3;
        if (j2 < preferredSkipAmount) {
            return i2;
        }
        return minAccumulatedBytesTrackIndex;
    }

    private int A03(WJ wj, C1081Ug c1081Ug) throws IOException {
        int iA07 = this.A0J.A07(wj, c1081Ug, this.A0P);
        if (iA07 == 1 && c1081Ug.A00 == 0) {
            A0A();
        }
        return iA07;
    }

    public static int A04(C1124Wc c1124Wc, long j) {
        int iA00 = c1124Wc.A00(j);
        if (iA00 == -1) {
            return c1124Wc.A01(j);
        }
        return iA00;
    }

    public static int A05(C1576fq c1576fq) {
        c1576fq.A0f(8);
        int majorBrand = A00(c1576fq.A0C());
        if (majorBrand != 0) {
            return majorBrand;
        }
        c1576fq.A0g(4);
        while (c1576fq.A07() > 0) {
            int majorBrand2 = A00(c1576fq.A0C());
            if (majorBrand2 != 0) {
                return majorBrand2;
            }
        }
        return 0;
    }

    public static long A06(C1124Wc c1124Wc, long j, long j2) {
        int iA04 = A04(c1124Wc, j);
        if (iA04 == -1) {
            return j2;
        }
        return Math.min(c1124Wc.A06[iA04], j2);
    }

    private final C1082Ui A07(long j, int secondSampleIndex) {
        long jA06;
        long j2;
        if (this.A0G.length == 0) {
            return new C1082Ui(C1083Uk.A03);
        }
        long j3 = C.TIME_UNSET;
        long jA07 = -1;
        int i = secondSampleIndex != -1 ? secondSampleIndex : this.A03;
        if (i != -1) {
            C1124Wc c1124Wc = this.A0G[i].A04;
            int iA04 = A04(c1124Wc, j);
            if (iA04 == -1) {
                return new C1082Ui(C1083Uk.A03);
            }
            j2 = c1124Wc.A07[iA04];
            jA06 = c1124Wc.A06[iA04];
            if (j2 < j && iA04 < c1124Wc.A01 - 1) {
                int mainTrackIndex = c1124Wc.A01(j);
                if (A0R[4].charAt(0) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr = A0R;
                strArr[7] = "5TbJYWak67IZTn7wKEErPgQ4PrngZc54";
                strArr[3] = "J15wyTyjd5tEdyyLx9EQD1n9Dt372wer";
                if (mainTrackIndex != -1 && mainTrackIndex != iA04) {
                    j3 = c1124Wc.A07[mainTrackIndex];
                    long[] jArr = c1124Wc.A06;
                    if (A0R[0].charAt(30) != 'Y') {
                        A0R[2] = "ZiTUjhZue4Lf5tJA0gsj";
                        jA07 = jArr[mainTrackIndex];
                    } else {
                        jA07 = jArr[mainTrackIndex];
                    }
                }
            }
        } else {
            jA06 = Long.MAX_VALUE;
            j2 = j;
        }
        String[] strArr2 = A0R;
        if (strArr2[6].charAt(7) != strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        A0R[4] = "mauqB61ONe8hzhGmkHhtsqUQU0XayHtr";
        if (secondSampleIndex == -1) {
            for (int i2 = 0; i2 < this.A0G.length; i2++) {
                if (i2 != this.A03) {
                    C1124Wc sampleTable = this.A0G[i2].A04;
                    jA06 = A06(sampleTable, j2, jA06);
                    if (j3 != C.TIME_UNSET) {
                        jA07 = A06(sampleTable, j3, jA07);
                    }
                }
            }
        }
        C1083Uk c1083Uk = new C1083Uk(j2, jA06);
        if (j3 == C.TIME_UNSET) {
            return new C1082Ui(c1083Uk);
        }
        return new C1082Ui(c1083Uk, new C1083Uk(j3, jA07));
    }

    public static /* synthetic */ WZ A08(WZ wz) {
        return wz;
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 == 2 && (this.A0I & 2) != 0) {
            this.A0D.AJX(0, 4).A6U(new P5().A0v(this.A0E == null ? null : new Metadata(this.A0E)).A14());
            this.A0D.A6E();
            this.A0D.AID(new C1120Vy(C.TIME_UNSET));
        }
    }

    private void A0D(long j) throws Q6 {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j) {
            C1063Tm c1063TmPop = this.A0O.pop();
            if (((W5) c1063TmPop).A00 == 1836019574) {
                A0G(c1063TmPop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                C1063Tm containerAtom = this.A0O.peek();
                containerAtom.A04(c1063TmPop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j) {
        if (this.A01 == 1836086884) {
            this.A0E = new MotionPhotoMetadata(0L, j, C.TIME_UNSET, j + ((long) this.A00), this.A09 - ((long) this.A00));
        }
    }

    private void A0F(WJ wj) throws IOException {
        this.A0N.A0d(8);
        wj.AG1(this.A0N.A0l(), 0, 8);
        WB.A0Q(this.A0N);
        wj.AJ9(this.A0N.A09());
        wj.AHr();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167 A[LOOP:1: B:60:0x0163->B:62:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0186  */
    /* JADX WARN: Code duplicated, block: B:95:0x0221 A[SYNTHETIC] */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    private void A0G(C1063Tm c1063Tm) throws Q6 {
        int i;
        int i2;
        long j;
        int i3;
        int sampleIndex;
        int size = -1;
        long jMax = C.TIME_UNSET;
        long j2 = C.TIME_UNSET;
        long j3 = C.TIME_UNSET;
        ArrayList arrayList = new ArrayList();
        Metadata udtaMetaMetadata = null;
        Metadata metadata = null;
        boolean z = this.A02 == 1;
        UV gaplessInfoHolder = new UV();
        C1062Tl c1062TlA03 = c1063Tm.A03(1969517665);
        if (c1062TlA03 != null) {
            Pair<Metadata, Metadata> pairA07 = WB.A07(c1062TlA03);
            udtaMetaMetadata = (Metadata) pairA07.first;
            metadata = (Metadata) pairA07.second;
            if (udtaMetaMetadata != null) {
                gaplessInfoHolder.A05(udtaMetaMetadata);
            }
        } else {
            if (A0R[1].charAt(3) == 'e') {
                String[] strArr = A0R;
                strArr[6] = "jFnwPpPOtaqvKoddzViqE5TBuX3dgSPs";
                strArr[5] = "rzWGRiRO7fRywPB3GOqU07VAFGih7yUC";
            }
            throw new RuntimeException();
        }
        Metadata mdtaMetadata = null;
        C1063Tm c1063TmA02 = c1063Tm.A02(1835365473);
        if (c1063TmA02 != null) {
            mdtaMetadata = WB.A0C(c1063TmA02);
        }
        List<C1124Wc> listA0O = WB.A0O(c1063Tm, gaplessInfoHolder, C.TIME_UNSET, null, (this.A0I & 1) != 0, z, new InterfaceC1699hs() { // from class: com.facebook.ads.redexgen.X.Td
            @Override // com.facebook.ads.redexgen.core.InterfaceC1699hs
            public final Object A41(Object obj) {
                return C1053Tb.A08((WZ) obj);
            }
        });
        int trackCount = listA0O.size();
        for (int i4 = 0; i4 < trackCount; i4++) {
            C1124Wc c1124Wc = listA0O.get(i4);
            int trackCount2 = c1124Wc.A01;
            if (trackCount2 != 0) {
                WZ track = c1124Wc.A03;
                UL ul = this.A0D;
                int trackCount3 = track.A03;
                WP wp = new WP(track, c1124Wc, ul.AJX(i4, trackCount3));
                long j4 = track.A04 != C.TIME_UNSET ? track.A04 : c1124Wc.A02;
                jMax = Math.max(jMax, j4);
                if (1 == track.A03) {
                    j3 = j4;
                } else {
                    int i5 = track.A03;
                    String[] strArr2 = A0R;
                    if (strArr2[7].charAt(18) != strArr2[3].charAt(18)) {
                        A0R[1] = "16qeY1a9uRofkFmV6YVYNVxD16sJ1LVT";
                        if (0 == i5) {
                            j2 = j4;
                        }
                    } else {
                        A0R[4] = "mWL6cttZCPsAHlxD5l52kj0q6ndFkmbf";
                        if (2 == i5) {
                            j2 = j4;
                        }
                    }
                }
                if (A09(75, 13, 110).equals(track.A07.A0W)) {
                    i = c1124Wc.A00 * 16;
                } else {
                    i = c1124Wc.A00 + 30;
                }
                P5 formatBuilder = track.A07.A07();
                formatBuilder.A0h(i);
                if (track.A03 == 2) {
                    String[] strArr3 = A0R;
                    if (strArr3[6].charAt(7) == strArr3[5].charAt(7)) {
                        A0R[0] = "YPR19GhXA3T0Si99CJNbp3ypaJKJKJzD";
                        if (j4 > 0 && c1124Wc.A01 > 1) {
                            formatBuilder.A0X(c1124Wc.A01 / (j4 / 1000000.0f));
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
                if (jMax > 0) {
                    int i6 = c1124Wc.A01;
                    int i7 = A0R[0].charAt(30);
                    if (i7 != 89) {
                        A0R[1] = "nRGeEiOK9hR8ztPeDP671vRBjj5dcLey";
                        if (i6 > 0) {
                            i2 = c1124Wc.A05.length;
                            if (i2 == c1124Wc.A01) {
                                j = 0;
                                for (i3 = 0; i3 < sampleIndex; i3++) {
                                    int sampleIndex2 = c1124Wc.A05[i3];
                                    j += (long) sampleIndex2;
                                }
                                if (A0R[0].charAt(30) != 'Y') {
                                    A0R[4] = "mn2EOq8tQKipwnoEuaelyA1uoWGMjSBx";
                                    formatBuilder.A0a((int) ((8000000 * j) / jMax));
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                        }
                    } else if (i6 > 0) {
                        i2 = c1124Wc.A05.length;
                        if (i2 == c1124Wc.A01) {
                            j = 0;
                            while (i3 < sampleIndex) {
                                int sampleIndex3 = c1124Wc.A05[i3];
                                j += (long) sampleIndex3;
                            }
                            if (A0R[0].charAt(30) != 'Y') {
                                A0R[4] = "mn2EOq8tQKipwnoEuaelyA1uoWGMjSBx";
                                formatBuilder.A0a((int) ((8000000 * j) / jMax));
                            } else {
                                throw new RuntimeException();
                            }
                        }
                    }
                }
                int i8 = track.A03;
                WM.A0D(i8, gaplessInfoHolder, formatBuilder);
                int i9 = track.A03;
                int i10 = A0R[2].length();
                if (i10 != 20) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0R;
                strArr4[7] = "IldH2fRvji5nbI340jEOFo1lJ6ucqsv7";
                strArr4[3] = "qjgLgg8DNuyjv0vCuwEcUwWIjfNQCdF6";
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.A0P.isEmpty() ? null : new Metadata(this.A0P);
                WM.A0C(i9, udtaMetaMetadata, mdtaMetadata, formatBuilder, metadataArr);
                wp.A01.A6U(formatBuilder.A14());
                int i11 = track.A03;
                if (i11 == 2 && size == -1) {
                    size = arrayList.size();
                }
                arrayList.add(wp);
            }
        }
        this.A03 = size;
        this.A0B = jMax;
        this.A0C = j2;
        this.A0A = j3;
        this.A0G = (WP[]) arrayList.toArray(new WP[0]);
        this.A0H = A0N(this.A0G);
        this.A0D.A6E();
        this.A0D.AID(this);
    }

    private void A0H(WP wp, long j) {
        C1124Wc c1124Wc = wp.A04;
        int sampleIndex = c1124Wc.A00(j);
        if (sampleIndex == -1) {
            sampleIndex = c1124Wc.A01(j);
        }
        wp.A00 = sampleIndex;
    }

    public static boolean A0I(int i) {
        if (i != 1836019574 && i != 1953653099 && i != 1835297121 && i != 1835626086) {
            String[] strArr = A0R;
            if (strArr[7].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            A0R[2] = "3YIqewhCwjG946DMJijN";
            if (i != 1937007212 && i != 1701082227 && i != 1835365473) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    public static boolean A0J(int i) {
        if (i != 1835296868 && i != 1836476516 && i != 1751411826 && i != 1937011556 && i != 1937011827) {
            if (A0R[1].charAt(3) != 'e') {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[7] = "N6gbuPifcKq94V5CzUEVD043Y49SVUG8";
            strArr[3] = "g0CnhcYi042EtcaaKhEv8tAgD7qyB3ig";
            if (i != 1937011571 && i != 1668576371 && i != 1701606260) {
                String[] strArr2 = A0R;
                if (strArr2[6].charAt(7) != strArr2[5].charAt(7)) {
                    A0R[1] = "KPmeYlzfGdD3LLwLXnwktzsmL0Ou8sjR";
                    if (i != 1937011555) {
                        if (i == 1937011578 && i != 1937013298 && i != 1937007471 && i != 1668232756 && i != 1953196132 && i != 1718909296 && i != 1969517665 && i != 1801812339 && i != 1768715124) {
                            return false;
                        }
                    }
                } else {
                    A0R[0] = "jzzH39RnaOpKTTGMhBx4RZhmZWHFKRbC";
                    if (i != 1937011555) {
                        if (i == 1937011578) {
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0154  */
    private boolean A0K(WJ wj) throws IOException {
        C1063Tm containerAtom;
        long jA8d;
        boolean z;
        boolean z2;
        if (this.A00 == 0) {
            if (!wj.AGZ(this.A0K.A0l(), 0, 8, true)) {
                A0B();
                return false;
            }
            this.A00 = 8;
            this.A0K.A0f(0);
            this.A09 = this.A0K.A0Q();
            this.A01 = this.A0K.A0C();
        }
        if (this.A09 == 1) {
            wj.readFully(this.A0K.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A09 = this.A0K.A0R();
        } else if (this.A09 == 0) {
            long endPosition = wj.A8E();
            if (endPosition == -1 && (containerAtom = this.A0O.peek()) != null) {
                endPosition = containerAtom.A00;
            }
            if (endPosition != -1) {
                long endPosition2 = endPosition - wj.A8d();
                long j = this.A00;
                if (A0R[0].charAt(30) == 'Y') {
                    throw new RuntimeException();
                }
                A0R[0] = "Z5gYsDTQqqhxWfTCC3jE6nZFKC0Nxmlo";
                this.A09 = endPosition2 + j;
            }
        }
        if (this.A09 >= this.A00) {
            if (A0I(this.A01)) {
                long jA8d2 = (wj.A8d() + this.A09) - ((long) this.A00);
                if (this.A09 != this.A00) {
                    int i = this.A01;
                    String[] strArr = A0R;
                    if (strArr[7].charAt(18) != strArr[3].charAt(18)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0R;
                    strArr2[7] = "PHBD8u1ZziE06Gk25gEAwYKikl52s7uP";
                    strArr2[3] = "0VVUkzldPpcTkLJX0pEi6Ls2Nd43KsGX";
                    if (i == 1835365473) {
                        A0F(wj);
                    }
                }
                this.A0O.push(new C1063Tm(this.A01, jA8d2));
                if (this.A09 == this.A00) {
                    A0D(jA8d2);
                } else {
                    A0A();
                }
            } else {
                boolean zA0J = A0J(this.A01);
                if (A0R[2].length() != 20) {
                    A0R[4] = "mq9ruLyUoTL7L5pfLNIgPCH2VPEGJYYX";
                    if (zA0J) {
                        if (this.A00 == 8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        AbstractC1517es.A08(z);
                        if (this.A09 <= 2147483647L) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        AbstractC1517es.A08(z2);
                        C1576fq c1576fq = new C1576fq((int) this.A09);
                        C1576fq atomData = this.A0K;
                        System.arraycopy(atomData.A0l(), 0, c1576fq.A0l(), 0, 8);
                        this.A0F = c1576fq;
                        this.A04 = 1;
                    } else {
                        jA8d = wj.A8d() - ((long) this.A00);
                        if (A0R[1].charAt(3) != 'e') {
                            A0R[4] = "mhu2zk2K0Swmk47DOyJIkVTyAzSdmj33";
                            A0E(jA8d);
                            this.A0F = null;
                            this.A04 = 1;
                        } else {
                            String[] strArr3 = A0R;
                            strArr3[7] = "APjeOCKWMEGnWLZjfqELVPMbDhQp1Xft";
                            strArr3[3] = "072jIj0JdWCub8DHysEboGlMzuki9op9";
                            A0E(jA8d);
                            this.A0F = null;
                            this.A04 = 1;
                        }
                    }
                } else {
                    A0R[2] = "WilEffrCGdMCPXATVVkP";
                    if (zA0J) {
                        if (this.A00 == 8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        AbstractC1517es.A08(z);
                        if (this.A09 <= 2147483647L) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        AbstractC1517es.A08(z2);
                        C1576fq c1576fq2 = new C1576fq((int) this.A09);
                        C1576fq atomData2 = this.A0K;
                        System.arraycopy(atomData2.A0l(), 0, c1576fq2.A0l(), 0, 8);
                        this.A0F = c1576fq2;
                        this.A04 = 1;
                    } else {
                        jA8d = wj.A8d() - ((long) this.A00);
                        if (A0R[1].charAt(3) != 'e') {
                            A0R[4] = "mhu2zk2K0Swmk47DOyJIkVTyAzSdmj33";
                            A0E(jA8d);
                            this.A0F = null;
                            this.A04 = 1;
                        } else {
                            String[] strArr4 = A0R;
                            strArr4[7] = "APjeOCKWMEGnWLZjfqELVPMbDhQp1Xft";
                            strArr4[3] = "072jIj0JdWCub8DHysEboGlMzuki9op9";
                            A0E(jA8d);
                            this.A0F = null;
                            this.A04 = 1;
                        }
                    }
                }
            }
            return true;
        }
        throw Q6.A00(A09(0, 48, 0));
    }

    private boolean A0L(WJ wj, C1081Ug c1081Ug) throws IOException {
        long j = this.A09 - ((long) this.A00);
        long jA8d = wj.A8d() + j;
        boolean z = false;
        C1576fq c1576fq = this.A0F;
        if (c1576fq != null) {
            wj.readFully(c1576fq.A0l(), this.A00, (int) j);
            if (this.A01 == 1718909296) {
                this.A02 = A05(c1576fq);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A05(new C1062Tl(this.A01, c1576fq));
            }
        } else if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            int i = (int) j;
            String[] strArr = A0R;
            if (strArr[7].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            A0R[2] = "CPmd8d6bWhE45MZJwdPT";
            wj.AJ9(i);
        } else {
            c1081Ug.A00 = wj.A8d() + j;
            z = true;
        }
        A0D(jA8d);
        return z && this.A04 != 2;
    }

    public static /* synthetic */ UK[] A0M() {
        return new UK[]{new C1053Tb()};
    }

    public static long[][] A0N(WP[] wpArr) {
        long[][] jArr = new long[wpArr.length][];
        int[] iArr = new int[wpArr.length];
        long[] jArr2 = new long[wpArr.length];
        boolean[] zArr = new boolean[wpArr.length];
        for (int i = 0; i < wpArr.length; i++) {
            jArr[i] = new long[wpArr[i].A04.A01];
            jArr2[i] = wpArr[i].A04.A07[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < wpArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            int i4 = 0;
            while (true) {
                int minTimeTrackIndex = wpArr.length;
                if (A0R[1].charAt(3) != 'e') {
                    throw new RuntimeException();
                }
                A0R[0] = "PvQHTc1qEQE1BCDGCOvlZEhDyshyiKQ3";
                if (i4 < minTimeTrackIndex) {
                    if (!zArr[i4] && jArr2[i4] <= j2) {
                        i3 = i4;
                        j2 = jArr2[i4];
                    }
                    i4++;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) wpArr[i3].A04.A05[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = wpArr[i3].A04.A07[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final long A7j() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final C1082Ui A8r(long j) {
        return A07(j, -1);
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AA0(UL ul) {
        this.A0D = ul;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final boolean AAY() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final int AGT(WJ wj, C1081Ug c1081Ug) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (!A0K(wj)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    if (A0L(wj, c1081Ug)) {
                        if (A0R[0].charAt(30) != 'Y') {
                            A0R[0] = "WW7RU0YyVZYcqT7LKW1qhBVpSoRBqfXQ";
                            return 1;
                        }
                        throw new RuntimeException();
                    }
                    break;
                case 2:
                    return A02(wj, c1081Ug);
                case 3:
                    int iA03 = A03(wj, c1081Ug);
                    String[] strArr = A0R;
                    if (strArr[7].charAt(18) == strArr[3].charAt(18)) {
                        A0R[4] = "mDiw27TLi806vElWjIgWsRLwXmS1eMms";
                        return iA03;
                    }
                    String[] strArr2 = A0R;
                    strArr2[6] = "xgJiGfYOT8y1zClzSI10nAxOa2eHPkLm";
                    strArr2[5] = "anAV1A8OrmlTs1bkKqgXGKp0FRJYDIne";
                    return iA03;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AIC(long j, long j2) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j == 0) {
            if (this.A04 != 3) {
                A0A();
                return;
            } else {
                this.A0J.A08();
                this.A0P.clear();
                return;
            }
        }
        for (WP wp : this.A0G) {
            A0H(wp, j2);
            if (wp.A02 != null) {
                wp.A02.A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final boolean AJB(WJ wj) throws IOException {
        return WX.A02(wj, (this.A0I & 2) != 0);
    }
}
