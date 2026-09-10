package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class F9 extends C1995bl {
    public final ImageView A00;
    public final C2300gi A01;

    public F9(C2300gi c2300gi) {
        super(c2300gi);
        this.A01 = c2300gi;
        setRadius(30);
        this.A00 = new ImageView(c2300gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C1955b7 c1955b7) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        LM lm = new LM(this.A00, this.A01);
        lm.A04();
        lm.A07(str);
        lm.A06(new InterfaceC1956b8() { // from class: com.facebook.ads.redexgen.X.FA
            @Override // com.facebook.ads.redexgen.core.InterfaceC1956b8
            public final void AE7(C1955b7 c1955b7) {
                this.A00.A00(c1955b7);
            }
        });
    }
}
