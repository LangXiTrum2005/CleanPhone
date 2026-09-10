package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Uh {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci a;

    public Uh(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
    }

    public final void a(C2793b8 obj) {
        Intrinsics.checkNotNullParameter(obj, "error");
        InterfaceC3072m9 interfaceC3072m9 = this.a.i;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("HtmlVideoPlayer", "onVideoLoadFailed " + ((int) obj.b));
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        EnumC3146p8 enumC3146p8 = EnumC3146p8.VIDEO_PLAYBACK_ERROR;
        Intrinsics.checkNotNullParameter(obj, "obj");
        gestureDetectorOnGestureListenerC2829ci.a(enumC3146p8, AbstractC3073ma.a(obj, obj.getClass()));
    }
}
