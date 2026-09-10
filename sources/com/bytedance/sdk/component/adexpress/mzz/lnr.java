package com.bytedance.sdk.component.adexpress.mzz;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private WeakReference<ud> qdl;

    public lnr(ud udVar) {
        this.qdl = new WeakReference<>(udVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<ud> weakReference = this.qdl;
        return (weakReference == null || weakReference.get() == null) ? "" : this.qdl.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<ud> weakReference = this.qdl;
        return (weakReference == null || weakReference.get() == null) ? "" : this.qdl.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<ud> weakReference = this.qdl;
        return (weakReference == null || weakReference.get() == null) ? "" : this.qdl.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<ud> weakReference = this.qdl;
        return (weakReference == null || weakReference.get() == null) ? "" : this.qdl.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<ud> weakReference = this.qdl;
        return (weakReference == null || weakReference.get() == null) ? "" : this.qdl.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().muteVideo(str);
    }

    public void qdl(ud udVar) {
        this.qdl = new WeakReference<>(udVar);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().qdl(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().skipVideo();
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<ud> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().videoFrameChanged(str);
    }
}
