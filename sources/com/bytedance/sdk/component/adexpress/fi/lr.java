package com.bytedance.sdk.component.adexpress.fi;

/* JADX INFO: loaded from: classes2.dex */
public interface lr {
    String adInfo();

    String appInfo();

    void changeVideoState(String str);

    void clickEvent(String str);

    void dynamicTrack(String str);

    String getCurrentVideoState();

    String getData(String str);

    String getTemplateInfo();

    void initRenderFinish();

    void muteVideo(String str);

    void renderDidFinish(String str);

    void ri(String str);

    void skipVideo();

    void videoFrameChanged(String str);
}
