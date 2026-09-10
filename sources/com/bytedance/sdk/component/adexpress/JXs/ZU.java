package com.bytedance.sdk.component.adexpress.JXs;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.Lxb.CSn;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private WeakReference<CSn> Lxb;

    public ZU(CSn cSn) {
        this.Lxb = new WeakReference<>(cSn);
    }

    public void Lxb(CSn cSn) {
        this.Lxb = new WeakReference<>(cSn);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<CSn> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().invokeMethod(str);
    }
}
