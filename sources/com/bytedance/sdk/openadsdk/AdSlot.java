package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.qdl.qdl.qdl.wd.ud;
import com.bytedance.sdk.component.utils.bjy;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private int aaj;
    private int bch;
    private String bjy;
    private String exc;
    private boolean exu;
    private int fs;
    private String jl;
    private String jpc;
    private String jtx;
    private int jyq;
    private int ljh;
    private int lnr;
    private float mml;
    private int mo;
    private float mzz;
    private int oth;
    private String qdl;
    private boolean rdp;
    private String rq;
    private String to;
    private int tvp;
    private int ud;
    private boolean uw;
    private boolean wd;
    private Map<String, Object> xmv;
    private String yt;

    public static class Builder {
        private String bjy;
        private boolean exu;
        private float fs;
        private String jl;
        private String jpc;
        private String jtx;
        private int jyq;
        private String qdl;
        private String rdp;
        private float rq;
        private int to;
        private String yt;
        private int ud = 640;
        private int lnr = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        private final boolean mml = true;
        private int mzz = 1;
        private final String mo = "";
        private final int wd = 0;
        private String tvp = "defaultUser";
        private boolean exc = true;
        private Map<String, Object> aaj = null;
        private int oth = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.qdl = this.qdl;
            adSlot.mo = this.mzz;
            adSlot.wd = true;
            adSlot.ud = this.ud;
            adSlot.lnr = this.lnr;
            float f = this.rq;
            if (f <= 0.0f) {
                adSlot.mml = this.ud;
                adSlot.mzz = this.lnr;
            } else {
                adSlot.mml = f;
                adSlot.mzz = this.fs;
            }
            adSlot.jpc = "";
            adSlot.tvp = 0;
            adSlot.to = this.jpc;
            adSlot.rq = this.tvp;
            adSlot.fs = this.to;
            adSlot.exu = this.exc;
            adSlot.rdp = this.exu;
            adSlot.bjy = this.rdp;
            adSlot.jtx = this.bjy;
            adSlot.yt = this.jtx;
            adSlot.jl = this.yt;
            adSlot.exc = this.jl;
            adSlot.xmv = this.aaj;
            adSlot.ljh = this.jyq;
            adSlot.bch = this.oth;
            return adSlot;
        }

        public Builder isExpressAd(boolean z2) {
            this.exu = z2;
            return this;
        }

        public Builder setAdCount(int i2) {
            if (i2 <= 0) {
                i2 = 1;
            }
            if (i2 > 20) {
                i2 = 20;
            }
            this.mzz = i2;
            return this;
        }

        public Builder setAdId(String str) {
            this.bjy = str;
            return this;
        }

        public Builder setBannerType(int i2) {
            this.oth = i2;
            return this;
        }

        public Builder setCodeId(String str) {
            this.qdl = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.jtx = str;
            return this;
        }

        public Builder setDurationSlotType(int i2) {
            this.jyq = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.rq = f;
            this.fs = f2;
            return this;
        }

        public Builder setExt(String str) {
            this.yt = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i2, int i3) {
            this.ud = i2;
            this.lnr = i3;
            return this;
        }

        public Builder setIsAutoPlay(boolean z2) {
            this.exc = z2;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.jpc = str;
            return this;
        }

        public Builder setNativeAdType(int i2) {
            this.to = i2;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.aaj = map;
            return this;
        }

        public Builder setRewardAmount(int i2) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z2) {
            return this;
        }

        public Builder setUserData(String str) {
            this.jl = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.tvp = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (bjy.mml()) {
                ud.qdl(str);
            }
            this.rdp = str;
            return this;
        }
    }

    public static int getPosition(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return (i2 == 3 || i2 == 4 || i2 == 7 || i2 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.mo;
    }

    public String getAdId() {
        return this.jtx;
    }

    public int getBannerType() {
        return this.bch;
    }

    public String getBidAdm() {
        return this.bjy;
    }

    public String getCodeId() {
        return this.qdl;
    }

    public String getCreativeId() {
        return this.yt;
    }

    public int getDurationSlotType() {
        return this.ljh;
    }

    public float getExpressViewAcceptedHeight() {
        return this.mzz;
    }

    public float getExpressViewAcceptedWidth() {
        return this.mml;
    }

    public String getExt() {
        return this.jl;
    }

    public int getImgAcceptedHeight() {
        return this.lnr;
    }

    public int getImgAcceptedWidth() {
        return this.ud;
    }

    public int getIsRotateBanner() {
        return this.aaj;
    }

    public String getMediaExtra() {
        return this.to;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.xmv;
    }

    public int getRewardAmount() {
        return this.tvp;
    }

    public String getRewardName() {
        return this.jpc;
    }

    public int getRotateOrder() {
        return this.oth;
    }

    public int getRotateTime() {
        return this.jyq;
    }

    public String getUserData() {
        return this.exc;
    }

    public String getUserID() {
        return this.rq;
    }

    public boolean isAutoPlay() {
        return this.exu;
    }

    public boolean isExpressAd() {
        return this.rdp;
    }

    public boolean isPreload() {
        return this.uw;
    }

    public boolean isSupportDeepLink() {
        return this.wd;
    }

    public void setAdCount(int i2) {
        this.mo = i2;
    }

    public void setDurationSlotType(int i2) {
        this.ljh = i2;
    }

    public void setExpressViewAccepted(float f, float f2) {
        this.mml = f;
        this.mzz = f2;
    }

    public void setIsRotateBanner(int i2) {
        this.aaj = i2;
    }

    public void setPreload(boolean z2) {
        this.uw = z2;
    }

    public void setRotateOrder(int i2) {
        this.oth = i2;
    }

    public void setRotateTime(int i2) {
        this.jyq = i2;
    }

    public void setUserData(String str) {
        this.exc = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.qdl);
            jSONObject.put("mAdCount", this.mo);
            jSONObject.put("mIsAutoPlay", this.exu);
            jSONObject.put("mImgAcceptedWidth", this.ud);
            jSONObject.put("mImgAcceptedHeight", this.lnr);
            jSONObject.put("mExpressViewAcceptedWidth", this.mml);
            jSONObject.put("mExpressViewAcceptedHeight", this.mzz);
            jSONObject.put("mSupportDeepLink", this.wd);
            jSONObject.put("mRewardName", this.jpc);
            jSONObject.put("mRewardAmount", this.tvp);
            jSONObject.put("mMediaExtra", this.to);
            jSONObject.put("mUserID", this.rq);
            jSONObject.put("mNativeAdType", this.fs);
            jSONObject.put("mIsExpressAd", this.rdp);
            jSONObject.put("mAdId", this.jtx);
            jSONObject.put("mCreativeId", this.yt);
            jSONObject.put("mExt", this.jl);
            jSONObject.put("mBidAdm", this.bjy);
            jSONObject.put("mUserData", this.exc);
            jSONObject.put("mDurationSlotType", this.ljh);
            jSONObject.put("mBannerType", this.bch);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.exu = true;
        this.rdp = false;
        this.aaj = 0;
        this.jyq = 0;
        this.oth = 0;
        this.bch = 1;
    }
}
