package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: renamed from: com.applovin.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0924a extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProgressBar f10444a;

    public C0924a(Context context, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i3);
        this.f10444a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i2 == -2 || i2 == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        } else {
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, i2);
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

    public void setColor(int i2) {
        this.f10444a.getIndeterminateDrawable().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
    }
}
