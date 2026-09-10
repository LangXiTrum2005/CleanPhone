package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4T extends PJ {
    public static byte[] A0D;
    public static String[] A0E = {"tW3Su6P8GZp1yTngpwFy2DF2GhDzXnf2", "3HQabaXZCQWVf5CedpF1izNpaoU6B", "XHPkWVuaRS230ZzCiYR7qtQACoZnYKM5", "gQNAwnCobdMDtnebLpL2jf4350QwOymE", "dRJ3n5TbirTJDeON6upQokchUTJmTtSu", "43KhzPf8qbqk0SZtfSmXLCVXJtKHuuuO", "kYCENHGiqRDWZvuV9M2TmYzxFqbu31T5", "7NDfQDtGKt0HcNI2moZZTs031QkqKmSX"};
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC2465jd A03;
    public C1706Sx A04;
    public C1J A05;
    public C1993bj A06;
    public C1376Fy A07;
    public AbstractC2244fo A08;
    public C2245fp A09;
    public String A0A;
    public List<C2138e5> A0B;
    public final Y2 A0C;

    public static String A0E(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0G() {
        A0D = new byte[]{66, 71, 124, 71, 66, 87, 66, 124, 65, 86, 77, 71, 79, 70, 18, 5, 23, 1, 18, 4, 5, 4, 54, 9, 4, 5, 15, 33, 4, 36, 1, 20, 1, 34, 21, 14, 4, 12, 5, 118, 110, 108, 117};
    }

    static {
        A0G();
        A0G = (int) (XX.A02 * 48.0f);
        A0H = XV.A0v;
        A0I = (int) (XX.A02 * 8.0f);
        A0K = (int) (XX.A02 * 56.0f);
        A0F = (int) (XX.A02 * 48.0f);
        A0J = (int) (XX.A02 * 12.0f);
    }

    public C4T(C2300gi c2300gi, VA va, C1706Sx c1706Sx, InterfaceC1841Yh interfaceC1841Yh, AbstractC2465jd abstractC2465jd) {
        super(c2300gi, va, interfaceC1841Yh, abstractC2465jd);
        this.A0C = new Y2();
        if (abstractC2465jd instanceof C11757l) {
            super.A09 = true;
            super.A08 = new C2168ea(c2300gi, new MG(), this.A0D.A1G(), interfaceC1841Yh);
        }
        this.A04 = c1706Sx;
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private int A00() {
        return A0K + A0G + (A0H * 4) + (this.A0D.A2Q() ? A0F : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x006d  */
    public EnumC1549Mq A02(String str) {
        EnumC1549Mq enumC1549MqA0E = EnumC1549Mq.A09;
        if (this.A05 == null) {
            return enumC1549MqA0E;
        }
        C1J c1j = this.A05;
        C2370hr layoutManager = this.A05.getLayoutManager();
        String[] strArr = A0E;
        if (strArr[5].charAt(30) == strArr[6].charAt(30)) {
            throw new RuntimeException();
        }
        A0E[2] = "E32f1TaBN4dkj3FL0vDfikWnsbqL7SKY";
        FY fy = (FY) c1j.A1G(layoutManager.A25());
        if (fy != null && fy.A0p() != null) {
            enumC1549MqA0E = fy.A0p().A0E(str);
            C1979bV ctaActionHelper = fy.A0p().getCtaActionHelper();
            if (A0E[2].charAt(16) != '1') {
                String[] strArr2 = A0E;
                strArr2[5] = "i7TFLIHedh0buU6tWLTqbZ60SXZT8zmg";
                strArr2[6] = "DCWE7AKb21kTTjPuFVubbU6pDlTglIBY";
                if (ctaActionHelper.A06() == null) {
                    fy.A0p().getCtaActionHelper().A07(new C1358Ff(this));
                }
            } else {
                String[] strArr3 = A0E;
                strArr3[7] = "dI26cUvsILIVYWhCptAOIe9hx0G02LwU";
                strArr3[0] = "KP2PoUq36ksxZ0HlOf60WIRRhVJwRZXP";
                if (ctaActionHelper.A06() == null) {
                    fy.A0p().getCtaActionHelper().A07(new C1358Ff(this));
                }
            }
        }
        return enumC1549MqA0E;
    }

    private AbstractC2465jd A03(Intent intent) {
        if (super.A09) {
            return (AbstractC2465jd) intent.getSerializableExtra(A0E(14, 25, 103));
        }
        return (AbstractC2465jd) intent.getSerializableExtra(A0E(0, 14, 36));
    }

    private final void A0H() {
        if (this.A02 != null) {
            this.A02.removeAllViews();
            if (A0E[3].charAt(5) != 'n') {
                throw new RuntimeException();
            }
            A0E[4] = "3JPxSaqJUpKyt95G35P4gQJAerHutmpA";
            this.A02 = null;
        }
        if (this.A05 != null) {
            this.A05.removeAllViews();
            this.A05.A1S();
            this.A05 = null;
        }
        if (this.A06 != null) {
            this.A06.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0I(int i2, Bundle bundle) {
        int extraSpacing;
        int i3;
        int height;
        this.A02 = new LinearLayout(getContext());
        if (i2 == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i4 = XX.A04.widthPixels;
        int i5 = XX.A04.heightPixels;
        if (i2 == 1) {
            extraSpacing = Math.min(i4 - (A0H * 4), i5 / 2);
            i3 = (i4 - extraSpacing) / 8;
            height = i3 * 4;
        } else {
            extraSpacing = i5 - A00();
            i3 = A0H;
            height = i3 * 2;
        }
        this.A08 = new C1359Fg(this);
        this.A09 = new C2245fp(this, 1, new WeakReference(this.A08), this.A0E);
        this.A09.A0W(this.A00);
        this.A09.A0X(this.A01);
        this.A05 = new C1J(this.A0E);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new C1376Fy(this.A05, i2, this.A0B, this.A09, bundle);
        int extraSpacing2 = i3;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new C1367Fp(this.A0E, this.A0B, this.A03, this.A0F, this.A04, this.A09, this.A0C, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i2, this.A07, this.A0H));
        this.A05.A1h(this.A05.getOnScrollListener());
        if (i2 == 1) {
            A0K(this.A07);
        }
        this.A02.addView(this.A05);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (C1750Up.A1z(this.A0E)) {
            this.A0E.A0B().AKn(this.A05, this.A0D.A2E(), false);
        }
        A0f(this.A02, false, i2);
    }

    private void A0J(AbstractC2465jd abstractC2465jd) {
        this.A03 = abstractC2465jd;
        this.A0A = this.A03.A2E();
        this.A00 = this.A03.A0m();
        this.A01 = this.A03.A0n();
        List<NR> listA2G = this.A03.A2G();
        List<AdInfo> adInfoList = new ArrayList<>(listA2G.size());
        this.A0B = adInfoList;
        for (int i2 = 0; i2 < listA2G.size(); i2++) {
            NR nr = listA2G.get(i2);
            List<C2138e5> list = this.A0B;
            int i3 = listA2G.size();
            list.add(new C2138e5(i2, i3, nr));
        }
    }

    private void A0K(C1376Fy c1376Fy) {
        new C7N().A0G(this.A05);
        c1376Fy.A0Y(new C1357Fe(this));
        this.A06 = new C1993bj(this.A0E, super.A07.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final AbstractC1835Yb A0b() {
        return new FullScreenAdToolbar(this.A0E, getAudienceNetworkListener(), this.A0G, 0, this.A0D.A22(), false);
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final void A0d() {
        EnumC1549Mq enumC1549MqA02 = A02(A0E(39, 4, 2));
        if (this.A0D.A2N()) {
            return;
        }
        EnumC1549Mq actionOutcome = EnumC1549Mq.A09;
        if (enumC1549MqA02 != actionOutcome) {
            EnumC1549Mq actionOutcome2 = EnumC1549Mq.A06;
            if (enumC1549MqA02 != actionOutcome2) {
                A0m();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final boolean A0l() {
        return false;
    }

    public final void A0m() {
        if (this.A0H.getToolbarActionMode() == 8) {
            this.A0H.setToolbarActionMode(2);
        }
        this.A0D.A2K(false);
        this.A0D.A29().A0M(-1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AAu(Intent intent, Bundle bundle, C1662Re c1662Re) {
        AbstractC2465jd dataBundle = A03(intent);
        A0g(c1662Re);
        A0J(dataBundle);
        A0I(c1662Re.A05().getResources().getConfiguration().orientation, bundle);
        c1662Re.A0A(new C1356Fd(this, c1662Re));
        AbstractC2465jd dataBundle2 = this.A0D;
        int unskippableSec = dataBundle2.A29().A0H().A04();
        if (super.A09) {
            AbstractC2465jd dataBundle3 = this.A0D;
            unskippableSec = dataBundle3.A29().A0H().A03();
        }
        if (unskippableSec > 0) {
            A0e(unskippableSec);
        }
        AbstractC2465jd dataBundle4 = this.A0D;
        if (dataBundle4.A29().A0H().A02() >= 0) {
            this.A0H.setToolbarActionMode(8);
        }
        AbstractC2465jd dataBundle5 = this.A0D;
        if (dataBundle5.A2T()) {
            this.A0H.setOnClickListener(new ViewOnClickListenerC2142e9(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFA(boolean z2) {
        super.AFA(z2);
        if (this.A07 != null) {
            this.A07.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFi(boolean z2) {
        super.AFi(z2);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AIv(Bundle bundle) {
        if (this.A07 != null) {
            this.A07.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AIv(bundle);
        A0H();
        A0I(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void onDestroy() {
        super.onDestroy();
        if (C1750Up.A1z(this.A0E)) {
            this.A0E.A0B().AKU(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            this.A0F.AB7(this.A0A, new C1957b9().A03(this.A09).A02(this.A0C).A05());
        }
        A0H();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0C.A06(this.A0E, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
