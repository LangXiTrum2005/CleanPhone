package com.zg.adlib.util;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.zg.adlib.ZGAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/zg/adlib/util/AppUtil;", "", "<init>", "()V", "VERSION", "", "getAppVersionName", "getAppVersionCode", "", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppUtil {
    public static final AppUtil INSTANCE = new AppUtil();
    public static final String VERSION = "1.0.5";

    private AppUtil() {
    }

    public final int getAppVersionCode() {
        try {
            PackageManager packageManager = ZGAd.getInstance().getContext().getPackageManager();
            Intrinsics.e(packageManager, "getPackageManager(...)");
            PackageInfo packageInfo = packageManager.getPackageInfo(ZGAd.getInstance().getContext().getPackageName(), 0);
            if (packageInfo != null) {
                return Build.VERSION.SDK_INT > 28 ? (int) packageInfo.getLongVersionCode() : packageInfo.versionCode;
            }
            return 100;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 100;
        }
    }

    public final String getAppVersionName() {
        try {
            PackageManager packageManager = ZGAd.getInstance().getContext().getPackageManager();
            Intrinsics.e(packageManager, "getPackageManager(...)");
            PackageInfo packageInfo = packageManager.getPackageInfo(ZGAd.getInstance().getContext().getPackageName(), 0);
            if (packageInfo == null) {
                return "";
            }
            return packageInfo.versionName + "";
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
