package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1880cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1329Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C1880cd(C2131gi c2131gi, ViewOnClickListenerC1329Kr viewOnClickListenerC1329Kr, AbstractC2296jd abstractC2296jd, VA va, InterfaceC1672Yh interfaceC1672Yh, C2076fp c2076fp, Y2 y2, C1389Na c1389Na, InterfaceC1809bU interfaceC1809bU) {
        super(c2131gi);
        this.A00 = c1389Na.A09(true);
        this.A01 = new RelativeLayout(c2131gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c2131gi, abstractC2296jd.A29().A0J().A04());
        if (viewOnClickListenerC1329Kr == null) {
            this.A02 = new ViewOnClickListenerC1329Kr(c2131gi, abstractC2296jd.A0w(), (C1389Na) null, va, interfaceC1672Yh, c2076fp, y2, abstractC2296jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC1329Kr;
        }
        A03();
        this.A02.setCta(abstractC2296jd.A29().A0J(), abstractC2296jd.A2E(), new HashMap(), interfaceC1809bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C2131gi c2131gi, View view) {
        ImageView imageView = new ImageView(c2131gi);
        imageView.setImageBitmap(YN.A01(YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C2131gi c2131gi, String str) {
        Button button = new Button(c2131gi);
        YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        YB.A0Q(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c2131gi, button);
    }

    public final EnumC1380Mq A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC2296jd abstractC2296jd, AbstractC1666Yb abstractC1666Yb) {
        this.A02.A0F(abstractC2296jd, abstractC1666Yb);
    }

    public void setCta(C1391Nc c1391Nc, String str, HashMap<String, String> extras, InterfaceC1809bU interfaceC1809bU) {
        this.A02.setCta(c1391Nc, str, extras, interfaceC1809bU);
    }
}
