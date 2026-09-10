package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AppRatingView extends LinearLayout {
    private Context e0;
    private List<StarLevelView> f0;
    private int g0;
    private int h0;

    public AppRatingView(Context context) {
        this(context, null, 0);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i2) {
        for (int i3 = 0; i3 < this.f0.size(); i3++) {
            StarLevelView starLevelView = this.f0.get(i3);
            if (i3 < i2) {
                starLevelView.setState(true);
            } else {
                starLevelView.setState(false);
            }
        }
    }

    public void setStarMargin(int i2) {
        this.h0 = i2;
    }

    public void setStarNum(int i2) {
        if (this.f0 == null) {
            this.f0 = new ArrayList();
        }
        this.f0.clear();
        removeAllViews();
        setOrientation(0);
        for (int i3 = 0; i3 < i2; i3++) {
            StarLevelView starLevelView = new StarLevelView(getContext());
            int i4 = this.g0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
            if (i3 != i2 - 1) {
                layoutParams.setMargins(0, 0, dip2px(getContext(), this.h0), 0);
            }
            starLevelView.setLayoutParams(layoutParams);
            addView(starLevelView);
            this.f0.add(starLevelView);
        }
    }

    public void setStarSizeInDp(int i2) {
        this.g0 = dip2px(this.e0, i2);
    }

    public AppRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppRatingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = context;
        setStarSizeInDp(17);
        setStarMargin(8);
    }
}
