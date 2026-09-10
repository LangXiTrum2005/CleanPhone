package com.inmobi.media;

import android.view.MotionEvent;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3307vk {
    public final GestureDetectorOnGestureListenerC2829ci a;

    public C3307vk(GestureDetectorOnGestureListenerC2829ci mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.a = mListener;
    }

    public final void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.a.a(event.getX(), event.getY());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.a.b(event.getX(), event.getY());
        }
    }
}
