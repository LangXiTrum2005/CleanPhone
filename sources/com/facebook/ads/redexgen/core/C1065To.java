package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.badlogic.gdx.Input;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.extractor.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.TextInformationFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.To, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("DoNotStrip")
public final class C1065To implements UK {
    public static byte[] A0K;
    public static String[] A0L = {"cdjyapYaXDfZVR5QabZXuXJSqdBchziJ", "nimNTfdSt", "bUaBbjJGhBgHiWCakEYJpwEfqyXuj", "Kage5wxCbPx3yBOZ80TOBBLlenHgQiVK", "JCgji0i3zQq", "VZddAqqfrBshQQMgRlSdCciWU2WLazyh", "vDtbvLja5vfJi2aQiQrs5lD38", "b45OS7rTchdUsq3HFUsLJGFPe2kFRlSn"};
    public static final UO A0M;
    public static final VP A0N;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Metadata A06;
    public UL A07;
    public InterfaceC1086Uo A08;
    public InterfaceC1086Uo A09;
    public InterfaceC1064Tn A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final UV A0F;
    public final UX A0G;
    public final UY A0H;
    public final InterfaceC1086Uo A0I;
    public final C1576fq A0J;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0K = new byte[]{87, 97, 101, 118, 103, 108, 97, 96, 36, 112, 107, 107, 36, 105, 101, 106, 125, 36, 102, 125, 112, 97, 119, 42, 7, 31, 22, 29};
    }

    static {
        A0B();
        A0M = new UO() { // from class: com.facebook.ads.redexgen.X.Tq
            @Override // com.facebook.ads.redexgen.core.UO
            public final UK[] A5D() {
                return C1065To.A0G();
            }

            @Override // com.facebook.ads.redexgen.core.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
        A0N = new VP() { // from class: com.facebook.ads.redexgen.X.Tp
            @Override // com.facebook.ads.redexgen.core.VP
            public final boolean A6G(int i, int i2, int i3, int i4, int i5) {
                return C1065To.A0C(i, i2, i3, i4, i5);
            }
        };
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C1065To() {
        this(0);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C1065To(int i) {
        this(i, C.TIME_UNSET);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C1065To(int i, long j) {
        this.A0D = (i & 2) != 0 ? i | 1 : i;
        this.A0E = j;
        this.A0J = new C1576fq(10);
        this.A0H = new UY();
        this.A0F = new UV();
        this.A02 = C.TIME_UNSET;
        this.A0G = new UX();
        this.A0I = new WN();
        this.A08 = this.A0I;
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int A00(WJ wj) throws IOException {
        if (this.A01 == 0) {
            try {
                A0F(wj, false);
            } catch (EOFException unused) {
                String[] strArr = A0L;
                if (strArr[6].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0L[0] = "GKdCVmn2q4fdvlc3DlBWKa88Yoe8xYYV";
                return -1;
            }
        }
        if (this.A0A == null) {
            this.A0A = A07(wj);
            this.A07.AID(this.A0A);
            this.A08.A6U(new P5().A11(this.A0H.A06).A0h(4096).A0b(this.A0H.A01).A0m(this.A0H.A03).A0d(this.A0F.A00).A0e(this.A0F.A01).A0v((this.A0D & 8) != 0 ? null : this.A06).A14());
            this.A03 = wj.A8d();
        } else if (this.A03 != 0) {
            long jA8d = wj.A8d();
            if (jA8d < this.A03) {
                wj.AJ9((int) (this.A03 - jA8d));
            }
        }
        return A01(wj);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int A01(WJ wj) throws IOException {
        if (this.A00 == 0) {
            wj.AHr();
            if (A0E(wj)) {
                return -1;
            }
            this.A0J.A0f(0);
            int iA0C = this.A0J.A0C();
            int sampleHeaderData = this.A01;
            if (A0D(iA0C, sampleHeaderData)) {
                int sampleHeaderData2 = UZ.A00(iA0C);
                if (sampleHeaderData2 != -1) {
                    this.A0H.A00(iA0C);
                    if (this.A02 == C.TIME_UNSET) {
                        this.A02 = this.A0A.A97(wj.A8d());
                        if (this.A0E != C.TIME_UNSET) {
                            this.A02 += this.A0E - this.A0A.A97(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0H.A02;
                    this.A00 = sampleHeaderData3;
                    if (this.A0A instanceof AB) {
                        AB ab = (AB) this.A0A;
                        long j = this.A04;
                        int sampleHeaderData4 = this.A0H.A04;
                        long jA03 = A03(j + ((long) sampleHeaderData4));
                        long jA8d = wj.A8d();
                        int sampleHeaderData5 = this.A0H.A02;
                        ab.A01(jA03, jA8d + ((long) sampleHeaderData5));
                        if (this.A0C && ab.A02(this.A05)) {
                            this.A0C = false;
                            if (A0L[0].charAt(10) != 'f') {
                                throw new RuntimeException();
                            }
                            A0L[5] = "4wAXMzKjENIzDA5gMxrjSBqvX23yWt8x";
                            this.A08 = this.A09;
                        }
                    }
                }
            }
            wj.AJ9(1);
            this.A01 = 0;
            return 0;
        }
        int iAHv = this.A08.AHv(wj, this.A00, true);
        if (iAHv == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - iAHv;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A08.AI0(A03(this.A04), 1, this.A0H.A02, 0, null);
        long j2 = this.A04;
        int bytesAppended3 = this.A0H.A04;
        this.A04 = j2 + ((long) bytesAppended3);
        this.A00 = 0;
        return 0;
    }

    public static int A02(C1576fq c1576fq, int i) {
        if (c1576fq.A0A() >= i + 4) {
            c1576fq.A0f(i);
            int iA0C = c1576fq.A0C();
            if (iA0C == 1483304551 || iA0C == 1231971951) {
                return iA0C;
            }
        }
        if (c1576fq.A0A() >= 40) {
            c1576fq.A0f(36);
            return c1576fq.A0C() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    private long A03(long j) {
        return this.A02 + ((1000000 * j) / ((long) this.A0H.A03));
    }

    public static long A04(Metadata metadata) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i = 0; i < iA02; i++) {
                Metadata.Entry entryA03 = metadata.A03(i);
                if ((entryA03 instanceof TextInformationFrame) && ((Id3Frame) ((TextInformationFrame) entryA03)).A00.equals(A09(24, 4, 85))) {
                    return AbstractC1600gE.A0O(Long.parseLong(((TextInformationFrame) entryA03).A02.get(0)));
                }
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    private AD A05(WJ wj, boolean z) throws IOException {
        wj.AG1(this.A0J.A0l(), 0, 4);
        this.A0J.A0f(0);
        this.A0H.A00(this.A0J.A0C());
        return new AD(wj.A8E(), wj.A8d(), this.A0H, z);
    }

    public static C05849s A06(Metadata metadata, long j) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i = 0; i < iA02; i++) {
                Metadata.Entry entry = metadata.A03(i);
                if (entry instanceof MlltFrame) {
                    return C05849s.A01(j, (MlltFrame) entry, A04(metadata));
                }
            }
            return null;
        }
        return null;
    }

    private InterfaceC1064Tn A07(WJ wj) throws IOException {
        long jA04;
        InterfaceC1064Tn interfaceC1064TnA08 = A08(wj);
        C05849s c05849sA06 = A06(this.A06, wj.A8d());
        if (this.A0B) {
            return new C05739h();
        }
        InterfaceC1064Tn ab = null;
        if (A0L[5].charAt(15) != 'g') {
            throw new RuntimeException();
        }
        A0L[5] = "RtO9gFPsqDfXg2wgX4DAS0iEQfwUxEPB";
        if ((this.A0D & 4) != 0) {
            long jA7Z = -1;
            if (c05849sA06 != null) {
                jA04 = c05849sA06.A7j();
                jA7Z = c05849sA06.A7Z();
            } else if (interfaceC1064TnA08 != null) {
                jA04 = interfaceC1064TnA08.A7j();
                jA7Z = interfaceC1064TnA08.A7Z();
            } else {
                Metadata metadata = this.A06;
                String[] strArr = A0L;
                if (strArr[6].length() != strArr[2].length()) {
                    String[] strArr2 = A0L;
                    strArr2[7] = "GUQVHBYBcJBjS5w5lVjg2Cu0ek6YSNjQ";
                    strArr2[3] = "r2XlV6gisyHteDSfpB43A6ycevT4svxV";
                    jA04 = A04(metadata);
                } else {
                    String[] strArr3 = A0L;
                    strArr3[4] = "0lOeW4X8SJD";
                    strArr3[1] = "krcnpKYJt";
                    jA04 = A04(metadata);
                }
            }
            ab = new AB(jA04, wj.A8d(), jA7Z);
        } else if (c05849sA06 != null) {
            ab = c05849sA06;
        } else if (interfaceC1064TnA08 != null) {
            ab = interfaceC1064TnA08;
        }
        boolean z = true;
        if (ab == null || (!ab.AAY() && (this.A0D & 1) != 0)) {
            if ((this.A0D & 2) == 0) {
                z = false;
            }
            return A05(wj, z);
        }
        return ab;
    }

    private InterfaceC1064Tn A08(WJ wj) throws IOException {
        C1576fq c1576fq = new C1576fq(this.A0H.A02);
        wj.AG1(c1576fq.A0l(), 0, this.A0H.A02);
        int i = 21;
        if ((this.A0H.A05 & 1) != 0) {
            if (this.A0H.A01 != 1) {
                i = 36;
            }
        } else if (this.A0H.A01 == 1) {
            i = 13;
        }
        String[] strArr = A0L;
        if (strArr[6].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[7] = "sOfPd1l9ShHh4gsnosGJVCxae46Vt962";
        strArr2[3] = "2yDa4XzkwQd9O40vdzFdTsameuu7GaSH";
        int iA02 = A02(c1576fq, i);
        if (iA02 == 1483304551 || iA02 == 1231971951) {
            C9V c9vA01 = C9V.A01(wj.A8E(), wj.A8d(), this.A0H, c1576fq);
            if (c9vA01 != null && !this.A0F.A03()) {
                wj.AHr();
                int xingBase = i + Input.Keys.F11;
                wj.A3x(xingBase);
                wj.AG1(this.A0J.A0l(), 0, 3);
                this.A0J.A0f(0);
                UV uv = this.A0F;
                int xingBase2 = this.A0J.A0K();
                uv.A04(xingBase2);
            }
            int xingBase3 = this.A0H.A02;
            wj.AJ9(xingBase3);
            if (c9vA01 != null && !c9vA01.AAY() && iA02 == 1231971951) {
                return A05(wj, false);
            }
            return c9vA01;
        }
        if (iA02 == 1447187017) {
            C05669a c05669aA00 = C05669a.A00(wj.A8E(), wj.A8d(), this.A0H, c1576fq);
            wj.AJ9(this.A0H.A02);
            return c05669aA00;
        }
        wj.AHr();
        return null;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void A0A() {
        AbstractC1517es.A02(this.A09);
    }

    public static /* synthetic */ boolean A0C(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    public static boolean A0D(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    private boolean A0E(WJ wj) throws IOException {
        if (this.A0A != null) {
            long jA7Z = this.A0A.A7Z();
            if (jA7Z != -1) {
                long dataEndPosition = wj.A8Y();
                if (dataEndPosition > jA7Z - 4) {
                    return true;
                }
            }
        }
        try {
            return !wj.AG2(this.A0J.A0l(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A0F(WJ wj, boolean z) throws IOException {
        int candidateSynchronizedHeaderData;
        int i = 0;
        int frameSize = 0;
        int iA8Y = 0;
        int searchedBytes = 0;
        int headerData = z ? 32768 : 131072;
        wj.AHr();
        if (wj.A8d() == 0) {
            int validFrameCount = this.A0D;
            int validFrameCount2 = (validFrameCount & 8) == 0 ? 1 : 0;
            Metadata metadataA00 = this.A0G.A00(wj, validFrameCount2 != 0 ? null : A0N);
            if (A0L[5].charAt(15) != 103) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[7] = "eORBeBWHV99UpwpaOFFR5UqaeJbwOlaD";
            strArr[3] = "erAb31F4soXlTVRY0ij4AX1PeWI3u3oR";
            this.A06 = metadataA00;
            if (this.A06 != null) {
                this.A0F.A05(this.A06);
            }
            iA8Y = (int) wj.A8Y();
            if (!z) {
                wj.AJ9(iA8Y);
            }
        }
        while (true) {
            if (A0E(wj)) {
                if (i > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.A0J.A0f(0);
            int iA0C = this.A0J.A0C();
            if ((frameSize != 0 && !A0D(iA0C, frameSize)) || (candidateSynchronizedHeaderData = UZ.A00(iA0C)) == -1) {
                int candidateSynchronizedHeaderData2 = searchedBytes + 1;
                if (searchedBytes == headerData) {
                    if (z) {
                        return false;
                    }
                    throw Q6.A01(A09(0, 24, 2), null);
                }
                i = 0;
                frameSize = 0;
                if (z) {
                    wj.AHr();
                    int validFrameCount3 = iA8Y + candidateSynchronizedHeaderData2;
                    wj.A3x(validFrameCount3);
                } else {
                    wj.AJ9(1);
                }
                searchedBytes = candidateSynchronizedHeaderData2;
            } else {
                i++;
                if (i == 1) {
                    this.A0H.A00(iA0C);
                    frameSize = iA0C;
                } else if (i == 4) {
                    break;
                }
                int validFrameCount4 = candidateSynchronizedHeaderData - 4;
                wj.A3x(validFrameCount4);
            }
        }
        if (z) {
            wj.AJ9(iA8Y + searchedBytes);
        } else {
            wj.AHr();
        }
        this.A01 = frameSize;
        return true;
    }

    public static /* synthetic */ UK[] A0G() {
        return new UK[]{new C1065To()};
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AA0(UL ul) {
        this.A07 = ul;
        this.A09 = this.A07.AJX(0, 1);
        this.A08 = this.A09;
        this.A07.A6E();
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final int AGT(WJ wj, C1081Ug c1081Ug) throws IOException {
        A0A();
        int iA00 = A00(wj);
        if (iA00 == -1 && (this.A0A instanceof AB)) {
            long jA03 = A03(this.A04);
            long durationUs = this.A0A.A7j();
            if (durationUs != jA03) {
                ((AB) this.A0A).A00(jA03);
                this.A07.AID(this.A0A);
            }
        }
        return iA00;
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AIC(long j, long j2) {
        this.A01 = 0;
        this.A02 = C.TIME_UNSET;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j2;
        if ((this.A0A instanceof AB) && !((AB) this.A0A).A02(j2)) {
            this.A0C = true;
            this.A08 = this.A0I;
        }
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final boolean AJB(WJ wj) throws IOException {
        return A0F(wj, true);
    }
}
