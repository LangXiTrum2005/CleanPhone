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

/* JADX INFO: renamed from: com.ironsource.lb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0445lb extends FrameLayout implements NativeAdViewBinderInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdViewHolder f29180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0445lb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.n.f(context, "context");
        this.f29180a = new NativeAdViewHolder();
    }

    public final void a(C0392ib nativeAd) {
        kotlin.jvm.internal.n.f(nativeAd, "nativeAd");
        List<View> listA = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, listA);
        AdapterNativeAdViewBinder adapterNativeAdViewBinderF = nativeAd.f();
        if (adapterNativeAdViewBinderF != null) {
            adapterNativeAdViewBinderF.setBodyView(this.f29180a.getBodyView());
            adapterNativeAdViewBinderF.setMediaView(this.f29180a.getMediaView());
            adapterNativeAdViewBinderF.setCallToActionView(this.f29180a.getCallToActionView());
            adapterNativeAdViewBinderF.setTitleView(this.f29180a.getTitleView());
            adapterNativeAdViewBinderF.setIconView(this.f29180a.getIconView());
            adapterNativeAdViewBinderF.setAdvertiserView(this.f29180a.getAdvertiserView());
            adapterNativeAdViewBinderF.setNativeAdView(frameLayout);
            addView(adapterNativeAdViewBinderF.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.f29180a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.f29180a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.f29180a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.f29180a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f29180a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.f29180a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0445lb(Context context) {
        super(context);
        kotlin.jvm.internal.n.f(context, "context");
        this.f29180a = new NativeAdViewHolder();
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
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            kotlin.jvm.internal.n.e(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }
}
