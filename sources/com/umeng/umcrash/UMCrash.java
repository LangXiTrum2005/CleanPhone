package com.umeng.umcrash;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.efs.sdk.base.custommapping.IUMPerfCallback;
import com.efs.sdk.base.custommapping.InnerCustomMappingManager;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.fluttersdk.FlutterManager;
import com.efs.sdk.h5pagesdk.H5Manager;
import com.efs.sdk.launch.LaunchManager;
import com.efs.sdk.memleaksdk.IMemLeakClient;
import com.efs.sdk.memleaksdk.MemLeakManager;
import com.efs.sdk.memoryinfo.UMMemoryMonitor;
import com.efs.sdk.net.NetManager;
import com.efs.sdk.pa.IPaClient;
import com.efs.sdk.pa.PAFactory;
import com.efs.sdk.pa.config.IEfsReporter;
import com.efs.sdk.pa.config.PackageLevel;
import com.google.android.gms.measurement.AppMeasurement;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.crash.UCrash;
import com.umeng.crash.UCrashCallback;
import com.umeng.crash.UCrashConfig;
import com.umeng.logsdk.ULogManager;
import com.umeng.logsdk.UploadFileFilterCodeLog;
import com.umeng.pagesdk.PageManger;
import com.umeng.powersdk.PowerManager;
import com.umeng.umcrash.custom_exception.UAPMCustomException;
import com.umeng.umcrash.custominfo.UAPMCustomInfo;
import com.umeng.umcrash.customlog.UAPMCustomLogManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class UMCrash {
    private static final long DEFAULT_PA_TIMEOUT_TIME = 2000;
    private static final boolean DEFAULT_VALUE_CODE_LOG = true;
    private static final boolean DEFAULT_VALUE_CRASH_ANR = true;
    private static final boolean DEFAULT_VALUE_CRASH_JAVA = true;
    private static final boolean DEFAULT_VALUE_CRASH_NATIVE = true;
    private static final boolean DEFAULT_VALUE_CRASH_UNEXP = false;
    private static final boolean DEFAULT_VALUE_FLUTTER = true;
    private static final boolean DEFAULT_VALUE_H5PAGE = true;
    private static final boolean DEFAULT_VALUE_LAUNCH = true;
    private static final boolean DEFAULT_VALUE_MEM = true;
    private static final boolean DEFAULT_VALUE_MEMLEAK = true;
    private static final boolean DEFAULT_VALUE_NET = true;
    private static final boolean DEFAULT_VALUE_PA = true;
    private static final boolean DEFAULT_VALUE_PAGE = true;
    private static final boolean DEFAULT_VALUE_POWER = true;
    private static final String INTEGRATIONTESTING_SP = "itconfig";
    private static final String IT_DEBUGKEY = "apm_debugkey";
    private static final String IT_SENDAGING = "apm_sendaging";
    private static final String KEY_ACTIITY_ON_CREATED = "onCreated";
    private static final String KEY_ACTIITY_ON_DESTROYED = "onDestroyed";
    private static final String KEY_ACTIITY_ON_PAUSED = "onPaused";
    private static final String KEY_ACTIITY_ON_RESUMED = "onResumed";
    private static final String KEY_ACTIITY_ON_STARTED = "onStarted";
    private static final String KEY_ACTIITY_ON_STOPPED = "onStopped";
    public static final String KEY_APM_DEFAULT_SECRET = "NEej8y@anWa*8hep";
    public static final String KEY_APM_ROOT_NAME = "UApm";
    public static final String KEY_CALLBACK_CUSTOM_LOG = "um_custom_log";
    public static final String KEY_CALLBACK_CUSTOM_MAPPING = "um_custom_mapping";
    public static final String KEY_CALLBACK_PAGE_ACTION = "um_action_log";
    public static final String KEY_CALLBACK_SESSION_ID = "um_session_id";
    public static final String KEY_CALLBACK_UMID = "um_umid";
    public static final String KEY_CALLBACK_UM_INFOS = "um_infos:";
    public static final String KEY_CALLBACK_USER_STRING = "um_user_string";
    private static final String KEY_CALLBACK_USER_STRING_ANR = "um_user_str_anr:";
    public static final String KEY_CALLBACK_USER_STRING_CUSTOM_LOG = "um_user_str_custom_log:";
    private static final String KEY_CALLBACK_USER_STRING_JAVA = "um_user_str_java:";
    private static final String KEY_CALLBACK_USER_STRING_NATIVE = "um_user_str_native:";
    public static final String KEY_DEBUGKEY = "um_dk";
    public static final String KEY_ENABLE_ANR = "enableANRLog";
    public static final String KEY_ENABLE_CODE_LOG = "enableCodeLog";
    public static final String KEY_ENABLE_CRASH_JAVA = "enableJavaLog";
    public static final String KEY_ENABLE_CRASH_NATIVE = "enableNativeLog";
    public static final String KEY_ENABLE_CRASH_UNEXP = "enableUnexpLog";
    public static final String KEY_ENABLE_FLUTTER = "enableFlutterLog";
    public static final String KEY_ENABLE_H5PAGE = "enableH5PageLog";
    public static final String KEY_ENABLE_LAUNCH = "enableLaunchLog";
    public static final String KEY_ENABLE_MEM = "enableMemLog";
    public static final String KEY_ENABLE_MEMLEAK = "enableMemLeakLog";
    public static final String KEY_ENABLE_NET = "enableNetLog";
    public static final String KEY_ENABLE_PA = "enablePaLog";
    public static final String KEY_ENABLE_PAGE = "enablePageLog";
    public static final String KEY_ENABLE_POWER = "enablePowerLog";
    public static final String KEY_HEADER_ACCESS = "um_access";
    public static final String KEY_HEADER_ACCESS_SUBTYPE = "um_access_subtype";
    public static final String KEY_HEADER_APPKEY = "um_app_key";
    public static final String KEY_HEADER_BESRIAL = "um_bserial";
    public static final String KEY_HEADER_BSVER = "um_bsver";
    public static final String KEY_HEADER_BVER = "um_bver";
    public static final String KEY_HEADER_CARRIER = "um_app_carrier";
    public static final String KEY_HEADER_CHANNEL = "um_app_channel";
    public static final String KEY_HEADER_CRASH_VERSION = "um_crash_sdk_version";
    public static final String KEY_HEADER_DEBUGKEY = "um_dk";
    public static final String KEY_HEADER_NETWORK_TYPE = "um_network_type";
    public static final String KEY_HEADER_OS = "um_os";
    public static final String KEY_HEADER_PROVIDER = "um_app_provider";
    public static final String KEY_HEADER_PUID = "um_app_puid";
    public static final String KEY_HEADER_START_TIME = "um_app_start_time";
    public static final String KEY_HEADER_UMID = "um_umid_header";
    public static final String KEY_LOG_DEVICES_ID = "log_devices_id";
    public static final String KEY_LOG_USER_ID = "log_user_id";
    private static final int KEY_MAX_LENGTH = 20480;
    private static final int KEY_MAX_LENGTH_128 = 128;
    public static final String KEY_PA_TIMEOUT_TIME = "pa_timeout_time";
    public static final String SP_KEY_DEBUG = "debugkey";
    public static final String SP_KEY_TIMESTAMP = "timestamp";
    private static final String TAG = "UMCrash";
    private static String crashSdkVersion = "2.0.7.intl";
    private static boolean isBuildId = true;
    private static boolean isDebug = true;
    private static boolean isEncrypt = false;
    private static boolean isIntl = false;
    private static boolean isZip = true;
    private static Context mContext = null;
    private static UMCrashCallback mUMCrashCallback = null;
    private static IUMCrashCallbackWithType mUMCrashCallbackWithType = null;
    private static boolean sIsDumpAllStackTrace = true;
    private static boolean sIsEnableLogBackup = false;
    private static boolean sIsKillProcessAfterCrash = true;
    public static EfsReporter sReporter;
    private static String userBesrial;
    private static String userBsver;
    private static String userBver;
    private static Object pageArrayLock = new Object();
    private static ArrayList<String> mArrayList = new ArrayList<>(10);
    private static int sApmCallbackLimit = 0;
    private static boolean isPA = false;
    private static boolean isLa = false;
    private static boolean isNet = false;
    private static boolean isPage = false;
    private static boolean isPower = false;
    private static boolean isFlutter = false;
    private static boolean isCodeLog = false;
    private static boolean isMemLeak = false;
    private static boolean enableJavaLog = true;
    private static boolean enableNativeLog = true;
    private static boolean enableANRLog = true;
    private static boolean enablePaLog = true;
    private static boolean enableLaunchLog = true;
    private static boolean enableMemLog = true;
    private static boolean enableNetLog = true;
    private static boolean enableH5PageLog = true;
    private static boolean enablePageLog = true;
    private static boolean enableCodeLog = true;
    private static boolean enablePowerLog = true;
    private static boolean enableFlutterLog = true;
    private static boolean enableMemLeakLog = true;
    private static boolean enableUMJavaLog = true;
    private static boolean enableUMNativeLog = true;
    private static boolean enableUMANRLog = true;
    private static boolean enableUMUserLog = true;
    private static boolean enableUMAnrTrace = true;
    private static long paTimeoutTime = 2000;
    private static int index = 0;
    private static boolean isOpenUserCrash = true;
    private static boolean isUploadNowUserCrash = false;

    public static class MemLeakClientImpl implements IMemLeakClient {
        private MemLeakClientImpl() {
        }

        @Override // com.efs.sdk.memleaksdk.IMemLeakClient
        public String onGetCallbackInfo(String str) {
            String strOnCallback;
            String string = null;
            if (!UMCrash.KEY_CALLBACK_PAGE_ACTION.equals(str)) {
                if (UMCrash.KEY_CALLBACK_USER_STRING.equals(str)) {
                    if (UMCrash.mUMCrashCallbackWithType != null) {
                        String strOnCallback2 = UMCrash.mUMCrashCallbackWithType.onCallback(IUMCrashCallbackWithType.CrashType.CRASH_TYPE_MEM_LEAK);
                        if (strOnCallback2 == null) {
                            return null;
                        }
                        return strOnCallback2.trim().getBytes().length > Math.max(20480, UMCrash.sApmCallbackLimit) ? UMCrashUtils.splitByByte(strOnCallback2, Math.max(20480, UMCrash.sApmCallbackLimit)) : strOnCallback2;
                    }
                    if (UMCrash.mUMCrashCallback == null || (strOnCallback = UMCrash.mUMCrashCallback.onCallback()) == null) {
                        return null;
                    }
                    return strOnCallback.trim().getBytes().length > Math.max(20480, UMCrash.sApmCallbackLimit) ? UMCrashUtils.splitByByte(strOnCallback, Math.max(20480, UMCrash.sApmCallbackLimit)) : strOnCallback;
                }
                return null;
            }
            try {
                if (UMCrash.mArrayList != null && UMCrash.mArrayList.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("source", 0);
                    jSONObject.put("action_name", "page_view");
                    jSONObject.put("action_page_state", UMCrash.isPage);
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < UMCrash.mArrayList.size(); i++) {
                        String str2 = (String) UMCrash.mArrayList.get(i);
                        if (str2 != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", str2);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("action_parameter", jSONArray);
                    string = jSONObject.toString();
                    if (UMCrash.isDebug) {
                        String unused = UMCrash.TAG;
                    }
                }
            } catch (Throwable unused2) {
            }
            return string;
        }
    }

    public static class PaClientImpl implements IPaClient {
        private PaClientImpl() {
        }

        @Override // com.efs.sdk.pa.IPaClient
        public String onGetCallbackInfo(String str) {
            String strOnCallback;
            String string = null;
            if (!UMCrash.KEY_CALLBACK_PAGE_ACTION.equals(str)) {
                if (UMCrash.KEY_CALLBACK_USER_STRING.equals(str)) {
                    if (UMCrash.mUMCrashCallbackWithType != null) {
                        String strOnCallback2 = UMCrash.mUMCrashCallbackWithType.onCallback(IUMCrashCallbackWithType.CrashType.CRASH_TYPE_BLOCK);
                        if (strOnCallback2 == null) {
                            return null;
                        }
                        return strOnCallback2.trim().getBytes().length > Math.max(20480, UMCrash.sApmCallbackLimit) ? UMCrashUtils.splitByByte(strOnCallback2, Math.max(20480, UMCrash.sApmCallbackLimit)) : strOnCallback2;
                    }
                    if (UMCrash.mUMCrashCallback == null || (strOnCallback = UMCrash.mUMCrashCallback.onCallback()) == null) {
                        return null;
                    }
                    return strOnCallback.trim().getBytes().length > Math.max(20480, UMCrash.sApmCallbackLimit) ? UMCrashUtils.splitByByte(strOnCallback, Math.max(20480, UMCrash.sApmCallbackLimit)) : strOnCallback;
                }
                return null;
            }
            try {
                if (UMCrash.mArrayList != null && UMCrash.mArrayList.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("source", 0);
                    jSONObject.put("action_name", "page_view");
                    jSONObject.put("action_page_state", UMCrash.isPage);
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < UMCrash.mArrayList.size(); i++) {
                        String str2 = (String) UMCrash.mArrayList.get(i);
                        if (str2 != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", str2);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("action_parameter", jSONArray);
                    string = jSONObject.toString();
                    if (UMCrash.isDebug) {
                        String unused = UMCrash.TAG;
                    }
                }
            } catch (Throwable unused2) {
            }
            return string;
        }
    }

    public static class UCrashCallbackImpl implements UCrashCallback {
        private UCrashCallbackImpl() {
        }

        @Override // com.umeng.crash.UCrashCallback
        public Map<String, String> getExtras(String str) {
            HashMap map = new HashMap();
            map.put(UMCrash.KEY_CALLBACK_USER_STRING, UMCrash.generateNormalUserString());
            if (UCrashCallback.TYPE_JAVA.equals(str)) {
                map.put(UMCrash.KEY_CALLBACK_USER_STRING_JAVA, UMCrash.generateJavaUserString());
            } else if (UCrashCallback.TYPE_NATIVE.equals(str)) {
                map.put(UMCrash.KEY_CALLBACK_USER_STRING_NATIVE, UMCrash.generateNativeUserString());
            } else if (UCrashCallback.TYPE_ANR.equals(str)) {
                map.put(UMCrash.KEY_CALLBACK_USER_STRING_ANR, UMCrash.generateANRUserString());
            } else if ("exception".equals(str)) {
                map.put(UMCrash.KEY_CALLBACK_USER_STRING_CUSTOM_LOG, UMCrash.generateCustomUserString());
            }
            map.put(UMCrash.KEY_CALLBACK_UMID, UMCrashUtils.getUMID(UMCrash.mContext));
            map.put(UMCrash.KEY_CALLBACK_UM_INFOS, UMCrash.generateUMInfos());
            return map;
        }
    }

    public static /* synthetic */ int access$1508() {
        int i = index;
        index = i + 1;
        return i;
    }

    public static /* synthetic */ int access$1510() {
        int i = index;
        index = i - 1;
        return i;
    }

    public static void addCustomInfo(String str, String str2) {
        UAPMCustomInfo.addCustomInfo(str, str2);
    }

    @Deprecated
    public static void enableANRLog(boolean z) {
        enableANRLog = z;
    }

    public static void enableDumpAllStackTrace(boolean z) {
        sIsDumpAllStackTrace = z;
    }

    public static void enableJavaScriptBridge(WebView webView) {
        enableJavaScriptBridge((View) webView);
    }

    public static void enableKillProcessAfterCrash(boolean z) {
        sIsKillProcessAfterCrash = z;
    }

    public static void enableLogBackup(boolean z) {
        sIsEnableLogBackup = z;
    }

    @Deprecated
    public static void enableMemoryMonitor(boolean z) {
        UMMemoryMonitor.get().setEnable(z);
    }

    @Deprecated
    public static void enableNativeLog(boolean z) {
        enableNativeLog = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateANRUserString() {
        String strOnCallback;
        IUMCrashCallbackWithType iUMCrashCallbackWithType = mUMCrashCallbackWithType;
        if (iUMCrashCallbackWithType == null || (strOnCallback = iUMCrashCallbackWithType.onCallback(IUMCrashCallbackWithType.CrashType.CRASH_TYPE_ANR)) == null) {
            return null;
        }
        return strOnCallback.trim().getBytes().length > Math.max(20480, sApmCallbackLimit) ? UMCrashUtils.splitByByte(strOnCallback, Math.max(20480, sApmCallbackLimit)) : strOnCallback;
    }

    public static void generateCustomLog(Throwable th, String str) {
        generateCustomLog(th, str, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateCustomUserString() {
        String strOnCallback;
        IUMCrashCallbackWithType iUMCrashCallbackWithType = mUMCrashCallbackWithType;
        if (iUMCrashCallbackWithType == null || (strOnCallback = iUMCrashCallbackWithType.onCallback(IUMCrashCallbackWithType.CrashType.CRASH_TYPE_CUSTOM_LOG)) == null) {
            return null;
        }
        return strOnCallback.trim().getBytes().length > Math.max(20480, sApmCallbackLimit) ? UMCrashUtils.splitByByte(strOnCallback, Math.max(20480, sApmCallbackLimit)) : strOnCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateJavaUserString() {
        String strOnCallback;
        IUMCrashCallbackWithType iUMCrashCallbackWithType = mUMCrashCallbackWithType;
        if (iUMCrashCallbackWithType == null || (strOnCallback = iUMCrashCallbackWithType.onCallback(IUMCrashCallbackWithType.CrashType.CRASH_TYPE_JAVA)) == null) {
            return null;
        }
        return strOnCallback.trim().getBytes().length > Math.max(20480, sApmCallbackLimit) ? UMCrashUtils.splitByByte(strOnCallback, Math.max(20480, sApmCallbackLimit)) : strOnCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateNativeUserString() {
        String strOnCallback;
        IUMCrashCallbackWithType iUMCrashCallbackWithType = mUMCrashCallbackWithType;
        if (iUMCrashCallbackWithType == null || (strOnCallback = iUMCrashCallbackWithType.onCallback(IUMCrashCallbackWithType.CrashType.CRASH_TYPE_NATIVE)) == null) {
            return null;
        }
        return strOnCallback.trim().getBytes().length > Math.max(20480, sApmCallbackLimit) ? UMCrashUtils.splitByByte(strOnCallback, Math.max(20480, sApmCallbackLimit)) : strOnCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateNormalUserString() {
        UMCrashCallback uMCrashCallback;
        String strOnCallback;
        if (mUMCrashCallbackWithType != null || (uMCrashCallback = mUMCrashCallback) == null || (strOnCallback = uMCrashCallback.onCallback()) == null) {
            return null;
        }
        return strOnCallback.trim().getBytes().length > Math.max(20480, sApmCallbackLimit) ? UMCrashUtils.splitByByte(strOnCallback, Math.max(20480, sApmCallbackLimit)) : strOnCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateUMInfos() {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> arrayList = mArrayList;
            if (arrayList != null && arrayList.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("source", 0);
                jSONObject2.put("action_name", "page_view");
                jSONObject2.put("action_page_state", isPage);
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < mArrayList.size(); i++) {
                    String str = mArrayList.get(i);
                    if (str != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("name", str);
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject2.put("action_parameter", jSONArray);
                jSONObject.put(KEY_CALLBACK_PAGE_ACTION, jSONObject2.toString());
            }
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put(KEY_CALLBACK_SESSION_ID, UMCrashUtils.getSessionId(mContext));
            jSONObject.put(KEY_CALLBACK_CUSTOM_LOG, UAPMCustomLogManager.getCustomLogs());
            jSONObject.put(KEY_CALLBACK_CUSTOM_MAPPING, InnerCustomMappingManager.getCustomMappingJsonStr());
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static EfsReporter getReporter() {
        return sReporter;
    }

    public static String getUMAPMFlag() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 0);
            jSONObject.put(AppMeasurement.CRASH_ORIGIN, 1);
            if (enableJavaLog) {
                jSONObject.put("crashJava", 1);
            } else {
                jSONObject.put("crashJava", 0);
            }
            if (enableNativeLog) {
                jSONObject.put("crashNative", 1);
            } else {
                jSONObject.put("crashNative", 0);
            }
            if (enableANRLog) {
                jSONObject.put(UCrashCallback.TYPE_ANR, 1);
            } else {
                jSONObject.put(UCrashCallback.TYPE_ANR, 0);
            }
            if (isPA) {
                jSONObject.put("pa", 1);
            } else {
                jSONObject.put("pa", 0);
            }
            if (isLa) {
                jSONObject.put("la", 1);
            } else {
                jSONObject.put("la", 0);
            }
            if (UMMemoryMonitor.get().isEnable()) {
                jSONObject.put("mem", 1);
            } else {
                jSONObject.put("mem", 0);
            }
            if (isNet) {
                jSONObject.put("net", 1);
            } else {
                jSONObject.put("net", 0);
            }
            if (H5Manager.getH5ConfigMananger() == null || !H5Manager.getH5ConfigMananger().isH5TracerEnable()) {
                jSONObject.put("h5", 0);
            } else {
                jSONObject.put("h5", 1);
            }
            if (isOpenUserCrash) {
                jSONObject.put("crashUser", 1);
            } else {
                jSONObject.put("crashUser", 0);
            }
            if (isPage) {
                jSONObject.put("page", 1);
            } else {
                jSONObject.put("page", 0);
            }
            if (isPower) {
                jSONObject.put("power", 1);
            } else {
                jSONObject.put("power", 0);
            }
            if (isCodeLog) {
                jSONObject.put("codelog", 1);
            } else {
                jSONObject.put("codelog", 0);
            }
            if (isMemLeak) {
                jSONObject.put("memleak", 1);
            } else {
                jSONObject.put("memleak", 0);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0247 A[Catch: all -> 0x0245, TRY_LEAVE, TryCatch #11 {all -> 0x0245, blocks: (B:104:0x021a, B:106:0x021e, B:113:0x0238, B:115:0x023e, B:120:0x0247, B:112:0x0235, B:107:0x0223, B:109:0x0229), top: B:248:0x021a, inners: #5 }] */
    public static void init(final Context context, final String str, String str2) {
        String umid;
        if (context == null || str == null) {
            return;
        }
        mContext = context;
        try {
            WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrash.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ImprintHandler.getImprintService(UMCrash.mContext).registImprintCallback(UMCrashContent.KEY_APM_CTR_FLAG, new UMImprintChangeCallback() { // from class: com.umeng.umcrash.UMCrash.1.1
                            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                            public void onImprintValueChanged(String str3, String str4) {
                                try {
                                    if (TextUtils.isEmpty(str3) || !UMCrashContent.KEY_APM_CTR_FLAG.equals(str3)) {
                                        return;
                                    }
                                    if (UMCrash.isDebug) {
                                        String unused = UMCrash.TAG;
                                    }
                                    UMCrashUtils.saveInnerConfig(context.getApplicationContext(), str3, str4);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        });
                        String strImprintProperty = UMEnvelopeBuild.imprintProperty(UMCrash.mContext, UMCrashContent.KEY_APM_CTR_FLAG, "0");
                        if (UMCrash.isDebug) {
                            String unused = UMCrash.TAG;
                        }
                        if (strImprintProperty == null || TextUtils.isEmpty(strImprintProperty)) {
                            return;
                        }
                        UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.KEY_APM_CTR_FLAG, strImprintProperty);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            if (UMCrashUtils.getInnerConfig(mContext, UMCrashContent.KEY_APM_CTR_FLAG, 0) == -1) {
                return;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            SamplingWhiteListUtil.setHitWL(UMCrashUtils.getInnerConfig(mContext, UMCrashContent.APM_STATE_HIT_WL, 0) == 1);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        final SharedPreferences sharedPreferences = SharedPreferencesUtils.getSharedPreferences(context, INTEGRATIONTESTING_SP);
        try {
            initCrashState(context);
            String umid2 = UMCrashUtils.getUMID(context);
            UCrash.addHeader(KEY_HEADER_APPKEY, str);
            UCrash.addHeader(KEY_HEADER_CHANNEL, str2);
            UCrash.addHeader(KEY_HEADER_OS, "android");
            UCrash.addHeader(KEY_HEADER_CRASH_VERSION, crashSdkVersion);
            UCrash.addHeader(KEY_HEADER_UMID, umid2);
            try {
                String[] activeUser = UMCrashUtils.getActiveUser(context);
                if (activeUser != null && activeUser.length == 2) {
                    UCrash.addHeader(KEY_HEADER_PUID, activeUser[1]);
                    UCrash.addHeader(KEY_HEADER_PROVIDER, activeUser[0]);
                }
            } catch (Throwable unused) {
                UCrash.addHeader(KEY_HEADER_PUID, "");
                UCrash.addHeader(KEY_HEADER_PROVIDER, "");
            }
            UCrash.addHeader(KEY_HEADER_CARRIER, UMCrashUtils.getNetworkOperatorName(context));
            if (!TextUtils.isEmpty(userBver)) {
                UCrash.addHeader(KEY_HEADER_BVER, userBver);
            }
            if (!TextUtils.isEmpty(userBsver)) {
                UCrash.addHeader(KEY_HEADER_BSVER, userBsver);
            }
            if (!TextUtils.isEmpty(userBesrial)) {
                UCrash.addHeader(KEY_HEADER_BESRIAL, userBesrial);
            }
            try {
                UCrash.addHeader(KEY_HEADER_NETWORK_TYPE, "" + NetworkUtil.getNetworkTypeUmeng(context));
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                if (UMCrashUtils.isHarmony(context)) {
                    UCrash.addHeader("others_OS", "harmony");
                } else {
                    UCrash.addHeader("others_OS", AnalyticsConstants.SDK_TYPE);
                }
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.umcrash.UMCrash.2
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        Intent intent;
                        Uri data;
                        String scheme;
                        long j;
                        UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_CREATED);
                        if (UMCrash.index != 0 || (intent = activity.getIntent()) == null || (data = intent.getData()) == null || (scheme = data.getScheme()) == null || scheme.isEmpty()) {
                            return;
                        }
                        if (scheme.contains("um." + str)) {
                            Set<String> queryParameterNames = data.getQueryParameterNames();
                            if (queryParameterNames.contains(UMCrash.IT_DEBUGKEY) && queryParameterNames.contains(UMCrash.IT_SENDAGING)) {
                                String queryParameter = data.getQueryParameter(UMCrash.IT_DEBUGKEY);
                                try {
                                    j = Long.parseLong(data.getQueryParameter(UMCrash.IT_SENDAGING));
                                } catch (NumberFormatException unused2) {
                                    j = 0;
                                }
                                if (j < 0) {
                                    sharedPreferences.edit().clear().apply();
                                    IntegrationTestingUtil.setIntegrationTestingInPeriod(false);
                                    return;
                                }
                                if (j > 6) {
                                    j = 6;
                                }
                                sharedPreferences.edit().putString("debugkey", queryParameter).apply();
                                sharedPreferences.edit().putLong("timestamp", (j * 3600000) + System.currentTimeMillis()).apply();
                                UMCrashUtils.setIntegrationTesingParams(queryParameter);
                                IntegrationTestingUtil.setIntegrationTestingInPeriod(true);
                            }
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_DESTROYED);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_PAUSED);
                        UMCrash.access$1510();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_RESUMED);
                        UMMemoryMonitor.get().onActivityResumed(activity);
                        PowerManager.onActivityResumed(activity);
                        UMCrash.access$1508();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_STARTED);
                        UMMemoryMonitor.get().onActivityStarted(activity);
                        PowerManager.onActivityStarted(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_STOPPED);
                        UMMemoryMonitor.get().onActivityStopped(activity);
                        PowerManager.onActivityStopped(activity);
                    }
                });
            }
            try {
                WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrash.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String[] networkAccessMode = NetworkUtil.getNetworkAccessMode(context);
                            if ("Wi-Fi".equals(networkAccessMode[0])) {
                                UCrash.addHeader(UMCrash.KEY_HEADER_ACCESS, NetworkUtil.NETWORK_TYPE_WIFI);
                            } else if ("2G/3G".equals(networkAccessMode[0])) {
                                UCrash.addHeader(UMCrash.KEY_HEADER_ACCESS, "2G/3G");
                            } else {
                                UCrash.addHeader(UMCrash.KEY_HEADER_ACCESS, "unknow");
                            }
                            if ("".equals(networkAccessMode[1])) {
                                return;
                            }
                            UCrash.addHeader(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
                        } catch (Throwable th6) {
                            th6.printStackTrace();
                        }
                    }
                });
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
            UCrash.init(context, new UCrashConfig.Builder().setLogEnable(isDebug).setJavaCrashEnable(enableUMJavaLog).setNativeCrashEnable(enableUMNativeLog).setAnrEnable(enableUMANRLog).setAnrTraceHkEnable(enableUMAnrTrace).setCustomEnable(enableUMUserLog).setCustomUploadImmediately(isUploadNowUserCrash).setBackupEnable(sIsEnableLogBackup).setBackupDir(context.getApplicationInfo().dataDir + File.separator + "apm_backup_files").setJavaDumpAllThreads(sIsDumpAllStackTrace).setNativeDumpAllThreads(sIsDumpAllStackTrace).setJavaCrashRethrow(!sIsKillProcessAfterCrash).setUrl((isIntl ? UMCrashContent.UM_DOMAIN_APM_URL_INTL : UMCrashContent.UM_DOMAIN_APM_URL).concat("/upload")).setCallback(new UCrashCallbackImpl()).build());
        } catch (Throwable unused2) {
        }
        try {
            int innerConfig = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_CODE_LOG, -1);
            if (innerConfig != 0 && innerConfig == 100 && enableCodeLog) {
                if (TextUtils.isEmpty(ULogManager.getDeviceID())) {
                    ULogManager.setDeviceID(UMCrashUtils.getUMID(mContext));
                }
                isCodeLog = true;
            }
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        try {
            initReporter(context, str, str2);
        } catch (Throwable th8) {
            th8.printStackTrace();
        }
        try {
            String string = sharedPreferences.getString("debugkey", "");
            if (sharedPreferences.getLong("timestamp", 0L) - System.currentTimeMillis() < 0 || TextUtils.isEmpty(string)) {
                sharedPreferences.edit().clear().apply();
                IntegrationTestingUtil.setIntegrationTestingInPeriod(false);
            } else {
                IntegrationTestingUtil.setIntegrationTestingInPeriod(true);
                UMCrashUtils.setIntegrationTesingParams(string);
            }
        } catch (Throwable th9) {
            th9.printStackTrace();
        }
        try {
            if (enablePaLog) {
                WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrash.4
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            PAFactory.Builder builder = new PAFactory.Builder(context.getApplicationContext(), new IEfsReporter() { // from class: com.umeng.umcrash.UMCrash.4.1
                                @Override // com.efs.sdk.pa.config.IEfsReporter
                                public EfsReporter getReporter() {
                                    return UMCrash.sReporter;
                                }
                            });
                            builder.packageLevel(PackageLevel.RELEASE);
                            builder.timeoutTime(UMCrash.paTimeoutTime);
                            builder.setPaClient(new PaClientImpl());
                            PAFactory pAFactoryBuild = builder.build();
                            pAFactoryBuild.getPaInstance().start();
                            boolean unused3 = UMCrash.isPA = pAFactoryBuild.getConfigManager().enableTracer();
                        } catch (Throwable th10) {
                            th10.printStackTrace();
                        }
                    }
                });
            }
        } catch (Throwable th10) {
            th10.printStackTrace();
        }
        try {
            if (enableLaunchLog) {
                LaunchManager.init(context, sReporter);
                try {
                    if (LaunchManager.getLaunchConfigManager() != null) {
                        isLa = LaunchManager.getLaunchConfigManager().enableTracer();
                        umid = UMCrashUtils.getUMID(context);
                        if (umid != null || TextUtils.isEmpty(umid)) {
                            ImprintHandler.getImprintService(context).registImprintCallback(bc.g, new UMImprintChangeCallback() { // from class: com.umeng.umcrash.UMCrash.5
                                @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                                public void onImprintValueChanged(String str3, String str4) {
                                    if (UMCrash.isDebug) {
                                        String unused3 = UMCrash.TAG;
                                    }
                                    try {
                                        if (bc.g.equals(str3)) {
                                            LaunchManager.sendLaunchCache(context, str4);
                                            ImprintHandler.getImprintService(context).unregistImprintCallback(bc.g, this);
                                        }
                                    } catch (Throwable th11) {
                                        th11.printStackTrace();
                                    }
                                }
                            });
                        }
                    } else {
                        umid = UMCrashUtils.getUMID(context);
                        if (umid != null) {
                            ImprintHandler.getImprintService(context).registImprintCallback(bc.g, new UMImprintChangeCallback() { // from class: com.umeng.umcrash.UMCrash.5
                                @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                                public void onImprintValueChanged(String str3, String str4) {
                                    if (UMCrash.isDebug) {
                                        String unused3 = UMCrash.TAG;
                                    }
                                    try {
                                        if (bc.g.equals(str3)) {
                                            LaunchManager.sendLaunchCache(context, str4);
                                            ImprintHandler.getImprintService(context).unregistImprintCallback(bc.g, this);
                                        }
                                    } catch (Throwable th11) {
                                        th11.printStackTrace();
                                    }
                                }
                            });
                        } else {
                            ImprintHandler.getImprintService(context).registImprintCallback(bc.g, new UMImprintChangeCallback() { // from class: com.umeng.umcrash.UMCrash.5
                                @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                                public void onImprintValueChanged(String str3, String str4) {
                                    if (UMCrash.isDebug) {
                                        String unused3 = UMCrash.TAG;
                                    }
                                    try {
                                        if (bc.g.equals(str3)) {
                                            LaunchManager.sendLaunchCache(context, str4);
                                            ImprintHandler.getImprintService(context).unregistImprintCallback(bc.g, this);
                                        }
                                    } catch (Throwable th11) {
                                        th11.printStackTrace();
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th11) {
                    th11.printStackTrace();
                }
            }
        } catch (Throwable th12) {
            th12.printStackTrace();
        }
        try {
            if (enableMemLog) {
                UMMemoryMonitor.get().start(context, sReporter);
            }
        } catch (Throwable th13) {
            th13.printStackTrace();
        }
        try {
            int innerConfig2 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NET, -1);
            if (innerConfig2 != 0 && innerConfig2 == 100 && enableNetLog) {
                NetManager.init(context, sReporter);
                try {
                    if (NetManager.getNetConfigManager() != null) {
                        isNet = NetManager.getNetConfigManager().enableTracer();
                    }
                } catch (Throwable th14) {
                    th14.printStackTrace();
                }
            }
        } catch (Throwable th15) {
            th15.printStackTrace();
        }
        try {
            int innerConfig3 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NATIVE_H5, -1);
            if (innerConfig3 != 0 && innerConfig3 == 100 && enableH5PageLog) {
                H5Manager.init(context, sReporter);
            }
        } catch (Throwable th16) {
            th16.printStackTrace();
        }
        try {
            int innerConfig4 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_PAGE, -1);
            if (innerConfig4 != 0 && innerConfig4 == 100 && enablePageLog) {
                PageManger.init(mContext, sReporter);
                try {
                    if (PageManger.getPageConfigManger() != null) {
                        isPage = PageManger.getPageConfigManger().enableTracer();
                    }
                } catch (Throwable th17) {
                    th17.printStackTrace();
                }
            }
        } catch (Throwable th18) {
            th18.printStackTrace();
        }
        try {
            int innerConfig5 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_POWER, -1);
            if (innerConfig5 != 0 && innerConfig5 == 100 && enablePowerLog) {
                PowerManager.init(mContext, sReporter);
                try {
                    if (PowerManager.getPowerConfigManager() != null) {
                        isPower = PowerManager.getPowerConfigManager().enableTracer();
                    }
                } catch (Throwable th19) {
                    th19.printStackTrace();
                }
            }
        } catch (Throwable th20) {
            th20.printStackTrace();
        }
        try {
            int innerConfig6 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_FLUTTER, -1);
            if (innerConfig6 != 0 && innerConfig6 == 100 && enableFlutterLog) {
                FlutterManager.init(mContext, sReporter);
                try {
                    if (FlutterManager.getFlutterConfigManager() != null) {
                        isFlutter = FlutterManager.getFlutterConfigManager().isFlutterEnable();
                    }
                } catch (Throwable th21) {
                    th21.printStackTrace();
                }
            }
        } catch (Throwable th22) {
            th22.printStackTrace();
        }
        try {
            int innerConfig7 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_MEMLEAK, -1);
            if (innerConfig7 != 0 && innerConfig7 == 100 && enableMemLeakLog) {
                MemLeakManager.init(mContext, sReporter, new MemLeakClientImpl());
                try {
                    if (MemLeakManager.getMemLeakConfigManager() != null) {
                        isMemLeak = MemLeakManager.getMemLeakConfigManager().enableTracer();
                    }
                } catch (Throwable th23) {
                    th23.printStackTrace();
                }
            }
        } catch (Throwable th24) {
            th24.printStackTrace();
        }
        try {
            sApmCallbackLimit = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CALLBACK_LIMIT, -1);
        } catch (Throwable th25) {
            th25.printStackTrace();
        }
        if (isCodeLog) {
            ULogManager.init(mContext, sReporter);
        }
    }

    public static void initConfig(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getBoolean(KEY_ENABLE_CRASH_JAVA, true)) {
                enableJavaLog = true;
            } else {
                enableJavaLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_CRASH_NATIVE, true)) {
                enableNativeLog = true;
            } else {
                enableNativeLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_ANR, true)) {
                enableANRLog = true;
            } else {
                enableANRLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_PA, true)) {
                enablePaLog = true;
            } else {
                enablePaLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_LAUNCH, true)) {
                enableLaunchLog = true;
            } else {
                enableLaunchLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_MEM, true)) {
                enableMemLog = true;
            } else {
                enableMemLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_NET, true)) {
                enableNetLog = true;
            } else {
                enableNetLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_H5PAGE, true)) {
                enableH5PageLog = true;
            } else {
                enableH5PageLog = false;
            }
            paTimeoutTime = bundle.getLong(KEY_PA_TIMEOUT_TIME, 2000L);
            if (bundle.getBoolean(KEY_ENABLE_PAGE, true)) {
                enablePageLog = true;
            } else {
                enablePageLog = false;
            }
            try {
                if (bundle.getBoolean(KEY_ENABLE_CODE_LOG, true)) {
                    enableCodeLog = true;
                } else {
                    enableCodeLog = false;
                }
                ULogManager.setUserID(bundle.getString(KEY_LOG_USER_ID, ""));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (bundle.getBoolean(KEY_ENABLE_POWER, true)) {
                enablePowerLog = true;
            } else {
                enablePowerLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_FLUTTER, true)) {
                enableFlutterLog = true;
            } else {
                enableFlutterLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_MEMLEAK, true)) {
                enableMemLeakLog = true;
            } else {
                enableMemLeakLog = false;
            }
        }
    }

    private static void initCrashState(Context context) {
        try {
            if (enableJavaLog) {
                boolean zRandom = UMCrashUtils.random(UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_JAVA_SAMPLING_RATE, 100));
                enableUMJavaLog = zRandom;
                enableJavaLog = zRandom;
            } else {
                enableUMJavaLog = false;
            }
            if (enableNativeLog) {
                boolean zRandom2 = UMCrashUtils.random(UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_NATIVE_SAMPLING_RATE, 100));
                enableUMNativeLog = zRandom2;
                enableNativeLog = zRandom2;
            } else {
                enableUMNativeLog = false;
            }
            if (enableANRLog) {
                boolean zRandom3 = UMCrashUtils.random(UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_ANR_SAMPLING_RATE, 100));
                enableUMANRLog = zRandom3;
                enableANRLog = zRandom3;
            } else {
                enableUMANRLog = false;
            }
            boolean zRandom4 = UMCrashUtils.random(UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_USER_SAMPLING_RATE, 100));
            enableUMUserLog = zRandom4;
            isOpenUserCrash = zRandom4;
            enableUMAnrTrace = UMCrashUtils.random(UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_ANR_TRACE_STATE, 100));
            if (UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE, -1) == 0) {
                isUploadNowUserCrash = true;
            } else {
                isUploadNowUserCrash = false;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void initReporter(final Context context, String str, String str2) {
        HashMap map = new HashMap(1);
        map.put(KEY_HEADER_UMID, UMCrashUtils.getUMID(context));
        map.put(KEY_HEADER_CHANNEL, str2);
        map.put(KEY_HEADER_CARRIER, UMCrashUtils.getNetworkOperatorName(context));
        map.put(KEY_HEADER_OS, "android");
        map.put(KEY_HEADER_CRASH_VERSION, crashSdkVersion);
        try {
            String[] activeUser = UMCrashUtils.getActiveUser(context);
            if (activeUser != null && activeUser.length == 2) {
                map.put(KEY_HEADER_PUID, activeUser[1]);
                map.put(KEY_HEADER_PROVIDER, activeUser[0]);
            }
        } catch (Throwable unused) {
            map.put(KEY_HEADER_PUID, "");
            map.put(KEY_HEADER_PROVIDER, "");
        }
        if (!TextUtils.isEmpty(userBver)) {
            map.put(KEY_HEADER_BVER, userBver);
        }
        if (!TextUtils.isEmpty(userBsver)) {
            map.put(KEY_HEADER_BSVER, userBsver);
        }
        if (!TextUtils.isEmpty(userBesrial)) {
            map.put(KEY_HEADER_BESRIAL, userBesrial);
        }
        try {
            if (UMCrashUtils.isHarmony(context)) {
                map.put("others_OS", "harmony");
            } else {
                map.put("others_OS", AnalyticsConstants.SDK_TYPE);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        EfsReporter efsReporterBuild = new EfsReporter.Builder(context.getApplicationContext(), str, KEY_APM_DEFAULT_SECRET).debug(isDebug).enablePaBackup(sIsEnableLogBackup).efsDirRootName(KEY_APM_ROOT_NAME).printLogDetail(isDebug).intl(isIntl).enableWaStat(false).logUid(ULogManager.getUserID()).logDid(ULogManager.getDeviceID()).setOpenCodeLog(isCodeLog).build();
        sReporter = efsReporterBuild;
        efsReporterBuild.addPublicParams(map);
        try {
            if (isCodeLog) {
                sReporter.setFileFilterCodeLog(new UploadFileFilterCodeLog());
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            sReporter.getAllSdkConfig(new String[]{UMCrashContent.APM_STATE_CODE_LOG, UMCrashContent.APM_STATE_HIT_WL, UMCrashContent.APM_STATE_MEMLEAK, UMCrashContent.APM_STATE_FLUTTER, UMCrashContent.APM_STATE_POWER, UMCrashContent.APM_STATE_PAGE, UMCrashContent.APM_STATE_NET, UMCrashContent.APM_STATE_NATIVE_H5, UMCrashContent.APM_CRASH_USER_MAX_COUNT, UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE, UMCrashContent.APM_CALLBACK_LIMIT, UMCrashContent.APM_UM_CRASH_JAVA_SAMPLING_RATE, UMCrashContent.APM_UM_CRASH_NATIVE_SAMPLING_RATE, UMCrashContent.APM_UM_CRASH_ANR_SAMPLING_RATE, UMCrashContent.APM_UM_CRASH_USER_SAMPLING_RATE, UMCrashContent.APM_UM_CRASH_ANR_TRACE_STATE}, new IConfigCallback() { // from class: com.umeng.umcrash.UMCrash.6
                @Override // com.efs.sdk.base.observer.IConfigCallback
                public void onChange(Map<String, Object> map2) {
                    try {
                        Object obj = map2.get(UMCrashContent.APM_STATE_NET);
                        if (obj != null) {
                            if (UMCrash.isDebug) {
                                obj.toString();
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NET, obj);
                        }
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                    try {
                        Object obj2 = map2.get(UMCrashContent.APM_STATE_NATIVE_H5);
                        if (obj2 != null) {
                            if (UMCrash.isDebug) {
                                obj2.toString();
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NATIVE_H5, obj2);
                        }
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                    try {
                        UMCrash.saveLocalCrashSampling(context, map2);
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                    try {
                        UMCrash.updateLocalCrashConfig(context, map2);
                    } catch (Throwable th6) {
                        th6.printStackTrace();
                    }
                    try {
                        Object obj3 = map2.get(UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE);
                        if (obj3 != null) {
                            if (UMCrash.isDebug) {
                                obj3.toString();
                            }
                            if (Integer.valueOf(obj3.toString()).intValue() == 0) {
                                boolean unused2 = UMCrash.isUploadNowUserCrash = true;
                            } else {
                                boolean unused3 = UMCrash.isUploadNowUserCrash = false;
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE, obj3);
                        }
                    } catch (Throwable th7) {
                        th7.printStackTrace();
                    }
                    try {
                        Object obj4 = map2.get(UMCrashContent.APM_STATE_PAGE);
                        if (obj4 != null) {
                            if (UMCrash.isDebug) {
                                obj4.toString();
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_PAGE, obj4);
                        }
                    } catch (Throwable th8) {
                        th8.printStackTrace();
                    }
                    try {
                        Object obj5 = map2.get(UMCrashContent.APM_STATE_CODE_LOG);
                        if (obj5 != null) {
                            if (UMCrash.isDebug) {
                                obj5.toString();
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_CODE_LOG, obj5);
                        }
                    } catch (Throwable th9) {
                        th9.printStackTrace();
                    }
                    try {
                        Object obj6 = map2.get(UMCrashContent.APM_STATE_POWER);
                        if (obj6 != null) {
                            if (UMCrash.isDebug) {
                                obj6.toString();
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_POWER, obj6);
                        }
                    } catch (Throwable th10) {
                        th10.printStackTrace();
                    }
                    try {
                        Object obj7 = map2.get(UMCrashContent.APM_STATE_HIT_WL);
                        if (obj7 != null) {
                            if (UMCrash.isDebug) {
                                obj7.toString();
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_HIT_WL, obj7);
                        }
                    } catch (Throwable th11) {
                        th11.printStackTrace();
                    }
                    try {
                        Object obj8 = map2.get(UMCrashContent.APM_STATE_FLUTTER);
                        if (obj8 != null) {
                            if (UMCrash.isDebug) {
                                obj8.toString();
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_FLUTTER, obj8);
                        }
                    } catch (Throwable th12) {
                        th12.printStackTrace();
                    }
                    try {
                        Object obj9 = map2.get(UMCrashContent.APM_STATE_MEMLEAK);
                        if (obj9 != null) {
                            if (UMCrash.isDebug) {
                                obj9.toString();
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_MEMLEAK, obj9);
                        }
                    } catch (Throwable th13) {
                        th13.printStackTrace();
                    }
                    try {
                        Object obj10 = map2.get(UMCrashContent.APM_CALLBACK_LIMIT);
                        if (obj10 != null) {
                            if (UMCrash.isDebug) {
                                obj10.toString();
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CALLBACK_LIMIT, obj10);
                        }
                    } catch (Throwable th14) {
                        th14.printStackTrace();
                    }
                }
            });
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    public static void isBuildId(boolean z) {
        isBuildId = z;
    }

    public static void reRegisterAnrHandler() {
        if (enableUMANRLog) {
            UCrash.reRegisterAnrHandler();
        }
    }

    public static void registerPerfCallback(IUMPerfCallback iUMPerfCallback) {
        EfsReporter.registerPerfCallback(iUMPerfCallback);
    }

    public static void registerUMCrashCallback(UMCrashCallback uMCrashCallback) {
        if (uMCrashCallback != null) {
            mUMCrashCallback = uMCrashCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveActivityState(String str, String str2) {
        try {
            ArrayList<String> arrayList = mArrayList;
            if (arrayList != null) {
                if (arrayList.size() >= 20) {
                    mArrayList.remove(0);
                }
                mArrayList.add(str + "-" + System.currentTimeMillis() + "-" + str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveLocalCrashSampling(Context context, Map<String, Object> map) {
        if (context == null || map == null) {
            return;
        }
        Object obj = map.get(UMCrashContent.APM_UM_CRASH_JAVA_SAMPLING_RATE);
        if (obj != null) {
            if (isDebug) {
                obj.toString();
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_JAVA_SAMPLING_RATE, obj);
        }
        Object obj2 = map.get(UMCrashContent.APM_UM_CRASH_NATIVE_SAMPLING_RATE);
        if (obj2 != null) {
            if (isDebug) {
                obj2.toString();
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_NATIVE_SAMPLING_RATE, obj2);
        }
        Object obj3 = map.get(UMCrashContent.APM_UM_CRASH_ANR_SAMPLING_RATE);
        if (obj3 != null) {
            if (isDebug) {
                obj3.toString();
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_ANR_SAMPLING_RATE, obj3);
        }
        Object obj4 = map.get(UMCrashContent.APM_UM_CRASH_USER_SAMPLING_RATE);
        if (obj4 != null) {
            if (isDebug) {
                obj4.toString();
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_USER_SAMPLING_RATE, obj4);
        }
        Object obj5 = map.get(UMCrashContent.APM_UM_CRASH_ANR_TRACE_STATE);
        if (obj5 != null) {
            if (isDebug) {
                obj5.toString();
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_UM_CRASH_ANR_TRACE_STATE, obj5);
        }
    }

    public static void setAppVersion(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.trim().getBytes().length > 128) {
                    str = UMCrashUtils.splitByByte(str, 128);
                }
                userBver = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str2.trim().getBytes().length > 128) {
                    str2 = UMCrashUtils.splitByByte(str2, 128);
                }
                userBsver = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                if (str3.trim().getBytes().length > 128) {
                    str3 = UMCrashUtils.splitByByte(str3, 128);
                }
                userBesrial = str3;
            }
            if (!TextUtils.isEmpty(userBver)) {
                UCrash.addHeader(KEY_HEADER_BVER, userBver);
            }
            if (!TextUtils.isEmpty(userBsver)) {
                UCrash.addHeader(KEY_HEADER_BSVER, userBsver);
            }
            if (!TextUtils.isEmpty(userBesrial)) {
                UCrash.addHeader(KEY_HEADER_BESRIAL, userBesrial);
            }
            HashMap map = new HashMap(1);
            if (!TextUtils.isEmpty(userBver)) {
                map.put(KEY_HEADER_BVER, userBver);
            }
            if (!TextUtils.isEmpty(userBsver)) {
                map.put(KEY_HEADER_BSVER, userBsver);
            }
            if (!TextUtils.isEmpty(userBesrial)) {
                map.put(KEY_HEADER_BESRIAL, userBesrial);
            }
            EfsReporter efsReporter = sReporter;
            if (efsReporter != null) {
                efsReporter.addPublicParams(map);
            }
            if (!TextUtils.isEmpty(userBver)) {
                UMCrashUtils.setCommonTag(KEY_HEADER_BVER, userBver);
            }
            if (!TextUtils.isEmpty(userBsver)) {
                UMCrashUtils.setCommonTag(KEY_HEADER_BSVER, userBsver);
            }
            if (TextUtils.isEmpty(userBesrial)) {
                return;
            }
            UMCrashUtils.setCommonTag(KEY_HEADER_BESRIAL, userBesrial);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void setDebug(boolean z) {
        isDebug = z;
        LaunchManager.isDebug = z;
        H5Manager.isDebug = z;
        PageManger.isDebug = z;
        PowerManager.isDebug = z;
        ULogManager.isDebug = z;
        MemLeakManager.isDebug = z;
    }

    public static void setLogCollectSaveSize(long j) {
        ULogManager.setsLogMaxCache(j);
    }

    public static void setPaTimeoutTime(long j) {
        paTimeoutTime = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateLocalCrashConfig(Context context, Map<String, Object> map) {
        Object obj;
        if (context == null || map == null || (obj = map.get(UMCrashContent.APM_CRASH_USER_MAX_COUNT)) == null) {
            return;
        }
        if (isDebug) {
            obj.toString();
        }
        UCrash.updateCustomLogLimit(Integer.valueOf(obj.toString()).intValue(), Integer.valueOf(obj.toString()).intValue());
    }

    private static void useIntlServices(boolean z) {
        isIntl = z;
    }

    public static void enableJavaScriptBridge(View view) {
        try {
            H5Manager.setWebView(view);
        } catch (Throwable unused) {
        }
    }

    public static void generateCustomLog(Throwable th, String str, boolean z, boolean z2) {
        generateCustomLog(th, str, (String) null, z, z2);
    }

    public static void registerUMCrashCallback(IUMCrashCallbackWithType iUMCrashCallbackWithType) {
        if (iUMCrashCallbackWithType != null) {
            mUMCrashCallbackWithType = iUMCrashCallbackWithType;
        }
    }

    public static void generateCustomLog(Throwable th, String str, String str2, boolean z, boolean z2) {
        UAPMCustomException.generateCustomLog(enableUMUserLog, false, isUploadNowUserCrash, th, str, str2, z, z2);
    }

    public static void generateCustomLog(String str, String str2) {
        generateCustomLog(str, str2, false, false);
    }

    public static void generateCustomLog(String str, String str2, boolean z, boolean z2) {
        generateCustomLog(str, str2, (String) null, z, z2);
    }

    public static void generateCustomLog(String str, String str2, String str3, boolean z, boolean z2) {
        UAPMCustomException.generateCustomLog(enableUMUserLog, false, isUploadNowUserCrash, str, str2, str3, z, z2);
    }
}
