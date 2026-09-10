package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2005bv implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"OcC8Yw10ta4EzUHryW8qF9f8Kw9JuvuB", "8f8LYzxOMmLQdsAhKRfNVONBERHkcGt2", "CzyGp", "2PtxVvqYppmcLS4cwbsjetyeZ5i3nCKD", "x35AdtEajADMGuwsONv03k5bW5eRm", "TNmYMyEiRrCRNh2BAihsQXhXdDRTY", "KzXNDxf0CUBsvqnb9B4FND8KZCDQkeqp", "bZ2905qMAeosph8FN3SjH9j5ipegj0aG"};
    public final /* synthetic */ C1483Kc A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 58, 54, 48, 50};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC2005bv(C1483Kc c1483Kc) {
        this.A00 = c1483Kc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 85));
            if (((AbstractC2013c3) this.A00).A07.A0D() != null) {
                ((AbstractC2013c3) this.A00).A07.A0D().ACQ();
            }
        } catch (Throwable th) {
            if (A02[1].charAt(21) != 'O') {
                throw new RuntimeException();
            }
            A02[2] = "i9GBCPULPHC1kq3f4RL3YMSEVPUJV";
            WU.A00(th, this);
        }
    }
}
