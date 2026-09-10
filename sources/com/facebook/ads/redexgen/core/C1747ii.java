package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1747ii extends JK {
    public static String[] A04 = {"hBf0w5eWi1Spl1ubHLZPwgySyKwDkFls", "R1QfRDzVW3llag6pkWHTLJyFxLfuZYUb", "hIMvI", "VChjXPEjBKz9WEtkkyfZeEDOAtDm6pyS", "ZAoFS", "FLKekHrPvHjWwOMiUj748H2wUl", "P5m22x1ZKo3VUkYY2cMyPktUJxi7JgjH", "Nk3fSWmW4cxCKGmv1zm92qMESviF4Rnt"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C2002mv A01;
    public final /* synthetic */ C1744ie A02;
    public final /* synthetic */ boolean A03;

    public C1747ii(C1744ie c1744ie, View view, boolean z, C2002mv c2002mv) {
        this.A02 = c1744ie;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c2002mv;
    }

    @Override // com.facebook.ads.redexgen.core.JK
    public final void A00() {
        this.A02.A0e.A06();
    }

    @Override // com.facebook.ads.redexgen.core.JK
    public final void A02() {
        this.A02.A0e.A0A();
    }

    @Override // com.facebook.ads.redexgen.core.JK
    public final void A03() {
        this.A02.A0e.A0B();
        if (C05789m.A29(this.A02.A12()) && (this.A00 instanceof AdNativeComponentView)) {
            View adContentsView = ((AdNativeComponentView) this.A00).getAdContentsView();
            if ((adContentsView instanceof IM) && !((IM) adContentsView).A05()) {
                this.A02.A0R.A0T();
                this.A02.A0e.A08();
                return;
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            Drawable drawable = this.A02.A01;
            if (drawable == null) {
                this.A02.A0R.A0T();
                this.A02.A0e.A07();
                return;
            }
            C1744ie.A0f(drawable, imageView);
        }
        this.A02.A0e.A0C(this.A02.A0c, this.A01.A0G());
        if (this.A02.A0R != null) {
            this.A02.A0R.A0V();
        }
        if (this.A02.A0V != null && this.A02.A0V.get() != null) {
            ((JK) this.A02.A0V.get()).A03();
        }
        if (this.A02.A0f.A07()) {
            this.A02.A0e.A04();
            return;
        }
        this.A02.A0c();
        if (this.A02.A09 != null && this.A02.A04 != null) {
            View view = this.A02.A06;
            if (A04[6].charAt(19) == 'P') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "XqswFkrS2Yg5WXkyCZy0rAQHDfEy407U";
            strArr[3] = "6zRr91flYJNmh2JhyLNuVxqP1ZintOSM";
            if (view != null) {
                this.A02.A09.A0A(this.A02.A04);
                this.A02.A09.A09(this.A02.A06);
                this.A02.A09.A0E(this.A02.A0I);
                this.A02.A09.A0I(this.A02.A0W);
                this.A02.A09.A0M(this.A02.A0Z);
                this.A02.A09.A0L(this.A02.A0Y);
                this.A02.A09.A0J(this.A02.A0q());
                this.A02.A09.A0C(this.A02.A08);
                this.A02.A09.A0K(this.A02.A0X);
                this.A02.A09.A0D(EI.A00(this.A02.A07));
                this.A02.A09.A0F(this.A02.A0S);
                this.A02.A09.A0N(this.A03);
                this.A02.A09.A0B(this.A02.A07);
                this.A02.A09.A0G(this.A02.A0U);
                this.A02.A09.A03();
            }
        }
    }
}
