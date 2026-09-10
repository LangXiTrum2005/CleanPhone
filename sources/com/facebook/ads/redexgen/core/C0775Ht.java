package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0775Ht {
    public ViewOnClickListenerC1617gW A00;
    public final C2P A01;
    public final C03892a A02;
    public final C03932e A03;
    public final C04022n A04;
    public final C1828k1 A05;
    public final AF A06;
    public static final int A09 = (int) (CP.A02 * 4.0f);
    public static final int A07 = (int) (CP.A02 * 72.0f);
    public static final int A08 = (int) (CP.A02 * 8.0f);

    public C0775Ht(C1828k1 c1828k1, A7 a7, AbstractC1984md abstractC1984md) {
        this.A05 = c1828k1;
        this.A06 = new AF(abstractC1984md.A1g(), a7);
        this.A01 = abstractC1984md.A1a();
        this.A02 = abstractC1984md.A1b().A0G();
        this.A04 = abstractC1984md.A1e();
        this.A03 = abstractC1984md.A1b().A0I();
    }

    private View A00(ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        C0715Fl c0715Fl = new C0715Fl(this.A05, this.A01.A01(), true, false, false);
        c0715Fl.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c0715Fl.setAlignment(17);
        C0709Ff c0709Ff = new C0709Ff(this.A05);
        D3.A0K(c0709Ff, 0);
        c0709Ff.setRadius(50);
        new AsyncTaskC1623gc(c0709Ff, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c0709Ff, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c0715Fl, layoutParams);
        if (viewOnClickListenerC1617gW != null) {
            D3.A0H(viewOnClickListenerC1617gW);
            linearLayout.addView(viewOnClickListenerC1617gW, layoutParams);
            if (TextUtils.isEmpty(viewOnClickListenerC1617gW.getText())) {
                D3.A0F(viewOnClickListenerC1617gW);
            }
        }
        return linearLayout;
    }

    private MG A01() {
        MG mg = new MG(this.A05);
        mg.setLayoutManager(new C1900lC(this.A05, 0, false));
        mg.setAdapter(new C1378cc(this.A05, this.A03.A02(), A09, this.A00));
        return mg;
    }

    private final EnumC0774Hs A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC0774Hs.A03;
        }
        return EnumC0774Hs.A02;
    }

    public final Pair<EnumC0774Hs, View> A03(ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        View viewA01;
        this.A00 = viewOnClickListenerC1617gW;
        EnumC0774Hs enumC0774HsA02 = A02();
        switch (C0773Hr.A00[enumC0774HsA02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        AH.A04(viewA01, this.A06, AE.A0S);
        return new Pair<>(enumC0774HsA02, viewA01);
    }
}
