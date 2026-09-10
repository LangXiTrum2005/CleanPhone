package com.smartdigimkt.expressad.video.dynview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes5.dex */
public class AnyThinkLevelLayoutView extends LinearLayout {
    private static int h0 = 18;
    private double e0;
    private int f0;
    private boolean g0;

    public AnyThinkLevelLayoutView(Context context) {
        super(context);
    }

    private void a() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (this.g0) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dip2px(getContext(), h0));
            layoutParams.setMargins(0, dip2px(getContext(), 2.0f), 0, 0);
            linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(layoutParams);
        } else {
            linearLayout = null;
            linearLayout2 = null;
        }
        removeAllViews();
        if (linearLayout2 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, dip2px(getContext(), h0));
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setText("(");
            textView.setTextColor(Color.parseColor("#5f5f5f"));
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(Typeface.defaultFromStyle(1));
            textView2.setGravity(17);
            textView2.setTextColor(Color.parseColor("#5f5f5f"));
            Drawable drawable = getResources().getDrawable(k.a(getContext(), "sdm_reward_user", k.d));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            textView2.setCompoundDrawables(drawable, null, null, null);
            textView2.setText(this.f0 + " )");
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setLines(1);
            linearLayout2.addView(textView, layoutParams2);
            linearLayout2.addView(textView2, layoutParams2);
        }
        double d = this.e0;
        if (d == 0.0d) {
            d = 5.0d;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dip2px(getContext(), 15.0f), dip2px(getContext(), h0));
            if (i2 < d) {
                imageView.setImageResource(k.a(getContext(), "sdm_download_message_dialog_star_sel", k.d));
            } else {
                imageView.setImageResource(k.a(getContext(), "sdm_download_message_dilaog_star_nor", k.d));
            }
            layoutParams3.weight = 1.0f;
            layoutParams3.setMargins(dip2px(getContext(), 2.0f), 0, 0, 0);
            if (linearLayout != null) {
                linearLayout.addView(imageView, layoutParams3);
            } else {
                addView(imageView, layoutParams3);
            }
        }
        if (linearLayout != null) {
            addView(linearLayout);
            addView(linearLayout2);
        }
    }

    public static int dip2px(Context context, float f) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i2) {
        this.e0 = i2;
        a();
    }

    public void setRatingAndUser(double d, int i2) {
        this.e0 = d;
        if (i2 == 0) {
            i2 = (int) (((Math.random() * 9.0d) + 1.0d) * 10000.0d);
        }
        this.f0 = i2;
        this.g0 = true;
        a();
    }

    public AnyThinkLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkLevelLayoutView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
