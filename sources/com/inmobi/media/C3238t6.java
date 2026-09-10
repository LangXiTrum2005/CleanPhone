package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3238t6 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24008a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3238t6(boolean z2) {
        super(1);
        this.f24008a = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GestureDetectorOnGestureListenerC3005ec it = (GestureDetectorOnGestureListenerC3005ec) obj;
        Intrinsics.f(it, "it");
        it.setDisableBackButton(this.f24008a);
        return Unit.f43263a;
    }
}
