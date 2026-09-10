package com.inmobi.media;

import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Mb extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Mb f22985a = new Mb();

    public Mb() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String trackerName = (String) obj;
        Map macros = (Map) obj2;
        Intrinsics.f(trackerName, "trackerName");
        Intrinsics.f(macros, "macros");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = InMobiAdActivity.f22657l;
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            gestureDetectorOnGestureListenerC3005ec.a(trackerName, macros);
        }
        return Unit.f43263a;
    }
}
