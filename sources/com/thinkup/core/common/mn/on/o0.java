package com.thinkup.core.common.mn.on;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.o1.b;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ITUAdvertiserInfoOperate;
import com.thinkup.core.api.TUAdAppInfo;
import com.thinkup.core.api.TUCompViewListener;
import com.thinkup.core.api.TUCustomVideo;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyMediaView;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.nm;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.ooo.o00;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 extends BaseAd implements o, Serializable {
    private int m;
    private View m0;
    private int mm;
    private int mn;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f41877n;
    private volatile ThirdPartyMediaView n0;
    private int nm;
    private final Object no = new Object();
    private int o;
    private int o0;
    private BaseAd om;
    private Map<String, Object> on;
    private int oo;

    public o0(BaseAd baseAd, Map<String, Object> map) {
        this.o = 1;
        this.m = 5;
        this.f41877n = 1;
        this.oo = 5;
        this.nm = 1;
        this.om = baseAd;
        this.on = map;
        this.o = o00.o(map, "orientation", 1);
        this.m = o00.o(map, b.l3, 5);
        this.f41877n = o00.o(map, "allows_skip", 1);
        this.nm = o00.o(map, "onreward_type", 1);
        this.o0 = ((Integer) o00.o(this.on, "button_type", 3)).intValue();
        int iO = o00.o(map, "s_c_t", 0);
        if (iO >= 0) {
            this.oo = iO;
        }
        this.mn = o00.o(map, mo.oon.mom, 0);
        this.mo = 1;
        try {
            Object obj = map.get("render_type");
            if (obj != null) {
                this.mo = Integer.parseInt(obj.toString());
            }
            Object obj2 = map.get("template_type");
            if (obj != null) {
                this.mm = Integer.parseInt(obj2.toString());
            }
        } catch (Throwable unused) {
        }
    }

    private void o(Map<String, Object> map) {
        this.o = o00.o(map, "orientation", 1);
        this.m = o00.o(map, b.l3, 5);
        this.f41877n = o00.o(map, "allows_skip", 1);
        this.nm = o00.o(map, "onreward_type", 1);
        this.o0 = ((Integer) o00.o(this.on, "button_type", 3)).intValue();
        int iO = o00.o(map, "s_c_t", 0);
        if (iO >= 0) {
            this.oo = iO;
        }
        this.mn = o00.o(map, mo.oon.mom, 0);
        this.mo = 1;
        try {
            Object obj = map.get("render_type");
            if (obj != null) {
                this.mo = Integer.parseInt(obj.toString());
            }
            Object obj2 = map.get("template_type");
            if (obj != null) {
                this.mm = Integer.parseInt(obj2.toString());
            }
        } catch (Throwable unused) {
        }
    }

    private static void o0n() {
    }

    private boolean oo0() {
        return (o0() == 0 || isNativeExpress()) ? false : true;
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void clear(View view) {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            baseAd.clear(view);
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void destroy() {
        this.om.destroy();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final TUAdAppInfo getAdAppInfo() {
        return this.om.getAdAppInfo();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        return this.om.getAdChoiceIconUrl();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdFrom() {
        return this.om.getAdFrom();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdIconView() {
        BaseAd baseAd;
        if (this.m0 == null && (baseAd = this.om) != null) {
            this.m0 = baseAd.getAdIconView();
        }
        return this.m0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Bitmap getAdLogo() {
        return this.om.getAdLogo();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdLogoView() {
        return this.om.getAdLogoView();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        if (o0() == 0 || isNativeExpress()) {
            BaseAd baseAd = this.om;
            if (baseAd != null) {
                return baseAd.getAdMediaView(objArr);
            }
            return null;
        }
        if (this.n0 == null) {
            synchronized (this.no) {
                if (this.n0 == null) {
                    try {
                        BaseAd baseAd2 = this.om;
                        View adMediaView = baseAd2 != null ? baseAd2.getAdMediaView(objArr) : null;
                        if (adMediaView != null) {
                            if (adMediaView.getParent() instanceof ViewGroup) {
                                ((ViewGroup) adMediaView.getParent()).removeView(adMediaView);
                            }
                            this.n0 = new ThirdPartyMediaView(adMediaView.getContext());
                            this.n0.setInterceptTouchEvent(true);
                            this.n0.addView(adMediaView);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.n0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdType() {
        return this.om.getAdType();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final ITUAdvertiserInfoOperate getAdvertiserInfoOperate() {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            return baseAd.getAdvertiserInfoOperate();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdvertiserName() {
        return this.om.getAdvertiserName();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getAppCommentNum() {
        return this.om.getAppCommentNum();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getAppPrice() {
        return this.om.getAppPrice();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getCallToActionButton() {
        return this.om.getCallToActionButton();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getCallToActionText() {
        return this.om.getCallToActionText();
    }

    @Override // com.thinkup.core.api.BaseAd
    public final ViewGroup getCustomAdContainer() {
        return this.om.getCustomAdContainer();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getDescriptionText() {
        return this.om.getDescriptionText();
    }

    @Override // com.thinkup.core.api.BaseAd
    public final n0 getDetail() {
        return this.om.getDetail();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getDomain() {
        BaseAd baseAd = this.om;
        return baseAd != null ? baseAd.getDomain() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getDownloadProgress() {
        return this.om.getDownloadProgress();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getDownloadStatus() {
        return this.om.getDownloadStatus();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getIconImageUrl() {
        return this.om.getIconImageUrl();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final List<String> getImageUrlList() {
        return this.om.getImageUrlList();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getMainImageHeight() {
        return this.om.getMainImageHeight();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getMainImageUrl() {
        return this.om.getMainImageUrl();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getMainImageWidth() {
        return this.om.getMainImageWidth();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        return this.om.getNativeAdInteractionType();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final TUCustomVideo getNativeCustomVideo() {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            return baseAd.getNativeCustomVideo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeExpressHeight() {
        return this.om.getNativeExpressHeight();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeExpressWidth() {
        return this.om.getNativeExpressWidth();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeType() {
        return this.om.getNativeType();
    }

    @Override // com.thinkup.core.api.BaseAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        return this.om.getNetworkInfoMap();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getRoateView(Map<String, Object> map, TUCompViewListener tUCompViewListener) {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            return baseAd.getRoateView(map, tUCompViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getShakeView(int i2, int i3, TUShakeViewListener tUShakeViewListener) {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            return baseAd.getShakeView(i2, i3, tUShakeViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getSlideView(int i2, int i3, int i4, TUShakeViewListener tUShakeViewListener) {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            return baseAd.getSlideView(i2, i3, i4, tUShakeViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Double getStarRating() {
        return this.om.getStarRating();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getTitle() {
        return this.om.getTitle();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getVideoDuration() {
        return this.om.getVideoDuration();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getVideoHeight() {
        return this.om.getVideoHeight();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getVideoProgress() {
        return this.om.getVideoProgress();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getVideoUrl() {
        return this.om.getVideoUrl();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getVideoWidth() {
        return this.om.getVideoWidth();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getWarning() {
        BaseAd baseAd = this.om;
        return baseAd != null ? baseAd.getWarning() : "";
    }

    @Override // com.thinkup.core.api.BaseAd
    public final boolean isNativeExpress() {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            return baseAd.isNativeExpress();
        }
        return false;
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final long m() {
        return this.m;
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int m0() {
        Map<String, Object> map = this.on;
        if (map == null || !map.containsKey(com.thinkup.core.oo.n0.o.o0oo)) {
            return 1;
        }
        Object obj = this.on.get(com.thinkup.core.oo.n0.o.o0oo);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 1;
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int mm() {
        return ((Integer) o00.o(this.on, "close_button", 0)).intValue();
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int mn() {
        return ((Integer) o00.o(this.on, "rendering_type", 1)).intValue();
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int[] mo() {
        int[] iArr = {1, 2, 3, 4, 5};
        Map<String, Object> map = this.on;
        if (map != null && map.containsKey(com.thinkup.core.oo.n0.o.o0om)) {
            Object obj = this.on.get(com.thinkup.core.oo.n0.o.o0om);
            if (obj instanceof int[]) {
                return (int[]) obj;
            }
        }
        return iArr;
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int n() {
        int i2 = this.f41877n;
        return (i2 != 1 && i2 == 0) ? 1 : 0;
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int n0() {
        return ((Integer) o00.o(this.on, "inter_type", 1)).intValue();
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int nm() {
        return ((Integer) o00.o(this.on, "shake_type", 2)).intValue();
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final String nn() {
        return (String) o00.o(this.on, "size", "");
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int no() {
        return ((Integer) o00.o(this.on, "button_type", 3)).intValue();
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int o0() {
        int i2 = this.o0;
        if (i2 != 1) {
            return i2 != 2 ? 2 : 1;
        }
        return 0;
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int o00() {
        if (this.mo == 1) {
            return 3;
        }
        return this.mm;
    }

    public final boolean o0m() {
        return this.nm == 2;
    }

    public final boolean o0o() {
        return mm() == 0;
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int om() {
        return this.oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    @Override // com.thinkup.core.common.mn.on.o
    public final int on() {
        ?? r0;
        Object obj;
        boolean zEquals;
        BaseAd baseAd = this.om;
        if (baseAd == null || baseAd.getDetail() == null || this.om.getDetail().n0n() != 8 || (obj = this.on.get("video_muted")) == null) {
            r0 = -1;
        } else {
            zEquals = TextUtils.equals(obj.toString(), "0");
        }
        if (r0 == -1) {
            r0 = zEquals;
            return o00.o(this.on, "video_muted", 0);
        }
        r0 = zEquals;
        return r0;
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int oo() {
        return this.mn;
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void pauseVideo() {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            baseAd.pauseVideo();
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams) {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            baseAd.registerListener(view, list, layoutParams);
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void resumeVideo() {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            baseAd.resumeVideo();
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setDevParams(Map<String, Object> map) {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            baseAd.setDevParams(map);
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setNativeEventListener(nm nmVar) {
        this.om.setNativeEventListener(nmVar);
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setNetworkInfoMap(Map<String, Object> map) {
        this.om.setNetworkInfoMap(map);
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setTrackingInfo(n0 n0Var) {
        this.om.setTrackingInfo(n0Var);
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setVideoMute(boolean z2) {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            baseAd.setVideoMute(z2);
        }
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final boolean supportSetPermissionClickViewList() {
        BaseAd baseAd = this.om;
        return baseAd != null && baseAd.supportSetPermissionClickViewList();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final boolean supportSetPrivacyClickViewList() {
        BaseAd baseAd = this.om;
        return baseAd != null && baseAd.supportSetPrivacyClickViewList();
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams, com.thinkup.core.basead.m.o0 o0Var) {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            baseAd.registerListener(view, list, layoutParams, o0Var);
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void registerListener(View view, TUNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        BaseAd baseAd = this.om;
        if (baseAd != null) {
            baseAd.registerListener(view, adPrepareInfo);
        }
    }

    @Override // com.thinkup.core.common.mn.on.o
    public final int o() {
        return this.o;
    }

    private boolean o(Object... objArr) {
        return getAdMediaView(objArr) == null && TextUtils.isEmpty(getMainImageUrl());
    }
}
