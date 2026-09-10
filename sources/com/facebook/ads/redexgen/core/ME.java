package com.facebook.ads.redexgen.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ME extends AbstractC1863Zd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (XX.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C1590Og A01;
    public final C2300gi A02;

    public ME(C2300gi c2300gi, VA va, String str, C1570Nm c1570Nm, InterfaceC1842Yi interfaceC1842Yi, InterfaceC1841Yh interfaceC1841Yh) {
        super(c2300gi, va, str, c1570Nm, interfaceC1842Yi, interfaceC1841Yh);
        this.A02 = c2300gi;
        this.A01 = AbstractC1591Oh.A00(c2300gi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        YB.A0N(this.A00, -1728053248);
        if (C1750Up.A2b(c2300gi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z2 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final void A0O() {
        C1594Ok c1594OkA0A = this.A01.A0A();
        C1878Zs c1878Zs = new C1878Zs(this.A02);
        c1878Zs.setInfo(YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c1878Zs.setOnClickListener(new ViewOnClickListenerC1869Zj(this));
        C1594Ok c1594OkA0B = this.A01.A0B();
        C1878Zs c1878Zs2 = new C1878Zs(this.A02);
        c1878Zs2.setInfo(YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c1878Zs2.setOnClickListener(new ViewOnClickListenerC1870Zk(this));
        C1878Zs c1878Zs3 = new C1878Zs(this.A02);
        c1878Zs3.setInfo(YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c1878Zs3.setOnClickListener(new ViewOnClickListenerC1871Zl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        YB.A0N(linearLayout, -1);
        if (!c1594OkA0A.A05().isEmpty()) {
            linearLayout.addView(c1878Zs, itemParams);
        }
        if (!c1594OkA0B.A05().isEmpty()) {
            linearLayout.addView(c1878Zs2, itemParams);
        }
        linearLayout.addView(c1878Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final void A0P() {
        this.A00.removeAllViews();
        YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final void A0Q(C1594Ok c1594Ok, EnumC1592Oi enumC1592Oi) {
        String strA0E;
        int i2;
        String strA01;
        if (enumC1592Oi == EnumC1592Oi.A05) {
            return;
        }
        boolean z2 = enumC1592Oi == EnumC1592Oi.A06;
        C1860Za c1860Za = new C1860Za(this.A02, this.A0D);
        if (z2) {
            C1590Og c1590Og = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            strA0E = c1590Og.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        C1860Za c1860ZaA0D = c1860Za.A0H(strA0E).A0G(this.A01.A0D()).A0E(c1594Ok.A04()).A0D(z2 ? YM.REPORT_AD : YM.HIDE_AD);
        if (z2) {
            i2 = -552389;
        } else {
            i2 = -13272859;
        }
        C1860Za c1860ZaA0C = c1860ZaA0D.A0C(i2);
        if (this.A0C != null) {
            C1570Nm c1570Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                strA01 = c1570Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                strA01 = c1570Nm.A01();
            }
        } else {
            strA01 = "";
        }
        C1861Zb adHiddenView = c1860ZaA0C.A0F(strA01).A0L();
        YB.A0N(adHiddenView, -1);
        YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c1594Ok, enumC1592Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final void A0R(C1594Ok c1594Ok, EnumC1592Oi enumC1592Oi) {
        String strA0H;
        boolean z2 = enumC1592Oi == EnumC1592Oi.A06;
        C2300gi c2300gi = this.A02;
        InterfaceC1865Zf interfaceC1865Zf = this.A0D;
        if (z2) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        C1881Zv c1881Zv = new C1881Zv(c2300gi, c1594Ok, interfaceC1865Zf, strA0H, z2 ? YM.REPORT_AD : YM.HIDE_AD);
        c1881Zv.setClickable(true);
        YB.A0N(c1881Zv, -1);
        c1881Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c1881Zv, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1863Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A54();
    }
}
