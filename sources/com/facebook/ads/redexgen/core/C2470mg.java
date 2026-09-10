package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2470mg implements H9 {
    public static String[] A0E = {"CA5tgyD1ft6jPQScHcEKxijdDn8CpaAj", "rrvFpoycxrr9C", "qEVAWkTuIpwlYdd7u09", "zGu", "r98", "bvJEUCblPMa4rVVBIUxYNVrIzXUNKtA9", "0YPJWJVAuNzanCV2KA", "Ww61LKXhC9Y0aL9N3LYwjUph3RiaOuui"};
    public static final HD A0F = new HD() { // from class: com.facebook.ads.redexgen.X.mh
        @Override // com.facebook.ads.redexgen.core.HD
        public final H9[] A5N() {
            return C2470mg.A09();
        }

        @Override // com.facebook.ads.redexgen.core.HD
        public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
            return HC.A01(this, uri, map);
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Metadata A05;
    public HA A06;
    public HJ A07;
    public InterfaceC1238Hd A08;
    public C2472mi A09;
    public final C09384v A0A;
    public final HE A0B;
    public final boolean A0C;
    public final byte[] A0D;

    public C2470mg() {
        this(0);
    }

    public C2470mg(int i) {
        this.A0D = new byte[42];
        this.A0A = new C09384v(new byte[32768], 0);
        this.A0C = (i & 1) != 0;
        this.A0B = new HE();
        this.A03 = 0;
    }

    private int A00(InterfaceC2482ms interfaceC2482ms, HV hv) throws IOException {
        AbstractC09153y.A01(this.A08);
        AbstractC09153y.A01(this.A07);
        if (this.A09 != null && this.A09.A09()) {
            return this.A09.A06(interfaceC2482ms, hv);
        }
        long j = this.A04;
        if (A0E[2].length() == 19) {
            A0E[2] = "5vsaEOzV8f26KwvJg69";
            if (j == -1) {
                this.A04 = HF.A01(interfaceC2482ms, this.A07);
                return 0;
            }
            int iA0A = this.A0A.A0A();
            String[] strArr = A0E;
            if (strArr[6].length() != strArr[1].length()) {
                String[] strArr2 = A0E;
                strArr2[6] = "dF6ALNUNBXQAeyaZgj";
                strArr2[1] = "WrJkmBjBZcK3S";
                boolean z = false;
                if (iA0A < 32768) {
                    int currentLimit = 32768 - iA0A;
                    int i = interfaceC2482ms.read(this.A0A.A0l(), iA0A, currentLimit);
                    z = i == -1;
                    if (!z) {
                        this.A0A.A0e(iA0A + i);
                    } else {
                        int currentLimit2 = this.A0A.A07();
                        if (currentLimit2 == 0) {
                            A03();
                            return -1;
                        }
                    }
                }
                int iA09 = this.A0A.A09();
                int i2 = this.A00;
                int currentLimit3 = this.A02;
                if (i2 < currentLimit3) {
                    C09384v c09384v = this.A0A;
                    int i3 = this.A02;
                    int currentLimit4 = this.A00;
                    int i4 = i3 - currentLimit4;
                    int currentLimit5 = this.A0A.A07();
                    c09384v.A0g(Math.min(i4, currentLimit5));
                }
                long jA01 = A01(this.A0A, z);
                int iA010 = this.A0A.A09() - iA09;
                this.A0A.A0f(iA09);
                this.A08.AIr(this.A0A, iA010);
                int currentLimit6 = this.A00;
                this.A00 = currentLimit6 + iA010;
                if (jA01 != -1) {
                    A03();
                    String[] strArr3 = A0E;
                    String str = strArr3[6];
                    String str2 = strArr3[1];
                    int length = str.length();
                    int currentLimit7 = str2.length();
                    if (length != currentLimit7) {
                        String[] strArr4 = A0E;
                        strArr4[3] = "m1G";
                        strArr4[4] = "pgV";
                        this.A00 = 0;
                        this.A04 = jA01;
                    }
                }
                if (this.A0A.A07() < 16) {
                    int iA07 = this.A0A.A07();
                    System.arraycopy(this.A0A.A0l(), this.A0A.A09(), this.A0A.A0l(), 0, iA07);
                    this.A0A.A0f(0);
                    this.A0A.A0e(iA07);
                }
                return 0;
            }
        }
        throw new RuntimeException();
    }

    private long A01(C09384v c09384v, boolean z) {
        boolean zA07;
        AbstractC09153y.A01(this.A07);
        int iA09 = c09384v.A09();
        while (iA09 <= frameOffset - 16) {
            c09384v.A0f(iA09);
            if (HF.A07(c09384v, this.A07, this.A01, this.A0B)) {
                c09384v.A0f(iA09);
                return this.A0B.A00;
            }
            iA09++;
        }
        if (z) {
            while (iA09 <= iA0A - frameOffset) {
                c09384v.A0f(iA09);
                try {
                    zA07 = HF.A07(c09384v, this.A07, this.A01, this.A0B);
                } catch (IndexOutOfBoundsException unused) {
                    zA07 = false;
                }
                int iA010 = c09384v.A09();
                int frameOffset = c09384v.A0A();
                if (iA010 > frameOffset) {
                    zA07 = false;
                }
                if (zA07) {
                    c09384v.A0f(iA09);
                    return this.A0B.A00;
                }
                iA09++;
            }
            int frameOffset2 = c09384v.A0A();
            c09384v.A0f(frameOffset2);
        } else {
            c09384v.A0f(iA09);
        }
        String[] strArr = A0E;
        String str = strArr[3];
        String str2 = strArr[4];
        int length = str.length();
        int frameOffset3 = str2.length();
        if (length != frameOffset3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "ocsB3wUrjHvCq2LiV7qRqPCVLxbY4c1N";
        strArr2[5] = "pwt2z55mSaXVkRisABTZleFgLF4gxvRK";
        return -1L;
    }

    private HY A02(long j, long j2) {
        AbstractC09153y.A01(this.A07);
        if (this.A07.A0A != null) {
            return new C2479mp(this.A07, j);
        }
        if (j2 != -1 && this.A07.A09 > 0) {
            this.A09 = new C2472mi(this.A07, this.A01, j, j2);
            return this.A09.A07();
        }
        return new C2477mn(this.A07.A06());
    }

    private void A03() {
        ((InterfaceC1238Hd) C5C.A0f(this.A08)).AIu((this.A04 * 1000000) / ((long) ((HJ) C5C.A0f(this.A07)).A07), 1, this.A00, 0, null);
    }

    private void A04(InterfaceC2482ms interfaceC2482ms) throws IOException {
        this.A01 = HH.A00(interfaceC2482ms);
        ((HA) C5C.A0f(this.A06)).AJ7(A02(interfaceC2482ms.A8n(), interfaceC2482ms.A8O()));
        this.A03 = 5;
    }

    private void A05(InterfaceC2482ms interfaceC2482ms) throws IOException {
        interfaceC2482ms.AGt(this.A0D, 0, this.A0D.length);
        interfaceC2482ms.AIl();
        this.A03 = 2;
    }

    private void A06(InterfaceC2482ms interfaceC2482ms) throws IOException {
        this.A05 = HH.A02(interfaceC2482ms, !this.A0C);
        this.A03 = 1;
    }

    private void A07(InterfaceC2482ms interfaceC2482ms) throws IOException {
        boolean zA0B = false;
        HG metadataHolder = new HG(this.A07);
        while (!zA0B) {
            zA0B = HH.A0B(interfaceC2482ms, metadataHolder);
            this.A07 = (HJ) C5C.A0f(metadataHolder.A00);
        }
        AbstractC09153y.A01(this.A07);
        this.A02 = Math.max(this.A07.A06, 6);
        ((InterfaceC1238Hd) C5C.A0f(this.A08)).A6e(this.A07.A08(this.A0D, this.A05));
        this.A03 = 4;
    }

    private void A08(InterfaceC2482ms interfaceC2482ms) throws IOException {
        HH.A09(interfaceC2482ms);
        this.A03 = 3;
    }

    public static /* synthetic */ H9[] A09() {
        return new H9[]{new C2470mg()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(HA ha) {
        this.A06 = ha;
        this.A08 = ha.AKS(0, 1);
        ha.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(InterfaceC2482ms interfaceC2482ms, HV hv) throws IOException {
        switch (this.A03) {
            case 0:
                A06(interfaceC2482ms);
                return 0;
            case 1:
                A05(interfaceC2482ms);
                return 0;
            case 2:
                A08(interfaceC2482ms);
                return 0;
            case 3:
                A07(interfaceC2482ms);
                return 0;
            case 4:
                A04(interfaceC2482ms);
                return 0;
            case 5:
                return A00(interfaceC2482ms, hv);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        if (j == 0) {
            this.A03 = 0;
        } else {
            C2472mi c2472mi = this.A09;
            if (A0E[2].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[3] = "FHi";
            strArr[4] = "3pT";
            if (c2472mi != null) {
                this.A09.A08(j2);
            }
        }
        this.A04 = j2 != 0 ? -1L : 0L;
        this.A00 = 0;
        this.A0A.A0d(0);
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(InterfaceC2482ms interfaceC2482ms) throws IOException {
        HH.A01(interfaceC2482ms, false);
        return HH.A0A(interfaceC2482ms);
    }
}
