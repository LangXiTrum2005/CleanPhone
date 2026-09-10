package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2006bw implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1483Kc A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{66, 70, 74, 76, 78};
    }

    public ViewOnClickListenerC2006bw(C1483Kc c1483Kc) {
        this.A00 = c1483Kc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 46));
            if (((AbstractC2013c3) this.A00).A07.A0D() != null) {
                ((AbstractC2013c3) this.A00).A07.A0D().ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
