package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.bykv.vk.openvk.ri.ri.ri.ik.attabal;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.ironsource.C3724ra;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import logician.dern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ig {
    private static final byte[] aw;
    private static String bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private static final byte[] f18172co;
    public static Integer ri;
    private static final HashSet<String> sf;
    private static String vr;
    private static final ExecutorService lr = Executors.newSingleThreadExecutor();
    private static volatile boolean ik = false;
    private static final AtomicInteger ka = new AtomicInteger(0);
    private static volatile String fi = "";
    private static final ReentrantLock di = new ReentrantLock();
    private static String xha = null;
    private static String mj = null;
    private static String jbs = null;
    private static final HashSet<String> qt = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ig$2, reason: invalid class name */
    public static class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(ig.fi)) {
                    com.bytedance.sdk.component.jbs.di diVar = new com.bytedance.sdk.component.jbs.di(com.bytedance.sdk.openadsdk.core.nr.ri(), com.bytedance.sdk.component.jbs.di.ik.USER_AGENT);
                    diVar.setWebViewClient(new com.bytedance.sdk.component.jbs.di.ri());
                    String unused = ig.fi = diVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.zf.ri(diVar);
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "", e);
            } catch (NoClassDefFoundError e2) {
                com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "", e2);
            }
        }
    }

    public static class ik {
        private static final int ri;

        static {
            com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i = 2;
            try {
                int i2 = RecyclerView.stratoscope.f13306attabal;
                if (RecyclerView.stratoscope.class.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i = 0;
                }
            } catch (ClassNotFoundException unused) {
                i = 1;
            } catch (NoSuchMethodException unused2) {
            }
            ri = i;
            com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i)));
        }
    }

    public static class lr {
        public final int lr;
        public final ComponentName ri;

        public lr(ComponentName componentName, int i) {
            this.ri = componentName;
            this.lr = i;
        }
    }

    public static class ri implements Callable<String> {
        private final int ri;

        public ri(int i) {
            this.ri = i;
        }

        private synchronized String ik() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ig.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = ig.xd();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }

        private String lr() {
            String property;
            Throwable th;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            com.bytedance.sdk.openadsdk.core.ik.ri().ri("android_system_ua", property);
                            return property;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.ac.ik("getUA", "e:" + th.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th3) {
                property = "unKnow";
                th = th3;
            }
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strLr;
            try {
                strLr = "unKnow";
                int i = this.ri;
                if (i == 1) {
                    strLr = ik();
                } else if (i == 2) {
                    strLr = lr();
                }
            } catch (Throwable th) {
                throw th;
            }
            return strLr;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        sf = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        ri = null;
        f18172co = new byte[]{108, 111, 97, 100, 105, 110, 103};
        aw = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static String ac() {
        String strJm = com.bytedance.sdk.openadsdk.core.settings.sf.jm();
        if (!TextUtils.isEmpty(strJm)) {
            return strJm;
        }
        String strJc = com.bytedance.sdk.openadsdk.core.nr.ka().jc();
        return TextUtils.isEmpty(strJc) ? uq.ri() : strJc;
    }

    public static long aw() {
        return com.bytedance.sdk.openadsdk.core.ik.ri().lr("free_internal_storage", 0L).longValue();
    }

    public static int ay() {
        try {
            String id = TimeZone.getDefault().getID();
            if (qt.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id == null || !id.startsWith("Europe/")) {
                return (id == null || !id.startsWith("America/") || sf.contains(id)) ? 3 : 5;
            }
            return 4;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static long bgr() {
        return com.bytedance.sdk.openadsdk.core.ik.ri().lr("total_sdcard_storage", 0L).longValue();
    }

    public static boolean bu() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long co() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean di(int i) {
        return i == 6;
    }

    public static String dw() {
        String str = vr;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(aw);
        vr = str2;
        return str2;
    }

    private static boolean dzy() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean fi(int i) {
        return i == 5;
    }

    public static int fr() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static boolean igq() {
        return ka.get() == 1;
    }

    public static String ihz() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String ik(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i == 2) {
            return "interaction";
        }
        if (i == 3 || i == 4) {
            return "open_ad";
        }
        if (i != 7) {
            return i != 8 ? "embeded_ad" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    public static String jbs() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.nr.ri().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            if (j > 0) {
                return String.valueOf(j / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean ka(int i) {
        return i == 4;
    }

    public static boolean lr(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.lr.ri(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static synchronized String mj() {
        try {
            if (TextUtils.isEmpty(jbs) && com.bytedance.sdk.openadsdk.core.nr.ri() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.nr.ri().getPackageManager().getPackageInfo(di(), 0);
                    mj = String.valueOf(packageInfo.versionCode);
                    jbs = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jbs;
    }

    public static String nr() {
        String strSrn = com.bytedance.sdk.openadsdk.core.nr.ka().srn();
        return TextUtils.isEmpty(strSrn) ? uq.ri() : strSrn;
    }

    public static int ory() {
        return ik.ri;
    }

    public static String qt() {
        return com.bytedance.sdk.openadsdk.core.ik.ri().lr("total_memory", "0");
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, View view) {
    }

    public static int slm() {
        return com.bytedance.sdk.openadsdk.core.ik.ri().lr("is_root", -1);
    }

    public static String su() {
        int i = -fr();
        return i >= 0 ? "Etc/GMT+".concat(String.valueOf(i)) : "Etc/GMT".concat(String.valueOf(i));
    }

    public static String tan() {
        String strVt = com.bytedance.sdk.openadsdk.core.nr.ka().vt();
        if (!TextUtils.isEmpty(strVt)) {
            return strVt;
        }
        String strRi = uq.ri();
        if (TextUtils.isEmpty(strRi)) {
            return strVt;
        }
        return "https://" + strRi + "/service/2/dual_events/";
    }

    public static String uq() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static long vr() {
        try {
            if (!dzy()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    public static String wjv() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String xd() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.nr.ri());
            webView.setWebViewClient(new com.bytedance.sdk.component.jbs.di.ri());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString == null || "unKnow".equals(userAgentString)) {
                return userAgentString;
            }
            com.bytedance.sdk.openadsdk.core.ik.ri().ri("webview_ua", userAgentString);
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static int xha(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return i;
        }
        return 5;
    }

    public static String zf() {
        String str = bgr;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(f18172co);
        bgr = str2;
        return str2;
    }

    public static synchronized String di() {
        Context contextRi;
        try {
            if (TextUtils.isEmpty(xha) && (contextRi = com.bytedance.sdk.openadsdk.core.nr.ri()) != null) {
                try {
                    xha = contextRi.getPackageName();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return xha;
    }

    public static String fi() {
        return su.ri();
    }

    public static boolean ka(Context context) {
        return false;
    }

    public static void qt(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.ac.ik("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.", new Object[0]);
    }

    public static Intent ri(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static String sf() {
        return ik("MemTotal");
    }

    public static synchronized String xha() {
        try {
            if (TextUtils.isEmpty(mj) && com.bytedance.sdk.openadsdk.core.nr.ri() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.nr.ri().getPackageManager().getPackageInfo(di(), 0);
                    mj = String.valueOf(packageInfo.versionCode);
                    jbs = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return mj;
    }

    public static String fi(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.nr.ka().kt();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static String ka() {
        if (!TextUtils.isEmpty(fi)) {
            return fi;
        }
        com.bytedance.sdk.openadsdk.tan.ri.ri(com.bytedance.sdk.openadsdk.core.nr.ri());
        String strRi = com.bytedance.sdk.openadsdk.core.qt.ri("sdk_local_web_ua", SignalManager.TWENTY_FOUR_HOURS_MILLIS);
        fi = strRi;
        if (TextUtils.isEmpty(strRi)) {
            ReentrantLock reentrantLock = di;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(fi)) {
                            fi = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.nr.ri());
                        }
                        com.bytedance.sdk.openadsdk.core.qt.ri("sdk_local_web_ua", fi);
                        reentrantLock.unlock();
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "", e);
                        di.unlock();
                    } catch (NoClassDefFoundError e2) {
                        com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "", e2);
                        di.unlock();
                    }
                }
            } catch (Throwable th) {
                di.unlock();
                throw th;
            }
        }
        return fi;
    }

    public static int qt(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = ri;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        ri = Integer.valueOf(size);
        return size;
    }

    private static String co(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(C3724ra.b, "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", xha()).toString();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    public static String di(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static void ik() {
        com.bytedance.sdk.openadsdk.slm.ka.ri("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.utils.ig.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", ig.ory());
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("recycle_version_not_valid").lr(jSONObject.toString());
            }
        });
    }

    public static boolean jbs(String str) {
        if (com.bytedance.sdk.openadsdk.core.vr.fi()) {
            return true;
        }
        com.bytedance.sdk.component.utils.ac.ik("You must use method '" + str + "' after initialization, please check.", new Object[0]);
        return false;
    }

    public static String lr(int i) {
        if (i == 1) {
            return "embeded_ad_landingpage";
        }
        if (i == 2) {
            return "banner_ad_landingpage";
        }
        if (i == 3) {
            return "interaction_landingpage";
        }
        if (i == 4) {
            return "splash_ad_landingpage";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static boolean fi(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
        }
    }

    public static String ik(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", th.getMessage());
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static lr ri(Context context, Intent intent) {
        return new lr(null, 0);
    }

    public static void jbs(Context context) {
        try {
            AtomicInteger atomicInteger = ka;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.slm.ka.ri().ik();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            ka.set(2);
        }
    }

    public static boolean ri() {
        return (com.bytedance.sdk.openadsdk.core.slm.ri() == null || com.bytedance.sdk.openadsdk.core.slm.ri().ka()) ? false : true;
    }

    public static String mj(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static String ri(int i) {
        if (i == 1) {
            return "embeded_ad";
        }
        if (i == 2) {
            return "banner_ad";
        }
        if (i == 3) {
            return "interaction";
        }
        if (i == 4) {
            return "open_ad";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static int di(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", th.getMessage());
            return -1;
        }
    }

    public static boolean xha(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return -1;
        }
        int iLji = wjvVar.lji();
        int i = 1;
        if (iLji == 1) {
            return 2;
        }
        if (iLji == 3) {
            return 4;
        }
        if (iLji != 5) {
            i = 7;
            if (iLji != 7) {
                return iLji != 8 ? -1 : 5;
            }
        }
        return i;
    }

    public static long xha(Context context) {
        int i;
        try {
            i = context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", th.getMessage());
            i = -1;
        }
        return i;
    }

    public static String lr() {
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.tan.ri.ri(com.bytedance.sdk.openadsdk.core.nr.ri());
        try {
            String strLr = com.bytedance.sdk.openadsdk.core.ik.ri().lr("android_system_ua", "unKnow");
            if (strLr != null && !"unKnow".equals(strLr)) {
                return strLr;
            }
            FutureTask futureTask = new FutureTask(new ri(2));
            lr.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        com.bytedance.sdk.component.utils.ac.ik("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static int mj(Context context) {
        return xha(com.bytedance.sdk.component.utils.su.ri(context, 0L));
    }

    public static String ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return null;
        }
        try {
            return ik(wjvVar.lji());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean mj(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    public static String ka(String str) {
        return ri(str, false, false);
    }

    public static int ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static boolean ka(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        return wjvVar != null && wjvVar.adz() == 3 && wjvVar.evm() && (wjvVar.sz() == 4 || wjvVar.sz() == 5);
    }

    public static String ri(Context context) {
        String strLr = com.bytedance.sdk.openadsdk.core.ik.ri().lr("total_memory", (String) null);
        if (strLr != null && lr(strLr) > 0) {
            return strLr;
        }
        String strIk = ik("MemTotal");
        if (lr(strIk) <= 0) {
            strIk = jbs();
        }
        com.bytedance.sdk.openadsdk.core.ik.ri().ri("total_memory", strIk);
        return strIk;
    }

    public static long lr(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String ik(Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static long lr(Context context) {
        return com.bytedance.sdk.openadsdk.core.ik.ri().lr("total_internal_storage", 0L).longValue();
    }

    public static String ri(String str, boolean z, boolean z2) {
        String strNr;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z2) {
            strNr = ac();
        } else {
            strNr = nr();
        }
        if (TextUtils.isEmpty(strNr)) {
            strNr = "api16-access-ttp.tiktokpangle.us";
        }
        String strRi = "https://" + strNr + str;
        if (!TextUtils.isEmpty(str) && (str.equals("/api/ad/union/sdk/compliance_status/") || str.equals("/api/ad/union/sdk/register_status/"))) {
            return strRi;
        }
        if (xd.ri() && !z) {
            strRi = xd.ri(strRi);
        }
        return z ? co(strRi) : strRi;
    }

    public static boolean ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return true;
        }
        int iLr = com.bytedance.sdk.openadsdk.core.nr.ka().lr(wjvVar.ur());
        int iIk = com.bytedance.sdk.component.utils.nr.ik(com.bytedance.sdk.openadsdk.core.nr.ri());
        if (iLr == 1) {
            return ka(iIk);
        }
        if (iLr == 2) {
            return fi(iIk) || ka(iIk) || di(iIk);
        }
        if (iLr != 3) {
            return iLr != 5 || ka(iIk) || di(iIk);
        }
        return false;
    }

    public static List<String> ri(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        ArrayList arrayList = new ArrayList();
        Set<String> setEu = com.bytedance.sdk.openadsdk.core.nr.ka().eu();
        if (setEu != null && !setEu.isEmpty()) {
            for (String str2 : setEu) {
                if (!TextUtils.isEmpty(str2)) {
                    String strCo = "https://" + str2 + str;
                    if (xd.ri() && !z) {
                        strCo = xd.ri(strCo);
                    }
                    if (z) {
                        strCo = co(strCo);
                    }
                    arrayList.add(strCo);
                }
            }
        }
        return arrayList;
    }

    public static JSONObject ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, long j, dern dernVar) {
        if (wjvVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, wjvVar.tn());
            jSONObject.put("buffers_time", j);
            attabal attabalVarEu = wjvVar.eu();
            if (attabalVarEu != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, attabalVarEu.taiyuan());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, attabalVarEu.arytenoidectomy());
            }
            ri(jSONObject, dernVar);
            return jSONObject;
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ri("TTAD.ToolUtils", "getVideoAction json error", e);
            return jSONObject;
        }
    }

    private static void ri(JSONObject jSONObject, dern dernVar) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || dernVar == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(dernVar.ka()), Integer.valueOf(dernVar.fi())));
        } catch (Throwable unused) {
        }
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        if (wjvVar != null) {
            try {
                String strSmj = wjvVar.smj();
                if (TextUtils.isEmpty(strSmj) && wjvVar.lau() != null && wjvVar.lau().ik() == 1 && !TextUtils.isEmpty(wjvVar.lau().lr())) {
                    strSmj = wjvVar.lau().lr();
                }
                String str2 = strSmj;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ig.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), str2, wjvVar, ri(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void ri(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str2) || !fi(context)) {
            return;
        }
        int length = str2.length();
        int i2 = 1;
        if (length % 3572 == 0) {
            i = length / 3572;
        } else {
            i = (length / 3572) + 1;
        }
        int i3 = 3572;
        int i4 = 0;
        while (i2 <= i) {
            if (i3 < length) {
                str2.substring(i4, i3);
                i2++;
                i4 = i3;
                i3 += 3572;
            } else {
                str2.substring(i4);
                return;
            }
        }
    }

    public static void ri(StringBuilder sb, String str, String str2) {
        int iIndexOf;
        if (sb == null || TextUtils.isEmpty(str) || (iIndexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.fi ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, com.bytedance.sdk.component.jbs.di diVar, Context context, String str) {
        int iSz = wjvVar.sz();
        if (!wjvVar.evm()) {
            return null;
        }
        if (iSz != 1 && iSz != 3) {
            return null;
        }
        diVar.ri(true, (View) new com.bytedance.sdk.openadsdk.common.ka(context));
        return new com.bytedance.sdk.openadsdk.common.fi(wjvVar, diVar, str, false);
    }

    public static void ri(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairKa = com.bytedance.sdk.openadsdk.core.qt.ka("oem_store");
            int i = -1;
            if (pairKa != null && ((iIntValue = Integer.valueOf((String) pairKa.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairKa.second).longValue() < com.bytedance.sdk.openadsdk.wjv.fi.ri("oem_store_state_time", 259200000))) {
                i = iIntValue;
            }
            jSONObject.put("oem_store", i);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, com.bytedance.sdk.component.jbs.di diVar) {
        ri(wjvVar, diVar, false);
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, com.bytedance.sdk.component.jbs.di diVar, boolean z) {
        com.bytedance.sdk.component.jbs.di diVar2;
        com.bytedance.sdk.openadsdk.core.model.mj mjVarFr;
        List<Integer> list;
        if (wjvVar == null || diVar == null) {
            return;
        }
        int iSz = wjvVar.sz();
        if (!wjvVar.evm() || (!(iSz == 2 || iSz == 3 || iSz == 5) || (mjVarFr = wjvVar.fr()) == null)) {
            diVar2 = diVar;
        } else {
            List<Integer> listDi = mjVarFr.di();
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (int i = 0; i < listDi.size(); i++) {
                    arrayList.add(Integer.valueOf(listDi.get(i).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = listDi;
            }
            diVar2 = diVar;
            diVar2.ri(true, mjVarFr.ka(), mjVarFr.fi(), list, mjVarFr.xha(), mjVarFr.ik());
        }
        int iOgw = wjvVar.ogw();
        long jZh = wjvVar.zh();
        if ((iOgw == 1 || iOgw == 2) && jZh > 0) {
            diVar2.ri(iOgw, jZh);
        }
    }

    public static int ri(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    public static JSONObject ri(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
