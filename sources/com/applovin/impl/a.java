package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProgressBar f7334a;

    public a(Context context, int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i11);
        this.f7334a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i10 == -2 || i10 == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        } else {
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, i10);
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i10) {
        this.f7334a.getIndeterminateDrawable().setColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }
}
