package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0660Di implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"JeM6kmZAAg", "yJwYoPJztMSqfbMPjoq6sPzsNl0d2Qkw", "1vq6MwLSZBl2WPzhpozbGLZi9rrad1f9", "vjzuY9RuACrmk67MWB8bQQLqhnnjvlnw", "kHeV6GAm5S3szdTA016nUt4W7GUOLctP", "rR76lLTsWYWDKlm4eMbeJOmHt8WwoEDS", "9YmMINBhFsFgZ71fMaPUEV5EHdzCcqYn", "A0SJ2dkt1ZSdfCokN2Yc1r5dcbPSTFSd"};
    public final /* synthetic */ C0872Ln A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 31;
            if (A02[5].charAt(14) != 'm') {
                throw new RuntimeException();
            }
            A02[1] = "mB4Y7S7yqXGV2GUhso5SlG9iabxazBAS";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 5, 8, 9, 3, 60, 0, cw.k, 21, cw.l, cw.k, cw.m, 7, 41, 30, 30, 3, 30};
    }

    static {
        A01();
    }

    public RunnableC0660Di(C0872Ln c0872Ln) {
        this.A00 = c0872Ln;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A06.A0d(10);
            ((AbstractC0659Dh) this.A00.A00).A01.A0F().A3Q(A00(0, 18, 115));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
