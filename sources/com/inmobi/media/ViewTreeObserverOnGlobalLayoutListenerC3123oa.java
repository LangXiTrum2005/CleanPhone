package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.preprohormone;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3123oa implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout a;
    public final InterfaceC3072m9 b;
    public int c;
    public int d;
    public final gintrap e;

    public ViewTreeObserverOnGlobalLayoutListenerC3123oa(FrameLayout view, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = view;
        this.b = interfaceC3072m9;
        this.e = preprohormone.attabal(Unit.f29295attabal);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InterfaceC3072m9 interfaceC3072m9 = this.b;
            if (interfaceC3072m9 != null) {
                String str = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).a(str, "close called");
            }
            this.c = F3.b(this.a.getWidth() / J5.b());
            this.d = F3.b(this.a.getHeight() / J5.b());
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            cutely.wireman(A9.c, null, null, new C3098na(this, null), 3, null);
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m10 = this.b;
            if (interfaceC3072m10 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str2, "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); " + e.getMessage());
            }
        }
    }
}
