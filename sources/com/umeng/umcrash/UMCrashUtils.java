package com.umeng.umcrash;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class UMCrashUtils {
    private static final int DEF_CLOSE_RATE = 0;
    private static final int MAX_THREAD_TRACE_LENGTH = 20480;
    private static final int MAX_TRACE_RATE = 100;
    public static final String UNKNOW = "";

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        } else if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static String[] getActiveUser(Context context) {
        Class<UMUtils> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = UMUtils.class;
            String str = UMUtils.UNKNOW;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getActiveUser", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, context);
            if (objInvoke != null) {
                return (String[]) objInvoke;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static Map<String, String> getAllThreadTraces() {
        HashMap map = new HashMap();
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces == null) {
                return null;
            }
            Thread thread = Looper.getMainLooper().getThread();
            if (!allStackTraces.containsKey(thread)) {
                allStackTraces.put(thread, thread.getStackTrace());
            }
            long id = Thread.currentThread().getId();
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                if (id != entry.getKey().getId()) {
                    sb.setLength(0);
                    if (entry.getValue() != null && entry.getValue().length != 0) {
                        for (StackTraceElement stackTraceElement : entry.getValue()) {
                            if (sb.length() >= 20480) {
                                sb.append("\n[Stack trace size must be less than :");
                                sb.append(20480);
                                sb.append("!]");
                                break;
                            }
                            sb.append("  at ");
                            sb.append(stackTraceElement.toString());
                            sb.append("\n");
                        }
                        map.put(entry.getKey().getName() + "(" + entry.getKey().getId() + ")", sb.toString());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return map;
    }

    public static int getInnerConfig(Context context, String str, int i) {
        SharedPreferences sharedPreferences;
        if (context == null) {
            return i;
        }
        try {
            return (TextUtils.isEmpty(str) || (sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0)) == null) ? i : sharedPreferences.getInt(str, i);
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return DeviceConfig.getNetworkOperatorName(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static synchronized String getSessionId(Context context) {
        Class<DeviceConfig> cls;
        Method method;
        String string = null;
        if (context == null) {
            return null;
        }
        try {
            cls = DeviceConfig.class;
            String str = DeviceConfig.UNKNOW;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getSid", Context.class);
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, context);
                    if (objInvoke != null) {
                        string = objInvoke.toString();
                    }
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                }
            }
        }
        return string;
    }

    public static synchronized String getUMID(Context context) {
        Class<UMConfigure> cls;
        Method method;
        String string = null;
        if (context == null) {
            return null;
        }
        try {
            cls = UMConfigure.class;
            UMLog uMLog = UMConfigure.umDebugLog;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getUMIDString", Context.class);
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, context);
                    if (objInvoke != null) {
                        string = objInvoke.toString();
                    }
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                }
            }
        }
        return string;
    }

    public static boolean isHarmony(final Context context) {
        try {
            final SharedPreferences sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0);
            if (sharedPreferences.contains("um_apm_harmony")) {
                return sharedPreferences.getBoolean("um_apm_harmony", false);
            }
            WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrashUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        sharedPreferences.edit().putBoolean("um_apm_harmony", context.getString(Resources.getSystem().getIdentifier("config_os_brand", TypedValues.Custom.S_STRING, "android")).equals("harmony")).apply();
                    } catch (Throwable unused) {
                    }
                }
            });
            return false;
        } catch (Throwable unused) {
        }
    }

    public static boolean random(int i) {
        if (i == 0) {
            return false;
        }
        return i == 100 || new Random().nextInt(100) <= i;
    }

    public static void saveInnerConfig(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || obj == null || (sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0)) == null || (editorEdit = sharedPreferences.edit()) == null) {
                    return;
                }
                editorEdit.putInt(str, Integer.parseInt(obj.toString()));
                editorEdit.commit();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void setCommonTag(String str, String str2) {
        try {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMConfigure.BS_TYPE bs_type = UMConfigure.BS_TYPE.APM;
            Method declaredMethod = UMConfigure.class.getDeclaredMethod("setModuleTag", UMConfigure.BS_TYPE.class, String.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                for (Enum r9 : (Enum[]) UMConfigure.BS_TYPE.class.getEnumConstants()) {
                    if (r9 != null && r9.name().equals("APM")) {
                        declaredMethod.invoke(UMConfigure.class, r9, str, str2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void setIntegrationTesingParams(String str) {
        if (UMCrash.getReporter() != null) {
            UMCrash.getReporter().addPublicParams(AbstractC3950lJ.v("um_dk", str));
        }
    }

    public static void setPuidAndProvider(String str, String str2) {
        HashMap map = new HashMap();
        map.put(UMCrash.KEY_HEADER_PUID, str);
        map.put(UMCrash.KEY_HEADER_PROVIDER, str2);
        if (UMCrash.getReporter() != null) {
            UMCrash.getReporter().addPublicParams(map);
        }
    }

    public static String splitByByte(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        try {
            int length = str.length();
            int length2 = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String strValueOf = String.valueOf(str.charAt(i2));
                length2 += strValueOf.getBytes().length;
                if (i < length2) {
                    break;
                }
                stringBuffer.append(strValueOf);
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }
}
