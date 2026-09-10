package com.smartdigimkt.l5;

import android.view.View;
import com.smartdigimkt.k5.d;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes4.dex */
public interface a {
    void destroyPlayerView(int i2);

    long getVideoCurrentPosition();

    void initPlayerView(f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.q5.a.c cVar, d dVar);

    void pauseVideo();

    void resumeVideo();

    void setATImproveClickViewController(com.smartdigimkt.w5.a aVar);

    void setAutoPlay(String str);

    void setIsMuted(boolean z2);

    void setPlayerOnClickListener(View.OnClickListener onClickListener);

    void setVideoListener(SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener);
}
