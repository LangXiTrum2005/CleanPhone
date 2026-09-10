package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1371cV extends C0710Fg {
    public final ImageView A00;
    public final C1828k1 A01;

    public C1371cV(C1828k1 c1828k1) {
        super(c1828k1);
        this.A01 = c1828k1;
        setRadius(30);
        this.A00 = new ImageView(c1828k1);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        AsyncTaskC1623gc asyncTaskC1623gc = new AsyncTaskC1623gc(this.A00, this.A01);
        asyncTaskC1623gc.A04();
        asyncTaskC1623gc.A07(str);
        asyncTaskC1623gc.A06(new FA() { // from class: com.facebook.ads.redexgen.X.cX
            @Override // com.facebook.ads.redexgen.core.FA
            public final void ADM(boolean z) {
                this.A00.A00(z);
            }
        });
    }
}
