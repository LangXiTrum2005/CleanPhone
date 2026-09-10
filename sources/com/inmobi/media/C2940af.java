package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2940af extends Xe {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3005ec f23452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2940af(GestureDetectorOnGestureListenerC3005ec mRenderView) {
        super(mRenderView);
        Intrinsics.f(mRenderView, "mRenderView");
        this.f23452e = mRenderView;
    }

    @Override // com.inmobi.media.Xe
    public final void a(byte b2) {
    }

    @Override // com.inmobi.media.Xe
    public final View d() {
        this.f23353c = new WeakReference(this.f23452e);
        return this.f23452e;
    }

    @Override // com.inmobi.media.Xe
    public final void e() {
    }

    @Override // com.inmobi.media.Xe
    public final void a(Map map) {
    }

    @Override // com.inmobi.media.Xe
    public final void a(Context context, byte b2) {
        Intrinsics.f(context, "context");
    }

    @Override // com.inmobi.media.Xe
    public final View a(View view, ViewGroup parent, boolean z2) {
        Intrinsics.f(parent, "parent");
        return d();
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f23452e.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        I exposureTracker = this.f23452e.getExposureTracker();
        if (exposureTracker != null) {
            InterfaceC3333z5 interfaceC3333z5 = exposureTracker.f22869e;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("AdExposureTracker", "Adding friendly view: " + childView);
            }
            Set set = exposureTracker.f22867b;
            if (set != null) {
                set.add(childView);
            }
        }
        this.f23452e.getWebViewFactory().b(new Ye(childView));
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView) {
        Intrinsics.f(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f23452e.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        I exposureTracker = this.f23452e.getExposureTracker();
        if (exposureTracker != null) {
            InterfaceC3333z5 interfaceC3333z5 = exposureTracker.f22869e;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("AdExposureTracker", "Removing friendly view: " + childView);
            }
            Set set = exposureTracker.f22867b;
            if (set != null) {
                set.remove(childView);
            }
        }
        this.f23452e.getWebViewFactory().b(new Ze(childView));
    }
}
