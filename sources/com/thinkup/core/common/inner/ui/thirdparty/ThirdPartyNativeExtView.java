package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdPartyNativeExtView extends LinearLayout {
    private TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f41859n;
    private TextView o;

    public ThirdPartyNativeExtView(Context context) {
        this(context, null);
    }

    private static void o(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(Color.parseColor("#A0A0A0"));
        textView.setSelected(true);
        textView.setSingleLine();
        textView.setMarqueeRepeatLimit(-1);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    public TextView getAdFromView() {
        return this.f41859n;
    }

    public TextView getDomainView() {
        return this.o;
    }

    public TextView getWarningView() {
        return this.m;
    }

    public void initView(String str, String str2, String str3) {
        setOrientation(0);
        Context context = getContext();
        if (!TextUtils.isEmpty(str)) {
            TextView textView = new TextView(context);
            this.o = textView;
            textView.setText(str);
            o(this.o);
            addView(this.o);
        }
        if (!TextUtils.isEmpty(str2)) {
            TextView textView2 = new TextView(context);
            this.m = textView2;
            textView2.setText(str2);
            o(this.m);
            if (getChildCount() > 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = o00.o(context, 10.0f);
                addView(this.m, layoutParams);
            } else {
                addView(this.m);
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            TextView textView3 = new TextView(context);
            this.f41859n = textView3;
            textView3.setText(str3);
            o(this.f41859n);
            if (getChildCount() > 0) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = o00.o(context, 10.0f);
                addView(this.f41859n, layoutParams2);
            } else {
                addView(this.f41859n);
            }
        }
        setGravity(16);
    }

    public ThirdPartyNativeExtView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartyNativeExtView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
