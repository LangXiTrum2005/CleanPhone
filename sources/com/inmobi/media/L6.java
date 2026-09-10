package com.inmobi.media;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class L6 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M6 f22947a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L6(M6 m6) {
        super(2);
        this.f22947a = m6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String trackerName = (String) obj;
        Map macros = (Map) obj2;
        Intrinsics.f(trackerName, "trackerName");
        Intrinsics.f(macros, "macros");
        Ub ub = this.f22947a.d;
        if (ub != null) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = ub.f23269a;
            if (!gestureDetectorOnGestureListenerC3005ec.f23585e) {
                gestureDetectorOnGestureListenerC3005ec.a(trackerName, macros);
            }
        }
        return Unit.f43263a;
    }
}
