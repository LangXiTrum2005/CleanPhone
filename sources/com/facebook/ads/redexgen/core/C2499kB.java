package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2499kB extends AbstractRunnableC1787Wc {
    public static byte[] A02;
    public final /* synthetic */ N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C2499kB(N8 n8, String str) {
        this.A00 = n8;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                try {
                    Iterator<String> itKeys = this.A00.A02.A05().keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (this.A00.A0J(this.A01)) {
                            this.A00.A0E((C1563Nf) this.A00.A02.A05().get(next), next, next.equals(this.A01));
                        }
                    }
                    this.A00.A02.A06();
                    this.A00.A08();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e2) {
            InterfaceC1711Tc interfaceC1711TcA08 = this.A00.A03.A08();
            String encryptedId = A00(0, 17, 22);
            interfaceC1711TcA08.ABC(encryptedId, AbstractC1712Td.A1B, new C1713Te(e2));
        } catch (JSONException e3) {
            this.A00.A0M();
            InterfaceC1711Tc interfaceC1711TcA09 = this.A00.A03.A08();
            String encryptedId2 = A00(0, 17, 22);
            interfaceC1711TcA09.ABC(encryptedId2, AbstractC1712Td.A1A, new C1713Te(e3));
        }
    }
}
