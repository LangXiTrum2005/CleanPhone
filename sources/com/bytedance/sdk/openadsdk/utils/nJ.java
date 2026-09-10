package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nJ {
    private static String IeN;
    private static final HashSet<String> JVA;
    public static Integer Lxb;
    private static final byte[] NXR;
    private static String STP;
    private static final byte[] sLN;
    private static final ExecutorService LD = Executors.newSingleThreadExecutor();
    private static volatile boolean lk = false;
    private static final AtomicInteger ZU = new AtomicInteger(0);
    private static volatile String JXs = "";
    private static final ReentrantLock lc = new ReentrantLock();
    private static String ebl = null;
    private static String OY = null;
    private static String QAg = null;
    private static final HashSet<String> nBu = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.nJ$1, reason: invalid class name */
    public static class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(nJ.JXs)) {
                    com.bytedance.sdk.component.QAg.ZU zu = new com.bytedance.sdk.component.QAg.ZU(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
                    zu.setWebViewClient(new com.bytedance.sdk.component.QAg.ZU.Lxb());
                    String unused = nJ.JXs = zu.getUserAgentString();
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", "", e);
            } catch (NoClassDefFoundError e2) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", "", e2);
            }
        }
    }

    public static class LD {
        public final int LD;
        public final ComponentName Lxb;

        public LD(ComponentName componentName, int i) {
            this.Lxb = componentName;
            this.LD = i;
        }
    }

    public static class Lxb implements Callable<String> {
        private final int Lxb;

        public Lxb(int i) {
            this.Lxb = i;
        }

        private String LD() {
            String property;
            Throwable th;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_ua_data", "android_system_ua", property);
                            } else {
                                com.bytedance.sdk.openadsdk.core.lk.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()).Lxb("android_system_ua", property);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.sLN.Lxb("getUA", "e:" + th.getMessage());
                    }
                }
            } catch (Throwable th3) {
                property = "unKnow";
                th = th3;
            }
            return property;
        }

        private synchronized String lk() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.nJ.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = nJ.CSn();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strLD;
            try {
                strLD = "unKnow";
                int i = this.Lxb;
                if (i == 1) {
                    strLD = lk();
                } else if (i == 2) {
                    strLD = LD();
                }
            } catch (Throwable th) {
                throw th;
            }
            return strLD;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        JVA = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        Lxb = null;
        sLN = new byte[]{108, 111, 97, 100, 105, 110, 103};
        NXR = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String CSn() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
            webView.setWebViewClient(new com.bytedance.sdk.component.QAg.ZU.Lxb());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                    com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    com.bytedance.sdk.openadsdk.core.lk.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()).Lxb("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static String DY() {
        String str = STP;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(sLN);
        STP = str2;
        return str2;
    }

    public static String IeN() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static boolean JXs(int i) {
        return i == 5;
    }

    public static boolean LD(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static JSONObject Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, long j, BK bk) {
        if (tDVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, tDVar.bG());
            jSONObject.put("buffers_time", j);
            KG kgJJ = tDVar.JJ();
            if (kgJJ != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, kgJJ.c);
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, kgJJ.e);
            }
            Lxb(jSONObject, bk);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", "getVideoAction json error", e);
        }
        return jSONObject;
    }

    public static String NXR() {
        return "https://log.byteoversea.com/service/2/app_log_test/";
    }

    public static String OY() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.kqm.Lxb().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            if (j > 0) {
                return String.valueOf(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String QAg() {
        return lk("MemTotal");
    }

    public static String STP() {
        int iVVE = VVE();
        return (iVVE == 1 || iVVE == 2) ? "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    public static String Sfi() {
        String str = IeN;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(NXR);
        IeN = str2;
        return str2;
    }

    public static int VVE() {
        try {
            String id = TimeZone.getDefault().getID();
            if (nBu.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id == null || !id.startsWith("Europe/")) {
                return (id == null || !id.startsWith("America/") || JVA.contains(id)) ? 3 : 5;
            }
            return 4;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static boolean ZU(int i) {
        return i == 4;
    }

    public static String brP() {
        int i = -kqm();
        return i >= 0 ? "Etc/GMT+".concat(String.valueOf(i)) : "Etc/GMT".concat(String.valueOf(i));
    }

    public static int ebl(int i) {
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

    private static boolean id() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int kqm() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static boolean lc(int i) {
        return i == 6;
    }

    public static int lk(Context context, Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, 65536).size();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long nBu() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean sLN() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean tD() {
        return ZU.get() == 1;
    }

    public static long JVA() {
        try {
            if (!id()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    public static synchronized String JXs() {
        Context contextLxb;
        try {
            if (TextUtils.isEmpty(ebl) && (contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb()) != null) {
                try {
                    ebl = contextLxb.getPackageName();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ebl;
    }

    public static void NXR(Context context) {
        try {
            AtomicInteger atomicInteger = ZU;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (!zIsEnabled || !zIsTouchExplorationEnabled) {
                atomicInteger.set(2);
            } else {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.STP.lk.Lxb().lk();
            }
        } catch (Exception unused) {
            ZU.set(2);
        }
    }

    public static boolean QAg(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
        }
    }

    public static String ZU() {
        return eK.Lxb();
    }

    public static synchronized String ebl() {
        try {
            if (TextUtils.isEmpty(QAg) && com.bytedance.sdk.openadsdk.core.kqm.Lxb() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.kqm.Lxb().getPackageManager().getPackageInfo(JXs(), 0);
                    OY = String.valueOf(packageInfo.versionCode);
                    QAg = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return QAg;
    }

    public static synchronized String lc() {
        try {
            if (TextUtils.isEmpty(OY) && com.bytedance.sdk.openadsdk.core.kqm.Lxb() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.kqm.Lxb().getPackageManager().getPackageInfo(JXs(), 0);
                    OY = String.valueOf(packageInfo.versionCode);
                    QAg = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return OY;
    }

    private static String sLN(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", lc()).toString();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    public static long ZU(Context context) {
        return com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("free_internal_storage", 0L).longValue();
    }

    @NonNull
    public static LD LD(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
            ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
            if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
                return new LD(new ComponentName(activityInfo.packageName, activityInfo.name), listQueryIntentActivities.size());
            }
            return new LD(null, listQueryIntentActivities.size());
        }
        return new LD(null, 0);
    }

    public static boolean QAg(String str) {
        if (com.bytedance.sdk.openadsdk.core.STP.JXs()) {
            return true;
        }
        com.bytedance.sdk.component.utils.sLN.LD("You must use method '" + str + "' after initialization, please check.");
        return false;
    }

    public static int STP(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = Lxb;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        Lxb = Integer.valueOf(size);
        return size;
    }

    public static String ZU(String str) {
        return Lxb(str, false);
    }

    public static boolean lk(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.LD.Lxb(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean ZU(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        return tDVar != null && tDVar.sRq() == 3 && tDVar.Ld() && (tDVar.JZE() == 4 || tDVar.JZE() == 5);
    }

    public static int nBu(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", th.getMessage());
            return -1;
        }
    }

    public static long JXs(Context context) {
        return com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("total_sdcard_storage", 0L).longValue();
    }

    public static boolean OY(Context context) {
        if (context != null) {
            return !(context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30);
        }
        throw new IllegalArgumentException("params context is null");
    }

    public static long JVA(Context context) {
        int i = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i = context.getApplicationInfo().minSdkVersion;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", th.getMessage());
        }
        return i;
    }

    public static String JXs(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.kqm.ZU().hg();
        }
        if (!TextUtils.isEmpty(str)) {
            return !str.startsWith(ProxyConfig.MATCH_HTTP) ? "https://".concat(str) : str;
        }
        if (VVE() == 2) {
            return "https://log.sgsnssdk.com/service/2/app_log/";
        }
        return "https://log-mva.isnssdk.com/service/2/app_log/";
    }

    public static void nBu(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.sLN.LD("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    public static int sLN(Context context) {
        return ebl(com.bytedance.sdk.component.utils.HD.Lxb(context, 0L));
    }

    public static String lk(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i == 2) {
            return "interaction";
        }
        if (i == 3 || i == 4) {
            return "open_ad";
        }
        if (i == 7) {
            return "rewarded_video";
        }
        if (i != 8) {
            return "embeded_ad";
        }
        return "fullscreen_interstitial_ad";
    }

    public static void OY(final String str) {
        com.bytedance.sdk.openadsdk.STP.lk.Lxb();
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("reportMultiLog", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.utils.nJ.2
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                if (nJ.lk || !com.bytedance.sdk.openadsdk.core.kqm.ZU().Lpq()) {
                    return null;
                }
                boolean unused = nJ.lk = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", str);
                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("reportMultiLog").LD(jSONObject.toString());
            }
        });
    }

    public static String ebl(@NonNull Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int lc(Context context) {
        return com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("is_root", -1);
    }

    public static boolean OY(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    public static boolean lc(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String LD(int i) {
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

    public static void Lxb(@NonNull com.bytedance.sdk.openadsdk.core.model.tD tDVar, @NonNull View view) {
    }

    public static String ebl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static String lk() {
        if (!TextUtils.isEmpty(JXs)) {
            return JXs;
        }
        com.bytedance.sdk.openadsdk.multipro.lk.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
        String strLxb = com.bytedance.sdk.openadsdk.core.QAg.Lxb("sdk_local_web_ua", 86400000L);
        JXs = strLxb;
        if (TextUtils.isEmpty(strLxb)) {
            ReentrantLock reentrantLock = lc;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(JXs)) {
                            JXs = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
                        }
                        com.bytedance.sdk.openadsdk.core.QAg.Lxb("sdk_local_web_ua", JXs);
                        reentrantLock.unlock();
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", "", e);
                        lc.unlock();
                    } catch (NoClassDefFoundError e2) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", "", e2);
                        lc.unlock();
                    }
                }
            } catch (Throwable th) {
                lc.unlock();
                throw th;
            }
        }
        return JXs;
    }

    public static Intent Lxb(Context context, String str) {
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

    public static int LD(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar == null) {
            return -1;
        }
        int iLJ = tDVar.lJ();
        int i = 1;
        if (iLJ == 1) {
            return 2;
        }
        if (iLJ == 3) {
            return 4;
        }
        if (iLJ != 5) {
            i = 7;
            if (iLJ != 7) {
                return iLJ != 8 ? -1 : 5;
            }
        }
        return i;
    }

    public static String LD() {
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.lk.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
        try {
            String strLD = com.bytedance.sdk.openadsdk.multipro.LD.lk() ? com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("sp_multi_ua_data", "android_system_ua", "unKnow") : com.bytedance.sdk.openadsdk.core.lk.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()).LD("android_system_ua", "unKnow");
            if (strLD != null && !"unKnow".equals(strLD)) {
                return strLD;
            }
            FutureTask futureTask = new FutureTask(new Lxb(2));
            LD.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        com.bytedance.sdk.component.utils.sLN.Lxb("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static boolean Lxb(Context context, Intent intent) {
        return lk(context, intent) > 0;
    }

    public static boolean Lxb() {
        return (com.bytedance.sdk.openadsdk.core.IeN.Lxb() == null || com.bytedance.sdk.openadsdk.core.IeN.Lxb().ZU()) ? false : true;
    }

    public static String Lxb(int i) {
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

    public static long LD(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar == null) {
            return null;
        }
        try {
            return lk(tDVar.lJ());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String lk(String str) {
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
                            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", th.getMessage());
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

    public static String LD(Context context) {
        return com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("total_memory", "0");
    }

    public static int Lxb(String str) {
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

    public static String Lxb(Context context) {
        String strLD = com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("total_memory", (String) null);
        if (strLD == null || LD(strLD) <= 0) {
            strLD = lk("MemTotal");
            if (LD(strLD) <= 0) {
                strLD = OY();
            }
            com.bytedance.sdk.openadsdk.core.lk.Lxb(context).Lxb("total_memory", strLD);
        }
        return strLD;
    }

    public static String Lxb(@NonNull String str, boolean z) {
        String strI;
        String strXan = com.bytedance.sdk.openadsdk.core.kqm.ZU().xan();
        if (TextUtils.isEmpty(strXan)) {
            int iVVE = VVE();
            if (iVVE == 1 || iVVE == 2) {
                strI = AbstractC3888ke0.i("https://pangolin16.sgsnssdk.com", str);
            } else {
                strI = AbstractC3888ke0.i("https://pangolin16.isnssdk.com", str);
            }
            if (!z) {
                return xan.Lxb(strI);
            }
            return sLN(strI);
        }
        String strB = DM.B("https://", strXan, str);
        if (xan.Lxb() && !z) {
            strB = xan.Lxb(strB);
        }
        return z ? sLN(strB) : strB;
    }

    public static long lk(Context context) {
        return com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("total_internal_storage", 0L).longValue();
    }

    public static boolean lk(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar == null) {
            return true;
        }
        int iLD = com.bytedance.sdk.openadsdk.core.kqm.ZU().LD(tDVar.Td());
        int iLk = com.bytedance.sdk.component.utils.IeN.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
        if (iLD == 1) {
            return ZU(iLk);
        }
        if (iLD == 2) {
            return JXs(iLk) || ZU(iLk) || lc(iLk);
        }
        if (iLD != 3) {
            return iLD != 5 || ZU(iLk) || lc(iLk);
        }
        return false;
    }

    public static JSONObject Lxb(boolean z, com.bytedance.sdk.openadsdk.core.model.tD tDVar, long j, long j2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, tDVar.bG());
            jSONObject.put("load_time", j);
            KG kgJJ = tDVar.JJ();
            if (kgJJ != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, kgJJ.c);
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, kgJJ.e);
            }
            if (!z) {
                jSONObject.put("error_code", j2);
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                jSONObject.put("error_message", str);
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", "getVideoDownload json error", e);
        }
        return jSONObject;
    }

    private static void Lxb(JSONObject jSONObject, BK bk) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || bk == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(bk.ZU()), Integer.valueOf(bk.JXs())));
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str) {
        if (tDVar != null) {
            try {
                String strSv = tDVar.Sv();
                if (TextUtils.isEmpty(strSv) && tDVar.nTb() != null && tDVar.nTb().lk() == 1 && !TextUtils.isEmpty(tDVar.nTb().LD())) {
                    strSv = tDVar.nTb().LD();
                }
                String str2 = strSv;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.xan.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), str2, tDVar, Lxb(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void Lxb(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str2) || !QAg(context)) {
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

    public static void Lxb(StringBuilder sb, String str, String str2) {
        int iIndexOf;
        if (sb == null || TextUtils.isEmpty(str) || (iIndexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.ZU Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, com.bytedance.sdk.component.QAg.ZU zu, Context context, String str) {
        int iJZE = tDVar.JZE();
        if (!tDVar.Ld() || (iJZE != 1 && iJZE != 3)) {
            return null;
        }
        zu.Lxb(true, (View) new com.bytedance.sdk.openadsdk.common.lk(context));
        return new com.bytedance.sdk.openadsdk.common.ZU(tDVar, zu, str, false);
    }

    public static void Lxb(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairZU = com.bytedance.sdk.openadsdk.core.QAg.ZU("oem_store");
            int i = -1;
            if (pairZU != null && ((iIntValue = Integer.valueOf((String) pairZU.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairZU.second).longValue() < com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("oem_store_state_time", 259200000))) {
                i = iIntValue;
            }
            jSONObject.put("oem_store", i);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, com.bytedance.sdk.component.QAg.ZU zu) {
        Lxb(tDVar, zu, false);
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, com.bytedance.sdk.component.QAg.ZU zu, boolean z) {
        com.bytedance.sdk.openadsdk.core.model.JXs jXsJVA;
        List<Integer> list;
        if (tDVar == null || zu == null) {
            return;
        }
        int iJZE = tDVar.JZE();
        if (tDVar.Ld()) {
            if ((iJZE == 2 || iJZE == 3 || iJZE == 5) && (jXsJVA = tDVar.JVA()) != null) {
                List<Integer> listLc = jXsJVA.lc();
                ArrayList arrayList = new ArrayList();
                if (z) {
                    for (int i = 0; i < listLc.size(); i++) {
                        arrayList.add(Integer.valueOf(listLc.get(i).intValue() - 1));
                    }
                    list = arrayList;
                } else {
                    list = listLc;
                }
                zu.Lxb(true, jXsJVA.ZU(), jXsJVA.JXs(), list, jXsJVA.ebl(), jXsJVA.lk());
            }
        }
    }

    public static int Lxb(WebView webView) {
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
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    public static JSONObject Lxb(AdSlot adSlot) {
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
