package com.unity3d.ads.adplayer;

import android.view.MotionEvent;
import android.view.View;
import com.chartboost.sdk.impl.m2;
import com.chartboost.sdk.impl.zf;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnTouchListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f42677Y;

    public /* synthetic */ a(Object obj, int i2) {
        this.X = i2;
        this.f42677Y = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.X) {
            case 0:
                return AndroidWebViewContainer._init_$lambda$1((AndroidWebViewContainer) this.f42677Y, view, motionEvent);
            default:
                return m2.a((zf) this.f42677Y, view, motionEvent);
        }
    }
}
