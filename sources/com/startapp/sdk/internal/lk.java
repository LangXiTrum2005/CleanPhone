package com.startapp.sdk.internal;

import android.graphics.Rect;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;

/* JADX INFO: loaded from: classes6.dex */
public final class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f41231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect[] f41232c;
    public final NotDisplayedReason d;

    public lk() {
        this.f41231b = new Rect();
    }

    public lk(NotDisplayedReason notDisplayedReason, float f, Rect rect, Rect[] rectArr) {
        new Rect();
        this.f41230a = f;
        this.f41231b = rect;
        this.f41232c = rectArr;
        this.d = notDisplayedReason;
    }
}
