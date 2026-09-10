package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC2745oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC2745oQ
    public final C10683i A09(C10683i c10683i) throws C10693j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C10683i.A05;
        }
        if (c10683i.A02 == 2) {
            int i2 = c10683i.A01 != iArr.length ? 1 : 0;
            int i3 = 0;
            while (i3 < iArr.length) {
                int i4 = iArr[i3];
                if (i4 < c10683i.A01) {
                    i2 |= i4 != i3 ? 1 : 0;
                    i3++;
                } else {
                    throw new C10693j(c10683i);
                }
            }
            if (i2 != 0) {
                return new C10683i(c10683i.A03, iArr.length, 2);
            }
            return C10683i.A05;
        }
        throw new C10693j(c10683i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2745oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10703k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC10843y.A01(this.A00);
        int iPosition = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position = outputSize - iPosition;
        ByteBuffer byteBufferA00 = A00(this.A06.A00 * (position / this.A05.A00));
        while (iPosition < outputSize) {
            for (int i2 : iArr) {
                byteBufferA00.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        byteBufferA00.flip();
    }
}
