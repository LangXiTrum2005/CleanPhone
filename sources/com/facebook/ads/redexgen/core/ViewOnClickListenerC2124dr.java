package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2124dr implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4V A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{89, 84, 80, 85, 84, 67};
    }

    public ViewOnClickListenerC2124dr(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 != null) {
                this.A00.A02.A1B(A00(0, 6, 24));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
