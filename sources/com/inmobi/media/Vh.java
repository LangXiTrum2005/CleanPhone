package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Vh implements B {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci a;

    public Vh(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
    }

    public final void a() {
        InterfaceC3072m9 interfaceC3072m9 = this.a.i;
        if (interfaceC3072m9 != null) {
            String str = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3097n9) interfaceC3072m9).a(str, "onAdScreenDisplayFailed");
        }
        this.a.getListener().c();
    }

    public final void b() {
        InterfaceC3072m9 interfaceC3072m9 = this.a.i;
        if (interfaceC3072m9 != null) {
            String str = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3097n9) interfaceC3072m9).a(str, "onAdScreenDisplayed");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci.b == 0) {
            gestureDetectorOnGestureListenerC2829ci.P = false;
        }
        gestureDetectorOnGestureListenerC2829ci.getListener().f(this.a);
    }
}
