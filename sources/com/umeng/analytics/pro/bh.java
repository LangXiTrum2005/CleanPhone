package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2514a = "resolve.umeng.com";
    public static final int b = 15000;
    private static bl c = null;
    private static volatile int d = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final bh f2515a = new bh();

        private a() {
        }
    }

    public static bh a() {
        return a.f2515a;
    }

    private String c() {
        if (c == null) {
            c = bl.b();
        }
        bj bjVar = new bj("https://resolve.umeng.com/resolve", bj.a.GET, null, c);
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 发送domain下发请求。");
        return bjVar.a(15000, "");
    }

    public synchronized boolean b() {
        try {
            if (d < 0) {
                String strImprintProperty = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), "cj_domain", "0");
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> cj_domain读取值：" + strImprintProperty);
                if ("1".equalsIgnoreCase(strImprintProperty)) {
                    d = 1;
                } else {
                    d = 0;
                }
            }
            return d <= 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    private bh() {
    }

    public synchronized String a(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        c();
        String strC = bl.b().c();
        if (!TextUtils.isEmpty(strC)) {
            str2 = "https://" + strC + "/" + str;
        }
        return str2;
    }

    private static String c(String str) {
        try {
            return new URL(str).getHost();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return AbstractC5044xl.m("https://", str, "/", str2);
        }
        return "";
    }

    public static String b(String str) {
        try {
            String strC = c(str);
            return str.substring(str.indexOf(strC) + strC.length() + 1);
        } catch (Throwable unused) {
            return "";
        }
    }
}
