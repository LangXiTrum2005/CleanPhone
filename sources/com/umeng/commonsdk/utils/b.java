package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, PackageInfo> f2701a = new HashMap<>();
    private static Object b = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f2702a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.f2702a;
    }

    private b() {
    }

    public PackageInfo a(Context context, String str, int i) {
        PackageInfo packageInfo;
        synchronized (b) {
            try {
                if (f2701a.containsKey(str)) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", pkgInfo缓存命中，直接返回");
                    packageInfo = f2701a.get(str);
                } else {
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(str, i);
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", 获取pkgInfo并缓存");
                        f2701a.put(str, packageInfo);
                    } catch (PackageManager.NameNotFoundException unused) {
                        f2701a.put(str, null);
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg: " + str + "，目标包未安装。");
                        packageInfo = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return packageInfo;
    }
}
