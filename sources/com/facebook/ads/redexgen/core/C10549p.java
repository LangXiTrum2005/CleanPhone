package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10549p implements InterfaceC2540np, HA, FI<C2538nn>, FM, DP {
    public static byte[] A0e;
    public static String[] A0f = {"o2fAJH6DTExx5HfWJCXs", "", "TsjJo55j6Kq128TfeQrvBtnORCvXohBg", "QpymssT", "p1Azi7mByqrjPk9ZTQVOCdIp8WANOiZ", "P8K3es9juVbjT7QsA9zjw4fZ7CWDxkC3", "f2TCNbDOQ", "8xae32DDfRwM"};
    public static final C2691qI A0g;
    public static final Map<String, String> A0h;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC2541nq A06;
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
    public C2525na[] A0L;
    public final long A0M;
    public final Uri A0N;
    public final Handler A0O;
    public final AnonymousClass48 A0P;
    public final InterfaceC2627pF A0Q;
    public final A1 A0R;
    public final A6 A0S;
    public final D8 A0T;
    public final DD A0U;
    public final DI A0V;
    public final F0 A0W;
    public final FF A0X;
    public final C2496n7 A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;
    public final String A0b;
    public final boolean A0c;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"})
    public final boolean A0d;

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
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
    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final long AJ9(InterfaceC2503nE[] interfaceC2503nEArr, boolean[] zArr, DT[] dtArr, boolean[] zArr2, long j) {
        long jAJ8 = j;
        A0E();
        C2521nW c2521nW = this.A07.A00;
        boolean[] zArr3 = this.A07.A01;
        int i = this.A01;
        int i2 = 0;
        while (true) {
            int i3 = 0;
            if (i2 >= interfaceC2503nEArr.length) {
                boolean z = !this.A0J ? jAJ8 == 0 : i != 0;
                for (int i4 = 0; i4 < interfaceC2503nEArr.length; i4++) {
                    DT dt = dtArr[i4];
                    if (A0f[0].length() != 20) {
                        break;
                    }
                    String[] strArr = A0f;
                    strArr[6] = "NEStfGRt7";
                    strArr[7] = "7J9sRP18njyY";
                    if (dt == null && interfaceC2503nEArr[i4] != null) {
                        InterfaceC2503nE interfaceC2503nE = interfaceC2503nEArr[i4];
                        AbstractC09153y.A08(interfaceC2503nE.length() == 1);
                        AbstractC09153y.A08(interfaceC2503nE.A8H(0) == 0);
                        int iA04 = c2521nW.A04(interfaceC2503nE.A9L());
                        AbstractC09153y.A08(!zArr3[iA04]);
                        this.A01++;
                        zArr3[iA04] = true;
                        dtArr[i4] = new C2537nm(this, iA04);
                        zArr2[i4] = true;
                        if (!z) {
                            C2525na c2525na = this.A0L[iA04];
                            z = (c2525na.A0f(jAJ8, true) || c2525na.A0O() == 0) ? false : true;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0F = false;
                    this.A0E = false;
                    if (this.A0Y.A0E()) {
                        C2525na[] c2525naArr = this.A0L;
                        int length = c2525naArr.length;
                        while (i3 < length) {
                            c2525naArr[i3].A0V();
                            i3++;
                        }
                        this.A0Y.A09();
                    } else {
                        C2525na[] c2525naArr2 = this.A0L;
                        int length2 = c2525naArr2.length;
                        while (i3 < length2) {
                            c2525naArr2[i3].A0Z();
                            i3++;
                        }
                    }
                } else if (z) {
                    jAJ8 = AJ8(jAJ8, false);
                    for (int i5 = 0; i5 < dtArr.length; i5++) {
                        if (dtArr[i5] != null) {
                            zArr2[i5] = true;
                        }
                    }
                }
                this.A0J = true;
                return jAJ8;
            }
            if (dtArr[i2] != null) {
                if (interfaceC2503nEArr[i2] != null) {
                    boolean z2 = zArr[i2];
                    String[] strArr2 = A0f;
                    if (strArr2[2].charAt(7) != strArr2[5].charAt(7)) {
                        break;
                    }
                    A0f[0] = "eW7kSByjGiBvUls6sdXN";
                    if (!z2) {
                        int i6 = ((C2537nm) dtArr[i2]).A00;
                        AbstractC09153y.A08(zArr3[i6]);
                        this.A01--;
                        zArr3[i6] = false;
                        dtArr[i2] = null;
                    }
                } else {
                    int i7 = ((C2537nm) dtArr[i2]).A00;
                    AbstractC09153y.A08(zArr3[i7]);
                    this.A01--;
                    zArr3[i7] = false;
                    dtArr[i2] = null;
                }
            }
            i2++;
        }
        throw new RuntimeException();
    }

    static {
        A0I();
        A0h = A0D();
        A0g = new C08822p().A0y(A0B(Opcodes.IF_ICMPLT, 3, 77)).A11(A0B(Opcodes.D2F, 17, 79)).A14();
    }

    public C10549p(Uri uri, InterfaceC2627pF interfaceC2627pF, DD dd, A6 a6, A1 a1, FF ff, D8 d8, DI di, F0 f0, String str, int i, InterfaceExecutorC1185Fb interfaceExecutorC1185Fb) {
        C2496n7 c2496n7;
        this.A0N = uri;
        this.A0Q = interfaceC2627pF;
        this.A0S = a6;
        this.A0R = a1;
        this.A0X = ff;
        this.A0T = d8;
        this.A0V = di;
        this.A0W = f0;
        this.A0b = str;
        this.A0M = i;
        if (interfaceExecutorC1185Fb != null) {
            c2496n7 = new C2496n7(interfaceExecutorC1185Fb);
        } else {
            c2496n7 = new C2496n7(A0B(13, 29, 83));
        }
        this.A0Y = c2496n7;
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
        this.A0L = new C2525na[0];
        this.A05 = C.TIME_UNSET;
        this.A03 = C.TIME_UNSET;
        this.A00 = 1;
        this.A0d = MetaExoPlayerUpgradeConfig.A03(EnumC2291jX.A0e) || MetaExoPlayerUpgradeConfig.A03(EnumC2291jX.A1j);
        this.A0c = MetaExoPlayerUpgradeConfig.A03(EnumC2291jX.A0g);
    }

    private int A00() {
        int i = 0;
        for (C2525na c2525na : this.A0L) {
            int extractedSamplesCount = c2525na.A0P();
            i += extractedSamplesCount;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    public long A03(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.A0L.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.A0L[i].A0T());
            } else {
                Object objA01 = AbstractC09153y.A01(this.A07);
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[6] = "FDopTuaFs";
                strArr2[7] = "ze95XzERDUjm";
                if (((DK) objA01).A01[i]) {
                    jMax = Math.max(jMax, this.A0L[i].A0T());
                }
            }
        }
        return jMax;
    }

    private C2525na A06(DJ dj) {
        int length = this.A0L.length;
        for (int i = 0; i < length; i++) {
            if (dj.equals(this.A0K[i])) {
                return this.A0L[i];
            }
        }
        C2525na c2525naA0B = C2525na.A0B(this.A0W, this.A0S, this.A0R);
        c2525naA0B.A0d(this);
        int trackCount = length + 1;
        DJ[] djArr = (DJ[]) Arrays.copyOf(this.A0K, trackCount);
        djArr[length] = dj;
        this.A0K = (DJ[]) C5C.A1H(djArr);
        int trackCount2 = length + 1;
        C2525na[] c2525naArr = (C2525na[]) Arrays.copyOf(this.A0L, trackCount2);
        c2525naArr[length] = c2525naA0B;
        this.A0L = (C2525na[]) C5C.A1H(c2525naArr);
        return c2525naA0B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.FI
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final FJ AEf(C2538nn c2538nn, long j, long j2, IOException iOException, int i) {
        FJ fjA01;
        AG ag = c2538nn.A08;
        Cq cq = new Cq(c2538nn.A05, c2538nn.A01, ag.A01(), ag.A02(), j, j2, ag.A00());
        long jA8u = this.A0X.A8u(new FE(cq, new C1124Cs(1, -1, null, 0, null, C5C.A0P(c2538nn.A00), C5C.A0P(this.A03)), iOException, i));
        if (jA8u == C.TIME_UNSET) {
            fjA01 = C2496n7.A06;
        } else {
            int iA00 = A00();
            boolean z = iA00 > this.A02;
            if (A0U(c2538nn, iA00)) {
                fjA01 = C2496n7.A01(z, jA8u);
            } else {
                fjA01 = C2496n7.A05;
            }
        }
        this.A0T.A07(cq, 1, -1, null, 0, null, c2538nn.A00, this.A03, iOException, !fjA01.A02());
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
        AbstractC09153y.A08(this.A0G);
        AbstractC09153y.A01(this.A07);
        AbstractC09153y.A01(this.A08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        Metadata metadataA05;
        if (this.A0H || this.A0G) {
            return;
        }
        boolean z = this.A0I;
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "grMxxjGjFdBhxw9MDZtvFg4OZy35nlzN";
        strArr2[5] = "E38rNlujzeckGRbn7d7aukKxtTtuF9Uw";
        if (!z || this.A08 == null) {
            return;
        }
        for (C2525na c2525na : this.A0L) {
            if (c2525na.A0U() == null) {
                return;
            }
        }
        this.A0P.A02();
        int length = this.A0L.length;
        C2654pg[] c2654pgArr = new C2654pg[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C2691qI c2691qIA14 = (C2691qI) AbstractC09153y.A01(this.A0L[i].A0U());
            String str = c2691qIA14.A0W;
            boolean zA0C = C3J.A0C(str);
            boolean z2 = zA0C || C3J.A0F(str);
            zArr[i] = z2;
            this.A0A |= z2;
            IcyHeaders icyHeaders = this.A09;
            if (icyHeaders != null) {
                if (zA0C || this.A0K[i].A01) {
                    Metadata metadata = c2691qIA14.A0P;
                    if (metadata == null) {
                        metadataA05 = new Metadata(icyHeaders);
                    } else {
                        metadataA05 = metadata.A05(icyHeaders);
                    }
                    C08822p c08822pA0v = c2691qIA14.A07().A0v(metadataA05);
                    if (A0f[0].length() != 20) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0f;
                    strArr3[2] = "WsODqr3j7Qd6qKAaI5Z8JETVOkriGcMH";
                    strArr3[5] = "rCf1buyjz0YjJBdswvkAeWhqIr4TjJn3";
                    c2691qIA14 = c08822pA0v.A14();
                }
                if (zA0C) {
                    int trackCount = c2691qIA14.A04;
                    if (trackCount == -1) {
                        int trackCount2 = c2691qIA14.A0D;
                        if (trackCount2 == -1) {
                            int trackCount3 = icyHeaders.A00;
                            if (trackCount3 != -1) {
                                C08822p c08822pA07 = c2691qIA14.A07();
                                int trackCount4 = icyHeaders.A00;
                                c2691qIA14 = c08822pA07.A0a(trackCount4).A14();
                            }
                        }
                    }
                }
            }
            c2654pgArr[i] = new C2654pg(c2691qIA14);
        }
        this.A07 = new DK(new C2521nW(c2654pgArr), zArr);
        this.A0G = true;
        ((InterfaceC2541nq) AbstractC09153y.A01(this.A06)).AFS(this);
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
        C2538nn c2538nn = new C2538nn(this, this.A0N, this.A0Q, this.A0U, this, this.A0P);
        if (this.A0G) {
            AbstractC09153y.A08(A0S());
            if (this.A03 != C.TIME_UNSET && this.A05 >= this.A03) {
                this.A0D = true;
                this.A05 = C.TIME_UNSET;
                return;
            }
            c2538nn.A04(((HY) AbstractC09153y.A01(this.A08)).A91(this.A05).A00.A00, this.A05);
            for (C2525na c2525na : this.A0L) {
                c2525na.A0b(this.A05);
            }
            this.A05 = C.TIME_UNSET;
        }
        this.A02 = A00();
        this.A0T.A06(new Cq(c2538nn.A05, c2538nn.A01, this.A0Y.A08(c2538nn, this, this.A0X.A8Z(this.A00))), 1, -1, null, 0, null, c2538nn.A00, this.A03, 0);
    }

    private final void A0J() throws IOException {
        this.A0Y.A0B(this.A0X.A8Z(this.A00));
    }

    private void A0K(int i) {
        A0E();
        boolean[] zArr = this.A07.A03;
        if (!zArr[i]) {
            C2691qI c2691qIA08 = this.A07.A00.A05(i).A08(0);
            this.A0T.A03(C3J.A01(c2691qIA08.A0W), c2691qIA08, 0, null, this.A04);
            zArr[i] = true;
        }
    }

    private void A0L(int i) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (this.A0F && zArr[i]) {
            if (this.A0L[i].A0g(false)) {
                return;
            }
            this.A05 = 0L;
            this.A0F = false;
            this.A0E = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (C2525na c2525na : this.A0L) {
                c2525na.A0Z();
            }
            ((InterfaceC2541nq) AbstractC09153y.A01(this.A06)).ADV(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.FI
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final void AEe(C2538nn c2538nn, long j, long j2) {
        long largestQueuedTimestampUs;
        if (this.A03 == C.TIME_UNSET && this.A08 != null) {
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
                largestQueuedTimestampUs = Ua.s + jA03;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0V.AG0(this.A03, zAAj, this.A0C);
        }
        AG ag = c2538nn.A08;
        this.A0T.A08(new Cq(c2538nn.A05, c2538nn.A01, ag.A01(), ag.A02(), j, j2, ag.A00()), 1, -1, null, 0, null, c2538nn.A00, this.A03, c2538nn, null);
        this.A0D = true;
        ((InterfaceC2541nq) AbstractC09153y.A01(this.A06)).ADV(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.FI
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void AEi(C2538nn c2538nn, long j, long j2, int i) {
        Cq cq;
        AG dataSource = c2538nn.A08;
        if (i == 0) {
            cq = new Cq(c2538nn.A05, c2538nn.A01, j);
        } else {
            cq = new Cq(c2538nn.A05, c2538nn.A01, dataSource.A01(), dataSource.A02(), j, j2, dataSource.A00());
        }
        this.A0T.A06(cq, 1, -1, null, 0, null, c2538nn.A00, this.A03, i);
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
    public final void AEc(C2538nn c2538nn, long j, long j2, boolean z) {
        AG dataSource = c2538nn.A08;
        this.A0T.A05(new Cq(c2538nn.A05, c2538nn.A01, dataSource.A01(), dataSource.A02(), j, j2, dataSource.A00()), 1, -1, null, 0, null, c2538nn.A00, this.A03);
        if (!z) {
            for (C2525na c2525na : this.A0L) {
                c2525na.A0Z();
            }
            if (this.A01 > 0) {
                ((InterfaceC2541nq) AbstractC09153y.A01(this.A06)).ADV(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0R, reason: merged with bridge method [inline-methods] */
    public void A0e(HY hy) {
        this.A08 = hy;
        this.A03 = hy.A7t();
        this.A0C = !this.A0B && hy.A7t() == C.TIME_UNSET;
        this.A00 = this.A0C ? 7 : 1;
        this.A0V.AG0(this.A03, hy.AAj(), this.A0C);
        if (!this.A0G) {
            A0F();
        }
    }

    private boolean A0S() {
        return this.A05 != C.TIME_UNSET;
    }

    private boolean A0T() {
        return this.A0E || A0S();
    }

    private boolean A0U(C2538nn c2538nn, int i) {
        if (this.A0B || (this.A08 != null && this.A08.A7t() != C.TIME_UNSET)) {
            this.A02 = i;
            return true;
        }
        if (this.A0G && !A0T()) {
            this.A0F = true;
            return false;
        }
        this.A0E = this.A0G;
        this.A04 = 0L;
        this.A02 = 0;
        for (C2525na c2525na : this.A0L) {
            c2525na.A0Z();
        }
        c2538nn.A04(0L, 0L);
        return true;
    }

    private boolean A0V(boolean[] zArr, long j) {
        int length = this.A0L.length;
        for (int i = 0; i < length; i++) {
            if (!this.A0L[i].A0f(j, false) && (zArr[i] || !this.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final int A0X(int i, long j) {
        if (A0T()) {
            return 0;
        }
        A0K(i);
        C2525na c2525na = this.A0L[i];
        int iA0Q = c2525na.A0Q(j, this.A0D);
        c2525na.A0a(iA0Q);
        if (iA0Q == 0) {
            A0L(i);
        }
        return iA0Q;
    }

    public final int A0Y(int i, C09946z c09946z, C2612p0 c2612p0, int i2) {
        if (A0T()) {
            return -3;
        }
        A0K(i);
        int result = this.A0L[i].A0R(c09946z, c2612p0, i2, this.A0D);
        if (result == -3) {
            A0L(i);
        }
        return result;
    }

    public final InterfaceC1238Hd A0Z() {
        return A06(new DJ(0, true));
    }

    public final void A0a() {
        if (this.A0G) {
            for (C2525na c2525na : this.A0L) {
                c2525na.A0X();
            }
        }
        this.A0Y.A0C(this);
        this.A0O.removeCallbacksAndMessages(null);
        this.A06 = null;
        this.A0H = true;
    }

    public final /* synthetic */ void A0b() {
        if (!this.A0H) {
            ((InterfaceC2541nq) AbstractC09153y.A01(this.A06)).ADV(this);
        }
    }

    public final /* synthetic */ void A0c() {
        this.A0B = true;
    }

    public final void A0d(int i) throws IOException {
        this.A0L[i].A0W();
        A0J();
    }

    public final boolean A0f(int i) {
        return !A0T() && this.A0L[i].A0g(this.A0D);
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
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

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final void A60(long j, boolean z) {
        A0E();
        if (A0S()) {
            return;
        }
        boolean[] zArr = this.A07.A01;
        int length = this.A0L.length;
        for (int i = 0; i < length; i++) {
            C2525na[] c2525naArr = this.A0L;
            String[] strArr = A0f;
            String str = strArr[6];
            String str2 = strArr[7];
            int trackCount = str.length();
            if (trackCount == str2.length()) {
                throw new RuntimeException();
            }
            A0f[0] = "xFMIvf7swbs88yH1ASsn";
            c2525naArr[i].A0c(j, z, zArr[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.core.HA
    public final void A6O() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final long A6r(long j, C10157u c10157u) {
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
        return c10157u.A00(j, j2, hxA91.A01.A01);
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
    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final long A78() {
        C2525na[] c2525naArr;
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
            for (int i = 0; i < length2; i++) {
                if (this.A07.A02[i]) {
                    DK dk = this.A07;
                    if (A0f[3].length() == 29) {
                        throw new RuntimeException();
                    }
                    A0f[0] = "CWn0xvSWDOv6yRiyH00v";
                    if (dk.A01[i]) {
                        C2525na[] c2525naArr2 = this.A0L;
                        String[] strArr2 = A0f;
                        String str = strArr2[2];
                        String str2 = strArr2[5];
                        int iCharAt = str.charAt(7);
                        int trackCount2 = str2.charAt(7);
                        if (iCharAt != trackCount2) {
                            if (!c2525naArr2[i].A0e()) {
                                c2525naArr = this.A0L;
                                String[] strArr3 = A0f;
                                String str3 = strArr3[6];
                                String str4 = strArr3[7];
                                length = str3.length();
                                trackCount = str4.length();
                                if (length != trackCount) {
                                    String[] strArr4 = A0f;
                                    strArr4[2] = "XlyJfiuja8URoHVDmmAk9tswNdXWeReZ";
                                    strArr4[5] = "M3k0l25jfFhaASrq1DtlqcrTUVRM508s";
                                    jA03 = Math.min(jA03, c2525naArr[i].A0T());
                                } else {
                                    jA03 = Math.min(jA03, c2525naArr[i].A0T());
                                }
                            }
                        } else {
                            String[] strArr5 = A0f;
                            strArr5[6] = "r97slta5r";
                            strArr5[7] = "NJT5wUbHJHvk";
                            if (!c2525naArr2[i].A0e()) {
                                c2525naArr = this.A0L;
                                String[] strArr6 = A0f;
                                String str5 = strArr6[6];
                                String str6 = strArr6[7];
                                length = str5.length();
                                trackCount = str6.length();
                                if (length != trackCount) {
                                    String[] strArr7 = A0f;
                                    strArr7[2] = "XlyJfiuja8URoHVDmmAk9tswNdXWeReZ";
                                    strArr7[5] = "M3k0l25jfFhaASrq1DtlqcrTUVRM508s";
                                    jA03 = Math.min(jA03, c2525naArr[i].A0T());
                                } else {
                                    jA03 = Math.min(jA03, c2525naArr[i].A0T());
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

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final long A8b() {
        return A78();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final C2521nW A9M() {
        A0E();
        return this.A07.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final void ACS() throws IOException {
        A0J();
        if (this.A0D && !this.A0G) {
            if (this.A0c) {
                throw C3K.A01(A0B(90, 54, 63) + (this.A0N != null ? this.A0N.toString() : A0B(Opcodes.IF_ICMPLE, 4, 125)), null);
            }
            throw C3K.A01(A0B(42, 48, 50), null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.FM
    public final void AEj() {
        for (C2525na c2525na : this.A0L) {
            c2525na.A0Y();
        }
        this.A0U.AHb();
    }

    @Override // com.facebook.ads.redexgen.core.DP
    public final void AGL(C2691qI c2691qI) {
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final void AH5(InterfaceC2541nq interfaceC2541nq, long j) {
        this.A06 = interfaceC2541nq;
        this.A0P.A04();
        A0H();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final long AHQ() {
        if (!this.A0E) {
            return C.TIME_UNSET;
        }
        boolean z = this.A0D;
        if (A0f[0].length() == 20) {
            String[] strArr = A0f;
            strArr[1] = "";
            strArr[4] = "OLDtf0M6xpFiQAaUF2mFzXoKXa03XjZ";
            if (z || A00() > this.A02) {
                this.A0E = false;
                long j = this.A04;
                if (A0f[0].length() == 20) {
                    String[] strArr2 = A0f;
                    strArr2[6] = "30bUCuPdV";
                    strArr2[7] = "qvk1tPvPLdJz";
                    return j;
                }
            } else {
                return C.TIME_UNSET;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
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

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540np
    public final long AJ8(@MetaExoPlayerCustomization long j, boolean z) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (!this.A08.AAj()) {
            j = 0;
        }
        int i = 0;
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
            C2525na[] c2525naArr = this.A0L;
            int length = c2525naArr.length;
            while (i < length) {
                c2525naArr[i].A0V();
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[2] = "OrOS7Vhjp4VBbz175mMxq2SuFvjpl5bQ";
                strArr2[5] = "EAKZg7yj0ctHJiN4FHg90oFZJxg2ecfG";
                i++;
            }
            this.A0Y.A09();
            return j;
        }
        this.A0Y.A0A();
        C2525na[] c2525naArr2 = this.A0L;
        int length2 = c2525naArr2.length;
        while (i < length2) {
            c2525naArr2[i].A0Z();
            String[] strArr3 = A0f;
            if (strArr3[2].charAt(7) != strArr3[5].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0f;
            strArr4[6] = "p5drqiHAR";
            strArr4[7] = "h8TdfbRbJweW";
            i++;
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.HA
    public final InterfaceC1238Hd AKS(int i, int i2) {
        return A06(new DJ(i, false));
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b) {
    }
}
