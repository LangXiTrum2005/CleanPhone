package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class MI implements InterfaceC1842Yi {
    public static byte[] A0D;
    public int A00;
    public C1347Eu A01;
    public C4L A02;
    public String A03;
    public final C2300gi A04;
    public final VA A05;
    public final InterfaceC1841Yh A06;
    public final ZP A07;
    public final C1337Ek A08;
    public final E2 A0C = new E2() { // from class: com.facebook.ads.redexgen.X.6d
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i2, int i3, int i4) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{115, 108, 97, 96, 106, 76, 107, 113, 96, 119, 118, 113, 108, 113, 100, 105, 64, 115, 96, 107, 113};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(E3 e3) {
            this.A00.A06.A4k(A00(0, 21, 63), e3);
        }
    };
    public final E4 A0B = new E4() { // from class: com.facebook.ads.redexgen.X.6a
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i2, int i3, int i4) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 120);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{38, 57, 52, 53, 63, 25, 62, 36, 53, 34, 35, 36, 57, 36, 49, 60, 21, 38, 53, 62, 36};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C4B c4b) {
            this.A00.A06.A4k(A00(0, 21, 40), c4b);
        }
    };
    public final EA A09 = new EA() { // from class: com.facebook.ads.redexgen.X.6Z
        public static byte[] A01;
        public static String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};

        public static String A00(int i2, int i3, int i4) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                int i6 = bArrCopyOfRange[i5] ^ i4;
                if (A02[2].charAt(8) != '5') {
                    throw new RuntimeException();
                }
                A02[5] = "7KI0j9KfVtSFY3dF";
                bArrCopyOfRange[i5] = (byte) (i6 ^ 70);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{3, 28, 17, 16, 26, 60, 27, 1, 16, 7, 6, 1, 28, 1, 20, 25, 48, 3, 16, 27, 1};
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C4K c4k) {
            this.A00.A06.A4k(A00(0, 21, 51), c4k);
        }
    };
    public final E8 A0A = new E8() { // from class: com.facebook.ads.redexgen.X.6Y
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(E9 e9) {
            this.A00.A07.ADv();
        }
    };

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, 61, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, 20, 18, 4, 47, 0, 21, 8, 23, 4, 34, 21, 0, 35, 20, 21, 21, 14, 15, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, 64, 64, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, 63, 32, 45, 44, 38, 28, 27, 5};
    }

    public MI(C2300gi c2300gi, ZP zp, VA va, InterfaceC1841Yh interfaceC1841Yh) {
        this.A04 = c2300gi;
        this.A05 = va;
        this.A07 = zp;
        this.A08 = new C1337Ek(c2300gi);
        this.A08.A0f(new C10763q(c2300gi));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = interfaceC1841Yh;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC1841Yh.A45(this.A08, layoutParams);
        C1849Yp closeButton = new C1849Yp(c2300gi);
        closeButton.setOnClickListener(new ZN(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC1841Yh.A45(closeButton, params);
    }

    public final void A04(int i2) {
        this.A08.setVideoProgressReportIntervalMs(i2);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AAu(Intent intent, Bundle bundle, C1662Re c1662Re) {
        String ctaText = A02(8, 11, 127);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C2136e3 c2136e3 = new C2136e3(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i2 = (int) (16.0f * XX.A02);
            layoutParams.setMargins(i2, i2, i2, i2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c2136e3.setOnClickListener(new ZO(this));
            this.A06.A45(c2136e3, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 119), 0);
        this.A02 = new C4L(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (C1750Up.A20(this.A04)) {
            this.A01 = new C1347Eu(this.A04, this.A05, this.A08, this.A03, false, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0a(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0e(EnumC2187et.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFA(boolean z2) {
        this.A06.A4k(A02(37, 21, 39), new E6());
        this.A08.A0X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFi(boolean z2) {
        this.A06.A4k(A02(37, 21, 39), new E5());
        if (!this.A08.A0o()) {
            this.A08.A0e(EnumC2187et.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void onDestroy() {
        this.A06.A4k(A02(37, 21, 39), new C1325Dy(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0j(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A08();
        }
        this.A08.A0b(1);
        this.A08.A0W();
    }
}
