package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class FR {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1e] */
    public static C03671e A00(final C0727Fx c0727Fx, final C1744ie c1744ie, final String str, final C0863Ld c0863Ld) {
        final boolean z = true;
        return new LU(c0727Fx, c1744ie, z, str, c0863Ld) { // from class: com.facebook.ads.redexgen.X.1e
            public ViewOnClickListenerC1617gW A00;
            public C0758Hc A01;
            public final A7 A02 = this.A0I.A05().A02().A0A();
            public final C1744ie A03;
            public final C0863Ld A04;
            public final String A05;
            public static String[] A06 = {CampaignEx.JSON_KEY_AD_Q, "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (CP.A02 * (-4.0f));
            public static final int A07 = (int) (CP.A02 * 6.0f);

            {
                this.A03 = c1744ie;
                this.A05 = str;
                this.A04 = c0863Ld;
                this.A03.A1L(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1574fo
            public void setupNativeCtaExtension(C0758Hc c0758Hc) {
                C03962h c03962hA1c;
                this.A01 = c0758Hc;
                int iA0P = C05789m.A0P(this.A0I.A05());
                C03912c c03912cA01 = this.A03.A10().A1a().A01();
                C1828k1 c1828k1A05 = this.A0I.A05();
                String strA0e = this.A03.A10().A0e();
                A7 a7 = this.A02;
                DR dummyListener = C0703Ez.getDummyListener();
                JL jlA0b = this.A04.A0b();
                C0647Cv c0647CvA1A = this.A03.A1A();
                if (this.A03.A10() == null) {
                    c03962hA1c = null;
                } else {
                    c03962hA1c = this.A03.A10().A1c();
                }
                this.A00 = new ViewOnClickListenerC1617gW(c1828k1A05, strA0e, c03912cA01, a7, dummyListener, jlA0b, c0647CvA1A, c03962hA1c);
                this.A00.setCta(c0758Hc.A03().A0H(), this.A05, new HashMap());
                this.A03.A1L(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0P == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    D3.A0N(this.A00, A07, 5, c03912cA01.A0A(false));
                    ((LU) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (iA0P == 2) {
                    layoutParams.addRule(3, ((LU) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((LU) this).A06.bringToFront();
                }
            }
        };
    }
}
