package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C12159f implements InterfaceC2651ms {
    public static String[] A07 = {"YlHQuKLayYbpqzx9FSV6CQrLdQj96AeM", "S4RZcb4lBSGk97kEvSl91HaEV0P4", "uVSfNf", "Coq", "aQ2CxhcvUBulJYKynnVyQo", "flTysjHMhLtcJrzUbSTnFz15x2mZl", "8oFgaOvQgeQ1BxQlutu1jILF1QVjJ1FW", "wjWZdP"};
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03;
    public final long A04;
    public final InterfaceC2796pF A05;
    public final byte[] A06;

    public C12159f(InterfaceC2796pF interfaceC2796pF, long j, long j2) {
        this(interfaceC2796pF, j, j2, false);
    }

    public C12159f(InterfaceC2796pF interfaceC2796pF, long j, long j2, boolean z2) {
        this.A05 = interfaceC2796pF;
        this.A02 = j;
        this.A04 = j2;
        this.A03 = new byte[65536];
        this.A06 = new byte[4096];
    }

    private int A00(int i2) {
        int bytesSkipped = Math.min(this.A00, i2);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i2, int i3) {
        if (this.A00 == 0) {
            return 0;
        }
        int iMin = Math.min(this.A00, i3);
        System.arraycopy(this.A03, 0, bArr, i2, iMin);
        A05(iMin);
        return iMin;
    }

    private int A02(byte[] bArr, int i2, int i3, int i4, boolean z2) throws IOException {
        if (!Thread.interrupted()) {
            int i5 = this.A05.read(bArr, i2 + i4, i3 - i4);
            if (i5 == -1) {
                if (i4 == 0 && z2) {
                    return -1;
                }
                throw new EOFException();
            }
            return i4 + i5;
        }
        throw new InterruptedIOException();
    }

    private void A03(int i2) {
        if (i2 != -1) {
            this.A02 += (long) i2;
        }
    }

    private void A04(int i2) {
        int i3 = this.A01 + i2;
        int requiredLength = this.A03.length;
        if (i3 > requiredLength) {
            int requiredLength2 = this.A03.length;
            int requiredLength3 = 524288 + i3;
            int newPeekCapacity = C5C.A07(requiredLength2 * 2, 65536 + i3, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i2) {
        this.A00 -= i2;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (this.A00 < this.A03.length - 524288) {
            bArr = new byte[this.A00 + 65536];
        }
        byte[] bArr2 = this.A03;
        int i3 = this.A00;
        if (A07[3].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "U6HOVF";
        strArr[2] = "FLrwJS";
        System.arraycopy(bArr2, i2, bArr, 0, i3);
        this.A03 = bArr;
    }

    public final boolean A06(int i2, boolean z2) throws IOException {
        int iA00 = A00(i2);
        while (true) {
            String[] strArr = A07;
            String str = strArr[1];
            String str2 = strArr[5];
            int length = str.length();
            int bytesSkipped = str2.length();
            if (length == bytesSkipped) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "VT2oIT";
            strArr2[2] = "AHKvNZ";
            if (iA00 < i2 && iA00 != -1) {
                int bytesSkipped2 = this.A06.length;
                iA00 = A02(this.A06, -iA00, Math.min(i2, bytesSkipped2 + iA00), iA00, z2);
            } else {
                A03(iA00);
                return iA00 != -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final void A47(int i2) throws IOException {
        A48(i2, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final boolean A48(int i2, boolean z2) throws IOException {
        A04(i2);
        int iA02 = this.A00 - this.A01;
        while (iA02 < i2) {
            iA02 = A02(this.A03, this.A01, i2, iA02, z2);
            if (iA02 == -1) {
                String[] strArr = A07;
                String str = strArr[6];
                String str2 = strArr[0];
                int iCharAt = str.charAt(25);
                int bytesPeeked = str2.charAt(25);
                if (iCharAt == bytesPeeked) {
                    String[] strArr2 = A07;
                    strArr2[1] = "U9yRyStfgEDvt0OpJggQJXPRXL9S";
                    strArr2[5] = "yvkfr8ZSlHssIeYh6rwGG04GsxspU";
                    return false;
                }
                throw new RuntimeException();
            }
            int bytesPeeked2 = this.A01;
            this.A00 = bytesPeeked2 + iA02;
        }
        int bytesPeeked3 = this.A01;
        this.A01 = bytesPeeked3 + i2;
        String[] strArr3 = A07;
        String str3 = strArr3[1];
        String str4 = strArr3[5];
        int length = str3.length();
        int bytesPeeked4 = str4.length();
        if (length != bytesPeeked4) {
            A07[3] = "05c";
            return true;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final long A8O() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final long A8i() {
        return this.A02 + ((long) this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final long A8n() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final Uri A9P() {
        return this.A05.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final int AGs(byte[] bArr, int i2, int i3) throws IOException {
        int iMin;
        A04(i3);
        int bytesPeeked = this.A00 - this.A01;
        if (bytesPeeked == 0) {
            iMin = A02(this.A03, this.A01, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            int peekBufferRemainingBytes = this.A00;
            this.A00 = peekBufferRemainingBytes + iMin;
        } else {
            iMin = Math.min(i3, bytesPeeked);
        }
        byte[] bArr2 = this.A03;
        int peekBufferRemainingBytes2 = this.A01;
        System.arraycopy(bArr2, peekBufferRemainingBytes2, bArr, i2, iMin);
        int peekBufferRemainingBytes3 = this.A01;
        this.A01 = peekBufferRemainingBytes3 + iMin;
        return iMin;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final void AGt(byte[] bArr, int i2, int i3) throws IOException {
        AGu(bArr, i2, i3, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final boolean AGu(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        if (!A48(i3, z2)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final boolean AHR(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        int iA01 = A01(bArr, i2, i3);
        while (iA01 < i3 && iA01 != -1) {
            iA01 = A02(bArr, i2, i3, iA01, z2);
        }
        A03(iA01);
        return iA01 != -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final void AIl() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final int AK0(int i2) throws IOException {
        int iA00 = A00(i2);
        if (iA00 == 0) {
            byte[] bArr = this.A06;
            int bytesSkipped = this.A06.length;
            iA00 = A02(bArr, 0, Math.min(i2, bytesSkipped), 0, true);
        }
        A03(iA00);
        String[] strArr = A07;
        String str = strArr[7];
        String str2 = strArr[2];
        int length = str.length();
        int bytesSkipped2 = str2.length();
        if (length != bytesSkipped2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "4muWdj2u5Q3eId9F7O7O9kyn7QS9F70y";
        strArr2[0] = "MQBZi4ACHP4vbg8D4iuKjBQaYQ9ASuUs";
        return iA00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final void AK3(int i2) throws IOException {
        A06(i2, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms, com.facebook.ads.redexgen.core.InterfaceC10402c
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int bytesRead = A01(bArr, i2, i3);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i2, i3, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2651ms
    public final void readFully(byte[] bArr, int i2, int i3) throws IOException {
        AHR(bArr, i2, i3, false);
    }
}
