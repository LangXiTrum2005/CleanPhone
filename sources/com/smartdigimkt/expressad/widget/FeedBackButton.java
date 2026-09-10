package com.smartdigimkt.expressad.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class FeedBackButton extends TextView {
    public static String FEEDBACK_BTN_BACKGROUND_COLOR_STR = "#60000000";

    public FeedBackButton(Context context) {
        super(context);
        a();
    }

    private void a() {
        setText(k.a(getContext(), "sdm_cm_feedback_btn_text", k.f38992h));
        Context context = getContext();
        setPadding(v.a(context, 5.0f), v.a(context, 5.0f), v.a(context, 5.0f), v.a(context, 5.0f));
        setTextIsSelectable(false);
        setGravity(17);
        setBackgroundColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(v.a(context, 20.0f));
        gradientDrawable.setColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        setBackground(gradientDrawable);
        setTextColor(-1);
    }

    public FeedBackButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public FeedBackButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    public FeedBackButton(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a();
    }
}
