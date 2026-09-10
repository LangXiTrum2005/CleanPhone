package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class U4 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnumC3179pa f23259a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(EnumC3179pa enumC3179pa) {
        super(1);
        this.f23259a = enumC3179pa;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GestureDetectorOnGestureListenerC3005ec it = (GestureDetectorOnGestureListenerC3005ec) obj;
        Intrinsics.f(it, "it");
        EnumC3179pa orientation = this.f23259a;
        Intrinsics.f(orientation, "orientation");
        InterfaceC3333z5 interfaceC3333z5 = it.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "handle orientationChange " + it + ' ' + orientation);
        }
        int iA = AbstractC3195qa.a(orientation);
        InterfaceC3333z5 interfaceC3333z6 = it.f23587i;
        if (interfaceC3333z6 != null) {
            String TAG2 = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "fireOrientationChange " + it + ' ' + iA);
        }
        it.c("window.imraid.broadcastEvent('orientationChange','" + iA + "');");
        return Unit.f43263a;
    }
}
