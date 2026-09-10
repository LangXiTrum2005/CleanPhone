package com.smartdigimkt.expressad.foundation.webview;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f34706a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34707b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34708c = 6;
    public static final int d = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34709e = 8;

    /* JADX INFO: renamed from: com.smartdigimkt.expressad.foundation.webview.a$a, reason: collision with other inner class name */
    public interface InterfaceC0472a {
        void a(float f);

        void a(boolean z2);
    }

    Drawable getBackground();

    ViewGroup.LayoutParams getLayoutParams();

    float getProgress();

    int getVisibility();

    void initResource(boolean z2);

    void onThemeChange();

    void setBackgroundColor(int i2);

    void setBackgroundDrawable(Drawable drawable);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setPaused(boolean z2);

    void setProgress(float f, boolean z2);

    void setProgressBarListener(InterfaceC0472a interfaceC0472a);

    void setProgressState(int i2);

    void setVisibility(int i2);

    void setVisible(boolean z2);

    void startEndAnimation();
}
