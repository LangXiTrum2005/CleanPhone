package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.EngagementSignalsCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3075j2 implements EngagementSignalsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3091k2 f23713a;

    public C3075j2(C3091k2 c3091k2) {
        this.f23713a = c3091k2;
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i2, Bundle extras) {
        Intrinsics.f(extras, "extras");
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onSessionEnded(boolean z2, Bundle extras) {
        InterfaceC2995e2 interfaceC2995e2;
        Intrinsics.f(extras, "extras");
        if (z2 && (interfaceC2995e2 = (InterfaceC2995e2) this.f23713a.f23745i.get()) != null) {
            GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
            interfaceC2995e2.a(Gb.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        InterfaceC2995e2 interfaceC2995e3 = (InterfaceC2995e2) this.f23713a.f23745i.get();
        if (interfaceC2995e3 != null) {
            GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
            interfaceC2995e3.a(Gb.a("IN_NATIVE_BROWSER", "onClose"));
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z2, Bundle extras) {
        Intrinsics.f(extras, "extras");
        C3091k2 c3091k2 = this.f23713a;
        if (c3091k2.f23744h) {
            return;
        }
        c3091k2.f23744h = true;
        InterfaceC2995e2 interfaceC2995e2 = (InterfaceC2995e2) c3091k2.f23745i.get();
        if (interfaceC2995e2 != null) {
            GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
            interfaceC2995e2.a(Gb.a("IN_NATIVE_BROWSER", "onScroll"));
        }
    }
}
