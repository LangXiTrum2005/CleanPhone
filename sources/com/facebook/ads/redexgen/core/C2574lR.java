package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.p004ironsource.mediationsdk.metadata.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2574lR implements H9 {
    public static byte[] A0C;
    public static String[] A0D = {"Jp9jYTsvX0byW8PsTh8WCsi4kS5THTDZ", "u9JmQf2RUpXkbwKGcH1ldYLO1OaAnoG0", "zVRI5h7vLNN08I5W1BFePAuDidXDjkLB", "GupX0AjjIH906l5opBlPCY0Mrv7mkKOY", "YLyM9aD6SKjNKerJ1EloHyT", "oAaNr5RuznTKLecZmpLN", "Q5WjYzMQ2NaCiwYPtyRn68zXUmvTXGHf", "bi8dQH0GL9bk2fQxVP7KQMQdOg6RbrhP"};
    public static final HD A0E;
    public int A00;
    public long A01;
    public long A02;
    public HA A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final C11064u A08;
    public final C11074v A09;
    public final C11074v A0A;
    public final C2573lQ A0B;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{39, 11, 6, 12, 5, 24, 7, 15, 14, 74, 43, 46, 62, 57, 74, 25, 30, 24, 15, 11, 7};
    }

    static {
        A04();
        A0E = new HD() { // from class: com.facebook.ads.redexgen.X.lS
            @Override // com.facebook.ads.redexgen.core.HD
            public final H9[] A5N() {
                return C2574lR.A07();
            }

            @Override // com.facebook.ads.redexgen.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
    }

    public C2574lR() {
        this(0);
    }

    public C2574lR(int i2) {
        this.A07 = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.A0B = new C2573lQ(true);
        this.A09 = new C11074v(a.f25965n);
        this.A00 = -1;
        this.A01 = -1L;
        this.A0A = new C11074v(10);
        this.A08 = new C11064u(this.A0A.A0l());
    }

    public static int A00(int i2, long j) {
        return (int) (((((long) i2) * 8) * 1000000) / j);
    }

    private int A01(InterfaceC2651ms interfaceC2651ms) throws IOException {
        int i2 = 0;
        while (true) {
            interfaceC2651ms.AGt(this.A0A.A0l(), 0, 10);
            this.A0A.A0f(0);
            if (this.A0A.A0K() != 4801587) {
                break;
            }
            this.A0A.A0g(3);
            int length = this.A0A.A0H();
            int firstFramePosition = length + 10;
            i2 += firstFramePosition;
            interfaceC2651ms.A47(length);
        }
        interfaceC2651ms.AIl();
        interfaceC2651ms.A47(i2);
        if (this.A01 == -1) {
            this.A01 = i2;
        }
        return i2;
    }

    private C2655mx A02(long j, boolean z2) {
        return new C2655mx(j, this.A01, A00(this.A00, this.A0B.A0J()), this.A00, z2);
    }

    @RequiresNonNull({"extractorOutput"})
    private void A05(long j, boolean z2) {
        if (this.A05) {
            return;
        }
        boolean z3 = (this.A07 & 1) != 0 && this.A00 > 0;
        String[] strArr = A0D;
        if (strArr[2].charAt(14) != strArr[3].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "wRCLGMQDqXZHrYOEljE7cvu367IJP6qz";
        strArr2[1] = "FofxBB8LpAk5nYyyotl0uMBanfu6Lq1A";
        if (z3 && this.A0B.A0J() == -9223372036854775807L && !z2) {
            return;
        }
        if (!z3 || this.A0B.A0J() == -9223372036854775807L) {
            this.A03.AJ7(new C2646mn(-9223372036854775807L));
        } else {
            this.A03.AJ7(A02(j, (this.A07 & 2) != 0));
        }
        this.A05 = true;
    }

    private void A06(InterfaceC2651ms interfaceC2651ms) throws IOException {
        int iA04;
        if (this.A04) {
            return;
        }
        this.A00 = -1;
        interfaceC2651ms.AIl();
        if (interfaceC2651ms.A8n() == 0) {
            A01(interfaceC2651ms);
        }
        int currentFrameSize = 0;
        long j = 0;
        do {
            try {
                if (!interfaceC2651ms.AGu(this.A0A.A0l(), 0, 2, true)) {
                    break;
                }
                this.A0A.A0f(0);
                if (C2573lQ.A0F(this.A0A.A0M())) {
                    if (!interfaceC2651ms.AGu(this.A0A.A0l(), 0, 4, true)) {
                        break;
                    }
                    this.A08.A08(14);
                    iA04 = this.A08.A04(13);
                    int numValidFrames = A0D[7].charAt(7);
                    if (numValidFrames != 114) {
                        A0D[4] = "EiGF";
                        if (iA04 > 6) {
                            j += (long) iA04;
                            currentFrameSize++;
                            if (currentFrameSize == 1000) {
                                break;
                            }
                        } else {
                            this.A04 = true;
                            throw C3K.A01(A03(0, 21, 88), null);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    currentFrameSize = 0;
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC2651ms.A48(iA04 - 6, true));
        interfaceC2651ms.AIl();
        if (currentFrameSize > 0) {
            this.A00 = (int) (j / ((long) currentFrameSize));
        } else {
            this.A00 = -1;
        }
        this.A04 = true;
    }

    public static /* synthetic */ H9[] A07() {
        return new H9[]{new C2574lR()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(HA ha) {
        this.A03 = ha;
        this.A0B.A5c(ha, new LG(0, 1));
        ha.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(InterfaceC2651ms interfaceC2651ms, HV hv) throws IOException {
        AbstractC10843y.A02(this.A03);
        long jA8O = interfaceC2651ms.A8O();
        if (((this.A07 & 2) == 0 && ((this.A07 & 1) == 0 || jA8O == -1)) ? false : true) {
            A06(interfaceC2651ms);
        }
        int bytesRead = interfaceC2651ms.read(this.A09.A0l(), 0, a.f25965n);
        boolean z2 = bytesRead == -1;
        A05(jA8O, z2);
        if (z2) {
            return -1;
        }
        this.A09.A0f(0);
        this.A09.A0e(bytesRead);
        if (!this.A06) {
            this.A0B.AGq(this.A02, 4);
            this.A06 = true;
        }
        this.A0B.A5A(this.A09);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        this.A06 = false;
        this.A0B.AJ5();
        this.A02 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(InterfaceC2651ms interfaceC2651ms) throws IOException {
        int headerPosition;
        int iA01 = A01(interfaceC2651ms);
        int i2 = iA01;
        int frameSize = 0;
        int syncBytes = 0;
        do {
            interfaceC2651ms.AGt(this.A0A.A0l(), 0, 2);
            this.A0A.A0f(0);
            int startPosition = this.A0A.A0M();
            if (!C2573lQ.A0F(startPosition)) {
                syncBytes = 0;
                frameSize = 0;
                i2++;
                interfaceC2651ms.AIl();
                interfaceC2651ms.A47(i2);
            } else {
                syncBytes++;
                String[] strArr = A0D;
                String str = strArr[2];
                String str2 = strArr[3];
                int headerPosition2 = str.charAt(14);
                int startPosition2 = str2.charAt(14);
                if (headerPosition2 != startPosition2) {
                    throw new RuntimeException();
                }
                A0D[7] = "vlF0iwwjiK26GT4HTqGcAOiXXpcsHbpg";
                if (syncBytes >= 4 && frameSize > 188) {
                    return true;
                }
                interfaceC2651ms.AGt(this.A0A.A0l(), 0, 4);
                this.A08.A08(14);
                C11064u c11064u = this.A08;
                int headerPosition3 = A0D[5].length();
                if (headerPosition3 == 4) {
                    throw new RuntimeException();
                }
                A0D[4] = "LrBCAcAc8FKB1NeW";
                int headerPosition4 = c11064u.A04(13);
                if (headerPosition4 <= 6) {
                    syncBytes = 0;
                    frameSize = 0;
                    i2++;
                    interfaceC2651ms.AIl();
                    interfaceC2651ms.A47(i2);
                } else {
                    int startPosition3 = headerPosition4 - 6;
                    interfaceC2651ms.A47(startPosition3);
                    frameSize += headerPosition4;
                }
            }
            headerPosition = i2 - iA01;
        } while (headerPosition < 8192);
        return false;
    }
}
