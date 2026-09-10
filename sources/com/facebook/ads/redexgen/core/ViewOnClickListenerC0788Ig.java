package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC0788Ig extends AbstractC1346c6 implements View.OnClickListener {
    public final AbstractC1343c3 A00;
    public final AbstractC1337bx A01;
    public final AbstractC1335bv A02;
    public final AbstractC1333bt A03;
    public final C0796Io A04;

    public ViewOnClickListenerC0788Ig(C1828k1 c1828k1) {
        this(c1828k1, null);
    }

    public ViewOnClickListenerC0788Ig(C1828k1 c1828k1, AttributeSet attributeSet) {
        this(c1828k1, attributeSet, 0);
    }

    public ViewOnClickListenerC0788Ig(C1828k1 c1828k1, AttributeSet attributeSet, int i) {
        super(c1828k1, attributeSet, i);
        this.A03 = new JO(this);
        this.A01 = new JH(this);
        this.A02 = new C0792Ik(this);
        this.A00 = new C0791Ij(this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new C0796Io(c1828k1);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1346c6
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1346c6
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            C1361cL videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == JI.A07 || videoView.getState() == JI.A05 || videoView.getState() == JI.A06) {
                videoView.A0g(IP.A04, 11);
            } else if (videoView.getState() == JI.A0A) {
                videoView.A0k(true, 7);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
