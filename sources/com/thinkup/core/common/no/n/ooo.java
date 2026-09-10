package com.thinkup.core.common.no.n;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class ooo extends om {
    final transient byte[][] om;
    final transient int[] on;

    public ooo(n nVar, int i2) {
        super(null);
        omo.o(nVar.f42084n, 0L, i2);
        o0n o0nVar = nVar.m;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = o0nVar.oo;
            int i7 = o0nVar.o0;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            o0nVar = o0nVar.m0;
        }
        this.om = new byte[i5][];
        this.on = new int[i5 * 2];
        o0n o0nVar2 = nVar.m;
        int i8 = 0;
        while (i3 < i2) {
            byte[][] bArr = this.om;
            bArr[i8] = o0nVar2.f42090n;
            int i9 = o0nVar2.oo;
            int i10 = o0nVar2.o0;
            int i11 = (i9 - i10) + i3;
            i3 = i11 > i2 ? i2 : i11;
            int[] iArr = this.on;
            iArr[i8] = i3;
            iArr[bArr.length + i8] = i10;
            o0nVar2.om = true;
            i8++;
            o0nVar2 = o0nVar2.m0;
        }
    }

    private om nm() {
        return new om(mn());
    }

    private Object nn() {
        return nm();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof om) {
            om omVar = (om) obj;
            if (omVar.mm() == mm() && o(0, omVar, 0, mm())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thinkup.core.common.no.n.om
    public final int hashCode() {
        int i2 = this.o0;
        if (i2 != 0) {
            return i2;
        }
        int length = this.om.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            byte[] bArr = this.om[i3];
            int[] iArr = this.on;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.o0 = i4;
        return i4;
    }

    @Override // com.thinkup.core.common.no.n.om
    public final String m() {
        return nm().m();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final om m0() {
        return nm().m0();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final int mm() {
        return this.on[this.om.length - 1];
    }

    @Override // com.thinkup.core.common.no.n.om
    public final byte[] mn() {
        int[] iArr = this.on;
        byte[][] bArr = this.om;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.on;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.om[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    @Override // com.thinkup.core.common.no.n.om
    public final om mo() {
        return nm().mo();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final om n() {
        return nm().n();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final byte[] n0() {
        return mn();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final ByteBuffer no() {
        return ByteBuffer.wrap(mn()).asReadOnlyBuffer();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final String o() {
        return nm().o();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final om o0() {
        return nm().o0();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final String om() {
        return nm().om();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final String on() {
        return nm().on();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final om oo() {
        return nm().oo();
    }

    @Override // com.thinkup.core.common.no.n.om
    public final String toString() {
        return nm().toString();
    }

    private int n(int i2) {
        int iBinarySearch = Arrays.binarySearch(this.on, 0, this.om.length, i2 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.thinkup.core.common.no.n.om
    public final om m(om omVar) {
        return nm().m(omVar);
    }

    @Override // com.thinkup.core.common.no.n.om
    public final String o(Charset charset) {
        return nm().o(charset);
    }

    @Override // com.thinkup.core.common.no.n.om
    public final byte m(int i2) {
        omo.o(this.on[this.om.length - 1], i2, 1L);
        int iN = n(i2);
        int i3 = iN == 0 ? 0 : this.on[iN - 1];
        int[] iArr = this.on;
        byte[][] bArr = this.om;
        return bArr[iN][(i2 - i3) + iArr[bArr.length + iN]];
    }

    @Override // com.thinkup.core.common.no.n.om
    public final om o(om omVar) {
        return nm().o(omVar);
    }

    @Override // com.thinkup.core.common.no.n.om
    public final om o(int i2) {
        return nm().o(i2);
    }

    @Override // com.thinkup.core.common.no.n.om
    public final om o(int i2, int i3) {
        return nm().o(i2, i3);
    }

    @Override // com.thinkup.core.common.no.n.om
    public final void o(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.om.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int[] iArr = this.on;
                int i4 = iArr[length + i2];
                int i5 = iArr[i2];
                outputStream.write(this.om[i2], i4, i5 - i3);
                i2++;
                i3 = i5;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.thinkup.core.common.no.n.om
    public final int m(byte[] bArr, int i2) {
        return nm().m(bArr, i2);
    }

    @Override // com.thinkup.core.common.no.n.om
    public final void o(n nVar) {
        int length = this.om.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.on;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            o0n o0nVar = new o0n(this.om[i2], i4, (i4 + i5) - i3, true, false);
            o0n o0nVar2 = nVar.m;
            if (o0nVar2 == null) {
                o0nVar.mo = o0nVar;
                o0nVar.m0 = o0nVar;
                nVar.m = o0nVar;
            } else {
                o0nVar2.mo.o(o0nVar);
            }
            i2++;
            i3 = i5;
        }
        nVar.f42084n += (long) i3;
    }

    @Override // com.thinkup.core.common.no.n.om
    public final boolean o(int i2, om omVar, int i3, int i4) {
        if (i2 < 0 || i2 > mm() - i4) {
            return false;
        }
        int iN = n(i2);
        while (i4 > 0) {
            int i5 = iN == 0 ? 0 : this.on[iN - 1];
            int iMin = Math.min(i4, ((this.on[iN] - i5) + i5) - i2);
            int[] iArr = this.on;
            byte[][] bArr = this.om;
            if (!omVar.o(i3, bArr[iN], (i2 - i5) + iArr[bArr.length + iN], iMin)) {
                return false;
            }
            i2 += iMin;
            i3 += iMin;
            i4 -= iMin;
            iN++;
        }
        return true;
    }

    @Override // com.thinkup.core.common.no.n.om
    public final boolean o(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > mm() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int iN = n(i2);
        while (i4 > 0) {
            int i5 = iN == 0 ? 0 : this.on[iN - 1];
            int iMin = Math.min(i4, ((this.on[iN] - i5) + i5) - i2);
            int[] iArr = this.on;
            byte[][] bArr2 = this.om;
            if (!omo.o(bArr2[iN], (i2 - i5) + iArr[bArr2.length + iN], bArr, i3, iMin)) {
                return false;
            }
            i2 += iMin;
            i3 += iMin;
            i4 -= iMin;
            iN++;
        }
        return true;
    }

    @Override // com.thinkup.core.common.no.n.om
    public final int o(byte[] bArr, int i2) {
        return nm().o(bArr, i2);
    }
}
