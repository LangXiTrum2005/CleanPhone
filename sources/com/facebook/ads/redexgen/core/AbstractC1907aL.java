package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1907aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1911aP A00(AbstractC2465jd abstractC2465jd) {
        if (abstractC2465jd.A2U()) {
            EnumC1911aP enumC1911aP = EnumC1911aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1911aP;
        }
        return EnumC1911aP.A03;
    }

    public static void A01(C2300gi c2300gi, EnumC1908aM enumC1908aM) {
        c2300gi.A0F().AAz(enumC1908aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C2300gi c2300gi, EnumC1908aM enumC1908aM) {
        c2300gi.A0F().AB9(enumC1908aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C2300gi c2300gi, EnumC1908aM enumC1908aM) {
        c2300gi.A0F().AC7(enumC1908aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C2300gi c2300gi, EnumC1908aM enumC1908aM) {
        A01(c2300gi, enumC1908aM);
    }

    public static void A05(C2300gi c2300gi, EnumC1908aM enumC1908aM) {
        A02(c2300gi, enumC1908aM);
    }

    public static void A06(C2300gi c2300gi, EnumC1908aM enumC1908aM) {
        A03(c2300gi, enumC1908aM);
    }

    public static void A07(VI vi, C2300gi c2300gi, InterfaceC1841Yh interfaceC1841Yh, AbstractC2465jd abstractC2465jd, EnumC1908aM enumC1908aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC2465jd.A2Q()) {
            c2300gi.A0F().AB8(enumC1908aM.name().toLowerCase(Locale.US));
        }
        if (abstractC2465jd.A2U()) {
            c2300gi.A0F().AAy(enumC1908aM.name().toLowerCase(Locale.US));
        }
        C1590Og c1590OgA00 = AbstractC1591Oh.A00(c2300gi.A02());
        C2296ge c2296geA02 = c2300gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (c1590OgA00.A0O(c2296geA02, true)) {
            if (interfaceC1841Yh != null) {
                interfaceC1841Yh.AAo(abstractC2465jd.A2E(), abstractC2465jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC2465jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c2300gi, XB.A00(abstractC2465jd.A2C().A00()), abstractC2465jd.A2E());
        }
    }
}
