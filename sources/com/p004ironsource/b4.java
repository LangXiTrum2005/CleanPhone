package com.p004ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b4 {
    public static int a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    public static String b(Context context) {
        try {
            return a(context).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }

    public static String c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    public static long d(Context context) {
        try {
            return a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return -1L;
        }
    }

    public static String e(Context context) {
        String installerPackageName;
        try {
            installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            q9.d().a(th);
            installerPackageName = null;
        }
        return TextUtils.isEmpty(installerPackageName) ? "" : installerPackageName;
    }

    public static long f(Context context) {
        try {
            return a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return -1L;
        }
    }

    public static String g(Context context) {
        return context.getPackageName();
    }

    public static PackageInfo a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(g(context), 0);
    }

    public static String b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e2) {
            q9.d().a(e2);
            return "";
        }
    }

    public static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean d(Context context, String str) {
        boolean z2 = false;
        int i2 = 0;
        z2 = false;
        z2 = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    boolean zEquals = false;
                    while (true) {
                        try {
                            String[] strArr = packageInfo.requestedPermissions;
                            if (i2 >= strArr.length || zEquals) {
                                break;
                            }
                            zEquals = str.equals(strArr[i2]);
                            i2++;
                        } catch (Exception e2) {
                            e = e2;
                            z2 = zEquals;
                            q9.d().a(e);
                            IronLog.INTERNAL.error(e.toString());
                            return z2;
                        }
                    }
                    return zEquals;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return z2;
    }

    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Exception e2) {
            q9.d().a(e2);
            return null;
        }
    }

    public static JSONObject a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i2 = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i2], (packageInfo.requestedPermissionsFlags[i2] & 2) != 0 ? "Granted" : "Rejected");
                    i2++;
                }
            } else {
                List listAsList = Arrays.asList(packageInfo.requestedPermissions);
                while (i2 < jSONArray.length()) {
                    String string = jSONArray.getString(i2);
                    int iIndexOf = listAsList.indexOf(string);
                    if (iIndexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[iIndexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i2++;
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject;
    }

    public static boolean a() {
        return true;
    }
}
