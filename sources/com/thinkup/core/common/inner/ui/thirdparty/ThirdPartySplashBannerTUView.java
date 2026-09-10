package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdPartySplashBannerTUView extends RelativeLayout implements com.thinkup.core.common.mn.m.o.n {
    private o m;
    private Context o;

    public ThirdPartySplashBannerTUView(Context context) {
        this(context, null);
    }

    private void m() {
        TextView textView = new TextView(this.o);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int iO = o00.o(this.o, 5.0f);
        layoutParams.leftMargin = iO;
        layoutParams.topMargin = iO;
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        textView.setBackgroundResource(o00.o(this.o, "myoffer_splash_ad_label_bg", k.d));
        int iO2 = o00.o(this.o, 2.0f);
        textView.setPadding(iO, iO2, iO, iO2);
        textView.setText(o00.o(this.o, "basead_ad_text", k.f38992h));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        addView(textView, layoutParams);
    }

    private void o() {
        TextView textView = new TextView(this.o);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int iO = o00.o(this.o, 5.0f);
        layoutParams.leftMargin = iO;
        layoutParams.topMargin = iO;
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        textView.setBackgroundResource(o00.o(this.o, "myoffer_splash_ad_label_bg", k.d));
        int iO2 = o00.o(this.o, 2.0f);
        textView.setPadding(iO, iO2, iO, iO2);
        textView.setText(o00.o(this.o, "basead_ad_text", k.f38992h));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        addView(textView, layoutParams);
    }

    public void addBannerView(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        addView(view, layoutParams);
    }

    public void addCountDownView(int i2, o.InterfaceC0663o interfaceC0663o) {
        o oVar = new o(this.o, this, ((long) i2) * 1000, interfaceC0663o);
        this.m = oVar;
        View viewO = oVar.o();
        if (viewO == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, o00.o(this.o, 32.0f), o00.o(this.o, 18.0f), 0);
        addView(viewO, layoutParams);
        this.m.m();
    }

    public ThirdPartySplashBannerTUView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartySplashBannerTUView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o = context;
        TextView textView = new TextView(this.o);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int iO = o00.o(this.o, 5.0f);
        layoutParams.leftMargin = iO;
        layoutParams.topMargin = iO;
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        textView.setBackgroundResource(o00.o(this.o, "myoffer_splash_ad_label_bg", k.d));
        int iO2 = o00.o(this.o, 2.0f);
        textView.setPadding(iO, iO2, iO, iO2);
        textView.setText(o00.o(this.o, "basead_ad_text", k.f38992h));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        addView(textView, layoutParams);
    }
}
