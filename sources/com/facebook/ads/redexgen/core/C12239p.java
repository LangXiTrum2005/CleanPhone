package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C12239p implements InterfaceC2709np, HA, FI<C2707nn>, FM, DP {
    public static byte[] A0e;
    public static String[] A0f = {"o2fAJH6DTExx5HfWJCXs", "", "TsjJo55j6Kq128TfeQrvBtnORCvXohBg", "QpymssT", "p1Azi7mByqrjPk9ZTQVOCdIp8WANOiZ", "P8K3es9juVbjT7QsA9zjw4fZ7CWDxkC3", "f2TCNbDOQ", "8xae32DDfRwM"};
    public static final C2860qI A0g;
    public static final Map<String, String> A0h;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC2710nq A06;
    public DK A07;
    public HY A08;
    public IcyHeaders A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public DJ[] A0K;
    public C2694na[] A0L;
    public final long A0M;
    public final Uri A0N;
    public final Handler A0O;
    public final AnonymousClass48 A0P;
    public final InterfaceC2796pF A0Q;
    public final A1 A0R;
    public final A6 A0S;
    public final D8 A0T;
    public final DD A0U;
    public final DI A0V;
    public final F0 A0W;
    public final FF A0X;
    public final C2665n7 A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;
    public final String A0b;
    public final boolean A0c;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"})
    public final boolean A0d;

    public static String A0B(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0I() {
        A0e = new byte[]{-76, -81, -55, -33, -109, -77, -53, -38, -57, -86, -57, -38, -57, -29, 6, -8, -5, -4, 9, -47, -25, 9, 6, -2, 9, -4, 10, 10, 0, 13, -4, -28, -4, -5, 0, -8, -25, -4, 9, 0, 6, -5, -62, -27, -41, -38, -33, -28, -35, -106, -36, -33, -28, -33, -23, -34, -37, -38, -106, -40, -37, -36, -27, -24, -37, -106, -26, -24, -37, -26, -41, -24, -41, -22, -33, -27, -28, -106, -33, -23, -106, -39, -27, -29, -26, -30, -37, -22, -37, -92, -49, -14, -28, -25, -20, -15, -22, -93, -23, -20, -15, -20, -10, -21, -24, -25, -93, -27, -24, -23, -14, -11, -24, -93, -13, -11, -24, -13, -28, -11, -28, -9, -20, -14, -15, -93, -20, -10, -93, -26, -14, -16, -13, -17, -24, -9, -24, -79, -93, -40, -43, -52, -67, -93, -12, 3, 3, -1, -4, -10, -12, 7, -4, 2, 1, -62, 11, -64, -4, -10, 12, -6, -12, 10, 47, 54, 45, 45};
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long AJ9(InterfaceC2672nE[] interfaceC2672nEArr, boolean[] zArr, DT[] dtArr, boolean[] zArr2, long j) {
        long jAJ8 = j;
        A0E();
        C2690nW c2690nW = this.A07.A00;
        boolean[] zArr3 = this.A07.A01;
        int i2 = this.A01;
        int i3 = 0;
        while (true) {
            int i4 = 0;
            if (i3 >= interfaceC2672nEArr.length) {
                boolean z2 = !this.A0J ? jAJ8 == 0 : i2 != 0;
                for (int i5 = 0; i5 < interfaceC2672nEArr.length; i5++) {
                    DT dt = dtArr[i5];
                    if (A0f[0].length() != 20) {
                        break;
                    }
                    String[] strArr = A0f;
                    strArr[6] = "NEStfGRt7";
                    strArr[7] = "7J9sRP18njyY";
                    if (dt == null && interfaceC2672nEArr[i5] != null) {
                        InterfaceC2672nE interfaceC2672nE = interfaceC2672nEArr[i5];
                        AbstractC10843y.A08(interfaceC2672nE.length() == 1);
                        AbstractC10843y.A08(interfaceC2672nE.A8H(0) == 0);
                        int iA04 = c2690nW.A04(interfaceC2672nE.A9L());
                        AbstractC10843y.A08(!zArr3[iA04]);
                        this.A01++;
                        zArr3[iA04] = true;
                        dtArr[i5] = new C2706nm(this, iA04);
                        zArr2[i5] = true;
                        if (!z2) {
                            C2694na c2694na = this.A0L[iA04];
                            z2 = (c2694na.A0f(jAJ8, true) || c2694na.A0O() == 0) ? false : true;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0F = false;
                    this.A0E = false;
                    if (this.A0Y.A0E()) {
                        C2694na[] c2694naArr = this.A0L;
                        int length = c2694naArr.length;
                        while (i4 < length) {
                            c2694naArr[i4].A0V();
                            i4++;
                        }
                        this.A0Y.A09();
                    } else {
                        C2694na[] c2694naArr2 = this.A0L;
                        int length2 = c2694naArr2.length;
                        while (i4 < length2) {
                            c2694naArr2[i4].A0Z();
                            i4++;
                        }
                    }
                } else if (z2) {
                    jAJ8 = AJ8(jAJ8, false);
                    for (int i6 = 0; i6 < dtArr.length; i6++) {
                        if (dtArr[i6] != null) {
                            zArr2[i6] = true;
                        }
                    }
                }
                this.A0J = true;
                return jAJ8;
            }
            if (dtArr[i3] != null) {
                if (interfaceC2672nEArr[i3] != null) {
                    boolean z3 = zArr[i3];
                    String[] strArr2 = A0f;
                    if (strArr2[2].charAt(7) != strArr2[5].charAt(7)) {
                        break;
                    }
                    A0f[0] = "eW7kSByjGiBvUls6sdXN";
                    if (!z3) {
                        int i7 = ((C2706nm) dtArr[i3]).A00;
                        AbstractC10843y.A08(zArr3[i7]);
                        this.A01--;
                        zArr3[i7] = false;
                        dtArr[i3] = null;
                    }
                } else {
                    int i8 = ((C2706nm) dtArr[i3]).A00;
                    AbstractC10843y.A08(zArr3[i8]);
                    this.A01--;
                    zArr3[i8] = false;
                    dtArr[i3] = null;
                }
            }
            i3++;
        }
        throw new RuntimeException();
    }

    static {
        A0I();
        A0h = A0D();
        A0g = new C10512p().A0y(A0B(161, 3, 77)).A11(A0B(144, 17, 79)).A14();
    }

    public C12239p(Uri uri, InterfaceC2796pF interfaceC2796pF, DD dd, A6 a6, A1 a1, FF ff, D8 d8, DI di, F0 f0, String str, int i2, InterfaceExecutorC1354Fb interfaceExecutorC1354Fb) {
        C2665n7 c2665n7;
        this.A0N = uri;
        this.A0Q = interfaceC2796pF;
        this.A0S = a6;
        this.A0R = a1;
        this.A0X = ff;
        this.A0T = d8;
        this.A0V = di;
        this.A0W = f0;
        this.A0b = str;
        this.A0M = i2;
        if (interfaceExecutorC1354Fb != null) {
            c2665n7 = new C2665n7(interfaceExecutorC1354Fb);
        } else {
            c2665n7 = new C2665n7(A0B(13, 29, 83));
        }
        this.A0Y = c2665n7;
        this.A0U = dd;
        this.A0P = new AnonymousClass48();
        this.A0Z = new Runnable() { // from class: com.facebook.ads.redexgen.X.DG
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0F();
            }
        };
        this.A0a = new Runnable() { // from class: com.facebook.ads.redexgen.X.DH
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0b();
            }
        };
        this.A0O = C5C.A0Y();
        this.A0K = new DJ[0];
        this.A0L = new C2694na[0];
        this.A05 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0d = MetaExoPlayerUpgradeConfig.A03(EnumC2460jX.A0e) || MetaExoPlayerUpgradeConfig.A03(EnumC2460jX.A1j);
        this.A0c = MetaExoPlayerUpgradeConfig.A03(EnumC2460jX.A0g);
    }

    private int A00() {
        int i2 = 0;
        for (C2694na c2694na : this.A0L) {
            int extractedSamplesCount = c2694na.A0P();
            i2 += extractedSamplesCount;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    public long A03(boolean z2) {
        long jMax = Long.MIN_VALUE;
        for (int i2 = 0; i2 < this.A0L.length; i2++) {
            if (z2) {
                jMax = Math.max(jMax, this.A0L[i2].A0T());
            } else {
                Object objA01 = AbstractC10843y.A01(this.A07);
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[6] = "FDopTuaFs";
                strArr2[7] = "ze95XzERDUjm";
                if (((DK) objA01).A01[i2]) {
                    jMax = Math.max(jMax, this.A0L[i2].A0T());
                }
            }
        }
        return jMax;
    }

    private C2694na A06(DJ dj) {
        int length = this.A0L.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (dj.equals(this.A0K[i2])) {
                return this.A0L[i2];
            }
        }
        C2694na c2694naA0B = C2694na.A0B(this.A0W, this.A0S, this.A0R);
        c2694naA0B.A0d(this);
        int trackCount = length + 1;
        DJ[] djArr = (DJ[]) Arrays.copyOf(this.A0K, trackCount);
        djArr[length] = dj;
        this.A0K = (DJ[]) C5C.A1H(djArr);
        int trackCount2 = length + 1;
        C2694na[] c2694naArr = (C2694na[]) Arrays.copyOf(this.A0L, trackCount2);
        c2694naArr[length] = c2694naA0B;
        this.A0L = (C2694na[]) C5C.A1H(c2694naArr);
        return c2694naA0B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.FI
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final FJ AEf(C2707nn c2707nn, long j, long j2, IOException iOException, int i2) {
        FJ fjA01;
        AG ag = c2707nn.A08;
        Cq cq = new Cq(c2707nn.A05, c2707nn.A01, ag.A01(), ag.A02(), j, j2, ag.A00());
        long jA8u = this.A0X.A8u(new FE(cq, new C1293Cs(1, -1, null, 0, null, C5C.A0P(c2707nn.A00), C5C.A0P(this.A03)), iOException, i2));
        if (jA8u == -9223372036854775807L) {
            fjA01 = C2665n7.A06;
        } else {
            int iA00 = A00();
            boolean z2 = iA00 > this.A02;
            if (A0U(c2707nn, iA00)) {
                fjA01 = C2665n7.A01(z2, jA8u);
            } else {
                fjA01 = C2665n7.A05;
            }
        }
        this.A0T.A07(cq, 1, -1, null, 0, null, c2707nn.A00, this.A03, iOException, !fjA01.A02());
        return fjA01;
    }

    public static Map<String, String> A0D() {
        HashMap map = new HashMap();
        map.put(A0B(1, 12, 34), A0B(0, 1, 63));
        Map<String, String> headers = Collections.unmodifiableMap(map);
        return headers;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void A0E() {
        AbstractC10843y.A08(this.A0G);
        AbstractC10843y.A01(this.A07);
        AbstractC10843y.A01(this.A08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        Metadata metadataA05;
        if (this.A0H || this.A0G) {
            return;
        }
        boolean z2 = this.A0I;
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "grMxxjGjFdBhxw9MDZtvFg4OZy35nlzN";
        strArr2[5] = "E38rNlujzeckGRbn7d7aukKxtTtuF9Uw";
        if (!z2 || this.A08 == null) {
            return;
        }
        for (C2694na c2694na : this.A0L) {
            if (c2694na.A0U() == null) {
                return;
            }
        }
        this.A0P.A02();
        int length = this.A0L.length;
        C2823pg[] c2823pgArr = new C2823pg[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            C2860qI c2860qIA14 = (C2860qI) AbstractC10843y.A01(this.A0L[i2].A0U());
            String str = c2860qIA14.A0W;
            boolean zA0C = C3J.A0C(str);
            boolean z3 = zA0C || C3J.A0F(str);
            zArr[i2] = z3;
            this.A0A |= z3;
            IcyHeaders icyHeaders = this.A09;
            if (icyHeaders != null) {
                if (zA0C || this.A0K[i2].A01) {
                    Metadata metadata = c2860qIA14.A0P;
                    if (metadata == null) {
                        metadataA05 = new Metadata(icyHeaders);
                    } else {
                        metadataA05 = metadata.A05(icyHeaders);
                    }
                    C10512p c10512pA0v = c2860qIA14.A07().A0v(metadataA05);
                    if (A0f[0].length() != 20) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0f;
                    strArr3[2] = "WsODqr3j7Qd6qKAaI5Z8JETVOkriGcMH";
                    strArr3[5] = "rCf1buyjz0YjJBdswvkAeWhqIr4TjJn3";
                    c2860qIA14 = c10512pA0v.A14();
                }
                if (zA0C) {
                    int trackCount = c2860qIA14.A04;
                    if (trackCount == -1) {
                        int trackCount2 = c2860qIA14.A0D;
                        if (trackCount2 == -1) {
                            int trackCount3 = icyHeaders.A00;
                            if (trackCount3 != -1) {
                                C10512p c10512pA07 = c2860qIA14.A07();
                                int trackCount4 = icyHeaders.A00;
                                c2860qIA14 = c10512pA07.A0a(trackCount4).A14();
                            }
                        }
                    }
                }
            }
            c2823pgArr[i2] = new C2823pg(c2860qIA14);
        }
        this.A07 = new DK(new C2690nW(c2823pgArr), zArr);
        this.A0G = true;
        ((InterfaceC2710nq) AbstractC10843y.A01(this.A06)).AFS(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.DF
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0c();
            }
        });
    }

    private void A0H() {
        C2707nn c2707nn = new C2707nn(this, this.A0N, this.A0Q, this.A0U, this, this.A0P);
        if (this.A0G) {
            AbstractC10843y.A08(A0S());
            if (this.A03 != -9223372036854775807L && this.A05 >= this.A03) {
                this.A0D = true;
                this.A05 = -9223372036854775807L;
                return;
            }
            c2707nn.A04(((HY) AbstractC10843y.A01(this.A08)).A91(this.A05).A00.A00, this.A05);
            for (C2694na c2694na : this.A0L) {
                c2694na.A0b(this.A05);
            }
            this.A05 = -9223372036854775807L;
        }
        this.A02 = A00();
        this.A0T.A06(new Cq(c2707nn.A05, c2707nn.A01, this.A0Y.A08(c2707nn, this, this.A0X.A8Z(this.A00))), 1, -1, null, 0, null, c2707nn.A00, this.A03, 0);
    }

    private final void A0J() throws IOException {
        this.A0Y.A0B(this.A0X.A8Z(this.A00));
    }

    private void A0K(int i2) {
        A0E();
        boolean[] zArr = this.A07.A03;
        if (!zArr[i2]) {
            C2860qI c2860qIA08 = this.A07.A00.A05(i2).A08(0);
            this.A0T.A03(C3J.A01(c2860qIA08.A0W), c2860qIA08, 0, null, this.A04);
            zArr[i2] = true;
        }
    }

    private void A0L(int i2) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (this.A0F && zArr[i2]) {
            if (this.A0L[i2].A0g(false)) {
                return;
            }
            this.A05 = 0L;
            this.A0F = false;
            this.A0E = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (C2694na c2694na : this.A0L) {
                c2694na.A0Z();
            }
            ((InterfaceC2710nq) AbstractC10843y.A01(this.A06)).ADV(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.FI
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final void AEe(C2707nn c2707nn, long j, long j2) {
        long largestQueuedTimestampUs;
        if (this.A03 == -9223372036854775807L && this.A08 != null) {
            boolean zAAj = this.A08.AAj();
            long jA03 = A03(true);
            String[] strArr = A0f;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[6] = "VBgm4XD5c";
            strArr2[7] = "eM9hzsMViOdm";
            if (jA03 == Long.MIN_VALUE) {
                largestQueuedTimestampUs = 0;
            } else {
                largestQueuedTimestampUs = 10000 + jA03;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0V.AG0(this.A03, zAAj, this.A0C);
        }
        AG ag = c2707nn.A08;
        this.A0T.A08(new Cq(c2707nn.A05, c2707nn.A01, ag.A01(), ag.A02(), j, j2, ag.A00()), 1, -1, null, 0, null, c2707nn.A00, this.A03, c2707nn, null);
        this.A0D = true;
        ((InterfaceC2710nq) AbstractC10843y.A01(this.A06)).ADV(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.FI
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void AEi(C2707nn c2707nn, long j, long j2, int i2) {
        Cq cq;
        AG dataSource = c2707nn.A08;
        if (i2 == 0) {
            cq = new Cq(c2707nn.A05, c2707nn.A01, j);
        } else {
            cq = new Cq(c2707nn.A05, c2707nn.A01, dataSource.A01(), dataSource.A02(), j, j2, dataSource.A00());
        }
        this.A0T.A06(cq, 1, -1, null, 0, null, c2707nn.A00, this.A03, i2);
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[6] = "RSQzFltms";
        strArr2[7] = "MablvJN0SXK9";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.FI
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final void AEc(C2707nn c2707nn, long j, long j2, boolean z2) {
        AG dataSource = c2707nn.A08;
        this.A0T.A05(new Cq(c2707nn.A05, c2707nn.A01, dataSource.A01(), dataSource.A02(), j, j2, dataSource.A00()), 1, -1, null, 0, null, c2707nn.A00, this.A03);
        if (!z2) {
            for (C2694na c2694na : this.A0L) {
                c2694na.A0Z();
            }
            if (this.A01 > 0) {
                ((InterfaceC2710nq) AbstractC10843y.A01(this.A06)).ADV(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0R, reason: merged with bridge method [inline-methods] */
    public void A0e(HY hy) {
        this.A08 = hy;
        this.A03 = hy.A7t();
        this.A0C = !this.A0B && hy.A7t() == -9223372036854775807L;
        this.A00 = this.A0C ? 7 : 1;
        this.A0V.AG0(this.A03, hy.AAj(), this.A0C);
        if (!this.A0G) {
            A0F();
        }
    }

    private boolean A0S() {
        return this.A05 != -9223372036854775807L;
    }

    private boolean A0T() {
        return this.A0E || A0S();
    }

    private boolean A0U(C2707nn c2707nn, int i2) {
        if (this.A0B || (this.A08 != null && this.A08.A7t() != -9223372036854775807L)) {
            this.A02 = i2;
            return true;
        }
        if (this.A0G && !A0T()) {
            this.A0F = true;
            return false;
        }
        this.A0E = this.A0G;
        this.A04 = 0L;
        this.A02 = 0;
        for (C2694na c2694na : this.A0L) {
            c2694na.A0Z();
        }
        c2707nn.A04(0L, 0L);
        return true;
    }

    private boolean A0V(boolean[] zArr, long j) {
        int length = this.A0L.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.A0L[i2].A0f(j, false) && (zArr[i2] || !this.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final int A0X(int i2, long j) {
        if (A0T()) {
            return 0;
        }
        A0K(i2);
        C2694na c2694na = this.A0L[i2];
        int iA0Q = c2694na.A0Q(j, this.A0D);
        c2694na.A0a(iA0Q);
        if (iA0Q == 0) {
            A0L(i2);
        }
        return iA0Q;
    }

    public final int A0Y(int i2, C11636z c11636z, C2781p0 c2781p0, int i3) {
        if (A0T()) {
            return -3;
        }
        A0K(i2);
        int result = this.A0L[i2].A0R(c11636z, c2781p0, i3, this.A0D);
        if (result == -3) {
            A0L(i2);
        }
        return result;
    }

    public final InterfaceC1407Hd A0Z() {
        return A06(new DJ(0, true));
    }

    public final void A0a() {
        if (this.A0G) {
            for (C2694na c2694na : this.A0L) {
                c2694na.A0X();
            }
        }
        this.A0Y.A0C(this);
        this.A0O.removeCallbacksAndMessages(null);
        this.A06 = null;
        this.A0H = true;
    }

    public final /* synthetic */ void A0b() {
        if (!this.A0H) {
            ((InterfaceC2710nq) AbstractC10843y.A01(this.A06)).ADV(this);
        }
    }

    public final /* synthetic */ void A0c() {
        this.A0B = true;
    }

    public final void A0d(int i2) throws IOException {
        this.A0L[i2].A0W();
        A0J();
    }

    public final boolean A0f(int i2) {
        return !A0T() && this.A0L[i2].A0g(this.A0D);
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final boolean A5C(long j) {
        if (this.A0D || this.A0Y.A0D() || this.A0F) {
            return false;
        }
        if (this.A0G && this.A01 == 0) {
            return false;
        }
        boolean zA04 = this.A0P.A04();
        boolean continuedLoading = this.A0Y.A0E();
        if (!continuedLoading) {
            A0H();
            return true;
        }
        return zA04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final void A60(long j, boolean z2) {
        A0E();
        if (A0S()) {
            return;
        }
        boolean[] zArr = this.A07.A01;
        int length = this.A0L.length;
        for (int i2 = 0; i2 < length; i2++) {
            C2694na[] c2694naArr = this.A0L;
            String[] strArr = A0f;
            String str = strArr[6];
            String str2 = strArr[7];
            int trackCount = str.length();
            if (trackCount == str2.length()) {
                throw new RuntimeException();
            }
            A0f[0] = "xFMIvf7swbs88yH1ASsn";
            c2694naArr[i2].A0c(j, z2, zArr[i2]);
        }
    }

    @Override // com.facebook.ads.redexgen.core.HA
    public final void A6O() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long A6r(long j, C11847u c11847u) {
        A0E();
        if (!this.A08.AAj()) {
            return 0L;
        }
        HX hxA91 = this.A08.A91(j);
        long j2 = hxA91.A00.A01;
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "A6SKS5Ejxr3dBguC5asmpR7Eo1U8ekaX";
        strArr2[5] = "H67kjT3j1V6FB1MougrbLEHHMAKkStlF";
        return c11847u.A00(j, j2, hxA91.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Added in D9949576 for unstall buffer")
    public final long A76(long j) {
        if (this.A0d && !this.A0G) {
            return 0L;
        }
        if (this.A0D) {
            return this.A03 - j;
        }
        return A78() - j;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long A78() {
        C2694na[] c2694naArr;
        int length;
        int trackCount;
        A0E();
        if (this.A0D || this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        boolean zA0S = A0S();
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0f[0] = "YocKG9EsUqAPXBELOuFE";
        if (zA0S) {
            return this.A05;
        }
        long jA03 = Long.MAX_VALUE;
        if (this.A0A) {
            int length2 = this.A0L.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (this.A07.A02[i2]) {
                    DK dk = this.A07;
                    if (A0f[3].length() == 29) {
                        throw new RuntimeException();
                    }
                    A0f[0] = "CWn0xvSWDOv6yRiyH00v";
                    if (dk.A01[i2]) {
                        C2694na[] c2694naArr2 = this.A0L;
                        String[] strArr2 = A0f;
                        String str = strArr2[2];
                        String str2 = strArr2[5];
                        int iCharAt = str.charAt(7);
                        int trackCount2 = str2.charAt(7);
                        if (iCharAt != trackCount2) {
                            if (!c2694naArr2[i2].A0e()) {
                                c2694naArr = this.A0L;
                                String[] strArr3 = A0f;
                                String str3 = strArr3[6];
                                String str4 = strArr3[7];
                                length = str3.length();
                                trackCount = str4.length();
                                if (length != trackCount) {
                                    String[] strArr4 = A0f;
                                    strArr4[2] = "XlyJfiuja8URoHVDmmAk9tswNdXWeReZ";
                                    strArr4[5] = "M3k0l25jfFhaASrq1DtlqcrTUVRM508s";
                                    jA03 = Math.min(jA03, c2694naArr[i2].A0T());
                                } else {
                                    jA03 = Math.min(jA03, c2694naArr[i2].A0T());
                                }
                            }
                        } else {
                            String[] strArr5 = A0f;
                            strArr5[6] = "r97slta5r";
                            strArr5[7] = "NJT5wUbHJHvk";
                            if (!c2694naArr2[i2].A0e()) {
                                c2694naArr = this.A0L;
                                String[] strArr6 = A0f;
                                String str5 = strArr6[6];
                                String str6 = strArr6[7];
                                length = str5.length();
                                trackCount = str6.length();
                                if (length != trackCount) {
                                    String[] strArr7 = A0f;
                                    strArr7[2] = "XlyJfiuja8URoHVDmmAk9tswNdXWeReZ";
                                    strArr7[5] = "M3k0l25jfFhaASrq1DtlqcrTUVRM508s";
                                    jA03 = Math.min(jA03, c2694naArr[i2].A0T());
                                } else {
                                    jA03 = Math.min(jA03, c2694naArr[i2].A0T());
                                }
                            }
                        }
                    }
                }
            }
        }
        if (jA03 == Long.MAX_VALUE) {
            jA03 = A03(false);
        }
        if (jA03 == Long.MIN_VALUE) {
            return this.A04;
        }
        return jA03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long A8b() {
        return A78();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final C2690nW A9M() {
        A0E();
        return this.A07.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final void ACS() throws IOException {
        A0J();
        if (this.A0D && !this.A0G) {
            if (this.A0c) {
                throw C3K.A01(A0B(90, 54, 63) + (this.A0N != null ? this.A0N.toString() : A0B(164, 4, 125)), null);
            }
            throw C3K.A01(A0B(42, 48, 50), null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.FM
    public final void AEj() {
        for (C2694na c2694na : this.A0L) {
            c2694na.A0Y();
        }
        this.A0U.AHb();
    }

    @Override // com.facebook.ads.redexgen.core.DP
    public final void AGL(C2860qI c2860qI) {
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final void AH5(InterfaceC2710nq interfaceC2710nq, long j) {
        this.A06 = interfaceC2710nq;
        this.A0P.A04();
        A0H();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long AHQ() {
        if (!this.A0E) {
            return -9223372036854775807L;
        }
        boolean z2 = this.A0D;
        if (A0f[0].length() == 20) {
            String[] strArr = A0f;
            strArr[1] = "";
            strArr[4] = "OLDtf0M6xpFiQAaUF2mFzXoKXa03XjZ";
            if (z2 || A00() > this.A02) {
                this.A0E = false;
                long j = this.A04;
                if (A0f[0].length() == 20) {
                    String[] strArr2 = A0f;
                    strArr2[6] = "30bUCuPdV";
                    strArr2[7] = "qvk1tPvPLdJz";
                    return j;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final void AHW(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.HA
    public final void AJ7(final HY hy) {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.DE
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0e(hy);
            }
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long AJ8(@MetaExoPlayerCustomization long j, boolean z2) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (!this.A08.AAj()) {
            j = 0;
        }
        int i2 = 0;
        this.A0E = false;
        this.A04 = j;
        if (A0S()) {
            this.A05 = j;
            return j;
        }
        if (this.A00 != 7 && A0V(zArr, j)) {
            return j;
        }
        this.A0F = false;
        this.A05 = j;
        this.A0D = false;
        if (this.A0Y.A0E()) {
            C2694na[] c2694naArr = this.A0L;
            int length = c2694naArr.length;
            while (i2 < length) {
                c2694naArr[i2].A0V();
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[2] = "OrOS7Vhjp4VBbz175mMxq2SuFvjpl5bQ";
                strArr2[5] = "EAKZg7yj0ctHJiN4FHg90oFZJxg2ecfG";
                i2++;
            }
            this.A0Y.A09();
            return j;
        }
        this.A0Y.A0A();
        C2694na[] c2694naArr2 = this.A0L;
        int length2 = c2694naArr2.length;
        while (i2 < length2) {
            c2694naArr2[i2].A0Z();
            String[] strArr3 = A0f;
            if (strArr3[2].charAt(7) != strArr3[5].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0f;
            strArr4[6] = "p5drqiHAR";
            strArr4[7] = "h8TdfbRbJweW";
            i2++;
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.HA
    public final InterfaceC1407Hd AKS(int i2, int i3) {
        return A06(new DJ(i2, false));
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b2) {
    }
}
