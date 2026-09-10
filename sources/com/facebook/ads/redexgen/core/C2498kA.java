package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2498kA extends AbstractRunnableC1787Wc {
    public static byte[] A02;
    public final /* synthetic */ N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, 29, 33, 35, 50, 50, 43, 44, 37};
    }

    public C2498kA(N8 n8, String str) {
        this.A00 = n8;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        String strA00 = A00(0, 17, 81);
        try {
            this.A00.A06.await();
            if (this.A00.A0J(this.A01)) {
                ((C1563Nf) this.A00.A02.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                this.A00.A02.A07(this.A01);
                this.A00.A02.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e2) {
            this.A00.A03.A08().ABC(strA00, AbstractC1712Td.A1B, new C1713Te(e2));
        } catch (JSONException e3) {
            this.A00.A0M();
            this.A00.A03.A08().ABC(strA00, AbstractC1712Td.A1A, new C1713Te(e3));
        }
    }
}
