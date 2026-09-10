package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class T4 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T4 f23199a = new T4();

    public T4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GestureDetectorOnGestureListenerC3005ec it = (GestureDetectorOnGestureListenerC3005ec) obj;
        Intrinsics.f(it, "it");
        InterfaceC3333z5 interfaceC3333z5 = it.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z5).a(str, Ob.a(it, str, "TAG", "fireBackButtonPressedEvent "));
        }
        String str2 = it.f23572I;
        if (str2 != null) {
            it.a(str2, "broadcastEvent('backButtonPressed')");
        }
        return Unit.f43263a;
    }
}
