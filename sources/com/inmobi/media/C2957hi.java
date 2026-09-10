package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C2957hi;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2957hi {
    public GestureDetectorOnGestureListenerC2829ci a;
    public final long b;

    public C2957hi(GestureDetectorOnGestureListenerC2829ci view, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = view;
        this.b = j;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: adsuki.plench
            @Override // java.lang.Runnable
            public final void run() {
                C2957hi.a(this.f3594kowloon);
            }
        }, this.b);
    }

    public static final void a(C2957hi c2957hi) {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = c2957hi.a;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.i();
        }
        c2957hi.a = null;
    }
}
