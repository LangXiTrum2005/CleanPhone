package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1828Xu implements InterfaceC2278gM {
    public static byte[] A02;
    public static String[] A03 = {"11yowYa9SjobATSyd4jbcYQKUh4edG44", "bHv0W2DtzV8d9jrYb9gmoc8MmzdN0fpB", "oW", "tKoi6cKGljbVocPn31APtwXZRyGd7igq", "ywmFCSl3Vn78B2eGXobUvwrScWlSo3bc", "aFROHHWcme9RokkBpAaOqFeveGyJeM2s", "QLtd5uCJprXFRqzwd31bhpzpUHhxzcVz", "aKhknuldK0UVZxwEW2ZbTGmFeUx0ymlu"};
    public final /* synthetic */ C2296ge A00;
    public final /* synthetic */ InterfaceC2276gK A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 80);
            if (A03[0].charAt(21) == 'R') {
                throw new RuntimeException();
            }
            A03[0] = "rnyHoYqJfuEUpW7gm8XbWdjDtWL8fGmk";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 102, 98, 119, 118, 113, 102, 92, 96, 108, 109, 101, 106, 100};
    }

    static {
        A01();
    }

    public C1828Xu(InterfaceC2276gK interfaceC2276gK, C2296ge c2296ge) {
        this.A01 = interfaceC2276gK;
        this.A00 = c2296ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2278gM
    public final void A4m() {
        try {
            C1750Up.A0V(this.A00).A37(this.A01.A7i().optJSONObject(A00(0, 14, 83)));
        } catch (JSONException e2) {
            this.A00.A08().A4I(e2);
        }
    }
}
