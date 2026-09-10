package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1857Yx implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"JeM6kmZAAg", "yJwYoPJztMSqfbMPjoq6sPzsNl0d2Qkw", "1vq6MwLSZBl2WPzhpozbGLZi9rrad1f9", "vjzuY9RuACrmk67MWB8bQQLqhnnjvlnw", "kHeV6GAm5S3szdTA016nUt4W7GUOLctP", "rR76lLTsWYWDKlm4eMbeJOmHt8WwoEDS", "9YmMINBhFsFgZ71fMaPUEV5EHdzCcqYn", "A0SJ2dkt1ZSdfCokN2Yc1r5dcbPSTFSd"};
    public final /* synthetic */ C11526o A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] ^ i4) ^ 31;
            if (A02[5].charAt(14) != 'm') {
                throw new RuntimeException();
            }
            A02[1] = "mB4Y7S7yqXGV2GUhso5SlG9iabxazBAS";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 5, 8, 9, 3, 60, 0, 13, 21, 14, 13, 15, 7, 41, 30, 30, 3, 30};
    }

    static {
        A01();
    }

    public RunnableC1857Yx(C11526o c11526o) {
        this.A00 = c11526o;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A06.A0b(10);
            ((AbstractC1600Oq) this.A00.A00).A08.A0F().A3a(A00(0, 18, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
