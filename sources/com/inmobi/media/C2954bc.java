package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2954bc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f23463a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2954bc(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        super(0);
        this.f23463a = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new C2955bd(this.f23463a.getWebViewFactory(), this.f23463a.f23587i);
    }
}
