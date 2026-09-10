package com.bytedance.sdk.component.adexpress.fi;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private WeakReference<lr> ri;

    public ik(lr lrVar) {
        this.ri = new WeakReference<>(lrVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<lr> weakReference = this.ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ri.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<lr> weakReference = this.ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ri.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<lr> weakReference = this.ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ri.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<lr> weakReference = this.ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ri.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<lr> weakReference = this.ri;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ri.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().ri(str);
    }

    public void ri(lr lrVar) {
        this.ri = new WeakReference<>(lrVar);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().skipVideo();
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<lr> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().videoFrameChanged(str);
    }
}
