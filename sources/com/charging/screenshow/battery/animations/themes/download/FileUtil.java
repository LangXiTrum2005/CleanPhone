package com.charging.screenshow.battery.animations.themes.download;

import android.os.Build;
import android.support.v4.media.a;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/download/FileUtil;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileUtil {
    public static String a() {
        String absolutePath;
        StringBuilder sb = new StringBuilder();
        if (AppExt.a().getExternalFilesDir("Anime4K") != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                File externalFilesDir = AppExt.a().getExternalFilesDir("Anime4K");
                Intrinsics.c(externalFilesDir);
                absolutePath = externalFilesDir.getPath();
            } else if (i2 < 29) {
                File externalFilesDir2 = AppExt.a().getExternalFilesDir("Anime4K");
                Intrinsics.c(externalFilesDir2);
                absolutePath = externalFilesDir2.getAbsolutePath();
            } else {
                absolutePath = "";
            }
        } else {
            absolutePath = AppExt.a().getFilesDir().getAbsolutePath();
        }
        sb.append(absolutePath);
        return a.r(sb, File.separator, NativeAdPresenter.DOWNLOAD);
    }
}
