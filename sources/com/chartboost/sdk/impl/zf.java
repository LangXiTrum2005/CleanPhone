package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zf extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f15742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15743b;

    public zf(Context context) {
        Intrinsics.f(context, "context");
        this.f15742a = new GestureDetector(context, this);
    }

    public final boolean a() {
        return this.f15743b;
    }

    public final void b() {
        this.f15743b = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e2) {
        Intrinsics.f(e2, "e");
        this.f15743b = true;
        return super.onSingleTapUp(e2);
    }

    public final boolean a(MotionEvent event) {
        Intrinsics.f(event, "event");
        return this.f15742a.onTouchEvent(event);
    }
}
