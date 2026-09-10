package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C3031ki;
import com.inmobi.media.Gn;
import java.lang.ref.WeakReference;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Gn extends Fn {
    public final GestureDetectorOnGestureListenerC2829ci d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gn(GestureDetectorOnGestureListenerC2829ci mRenderView) {
        super(mRenderView);
        Intrinsics.checkNotNullParameter(mRenderView, "mRenderView");
        this.d = mRenderView;
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
    }

    public final void b(final View view) {
        this.d.getWebViewFactory().b(new Function1() { // from class: adsuki.cultivated
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Gn.a(view, (C3031ki) obj);
            }
        });
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        this.b = new WeakReference(this.d);
        return this.d;
    }

    public static final Unit b(View view, C3031ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getViewableAd().a(view);
        U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final Unit a(View view, C3031ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getViewableAd().a(view, FriendlyObstructionPurpose.OTHER);
        U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        return Unit.f29295attabal;
    }

    public final void c(final View view) {
        this.d.getWebViewFactory().b(new Function1() { // from class: adsuki.permissivist
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Gn.b(view, (C3031ki) obj);
            }
        });
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
        b(childView);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
        c(childView);
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
    }
}
