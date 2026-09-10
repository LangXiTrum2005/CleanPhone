package com.p004ironsource.adapters.ironsource.nativeAd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p004ironsource.bi;
import com.p004ironsource.ci;
import com.p004ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.mediation.R;
import com.p004ironsource.yh;
import com.p004ironsource.zh;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdViewBinder;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Landroid/widget/FrameLayout$LayoutParams;", "getPrivacyIconLayoutParams", "Landroid/view/View;", "nativeAdView", "", "setNativeAdView", "Lcom/ironsource/bi;", "nativeAd", "Lcom/ironsource/bi;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;", "nativeAdProperties", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;", "Lcom/ironsource/yh;", "<set-?>", "networkNativeAdView", "Lcom/ironsource/yh;", "getNetworkNativeAdView", "()Lcom/ironsource/yh;", "<init>", "(Lcom/ironsource/bi;Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {
    private final bi nativeAd;
    private final NativeAdProperties nativeAdProperties;
    private yh networkNativeAdView;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdOptionsPosition.values().length];
            try {
                iArr[AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(bi nativeAd, NativeAdProperties nativeAdProperties) {
        Intrinsics.f(nativeAd, "nativeAd");
        Intrinsics.f(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = nativeAd;
        this.nativeAdProperties = nativeAdProperties;
    }

    private final FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i3 == 1) {
            i2 = 51;
        } else if (i3 == 2) {
            i2 = 53;
        } else if (i3 == 3) {
            i2 = 83;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 85;
        }
        layoutParams.gravity = i2;
        return layoutParams;
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(View nativeAdView) {
        if (nativeAdView == null) {
            IronLog.INTERNAL.error("nativeAdView is null");
            return;
        }
        if (this.nativeAd.b() == null) {
            IronLog.INTERNAL.error("nativeAd.adData is null");
            return;
        }
        LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
        if (mediaView != null) {
            zh zhVarB = this.nativeAd.b();
            Intrinsics.c(zhVarB);
            WebView webViewL = zhVarB.l();
            if (webViewL != null) {
                mediaView.addView(webViewL, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        zh zhVarB2 = this.nativeAd.b();
        Intrinsics.c(zhVarB2);
        View viewM = zhVarB2.m();
        viewM.setId(R.id.privacy_icon_button);
        viewM.setLayoutParams(getPrivacyIconLayoutParams());
        Context context = nativeAdView.getContext();
        Intrinsics.e(context, "context");
        yh yhVar = new yh(context);
        yhVar.addView(nativeAdView);
        yhVar.addView(viewM);
        this.networkNativeAdView = yhVar;
        yh networkNativeAdView = getNetworkNativeAdView();
        Intrinsics.c(networkNativeAdView);
        this.nativeAd.a(new ci(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), viewM));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public yh getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }
}
