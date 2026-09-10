package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1552Mt {
    public static byte[] A04;
    public InterfaceC1550Mr A00;
    public final C2300gi A01;
    public final VA A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract EnumC1549Mq A0G(String str);

    public AbstractC1552Mt(C2300gi c2300gi, VA va, String str) {
        this.A01 = c2300gi;
        this.A02 = va;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, 125);
    }

    public static String A0C(AbstractC1552Mt abstractC1552Mt) {
        if (abstractC1552Mt instanceof AnonymousClass84) {
            return A0B(6, 10, 122);
        }
        return A0B(0, 6, 79);
    }

    public final InterfaceC1550Mr A0E() {
        return this.A00;
    }

    public final void A0F(InterfaceC1550Mr interfaceC1550Mr) {
        this.A00 = interfaceC1550Mr;
    }
}
