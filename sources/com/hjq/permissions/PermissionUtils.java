package com.hjq.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
final class PermissionUtils {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    public static boolean areActivityIntent(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        return AndroidVersion.isAndroid13() ? !packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)).isEmpty() : !packageManager.queryIntentActivities(intent, 65536).isEmpty();
    }

    @NonNull
    public static <T> ArrayList<T> asArrayList(@Nullable T... tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr != null ? tArr.length : 0);
        if (tArr != null && tArr.length != 0) {
            for (T t : tArr) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NonNull
    @SafeVarargs
    public static <T> ArrayList<T> asArrayLists(@Nullable T[]... tArr) {
        ArrayList<T> arrayList = new ArrayList<>();
        if (tArr != null && tArr.length != 0) {
            for (T[] tArr2 : tArr) {
                arrayList.addAll(asArrayList(tArr2));
            }
        }
        return arrayList;
    }

    @RequiresApi(19)
    public static boolean checkOpNoThrow(Context context, String str, int i) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            try {
                i = ((Integer) cls.getDeclaredField(str).get(Integer.class)).intValue();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(i2), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    @RequiresApi(api = 23)
    public static boolean checkSelfPermission(@NonNull Context context, @NonNull String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static boolean containsPermission(@NonNull Collection<String> collection, @NonNull String str) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (equalsPermission(it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean equalsPermission(@NonNull String str, @NonNull String str2) {
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static Activity findActivity(@NonNull Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper) || (context = ((ContextWrapper) context).getBaseContext()) == null) {
                return null;
            }
        }
        return (Activity) context;
    }

    @SuppressLint({"PrivateApi"})
    public static int findApkPathCookie(@NonNull Context context, @NonNull String str) {
        AssetManager assets = context.getAssets();
        try {
            if (AndroidVersion.getTargetSdkVersionCode(context) >= 28 && AndroidVersion.getAndroidVersionCode() >= 28 && AndroidVersion.getAndroidVersionCode() < 30) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                declaredMethod.setAccessible(true);
                Method method = (Method) declaredMethod.invoke(AssetManager.class, "findCookieForPath", new Class[]{String.class});
                if (method != null) {
                    method.setAccessible(true);
                    Integer num = (Integer) method.invoke(context.getAssets(), str);
                    if (num != null) {
                        return num.intValue();
                    }
                }
            }
            Integer num2 = (Integer) assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, str);
            if (num2 != null) {
                return num2.intValue();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        return 0;
    }

    @Nullable
    public static AndroidManifestInfo getAndroidManifestInfo(Context context) {
        int iFindApkPathCookie = findApkPathCookie(context, context.getApplicationInfo().sourceDir);
        AndroidManifestInfo androidManifestInfo = null;
        if (iFindApkPathCookie == 0) {
            return null;
        }
        try {
            AndroidManifestInfo androidManifest = AndroidManifestParser.parseAndroidManifest(context, iFindApkPathCookie);
            try {
                if (TextUtils.equals(context.getPackageName(), androidManifest.packageName)) {
                    return androidManifest;
                }
                return null;
            } catch (IOException e) {
                e = e;
                androidManifestInfo = androidManifest;
                e.printStackTrace();
                return androidManifestInfo;
            } catch (XmlPullParserException e2) {
                e = e2;
                androidManifestInfo = androidManifest;
                e.printStackTrace();
                return androidManifestInfo;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }

    public static Uri getPackageNameUri(@NonNull Context context) {
        return Uri.parse("package:" + context.getPackageName());
    }

    public static Intent getSmartPermissionIntent(@NonNull Context context, @Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            return PermissionIntentManager.getApplicationDetailsIntent(context);
        }
        if (!PermissionApi.containsSpecialPermission(list)) {
            return list.size() == 1 ? PermissionApi.getPermissionIntent(context, list.get(0)) : PermissionIntentManager.getApplicationDetailsIntent(context);
        }
        int size = list.size();
        if (size == 1) {
            return PermissionApi.getPermissionIntent(context, list.get(0));
        }
        if (size != 2) {
            if (size == 3 && AndroidVersion.isAndroid11() && containsPermission(list, Permission.MANAGE_EXTERNAL_STORAGE) && containsPermission(list, Permission.READ_EXTERNAL_STORAGE) && containsPermission(list, Permission.WRITE_EXTERNAL_STORAGE)) {
                return PermissionApi.getPermissionIntent(context, Permission.MANAGE_EXTERNAL_STORAGE);
            }
        } else if (!AndroidVersion.isAndroid13() && containsPermission(list, Permission.NOTIFICATION_SERVICE) && containsPermission(list, Permission.POST_NOTIFICATIONS)) {
            return PermissionApi.getPermissionIntent(context, Permission.NOTIFICATION_SERVICE);
        }
        return PermissionIntentManager.getApplicationDetailsIntent(context);
    }

    public static boolean isActivityReverse(@NonNull Activity activity) {
        int rotation = AndroidVersion.isAndroid11() ? activity.getDisplay().getRotation() : activity.getWindowManager().getDefaultDisplay().getRotation();
        return rotation == 2 || rotation == 3;
    }

    public static boolean isDebugMode(@NonNull Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isScopedStorage(@NonNull Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || !bundle.containsKey("ScopedStorage")) {
                return false;
            }
            return Boolean.parseBoolean(String.valueOf(bundle.get("ScopedStorage")));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isSpecialPermission(@NonNull String str) {
        return equalsPermission(str, Permission.MANAGE_EXTERNAL_STORAGE) || equalsPermission(str, Permission.REQUEST_INSTALL_PACKAGES) || equalsPermission(str, Permission.SYSTEM_ALERT_WINDOW) || equalsPermission(str, Permission.WRITE_SETTINGS) || equalsPermission(str, Permission.NOTIFICATION_SERVICE) || equalsPermission(str, Permission.PACKAGE_USAGE_STATS) || equalsPermission(str, Permission.SCHEDULE_EXACT_ALARM) || equalsPermission(str, Permission.BIND_NOTIFICATION_LISTENER_SERVICE) || equalsPermission(str, Permission.ACCESS_NOTIFICATION_POLICY) || equalsPermission(str, Permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS) || equalsPermission(str, Permission.BIND_VPN_SERVICE) || equalsPermission(str, Permission.PICTURE_IN_PICTURE);
    }

    @SuppressLint({"SwitchIntDef"})
    public static void lockActivityOrientation(@NonNull Activity activity) {
        try {
            int i = activity.getResources().getConfiguration().orientation;
            if (i == 1) {
                activity.setRequestedOrientation(isActivityReverse(activity) ? 9 : 1);
            } else if (i == 2) {
                activity.setRequestedOrientation(isActivityReverse(activity) ? 8 : 0);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public static void optimizePermissionResults(Activity activity, String[] strArr, int[] iArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            boolean zIsSpecialPermission = PermissionApi.isSpecialPermission(str);
            boolean z = true;
            if (AndroidVersion.isAndroid13() && AndroidVersion.getTargetSdkVersionCode(activity) >= 33 && equalsPermission(str, Permission.WRITE_EXTERNAL_STORAGE)) {
                zIsSpecialPermission = true;
            }
            if (!AndroidVersion.isAndroid13() && (equalsPermission(str, Permission.POST_NOTIFICATIONS) || equalsPermission(str, Permission.NEARBY_WIFI_DEVICES) || equalsPermission(str, Permission.BODY_SENSORS_BACKGROUND) || equalsPermission(str, Permission.READ_MEDIA_IMAGES) || equalsPermission(str, Permission.READ_MEDIA_VIDEO) || equalsPermission(str, Permission.READ_MEDIA_AUDIO))) {
                zIsSpecialPermission = true;
            }
            if (!AndroidVersion.isAndroid12() && (equalsPermission(str, Permission.BLUETOOTH_SCAN) || equalsPermission(str, Permission.BLUETOOTH_CONNECT) || equalsPermission(str, Permission.BLUETOOTH_ADVERTISE))) {
                zIsSpecialPermission = true;
            }
            if (!AndroidVersion.isAndroid10() && (equalsPermission(str, Permission.ACCESS_BACKGROUND_LOCATION) || equalsPermission(str, Permission.ACTIVITY_RECOGNITION) || equalsPermission(str, Permission.ACCESS_MEDIA_LOCATION))) {
                zIsSpecialPermission = true;
            }
            if (!AndroidVersion.isAndroid9() && equalsPermission(str, Permission.ACCEPT_HANDOVER)) {
                zIsSpecialPermission = true;
            }
            if (AndroidVersion.isAndroid8() || (!equalsPermission(str, Permission.ANSWER_PHONE_CALLS) && !equalsPermission(str, Permission.READ_PHONE_NUMBERS))) {
                z = zIsSpecialPermission;
            }
            if (equalsPermission(str, Permission.GET_INSTALLED_APPS) || z) {
                iArr[i] = PermissionApi.isGrantedPermission(activity, str) ? 0 : -1;
            }
        }
    }

    public static void postActivityResult(@NonNull List<String> list, @NonNull Runnable runnable) {
        long j = 300;
        long j2 = AndroidVersion.isAndroid11() ? 200L : 300L;
        if (!PhoneRomUtils.isEmui() && !PhoneRomUtils.isHarmonyOs()) {
            j = (PhoneRomUtils.isMiui() && AndroidVersion.isAndroid11() && containsPermission(list, Permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS)) ? 1000L : j2;
        } else if (!AndroidVersion.isAndroid8()) {
            j = 500;
        }
        postDelayed(runnable, j);
    }

    public static void postDelayed(@NonNull Runnable runnable, long j) {
        HANDLER.postDelayed(runnable, j);
    }

    @RequiresApi(api = 23)
    public static boolean shouldShowRequestPermissionRationale(@NonNull Activity activity, @NonNull String str) {
        if (AndroidVersion.getAndroidVersionCode() == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }

    @RequiresApi(19)
    public static boolean checkOpNoThrow(Context context, String str) {
        int iCheckOpNoThrow;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        if (AndroidVersion.isAndroid10()) {
            iCheckOpNoThrow = appOpsManager.unsafeCheckOpNoThrow(str, context.getApplicationInfo().uid, context.getPackageName());
        } else {
            iCheckOpNoThrow = appOpsManager.checkOpNoThrow(str, context.getApplicationInfo().uid, context.getPackageName());
        }
        return iCheckOpNoThrow == 0;
    }
}
