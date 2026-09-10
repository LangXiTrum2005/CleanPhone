package com.chartboost.sdk.impl;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f14520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14521c;

    public n(float f, Function0 onClick) {
        Intrinsics.f(onClick, "onClick");
        this.f14519a = f;
        this.f14520b = onClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e2) {
        Intrinsics.f(e2, "e");
        this.f14521c = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.f(e2, "e2");
        this.f14521c = ((float) Math.hypot((double) f, (double) f2)) > this.f14519a;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e2) {
        Intrinsics.f(e2, "e");
        if (this.f14521c) {
            return false;
        }
        this.f14520b.invoke();
        return true;
    }

    public /* synthetic */ n(float f, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10.0f : f, function0);
    }
}
