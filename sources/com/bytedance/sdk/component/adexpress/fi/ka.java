package com.bytedance.sdk.component.adexpress.fi;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.ri.ac;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private WeakReference<ac> ri;

    public ka(ac acVar) {
        this.ri = new WeakReference<>(acVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<ac> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().invokeMethod(str);
    }

    public void ri(ac acVar) {
        this.ri = new WeakReference<>(acVar);
    }
}
