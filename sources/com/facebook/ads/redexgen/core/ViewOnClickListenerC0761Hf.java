package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0761Hf implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0842Ki A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -25, -29, -26, -25, -12};
    }

    public ViewOnClickListenerC0761Hf(C0842Ki c0842Ki) {
        this.A00 = c0842Ki;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0J(A00(0, 6, 66));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
