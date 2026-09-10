package com.efs.sdk.memleaksdk.monitor.internal;

import android.app.Application;
import android.content.SharedPreferences;
import com.efs.sdk.memleaksdk.monitor.UMonitor;
import com.umeng.commonsdk.utils.UMUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SharedPreferences f683a;
    private static String b;

    public static void a(Application application) {
        f683a = application.getSharedPreferences("u_monitor", 0);
        b = UMUtils.getAppVersionName(UMonitor.getContext()) + "_";
    }

    public static void b() {
        SharedPreferences sharedPreferences = f683a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt(DM.m(new StringBuilder(), b, "times"), sharedPreferences.getInt(b + "times", 0) + 1).apply();
    }

    public static long c() {
        SharedPreferences sharedPreferences = f683a;
        if (sharedPreferences == null) {
            return 0L;
        }
        long j = sharedPreferences.getLong(DM.m(new StringBuilder(), b, "first_analysis_time"), 0L);
        if (j != 0) {
            return j;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        a(jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    public static int a() {
        SharedPreferences sharedPreferences = f683a;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt(b + "times", 0);
    }

    public static void a(long j) {
        SharedPreferences sharedPreferences = f683a;
        if (sharedPreferences == null) {
            return;
        }
        if (sharedPreferences.contains(b + "first_analysis_time")) {
            return;
        }
        sharedPreferences.edit().putLong(DM.m(new StringBuilder(), b, "first_analysis_time"), j).apply();
    }
}
