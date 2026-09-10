package com.bytedance.sdk.component.adexpress.JXs;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private WeakReference<LD> Lxb;

    public lk(LD ld) {
        this.Lxb = new WeakReference<>(ld);
    }

    public void Lxb(LD ld) {
        this.Lxb = new WeakReference<>(ld);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<LD> weakReference = this.Lxb;
        return (weakReference == null || weakReference.get() == null) ? "" : this.Lxb.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<LD> weakReference = this.Lxb;
        return (weakReference == null || weakReference.get() == null) ? "" : this.Lxb.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void chooseAdResult(String str) {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().chooseAdResult(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<LD> weakReference = this.Lxb;
        return (weakReference == null || weakReference.get() == null) ? "" : this.Lxb.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<LD> weakReference = this.Lxb;
        return (weakReference == null || weakReference.get() == null) ? "" : this.Lxb.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<LD> weakReference = this.Lxb;
        return (weakReference == null || weakReference.get() == null) ? "" : this.Lxb.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().Lxb(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<LD> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().skipVideo();
    }
}
