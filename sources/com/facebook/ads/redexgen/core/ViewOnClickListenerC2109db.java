package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2109db implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass55 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{115, 104, 104, 107, 101, 102, 117};
    }

    public ViewOnClickListenerC2109db(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0D) {
                this.A00.A0t(A00(0, 7, 8));
                this.A00.A0Z.ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
