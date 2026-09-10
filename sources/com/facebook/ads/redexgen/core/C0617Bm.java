package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0617Bm implements WJ {
    public static String[] A07 = {"oxLkf78OV4NmISqR8MY9co8Zkfa1", "w8oDP0kuGdOZ8m3", "3CFRvfRzEWkE4qPDDRiRFF4v8Naoq8", "h3webJp6azVi9BLWO4hNBtTzZTT8Up", "E5AuD2iWjrxVijcXBoDaMI", "d4KLOYWiobWPxCHS", "QQQLcpKn3d", "vvCId3izfqSiOj3zM05VyRbj8h8XddLP"};
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03;
    public final long A04;
    public final Q7 A05;
    public final byte[] A06;

    public C0617Bm(Q7 q7, long j, long j2) {
        this(q7, j, j2, false);
    }

    public C0617Bm(Q7 q7, long j, long j2, boolean z) {
        this.A05 = q7;
        this.A02 = j;
        this.A04 = j2;
        this.A03 = new byte[65536];
        this.A06 = new byte[4096];
    }

    private int A00(int i) {
        int bytesSkipped = Math.min(this.A00, i);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i, int i2) {
        if (this.A00 == 0) {
            return 0;
        }
        int iMin = Math.min(this.A00, i2);
        System.arraycopy(this.A03, 0, bArr, i, iMin);
        A05(iMin);
        return iMin;
    }

    private int A02(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int i4 = this.A05.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + i4;
        }
        throw new InterruptedIOException();
    }

    private void A03(int i) {
        if (i != -1) {
            this.A02 += (long) i;
        }
    }

    private void A04(int i) {
        int i2 = this.A01 + i;
        int requiredLength = this.A03.length;
        if (i2 > requiredLength) {
            int requiredLength2 = this.A03.length;
            int requiredLength3 = 524288 + i2;
            int newPeekCapacity = AbstractC1600gE.A07(requiredLength2 * 2, 65536 + i2, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i) {
        this.A00 -= i;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (this.A00 < this.A03.length - 524288) {
            bArr = new byte[this.A00 + 65536];
        }
        byte[] newPeekBuffer = this.A03;
        System.arraycopy(newPeekBuffer, i, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i, boolean z) throws IOException {
        int iA00 = A00(i);
        while (iA00 < i && iA00 != -1) {
            int bytesSkipped = this.A06.length;
            iA00 = A02(this.A06, -iA00, Math.min(i, bytesSkipped + iA00), iA00, z);
        }
        A03(iA00);
        return iA00 != -1;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final void A3x(int i) throws IOException {
        A3y(i, false);
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final boolean A3y(int i, boolean z) throws IOException {
        A04(i);
        int iA02 = this.A00 - this.A01;
        while (iA02 < i) {
            iA02 = A02(this.A03, this.A01, i, iA02, z);
            if (iA02 == -1) {
                return false;
            }
            int bytesPeeked = this.A01;
            this.A00 = bytesPeeked + iA02;
        }
        int bytesPeeked2 = this.A01;
        this.A01 = bytesPeeked2 + i;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final long A8E() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final long A8Y() {
        return this.A02 + ((long) this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final long A8d() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final Uri A9F() {
        return this.A05.A9F();
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final int AG0(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        A04(i2);
        int bytesPeeked = this.A00 - this.A01;
        if (bytesPeeked == 0) {
            iMin = A02(this.A03, this.A01, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            int i3 = this.A00 + iMin;
            if (A07[1].length() == 6) {
                throw new RuntimeException();
            }
            A07[7] = "jElW23TMKGwtLnZ4hvW7O5Y18TYLCbj0";
            this.A00 = i3;
        } else {
            iMin = Math.min(i2, bytesPeeked);
        }
        byte[] bArr2 = this.A03;
        int peekBufferRemainingBytes = this.A01;
        System.arraycopy(bArr2, peekBufferRemainingBytes, bArr, i, iMin);
        int i4 = this.A01 + iMin;
        if (A07[6].length() != 10) {
            this.A01 = i4;
            return iMin;
        }
        String[] strArr = A07;
        strArr[2] = "v4BF181lgFk01GcYFIYXx8iGSHgolU";
        strArr[0] = "wk2FofBnrpWk9Sth69Nb054wx1fh";
        this.A01 = i4;
        return iMin;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final void AG1(byte[] bArr, int i, int i2) throws IOException {
        AG2(bArr, i, i2, false);
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final boolean AG2(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!A3y(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final boolean AGZ(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iA01 = A01(bArr, i, i2);
        while (iA01 < i2 && iA01 != -1) {
            iA01 = A02(bArr, i, i2, iA01, z);
        }
        A03(iA01);
        return iA01 != -1;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final void AHr() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final int AJ6(int i) throws IOException {
        int bytesSkipped = A00(i);
        if (bytesSkipped == 0) {
            bytesSkipped = A02(this.A06, 0, Math.min(i, this.A06.length), 0, true);
        }
        A03(bytesSkipped);
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final void AJ9(int i) throws IOException {
        A06(i, false);
    }

    @Override // com.facebook.ads.redexgen.core.WJ, com.facebook.ads.redexgen.core.O9
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int bytesRead = A01(bArr, i, i2);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i, i2, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.core.WJ
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        AGZ(bArr, i, i2, false);
    }
}
