package com.umeng.logsdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.commonsdk.framework.UMModuleRegister;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ULogManager {
    public static final String TAG = "CodeLogManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f2727a = null;
    private static ULogConfigManager b = null;
    private static EfsReporter c = null;
    private static boolean d = false;
    private static String e = "";
    private static String f = "";
    private static long h = 0;
    private static long i = 0;
    public static boolean isDebug = true;
    private static JSONArray g = new JSONArray();
    private static long j = 18432;
    private static Handler k = new Handler(Looper.getMainLooper()) { // from class: com.umeng.logsdk.ULogManager.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                ULogManager.a(message);
            } else {
                if (i2 != 1) {
                    return;
                }
                ULogManager.e();
            }
        }
    };
    private static int l = 0;

    public static /* synthetic */ int b() {
        int i2 = l;
        l = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int c() {
        int i2 = l;
        l = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        JSONObject jSONObject;
        Throwable th;
        if (g.length() > 0) {
            i = System.currentTimeMillis();
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("taskid", "");
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
                    jSONObject.put("time_start", h);
                    jSONObject.put("time_end", i);
                    jSONObject.put("uid", c.b(getUserID().getBytes()));
                    jSONObject.put("did", getDeviceID());
                    jSONObject.put(TtmlNode.TAG_BODY, g);
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                }
            } catch (Throwable th3) {
                jSONObject = null;
                th = th3;
            }
            if (jSONObject != null) {
                EfsJSONLog efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_CODELOGPERF);
                efsJSONLog.setLogBeginTime(h);
                efsJSONLog.setLogEndTime(i);
                efsJSONLog.put("codelog", jSONObject);
                EfsReporter reporter = getReporter();
                if (reporter != null) {
                    reporter.send(efsJSONLog);
                    g = new JSONArray();
                }
            }
        }
    }

    public static String getDeviceID() {
        return e;
    }

    public static EfsReporter getReporter() {
        return c;
    }

    public static ULogConfigManager getULogConfigManager() {
        return b;
    }

    public static String getUserID() {
        return f;
    }

    public static void i(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 2;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
        message.setData(bundle);
        k.sendMessage(message);
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            return;
        }
        try {
            if (isInit()) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            f2727a = applicationContext;
            c = efsReporter;
            b = new ULogConfigManager(applicationContext, efsReporter);
            registerActivityCallback(context);
            d = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean isInit() {
        return d;
    }

    public static void registerActivityCallback(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.logsdk.ULogManager.2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    ULogManager.b();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    ULogManager.c();
                    if (ULogManager.l == 0) {
                        ULogManager.e();
                    }
                }
            });
        }
    }

    public static void setDeviceID(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 128) {
            e = str;
        }
    }

    public static void setUserID(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 128) {
            f = c.a(str.getBytes());
        }
    }

    public static void setsLogMaxCache(long j2) {
        if (j2 <= 0 || j2 >= 18432) {
            return;
        }
        j = j2;
    }

    public static void v(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 0;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
        message.setData(bundle);
        k.sendMessage(message);
    }

    public static void w(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 3;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
        message.setData(bundle);
        k.sendMessage(message);
    }

    public static /* synthetic */ void a(Message message) {
        Bundle data;
        JSONObject jSONObject;
        if (message == null || message.getData() == null || (data = message.getData()) == null) {
            return;
        }
        String string = data.getString("tag");
        String string2 = data.getString(PglCryptUtils.KEY_MESSAGE);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || string.length() > a.f2729a || string2.length() > a.b || !isInit()) {
            return;
        }
        if (TextUtils.isEmpty(getDeviceID()) && TextUtils.isEmpty(getUserID())) {
            return;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("tag", string);
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, string2);
                jSONObject.put("level", message.arg1);
                jSONObject.put("time", System.currentTimeMillis());
                jSONObject.put(UMModuleRegister.PROCESS, ProcessUtil.getCurrentProcessName());
                jSONObject.put("thread", Thread.currentThread().getName());
            } catch (Throwable th) {
                th = th;
                jSONObject2 = jSONObject;
                th.printStackTrace();
                jSONObject = jSONObject2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (jSONObject != null) {
            if (g.length() == 0) {
                h = System.currentTimeMillis();
            }
            g.put(jSONObject);
            if (isDebug) {
                jSONObject.toString();
            }
        }
        if (g.toString().getBytes().length >= j) {
            if (isDebug) {
                int length = g.toString().getBytes().length;
            }
            e();
        }
    }

    public static void d(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 1;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
        message.setData(bundle);
        k.sendMessage(message);
    }

    public static void e(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 4;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
        message.setData(bundle);
        k.sendMessage(message);
    }
}
