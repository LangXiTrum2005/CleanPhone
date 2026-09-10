package com.inmobi.media;

import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Rh {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci a;

    public Rh(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC3072m9 interfaceC3072m9 = this.a.i;
        if (interfaceC3072m9 != null) {
            String str = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3097n9) interfaceC3072m9).a(str, "onCCTLifeCycleEvent");
        }
        this.a.c(jsonObject);
    }
}
