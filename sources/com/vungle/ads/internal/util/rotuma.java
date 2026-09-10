package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.Build;
import android.webkit.URLUtil;
import java.io.File;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/util/rotuma;", "", "<init>", "()V", "Ljava/io/File;", "dir", "", "getFolderSize", "(Ljava/io/File;)J", "", "url", "", "isUrlValid", "(Ljava/lang/String;)Z", "isOSVersionInvalid", "()Z", "Landroid/content/Context;", "context", "getWebViewDataSize", "(Landroid/content/Context;)J", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class rotuma {
    public static final rotuma INSTANCE = new rotuma();

    private rotuma() {
    }

    private final long getFolderSize(File dir) {
        long length = 0;
        if (dir.exists()) {
            for (File file : interaction.impromptu.polloi(dir)) {
                if (file.isFile()) {
                    length += file.length();
                }
            }
        }
        return length;
    }

    public final long getWebViewDataSize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long folderSize = 0;
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            folderSize = file.exists() ? getFolderSize(file) : 0L;
            File cacheDir = context.getCacheDir();
            if (!cacheDir.exists()) {
                return folderSize;
            }
            Intrinsics.checkNotNullExpressionValue(cacheDir, "cacheDir");
            return folderSize + getFolderSize(interaction.taiyuan.rotuma(cacheDir, "webviewCache"));
        } catch (Exception e) {
            arytenoidectomy.INSTANCE.e("WebViewSize", "Error reading WebView data size: " + e.getMessage());
            return folderSize;
        }
    }

    public final boolean isOSVersionInvalid() {
        return Build.VERSION.SDK_INT < 25;
    }

    public final boolean isUrlValid(String url) {
        if (url == null || url.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(url) || URLUtil.isHttpUrl(url);
    }
}
