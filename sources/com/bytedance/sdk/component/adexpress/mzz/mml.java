package com.bytedance.sdk.component.adexpress.mzz;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.qdl.aaj;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    private WeakReference<aaj> qdl;

    public mml(aaj aajVar) {
        this.qdl = new WeakReference<>(aajVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<aaj> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().invokeMethod(str);
    }

    public void qdl(aaj aajVar) {
        this.qdl = new WeakReference<>(aajVar);
    }
}
