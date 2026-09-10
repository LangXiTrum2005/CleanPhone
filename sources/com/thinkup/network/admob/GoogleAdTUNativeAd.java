package com.thinkup.network.admob;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GoogleAdTUNativeAd extends CustomNativeAd implements NativeAd.OnNativeAdLoadedListener {
    LoadCallbackListener m;
    boolean m0;
    boolean mm;
    boolean mn;
    boolean mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42508n;
    boolean n0;
    private Map<String, Object> nm;
    boolean no;
    Context o;
    MediaView o0;
    int om;
    NativeAdView on;
    NativeAd oo;

    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public GoogleAdTUNativeAd(Context context, String str, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.om = 0;
        this.nm = new HashMap();
        this.m0 = false;
        this.mo = false;
        this.mm = false;
        this.mn = false;
        this.n0 = false;
        this.o = context.getApplicationContext();
        this.m = loadCallbackListener;
        this.f42508n = str;
    }

    private NativeAdView o() {
        NativeAdView nativeAdView = new NativeAdView(this.o);
        nativeAdView.setNativeAd(this.oo);
        return nativeAdView;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        NativeAdView nativeAdView = this.on;
        if (nativeAdView != null) {
            nativeAdView.destroy();
            this.on = null;
        }
        this.o0 = null;
        this.m = null;
        this.o = null;
        NativeAd nativeAd = this.oo;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.oo = null;
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        VideoController videoController;
        if (this.on == null) {
            this.on = o();
        }
        if (this.o0 == null) {
            MediaView mediaView = new MediaView(this.o);
            this.o0 = mediaView;
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.oo;
            if (nativeAd != null) {
                MediaContent mediaContent = nativeAd.getMediaContent();
                this.o0.setMediaContent(mediaContent);
                if (mediaContent != null && (videoController = mediaContent.getVideoController()) != null) {
                    videoController.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() { // from class: com.thinkup.network.admob.GoogleAdTUNativeAd.2
                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoEnd() {
                            super.onVideoEnd();
                            GoogleAdTUNativeAd.this.notifyAdVideoEnd();
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
                            GoogleAdTUNativeAd.this.notifyAdVideoStart();
                        }
                    });
                }
                this.on.setMediaView(this.o0);
                this.on.setNativeAd(this.oo);
            }
        }
        return this.o0;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView nativeAdViewO = o();
        this.on = nativeAdViewO;
        return nativeAdViewO;
    }

    public void loadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        new AdLoader.Builder(context, this.f42508n).forNativeAd(this).withAdListener(new AdListener() { // from class: com.thinkup.network.admob.GoogleAdTUNativeAd.1
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClicked() {
                GoogleAdTUNativeAd.this.notifyAdClicked();
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                LoadCallbackListener loadCallbackListener = GoogleAdTUNativeAd.this.m;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                }
                GoogleAdTUNativeAd.this.m = null;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdImpression() {
                try {
                    if (GoogleAdTUNativeAd.this.oo != null) {
                        AdMobTUInitManager.getInstance().o(GoogleAdTUNativeAd.this.getShowId(), GoogleAdTUNativeAd.this.oo);
                    }
                } catch (Throwable unused) {
                }
                GoogleAdTUNativeAd.this.notifyAdImpression();
            }
        }).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).setMediaAspectRatio(this.om).build()).build().loadAd(AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.NATIVE).build());
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        this.oo = nativeAd;
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        if (responseInfo != null) {
            this.nm.put("response_info", responseInfo);
            setNetworkInfoMap(this.nm);
        }
        setTitle(this.oo.getHeadline());
        setDescriptionText(this.oo.getBody());
        NativeAd nativeAd2 = this.oo;
        if (nativeAd2 != null && nativeAd2.getIcon() != null && this.oo.getIcon().getUri() != null) {
            setIconImageUrl(this.oo.getIcon().getUri().toString());
        }
        NativeAd nativeAd3 = this.oo;
        if (nativeAd3 != null && nativeAd3.getImages() != null && this.oo.getImages().size() > 0 && this.oo.getImages().get(0).getUri() != null) {
            NativeAd.Image image = this.oo.getImages().get(0);
            if (image.getDrawable() != null) {
                setMainImageUrl(image.getUri().toString());
                setMainImageWidth(image.getDrawable().getIntrinsicWidth());
                setMainImageHeight(image.getDrawable().getIntrinsicHeight());
            } else {
                setMainImageUrl(image.getUri().toString());
            }
        }
        setCallToActionText(this.oo.getCallToAction());
        setStarRating(Double.valueOf(this.oo.getStarRating() == null ? 5.0d : this.oo.getStarRating().doubleValue()));
        setAdFrom(this.oo.getStore());
        MediaContent mediaContent = this.oo.getMediaContent();
        if (mediaContent == null || !mediaContent.hasVideoContent()) {
            this.mAdSourceType = "2";
        } else {
            this.mAdSourceType = "1";
        }
        LoadCallbackListener loadCallbackListener = this.m;
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
        this.m = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00a9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0024 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x008f A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:2:0x0000, B:4:0x001a, B:6:0x0020, B:7:0x0024, B:9:0x002a, B:12:0x0034, B:22:0x005e, B:30:0x0085, B:38:0x00ad, B:41:0x00b8, B:43:0x00bc, B:31:0x008b, B:33:0x008f, B:35:0x00a2, B:23:0x0064, B:25:0x0068, B:27:0x007b, B:15:0x003d, B:17:0x0041, B:19:0x0054, B:44:0x00c3, B:46:0x00d1, B:48:0x00da, B:50:0x00e3, B:52:0x00ec, B:54:0x00f5, B:56:0x00f9, B:57:0x0100, B:59:0x0104, B:61:0x0108, B:63:0x010c, B:65:0x0110, B:68:0x0115, B:69:0x011f, B:71:0x0125, B:73:0x012f, B:74:0x0137, B:76:0x013b), top: B:81:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00b4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00b6 A[SYNTHETIC] */
    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        try {
            View titleView = tUNativePrepareInfo.getTitleView();
            View descView = tUNativePrepareInfo.getDescView();
            View ctaView = tUNativePrepareInfo.getCtaView();
            View mainImageView = tUNativePrepareInfo.getMainImageView();
            View iconView = tUNativePrepareInfo.getIconView();
            List<View> clickViewList = tUNativePrepareInfo.getClickViewList();
            if (clickViewList == null || clickViewList.size() <= 0) {
                this.m0 = false;
                this.mo = false;
                this.mm = false;
                this.mn = false;
                this.n0 = false;
                if (titleView != null) {
                    this.m0 = true;
                    this.on.setHeadlineView(titleView);
                }
                if (descView != null) {
                    this.mo = true;
                    this.on.setBodyView(descView);
                }
                if (ctaView != null) {
                    this.mm = true;
                    this.on.setCallToActionView(ctaView);
                }
                if (iconView != null) {
                    this.n0 = true;
                    this.on.setIconView(iconView);
                }
                if (mainImageView != null && (mainImageView instanceof ImageView)) {
                    this.mn = true;
                    this.on.setImageView(mainImageView);
                }
                if (this.m0 && this.mo && this.mm && this.n0 && this.mn) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                o(arrayList, this.on);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    View view2 = (View) arrayList.get(i2);
                    if (!this.n0) {
                        this.n0 = true;
                        this.on.setIconView(view2);
                    } else {
                        if (this.mn) {
                            return;
                        }
                        this.mn = true;
                        this.on.setImageView(view2);
                    }
                }
                return;
            }
            for (View view3 : clickViewList) {
                if (titleView != null) {
                    if (view3 == titleView) {
                        this.on.setHeadlineView(view3);
                    } else if (descView == null) {
                        if (view3 == descView) {
                            this.on.setBodyView(view3);
                        } else if (ctaView == null) {
                            if (view3 == ctaView) {
                                this.on.setCallToActionView(view3);
                            } else if (iconView == null && view3 == iconView) {
                                this.on.setIconView(view3);
                            } else if (mainImageView == null && view3 == mainImageView && (view3 instanceof ImageView)) {
                                this.on.setImageView(view3);
                            }
                        } else if ((view3 instanceof TextView) || !TextUtils.equals(this.oo.getCallToAction(), ((TextView) view3).getText())) {
                            if (iconView == null) {
                            }
                            if (mainImageView == null) {
                            }
                        } else {
                            this.on.setCallToActionView(view3);
                        }
                    } else if (!(view3 instanceof TextView) && TextUtils.equals(this.oo.getBody(), ((TextView) view3).getText())) {
                        this.on.setBodyView(view3);
                    } else if (ctaView == null) {
                        if (view3 instanceof TextView) {
                        }
                        if (iconView == null) {
                        }
                        if (mainImageView == null) {
                        }
                    } else if (view3 == ctaView) {
                        this.on.setCallToActionView(view3);
                    } else {
                        if (iconView == null) {
                        }
                        if (mainImageView == null) {
                        }
                    }
                } else if ((view3 instanceof TextView) && TextUtils.equals(this.oo.getHeadline(), ((TextView) view3).getText())) {
                    this.on.setHeadlineView(view3);
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
                        this.on.setCallToActionView(view3);
                    } else {
                        if (iconView == null) {
                        }
                        if (mainImageView == null) {
                        }
                    }
                } else if (view3 == descView) {
                    this.on.setBodyView(view3);
                } else if (ctaView == null) {
                    if (view3 instanceof TextView) {
                    }
                    if (iconView == null) {
                    }
                    if (mainImageView == null) {
                    }
                } else if (view3 == ctaView) {
                    this.on.setCallToActionView(view3);
                } else {
                    if (iconView == null) {
                    }
                    if (mainImageView == null) {
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z2) {
        this.no = z2;
    }

    private void o(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.o0) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                o(list, viewGroup.getChildAt(i2));
            }
            return;
        }
        if (view instanceof ImageView) {
            if (this.n0 && this.mn) {
                return;
            }
            list.add(view);
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String string = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.oo;
            if (nativeAd == null || this.on == null) {
                return;
            }
            if (!this.m0 && string.equals(nativeAd.getHeadline())) {
                this.m0 = true;
                this.on.setHeadlineView(view);
            }
            if (!this.mo && string.equals(this.oo.getBody())) {
                this.mo = true;
                this.on.setBodyView(view);
            }
            if (this.mm || !string.equals(this.oo.getCallToAction())) {
                return;
            }
            this.mm = true;
            this.on.setCallToActionView(view);
        }
    }

    public GoogleAdTUNativeAd(Context context, String str, String str2, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this(context, str2, loadCallbackListener, map);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "1":
                this.om = 1;
                break;
            case "2":
                this.om = 2;
                break;
            case "3":
                this.om = 3;
                break;
            case "4":
                this.om = 4;
                break;
            default:
                this.om = 0;
                break;
        }
    }
}
