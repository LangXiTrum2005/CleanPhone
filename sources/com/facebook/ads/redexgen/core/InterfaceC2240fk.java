package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2240fk {
    void A9d();

    boolean A9q();

    boolean A9r();

    boolean AAc();

    void AGr(boolean z2, int i2);

    void AK1(int i2);

    void AK6(EnumC2187et enumC2187et, int i2);

    void AKF(int i2);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC2187et getStartReason();

    EnumC2242fm getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i2);

    void setBackgroundPlaybackEnabled(boolean z2);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z2);

    void setRequestedVolume(float f);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC2243fn interfaceC2243fn);

    void setup(Uri uri);
}
