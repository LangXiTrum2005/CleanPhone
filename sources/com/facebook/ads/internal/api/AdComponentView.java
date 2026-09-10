package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public interface AdComponentView {
    void addView(View view);

    void addView(View view, int i2);

    void addView(View view, int i2, int i3);

    void addView(View view, int i2, ViewGroup.LayoutParams layoutParams);

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z2);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
