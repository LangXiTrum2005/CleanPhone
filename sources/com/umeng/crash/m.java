package com.umeng.crash;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.system.Os;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.UMCrash;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f2724a = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};

    public static String a(Context context) {
        return UMFrUtils.getCurrentProcessName(context);
    }

    public static String b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(applicationInfo);
            return obj instanceof String ? (String) obj : "";
        } catch (Throwable th) {
            UCrash.a().a("UCrash.Utils", "get primary cpu abi failed", th);
            return "";
        }
    }

    public static String c(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String d(Context context) {
        return DeviceConfig.getAppVersionName(context);
    }

    public static String e(Context context) {
        return DeviceConfig.getAppVersionCode(context);
    }

    public static String f() {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder("meminfo:\n");
        try {
            bufferedReader = new BufferedReader(new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO), 1024);
            int i = 0;
            do {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line.trim());
                    sb.append("\n");
                    i++;
                } catch (Throwable unused) {
                }
            } while (i < 500);
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        k.a(bufferedReader);
        sb.append("\n");
        return sb.toString();
    }

    public static String g() {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder("limits:\n");
        try {
            Locale locale = Locale.US;
            bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/limits"), 1024);
            int i = 0;
            do {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line.trim());
                    sb.append("\n");
                    i++;
                } catch (Throwable unused) {
                }
            } while (i < 100);
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        k.a(bufferedReader);
        sb.append("\n");
        return sb.toString();
    }

    public static String h() {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder("status:\n");
        try {
            Locale locale = Locale.US;
            bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/status"), 1024);
            int i = 0;
            do {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line.trim());
                    sb.append("\n");
                    i++;
                } catch (Throwable unused) {
                }
            } while (i < 200);
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        k.a(bufferedReader);
        sb.append("\n");
        return sb.toString();
    }

    public static String i() {
        StringBuilder sb = new StringBuilder("um_app_key: ");
        Map<String, String> mapB = c.a().b();
        String strRemove = mapB.remove(UMCrash.KEY_HEADER_APPKEY);
        if (TextUtils.isEmpty(strRemove)) {
            strRemove = UMUtils.getAppkey(UMGlobalContext.getAppContext());
        }
        sb.append(strRemove);
        sb.append("\n");
        for (Map.Entry<String, String> entry : mapB.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                AbstractC5044xl.t(sb, key, ": ", value, "\n");
            }
        }
        return sb.toString();
    }

    public static String j() {
        int i;
        try {
            Intent intentRegisterReceiver = UMGlobalContext.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                return "null\n";
            }
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("voltage", -1);
            int intExtra3 = intentRegisterReceiver.getIntExtra("temperature", -1);
            int intExtra4 = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            int i2 = 0;
            if (intExtra4 == 1) {
                i = -1;
            } else if (intExtra4 == 2) {
                i = 1;
            } else {
                i = intExtra4 == 5 ? 2 : 0;
            }
            int intExtra5 = intentRegisterReceiver.getIntExtra("plugged", -1);
            if (intExtra5 == 1) {
                i2 = 1;
            } else if (intExtra5 == 2) {
                i2 = 2;
            }
            return "battery info:\nlevel: " + intExtra + "\nscale: " + intentRegisterReceiver.getIntExtra("scale", -1) + "\nhealth: " + intentRegisterReceiver.getIntExtra("health", -1) + "\npluged: " + i2 + "\nstatus: " + i + "\nvoltage: " + intExtra2 + "\ntemperature: " + intExtra3 + "\ntechnology: " + intentRegisterReceiver.getStringExtra("technology") + "\n";
        } catch (Throwable th) {
            UCrash.a().a("UCrash.Utils", "getBatteryInfo", th);
            return "null\n";
        }
    }

    public static String k() {
        try {
            return c(UMGlobalContext.getAppContext().getFilesDir().getParent());
        } catch (Throwable th) {
            UCrash.a().a("UCrash.Utils", "getDiskInfo", th);
            return "\n";
        }
    }

    public static String l() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return mainLooper.getThread().getName();
        }
        return null;
    }

    public static String m() {
        Locale locale = Locale.US;
        return "device status:\nhas root: " + n() + "\nbuild tags: " + Build.TAGS + "\n";
    }

    private static boolean n() {
        try {
            for (String str : f2724a) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static String o() {
        String strA;
        if (!TextUtils.isEmpty(a("ro.miui.ui.version.name", ""))) {
            try {
                strA = a("ro.product.marketname", "");
                try {
                    if (TextUtils.isEmpty(strA)) {
                        strA = a("ro.product.model", "");
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                strA = "";
            }
        } else {
            strA = null;
        }
        if (TextUtils.isEmpty(strA)) {
            strA = Build.MODEL;
        }
        return strA == null ? "" : strA;
    }

    private static String p() {
        String str;
        String str2;
        BufferedReader bufferedReader = null;
        String str3 = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/cpuinfo"), 512);
            str2 = null;
            int i = 0;
            do {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    String strTrim = line.substring(line.indexOf(":") + 1).trim();
                    if (line.startsWith("Hardware")) {
                        i++;
                        str3 = strTrim;
                    } else if (line.startsWith("Processor")) {
                        i++;
                        str2 = strTrim;
                    }
                } catch (Throwable unused) {
                    str = str3;
                    bufferedReader = bufferedReader2;
                    k.a(bufferedReader);
                    str3 = str;
                }
            } while (i < 2);
            k.a(bufferedReader2);
        } catch (Throwable unused2) {
            str = null;
            str2 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            try {
                str3 = Build.HARDWARE;
            } catch (Throwable unused3) {
            }
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "-";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "-";
        }
        return AbstractC5044xl.m("processor: ", str2, "/hardware: ", str3);
    }

    private static String q() {
        FileInputStream fileInputStream;
        String str;
        String str2 = null;
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(UMGlobalContext.getAppContext().getFilesDir().getParent(), "crashsdk/tags");
            if (file.exists() && !file.isDirectory()) {
                file.delete();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "unique");
            if (file2.exists()) {
                try {
                    fileInputStream = new FileInputStream(file2);
                    try {
                        byte[] bArr = new byte[48];
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            k.a(fileInputStream);
                            return null;
                        }
                        str = new String(bArr, 0, i);
                        try {
                            k.a(fileInputStream);
                        } catch (Throwable unused) {
                            str2 = str;
                            return str2;
                        }
                    } catch (Throwable unused2) {
                        k.a(fileInputStream);
                        str = null;
                    }
                } catch (Throwable unused3) {
                    fileInputStream = null;
                }
            } else {
                str = null;
            }
            if (str != null) {
                str = str.length() != 36 ? null : str.replaceAll("[^0-9a-zA-Z-]", "-");
            }
            if (str != null && !str.trim().isEmpty()) {
                return str;
            }
            String string = UUID.randomUUID().toString();
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.flush();
                    k.a((Closeable) fileOutputStream2);
                    return string;
                } catch (Throwable unused4) {
                    fileOutputStream = fileOutputStream2;
                    k.a((Closeable) fileOutputStream);
                    return string;
                }
            } catch (Throwable unused5) {
            }
        } catch (Throwable unused6) {
        }
    }

    public static ActivityManager.ProcessErrorStateInfo a() {
        ActivityManager activityManager = (ActivityManager) UMGlobalContext.getAppContext().getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        for (int i = 0; i < 50; i++) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                if (i % 2 == 0) {
                    UCrash.a().a("UCrash.Utils", "state not null. times:" + (i / 2));
                }
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.pid == iMyPid && processErrorStateInfo.condition == 2) {
                        UCrash.a().b("UCrash.Utils", "anr info.pid:" + processErrorStateInfo.pid + ", info.condition:" + processErrorStateInfo.condition);
                        return processErrorStateInfo;
                    }
                }
            } else if (i % 2 == 0) {
                UCrash.a().a("UCrash.Utils", "state empty. total:25, times:" + (i / 2));
            }
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String c() throws Throwable {
        int iMyPid = Process.myPid();
        StringBuilder sbO = DM.o("logcat:\n");
        c cVarA = c.a();
        int i = cVarA.l;
        if (i > 0) {
            a(iMyPid, sbO, "main", i, 'D');
        }
        int i2 = cVarA.m;
        if (i2 > 0) {
            a(iMyPid, sbO, "system", i2, 'W');
        }
        int i3 = cVarA.n;
        if (i3 > 0) {
            a(iMyPid, sbO, com.umeng.analytics.pro.f.ax, i3, 'I');
        }
        return sbO.toString();
    }

    public static boolean d() {
        return "1".equals(a("debug.umeng.apm", "0"));
    }

    public static String e() {
        try {
            StringBuilder sb = new StringBuilder("memory info:\nJavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\nJavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\nJavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\nNativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\nNativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\nNativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\n");
            try {
                ActivityManager activityManager = (ActivityManager) UMGlobalContext.getAppContext().getSystemService("activity");
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    sb.append("availMem:   ");
                    sb.append(memoryInfo.availMem / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                    sb.append(" kB\n");
                    sb.append("threshold:  ");
                    sb.append(memoryInfo.threshold / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                    sb.append(" kB\n");
                    sb.append("lowMemory:  ");
                    sb.append(memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            sb.append("\n");
            return sb.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String b() {
        String canonicalPath;
        StringBuilder sb = new StringBuilder();
        try {
            File[] fileArrListFiles = new File("/proc/self/fd").listFiles(new FilenameFilter() { // from class: com.umeng.crash.m.1
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return TextUtils.isDigitsOnly(str);
                }
            });
            if (fileArrListFiles != null) {
                sb.append("opened file count: ");
                sb.append(fileArrListFiles.length);
                sb.append(", write limit: 0\n");
                sb.append("opened files:\n");
                for (File file : fileArrListFiles) {
                    try {
                        canonicalPath = Os.readlink(file.getAbsolutePath());
                    } catch (Throwable unused) {
                        canonicalPath = null;
                    }
                    try {
                        if (TextUtils.isEmpty(canonicalPath)) {
                            canonicalPath = file.getCanonicalPath();
                        }
                    } catch (Exception unused2) {
                    }
                    sb.append(file.getName());
                    sb.append(" -> ");
                    sb.append(TextUtils.isEmpty(canonicalPath) ? "" : canonicalPath.trim());
                    sb.append('\n');
                }
            }
        } catch (Throwable unused3) {
        }
        sb.append('\n');
        return sb.toString();
    }

    public static String a(String str, long j, String str2) {
        c cVarA = c.a();
        e eVarA = e.a();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        StringBuilder sb = new StringBuilder("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n");
        int iMyPid = Process.myPid();
        int iMyTid = Process.myTid();
        String str3 = simpleDateFormat.format(Long.valueOf(j));
        StringBuilder sbT = AbstractC3950lJ.t("Basic Information: 'pid: ", iMyPid, "/tid: ", iMyTid, "/time: ");
        sbT.append(str3);
        sbT.append("'\n");
        sb.append(sbT.toString());
        int i = Build.VERSION.SDK_INT;
        sb.append(AbstractC5044xl.n("Cpu Information: 'abi: ", TextUtils.join(",", Build.SUPPORTED_ABIS), "/", p(), "'\n"));
        StringBuilder sbR = DM.r("Mobile Information: 'model: ", o(), "/version: ", Build.VERSION.RELEASE, "/sdk: ");
        sbR.append(i);
        sbR.append("'\n");
        sb.append(sbR.toString());
        sb.append("Build fingerprint: '" + Build.FINGERPRINT + "'\n");
        String str4 = simpleDateFormat.format(Long.valueOf(cVarA.k));
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        String str5 = cVarA.i;
        String str6 = eVarA.f2718a ? "fg" : "bg";
        StringBuilder sb2 = new StringBuilder("Runtime Information: 'start: ");
        sb2.append(str4);
        sb2.append("/maxheap: ");
        sb2.append(jMaxMemory);
        AbstractC5044xl.t(sb2, "/primaryabi: ", str5, "/ground: ", str6);
        sb2.append("'\n");
        sb.append(sb2.toString());
        sb.append(AbstractC5044xl.n("Application Information: 'version: ", cVarA.g, "/versioncode: ", cVarA.h, "'\n"));
        sb.append("CrashSDK Information: 'version: 1.1.0'\n");
        sb.append("Report Name: " + str2 + "\n");
        sb.append("UUID: " + q() + "\n");
        sb.append("Log Type: " + str + "\n");
        if (UCrashCallback.TYPE_ANR.equals(str) || UCrashCallback.TYPE_NATIVE.equals(str)) {
            sb.append("Build time: " + Build.TIME + "\n");
            sb.append("Build version incremental: " + Build.VERSION.INCREMENTAL + "\n");
        }
        sb.append("Activity: " + (TextUtils.isEmpty(eVarA.b) ? "null" : eVarA.b) + "\n");
        return sb.toString();
    }

    private static String c(String str) {
        try {
            StatFs statFs = new StatFs(str);
            long blockSizeLong = statFs.getBlockSizeLong();
            return "disk info:\n" + str + ":\n  total:      " + ((statFs.getBlockCountLong() * blockSizeLong) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + " kB\n  available:  " + ((statFs.getAvailableBlocksLong() * blockSizeLong) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + " kB\n  free:       " + ((statFs.getFreeBlocksLong() * blockSizeLong) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + " kB\n  block size: " + blockSizeLong + " B\n";
        } catch (Throwable th) {
            UCrash.a().a("UCrash.Utils", "getDiskInfoImpl", th);
            return "\n";
        }
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (!TextUtils.equals(str, key.getName()) && value != null && value.length != 0) {
                sb.append("--- --- --- ---\ntid: ");
                sb.append(key.getId());
                sb.append(", name: ");
                sb.append(key.getName());
                sb.append("\njava stacktrace:\n");
                for (StackTraceElement stackTraceElement : value) {
                    sb.append("\tat ");
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.Closeable] */
    private static void a(int i, StringBuilder sb, String str, int i2, char c) throws Throwable {
        ?? r9;
        Throwable th;
        BufferedReader bufferedReader;
        Exception e;
        boolean z = Build.VERSION.SDK_INT >= 24;
        String string = Integer.toString(i);
        String strB = DM.B(" ", string, " ");
        ArrayList arrayList = new ArrayList();
        arrayList.add("/system/bin/logcat");
        arrayList.add("-b");
        arrayList.add(str);
        arrayList.add("-d");
        arrayList.add("-v");
        arrayList.add("threadtime");
        arrayList.add("-t");
        int i3 = i2;
        if (!z) {
            i3 = (int) (((double) i2) * 1.2d);
        }
        arrayList.add(Integer.toString(i3));
        if (z) {
            arrayList.add("--pid");
            arrayList.add(string);
        }
        arrayList.add("*:".concat(String.valueOf(c)));
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[0]).command(arrayList).start().getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            if (z || line.contains(strB)) {
                                sb.append(line);
                                sb.append("\n");
                            }
                        } else {
                            k.a(bufferedReader);
                            return;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        UCrash.a().a("UCrash.Utils", "get logcat failed", e);
                        k.a(bufferedReader);
                        return;
                    }
                }
            } catch (Exception e3) {
                bufferedReader = null;
                e = e3;
            } catch (Throwable th2) {
                r9 = 0;
                th = th2;
                k.a((Closeable) r9);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r9 = i3;
            k.a((Closeable) r9);
            throw th;
        }
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static String a(boolean z) {
        c cVarA = c.a();
        Locale locale = Locale.US;
        return "recent status:\nlast version: '" + cVarA.d + "'\ndumping all threads: " + z + "\n";
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder("java stacktrace:\n");
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (TextUtils.equals(str, entry.getKey().getName())) {
                StackTraceElement[] value = entry.getValue();
                for (StackTraceElement stackTraceElement : value) {
                    sb.append("\tat ");
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
                break;
            }
        }
        return sb.toString();
    }
}
