package com.pgl.ssdk;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public class aj {
    public static String a() {
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT < 26) {
            return "!version_error!";
        }
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        return (currentWebViewPackage == null || (applicationInfo = currentWebViewPackage.applicationInfo) == null) ? "!error!" : applicationInfo.publicSourceDir;
    }
}
