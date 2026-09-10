package com.inmobi.media;

/* JADX INFO: loaded from: classes3.dex */
public final class Ph implements InterfaceC2987j {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci a;

    public Ph(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
    }

    public final void a(Float f) {
        this.a.g("window.mraidview.broadcastEvent('audioVolumeChange', " + f + ");");
    }
}
