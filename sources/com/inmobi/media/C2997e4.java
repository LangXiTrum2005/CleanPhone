package com.inmobi.media;

import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2997e4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3045h4 f23545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2997e4(C3045h4 c3045h4) {
        super(0);
        this.f23545a = c3045h4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC2946b4 interfaceC2946b4;
        ViewParent parent = this.f23545a.getParent();
        Y3 y3 = parent instanceof Y3 ? (Y3) parent : null;
        if (y3 != null && (interfaceC2946b4 = y3.d) != null) {
            InterfaceC3295x interfaceC3295x = ((C3062i5) interfaceC2946b4).f23690a.f23716b;
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec ? (GestureDetectorOnGestureListenerC3005ec) interfaceC3295x : null;
            if (gestureDetectorOnGestureListenerC3005ec != null) {
                gestureDetectorOnGestureListenerC3005ec.p();
            }
        }
        return Unit.f43263a;
    }
}
