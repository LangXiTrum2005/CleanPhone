package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1738aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1742aP A00(AbstractC2296jd abstractC2296jd) {
        if (abstractC2296jd.A2U()) {
            EnumC1742aP enumC1742aP = EnumC1742aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1742aP;
        }
        return EnumC1742aP.A03;
    }

    public static void A01(C2131gi c2131gi, EnumC1739aM enumC1739aM) {
        c2131gi.A0F().AAz(enumC1739aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C2131gi c2131gi, EnumC1739aM enumC1739aM) {
        c2131gi.A0F().AB9(enumC1739aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C2131gi c2131gi, EnumC1739aM enumC1739aM) {
        c2131gi.A0F().AC7(enumC1739aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C2131gi c2131gi, EnumC1739aM enumC1739aM) {
        A01(c2131gi, enumC1739aM);
    }

    public static void A05(C2131gi c2131gi, EnumC1739aM enumC1739aM) {
        A02(c2131gi, enumC1739aM);
    }

    public static void A06(C2131gi c2131gi, EnumC1739aM enumC1739aM) {
        A03(c2131gi, enumC1739aM);
    }

    public static void A07(VI vi, C2131gi c2131gi, InterfaceC1672Yh interfaceC1672Yh, AbstractC2296jd abstractC2296jd, EnumC1739aM enumC1739aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC2296jd.A2Q()) {
            c2131gi.A0F().AB8(enumC1739aM.name().toLowerCase(Locale.US));
        }
        if (abstractC2296jd.A2U()) {
            c2131gi.A0F().AAy(enumC1739aM.name().toLowerCase(Locale.US));
        }
        C1421Og c1421OgA00 = AbstractC1422Oh.A00(c2131gi.A02());
        C2127ge c2127geA02 = c2131gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (c1421OgA00.A0O(c2127geA02, true)) {
            if (interfaceC1672Yh != null) {
                interfaceC1672Yh.AAo(abstractC2296jd.A2E(), abstractC2296jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC2296jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c2131gi, XB.A00(abstractC2296jd.A2C().A00()), abstractC2296jd.A2E());
        }
    }
}
