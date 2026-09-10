package com.inmobi.media;

import com.p004ironsource.sv;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Vb implements InterfaceC3279w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f23303a;

    public Vb(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        this.f23303a = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // com.inmobi.media.InterfaceC3279w
    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23303a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "onAdScreenDisplayFailed");
        }
        this.f23303a.getListener().c();
    }

    @Override // com.inmobi.media.InterfaceC3279w
    public final void b(Object obj) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23303a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, sv.m);
        }
        if ("Default".equals(this.f23303a.getViewState())) {
            this.f23303a.setAndUpdateViewState("Hidden");
        }
        this.f23303a.z();
    }

    @Override // com.inmobi.media.InterfaceC3279w
    public final void a(Object obj) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23303a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "onAdScreenDisplayed");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f23303a;
        if (gestureDetectorOnGestureListenerC3005ec.f23580b == 0) {
            gestureDetectorOnGestureListenerC3005ec.M = false;
        }
        gestureDetectorOnGestureListenerC3005ec.getListener().e(this.f23303a);
    }
}
