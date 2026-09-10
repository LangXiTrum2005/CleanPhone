package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2018nB extends BY {
    public static byte[] A02;
    public final /* synthetic */ C2A A00;
    public final /* synthetic */ String A01;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C2018nB(C2A c2a, String str) {
        this.A00 = c2a;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                try {
                    Iterator<String> itKeys = this.A00.A02.A05().keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (this.A00.A0J(this.A01)) {
                            this.A00.A0E((C03952g) this.A00.A02.A05().get(next), next, next.equals(this.A01));
                        }
                    }
                    this.A00.A02.A06();
                    this.A00.A08();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e) {
            C8Z c8zA08 = this.A00.A03.A08();
            String encryptedId = A01(0, 17, 22);
            c8zA08.AAu(encryptedId, AbstractC05418a.A1B, new C05428b(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            C8Z c8zA09 = this.A00.A03.A08();
            String encryptedId2 = A01(0, 17, 22);
            c8zA09.AAu(encryptedId2, AbstractC05418a.A1A, new C05428b(e2));
        }
    }
}
