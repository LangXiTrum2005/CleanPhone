package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2155eM {
    public ViewOnClickListenerC1498Kr A00;
    public final NN A01;
    public final NY A02;
    public final C1561Nd A03;
    public final C1570Nm A04;
    public final C2300gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C2155eM(C2300gi c2300gi, VA va, AbstractC2465jd abstractC2465jd) {
        this.A05 = c2300gi;
        this.A06 = new VI(abstractC2465jd.A2E(), va);
        this.A01 = abstractC2465jd.A28();
        this.A02 = abstractC2465jd.A29().A0I();
        this.A04 = abstractC2465jd.A2C();
        this.A03 = abstractC2465jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        C2000bq c2000bq = new C2000bq(this.A05, this.A01.A01(), true, false, false);
        c2000bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c2000bq.setAlignment(17);
        C1994bk c1994bk = new C1994bk(this.A05);
        YB.A0N(c1994bk, 0);
        c1994bk.setRadius(50);
        new LM(c1994bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1994bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c2000bq, layoutParams);
        if (viewOnClickListenerC1498Kr != null) {
            YB.A0J(viewOnClickListenerC1498Kr);
            linearLayout.addView(viewOnClickListenerC1498Kr, layoutParams);
            viewOnClickListenerC1498Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC1498Kr.getText())) {
                YB.A0H(viewOnClickListenerC1498Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C2370hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC2154eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC2154eL.A03;
        }
        return EnumC2154eL.A02;
    }

    public final Pair<EnumC2154eL, View> A03(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        View viewA01;
        this.A00 = viewOnClickListenerC1498Kr;
        EnumC2154eL enumC2154eLA02 = A02();
        switch (enumC2154eLA02) {
            case A03:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        VK.A04(viewA01, this.A06, VH.A0S);
        return new Pair<>(enumC2154eLA02, viewA01);
    }
}
