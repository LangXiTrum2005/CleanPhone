package com.smartdigimkt.sdk.api.business.express;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.f5.a;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class IExpressComponent {
    public abstract void destroy();

    public abstract int getAdType();

    public abstract View getBannerView();

    public abstract View getMBOutNativeAdvancedViewGroup();

    public abstract boolean isReady();

    public abstract void registerBannerListener();

    public abstract void registerNativeTemplateListener();

    public abstract void setCloseBtnSateFromOut(int i2);

    public abstract void setListener(a aVar);

    public abstract void setLogoSizeHAndW(int i2, int i3);

    public abstract void setMuteStateFromOut(int i2);

    public abstract void setPauseState(int i2);

    public abstract void setPlayModeFromOut(int i2);

    public abstract void setResumeState(int i2);

    public abstract boolean showInterstitial(Activity activity, Map<String, Object> map, String str, String str2);

    public abstract boolean showRewardedVideo(Activity activity, Map<String, Object> map, String str, String str2);

    public abstract boolean showSplash(ViewGroup viewGroup, Map<String, Object> map);
}
