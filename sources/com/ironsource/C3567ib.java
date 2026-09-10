package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3567ib extends FrameLayout implements NativeAdViewBinderInterface {
    private final NativeAdViewHolder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3567ib(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new NativeAdViewHolder();
    }

    public final void a(C3513fb nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> listA = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, listA);
        AdapterNativeAdViewBinder adapterNativeAdViewBinderF = nativeAd.f();
        if (adapterNativeAdViewBinderF != null) {
            adapterNativeAdViewBinderF.setBodyView(this.a.getBodyView());
            adapterNativeAdViewBinderF.setMediaView(this.a.getMediaView());
            adapterNativeAdViewBinderF.setCallToActionView(this.a.getCallToActionView());
            adapterNativeAdViewBinderF.setTitleView(this.a.getTitleView());
            adapterNativeAdViewBinderF.setIconView(this.a.getIconView());
            adapterNativeAdViewBinderF.setAdvertiserView(this.a.getAdvertiserView());
            adapterNativeAdViewBinderF.setNativeAdView(frameLayout);
            addView(adapterNativeAdViewBinderF.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3567ib(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new NativeAdViewHolder();
    }

    private final void a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    private final List<View> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }
}
