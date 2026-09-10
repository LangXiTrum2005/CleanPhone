package com.thinkup.core.api;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.thinkup.core.basead.m.o0;
import com.thinkup.core.common.n.nm;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.n0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseAd implements ITUThirdPartyMaterial {
    public abstract void clear(View view);

    public abstract void destroy();

    public abstract ViewGroup getCustomAdContainer();

    public abstract n0 getDetail();

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public abstract Map<String, Object> getNetworkInfoMap();

    public abstract boolean isNativeExpress();

    public boolean isValid() {
        return true;
    }

    public abstract void pauseVideo();

    public abstract void registerListener(View view, TUNativeAdInfo.AdPrepareInfo adPrepareInfo);

    public abstract void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams);

    public abstract void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams, o0 o0Var);

    public abstract void resumeVideo();

    public final void runOnMainThread(Runnable runnable) {
        o0n.m().m(runnable);
    }

    public abstract void setDevParams(Map<String, Object> map);

    public abstract void setNativeEventListener(nm nmVar);

    public abstract void setNetworkInfoMap(Map<String, Object> map);

    public abstract void setTrackingInfo(n0 n0Var);

    public abstract void setVideoMute(boolean z2);
}
