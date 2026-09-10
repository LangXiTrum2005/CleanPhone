package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class X3 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y3 f23338a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3(Y3 y3) {
        super(1);
        this.f23338a = y3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject jsonObject = (JSONObject) obj;
        Intrinsics.f(jsonObject, "jsonObject");
        InterfaceC2946b4 interfaceC2946b4 = this.f23338a.d;
        if (interfaceC2946b4 != null) {
            InterfaceC3295x interfaceC3295x = ((C3062i5) interfaceC2946b4).f23690a.f23716b;
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec ? (GestureDetectorOnGestureListenerC3005ec) interfaceC3295x : null;
            if (gestureDetectorOnGestureListenerC3005ec != null) {
                gestureDetectorOnGestureListenerC3005ec.a(jsonObject);
            }
        }
        return Unit.f43263a;
    }
}
