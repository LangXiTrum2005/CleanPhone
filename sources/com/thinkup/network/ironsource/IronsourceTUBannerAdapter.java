package com.thinkup.network.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.p004ironsource.mediationsdk.integration.IntegrationHelper;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class IronsourceTUBannerAdapter extends CustomBannerAdapter {
    ISDemandOnlyBannerLayout m;
    String o0;
    BannerAdView oo;
    private final String om = getClass().getSimpleName();
    String o = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f42591n = false;

    /* JADX INFO: renamed from: com.thinkup.network.ironsource.IronsourceTUBannerAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        final /* synthetic */ Context m;
        final /* synthetic */ Map o;

        public AnonymousClass1(Map map, Context context) {
            this.o = map;
            this.m = context;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            IronsourceTUBannerAdapter.this.notifyATLoadFail("", str);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x004b  */
        /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            ISBannerSize iSBannerSize;
            AdSize adSizeLarge;
            try {
                byte b2 = 3;
                if (!TextUtils.isEmpty(IronsourceTUBannerAdapter.this.o0)) {
                    String stringFromMap = TUInitMediation.getStringFromMap(this.o, "size");
                    switch (stringFromMap.hashCode()) {
                        case -559799608:
                            if (!stringFromMap.equals("300x250")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 1507809730:
                            if (!stringFromMap.equals("320x50")) {
                                b2 = -1;
                            }
                            break;
                        case 1507809854:
                            if (!stringFromMap.equals("320x90")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 1622564786:
                            if (!stringFromMap.equals("728x90")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        adSizeLarge = AdSize.large();
                    } else if (b2 != 1) {
                        adSizeLarge = b2 != 2 ? AdSize.banner() : AdSize.leaderboard();
                    } else {
                        adSizeLarge = AdSize.mediumRectangle();
                    }
                    Context context = this.m;
                    IronsourceTUBannerAdapter ironsourceTUBannerAdapter = IronsourceTUBannerAdapter.this;
                    BannerAdLoader.loadAd(new BannerAdRequest.Builder(context, ironsourceTUBannerAdapter.o, ironsourceTUBannerAdapter.o0, adSizeLarge).build(), new BannerAdLoaderListener() { // from class: com.thinkup.network.ironsource.IronsourceTUBannerAdapter.1.1
                        @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
                        public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
                            String unused = IronsourceTUBannerAdapter.this.om;
                            Objects.toString(ironSourceError);
                            IronsourceTUInitManager.getInstance().o0(IronsourceTUBannerAdapter.this.o);
                            IronsourceTUBannerAdapter ironsourceTUBannerAdapter2 = IronsourceTUBannerAdapter.this;
                            StringBuilder sb = new StringBuilder();
                            sb.append(ironSourceError.getErrorCode());
                            ironsourceTUBannerAdapter2.notifyATLoadFail(sb.toString(), ironSourceError.getErrorMessage());
                        }

                        @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
                        public final void onBannerAdLoaded(BannerAdView bannerAdView) {
                            String unused = IronsourceTUBannerAdapter.this.om;
                            Objects.toString(bannerAdView);
                            IronsourceTUBannerAdapter.this.oo = bannerAdView;
                            bannerAdView.setListener(new BannerAdViewListener() { // from class: com.thinkup.network.ironsource.IronsourceTUBannerAdapter.1.1.1
                                @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
                                public final void onBannerAdClicked(BannerAdView bannerAdView2) {
                                    CustomBannerEventListener customBannerEventListener = IronsourceTUBannerAdapter.this.mImpressionEventListener;
                                    if (customBannerEventListener != null) {
                                        customBannerEventListener.onBannerAdClicked();
                                    }
                                }

                                @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
                                public final void onBannerAdShown(BannerAdView bannerAdView2) {
                                    CustomBannerEventListener customBannerEventListener = IronsourceTUBannerAdapter.this.mImpressionEventListener;
                                    if (customBannerEventListener != null) {
                                        customBannerEventListener.onBannerAdShow();
                                    }
                                }
                            });
                            if (((TUBaseAdInternalAdapter) IronsourceTUBannerAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) IronsourceTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    });
                    return;
                }
                if (!(this.m instanceof Activity)) {
                    IronsourceTUBannerAdapter.this.notifyATLoadFail("", "Ironsource activity must be activity.");
                    return;
                }
                String stringFromMap2 = TUInitMediation.getStringFromMap(this.o, "size");
                switch (stringFromMap2.hashCode()) {
                    case -559799608:
                        if (!stringFromMap2.equals("300x250")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 109549001:
                        if (!stringFromMap2.equals("smart")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 1507809730:
                        if (!stringFromMap2.equals("320x50")) {
                            b2 = -1;
                        }
                        break;
                    case 1507809854:
                        if (!stringFromMap2.equals("320x90")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    iSBannerSize = ISBannerSize.LARGE;
                } else if (b2 != 1) {
                    iSBannerSize = b2 != 2 ? ISBannerSize.BANNER : ISBannerSize.SMART;
                } else {
                    iSBannerSize = ISBannerSize.RECTANGLE;
                }
                IronsourceTUBannerAdapter.this.m = IronSource.createBannerForDemandOnly((Activity) this.m, iSBannerSize);
                IronsourceTUBannerAdapter.this.m.setBannerDemandOnlyListener(new ISDemandOnlyBannerListener() { // from class: com.thinkup.network.ironsource.IronsourceTUBannerAdapter.1.2
                    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
                    public final void onBannerAdClicked(String str) {
                        CustomBannerEventListener customBannerEventListener = IronsourceTUBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClicked();
                        }
                    }

                    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
                    public final void onBannerAdLeftApplication(String str) {
                    }

                    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
                    public final void onBannerAdLoadFailed(String str, IronSourceError ironSourceError) {
                        IronsourceTUInitManager.getInstance().o0(IronsourceTUBannerAdapter.this.o);
                        IronsourceTUBannerAdapter ironsourceTUBannerAdapter2 = IronsourceTUBannerAdapter.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(ironSourceError.getErrorCode());
                        ironsourceTUBannerAdapter2.notifyATLoadFail(sb.toString(), ironSourceError.getErrorMessage());
                    }

                    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
                    public final void onBannerAdLoaded(String str) {
                        if (((TUBaseAdInternalAdapter) IronsourceTUBannerAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) IronsourceTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }

                    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
                    public final void onBannerAdShown(String str) {
                        CustomBannerEventListener customBannerEventListener = IronsourceTUBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }
                });
                IronsourceTUInitManager.getInstance().m(IronsourceTUBannerAdapter.this.o);
                Activity activity = (Activity) this.m;
                IronsourceTUBannerAdapter ironsourceTUBannerAdapter2 = IronsourceTUBannerAdapter.this;
                IronSource.loadISDemandOnlyBanner(activity, ironsourceTUBannerAdapter2.m, ironsourceTUBannerAdapter2.o);
            } catch (Throwable th) {
                IronsourceTUBannerAdapter.this.notifyATLoadFail("", th.getMessage());
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        if (this.f42591n) {
            IronsourceTUInitManager.getInstance().o0(this.o);
            IronSource.destroyISDemandOnlyBanner(this.o);
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        if (!TextUtils.isEmpty(this.o0)) {
            return this.oo;
        }
        this.f42591n = true;
        return this.m;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.o = TUInitMediation.getStringFromMap(map, "instance_id");
        IronsourceTUInitManager.getInstance().o(context, map, tUBidRequestInfoListener, 2);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return IronsourceTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return IronsourceTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_key");
        this.o = TUInitMediation.getStringFromMap(map, "instance_id");
        this.o0 = TUInitMediation.getStringFromMap(map, "payload");
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(this.o)) {
            notifyATLoadFail("", "Ironsource app_key or instance_id is empty.");
            return;
        }
        if (!IronsourceTUInitManager.getInstance().n(this.o)) {
            if (TUSDK.isNetworkLogDebug()) {
                IntegrationHelper.validateIntegration(context);
            }
            IronsourceTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1(map, context));
        } else {
            notifyATLoadFail("", "Ironsource banner(" + this.o + ") has been load.");
        }
    }
}
