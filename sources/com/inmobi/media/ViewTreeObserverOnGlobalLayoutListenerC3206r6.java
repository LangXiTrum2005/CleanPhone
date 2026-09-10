package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3206r6 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f23953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f23954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23955c;
    public int d;

    public ViewTreeObserverOnGlobalLayoutListenerC3206r6(FrameLayout view, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(view, "view");
        this.f23953a = view;
        this.f23954b = interfaceC3333z5;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InterfaceC3333z5 interfaceC3333z5 = this.f23954b;
            if (interfaceC3333z5 != null) {
                String str = AbstractC3286w6.f24072a;
                Intrinsics.e(str, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).a(str, "close called");
            }
            this.f23955c = B2.b(this.f23953a.getWidth() / U3.b());
            this.d = B2.b(this.f23953a.getHeight() / U3.b());
            this.f23953a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Boolean bool = Boolean.FALSE;
            synchronized (bool) {
                bool.notify();
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23954b;
            if (interfaceC3333z6 != null) {
                String str2 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z6).b(str2, rf.a(e2, H6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); ")));
            }
        }
    }
}
