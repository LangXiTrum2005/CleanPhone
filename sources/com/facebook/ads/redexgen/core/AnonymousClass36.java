package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.36, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass36 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    public static void A02(C1828k1 c1828k1, C05357t c05357t, C0898Mu c0898Mu) {
        c05357t.A0c(new C05337r(c0898Mu.A1e().A01(), C0757Hb.A04, C0757Hb.A04, c0898Mu.A0r(), A00(17, 14, 113)));
        boolean zA1F = c0898Mu.A1F();
        if (zA1F) {
            C05317p c05317p = new C05317p(c0898Mu.A0f(), c0898Mu.A0r(), A00(17, 14, 113));
            c05317p.A04 = true;
            c05317p.A03 = A00(0, 5, 66);
            c05357t.A0X(c05317p);
        }
        boolean isDSL = J3.A03();
        boolean zA2q = C05789m.A2q(c1828k1, isDSL);
        C05317p c05317p2 = new C05317p(c0898Mu.A1b().A0F().A09(), c0898Mu.A0r(), A00(17, 14, 113), c0898Mu.A1b().A0F().A06());
        if (zA1F && !zA2q) {
            c05357t.A0X(c05317p2);
        } else {
            c05357t.A0a(c05317p2);
        }
        c05357t.A0c(new C05337r(c0898Mu.A1b().A0F().A08(), AnonymousClass31.A00(c0898Mu.A1b().A0F()), AnonymousClass31.A01(c0898Mu.A1b().A0F()), c0898Mu.A0r(), A00(17, 14, 113)));
        Iterator<String> it = c0898Mu.A1b().A0I().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c05357t.A0c(new C05337r(url, -1, -1, c0898Mu.A0r(), A00(17, 14, 113)));
        }
    }

    public static void A03(C1828k1 c1828k1, C05357t c05357t, C0898Mu c0898Mu) {
        int i = 0;
        for (C2T c2t : c0898Mu.A1i()) {
            C05337r c05337r = new C05337r(c2t.A0F().A08(), AnonymousClass31.A00(c2t.A0F()), AnonymousClass31.A01(c2t.A0F()), c0898Mu.A0r(), A00(5, 12, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE));
            if (i == 0) {
                c05357t.A0b(c05337r);
            } else {
                c05357t.A0c(c05337r);
            }
            Iterator<String> it = c2t.A0I().A02().iterator();
            while (it.hasNext()) {
                c05357t.A0c(new C05337r(it.next(), -1, -1, c0898Mu.A0r(), A00(5, 12, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE)));
            }
            if (!TextUtils.isEmpty(c2t.A0F().A09())) {
                new C05317p(c2t.A0F().A09(), c0898Mu.A0r(), A00(5, 12, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE), c2t.A0F().A06()).A04 = false;
            }
            i++;
        }
    }
}
