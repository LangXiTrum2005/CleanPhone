package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lc extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f14417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14418b;

    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e2) {
            Intrinsics.f(e2, "e");
            lc.this.f14418b = true;
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        this.f14417a = new GestureDetector(context, new a());
    }

    public final boolean getGestureDetected() {
        return this.f14418b;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.f(event, "event");
        this.f14417a.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    public final void a() {
        this.f14418b = false;
    }
}
