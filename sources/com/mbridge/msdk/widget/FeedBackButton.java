package com.mbridge.msdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"AppCompatCustomView"})
public class FeedBackButton extends TextView {
    public static String FEEDBACK_BTN_BACKGROUND_COLOR_STR = "#60000000";

    public FeedBackButton(Context context) {
        super(context);
        a();
    }

    private void a() {
        setText(i0.a(getContext(), "mbridge_cm_feedback_btn_text", "string"));
        Context context = getContext();
        int iA = v0.a(context, 13.0f);
        setPadding(iA, 0, iA, 0);
        setTextIsSelectable(false);
        setGravity(17);
        setBackgroundColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(v0.a(context, 20.0f));
        gradientDrawable.setColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        setBackground(gradientDrawable);
        setTextColor(-1);
    }

    public FeedBackButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public FeedBackButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    public FeedBackButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }
}
