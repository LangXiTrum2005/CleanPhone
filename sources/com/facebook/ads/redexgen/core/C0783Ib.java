package com.facebook.ads.redexgen.core;

import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0783Ib extends AbstractC1346c6 {
    public static String[] A01 = {"BuRuvxulsaJnTsptWr5C74N6kbe62CR1", "s8BhV7yvVPv9fWwhaDhts8ISKp0Ib3uz", "BHQbL486YclXfOG4TttSSmYhAQDicEvh", "6QlBJVUCqIJjaBYG", "bf17tAIDP3PP5oHcfI5KYvpff0TMzylU", "en59KaoZPANthNZYpe9YMIumKtT", "Zp8Yp0vRpWPiTIr1M3XMCxUDLLEg", "TVOb3qDH058zXjUqb6AporPz"};
    public final C9K<C1334bu> A00;

    public C0783Ib(C1828k1 c1828k1) {
        this(c1828k1, null);
    }

    public C0783Ib(C1828k1 c1828k1, AttributeSet attributeSet) {
        this(c1828k1, attributeSet, 0);
    }

    public C0783Ib(C1828k1 c1828k1, AttributeSet attributeSet, int i) {
        super(c1828k1, attributeSet, i);
        this.A00 = new C1284b6(this);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams spinnerParams = new RelativeLayout.LayoutParams(iApplyDimension, iApplyDimension);
        spinnerParams.addRule(13);
        addView(progressBar, spinnerParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1346c6
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1346c6
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A06(this.A00);
        }
        setVisibility(8);
        if (A01[6].length() == 4) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "qxykbLgy7uMqmiLSWk5iAMCsSUesvX5c";
        strArr[0] = "yfv8cLzmeBPWJWXBFW506HD39p2knuA3";
        super.A08();
    }
}
