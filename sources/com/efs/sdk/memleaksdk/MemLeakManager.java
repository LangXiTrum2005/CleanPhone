package com.efs.sdk.memleaksdk;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.memleaksdk.monitor.internal.a;

/* JADX INFO: loaded from: classes2.dex */
public class MemLeakManager {
    public static final String TAG = "MemLeakManager";
    public static boolean isDebug = true;
    private static boolean isFinishInit;
    private static Context mContext;
    private static MemLeakConfigManager mMemLeakConfigManager;
    private static EfsReporter mReporter;
    private static IMemLeakClient sMemLeakClient;
    private static volatile String sUMCustomInfo;

    public static Context getApplicationContext() {
        return mContext;
    }

    public static IMemLeakClient getMemLeakClient() {
        return sMemLeakClient;
    }

    public static MemLeakConfigManager getMemLeakConfigManager() {
        return mMemLeakConfigManager;
    }

    public static EfsReporter getReporter() {
        return mReporter;
    }

    public static String getUMCustomInfo() {
        return sUMCustomInfo;
    }

    public static void init(Context context, EfsReporter efsReporter, IMemLeakClient iMemLeakClient) {
        if (context == null || efsReporter == null) {
            return;
        }
        try {
            if (isInit()) {
                return;
            }
            mContext = context.getApplicationContext();
            mReporter = efsReporter;
            sMemLeakClient = iMemLeakClient;
            mMemLeakConfigManager = new MemLeakConfigManager(context, efsReporter);
            isFinishInit = true;
            a.a(mContext, efsReporter);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean isInit() {
        return isFinishInit;
    }

    public static void setUMCustomInfo(String str) {
        sUMCustomInfo = str;
    }
}
