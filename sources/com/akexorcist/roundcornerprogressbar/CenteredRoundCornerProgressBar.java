package com.akexorcist.roundcornerprogressbar;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class CenteredRoundCornerProgressBar extends RoundCornerProgressBar {
    public CenteredRoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar, com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void drawProgress(LinearLayout linearLayout, GradientDrawable gradientDrawable, float f, float f2, float f3, int i2, int i3, boolean z2) {
        super.drawProgress(linearLayout, gradientDrawable, f, f2, f3, i2, i3, z2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        int i4 = (int) ((f3 - ((f3 - (i3 * 2)) / (f / f2))) / 2.0f);
        marginLayoutParams.setMargins(i4, marginLayoutParams.topMargin, i4, marginLayoutParams.bottomMargin);
        linearLayout.setLayoutParams(marginLayoutParams);
    }

    public CenteredRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public CenteredRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
