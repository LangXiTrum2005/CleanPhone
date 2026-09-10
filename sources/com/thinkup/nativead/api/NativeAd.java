package com.thinkup.nativead.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdRevenueListener;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUCustomVideo;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.mn.on.o0;
import com.thinkup.core.common.n.mn;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.nm;
import com.thinkup.core.common.n.o0m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.om;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o;
import com.thinkup.core.common.oo0.m0;
import com.thinkup.core.common.oo0.n;
import com.thinkup.core.common.oo0.oo;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.nativead.o.m;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class NativeAd {
    private boolean hasSetShowTkDetail;
    private View innerChildView;
    private o mAdCacheInfo;
    protected com.thinkup.nativead.unitgroup.o mBaseNativeAd;
    DownloadConfirmListener mConfirmListener;
    private Context mContext;
    private TUNativeDislikeListener mDislikeListener;
    TUEventInterface mEventInterface;
    private boolean mIsDestroyed;
    private int mNativeAdHeight;
    private int mNativeAdWidth;
    private TUNativeEventListener mNativeEventListener;
    TUNativeAdView mNativeView;
    private String mPlacementId;
    private boolean mRecordedImpression;
    private boolean mRecordedShow;
    private TUAdRevenueListener mRevenueListener;
    TUNativeMaterial nativeMaterial;
    private TUNativeAdInfo.AdPrepareInfo thirdPartyAdPrepareInfo;
    private final String TAG = getClass().getSimpleName();
    private boolean hasCallPrepareApi = false;
    private boolean hasCallPrepareRenderApi = false;
    private boolean hasReportRenderTypeAgent = false;
    View.OnClickListener mDefaultCloseViewListener = new View.OnClickListener() { // from class: com.thinkup.nativead.api.NativeAd.11
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.thinkup.nativead.unitgroup.o oVar = NativeAd.this.mBaseNativeAd;
            if (oVar != null) {
                oVar.notifyAdDislikeClick();
            }
        }
    };
    boolean isManualImpressionTrack = false;

    public interface DownloadConfirmListener {
        void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo);
    }

    public interface ImpressionEventListener {
        void onImpression();
    }

    public NativeAd(Context context, String str, o oVar) {
        this.mNativeAdWidth = 0;
        this.mNativeAdHeight = 0;
        this.mContext = context.getApplicationContext();
        this.mPlacementId = str;
        this.mAdCacheInfo = oVar;
        com.thinkup.nativead.unitgroup.o oVar2 = (com.thinkup.nativead.unitgroup.o) oVar.om();
        this.mBaseNativeAd = oVar2;
        oVar2.setNativeEventListener(new nm() { // from class: com.thinkup.nativead.api.NativeAd.1
            @Override // com.thinkup.core.common.n.nm
            public final void onAdClicked(View view) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleClick(nativeAd.mNativeView, view);
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdDislikeButtonClick() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleAdDislikeButtonClick(nativeAd.mNativeView);
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdImpressed() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleImpression(nativeAd.mNativeView);
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoEnd() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoEnd(nativeAd.mNativeView);
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoProgress(int i2) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoProgress(nativeAd.mNativeView, i2);
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoStart() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoStart(nativeAd.mNativeView);
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onDeeplinkCallback(boolean z2) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleDeeplinkCallback(nativeAd.mNativeView, z2);
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onDownloadConfirmCallback(Context context2, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                NativeAd.this.handleDownloadConfirm(context2, view, tUNetworkConfirmInfo);
            }
        });
        com.thinkup.nativead.unitgroup.o oVar3 = this.mBaseNativeAd;
        if (oVar3 instanceof CustomNativeAd) {
            this.nativeMaterial = new m((CustomNativeAd) oVar3, isSupportRenderToInnerTemplate());
        }
        o oVar4 = this.mAdCacheInfo;
        if (oVar4 == null || oVar4.mo() == null || this.mAdCacheInfo.mo().mm() == null) {
            return;
        }
        Map<String, Object> mapMm = this.mAdCacheInfo.mo().mm();
        this.mNativeAdWidth = ((Integer) o00.o(mapMm, "key_width", 0)).intValue();
        this.mNativeAdHeight = ((Integer) o00.o(mapMm, "key_height", 0)).intValue();
    }

    private void bindListener() {
        TUNativePrepareInfo nativePrepareInfo;
        View closeView;
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar instanceof CustomNativeAd) {
            CustomNativeAd customNativeAd = (CustomNativeAd) oVar;
            if (customNativeAd.checkHasCloseViewListener() || (nativePrepareInfo = customNativeAd.getNativePrepareInfo()) == null || (closeView = nativePrepareInfo.getCloseView()) == null) {
                return;
            }
            closeView.setOnClickListener(this.mDefaultCloseViewListener);
        }
    }

    private void checkBindView(TUNativePrepareInfo tUNativePrepareInfo) {
        if (tUNativePrepareInfo == null) {
            return;
        }
        if (tUNativePrepareInfo.getTitleView() == null) {
            printNotSetViewLog("titleView");
        }
        if (tUNativePrepareInfo.getCtaView() == null) {
            printNotSetViewLog("ctaView");
        }
        if (tUNativePrepareInfo.getDescView() == null) {
            printNotSetViewLog("descView");
        }
        if (tUNativePrepareInfo.getIconView() == null) {
            printNotSetViewLog("iconView");
        }
        if (tUNativePrepareInfo.getMainImageView() == null) {
            printNotSetViewLog("mainImageView");
        }
    }

    private void checkToReportRenderErrorAgent(boolean z2) {
        n0 detail;
        String str;
        try {
            if (this.mRecordedShow && this.mRecordedImpression) {
                return;
            }
            if (this.hasReportRenderTypeAgent) {
                return;
            }
            this.hasReportRenderTypeAgent = true;
            com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
            if (oVar == null || (detail = oVar.getDetail()) == null || detail.n0n() != 66) {
                return;
            }
            String str2 = "2";
            String str3 = this.hasCallPrepareRenderApi ? "1" : "2";
            String str4 = this.hasCallPrepareApi ? "1" : "2";
            if (!this.mRecordedShow && !this.mRecordedImpression) {
                str2 = "1";
            } else if (this.mRecordedImpression) {
                str2 = "";
            }
            if (z2) {
                str2 = "3";
                str = "0";
                str4 = str;
            } else {
                str = str3;
            }
            Map<String, Object> networkInfoMap = this.mBaseNativeAd.getNetworkInfoMap();
            Object obj = networkInfoMap.get("dsp_id");
            Object obj2 = networkInfoMap.get("offer_id");
            oo.o(detail, str2, str, str4, obj != null ? obj.toString() : "", obj2 != null ? obj2.toString() : "");
        } catch (Throwable th) {
            th.getMessage();
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillRenderAreaToTrackingInfo(n0 n0Var, TUNativeAdView tUNativeAdView) {
        if (n0Var == null || tUNativeAdView == null || n0Var.n0n() != 66) {
            return;
        }
        n0Var.o(tUNativeAdView.getWidth(), tUNativeAdView.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fillShowTrackingInfo(n0 n0Var) {
        if (!this.hasSetShowTkDetail) {
            this.hasSetShowTkDetail = true;
            if (n0Var != null) {
                m0m.o(this.mContext, n0Var);
            }
        }
    }

    private boolean isNativeExpressByNativeAd() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return false;
        }
        return ((CustomNativeAd) oVar).isNativeExpress();
    }

    private boolean isSupportRenderToInnerTemplate() {
        return isSupportRenderToInnerTemplate(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void prepareOnUiThread(TUNativeAdView tUNativeAdView, TUNativePrepareInfo tUNativePrepareInfo) {
        try {
            if (this.mIsDestroyed) {
                return;
            }
            this.hasCallPrepareApi = true;
            if (tUNativeAdView != null) {
                TUNativeAdInfo.AdPrepareInfo adPrepareInfo = this.thirdPartyAdPrepareInfo;
                if (adPrepareInfo != null) {
                    com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
                    if (oVar instanceof CustomNativeAd) {
                        tUNativePrepareInfo = ((CustomNativeAd) oVar).castToTUNativePrepareInfo(adPrepareInfo);
                    }
                }
                if (tUNativePrepareInfo == null) {
                    tUNativePrepareInfo = new TUNativePrepareInfo();
                }
                this.mBaseNativeAd.setNativePrepareInfo(tUNativePrepareInfo);
                this.mBaseNativeAd.prepare(tUNativeAdView, tUNativePrepareInfo);
                bindListener();
                if (!this.mBaseNativeAd.isNativeExpress()) {
                    checkBindView(tUNativePrepareInfo);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void printNotSetViewLog(String str) {
        Log.w(this.TAG, "The " + str + " is not set, it may cause the ad to not be clicked normally.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void renderAdOnUiThread(TUNativeAdView tUNativeAdView, View view) {
        com.thinkup.core.common.mn.o0.m serverExtraInfo;
        com.thinkup.core.common.inner.mixad.m.oo ooVar;
        try {
            if (this.mIsDestroyed) {
                return;
            }
            if (tUNativeAdView != null) {
                tUNativeAdView.clear();
            }
            if (tUNativeAdView == null) {
                Log.e(mo.oo0, "renderAdContainer: TUNativeAdView cannot be null for template-rendering ads!");
                return;
            }
            View adMediaView = null;
            if (isNativeExpressByNativeAd()) {
                com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
                if (oVar != null && (adMediaView = oVar.getAdMediaView(tUNativeAdView, Integer.valueOf(tUNativeAdView.getWidth()))) == null) {
                    Log.e(mo.oo0, "renderAdContainer: getAdMediaView() cannot be null for template-rendering ads!");
                    return;
                }
            } else {
                if (isSupportRenderToInnerTemplate(view != null) && (view = this.innerChildView) == null) {
                    com.thinkup.core.common.mn.o0.o oVarO = new com.thinkup.core.common.mn.o0.o.C0664o().o(tUNativeAdView.getContext()).o(this.mBaseNativeAd.getDetail()).o(new com.thinkup.core.common.mn.oo.o() { // from class: com.thinkup.nativead.api.NativeAd.8
                        @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
                        public final void onAdDislikeButtonClick() {
                            super.onAdDislikeButtonClick();
                            NativeAd nativeAd = NativeAd.this;
                            nativeAd.handleAdDislikeButtonClick(nativeAd.mNativeView);
                        }
                    }).o(new o0(this.mBaseNativeAd, this.mAdCacheInfo.oo().getServerExtraInfo().o())).o(this.mNativeAdWidth).m(this.mNativeAdHeight).o();
                    TUBaseAdAdapter tUBaseAdAdapterOo = this.mAdCacheInfo.oo();
                    if (tUBaseAdAdapterOo == null || (serverExtraInfo = tUBaseAdAdapterOo.getServerExtraInfo()) == null) {
                        ooVar = null;
                    } else {
                        oVarO.o(serverExtraInfo);
                        ooVar = serverExtraInfo.mm() ? new com.thinkup.core.common.inner.mixad.m.oo() : null;
                        if (ooVar != null) {
                            ooVar.o(new com.thinkup.core.common.inner.mixad.n.m(oVarO));
                        }
                    }
                    if (ooVar != null) {
                        view = ooVar.o();
                        this.thirdPartyAdPrepareInfo = ooVar.m();
                        this.innerChildView = view;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    Log.e(mo.oo0, "renderAdContainer: selfRenderView cannot be null for self-rendering ads!");
                    checkToReportRenderErrorAgent(true);
                    return;
                }
                adMediaView = view;
            }
            this.hasCallPrepareRenderApi = true;
            this.mNativeView = tUNativeAdView;
            tUNativeAdView.attachNativeAd(this);
            if (adMediaView != null) {
                adMediaView.setVisibility(0);
                renderViewToWindow(adMediaView);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void renderViewToWindow(View view) {
        omn.m(this.mPlacementId, mo.o0m.o0n, mo.o0m.omn, mo.o0m.nn, "");
        ViewGroup customAdContainer = this.mBaseNativeAd.getCustomAdContainer();
        int iHashCode = hashCode();
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (customAdContainer != null) {
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            customAdContainer.addView(view);
        }
        if (customAdContainer != null) {
            view = customAdContainer;
        }
        this.mNativeView.renderView(iHashCode, view, new ImpressionEventListener() { // from class: com.thinkup.nativead.api.NativeAd.9
            @Override // com.thinkup.nativead.api.NativeAd.ImpressionEventListener
            public final void onImpression() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.thinkup.nativead.unitgroup.o oVar = NativeAd.this.mBaseNativeAd;
                n0 detail = oVar != null ? oVar.getDetail() : null;
                if (detail != null && TextUtils.isEmpty(detail.omm())) {
                    detail.nm(nn.o(detail.oon0(), detail.mon(), jCurrentTimeMillis));
                }
                com.thinkup.nativead.unitgroup.o oVar2 = NativeAd.this.mBaseNativeAd;
                if (oVar2 instanceof CustomNativeAd) {
                    ((CustomNativeAd) oVar2).setShowId(detail.omm());
                }
                NativeAd nativeAd = NativeAd.this;
                nativeAd.recordShow(nativeAd.mNativeView);
            }
        });
    }

    public synchronized void clear(TUNativeAdView tUNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        try {
            com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
            if (oVar != null) {
                oVar.clear(this.mNativeView);
            }
        } catch (Throwable unused) {
        }
        TUNativeAdView tUNativeAdView2 = this.mNativeView;
        if (tUNativeAdView2 != null) {
            tUNativeAdView2.clearImpressionListener(hashCode());
            this.mNativeView = null;
        }
    }

    public synchronized void destory() {
        try {
            if (this.mIsDestroyed) {
                return;
            }
            checkToReportRenderErrorAgent(false);
            clear(this.mNativeView);
            this.mIsDestroyed = true;
            this.mNativeEventListener = null;
            this.mDislikeListener = null;
            this.mDefaultCloseViewListener = null;
            this.mNativeView = null;
            KeyEvent.Callback callback = this.innerChildView;
            if (callback != null) {
                if (callback instanceof com.thinkup.core.common.mn.oo.o.o0) {
                    ((com.thinkup.core.common.mn.oo.o.o0) callback).destroyNativeAd();
                }
                this.innerChildView = null;
            }
            this.thirdPartyAdPrepareInfo = null;
            com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
            if (oVar != null) {
                oVar.setNativePrepareInfo(null);
                this.mBaseNativeAd.destroy();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() throws Throwable {
        checkToReportRenderErrorAgent(false);
        super.finalize();
    }

    public TUAdInfo getAdInfo() {
        return mn.o(this.mBaseNativeAd, this.mAdCacheInfo.oo(), this.mRecordedImpression ? 5 : 4);
    }

    public int getAdInteractionType() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return 0;
        }
        return ((CustomNativeAd) oVar).getNativeAdInteractionType();
    }

    public TUNativeMaterial getAdMaterial() {
        return this.nativeMaterial;
    }

    @Deprecated
    public TUCustomVideo getCustomVideo() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return null;
        }
        return ((CustomNativeAd) oVar).getNativeCustomVideo();
    }

    public int getDownloadProgress() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return 0;
        }
        return oVar.getDownloadProgress();
    }

    public int getDownloadStatus() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return 0;
        }
        return oVar.getDownloadStatus();
    }

    public int getNativeType() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return 0;
        }
        return ((CustomNativeAd) oVar).getNativeType();
    }

    public Object getObject() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return null;
        }
        return oVar.getObject();
    }

    public double getVideoDuration() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return 0.0d;
        }
        return ((CustomNativeAd) oVar).getVideoDuration();
    }

    public double getVideoProgress() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return 0.0d;
        }
        return ((CustomNativeAd) oVar).getVideoProgress();
    }

    public synchronized void handleAdDislikeButtonClick(final TUNativeAdView tUNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.4
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mDislikeListener != null) {
                    TUNativeDislikeListener tUNativeDislikeListener = NativeAd.this.mDislikeListener;
                    TUNativeAdView tUNativeAdView2 = tUNativeAdView;
                    NativeAd nativeAd = NativeAd.this;
                    tUNativeDislikeListener.onAdCloseButtonClick(tUNativeAdView2, mn.o(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.oo()));
                }
            }
        });
    }

    public synchronized void handleClick(final TUNativeAdView tUNativeAdView, View view) {
        try {
            if (this.mIsDestroyed) {
                return;
            }
            com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
            if (oVar != null) {
                n0 detail = oVar.getDetail();
                if (detail.n0n() == 66) {
                    try {
                        Object object = this.mBaseNativeAd.getObject();
                        if (object instanceof Map) {
                            m0m.o(detail, (Map<String, Object>) object);
                        }
                    } catch (Throwable unused) {
                    }
                }
                n.o(this.mContext.getApplicationContext()).o(6, detail);
                if (detail.o0no()) {
                    return;
                } else {
                    omn.o(detail, mo.o0m.o0, mo.o0m.no, "");
                }
            }
            if (this.mAdCacheInfo != null && this.mBaseNativeAd != null) {
                com.thinkup.core.common.ooo.n.o().m(this.mAdCacheInfo.oo(), this.mBaseNativeAd.getDetail(), isNativeExpressByNativeAd());
            }
            o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (NativeAd.this.mNativeEventListener != null) {
                        TUNativeEventListener tUNativeEventListener = NativeAd.this.mNativeEventListener;
                        TUNativeAdView tUNativeAdView2 = tUNativeAdView;
                        NativeAd nativeAd = NativeAd.this;
                        tUNativeEventListener.onAdClicked(tUNativeAdView2, mn.o(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.oo()));
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void handleDeeplinkCallback(final TUNativeAdView tUNativeAdView, final boolean z2) {
        if (this.mIsDestroyed) {
            return;
        }
        o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.14
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener == null || !(NativeAd.this.mNativeEventListener instanceof TUNativeEventExListener)) {
                    return;
                }
                TUNativeEventExListener tUNativeEventExListener = (TUNativeEventExListener) NativeAd.this.mNativeEventListener;
                TUNativeAdView tUNativeAdView2 = tUNativeAdView;
                NativeAd nativeAd = NativeAd.this;
                tUNativeEventExListener.onDeeplinkCallback(tUNativeAdView2, mn.o(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.oo()), z2);
            }
        });
    }

    public synchronized void handleDownloadConfirm(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        com.thinkup.nativead.unitgroup.o oVar;
        if (this.mIsDestroyed) {
            return;
        }
        DownloadConfirmListener downloadConfirmListener = this.mConfirmListener;
        if (downloadConfirmListener != null && (oVar = this.mBaseNativeAd) != null) {
            if (context == null) {
                context = this.mContext;
            }
            downloadConfirmListener.onDownloadConfirm(context, mn.o(oVar, this.mAdCacheInfo.oo()), view, tUNetworkConfirmInfo);
        }
    }

    public synchronized void handleImpression(final TUNativeAdView tUNativeAdView) {
        try {
            if (!this.mRecordedImpression && !this.mIsDestroyed) {
                this.mRecordedImpression = true;
                if (this.mAdCacheInfo != null && this.mBaseNativeAd != null) {
                    com.thinkup.core.common.ooo.n.o().o(this.mAdCacheInfo.oo(), this.mBaseNativeAd.getDetail(), isNativeExpressByNativeAd());
                }
                com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (NativeAd.this.mIsDestroyed) {
                            return;
                        }
                        try {
                            com.thinkup.nativead.unitgroup.o oVar = NativeAd.this.mBaseNativeAd;
                            if (oVar != null) {
                                n0 detail = oVar.getDetail();
                                detail.o(NativeAd.this.mBaseNativeAd.getNetworkInfoMap());
                                omn.o(detail, mo.o0m.f41901n, mo.o0m.no, "");
                                NativeAd.this.fillShowTrackingInfo(detail);
                                NativeAd.this.fillRenderAreaToTrackingInfo(detail, tUNativeAdView);
                                m0m.m(detail, NativeAd.this.mAdCacheInfo.oo());
                                n.o(NativeAd.this.mContext.getApplicationContext()).o(4, detail, NativeAd.this.mAdCacheInfo.oo().getUnitGroupInfo());
                                NativeAd nativeAd = NativeAd.this;
                                final mn mnVarO = mn.o(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.oo());
                                if (mnVarO.getNetworkFirmId() == -1) {
                                    m0.o("Native", NativeAd.this.mAdCacheInfo.oo(), NativeAd.this.mBaseNativeAd);
                                }
                                o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.13.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (NativeAd.this.mRevenueListener != null) {
                                            NativeAd.this.mRevenueListener.onAdRevenuePaid(mnVarO);
                                        }
                                        if (NativeAd.this.mNativeEventListener != null) {
                                            NativeAd.this.mNativeEventListener.onAdImpressed(tUNativeAdView, mnVarO);
                                        }
                                    }
                                });
                            }
                        } catch (Exception unused) {
                            Log.e("NativeAd", "BaseNativeAd has been destotyed.");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void handleVideoEnd(final TUNativeAdView tUNativeAdView) {
        try {
            if (this.mIsDestroyed) {
                return;
            }
            com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
            if (oVar != null) {
                n0 detail = oVar.getDetail();
                detail.oon = 100;
                n.o(this.mContext.getApplicationContext()).o(9, detail);
            }
            o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (NativeAd.this.mNativeEventListener != null) {
                        NativeAd.this.mNativeEventListener.onAdVideoEnd(tUNativeAdView);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void handleVideoProgress(final TUNativeAdView tUNativeAdView, final int i2) {
        if (this.mIsDestroyed) {
            return;
        }
        o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.6
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoProgress(tUNativeAdView, i2);
                }
            }
        });
    }

    public synchronized void handleVideoStart(final TUNativeAdView tUNativeAdView) {
        try {
            if (this.mIsDestroyed) {
                return;
            }
            com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
            if (oVar != null) {
                n0 detail = oVar.getDetail();
                detail.oon = 0;
                n.o(this.mContext.getApplicationContext()).o(8, detail);
            }
            o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (NativeAd.this.mNativeEventListener != null) {
                        NativeAd.this.mNativeEventListener.onAdVideoStart(tUNativeAdView);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isNativeExpress() {
        if (isSupportRenderToInnerTemplate()) {
            return true;
        }
        return isNativeExpressByNativeAd();
    }

    public boolean isValid() {
        com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
        if (oVar == null || !(oVar instanceof CustomNativeAd)) {
            return true;
        }
        return oVar.isValid();
    }

    public void manualImpressionTrack() {
        if (this.mIsDestroyed) {
            Log.e(this.TAG, "NativeAd had been destroyed.");
            return;
        }
        if (!this.isManualImpressionTrack) {
            if (o0n.m().m0o()) {
                Log.e(this.TAG, "Must call \"setManualImpressionTrack(true);\" first.");
                return;
            }
            return;
        }
        TUNativeAdView tUNativeAdView = this.mNativeView;
        o oVar = this.mAdCacheInfo;
        TUBaseAdAdapter tUBaseAdAdapterOo = oVar != null ? oVar.oo() : null;
        if (tUBaseAdAdapterOo != null && tUBaseAdAdapterOo.supportImpressionCallback()) {
            if (o0n.m().m0o()) {
                Log.e(this.TAG, "This NativeAd don't support tracking impressions manually.");
                return;
            }
            return;
        }
        if (tUNativeAdView == null) {
            if (o0n.m().m0o()) {
                Log.e(this.TAG, "NativeAd don't call render.");
                return;
            }
            return;
        }
        if (!tUNativeAdView.isShown()) {
            if (o0n.m().m0o()) {
                Log.e(this.TAG, "TUNativeAdView isn't visible.");
            }
        } else if (!tUNativeAdView.isAttachedToWindow()) {
            if (o0n.m().m0o()) {
                Log.e(this.TAG, "TUNativeAdView don't attach window.");
            }
        } else {
            if (o0n.m().m0o()) {
                Log.i(this.TAG, "try to track impression manually.");
            }
            com.thinkup.nativead.unitgroup.o oVar2 = this.mBaseNativeAd;
            if (oVar2 instanceof CustomNativeAd) {
                ((CustomNativeAd) oVar2).impressionTrack(tUNativeAdView);
            }
        }
    }

    public void onPause() {
        com.thinkup.nativead.unitgroup.o oVar;
        if (this.mIsDestroyed || (oVar = this.mBaseNativeAd) == null) {
            return;
        }
        oVar.onPause();
    }

    public void onResume() {
        com.thinkup.nativead.unitgroup.o oVar;
        if (this.mIsDestroyed || (oVar = this.mBaseNativeAd) == null) {
            return;
        }
        oVar.onResume();
    }

    public void pauseVideo() {
        com.thinkup.nativead.unitgroup.o oVar;
        if (this.mIsDestroyed || (oVar = this.mBaseNativeAd) == null) {
            return;
        }
        oVar.pauseVideo();
    }

    public synchronized void prepare(final TUNativeAdView tUNativeAdView, final TUNativePrepareInfo tUNativePrepareInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.10
            @Override // java.lang.Runnable
            public final void run() {
                NativeAd.this.prepareOnUiThread(tUNativeAdView, tUNativePrepareInfo);
            }
        });
    }

    public synchronized void recordShow(TUNativeAdView tUNativeAdView) {
        om omVarO;
        try {
            if (!this.mRecordedShow) {
                final n0 detail = this.mBaseNativeAd.getDetail();
                this.mRecordedShow = true;
                if (this.mAdCacheInfo != null && (omVarO = ooo.o().o(this.mPlacementId, "0")) != null) {
                    omVarO.o(this.mAdCacheInfo);
                }
                com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.12
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (NativeAd.this.mIsDestroyed || NativeAd.this.mAdCacheInfo == null) {
                            return;
                        }
                        NativeAd.this.fillShowTrackingInfo(detail);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            String[] strArrSplit = detail.omm().split("_");
                            jCurrentTimeMillis = Long.parseLong(strArrSplit[strArrSplit.length - 1]);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        long j = jCurrentTimeMillis;
                        com.thinkup.nativead.unitgroup.o oVar = NativeAd.this.mBaseNativeAd;
                        if (oVar != null && (oVar instanceof CustomNativeAd)) {
                            ((CustomNativeAd) oVar).setShowId(detail.omm());
                        }
                        com.thinkup.core.common.o.o().o(NativeAd.this.mContext.getApplicationContext(), NativeAd.this.mAdCacheInfo);
                        n.o(NativeAd.this.mContext).o(13, detail, NativeAd.this.mAdCacheInfo.oo().getUnitGroupInfo(), j);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void renderAdContainer(final TUNativeAdView tUNativeAdView, final View view) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.nativead.api.NativeAd.7
            @Override // java.lang.Runnable
            public final void run() {
                NativeAd.this.renderAdOnUiThread(tUNativeAdView, view);
            }
        });
    }

    public void resumeVideo() {
        com.thinkup.nativead.unitgroup.o oVar;
        if (this.mIsDestroyed || (oVar = this.mBaseNativeAd) == null) {
            return;
        }
        oVar.resumeVideo();
    }

    public void setAdDownloadListener(TUEventInterface tUEventInterface) {
        this.mEventInterface = tUEventInterface;
        o0m o0mVarN = o0n.m().n();
        if (o0mVarN == null) {
            this.mBaseNativeAd.setDownloadListener(null);
            Log.e(this.TAG, "This method is not supported in this version");
        } else if (tUEventInterface != null) {
            this.mBaseNativeAd.setDownloadListener(o0mVarN.createDataFetchListener(this.mAdCacheInfo.oo(), this.mBaseNativeAd, tUEventInterface));
        } else {
            this.mBaseNativeAd.setDownloadListener(null);
        }
    }

    public void setAdRevenueListener(TUAdRevenueListener tUAdRevenueListener) {
        this.mRevenueListener = tUAdRevenueListener;
    }

    public void setDevParams(Map<String, Object> map) {
        com.thinkup.nativead.unitgroup.o oVar;
        if (map == null || (oVar = this.mBaseNativeAd) == null || !(oVar instanceof CustomNativeAd)) {
            return;
        }
        oVar.setDevParams(map);
    }

    public void setDislikeCallbackListener(TUNativeDislikeListener tUNativeDislikeListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mDislikeListener = tUNativeDislikeListener;
    }

    public void setDownloadConfirmListener(DownloadConfirmListener downloadConfirmListener) {
        if (downloadConfirmListener != null) {
            com.thinkup.nativead.unitgroup.o oVar = this.mBaseNativeAd;
            if (oVar instanceof CustomNativeAd) {
                ((CustomNativeAd) oVar).registerDownloadConfirmListener();
            }
        } else {
            com.thinkup.nativead.unitgroup.o oVar2 = this.mBaseNativeAd;
            if (oVar2 instanceof CustomNativeAd) {
                ((CustomNativeAd) oVar2).unregeisterDownloadConfirmListener();
            }
        }
        this.mConfirmListener = downloadConfirmListener;
    }

    public void setManualImpressionTrack(boolean z2) {
        this.isManualImpressionTrack = z2;
    }

    public void setNativeEventListener(TUNativeEventListener tUNativeEventListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mNativeEventListener = tUNativeEventListener;
    }

    public void setVideoMute(boolean z2) {
        com.thinkup.nativead.unitgroup.o oVar;
        if (this.mIsDestroyed || (oVar = this.mBaseNativeAd) == null) {
            return;
        }
        oVar.setVideoMute(z2);
    }

    private boolean isSupportRenderToInnerTemplate(boolean z2) {
        com.thinkup.core.common.mn.o0.m serverExtraInfo = this.mAdCacheInfo.oo() != null ? this.mAdCacheInfo.oo().getServerExtraInfo() : null;
        if (serverExtraInfo == null || serverExtraInfo.o00() <= 0) {
            return false;
        }
        return !z2 || serverExtraInfo.o00() > 1;
    }
}
