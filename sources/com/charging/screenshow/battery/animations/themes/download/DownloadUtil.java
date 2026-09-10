package com.charging.screenshow.battery.animations.themes.download;

import android.support.v4.media.a;
import android.text.TextUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/download/DownloadUtil;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DownloadUtil {
    public static String a(String url, String str) {
        Intrinsics.f(url, "url");
        if (TextUtils.isEmpty(str)) {
            String strSubstring = url.substring(StringsKt.y(6, "/", url) + 1);
            Intrinsics.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        StringBuilder sbW = a.w(str);
        String strSubstring2 = url.substring(StringsKt.y(6, "/", url) + 1);
        Intrinsics.e(strSubstring2, "substring(...)");
        sbW.append(strSubstring2);
        return sbW.toString();
    }

    public static String b(String url, String str) {
        Intrinsics.f(url, "url");
        return FileUtil.a() + File.separator + a(url, str);
    }

    public static boolean c(String url, String str) {
        Intrinsics.f(url, "url");
        return new File(b(url, str)).exists();
    }
}
