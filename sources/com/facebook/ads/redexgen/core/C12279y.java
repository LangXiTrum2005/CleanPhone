package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C12279y extends AbstractC2745oQ {
    public static String[] A0C = {"kTOKNBh1Wp6avXYwKxrfNqHQCe6IowZb", "fsh7jTNUZTGCSew0VT63IO4tkQUYppyQ", "CGsUWOpaOXfE7pNtsFBesiWCOQ75lYHg", "3QzqyUj5HYGt0uXrFXWs5fdma44AOfyL", "C3DxIlHWWAPwLuHgY8W8WEDh6NP", "cCeo7h1kMT8v6dcJbz1RM5PEEOyjnS1I", "8Ip3ivaO", "u5WK46JzMVMnhOVxX0VDjJ353j7WObAc"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public final long A09;
    public final long A0A;
    public final short A0B;

    public C12279y() {
        this(150000L, 20000L, (short) 1024);
    }

    public C12279y(long j, long j2, short s) {
        AbstractC10843y.A07(j2 <= j);
        this.A09 = j;
        this.A0A = j2;
        this.A0B = s;
        this.A07 = C5C.A07;
        this.A08 = C5C.A07;
    }

    private int A00(long j) {
        return (int) ((((long) super.A05.A03) * j) / 1000000);
    }

    private int A01(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 2; iLimit >= i; iLimit -= 2) {
            int i2 = byteBuffer.getShort(iLimit);
            int iAbs = Math.abs(i2);
            int i3 = this.A0B;
            if (iAbs > i3) {
                int i4 = this.A00;
                int i5 = this.A00;
                int i6 = i4 * (iLimit / i5);
                int i7 = this.A00;
                return i6 + i7;
            }
        }
        int i8 = byteBuffer.position();
        return i8;
    }

    private int A02(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < i; iPosition += 2) {
            int i2 = byteBuffer.getShort(iPosition);
            int iAbs = Math.abs(i2);
            int i3 = this.A0B;
            if (iAbs > i3) {
                int i4 = this.A00;
                int i5 = this.A00;
                return i4 * (iPosition / i5);
            }
        }
        int i6 = byteBuffer.limit();
        return i6;
    }

    private void A03(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        A00(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.A06 = true;
        }
    }

    private void A04(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int maybeSilenceBufferRemaining = A02(byteBuffer);
        int limit = byteBuffer.position();
        int maybeSilenceInputSize = maybeSilenceBufferRemaining - limit;
        int noisePosition = this.A07.length;
        int limit2 = this.A01;
        int noisePosition2 = noisePosition - limit2;
        if (maybeSilenceBufferRemaining < iLimit && maybeSilenceInputSize < noisePosition2) {
            byte[] bArr = this.A07;
            int maybeSilenceBufferRemaining2 = this.A01;
            int noisePosition3 = A0C[4].length();
            if (noisePosition3 == 0) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[2] = "id1mOky4Zsioh8kkFhZ0Iqg9uH7l7sht";
            strArr[7] = "uHcgX8Q5LBy4SketH3HUZ8MVXP73GzFI";
            A08(bArr, maybeSilenceBufferRemaining2);
            this.A01 = 0;
            this.A03 = 0;
            return;
        }
        int maybeSilenceInputSize2 = Math.min(maybeSilenceInputSize, noisePosition2);
        int limit3 = byteBuffer.position();
        byteBuffer.limit(limit3 + maybeSilenceInputSize2);
        byte[] bArr2 = this.A07;
        int limit4 = this.A01;
        byteBuffer.get(bArr2, limit4, maybeSilenceInputSize2);
        int limit5 = this.A01;
        this.A01 = limit5 + maybeSilenceInputSize2;
        int noisePosition4 = this.A01;
        int limit6 = this.A07.length;
        if (noisePosition4 == limit6) {
            if (this.A06) {
                byte[] bArr3 = this.A07;
                int limit7 = this.A02;
                A08(bArr3, limit7);
                long j = this.A04;
                int noisePosition5 = this.A01;
                int limit8 = this.A02;
                int noisePosition6 = noisePosition5 - (limit8 * 2);
                int limit9 = this.A00;
                this.A04 = j + ((long) (noisePosition6 / limit9));
            } else {
                long j2 = this.A04;
                int noisePosition7 = this.A01;
                int limit10 = this.A02;
                int noisePosition8 = noisePosition7 - limit10;
                int limit11 = this.A00;
                this.A04 = j2 + ((long) (noisePosition8 / limit11));
            }
            byte[] bArr4 = this.A07;
            int limit12 = this.A01;
            A07(byteBuffer, bArr4, limit12);
            this.A01 = 0;
            this.A03 = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void A05(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int limit = this.A07.length;
        byteBuffer.limit(Math.min(iLimit, iPosition + limit));
        int noiseLimit = A01(byteBuffer);
        int limit2 = byteBuffer.position();
        if (noiseLimit == limit2) {
            this.A03 = 1;
        } else {
            byteBuffer.limit(noiseLimit);
            A03(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void A06(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        byteBuffer.limit(iA02);
        long j = this.A04;
        int noisyPosition = byteBuffer.remaining();
        int limit = this.A00;
        this.A04 = j + ((long) (noisyPosition / limit));
        byte[] bArr = this.A08;
        int limit2 = this.A02;
        A07(byteBuffer, bArr, limit2);
        if (iA02 < iLimit) {
            byte[] bArr2 = this.A08;
            int limit3 = this.A02;
            A08(bArr2, limit3);
            this.A03 = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void A07(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.A02);
        int i3 = this.A02 - iMin;
        System.arraycopy(bArr, i2 - i3, this.A08, 0, i3);
        int fromInputSize = byteBuffer.limit();
        byteBuffer.position(fromInputSize - iMin);
        byteBuffer.get(this.A08, i3, iMin);
    }

    private void A08(byte[] bArr, int i2) {
        A00(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.A06 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2745oQ
    public final C10683i A09(C10683i c10683i) throws C10693j {
        if (c10683i.A02 == 2) {
            return this.A05 ? c10683i : C10683i.A05;
        }
        throw new C10693j(c10683i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2745oQ
    public final void A0A() {
        if (this.A05) {
            this.A00 = super.A05.A00;
            int iA00 = A00(this.A09) * this.A00;
            int maybeSilenceBufferSize = this.A07.length;
            if (maybeSilenceBufferSize != iA00) {
                this.A07 = new byte[iA00];
            }
            int iA01 = A00(this.A0A);
            int maybeSilenceBufferSize2 = this.A00;
            this.A02 = iA01 * maybeSilenceBufferSize2;
            int length = this.A08.length;
            int maybeSilenceBufferSize3 = this.A02;
            if (length != maybeSilenceBufferSize3) {
                int maybeSilenceBufferSize4 = this.A02;
                this.A08 = new byte[maybeSilenceBufferSize4];
            }
        }
        this.A03 = 0;
        this.A04 = 0L;
        this.A01 = 0;
        this.A06 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2745oQ
    public final void A0B() {
        if (this.A01 > 0) {
            A08(this.A07, this.A01);
        }
        boolean z2 = this.A06;
        if (A0C[0].charAt(10) == 'o') {
            throw new RuntimeException();
        }
        A0C[3] = "3PybTV2kdzhjV0AdFBUr0i874h0Ge15Q";
        if (!z2) {
            this.A04 += (long) (this.A02 / this.A00);
        }
    }

    public final long A0C() {
        return this.A04;
    }

    public final void A0D(boolean z2) {
        this.A05 = z2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2745oQ, com.facebook.ads.redexgen.core.InterfaceC10703k
    public final boolean AAL() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10703k
    public final void AHH(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !A01()) {
            switch (this.A03) {
                case 0:
                    A05(byteBuffer);
                    break;
                case 1:
                    A04(byteBuffer);
                    break;
                case 2:
                    A06(byteBuffer);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }
}
