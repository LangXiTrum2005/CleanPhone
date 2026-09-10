package com.facebook.ads.redexgen.core;

import com.smartdigimkt.f3.b;
import com.smartdigimkt.y4.g;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1537Me {
    public static String[] A0A = {"Zahrr4TzPnlvzL1ryUDBJHiLrNQrc0do", "gdtiLcJnOI63VIDKC4FZh", "mcKRdr7QIVfArpWMDov87T9yp6nn6XkX", "hh9PATM4XXQMpkTMp0yEe4VjsJayobMb", "DHsdxhl2jOmdOKqNSGjxb8rQV1nmB92A", "YMP8jok2HwiV", b.j, "S"};
    public long A00;
    public long A01;
    public long A02;
    public final C11205i A03;
    public final MP A04;
    public final C8B A05;
    public final InterfaceC1536Md A06;
    public final String A07;
    public final byte[] A08;
    public volatile boolean A09;

    public C1537Me(C8B c8b, C11205i c11205i, byte[] bArr, InterfaceC1536Md interfaceC1536Md) {
        this.A05 = c8b;
        this.A04 = c8b.A0E();
        this.A03 = c11205i;
        this.A08 = bArr == null ? new byte[131072] : bArr;
        this.A06 = interfaceC1536Md;
        this.A07 = c8b.A0F().A4l(c11205i);
        this.A02 = c11205i.A04;
    }

    private long A00() {
        if (this.A01 == -1) {
            return -1L;
        }
        return this.A01 - this.A03.A04;
    }

    private long A01(long j, long j2) throws Throwable {
        boolean z2 = j + j2 == this.A01 || j2 == -1;
        long jAGi = -1;
        boolean z3 = false;
        if (j2 != -1) {
            try {
                jAGi = this.A05.AGi(this.A03.A04().A04(j).A03(j2).A09());
                z3 = true;
            } catch (IOException unused) {
                AbstractC11155d.A00(this.A05);
            }
        }
        if (!z3) {
            A02();
            try {
                jAGi = this.A05.AGi(this.A03.A04().A04(j).A03(-1L).A09());
            } catch (IOException e2) {
                AbstractC11155d.A00(this.A05);
                throw e2;
            }
        }
        int bytesRead = 0;
        if (A0A[3].charAt(20) != 'e') {
            throw new RuntimeException();
        }
        A0A[0] = "hZR9VwpKkwuUXqoAcu0MC0lnjZxabJfZ";
        if (z2 && jAGi != -1) {
            try {
                A04(j + jAGi);
            } catch (IOException e3) {
                AbstractC11155d.A00(this.A05);
                throw e3;
            }
        }
        int i2 = 0;
        while (i2 != -1) {
            A02();
            i2 = this.A05.read(this.A08, 0, this.A08.length);
            if (i2 != -1) {
                A03(i2);
                bytesRead += i2;
            }
        }
        if (z2) {
            A04(((long) bytesRead) + j);
        }
        this.A05.close();
        long j3 = bytesRead;
        String[] strArr = A0A;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[5] = "HblyszVHSCLV";
        strArr2[7] = g.f40227p;
        return j3;
    }

    private void A02() throws InterruptedIOException {
        if (!this.A09) {
        } else {
            throw new InterruptedIOException();
        }
    }

    private void A03(long j) {
        this.A00 += j;
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, j);
        }
    }

    private void A04(long j) {
        if (this.A01 == j) {
            return;
        }
        this.A01 = j;
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, 0L);
        }
    }

    public final void A05() throws IOException {
        long nextRequestLength;
        A02();
        this.A00 = this.A04.A7B(this.A07, this.A03.A04, this.A03.A03);
        if (this.A03.A03 != -1) {
            this.A01 = this.A03.A04 + this.A03.A03;
        } else {
            long jA00 = AbstractC1542Mj.A00(this.A04.A7S(this.A07));
            if (A0A[3].charAt(20) == 'e') {
                String[] strArr = A0A;
                strArr[4] = "d2NeaqM7PiJwxNK1Ah3bQ5GZkUsby9uw";
                strArr[2] = "tLvOBlFvjcFhEySGIYecGT7qbHBlIMmD";
                if (jA00 == -1) {
                    jA00 = -1;
                }
                this.A01 = jA00;
            }
            throw new RuntimeException();
        }
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, 0L);
        }
        while (true) {
            long j = this.A01;
            if (A0A[6].length() == 13) {
                break;
            }
            A0A[1] = "NGuGGBYtFkRF3XmDWlB70";
            if (j == -1 || this.A02 < this.A01) {
                A02();
                if (this.A01 == -1) {
                    nextRequestLength = Long.MAX_VALUE;
                } else {
                    long nextRequestLength2 = this.A01;
                    long blockLength = this.A02;
                    nextRequestLength = nextRequestLength2 - blockLength;
                }
                long jA7C = this.A04.A7C(this.A07, this.A02, nextRequestLength);
                if (jA7C > 0) {
                    long blockLength2 = this.A02;
                    this.A02 = blockLength2 + jA7C;
                } else {
                    long nextRequestLength3 = -jA7C;
                    if (nextRequestLength3 == Long.MAX_VALUE) {
                        nextRequestLength3 = -1;
                    }
                    long j2 = this.A02;
                    long blockLength3 = this.A02;
                    this.A02 = j2 + A01(blockLength3, nextRequestLength3);
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public final void A06() {
        this.A09 = true;
    }
}
