package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3253u5 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f24021a;

    public ViewTreeObserverOnGlobalLayoutListenerC3253u5(InMobiBanner inMobiBanner) {
        this.f24021a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        InterfaceC3333z5 interfaceC3333z5P;
        try {
            InMobiBanner inMobiBanner = this.f24021a;
            inMobiBanner.f22631i = B2.b(inMobiBanner.getMeasuredWidth() / U3.b());
            InMobiBanner inMobiBanner2 = this.f24021a;
            inMobiBanner2.j = B2.b(inMobiBanner2.getMeasuredHeight() / U3.b());
            if (this.f24021a.b()) {
                this.f24021a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e2) {
            R1 mAdManager = this.f24021a.getMAdManager();
            if (mAdManager == null || (interfaceC3333z5P = mAdManager.p()) == null) {
                return;
            }
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            Intrinsics.e(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5P).a(strAccess$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e2);
        }
    }
}
