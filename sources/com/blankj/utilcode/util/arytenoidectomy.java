package com.blankj.utilcode.util;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: compiled from: ProcessUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class arytenoidectomy {
    public static String attabal() {
        String strDern = dern();
        if (!TextUtils.isEmpty(strDern)) {
            return strDern;
        }
        String strSaneness = saneness();
        return !TextUtils.isEmpty(strSaneness) ? strSaneness : wireman();
    }

    public static String dern() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return strTrim;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean marial() {
        return adultoid.attabal().getPackageName().equals(attabal());
    }

    public static String saneness() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) adultoid.attabal().getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                int iMyPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid && (str = runningAppProcessInfo.processName) != null) {
                        return str;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static String wireman() {
        try {
            Application applicationAttabal = adultoid.attabal();
            Field field = applicationAttabal.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationAttabal);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
