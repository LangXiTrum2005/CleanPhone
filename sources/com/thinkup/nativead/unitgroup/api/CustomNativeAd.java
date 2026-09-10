package com.thinkup.nativead.unitgroup.api;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.thinkup.core.api.TUAdAppInfo;
import com.thinkup.core.api.TUCustomVideo;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.basead.m.o0;
import com.thinkup.nativead.api.TUNativePrepareExInfo;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.o;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CustomNativeAd extends o {
    public static String IS_AUTO_PLAY_KEY = "is_auto_play";
    static final double MAX_STAR_RATING = 5.0d;
    static final double MIN_STAR_RATING = 0.0d;
    private TUAdAppInfo adAppInfo;
    private View adLogoView;
    private String mAdChoiceIconUrl;
    private String mAdFrom;
    private String mAdvertiserName;
    private int mAppCommentNum;
    private double mAppPrice;
    private String mCallToAction;
    private View mCallToActionButton;
    private String mClickDestinationUrl;
    private View.OnClickListener mCloseViewListener;
    private String mDomain;
    private String mIconImageUrl;
    private List<String> mImageUrlList;
    private int mMainImageHeight;
    private String mMainImageUrl;
    private int mMainImageWidth;
    private int mNativeExpressHeight;
    private int mNativeExpressWidth;
    private Map<String, Object> mNetworkInfoMap;
    private String mText;
    private String mTitle;
    private int mVideoHeight;
    private String mVideoUrl;
    private int mVideoWidth;
    private String mWarning;
    private String showId;
    private double videoDuration;
    private Double mStarRating = Double.valueOf(0.0d);
    private int nInteractionType = 0;

    public class NativeAdConst {
        public static final String IMAGE_TYPE = "2";
        public static final String LIVE_TYPE = "3";
        public static final String UNKNOWN_TYPE = "0";
        public static final String VIDEO_TYPE = "1";

        public NativeAdConst() {
        }
    }

    public class NativeType {
        public static final int FEED = 1;
        public static final int PATCH = 2;

        public NativeType() {
        }
    }

    @Override // com.thinkup.nativead.unitgroup.o
    public final void bindDislikeListener(View.OnClickListener onClickListener) {
        View closeView;
        this.mCloseViewListener = onClickListener;
        TUNativePrepareInfo nativePrepareInfo = getNativePrepareInfo();
        if (nativePrepareInfo == null || (closeView = nativePrepareInfo.getCloseView()) == null) {
            return;
        }
        closeView.setOnClickListener(this.mCloseViewListener);
    }

    public TUNativePrepareInfo castToTUNativePrepareInfo(TUNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        TUNativePrepareExInfo tUNativePrepareExInfo = new TUNativePrepareExInfo();
        if (adPrepareInfo != null) {
            tUNativePrepareExInfo.setCreativeClickViewList(adPrepareInfo.getCreativeClickViewList());
            tUNativePrepareExInfo.setPrivacyClickViewList(adPrepareInfo.getPrivacyClickViewList());
            tUNativePrepareExInfo.setPermissionClickViewList(adPrepareInfo.getPermissionClickViewList());
            tUNativePrepareExInfo.setAppInfoClickViewList(adPrepareInfo.getAppInfoClickViewList());
            tUNativePrepareExInfo.setTitleView(adPrepareInfo.getTitleView());
            tUNativePrepareExInfo.setDescView(adPrepareInfo.getDescView());
            tUNativePrepareExInfo.setAdFromView(adPrepareInfo.getAdFromView());
            tUNativePrepareExInfo.setCloseView(adPrepareInfo.getCloseView());
            tUNativePrepareExInfo.setAdLogoView(adPrepareInfo.getAdLogoView());
            tUNativePrepareExInfo.setCtaView(adPrepareInfo.getCtaView());
            tUNativePrepareExInfo.setDomainView(adPrepareInfo.getDomainView());
            tUNativePrepareExInfo.setParentView(adPrepareInfo.getParentView());
            tUNativePrepareExInfo.setWarningView(adPrepareInfo.getWarningView());
            tUNativePrepareExInfo.setMainImageView(adPrepareInfo.getMainImageView());
            tUNativePrepareExInfo.setIconView(adPrepareInfo.getIconView());
            tUNativePrepareExInfo.setChoiceViewLayoutParams(adPrepareInfo.getChoiceViewLayoutParams());
            List<View> clickViewList = tUNativePrepareExInfo.getClickViewList();
            if (clickViewList != null) {
                clickViewList.clear();
            }
            tUNativePrepareExInfo.setClickViewList(adPrepareInfo.getClickViewList());
        }
        return tUNativePrepareExInfo;
    }

    public final boolean checkHasCloseViewListener() {
        return this.mCloseViewListener != null;
    }

    @Override // com.thinkup.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.thinkup.core.api.BaseAd
    public void destroy() {
        this.mCloseViewListener = null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public TUAdAppInfo getAdAppInfo() {
        return this.adAppInfo;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        return this.mAdChoiceIconUrl;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public String getAdFrom() {
        return this.mAdFrom;
    }

    @Override // com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdIconView() {
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public Bitmap getAdLogo() {
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdLogoView() {
        return this.adLogoView;
    }

    @Override // com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public String getAdvertiserName() {
        return this.mAdvertiserName;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getAppCommentNum() {
        return this.mAppCommentNum;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public double getAppPrice() {
        return this.mAppPrice;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public View getCallToActionButton() {
        return this.mCallToActionButton;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public String getCallToActionText() {
        return this.mCallToAction;
    }

    @Override // com.thinkup.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public String getDescriptionText() {
        return this.mText;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public String getDomain() {
        return this.mDomain;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public String getIconImageUrl() {
        return this.mIconImageUrl;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final List<String> getImageUrlList() {
        return this.mImageUrlList;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getMainImageHeight() {
        int i2 = this.mMainImageHeight;
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public String getMainImageUrl() {
        return this.mMainImageUrl;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getMainImageWidth() {
        int i2 = this.mMainImageWidth;
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getNativeAdInteractionType() {
        return this.nInteractionType;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public TUCustomVideo getNativeCustomVideo() {
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getNativeExpressHeight() {
        int i2 = this.mNativeExpressHeight;
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getNativeExpressWidth() {
        int i2 = this.mNativeExpressWidth;
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getNativeType() {
        return 1;
    }

    @Override // com.thinkup.core.api.BaseAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        return this.mNetworkInfoMap;
    }

    public final String getShowId() {
        return this.showId;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Double getStarRating() {
        return this.mStarRating;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public String getTitle() {
        return this.mTitle;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public double getVideoDuration() {
        return this.videoDuration;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getVideoHeight() {
        int i2 = this.mVideoHeight;
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public double getVideoProgress() {
        return 0.0d;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getVideoUrl() {
        return this.mVideoUrl;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public int getVideoWidth() {
        int i2 = this.mVideoWidth;
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public String getWarning() {
        return this.mWarning;
    }

    public void impressionTrack(View view) {
    }

    @Override // com.thinkup.core.api.BaseAd
    public boolean isNativeExpress() {
        return false;
    }

    @Override // com.thinkup.nativead.unitgroup.o
    public void onPause() {
    }

    @Override // com.thinkup.nativead.unitgroup.o
    public void onResume() {
    }

    @Override // com.thinkup.core.api.BaseAd
    public void pauseVideo() {
    }

    @Override // com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
    }

    public void registerDownloadConfirmListener() {
    }

    @Override // com.thinkup.core.api.BaseAd
    public void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams) {
        registerListener(view, list, layoutParams, null);
    }

    @Override // com.thinkup.core.api.BaseAd
    public void resumeVideo() {
    }

    public final void setAdAppInfo(TUAdAppInfo tUAdAppInfo) {
        this.adAppInfo = tUAdAppInfo;
    }

    public final void setAdChoiceIconUrl(String str) {
        this.mAdChoiceIconUrl = str;
    }

    public final void setAdFrom(String str) {
        this.mAdFrom = str;
    }

    public final void setAdLogoView(View view) {
        this.adLogoView = view;
    }

    public void setAdvertiserName(String str) {
        this.mAdvertiserName = str;
    }

    public void setAppCommentNum(int i2) {
        this.mAppCommentNum = i2;
    }

    public void setAppPrice(double d) {
        this.mAppPrice = d;
    }

    public void setCallToActionButton(View view) {
        this.mCallToActionButton = view;
    }

    public final void setCallToActionText(String str) {
        this.mCallToAction = str;
    }

    public final void setDescriptionText(String str) {
        this.mText = str;
    }

    public final void setDomain(String str) {
        this.mDomain = str;
    }

    public final void setIconImageUrl(String str) {
        this.mIconImageUrl = str;
    }

    public final void setImageUrlList(List<String> list) {
        this.mImageUrlList = list;
    }

    public void setMainImageHeight(int i2) {
        this.mMainImageHeight = i2;
    }

    public final void setMainImageUrl(String str) {
        this.mMainImageUrl = str;
    }

    public void setMainImageWidth(int i2) {
        this.mMainImageWidth = i2;
    }

    public void setNativeExpressHeight(int i2) {
        this.mNativeExpressHeight = i2;
    }

    public void setNativeExpressWidth(int i2) {
        this.mNativeExpressWidth = i2;
    }

    public final void setNativeInteractionType(int i2) {
        this.nInteractionType = i2;
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setNetworkInfoMap(Map<String, Object> map) {
        this.mNetworkInfoMap = map;
    }

    public final void setShowId(String str) {
        this.showId = str;
    }

    public final void setStarRating(Double d) {
        if (d == null) {
            this.mStarRating = null;
        } else {
            if (d.doubleValue() < 0.0d || d.doubleValue() > MAX_STAR_RATING) {
                return;
            }
            this.mStarRating = d;
        }
    }

    public final void setTitle(String str) {
        this.mTitle = str;
    }

    public final void setVideoDuration(double d) {
        this.videoDuration = d;
    }

    public void setVideoHeight(int i2) {
        this.mVideoHeight = i2;
    }

    @Override // com.thinkup.core.api.BaseAd
    public void setVideoMute(boolean z2) {
    }

    public final void setVideoUrl(String str) {
        this.mVideoUrl = str;
    }

    public void setVideoWidth(int i2) {
        this.mVideoWidth = i2;
    }

    public final void setWarning(String str) {
        this.mWarning = str;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public boolean supportSetPermissionClickViewList() {
        return false;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public boolean supportSetPrivacyClickViewList() {
        return false;
    }

    public void unregeisterDownloadConfirmListener() {
    }

    @Override // com.thinkup.core.api.BaseAd
    public void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams, o0 o0Var) {
        TUNativePrepareInfo tUNativePrepareInfo = new TUNativePrepareInfo();
        if (o0Var != null) {
            tUNativePrepareInfo.setTitleView(o0Var.o());
            tUNativePrepareInfo.setDescView(o0Var.o0());
            tUNativePrepareInfo.setAdFromView(o0Var.om());
            tUNativePrepareInfo.setCloseView(o0Var.mm());
            tUNativePrepareInfo.setCtaView(o0Var.oo());
            tUNativePrepareInfo.setAdLogoView(o0Var.on());
            tUNativePrepareInfo.setMainImageView(o0Var.n());
            tUNativePrepareInfo.setDomainView(o0Var.m0());
            tUNativePrepareInfo.setWarningView(o0Var.mo());
            tUNativePrepareInfo.setIconView(o0Var.m());
            List<View> clickViewList = tUNativePrepareInfo.getClickViewList();
            if (clickViewList != null) {
                clickViewList.clear();
            }
        }
        tUNativePrepareInfo.setClickViewList(list);
        tUNativePrepareInfo.setChoiceViewLayoutParams(layoutParams);
        prepare(view, tUNativePrepareInfo);
    }

    @Override // com.thinkup.core.api.BaseAd
    public void registerListener(View view, TUNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        prepare(view, castToTUNativePrepareInfo(adPrepareInfo));
    }
}
