package com.efs.sdk.h5pagesdk;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes2.dex */
public class UApmJSBridge {
    @JavascriptInterface
    public String getLaunchOptionsSync() {
        try {
            return H5Manager.getH5ConfigMananger() != null ? H5Manager.getH5ConfigMananger().generateLaunchOptions() : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @JavascriptInterface
    public void sendData(String str) {
        if (str != null) {
            try {
                if (str.length() == 0 || H5Manager.getH5ConfigMananger() == null) {
                    return;
                }
                H5Manager.getH5ConfigMananger().sendData(str);
            } catch (Throwable unused) {
            }
        }
    }
}
