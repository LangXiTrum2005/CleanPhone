package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.facebook.ads.androidx.media3.extractor.mp4.Mp4Extractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2612m3 implements H9, HY {
    public static byte[] A0Q;
    public static String[] A0R = {"uzhMW", "LbToze1ZyMStOzMPMggUyU89k761Fydj", "roznHbdGo", "zeOiwqyw9G80TO", "hwgMtT9WWej", "AZ5CtgA3jsgDmrh", "c4g75mNjYzBkznfgxB8HcDFPfSogi", "Prtl1ARtkjOsoD"};
    public static final HD A0S;
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
    public C11074v A0D;
    public HA A0E;
    public MotionPhotoMetadata A0F;
    public JE[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final C11074v A0J;
    public final C11074v A0K;
    public final C11074v A0L;
    public final C11074v A0M;
    public final JL A0N;
    public final ArrayDeque<C2623mE> A0O;
    public final List<Metadata.Entry> A0P;

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121 A[LOOP:1: B:39:0x011d->B:41:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x016a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x018b  */
    /* JADX WARN: Code duplicated, block: B:56:0x019f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private int A03(InterfaceC2651ms interfaceC2651ms, HV hv) throws IOException {
        long j;
        int i2;
        int i3;
        byte[] bArrA0l;
        int i4;
        int i5;
        int iA0C;
        long jA8n = interfaceC2651ms.A8n();
        if (this.A08 == -1) {
            this.A08 = A01(jA8n);
            if (this.A08 == -1) {
                return -1;
            }
        }
        JE je = this.A0G[this.A08];
        InterfaceC1407Hd interfaceC1407Hd = je.A01;
        int i6 = je.A00;
        long j2 = je.A04.A06[i6];
        int i7 = je.A04.A05[i6];
        C1408He c1408He = je.A02;
        long j3 = (j2 - jA8n) + ((long) this.A05);
        if (j3 < 0 || j3 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            hv.A00 = j2;
            return 1;
        }
        int i8 = je.A03.A02;
        if (A0R[2].length() != 19) {
            A0R[6] = "rX6gisAdcV7LBeXwmOhQV8Eb98OXk";
            if (i8 == 1) {
                j3 += 8;
                if (A0R[6].length() == 29) {
                    String[] strArr = A0R;
                    strArr[3] = "KKgaKTwS1RwNPE";
                    strArr[7] = "5hDvshmtbzc6vz";
                    i7 -= 8;
                    interfaceC2651ms.AK3((int) j3);
                    if (je.A03.A01 != 0) {
                        bArrA0l = this.A0K.A0l();
                        bArrA0l[0] = 0;
                        bArrA0l[1] = 0;
                        bArrA0l[2] = 0;
                        i4 = je.A03.A01;
                        i5 = 4 - je.A03.A01;
                        while (this.A06 < i7) {
                            if (this.A07 == 0) {
                                interfaceC2651ms.readFully(bArrA0l, i5, i4);
                                this.A05 += i4;
                                this.A0K.A0f(0);
                                iA0C = this.A0K.A0C();
                                if (iA0C >= 0) {
                                    throw C3K.A01(A09(48, 18, 118), null);
                                }
                                this.A07 = iA0C;
                                this.A0L.A0f(0);
                                interfaceC1407Hd.AIr(this.A0L, 4);
                                this.A06 += 4;
                                i7 += i5;
                            } else {
                                int iAIp = interfaceC1407Hd.AIp(interfaceC2651ms, this.A07, false);
                                this.A05 += iAIp;
                                this.A06 += iAIp;
                                this.A07 -= iAIp;
                            }
                        }
                    } else {
                        if (A09(66, 9, 68).equals(je.A03.A07.A0W)) {
                            if (this.A06 == 0) {
                                AbstractC1398Gu.A07(i7, this.A0M);
                                interfaceC1407Hd.AIr(this.A0M, 7);
                                this.A06 += 7;
                            }
                            i7 += 7;
                        } else if (c1408He != null) {
                            c1408He.A03(interfaceC2651ms);
                        }
                        while (this.A06 < i7) {
                            int iAIp2 = interfaceC1407Hd.AIp(interfaceC2651ms, i7 - this.A06, false);
                            this.A05 += iAIp2;
                            this.A06 += iAIp2;
                            this.A07 -= iAIp2;
                        }
                    }
                    j = je.A04.A07[i6];
                    i2 = je.A04.A04[i6];
                    if (A0R[4].length() == 11) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "dniiMzQMBKOANx9";
                        strArr2[0] = "Fj7cY";
                        if (c1408He != null) {
                            i3 = 0;
                            c1408He.A04(interfaceC1407Hd, j, i2, i7, 0, null);
                            if (i6 + 1 == je.A04.A01) {
                                c1408He.A05(interfaceC1407Hd, null);
                            }
                        } else {
                            i3 = 0;
                            interfaceC1407Hd.AIu(j, i2, i7, 0, null);
                        }
                        je.A00++;
                        this.A08 = -1;
                        this.A05 = i3;
                        this.A06 = i3;
                        this.A07 = i3;
                        return i3;
                    }
                }
            } else {
                interfaceC2651ms.AK3((int) j3);
                if (je.A03.A01 != 0) {
                    bArrA0l = this.A0K.A0l();
                    bArrA0l[0] = 0;
                    bArrA0l[1] = 0;
                    bArrA0l[2] = 0;
                    i4 = je.A03.A01;
                    i5 = 4 - je.A03.A01;
                    while (this.A06 < i7) {
                        if (this.A07 == 0) {
                            interfaceC2651ms.readFully(bArrA0l, i5, i4);
                            this.A05 += i4;
                            this.A0K.A0f(0);
                            iA0C = this.A0K.A0C();
                            if (iA0C >= 0) {
                                throw C3K.A01(A09(48, 18, 118), null);
                            }
                            this.A07 = iA0C;
                            this.A0L.A0f(0);
                            interfaceC1407Hd.AIr(this.A0L, 4);
                            this.A06 += 4;
                            i7 += i5;
                        } else {
                            int iAIp3 = interfaceC1407Hd.AIp(interfaceC2651ms, this.A07, false);
                            this.A05 += iAIp3;
                            this.A06 += iAIp3;
                            this.A07 -= iAIp3;
                        }
                    }
                } else {
                    if (A09(66, 9, 68).equals(je.A03.A07.A0W)) {
                        if (this.A06 == 0) {
                            AbstractC1398Gu.A07(i7, this.A0M);
                            interfaceC1407Hd.AIr(this.A0M, 7);
                            this.A06 += 7;
                        }
                        i7 += 7;
                    } else if (c1408He != null) {
                        c1408He.A03(interfaceC2651ms);
                    }
                    while (this.A06 < i7) {
                        int iAIp4 = interfaceC1407Hd.AIp(interfaceC2651ms, i7 - this.A06, false);
                        this.A05 += iAIp4;
                        this.A06 += iAIp4;
                        this.A07 -= iAIp4;
                    }
                }
                j = je.A04.A07[i6];
                i2 = je.A04.A04[i6];
                if (A0R[4].length() == 11) {
                    String[] strArr3 = A0R;
                    strArr3[5] = "dniiMzQMBKOANx9";
                    strArr3[0] = "Fj7cY";
                    if (c1408He != null) {
                        i3 = 0;
                        c1408He.A04(interfaceC1407Hd, j, i2, i7, 0, null);
                        if (i6 + 1 == je.A04.A01) {
                            c1408He.A05(interfaceC1407Hd, null);
                        }
                    } else {
                        i3 = 0;
                        interfaceC1407Hd.AIu(j, i2, i7, 0, null);
                    }
                    je.A00++;
                    this.A08 = -1;
                    this.A05 = i3;
                    this.A06 = i3;
                    this.A07 = i3;
                    return i3;
                }
            }
        }
        throw new RuntimeException();
    }

    public static String A09(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0Q = new byte[]{-47, 4, -1, -3, -80, 3, -7, 10, -11, -80, -4, -11, 3, 3, -80, 4, -8, -15, -2, -80, -8, -11, -15, -12, -11, 2, -80, -4, -11, -2, -9, 4, -8, -80, -72, 5, -2, 3, 5, 0, 0, -1, 2, 4, -11, -12, -71, -66, 18, 55, 63, 42, 53, 50, 45, -23, 23, 10, 21, -23, 53, 46, 55, 48, 61, 49, -8, 12, -5, 0, 6, -58, -8, -6, -53, 49, 69, 52, 57, 63, -1, 68, 66, 69, 53, -3, 56, 52};
    }

    static {
        A0C();
        A0S = new HD() { // from class: com.facebook.ads.redexgen.X.m4
            @Override // com.facebook.ads.redexgen.core.HD
            public final H9[] A5N() {
                return C2612m3.A0M();
            }

            @Override // com.facebook.ads.redexgen.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
    }

    public C2612m3() {
        this(0);
    }

    public C2612m3(int i2) {
        this.A0I = i2;
        this.A04 = (i2 & 4) != 0 ? 3 : 0;
        this.A0N = new JL();
        this.A0P = new ArrayList();
        this.A0J = new C11074v(16);
        this.A0O = new ArrayDeque<>();
        this.A0L = new C11074v(HS.A03);
        this.A0K = new C11074v(4);
        this.A0M = new C11074v();
        this.A08 = -1;
        this.A0E = HA.A00;
        this.A0G = new JE[0];
    }

    public static int A00(int i2) {
        switch (i2) {
            case 1751476579:
                return 2;
            case 1903435808:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[1] = "rbgKKZbH0NS3XFJda55b1nN6iCZjcLPR";
                return 1;
            default:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[4] = "05jGjYjRxbz";
                return 0;
        }
    }

    private int A01(long j) {
        long j2 = Long.MAX_VALUE;
        int preferredTrackIndex = 1;
        int i2 = -1;
        long sampleOffset = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int i3 = 1;
        int trackIndex = -1;
        int i4 = 0;
        while (true) {
            JE[] jeArr = this.A0G;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0R[6] = "Fcko3uaud46cO6nUcug7HhLZFNYBY";
            if (i4 >= jeArr.length) {
                if (j3 == Long.MAX_VALUE || i3 == 0) {
                    return i2;
                }
                long j4 = 10485760 + j3;
                if (A0R[1].charAt(1) == 'b') {
                    A0R[1] = "AbIM1W3wiFJMRqsWOI3P0CqvLybO2M00";
                    if (sampleOffset < j4) {
                        return i2;
                    }
                } else if (sampleOffset < j4) {
                    return i2;
                }
                return trackIndex;
            }
            JE je = this.A0G[i4];
            int i5 = je.A00;
            if (i5 != je.A04.A01) {
                long j5 = je.A04.A06[i5];
                long minAccumulatedBytes = ((long[][]) C5C.A0f(this.A0H))[i4][i5];
                long j6 = j5 - j;
                int i6 = (j6 < 0 || j6 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) ? 1 : 0;
                if ((i6 == 0 && preferredTrackIndex != 0) || (i6 == preferredTrackIndex && j6 < j2)) {
                    preferredTrackIndex = i6;
                    j2 = j6;
                    i2 = i4;
                    if (A0R[6].length() != 29) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "nNk7RawiIyahd9Y";
                        strArr2[0] = "017pL";
                        sampleOffset = minAccumulatedBytes;
                    } else {
                        A0R[1] = "1bC0in6G1ApWSL3PegJBmoVzHl6EE3tw";
                        sampleOffset = minAccumulatedBytes;
                    }
                }
                if (minAccumulatedBytes < j3) {
                    j3 = minAccumulatedBytes;
                    i3 = i6;
                    trackIndex = i4;
                }
            }
            i4++;
        }
    }

    public static int A02(C11074v c11074v) {
        c11074v.A0f(8);
        int majorBrand = A00(c11074v.A0C());
        if (majorBrand != 0) {
            return majorBrand;
        }
        c11074v.A0g(4);
        while (c11074v.A07() > 0) {
            int majorBrand2 = A00(c11074v.A0C());
            if (majorBrand2 != 0) {
                return majorBrand2;
            }
        }
        return 0;
    }

    private int A04(InterfaceC2651ms interfaceC2651ms, HV hv) throws IOException {
        int iA07 = this.A0N.A07(interfaceC2651ms, hv, this.A0P);
        if (iA07 == 1 && hv.A00 == 0) {
            A0A();
        }
        return iA07;
    }

    public static int A05(JR jr, long j) {
        int iA00 = jr.A00(j);
        if (iA00 == -1) {
            return jr.A01(j);
        }
        return iA00;
    }

    public static long A06(JR jr, long j, long j2) {
        int iA05 = A05(jr, j);
        if (iA05 == -1) {
            return j2;
        }
        return Math.min(jr.A06[iA05], j2);
    }

    private final HX A07(long j, int i2) {
        long jA06;
        long j2;
        int mainTrackIndex;
        if (this.A0G.length == 0) {
            return new HX(HZ.A04);
        }
        long j3 = -9223372036854775807L;
        long jA07 = -1;
        int i3 = i2 != -1 ? i2 : this.A03;
        if (i3 != -1) {
            JR jr = this.A0G[i3].A04;
            int iA05 = A05(jr, j);
            if (iA05 == -1) {
                return new HX(HZ.A04);
            }
            j2 = jr.A07[iA05];
            jA06 = jr.A06[iA05];
            if (A0R[6].length() != 29) {
                throw new RuntimeException();
            }
            A0R[1] = "zbT5rN6sguJCvWwII8HLCHwSkH7sQNQT";
            if (j2 < j && iA05 < jr.A01 - 1 && (mainTrackIndex = jr.A01(j)) != -1 && mainTrackIndex != iA05) {
                j3 = jr.A07[mainTrackIndex];
                jA07 = jr.A06[mainTrackIndex];
            }
        } else {
            jA06 = Long.MAX_VALUE;
            if (A0R[4].length() != 11) {
                j2 = j;
            } else {
                A0R[2] = "SenK5aC";
                j2 = j;
            }
        }
        if (i2 == -1) {
            for (int i4 = 0; i4 < this.A0G.length; i4++) {
                if (i4 != this.A03) {
                    JR sampleTable = this.A0G[i4].A04;
                    jA06 = A06(sampleTable, j2, jA06);
                    if (j3 != -9223372036854775807L) {
                        jA07 = A06(sampleTable, j3, jA07);
                    }
                }
            }
        }
        HZ hz = new HZ(j2, jA06);
        if (j3 == -9223372036854775807L) {
            return new HX(hz);
        }
        return new HX(hz, new HZ(j3, jA07));
    }

    public static /* synthetic */ JO A08(JO jo) {
        return jo;
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 == 2 && (this.A0I & 2) != 0) {
            this.A0E.AKS(0, 4).A6e(new C10512p().A0v(this.A0F == null ? null : new Metadata(this.A0F)).A14());
            this.A0E.A6O();
            this.A0E.AJ7(new C2646mn(-9223372036854775807L));
        }
    }

    private void A0D(long j) throws C3K {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j) {
            C2623mE c2623mEPop = this.A0O.pop();
            if (((AbstractC1449Iu) c2623mEPop).A00 == 1836019574) {
                A0G(c2623mEPop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                C2623mE containerAtom = this.A0O.peek();
                containerAtom.A08(c2623mEPop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j) {
        if (this.A01 == 1836086884) {
            this.A0F = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + ((long) this.A00), this.A09 - ((long) this.A00));
        }
    }

    private void A0F(InterfaceC2651ms interfaceC2651ms) throws IOException {
        this.A0M.A0d(8);
        interfaceC2651ms.AGt(this.A0M.A0l(), 0, 8);
        J0.A0Q(this.A0M);
        interfaceC2651ms.AK3(this.A0M.A09());
        interfaceC2651ms.AIl();
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    private void A0G(C2623mE c2623mE) throws C3K {
        int i2;
        int size = -1;
        long jMax = -9223372036854775807L;
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        List<Mp4Extractor.Mp4Track> tracks = new ArrayList<>();
        Metadata udtaMetaMetadata = null;
        Metadata metadata = null;
        boolean z2 = this.A02 == 1;
        HK hk = new HK();
        C2622mD c2622mDA07 = c2623mE.A07(1969517665);
        if (c2622mDA07 != null) {
            Pair<Metadata, Metadata> pairA0A = J0.A0A(c2622mDA07);
            udtaMetaMetadata = (Metadata) pairA0A.first;
            metadata = (Metadata) pairA0A.second;
            if (udtaMetaMetadata != null) {
                hk.A05(udtaMetaMetadata);
            }
        }
        Metadata metadataA0F = null;
        C2623mE c2623mEA06 = c2623mE.A06(1835365473);
        if (c2623mEA06 != null) {
            metadataA0F = J0.A0F(c2623mEA06);
        }
        List<JR> listA0O = J0.A0O(c2623mE, hk, -9223372036854775807L, null, (this.A0I & 1) != 0, z2, new InterfaceC2511kO() { // from class: com.facebook.ads.redexgen.X.m5
            @Override // com.facebook.ads.redexgen.core.InterfaceC2511kO
            public final Object A4B(Object obj) {
                return C2612m3.A08((JO) obj);
            }
        });
        int trackCount = listA0O.size();
        for (int i3 = 0; i3 < trackCount; i3++) {
            JR jr = listA0O.get(i3);
            int trackCount2 = jr.A01;
            if (trackCount2 == 0) {
                int i4 = A0R[1].charAt(1);
                if (i4 != 98) {
                    throw new RuntimeException();
                }
                A0R[1] = "ibvFTefsgA7pkzOq8AzNcMz9gVb8PR75";
            } else {
                JO track = jr.A03;
                HA ha = this.A0E;
                int trackCount3 = track.A03;
                JE je = new JE(track, jr, ha.AKS(i3, trackCount3));
                long j3 = track.A04 != -9223372036854775807L ? track.A04 : jr.A02;
                jMax = Math.max(jMax, j3);
                if (1 == track.A03) {
                    j2 = j3;
                } else if (2 == track.A03) {
                    j = j3;
                }
                if (A09(75, 13, 125).equals(track.A07.A0W)) {
                    int i5 = jr.A00;
                    if (A0R[6].length() != 29) {
                        throw new RuntimeException();
                    }
                    A0R[6] = "30Puiqoz9JCJMsN9BhlLDaWtr32u3";
                    i2 = i5 * 16;
                } else {
                    i2 = jr.A00 + 30;
                }
                C10512p formatBuilder = track.A07.A07();
                formatBuilder.A0h(i2);
                if (track.A03 == 2 && j3 > 0 && jr.A01 > 1) {
                    formatBuilder.A0X(jr.A01 / (j3 / 1000000.0f));
                }
                if (jMax > 0 && jr.A01 > 0) {
                    int i6 = jr.A05.length;
                    if (i6 == jr.A01) {
                        long j4 = 0;
                        for (int i7 = 0; i7 < sampleIndex; i7++) {
                            int sampleIndex = jr.A05[i7];
                            j4 += (long) sampleIndex;
                        }
                        formatBuilder.A0a((int) ((8000000 * j4) / jMax));
                    }
                }
                int i8 = track.A03;
                JB.A0D(i8, hk, formatBuilder);
                int i9 = track.A03;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.A0P.isEmpty() ? null : new Metadata(this.A0P);
                JB.A0C(i9, udtaMetaMetadata, metadataA0F, formatBuilder, metadataArr);
                je.A01.A6e(formatBuilder.A14());
                int i10 = track.A03;
                if (i10 == 2 && size == -1) {
                    size = tracks.size();
                }
                tracks.add(je);
            }
        }
        this.A03 = size;
        this.A0B = jMax;
        this.A0C = j;
        this.A0A = j2;
        this.A0G = (JE[]) tracks.toArray(new JE[0]);
        this.A0H = A0N(this.A0G);
        this.A0E.A6O();
        this.A0E.AJ7(this);
    }

    private void A0H(JE je, long j) {
        JR jr = je.A04;
        int sampleIndex = jr.A00(j);
        if (sampleIndex == -1) {
            sampleIndex = jr.A01(j);
        }
        je.A00 = sampleIndex;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[2] = "DxqZc2lJMNLNZhW19Xb8kO";
    }

    public static boolean A0I(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    public static boolean A0J(int i2) {
        if (i2 != 1835296868 && i2 != 1836476516) {
            if (A0R[4].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[3] = "UHuXZ9PGVGxrhu";
            strArr[7] = "Sv1JTBT1egKeuo";
            if (i2 != 1751411826 && i2 != 1937011556 && i2 != 1937011827 && i2 != 1937011571 && i2 != 1668576371 && i2 != 1701606260 && i2 != 1937011555 && i2 != 1937011578 && i2 != 1937013298) {
                if (A0R[2].length() != 19) {
                    A0R[6] = "0EWWhWMRQ7MgS85x4CKboIorprSqD";
                    if (i2 != 1937007471) {
                        if (i2 == 1668232756 && i2 != 1953196132 && i2 != 1718909296 && i2 != 1969517665 && i2 != 1801812339 && i2 != 1768715124) {
                            return false;
                        }
                    }
                } else if (i2 != 1937007471) {
                    if (i2 == 1668232756) {
                    }
                }
            }
        }
        return true;
    }

    private boolean A0K(InterfaceC2651ms interfaceC2651ms) throws IOException {
        C2623mE containerAtom;
        if (this.A00 == 0) {
            if (!interfaceC2651ms.AHR(this.A0J.A0l(), 0, 8, true)) {
                A0B();
                return false;
            }
            this.A00 = 8;
            this.A0J.A0f(0);
            this.A09 = this.A0J.A0Q();
            this.A01 = this.A0J.A0C();
        }
        if (this.A09 == 1) {
            if (A0R[2].length() == 19) {
                throw new RuntimeException();
            }
            A0R[2] = "uEfPCG8cZZkUCN4sq";
            interfaceC2651ms.readFully(this.A0J.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A09 = this.A0J.A0R();
        } else if (this.A09 == 0) {
            long jA8O = interfaceC2651ms.A8O();
            if (jA8O == -1 && (containerAtom = this.A0O.peek()) != null) {
                jA8O = containerAtom.A00;
            }
            if (jA8O != -1) {
                this.A09 = (jA8O - interfaceC2651ms.A8n()) + ((long) this.A00);
            }
        }
        if (this.A09 >= this.A00) {
            if (A0I(this.A01)) {
                long jA8n = (interfaceC2651ms.A8n() + this.A09) - ((long) this.A00);
                if (this.A09 != this.A00 && this.A01 == 1835365473) {
                    A0F(interfaceC2651ms);
                }
                this.A0O.push(new C2623mE(this.A01, jA8n));
                if (this.A09 == this.A00) {
                    A0D(jA8n);
                } else {
                    A0A();
                }
            } else if (A0J(this.A01)) {
                AbstractC10843y.A08(this.A00 == 8);
                AbstractC10843y.A08(this.A09 <= 2147483647L);
                C11074v c11074v = new C11074v((int) this.A09);
                C11074v atomData = this.A0J;
                System.arraycopy(atomData.A0l(), 0, c11074v.A0l(), 0, 8);
                this.A0D = c11074v;
                this.A04 = 1;
            } else {
                A0E(interfaceC2651ms.A8n() - ((long) this.A00));
                this.A0D = null;
                this.A04 = 1;
            }
            return true;
        }
        throw C3K.A00(A09(0, 48, 61));
    }

    private boolean A0L(InterfaceC2651ms interfaceC2651ms, HV hv) throws IOException {
        long j = this.A09 - ((long) this.A00);
        long atomEndPosition = interfaceC2651ms.A8n() + j;
        boolean z2 = false;
        C11074v c11074v = this.A0D;
        if (c11074v != null) {
            interfaceC2651ms.readFully(c11074v.A0l(), this.A00, (int) j);
            if (this.A01 == 1718909296) {
                this.A02 = A02(c11074v);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A09(new C2622mD(this.A01, c11074v));
            }
        } else if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            interfaceC2651ms.AK3((int) j);
        } else {
            long atomPayloadSize = interfaceC2651ms.A8n();
            hv.A00 = atomPayloadSize + j;
            z2 = true;
        }
        A0D(atomEndPosition);
        return z2 && this.A04 != 2;
    }

    public static /* synthetic */ H9[] A0M() {
        return new H9[]{new C2612m3()};
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:48:0x006f A[SYNTHETIC] */
    public static long[][] A0N(JE[] jeArr) {
        long[][] jArr = new long[jeArr.length][];
        int[] iArr = new int[jeArr.length];
        long[] jArr2 = new long[jeArr.length];
        boolean[] tracksFinished = new boolean[jeArr.length];
        for (int i2 = 0; i2 < jeArr.length; i2++) {
            jArr[i2] = new long[jeArr[i2].A04.A01];
            jArr2[i2] = jeArr[i2].A04.A07[0];
        }
        long j = 0;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[1] = "qbCXFrWy43oBbJoUYfYqc11BUuHVPZxe";
        int i3 = 0;
        while (i3 < jeArr.length) {
            long j2 = Long.MAX_VALUE;
            int i4 = -1;
            for (int minTimeTrackIndex = 0; minTimeTrackIndex < jeArr.length; minTimeTrackIndex++) {
                boolean z2 = tracksFinished[minTimeTrackIndex];
                if (A0R[6].length() != 29) {
                    A0R[2] = "AIMWoJADevTWezna7TxcWd";
                    if (!z2) {
                        if (jArr2[minTimeTrackIndex] <= j2) {
                            i4 = minTimeTrackIndex;
                            j2 = jArr2[minTimeTrackIndex];
                        }
                    }
                } else {
                    String[] strArr = A0R;
                    strArr[3] = "DkVrMcHnnNdNTj";
                    strArr[7] = "McjqbXJyC3Esle";
                    if (!z2) {
                        if (jArr2[minTimeTrackIndex] <= j2) {
                            i4 = minTimeTrackIndex;
                            j2 = jArr2[minTimeTrackIndex];
                        }
                    }
                }
            }
            int i5 = iArr[i4];
            jArr[i4][i5] = j;
            j += (long) jeArr[i4].A04.A05[i5];
            int i6 = i5 + 1;
            iArr[i4] = i6;
            if (i6 < jArr[i4].length) {
                JE je = jeArr[i4];
                if (A0R[1].charAt(1) != 'b') {
                    jArr2[i4] = je.A04.A07[i6];
                } else {
                    String[] strArr2 = A0R;
                    strArr2[5] = "FttiEMkEmxvjjK7";
                    strArr2[0] = "cOA5C";
                    jArr2[i4] = je.A04.A07[i6];
                }
            } else {
                tracksFinished[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final HX A91(long j) {
        return A07(j, -1);
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(HA ha) {
        this.A0E = ha;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(InterfaceC2651ms interfaceC2651ms, HV hv) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (!A0K(interfaceC2651ms)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    if (A0L(interfaceC2651ms, hv)) {
                        return 1;
                    }
                    break;
                case 2:
                    return A03(interfaceC2651ms, hv);
                case 3:
                    return A04(interfaceC2651ms, hv);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j == 0) {
            int i2 = this.A04;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0R;
            strArr2[3] = "BBO5nGzNDCjhdG";
            strArr2[7] = "Qq9RZt6cBQ724Z";
            if (i2 != 3) {
                A0A();
                return;
            } else {
                this.A0N.A08();
                this.A0P.clear();
                return;
            }
        }
        for (JE je : this.A0G) {
            A0H(je, j2);
            if (je.A02 != null) {
                je.A02.A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(InterfaceC2651ms interfaceC2651ms) throws IOException {
        return JM.A02(interfaceC2651ms, (this.A0I & 2) != 0);
    }
}
