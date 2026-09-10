package com.inmobi.media;

import com.inmobi.ads.rendering.InMobiAdActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Lb extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lb f22952a = new Lb();

    public Lb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject it = (JSONObject) obj;
        Intrinsics.f(it, "it");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = InMobiAdActivity.f22657l;
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            gestureDetectorOnGestureListenerC3005ec.a(it);
        }
        return Unit.f43263a;
    }
}
