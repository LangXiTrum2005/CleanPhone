package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2039cT implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ KE A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-58, -63, -63, -66, -76, -77, -60};
    }

    public ViewOnClickListenerC2039cT(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0M) {
                this.A00.A0K.A02(A00(0, 7, 17));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
