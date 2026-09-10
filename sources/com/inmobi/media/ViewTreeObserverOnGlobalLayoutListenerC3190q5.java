package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* JADX INFO: renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3190q5 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiAudio f23921a;

    public ViewTreeObserverOnGlobalLayoutListenerC3190q5(InMobiAudio inMobiAudio) {
        this.f23921a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InMobiAudio inMobiAudio = this.f23921a;
            inMobiAudio.f = B2.b(inMobiAudio.getMeasuredWidth() / U3.b());
            InMobiAudio inMobiAudio2 = this.f23921a;
            inMobiAudio2.g = B2.b(inMobiAudio2.getMeasuredHeight() / U3.b());
            if (this.f23921a.b()) {
                this.f23921a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception unused) {
            AbstractC3048h7.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
        }
    }
}
