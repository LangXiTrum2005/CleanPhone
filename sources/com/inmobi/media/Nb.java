package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Nb extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f23016a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nb(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        super(1);
        this.f23016a = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f23016a;
        InterfaceC3333z5 interfaceC3333z5 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC3005ec.getListener().a(gestureDetectorOnGestureListenerC3005ec, zBooleanValue);
        return Unit.f43263a;
    }
}
