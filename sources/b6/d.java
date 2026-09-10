package b6;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.y;
import oa.e0;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static String a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 31 && k(context, str, null)) {
            return str;
        }
        if (k(context, "android.permission.ACCESS_FINE_LOCATION", null)) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        return null;
    }

    public static int b(Activity activity, String str) {
        if (activity != null) {
            boolean z10 = activity.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
            boolean zJ = b0.b.j(activity, str);
            if (z10) {
                zJ = !zJ;
            }
            if (!z10 && zJ) {
                activity.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
            }
            if (z10 && zJ) {
                return 4;
            }
        }
        return 0;
    }

    public static r1.b c(AudioManager audioManager, i1.e eVar) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(eVar.a());
        HashMap map = new HashMap();
        map.put(2, new HashSet(com.bumptech.glide.c.a(12)));
        for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
            AudioProfile audioProfileA = q1.d.a(directProfilesForAttributes.get(i10));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (y.H(format) || r1.b.f49252e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(com.bumptech.glide.c.a(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(com.bumptech.glide.c.a(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        e0 e0VarU = j0.u();
        for (Map.Entry entry : map.entrySet()) {
            e0VarU.b(new r1.a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new r1.b(e0VarU.g());
    }

    public static AudioDeviceInfo d(AudioManager audioManager, i1.e eVar) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(eVar.a());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    public static int e(kj.e eVar) {
        Long l = eVar.f44670c;
        int pickImagesMaxLimit = (Build.VERSION.SDK_INT >= 33 || SdkExtensions.getExtensionVersion(30) >= 2) ? MediaStore.getPickImagesMaxLimit() : Integer.MAX_VALUE;
        return (l == null || l.longValue() >= ((long) pickImagesMaxLimit)) ? pickImagesMaxLimit : Math.toIntExact(l.longValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ArrayList f(Context context, int i10) {
        String strA;
        String strA2;
        String strA3;
        ArrayList arrayList = new ArrayList();
        switch (i10) {
            case 0:
            case 37:
                if (k(context, "android.permission.WRITE_CALENDAR", arrayList)) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (k(context, "android.permission.READ_CALENDAR", arrayList)) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                return arrayList;
            case 1:
                if (k(context, "android.permission.CAMERA", arrayList)) {
                    arrayList.add("android.permission.CAMERA");
                    return arrayList;
                }
                return arrayList;
            case 2:
                if (k(context, "android.permission.READ_CONTACTS", arrayList)) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (k(context, "android.permission.WRITE_CONTACTS", arrayList)) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (k(context, "android.permission.GET_ACCOUNTS", arrayList)) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                    return arrayList;
                }
                return arrayList;
            case 3:
            case 4:
            case 5:
                if (i10 != 4) {
                    if (k(context, "android.permission.ACCESS_COARSE_LOCATION", arrayList)) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (k(context, "android.permission.ACCESS_FINE_LOCATION", arrayList)) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                        return arrayList;
                    }
                } else if (k(context, "android.permission.ACCESS_BACKGROUND_LOCATION", arrayList)) {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                    return arrayList;
                }
                return arrayList;
            case 6:
            case 11:
            case 20:
                return null;
            case 7:
            case 14:
                if (k(context, "android.permission.RECORD_AUDIO", arrayList)) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                    return arrayList;
                }
                return arrayList;
            case 8:
                if (k(context, "android.permission.READ_PHONE_STATE", arrayList)) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                if (k(context, "android.permission.READ_PHONE_NUMBERS", arrayList)) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (k(context, "android.permission.CALL_PHONE", arrayList)) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (k(context, "android.permission.READ_CALL_LOG", arrayList)) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (k(context, "android.permission.WRITE_CALL_LOG", arrayList)) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (k(context, "com.android.voicemail.permission.ADD_VOICEMAIL", arrayList)) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (k(context, "android.permission.USE_SIP", arrayList)) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (k(context, "android.permission.ANSWER_PHONE_CALLS", arrayList)) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                    return arrayList;
                }
                return arrayList;
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && k(context, "android.permission.READ_MEDIA_IMAGES", arrayList)) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    return arrayList;
                }
                return arrayList;
            case 10:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            default:
                return arrayList;
            case 12:
                if (k(context, "android.permission.BODY_SENSORS", arrayList)) {
                    arrayList.add("android.permission.BODY_SENSORS");
                    return arrayList;
                }
                return arrayList;
            case 13:
                if (k(context, "android.permission.SEND_SMS", arrayList)) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (k(context, "android.permission.RECEIVE_SMS", arrayList)) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (k(context, "android.permission.READ_SMS", arrayList)) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (k(context, "android.permission.RECEIVE_WAP_PUSH", arrayList)) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (k(context, "android.permission.RECEIVE_MMS", arrayList)) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                    return arrayList;
                }
                return arrayList;
            case 15:
                if (k(context, "android.permission.READ_EXTERNAL_STORAGE", arrayList)) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                    return arrayList;
                }
                return arrayList;
            case 16:
                if (k(context, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", arrayList)) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    return arrayList;
                }
                return arrayList;
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && k(context, "android.permission.POST_NOTIFICATIONS", arrayList)) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                    return arrayList;
                }
                return arrayList;
            case 18:
                if (k(context, "android.permission.ACCESS_MEDIA_LOCATION", arrayList)) {
                    arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                    return arrayList;
                }
                return arrayList;
            case 19:
                if (k(context, "android.permission.ACTIVITY_RECOGNITION", arrayList)) {
                    arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                    return arrayList;
                }
                return arrayList;
            case 21:
                if (k(context, "android.permission.BLUETOOTH", arrayList)) {
                    arrayList.add("android.permission.BLUETOOTH");
                    return arrayList;
                }
                return arrayList;
            case 22:
                if (k(context, "android.permission.MANAGE_EXTERNAL_STORAGE", arrayList)) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    return arrayList;
                }
                return arrayList;
            case 23:
                if (k(context, "android.permission.SYSTEM_ALERT_WINDOW", arrayList)) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                    return arrayList;
                }
                return arrayList;
            case 24:
                if (k(context, "android.permission.REQUEST_INSTALL_PACKAGES", arrayList)) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    return arrayList;
                }
                return arrayList;
            case 27:
                if (k(context, "android.permission.ACCESS_NOTIFICATION_POLICY", arrayList)) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                    return arrayList;
                }
                return arrayList;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                if (Build.VERSION.SDK_INT >= 31 && (strA = a(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(strA);
                    return arrayList;
                }
                return arrayList;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                if (Build.VERSION.SDK_INT >= 31 && (strA2 = a(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(strA2);
                    return arrayList;
                }
                return arrayList;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                if (Build.VERSION.SDK_INT >= 31 && (strA3 = a(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(strA3);
                    return arrayList;
                }
                return arrayList;
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && k(context, "android.permission.NEARBY_WIFI_DEVICES", arrayList)) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                    return arrayList;
                }
                return arrayList;
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && k(context, "android.permission.READ_MEDIA_VIDEO", arrayList)) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    return arrayList;
                }
                return arrayList;
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && k(context, "android.permission.READ_MEDIA_AUDIO", arrayList)) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                    return arrayList;
                }
                return arrayList;
            case 34:
                if (k(context, "android.permission.SCHEDULE_EXACT_ALARM", arrayList)) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                    return arrayList;
                }
                return arrayList;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                if (Build.VERSION.SDK_INT >= 33 && k(context, "android.permission.BODY_SENSORS_BACKGROUND", arrayList)) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                    return arrayList;
                }
                return arrayList;
            case 36:
                if (k(context, "android.permission.WRITE_CALENDAR", arrayList)) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    return arrayList;
                }
                return arrayList;
        }
    }

    public static int g() {
        if (Build.VERSION.SDK_INT < 33 && SdkExtensions.getExtensionVersion(30) < 2) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    public static Object h(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList i(Bundle bundle, String str) {
        return bundle.getParcelableArrayList(str, Bundle.class);
    }

    public static String j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean k(Context context, String str, ArrayList arrayList) {
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e10);
                return false;
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(context.getPackageName(), 4096);
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static boolean m(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Arrays.asList((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(context.getPackageName(), 4096)).requestedPermissions).contains("android.permission.CAMERA");
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void n(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static Integer o(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        return hashSet.contains(3) ? 3 : 1;
    }

    public static int p(Activity activity, String str, int i10) {
        if (i10 == -1) {
            return b(activity, str);
        }
        return 1;
    }
}
