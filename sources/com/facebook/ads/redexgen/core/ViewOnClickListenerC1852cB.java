package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1852cB implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C6H A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, RemoteControlWriter.BLOCK_CMDDUMP, 77, 76, 70};
    }

    public ViewOnClickListenerC1852cB(C6H c6h) {
        this.A00 = c6h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 48));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
