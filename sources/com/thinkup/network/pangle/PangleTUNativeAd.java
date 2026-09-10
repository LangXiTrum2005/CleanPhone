package com.thinkup.network.pangle;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.thinkup.nativead.api.TUNativePrepareExInfo;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PangleTUNativeAd extends CustomNativeAd {
    PAGNativeAdData m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42617n;
    PAGNativeAd o;
    View o0;

    /* JADX INFO: renamed from: com.thinkup.network.pangle.PangleTUNativeAd$1, reason: invalid class name */
    public class AnonymousClass1 implements PAGNativeAdInteractionListener {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdClicked() {
            PangleTUNativeAd.this.notifyAdClicked();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdDismissed() {
            PangleTUNativeAd.this.notifyAdDislikeClick();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdShowed() {
            try {
                PangleTUInitManager.getInstance().o(PangleTUNativeAd.this.getShowId(), new WeakReference(PangleTUNativeAd.this.o));
            } catch (Throwable unused) {
            }
            PangleTUNativeAd.this.notifyAdImpression();
        }
    }

    public PangleTUNativeAd(Context context, String str, PAGNativeAd pAGNativeAd, Map<String, Object> map) {
        this.f42617n = str;
        this.o = pAGNativeAd;
        this.m = pAGNativeAd.getNativeAdData();
        Map<String, Object> mediaExtraInfo = this.o.getMediaExtraInfo();
        if (mediaExtraInfo != null) {
            setNetworkInfoMap(new HashMap(mediaExtraInfo));
        }
        setAdData(context, map);
    }

    private void o(List<View> list, View view) {
        if (!(view instanceof ViewGroup) || view == this.o0) {
            if (view != this.o0) {
                list.add(view);
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                o(list, viewGroup.getChildAt(i2));
            }
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
        o(view);
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        this.o = null;
        this.m = null;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        PAGNativeAdData pAGNativeAdData;
        if (this.o0 == null && (pAGNativeAdData = this.m) != null) {
            this.o0 = pAGNativeAdData.getMediaView();
        }
        return this.o0;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        List<View> creativeClickViewList;
        List<View> clickViewList = tUNativePrepareInfo.getClickViewList();
        if (clickViewList == null || clickViewList.isEmpty()) {
            clickViewList = new ArrayList<>();
            o(clickViewList, view);
        }
        List<View> list = clickViewList;
        ArrayList arrayList = new ArrayList();
        if ((tUNativePrepareInfo instanceof TUNativePrepareExInfo) && (creativeClickViewList = ((TUNativePrepareExInfo) tUNativePrepareInfo).getCreativeClickViewList()) != null) {
            arrayList.addAll(creativeClickViewList);
        }
        try {
            this.o.registerViewForInteraction((ViewGroup) view, list, arrayList, tUNativePrepareInfo.getCloseView(), new AnonymousClass1());
        } catch (Throwable th) {
            Log.e(getClass().getSimpleName(), "preparePangle() >>> error: " + th.getMessage());
        }
    }

    public void setAdData(Context context, Map<String, Object> map) {
        setTitle(this.m.getTitle());
        setDescriptionText(this.m.getDescription());
        PAGImageItem icon = this.m.getIcon();
        if (icon != null) {
            setIconImageUrl(icon.getImageUrl());
        }
        setCallToActionText(this.m.getButtonText());
        setAdLogoView(this.m.getAdLogoView());
    }

    private void o(View view, List<View> list, List<View> list2, View view2) {
        this.o.registerViewForInteraction((ViewGroup) view, list, list2, view2, new AnonymousClass1());
    }

    private void o(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            if (view == this.o0) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                o(viewGroup.getChildAt(i2));
            }
            return;
        }
        view.setOnClickListener(null);
        view.setClickable(false);
    }
}
