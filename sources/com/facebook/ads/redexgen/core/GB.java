package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class GB extends FrameLayout implements InterfaceC1842Yi {
    public static String[] A0F = {"", "W4Q5rze9OaCj8zYeEqMqJDKHVn1jlwCj", "tfMK6ikBUwqELtuMuu5Kubqydzlt1dTF", "vHKgDETdn9HfwlFLESHxJfcBT5o8ovHI", "7Mubz7OjQQHbSYG", "T8sk6PPloyPWHv5iczs8jf8QHRZ1ZSou", "3ZCO1Nznw11DnI4nXgj4IK6CNfFIYy0N", "YX"};
    public static final RelativeLayout.LayoutParams A0G = new RelativeLayout.LayoutParams(-1, -1);
    public C1662Re A00;
    public InterfaceC1842Yi A01;
    public Intent A02;
    public Bundle A03;
    public InterfaceC1842Yi A04;
    public final AbstractC2465jd A05;
    public final AbstractC2465jd A06;
    public final C1572No A07;
    public final C2300gi A08;
    public final VA A09;
    public final WK A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC1831Xx A0B;
    public final InterfaceC1841Yh A0C;
    public final ZU A0D;
    public final boolean A0E;

    public GB(C2300gi c2300gi, VA va, AbstractC2465jd abstractC2465jd, AbstractC2465jd abstractC2465jd2, InterfaceC1841Yh interfaceC1841Yh, C1662Re c1662Re, WK wk) {
        super(c2300gi);
        this.A08 = c2300gi;
        this.A09 = va;
        this.A06 = abstractC2465jd;
        this.A05 = abstractC2465jd2;
        this.A07 = this.A05.A29().A0H().A07();
        this.A0C = interfaceC1841Yh;
        this.A0B = new ViewOnSystemUiVisibilityChangeListenerC1831Xx(this);
        this.A0B.A05(EnumC1830Xw.A02);
        this.A0A = wk;
        if (this.A0A == WK.A0J) {
            this.A0D = new MG();
        } else {
            this.A0D = new MH();
        }
        boolean z2 = false;
        if (this.A07 != null) {
            if (this.A07.A0b() && this.A05.A1n()) {
                z2 = true;
            }
            this.A0E = z2;
            return;
        }
        this.A0E = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1842Yi A05(ZU zu, C1572No c1572No, Boolean bool) {
        if (bool.booleanValue()) {
            return new MW(this.A08, this.A09, this.A0C, this.A05, c1572No, this.A05.A1G(), zu);
        }
        return new NO(this.A08, this.A09, this.A0C, this.A05, this.A05.A1G(), zu, true);
    }

    private C4V A0A() {
        if (this.A07 != null) {
            this.A06.A1R(this.A07.A0X());
            this.A06.A1S(this.A07.A0c());
        }
        C4V c4v = new C4V(this.A08, this.A0D, this.A09, this.A06, new C1706Sx(this.A08), this.A0C);
        c4v.setVideoLeadingPlayableAdListener(new GD(this));
        return c4v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A04 != null) {
            this.A04.onDestroy();
            if (this.A04 instanceof View) {
                ((View) this.A04).setVisibility(8);
                removeView((View) this.A04);
            }
        }
    }

    private final void A0C(Intent intent, Bundle bundle, C1662Re c1662Re) {
        this.A04 = A0A();
        this.A04.AAu(intent, bundle, c1662Re);
        if (this.A0E && this.A07 != null) {
            this.A01 = A05(this.A0D, this.A07, Boolean.valueOf(this.A05.A1n()));
            this.A01.AAu(intent, bundle, c1662Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AAu(Intent intent, Bundle bundle, C1662Re c1662Re) {
        this.A02 = intent;
        this.A03 = bundle;
        this.A00 = c1662Re;
        this.A0C.A45(this, A0G);
        A0C(intent, bundle, c1662Re);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFA(boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFi(boolean z2) {
        if (this.A04 instanceof MW) {
            InterfaceC1842Yi interfaceC1842Yi = this.A04;
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "";
            strArr2[4] = "sBQPYruyJOWbMZu";
            interfaceC1842Yi.AFi(z2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AIv(Bundle bundle) {
    }

    public InterfaceC1842Yi getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public String getCurrentClientToken() {
        return this.A06.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        if (this.A04 != null) {
            this.A04.onActivityResult(i2, i3, intent);
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A04 instanceof MW) {
            ((MW) this.A04).onConfigurationChanged(configuration);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void onDestroy() {
    }

    public void setListener(InterfaceC1841Yh interfaceC1841Yh) {
    }
}
