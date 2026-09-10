package com.thinkup.network.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.MBBidNativeHandler;
import com.mbridge.msdk.out.MBNativeHandler;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListenerPlus;
import com.mbridge.msdk.widget.MBAdChoice;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUNativeAd extends CustomNativeAd {
    MBNativeHandler m;
    boolean m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    MBBidNativeHandler f42570n;
    Context o;
    Campaign o0;
    MBMediaView om;
    String oo;
    private final String mo = "GTMTUNativeAd";
    Boolean on = null;

    public GTMTUNativeAd(Context context, String str, String str2, Campaign campaign, boolean z2) {
        this.o = context.getApplicationContext();
        Map<String, Object> nativeProperties = z2 ? MBBidNativeHandler.getNativeProperties(str, str2) : MBNativeHandler.getNativeProperties(str, str2);
        this.o0 = campaign;
        if (z2) {
            MBBidNativeHandler mBBidNativeHandler = new MBBidNativeHandler(nativeProperties, context);
            this.f42570n = mBBidNativeHandler;
            mBBidNativeHandler.setAdListener(new NativeListener.NativeAdListener() { // from class: com.thinkup.network.gtm.GTMTUNativeAd.1
                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onAdClick(Campaign campaign2) {
                    GTMTUNativeAd.this.notifyAdClicked();
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onAdFramesLoaded(List<Frame> list) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onAdLoadError(String str3) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onAdLoaded(List<Campaign> list, int i2) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onLoggingImpression(int i2) {
                    try {
                        GTMTUInitManager.getInstance().o(GTMTUNativeAd.this.getShowId(), new WeakReference(GTMTUNativeAd.this.o0));
                    } catch (Throwable unused) {
                    }
                    GTMTUNativeAd.this.notifyAdImpression();
                }
            });
        } else {
            MBNativeHandler mBNativeHandler = new MBNativeHandler(nativeProperties, context);
            this.m = mBNativeHandler;
            mBNativeHandler.setAdListener(new NativeListener.NativeAdListener() { // from class: com.thinkup.network.gtm.GTMTUNativeAd.2
                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onAdClick(Campaign campaign2) {
                    GTMTUNativeAd.this.notifyAdClicked();
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onAdFramesLoaded(List<Frame> list) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onAdLoadError(String str3) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onAdLoaded(List<Campaign> list, int i2) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
                public final void onLoggingImpression(int i2) {
                    try {
                        GTMTUInitManager.getInstance().o(GTMTUNativeAd.this.getShowId(), new WeakReference(GTMTUNativeAd.this.o0));
                    } catch (Throwable unused) {
                    }
                    GTMTUNativeAd.this.notifyAdImpression();
                }
            });
        }
        setAdData();
    }

    private void o(boolean z2) {
        this.m0 = z2;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
        MBNativeHandler mBNativeHandler = this.m;
        if (mBNativeHandler != null) {
            mBNativeHandler.unregisterView(view, this.o0);
        }
        MBBidNativeHandler mBBidNativeHandler = this.f42570n;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.unregisterView(view, this.o0);
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        MBMediaView mBMediaView = this.om;
        if (mBMediaView != null) {
            mBMediaView.destory();
            this.om = null;
        }
        MBNativeHandler mBNativeHandler = this.m;
        if (mBNativeHandler != null) {
            mBNativeHandler.setAdListener(null);
            this.m.clearVideoCache();
            this.m.release();
            this.m = null;
        }
        MBBidNativeHandler mBBidNativeHandler = this.f42570n;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.setAdListener(null);
            this.f42570n.clearVideoCache();
            this.f42570n.bidRelease();
            this.f42570n = null;
        }
        this.o = null;
        this.o0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        byte b2;
        try {
            if (this.om == null) {
                MBMediaView mBMediaView = new MBMediaView(this.o);
                this.om = mBMediaView;
                mBMediaView.setIsAllowFullScreen(true);
                this.om.setNativeAd(this.o0);
                Boolean bool = this.on;
                if (bool != null) {
                    this.om.setVideoSoundOnOff(!bool.booleanValue());
                } else {
                    Boolean bool2 = TUSDKGlobalSetting.isGlobalMute;
                    if (bool2 != null) {
                        this.om.setVideoSoundOnOff(!bool2.booleanValue());
                    } else if (!TextUtils.isEmpty(this.oo)) {
                        String str = this.oo;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 48) {
                            if (iHashCode == 49 && str.equals("1")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                        } else if (str.equals("0")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        if (b2 == 0) {
                            this.om.setVideoSoundOnOff(false);
                        } else if (b2 == 1) {
                            this.om.setVideoSoundOnOff(true);
                        }
                    }
                }
                this.om.setOnMediaViewListener(new OnMBMediaViewListenerPlus() { // from class: com.thinkup.network.gtm.GTMTUNativeAd.3
                    @Override // com.mbridge.msdk.out.OnMBMediaViewListenerPlus
                    public final void onEnterFullscreen() {
                    }

                    @Override // com.mbridge.msdk.out.OnMBMediaViewListenerPlus
                    public final void onExitFullscreen() {
                    }

                    @Override // com.mbridge.msdk.out.OnMBMediaViewListenerPlus
                    public final void onFinishRedirection(Campaign campaign, String str2) {
                    }

                    @Override // com.mbridge.msdk.out.OnMBMediaViewListenerPlus
                    public final void onRedirectionFailed(Campaign campaign, String str2) {
                    }

                    @Override // com.mbridge.msdk.out.OnMBMediaViewListenerPlus
                    public final void onStartRedirection(Campaign campaign, String str2) {
                    }

                    @Override // com.mbridge.msdk.out.OnMBMediaViewListenerPlus
                    public final void onVideoAdClicked(Campaign campaign) {
                        GTMTUNativeAd.this.notifyAdClicked();
                    }

                    @Override // com.mbridge.msdk.out.OnMBMediaViewListenerPlus
                    public final void onVideoComplete() {
                        GTMTUNativeAd.this.notifyAdVideoEnd();
                    }

                    @Override // com.mbridge.msdk.out.OnMBMediaViewListenerPlus
                    public final void onVideoStart() {
                        GTMTUNativeAd.this.notifyAdVideoStart();
                    }
                });
            }
            return this.om;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        List<View> clickViewList = tUNativePrepareInfo.getClickViewList();
        if (clickViewList == null) {
            MBNativeHandler mBNativeHandler = this.m;
            if (mBNativeHandler != null) {
                mBNativeHandler.registerView(view, this.o0);
            }
            MBBidNativeHandler mBBidNativeHandler = this.f42570n;
            if (mBBidNativeHandler != null) {
                mBBidNativeHandler.registerView(view, this.o0);
                return;
            }
            return;
        }
        MBNativeHandler mBNativeHandler2 = this.m;
        if (mBNativeHandler2 != null) {
            mBNativeHandler2.registerView(view, clickViewList, this.o0);
        }
        MBBidNativeHandler mBBidNativeHandler2 = this.f42570n;
        if (mBBidNativeHandler2 != null) {
            mBBidNativeHandler2.registerView(view, clickViewList, this.o0);
        }
        if (clickViewList.size() > 0) {
            view.setOnClickListener(null);
        }
    }

    public void setAdData() {
        setTitle(this.o0.getAppName());
        setDescriptionText(this.o0.getAppDesc());
        setIconImageUrl(this.o0.getIconUrl());
        setCallToActionText(this.o0.getAdCall());
        setMainImageUrl(this.o0.getImageUrl());
        setStarRating(Double.valueOf(this.o0.getRating()));
        setVideoDuration(this.o0.getVideoLength());
        MBAdChoice mBAdChoice = new MBAdChoice(this.o);
        mBAdChoice.setCampaign(this.o0);
        setAdLogoView(mBAdChoice);
        CampaignEx campaignEx = (CampaignEx) this.o0;
        if (campaignEx.getVideoUrlEncode() == null || campaignEx.getVideoUrlEncode().length() <= 0) {
            this.mAdSourceType = "2";
        } else {
            this.mAdSourceType = "1";
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void setVideoMute(boolean z2) {
        this.on = Boolean.valueOf(z2);
        MBMediaView mBMediaView = this.om;
        if (mBMediaView != null) {
            mBMediaView.setVideoSoundOnOff(!z2);
        }
    }

    private void o(String str) {
        this.oo = str;
    }
}
