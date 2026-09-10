package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Hb implements ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f22864a;

    public Hb(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        this.f22864a = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // com.inmobi.media.ef
    public final void a(View view, boolean z2) {
        Intrinsics.f(view, "view");
        if (view instanceof GestureDetectorOnGestureListenerC3005ec) {
            if (this.f22864a.hasWindowFocus()) {
                this.f22864a.c(z2);
            } else {
                this.f22864a.c(false);
            }
        }
    }
}
