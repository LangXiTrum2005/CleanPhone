package com.inmobi.media;

import com.inmobi.ads.rendering.InMobiAdActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Kb extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Kb f22930a = new Kb();

    public Kb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = InMobiAdActivity.f22657l;
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            gestureDetectorOnGestureListenerC3005ec.p();
        }
        return Unit.f43263a;
    }
}
