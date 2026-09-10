package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2060co implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1463Ji A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 19, 31, 25, 27};
    }

    public ViewOnClickListenerC2060co(C1463Ji c1463Ji) {
        this.A00 = c1463Ji;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0p(A00(0, 5, 62));
            if (this.A00.A0b.A0D() != null) {
                this.A00.A0b.A0D().ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
