package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.PackageUtil;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.core.util.c;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.umcrash.UMCrash;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class GlobalInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GlobalInfo f396a;
    private Context b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final GlobalInfoManager f397a = new GlobalInfoManager(0);
    }

    public /* synthetic */ GlobalInfoManager(byte b) {
        this();
    }

    private static String a(Context context) {
        Class<DeviceConfig> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = DeviceConfig.class;
            String str = DeviceConfig.UNKNOW;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getSid", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, context);
            if (objInvoke != null) {
                return objInvoke.toString();
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static GlobalInfoManager getInstance() {
        return a.f397a;
    }

    public GlobalInfo getGlobalInfo() {
        try {
            String strA = a(this.b);
            if (!TextUtils.isEmpty(strA)) {
                this.f396a.a(UMCrash.KEY_CALLBACK_SESSION_ID, strA);
            }
        } catch (Throwable th) {
            Log.d("efs.info.manager", "refreshSessionId caused error: " + th.getMessage());
        }
        return this.f396a;
    }

    public String getNetStatus() {
        return this.f396a.b("net", NetworkUtil.NETWORK_CLASS_DISCONNECTED).toString();
    }

    public void initGlobalInfo() {
        Log.e("ballack", "initGlobalInfo called once.");
        GlobalInfo globalInfo = new GlobalInfo();
        this.f396a = globalInfo;
        globalInfo.a("appid", ControllerCenter.getGlobalEnvStruct().getAppid());
        int iMyPid = ProcessUtil.myPid();
        this.f396a.a("pid", Integer.valueOf(iMyPid));
        this.f396a.a("ps", ProcessUtil.getProcessName(iMyPid));
        String strA = c.a(this.b);
        this.f396a.a("wid", strA);
        if (TextUtils.isEmpty(ControllerCenter.getGlobalEnvStruct().getUid())) {
            this.f396a.a("uid", strA);
        } else {
            this.f396a.a("uid", ControllerCenter.getGlobalEnvStruct().getUid());
        }
        GlobalInfo globalInfo2 = this.f396a;
        com.efs.sdk.base.core.a.a.a();
        globalInfo2.a("stime", Long.valueOf(com.efs.sdk.base.core.a.a.b() - Process.getElapsedCpuTime()));
        this.f396a.a("pkg", PackageUtil.getPackageName(this.b));
        this.f396a.a("ver", PackageUtil.getAppVersionName(this.b));
        this.f396a.a("vcode", PackageUtil.getAppVersionCode(this.b));
        this.f396a.a("sdk_ver", BuildConfig.VERSION_NAME);
        this.f396a.a("brand", Build.BRAND.toLowerCase());
        GlobalInfo globalInfo3 = this.f396a;
        String str = Build.MODEL;
        globalInfo3.a("model", str == null ? "unknown" : str.replace(" ", "-").replace("_", "-").toLowerCase());
        this.f396a.a("build_model", str);
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        this.f396a.a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
        this.f396a.a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
        this.f396a.a("fr", "android");
        this.f396a.a("rom", Build.VERSION.RELEASE);
        this.f396a.a("sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        this.f396a.a("lang", Locale.getDefault().getLanguage());
        this.f396a.a("tzone", TimeZone.getDefault().getID());
        this.f396a.a("net", NetworkUtil.getNetworkType(this.b));
        try {
            String[] networkAccessMode = NetworkUtil.getNetworkAccessMode(this.b);
            if ("Wi-Fi".equals(networkAccessMode[0])) {
                this.f396a.a(UMCrash.KEY_HEADER_ACCESS, NetworkUtil.NETWORK_TYPE_WIFI);
            } else if ("2G/3G".equals(networkAccessMode[0])) {
                this.f396a.a(UMCrash.KEY_HEADER_ACCESS, "2G/3G");
            } else {
                this.f396a.a(UMCrash.KEY_HEADER_ACCESS, "unknow");
            }
            if (!"".equals(networkAccessMode[1])) {
                this.f396a.a(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
            }
            this.f396a.a(UMCrash.KEY_HEADER_NETWORK_TYPE, Integer.valueOf(NetworkUtil.getNetworkTypeUmeng(this.b)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            this.f396a.a("log_uid", EncodeUtil.base64DecodeToStr(ControllerCenter.getGlobalEnvStruct().getLogUid().getBytes()));
            this.f396a.a("log_did", ControllerCenter.getGlobalEnvStruct().getLogDid());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void refreshNetStatus() {
        String networkType = NetworkUtil.getNetworkType(ControllerCenter.getGlobalEnvStruct().mAppContext);
        Log.w("efs.info.manager", "network change: ".concat(String.valueOf(networkType)));
        this.f396a.a("net", networkType);
    }

    private GlobalInfoManager() {
        this.b = ControllerCenter.getGlobalEnvStruct().mAppContext;
    }
}
