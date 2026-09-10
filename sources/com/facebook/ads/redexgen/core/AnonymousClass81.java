package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.widget.LinearLayout;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.81, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass81<NativeViewabilityLogger> implements InterfaceC2496k8 {
    public static byte[] A0J;
    public static String[] A0K = {"NhwOmA8H17maQr2Thm3XPPVG1xwEsLhZ", "rranxCubAcBFDRhPr2LDrxoK3htxcyeL", "LmhV8", "ZLGOK7uKxyyp5W3sNEqoBEODv8zXcPE1", "dNK0bBZMrDk2YJmjrhSzlk1RMTFmUAsD", "q33l17MPfjO0fzYSahPh7EE95Ux5x03H", "4VfBn9Mh4W5rafl7A4va0uDeREUgOp63", "NLrbv196ww605txiYhOndsfSQjY"};
    public static final String A0L;
    public N9 A00;
    public NA A01;
    public C2473jl A02;
    public C11787o A03;
    public AnonymousClass76 A04;
    public VA A05;
    public EnumC1774Vp A06;
    public InterfaceC1949b1 A07;
    public LV A08;
    public AnonymousClass62 A09;
    public AbstractC2244fo A0A;
    public C2245fp A0B;
    public String A0D;
    public final String A0I = UUID.randomUUID().toString();
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public final Y2 A0H = new Y2();
    public Boolean A0C = false;

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0J = new byte[]{28, 40, 38, -25, 31, 26, 28, 30, 27, 40, 40, 36, -25, 26, 29, 44, -25, 27, 26, 39, 39, 30, 43, -25, 28, 37, 34, 28, 36, 30, 29, -15, -30, -11, -15, -84, -27, -15, -22, -23, -21, -22, -36, -93, -82};
    }

    static {
        A0B();
        A0L = AnonymousClass81.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A09 != null && this.A03 != null && this.A03.A1g()) {
            this.A00.ADD(this, this.A09);
        }
        if (this.A00 != null) {
            boolean z2 = this.A0E;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "pcQhCrMOoUvf1wSUiS8eXhj7G6bioSrh";
            strArr[4] = "JWZBC7ZhFf7k7YrTz5pa22tV9NT1Mc4w";
            if (z2 && (this.A0F || !this.A0G)) {
                N9 n9 = this.A00;
                if (A0K[3].charAt(25) != 'G') {
                    A0K[3] = "irPj8aYnTZH6GsdLYSbTyVfXBLXHQnPh";
                    n9.ADD(this, this.A08);
                } else {
                    A0K[3] = "5PA9hoTjlgD01Tr6eTkR8jxCvDfXc2RO";
                    n9.ADD(this, this.A08);
                }
            }
        }
        this.A04.A0F().A4O(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i2, C1732Tx c1732Tx) {
        C2490k2 c2490k2 = new C2490k2(this);
        this.A09 = new AnonymousClass62(this.A04, this.A05, c2490k2, this.A03, A08(0, 31, 79), 2, this.A0H);
        this.A0A = new C2489k1(this);
        this.A0B = new C2245fp(this.A09, c1732Tx.A04(), c1732Tx.A09(), true, new WeakReference(this.A0A), this.A04);
        this.A0B.A0W(this.A03.A0m());
        this.A0B.A0X(this.A03.A0n());
        this.A09.setVisibility(0);
        this.A04.getResources();
        this.A09.setLayoutParams(new LinearLayout.LayoutParams(-1, i2));
        this.A09.AKD();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(C1732Tx c1732Tx, JSONObject jSONObject, EnumC1774Vp enumC1774Vp) {
        this.A0F = false;
        final C2475jn c2475jnA00 = C2475jn.A00(this.A04, jSONObject);
        this.A0D = c2475jnA00.A7O();
        if (AbstractC1556Mx.A06(this.A04, c2475jnA00, this.A05)) {
            this.A04.A0F().A52();
            this.A00.AEN(this, C1772Vm.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A07 = new AbstractC1522Lp() { // from class: com.facebook.ads.redexgen.X.82
            public static byte[] A02;
            public static String[] A03 = {"dvnbyrX9L5Wlup6c2JnWkpTYBAz3QIun", "ITj", "KqeTcLSx6Zay5vtxcnHqZ", "bGeXa7nDz1byFpBCq22utpLnb", "UYph9iPsD3jee8BOLuPQ6r57rjKJpmVb", "DfaYbRSw6X21pxGApii0qweOJ64z1eNB", "52vckdype7aS5lLwU46sLHF0XTMQAze7", "uuBWL9In1wjj"};

            public static String A00(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 105);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{67, 116, 116, 105, 116, 38, 99, 126, 99, 101, 115, 114, 111, 104, 97, 38, 103, 101, 114, 111, 105, 104, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 116, 112, 115, 118, 81, 74, 77, 85, 81, 65, 109, 64};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1949b1
            public final void ACz() {
                this.A00.A0F = true;
                if (this.A00.A0G) {
                    this.A00.A0A();
                }
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1522Lp, com.facebook.ads.redexgen.core.InterfaceC1949b1
            public final void ADN(String str, Map<String, String> map) {
                C1564Ng c1564NgA2A;
                this.A00.A04.A0F().A4P();
                Uri uriA00 = XB.A00(str);
                map.put(A00(22, 10, 125), AdPlacementType.BANNER.name());
                map.put(A00(36, 8, 77), this.A00.A0I);
                AnonymousClass76 anonymousClass76 = this.A00.A04;
                VA va = this.A00.A05;
                String strA7O = c2475jnA00.A7O();
                if (this.A00.A03 == null) {
                    c1564NgA2A = null;
                } else {
                    AnonymousClass81 anonymousClass81 = this.A00;
                    if (A03[7].length() == 4) {
                        throw new RuntimeException();
                    }
                    A03[2] = "7FoTEC4l3Pv3ceMVIqf";
                    c1564NgA2A = anonymousClass81.A03.A2A();
                }
                AbstractC1552Mt adAction = C1553Mu.A00(anonymousClass76, va, strA7O, uriA00, map, c1564NgA2A);
                EnumC1549Mq enumC1549MqA0G = EnumC1549Mq.A09;
                if (adAction != null) {
                    try {
                        this.A00.A04.A0F().A4M();
                        enumC1549MqA0G = adAction.A0G(null);
                    } catch (Exception e2) {
                        Log.e(AnonymousClass81.A0L, A00(0, 22, 111), e2);
                    }
                }
                if (A00(32, 4, 123).equals(uriA00.getScheme()) && C1553Mu.A04(uriA00.getAuthority()) && this.A00.A00 != null && enumC1549MqA0G != EnumC1549Mq.A06) {
                    this.A00.A00.ADC(this.A00);
                }
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1949b1
            public final void AEA() {
                this.A00.A04.A0F().A4Q(this.A00.A02 != null);
                if (this.A00.A02 != null) {
                    this.A00.A02.A03();
                }
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1949b1
            public final void AF8() {
                this.A00.A04.A0F().A4S();
                this.A00.A02.A09();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1949b1
            public final void AGg() {
            }
        };
        this.A08 = new LV(this.A04, (WeakReference<InterfaceC1949b1>) new WeakReference(this.A07), c1732Tx.A04(), A7O());
        this.A08.A0L(c1732Tx.A07(), c1732Tx.A08());
        N4 impressionHelper = new C2488k0(this);
        this.A02 = new C2473jl(this.A04, this.A05, this.A08, this.A08.getViewabilityChecker(), impressionHelper, enumC1774Vp);
        this.A02.A0A(c2475jnA00);
        this.A08.loadDataWithBaseURL(AbstractC1952b4.A01(AdInternalSettings.getUrlPrefix()), c2475jnA00.A04(), A08(31, 9, 19), A08(40, 5, 12), null);
        this.A0E = true;
        A0A();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053 A[PHI: r1
  0x0053: PHI (r1v13 int) = (r1v10 int), (r1v17 int) binds: [B:20:0x0079, B:12:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0G(EnumC1774Vp enumC1774Vp, C1732Tx c1732Tx) {
        int i2;
        int bannerHeight;
        if (this.A03 != null) {
            VA va = this.A05;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "0asQ5nS3mEJJFXqECkaJp8czAINd5ojj";
            strArr[4] = "wkfCN0fAVUFan65EWCqz3ffd3K2ZXjjS";
            if (va == null) {
                return;
            }
            int iA03 = enumC1774Vp.A03();
            if (A0K[3].charAt(25) != 'G') {
                A0K[5] = "7AAzPingpmVfFCqSXKHauNoNKo9Xv93Z";
                i2 = (int) (iA03 * Resources.getSystem().getDisplayMetrics().density);
                if (C1750Up.A2H(this.A04)) {
                    bannerHeight = SN.A0A(this.A03.A1H()) ? 1 : 0;
                }
                if (bannerHeight == 0) {
                    A0C(i2, c1732Tx);
                } else {
                    new SN(new C1706Sx(this.A04), this.A03.A1H(), this.A03.A10(), this.A03.A1D(), true, new C2492k4(this, i2, c1732Tx, this)).A0B();
                }
            }
            i2 = (int) (iA03 * Resources.getSystem().getDisplayMetrics().density);
            if (C1750Up.A2H(this.A04)) {
                if (SN.A0A(this.A03.A1H())) {
                }
            }
            if (bannerHeight == 0) {
                A0C(i2, c1732Tx);
            } else {
                new SN(new C1706Sx(this.A04), this.A03.A1H(), this.A03.A10(), this.A03.A1D(), true, new C2492k4(this, i2, c1732Tx, this)).A0B();
            }
            if (bannerHeight == 0) {
                A0C(i2, c1732Tx);
            } else {
                new SN(new C1706Sx(this.A04), this.A03.A1H(), this.A03.A10(), this.A03.A1D(), true, new C2492k4(this, i2, c1732Tx, this)).A0B();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.N1
    public final String A7O() {
        return this.A0D;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.N1
    public final AdPlacementType A8k() {
        if (C1750Up.A1A(this.A04)) {
            EnumC1774Vp enumC1774Vp = this.A06;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0K[0] = "gRyzGCsQg6apk2eHBZ3N290V4KDgGwY2";
            if (enumC1774Vp != null && this.A06 == EnumC1774Vp.A09) {
                return AdPlacementType.MEDIUM_RECTANGLE;
            }
        }
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2496k8
    public final void AAt(AnonymousClass76 anonymousClass76, VA va, EnumC1774Vp enumC1774Vp, N9 n9, JSONObject jSONObject, C1732Tx c1732Tx) {
        anonymousClass76.A0F().A4N();
        this.A04 = anonymousClass76;
        this.A05 = va;
        this.A00 = n9;
        this.A06 = enumC1774Vp;
        this.A0G = C1750Up.A1o(this.A04.getApplicationContext());
        this.A03 = C11787o.A00(jSONObject, this.A04);
        if (this.A03.A1g()) {
            A0G(enumC1774Vp, c1732Tx);
        } else {
            A0F(c1732Tx, jSONObject, enumC1774Vp);
        }
        this.A01 = new NA(this.A04, this.A0I, this, n9);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        this.A04.A0F().A4L(this.A08 != null);
        if (this.A08 != null) {
            this.A08.destroy();
            this.A08 = null;
            this.A07 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}
