package com.thinkup.network.admob;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobTUNativeAd extends CustomNativeAd implements NativeAd.OnNativeAdLoadedListener {
    LoadCallbackListener m;
    int m0;
    boolean mm;
    boolean mn;
    NativeAdView mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42498n;
    boolean n0;
    boolean nm;
    Boolean nn;
    boolean no;
    Context o;
    String o0;
    boolean o00;
    private boolean o0m;
    private boolean o0n;
    private final String o0o;
    NativeAd om;
    int on;
    MediaView oo;
    private o oo0;
    private Map<String, Object> ooo;

    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public static class o implements Runnable {
        private final WeakReference<AdmobTUNativeAd> o;

        public o(AdmobTUNativeAd admobTUNativeAd) {
            this.o = new WeakReference<>(admobTUNativeAd);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdmobTUNativeAd admobTUNativeAd = this.o.get();
            if (admobTUNativeAd == null || admobTUNativeAd.o0n) {
                return;
            }
            AdmobTUNativeAd.n(admobTUNativeAd);
            admobTUNativeAd.notifyAdImpression();
        }
    }

    private AdmobTUNativeAd(Context context, String str, String str2, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.o0o = "AdmobTUNativeAd";
        this.on = 0;
        this.m0 = -1;
        this.o0m = false;
        this.o0n = false;
        this.ooo = new HashMap();
        this.mm = false;
        this.mn = false;
        this.n0 = false;
        this.no = false;
        this.nm = false;
        this.nn = null;
        this.o = context.getApplicationContext();
        this.m = loadCallbackListener;
        this.f42498n = str;
        this.o0 = str2;
        this.o0m = TUInitMediation.getIntFromMap(map, "admob_show_with_pay_info", 2) == 1;
    }

    public static /* synthetic */ boolean n(AdmobTUNativeAd admobTUNativeAd) {
        admobTUNativeAd.o0n = true;
        return true;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        NativeAdView nativeAdView = this.mo;
        if (nativeAdView != null) {
            o oVar = this.oo0;
            if (oVar != null) {
                nativeAdView.removeCallbacks(oVar);
            }
            this.mo.destroy();
            this.mo = null;
        }
        this.oo = null;
        this.m = null;
        this.o = null;
        NativeAd nativeAd = this.om;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.om = null;
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        MediaContent mediaContent;
        if (this.oo == null) {
            if (this.o == null) {
                return null;
            }
            MediaView mediaView = new MediaView(this.o);
            this.oo = mediaView;
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.om;
            if (nativeAd != null && (mediaContent = nativeAd.getMediaContent()) != null) {
                this.oo.setMediaContent(mediaContent);
                VideoController videoController = mediaContent.getVideoController();
                if (videoController != null) {
                    videoController.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() { // from class: com.thinkup.network.admob.AdmobTUNativeAd.3
                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoEnd() {
                            super.onVideoEnd();
                            AdmobTUNativeAd.this.notifyAdVideoEnd();
                        }

                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoMute(boolean z2) {
                            super.onVideoMute(z2);
                        }

                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoPause() {
                            super.onVideoPause();
                        }

                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoPlay() {
                            super.onVideoPlay();
                        }

                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoStart() {
                            super.onVideoStart();
                            AdmobTUNativeAd.this.notifyAdVideoStart();
                        }
                    });
                }
            }
        }
        return this.oo;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView nativeAdView = new NativeAdView(this.o);
        this.mo = nativeAdView;
        return nativeAdView;
    }

    public void loadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        NativeAdOptions.Builder mediaAspectRatio = new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).setMediaAspectRatio(this.on);
        int i2 = this.m0;
        if (i2 != -1) {
            mediaAspectRatio.setAdChoicesPlacement(i2);
        }
        AdLoader adLoaderBuild = new AdLoader.Builder(context, this.f42498n).forNativeAd(this).withAdListener(new AdListener() { // from class: com.thinkup.network.admob.AdmobTUNativeAd.1
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClicked() {
                AdmobTUNativeAd.this.notifyAdClicked();
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                LoadCallbackListener loadCallbackListener = AdmobTUNativeAd.this.m;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                }
                AdmobTUNativeAd.this.m = null;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdImpression() {
                try {
                    if (AdmobTUNativeAd.this.om != null) {
                        AdMobTUInitManager.getInstance().o(AdmobTUNativeAd.this.getShowId(), AdmobTUNativeAd.this.om);
                    }
                } catch (Throwable unused) {
                }
                if (AdmobTUNativeAd.this.o0m) {
                    AdmobTUNativeAd admobTUNativeAd = AdmobTUNativeAd.this;
                    if (admobTUNativeAd.mo != null) {
                        admobTUNativeAd.oo0 = new o(admobTUNativeAd);
                        AdmobTUNativeAd admobTUNativeAd2 = AdmobTUNativeAd.this;
                        admobTUNativeAd2.mo.postDelayed(admobTUNativeAd2.oo0, 500L);
                        return;
                    }
                }
                AdmobTUNativeAd.n(AdmobTUNativeAd.this);
                AdmobTUNativeAd.this.notifyAdImpression();
            }
        }).withNativeAdOptions(mediaAspectRatio.build()).build();
        AdRequest.Builder builderO = AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.NATIVE, !TextUtils.isEmpty(this.o0));
        if (!TextUtils.isEmpty(this.o0)) {
            builderO.setAdString(this.o0);
        }
        adLoaderBuild.loadAd(builderO.build());
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        NativeAd.Image image;
        this.om = nativeAd;
        if (this.nn != null) {
            if (nativeAd != null && nativeAd.getMediaContent() != null && this.om.getMediaContent().getVideoController() != null) {
                this.om.getMediaContent().getVideoController().mute(this.nn.booleanValue());
            }
        } else if (TUSDKGlobalSetting.isGlobalMute != null && nativeAd != null && nativeAd.getMediaContent() != null && this.om.getMediaContent().getVideoController() != null) {
            this.om.getMediaContent().getVideoController().mute(TUSDKGlobalSetting.isGlobalMute.booleanValue());
        }
        ResponseInfo responseInfo = this.om.getResponseInfo();
        if (responseInfo != null) {
            this.ooo.put("response_info", responseInfo);
            setNetworkInfoMap(this.ooo);
        }
        if (this.o0m) {
            this.om.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.thinkup.network.admob.AdmobTUNativeAd.2
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    if (AdmobTUNativeAd.this.o0n) {
                        return;
                    }
                    AdmobTUNativeAd.n(AdmobTUNativeAd.this);
                    AdMobTUInitManager.getInstance();
                    AdMobTUInitManager.o((Map<String, Object>) AdmobTUNativeAd.this.ooo, adValue);
                    AdmobTUNativeAd admobTUNativeAd = AdmobTUNativeAd.this;
                    admobTUNativeAd.setNetworkInfoMap(admobTUNativeAd.ooo);
                    AdmobTUNativeAd.this.notifyAdImpression();
                }
            });
        }
        setTitle(this.om.getHeadline());
        setDescriptionText(this.om.getBody());
        NativeAd nativeAd2 = this.om;
        if (nativeAd2 != null && nativeAd2.getIcon() != null && this.om.getIcon().getUri() != null) {
            setIconImageUrl(this.om.getIcon().getUri().toString());
        }
        List<NativeAd.Image> images = this.om.getImages();
        if (images != null && images.size() > 0 && (image = images.get(0)) != null && image.getUri() != null) {
            setMainImageUrl(image.getUri().toString());
            Drawable drawable = image.getDrawable();
            if (drawable != null) {
                setMainImageWidth(drawable.getIntrinsicWidth());
                setMainImageHeight(drawable.getIntrinsicHeight());
            }
        }
        setCallToActionText(this.om.getCallToAction());
        setStarRating(Double.valueOf(this.om.getStarRating() == null ? 5.0d : this.om.getStarRating().doubleValue()));
        setAdFrom(this.om.getStore());
        try {
            setAppPrice(Double.valueOf(this.om.getPrice()).doubleValue());
        } catch (Exception unused) {
        }
        setAdvertiserName(this.om.getAdvertiser());
        MediaContent mediaContent = this.om.getMediaContent();
        if (mediaContent == null || !mediaContent.hasVideoContent()) {
            this.mAdSourceType = "2";
        } else {
            setVideoDuration(mediaContent.getDuration());
            this.mAdSourceType = "1";
        }
        LoadCallbackListener loadCallbackListener = this.m;
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
        this.m = null;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00c0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00b5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0033 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:2:0x0000, B:4:0x0018, B:6:0x001c, B:9:0x0023, B:11:0x0029, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:19:0x0043, B:27:0x006a, B:35:0x0091, B:43:0x00b9, B:46:0x00c4, B:48:0x00c8, B:36:0x0097, B:38:0x009b, B:40:0x00ae, B:28:0x0070, B:30:0x0074, B:32:0x0087, B:20:0x0049, B:22:0x004d, B:24:0x0060, B:49:0x00cf, B:51:0x00d3, B:53:0x00d7, B:55:0x00db, B:57:0x00e9, B:59:0x00f2, B:61:0x00fb, B:63:0x0104, B:65:0x010d, B:67:0x0111, B:68:0x0118, B:70:0x011c, B:72:0x0120, B:74:0x0124, B:76:0x0128, B:78:0x012c, B:80:0x0130, B:82:0x0134, B:84:0x0138, B:85:0x0142, B:87:0x0148, B:89:0x0152, B:93:0x0165, B:90:0x015a, B:92:0x015e, B:94:0x0168, B:96:0x016c, B:98:0x0170), top: B:102:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7 A[ADDED_TO_REGION] */
    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        NativeAd nativeAd;
        NativeAd nativeAd2;
        NativeAd nativeAd3;
        MediaView mediaView;
        try {
            View titleView = tUNativePrepareInfo.getTitleView();
            View descView = tUNativePrepareInfo.getDescView();
            View ctaView = tUNativePrepareInfo.getCtaView();
            View mainImageView = tUNativePrepareInfo.getMainImageView();
            View iconView = tUNativePrepareInfo.getIconView();
            NativeAdView nativeAdView = this.mo;
            if (nativeAdView != null && (mediaView = this.oo) != null) {
                nativeAdView.setMediaView(mediaView);
            }
            List<View> clickViewList = tUNativePrepareInfo.getClickViewList();
            if (clickViewList == null || clickViewList.size() <= 0) {
                this.mm = false;
                this.mn = false;
                this.n0 = false;
                this.no = false;
                this.nm = false;
                if (titleView != null) {
                    this.mm = true;
                    this.mo.setHeadlineView(titleView);
                }
                if (descView != null) {
                    this.mn = true;
                    this.mo.setBodyView(descView);
                }
                if (ctaView != null) {
                    this.n0 = true;
                    this.mo.setCallToActionView(ctaView);
                }
                if (iconView != null) {
                    this.nm = true;
                    this.mo.setIconView(iconView);
                }
                if (mainImageView != null && (mainImageView instanceof ImageView)) {
                    this.no = true;
                    this.mo.setImageView(mainImageView);
                }
                if (this.mm && this.mn && this.n0 && this.nm && this.no) {
                    NativeAdView nativeAdView2 = this.mo;
                    if (nativeAdView2 == null || (nativeAd2 = this.om) == null) {
                        return;
                    }
                    nativeAdView2.setNativeAd(nativeAd2);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                o(arrayList, this.mo);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    View view2 = (View) arrayList.get(i2);
                    if (!this.nm) {
                        this.nm = true;
                        this.mo.setIconView(view2);
                    } else {
                        if (this.no) {
                            break;
                        }
                        this.no = true;
                        this.mo.setImageView(view2);
                    }
                }
                NativeAdView nativeAdView3 = this.mo;
                if (nativeAdView3 == null || (nativeAd = this.om) == null) {
                    return;
                }
                nativeAdView3.setNativeAd(nativeAd);
                return;
            }
            for (View view3 : clickViewList) {
                if (titleView != null) {
                    if (view3 == titleView) {
                        this.mo.setHeadlineView(view3);
                    } else if (descView == null) {
                        if (view3 == descView) {
                            this.mo.setBodyView(view3);
                        } else if (ctaView == null) {
                            if (view3 == ctaView) {
                                this.mo.setCallToActionView(view3);
                            } else if (iconView == null && view3 == iconView) {
                                this.mo.setIconView(view3);
                            } else if (mainImageView == null && view3 == mainImageView && (view3 instanceof ImageView)) {
                                this.mo.setImageView(view3);
                            }
                        } else if ((view3 instanceof TextView) || !TextUtils.equals(this.om.getCallToAction(), ((TextView) view3).getText())) {
                            if (iconView == null) {
                            }
                            if (mainImageView == null) {
                            }
                        } else {
                            this.mo.setCallToActionView(view3);
                        }
                    } else if (!(view3 instanceof TextView) && TextUtils.equals(this.om.getBody(), ((TextView) view3).getText())) {
                        this.mo.setBodyView(view3);
                    } else if (ctaView == null) {
                        if (view3 instanceof TextView) {
                        }
                        if (iconView == null) {
                        }
                        if (mainImageView == null) {
                        }
                    } else if (view3 == ctaView) {
                        this.mo.setCallToActionView(view3);
                    } else {
                        if (iconView == null) {
                        }
                        if (mainImageView == null) {
                        }
                    }
                } else if ((view3 instanceof TextView) && TextUtils.equals(this.om.getHeadline(), ((TextView) view3).getText())) {
                    this.mo.setHeadlineView(view3);
                } else if (descView == null) {
                    if (!(view3 instanceof TextView)) {
                    }
                    if (ctaView == null) {
                        if (view3 instanceof TextView) {
                        }
                        if (iconView == null) {
                        }
                        if (mainImageView == null) {
                        }
                    } else if (view3 == ctaView) {
                        this.mo.setCallToActionView(view3);
                    } else {
                        if (iconView == null) {
                        }
                        if (mainImageView == null) {
                        }
                    }
                } else if (view3 == descView) {
                    this.mo.setBodyView(view3);
                } else if (ctaView == null) {
                    if (view3 instanceof TextView) {
                    }
                    if (iconView == null) {
                    }
                    if (mainImageView == null) {
                    }
                } else if (view3 == ctaView) {
                    this.mo.setCallToActionView(view3);
                } else {
                    if (iconView == null) {
                    }
                    if (mainImageView == null) {
                    }
                }
            }
            NativeAdView nativeAdView4 = this.mo;
            if (nativeAdView4 == null || (nativeAd3 = this.om) == null) {
                return;
            }
            nativeAdView4.setNativeAd(nativeAd3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z2) {
        this.o00 = z2;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void setVideoMute(boolean z2) {
        this.nn = Boolean.valueOf(z2);
        NativeAd nativeAd = this.om;
        if (nativeAd == null || nativeAd.getMediaContent() == null || this.om.getMediaContent().getVideoController() == null) {
            return;
        }
        this.om.getMediaContent().getVideoController().mute(z2);
    }

    private NativeAdView o() {
        return new NativeAdView(this.o);
    }

    private void o(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.oo) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                o(list, viewGroup.getChildAt(i2));
            }
            return;
        }
        if (view instanceof ImageView) {
            if (this.nm && this.no) {
                return;
            }
            list.add(view);
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String string = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.om;
            if (nativeAd == null || this.mo == null) {
                return;
            }
            if (!this.mm && string.equals(nativeAd.getHeadline())) {
                this.mm = true;
                this.mo.setHeadlineView(view);
            }
            if (!this.mn && string.equals(this.om.getBody())) {
                this.mn = true;
                this.mo.setBodyView(view);
            }
            if (this.n0 || !string.equals(this.om.getCallToAction())) {
                return;
            }
            this.n0 = true;
            this.mo.setCallToActionView(view);
        }
    }

    public AdmobTUNativeAd(Context context, String str, String str2, String str3, LoadCallbackListener loadCallbackListener, Map<String, Object> map, Map<String, Object> map2) {
        this(context, str2, str3, loadCallbackListener, map);
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "1":
                    this.on = 1;
                    break;
                case "2":
                    this.on = 2;
                    break;
                case "3":
                    this.on = 3;
                    break;
                case "4":
                    this.on = 4;
                    break;
                default:
                    this.on = 0;
                    break;
            }
        }
        if (map2 != null) {
            try {
                if (map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    int i2 = Integer.parseInt(map2.get(TUAdConst.KEY.AD_CHOICES_PLACEMENT).toString());
                    if (i2 == 0) {
                        this.m0 = 0;
                        return;
                    }
                    if (i2 == 1) {
                        this.m0 = 1;
                        return;
                    } else if (i2 == 2) {
                        this.m0 = 2;
                        return;
                    } else {
                        if (i2 != 3) {
                            return;
                        }
                        this.m0 = 3;
                        return;
                    }
                }
                if (TUInitMediation.getIntFromMap(map, "render_type", 1) == 2) {
                    this.m0 = 2;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
