package com.akexorcist.roundcornerprogressbar;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class RoundCornerProgressBar extends AnimatedRoundCornerProgressBar {
    public RoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void drawProgress(LinearLayout linearLayout, GradientDrawable gradientDrawable, float f, float f2, float f3, int i2, int i3, boolean z2) {
        float f4 = i2 - (i3 / 2);
        gradientDrawable.setCornerRadii(new float[]{f4, f4, f4, f4, f4, f4, f4, f4});
        linearLayout.setBackground(gradientDrawable);
        int i4 = (int) ((f3 - (i3 * 2)) / (f / f2));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        marginLayoutParams.width = i4;
        int i5 = i4 / 2;
        if (i3 + i5 < i2) {
            int iMax = Math.max(i2 - i3, 0) - i5;
            marginLayoutParams.topMargin = iMax;
            marginLayoutParams.bottomMargin = iMax;
        } else {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        linearLayout.setLayoutParams(marginLayoutParams);
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public int initLayout() {
        return com.charging.screenshow.battery.animations.themes.R.layout.layout_round_corner_progress_bar;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initStyleable(Context context, AttributeSet attributeSet) {
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initView() {
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void onViewDraw() {
    }

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
