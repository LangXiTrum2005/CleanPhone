package com.inmobi.media;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class Q4 implements InterfaceC2981d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S4 f23102a;

    public Q4(S4 s4) {
        this.f23102a = s4;
    }

    @Override // com.inmobi.media.InterfaceC2981d5
    public final void a(View view, Object obj) {
        if (view instanceof GestureDetectorOnGestureListenerC3005ec) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23102a.f;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("HtmlAdTracker", "fireImpression");
            }
            ((GestureDetectorOnGestureListenerC3005ec) view).m();
        }
    }
}
