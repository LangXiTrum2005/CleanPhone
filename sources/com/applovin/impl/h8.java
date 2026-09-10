package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f8103c;

    public h8(View view, com.applovin.impl.sdk.l lVar) {
        this.f8101a = lVar;
        this.f8102b = lVar.Q();
        this.f8103c = view;
    }

    public long a(j3 j3Var) {
        long j10;
        if (com.applovin.impl.sdk.p.a()) {
            this.f8102b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointB = p0.b(this.f8103c.getContext());
        if (this.f8103c.isShown()) {
            j10 = 0;
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8102b.b("ViewabilityTracker", "View is hidden");
            }
            j10 = 2;
        }
        if (this.f8103c.getAlpha() < j3Var.m0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8102b.b("ViewabilityTracker", "View is transparent");
            }
            j10 |= 4;
        }
        Animation animation = this.f8103c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8102b.b("ViewabilityTracker", "View is animating");
            }
            j10 |= 8;
        }
        if (this.f8103c.getParent() == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8102b.b("ViewabilityTracker", "No parent view found");
            }
            j10 |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f8103c.getContext(), this.f8103c.getWidth());
        if (iPxToDp < Math.min(j3Var.s0(), pointB.x)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8102b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j10 |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f8103c.getContext(), this.f8103c.getHeight());
        if (iPxToDp2 < j3Var.o0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8102b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j10 |= 64;
        }
        Rect rect = new Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.f8103c.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect2 = new Rect(i10, iArr[1], this.f8103c.getWidth() + i10, this.f8103c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8102b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j10 |= 128;
        }
        Activity activityB = this.f8101a.e().b();
        if (activityB != null && !g8.a(this.f8103c, activityB)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8102b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j10 |= 256;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8102b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j10));
        }
        return j10;
    }
}
