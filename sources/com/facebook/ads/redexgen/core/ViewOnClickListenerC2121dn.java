package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2121dn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C11094x A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 42, 46, 43, 42, 61};
    }

    public ViewOnClickListenerC2121dn(C11094x c11094x) {
        this.A00 = c11094x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00 != null) {
                this.A00.A00.A1B(A00(0, 6, 53));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
