package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1986eM {
    public ViewOnClickListenerC1329Kr A00;
    public final NN A01;
    public final NY A02;
    public final C1392Nd A03;
    public final C1401Nm A04;
    public final C2131gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C1986eM(C2131gi c2131gi, VA va, AbstractC2296jd abstractC2296jd) {
        this.A05 = c2131gi;
        this.A06 = new VI(abstractC2296jd.A2E(), va);
        this.A01 = abstractC2296jd.A28();
        this.A02 = abstractC2296jd.A29().A0I();
        this.A04 = abstractC2296jd.A2C();
        this.A03 = abstractC2296jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC1329Kr viewOnClickListenerC1329Kr) {
        C1831bq c1831bq = new C1831bq(this.A05, this.A01.A01(), true, false, false);
        c1831bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c1831bq.setAlignment(17);
        C1825bk c1825bk = new C1825bk(this.A05);
        YB.A0N(c1825bk, 0);
        c1825bk.setRadius(50);
        new LM(c1825bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1825bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1831bq, layoutParams);
        if (viewOnClickListenerC1329Kr != null) {
            YB.A0J(viewOnClickListenerC1329Kr);
            linearLayout.addView(viewOnClickListenerC1329Kr, layoutParams);
            viewOnClickListenerC1329Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC1329Kr.getText())) {
                YB.A0H(viewOnClickListenerC1329Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C2201hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC1985eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1985eL.A03;
        }
        return EnumC1985eL.A02;
    }

    public final Pair<EnumC1985eL, View> A03(ViewOnClickListenerC1329Kr viewOnClickListenerC1329Kr) {
        View viewA01;
        this.A00 = viewOnClickListenerC1329Kr;
        EnumC1985eL enumC1985eLA02 = A02();
        switch (enumC1985eLA02) {
            case A03:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        VK.A04(viewA01, this.A06, VH.A0S);
        return new Pair<>(enumC1985eLA02, viewA01);
    }
}
