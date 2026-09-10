package com.mbridge.msdk.video.dynview.widget;

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
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeLevelLayoutView extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f37456d = 18;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f37457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37459c;

    public MBridgeLevelLayoutView(Context context) {
        super(context);
    }

    private void a() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (this.f37459c) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dip2px(getContext(), f37456d));
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
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, dip2px(getContext(), f37456d));
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setText("(");
            textView.setTextColor(Color.parseColor("#5f5f5f"));
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(Typeface.defaultFromStyle(1));
            textView2.setGravity(17);
            textView2.setTextColor(Color.parseColor("#5f5f5f"));
            Drawable drawable = getResources().getDrawable(i0.a(getContext(), "mbridge_reward_user", "drawable"));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            textView2.setCompoundDrawables(drawable, null, null, null);
            textView2.setText(this.f37458b + " )");
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setLines(1);
            linearLayout2.addView(textView, layoutParams2);
            linearLayout2.addView(textView2, layoutParams2);
        }
        double d10 = this.f37457a;
        if (d10 == 0.0d) {
            d10 = 5.0d;
        }
        for (int i10 = 0; i10 < 5; i10++) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dip2px(getContext(), 15.0f), dip2px(getContext(), f37456d));
            if (i10 < d10) {
                imageView.setImageResource(i0.a(getContext(), "mbridge_download_message_dialog_star_sel", "drawable"));
            } else {
                imageView.setImageResource(i0.a(getContext(), "mbridge_download_message_dilaog_star_nor", "drawable"));
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

    public static int dip2px(Context context, float f10) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f10 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i10) {
        this.f37457a = i10;
        a();
    }

    public void setRatingAndUser(double d10, int i10) {
        this.f37457a = d10;
        if (i10 == 0) {
            i10 = (int) (((Math.random() * 9.0d) + 1.0d) * 10000.0d);
        }
        this.f37458b = i10;
        this.f37459c = true;
        a();
    }

    public MBridgeLevelLayoutView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeLevelLayoutView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
