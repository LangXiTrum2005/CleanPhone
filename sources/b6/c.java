package b6;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import b0.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import xi.r;
import xi.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f5498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f5499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f5501e;

    public c(Context context) {
        this.f5497a = context;
    }

    public final int a(int i10) {
        Context context = this.f5497a;
        if (i10 == 17) {
            if (Build.VERSION.SDK_INT < 33) {
                if (!new l0(context).f5152b.areNotificationsEnabled()) {
                    return 0;
                }
            } else if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                return d.b(this.f5499c, "android.permission.POST_NOTIFICATIONS");
            }
            return 1;
        }
        if (i10 == 21) {
            ArrayList arrayListF = d.f(context, 21);
            if (arrayListF != null && !arrayListF.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            ArrayList arrayListF2 = d.f(context, 21);
            if (arrayListF2 != null && !arrayListF2.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i10 != 37 && i10 != 0) || b()) {
            ArrayList<String> arrayListF3 = d.f(context, i10);
            if (arrayListF3 == null) {
                Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
                return 1;
            }
            if (arrayListF3.size() == 0) {
                Log.d("permissions_handler", "No permissions found in manifest for: " + arrayListF3 + i10);
                return 0;
            }
            if (context.getApplicationInfo().targetSdkVersion >= 23) {
                HashSet hashSet = new HashSet();
                for (String str : arrayListF3) {
                    if (i10 == 16) {
                        String packageName = context.getPackageName();
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                            hashSet.add(0);
                        } else {
                            hashSet.add(1);
                        }
                    } else if (i10 == 22) {
                        hashSet.add(Integer.valueOf(Environment.isExternalStorageManager() ? 1 : 0));
                    } else if (i10 == 23) {
                        hashSet.add(Integer.valueOf(Settings.canDrawOverlays(context) ? 1 : 0));
                    } else if (i10 == 24) {
                        hashSet.add(Integer.valueOf(context.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                    } else if (i10 == 27) {
                        hashSet.add(Integer.valueOf(((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                    } else if (i10 == 34) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            hashSet.add(Integer.valueOf(((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).canScheduleExactAlarms() ? 1 : 0));
                        } else {
                            hashSet.add(1);
                        }
                    } else if (i10 == 9 || i10 == 32) {
                        int iA = b0.b.a(context, str);
                        if ((Build.VERSION.SDK_INT >= 34 ? b0.b.a(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : iA) == 0 && iA == -1) {
                            hashSet.add(3);
                        } else if (iA == 0) {
                            hashSet.add(1);
                        } else {
                            hashSet.add(Integer.valueOf(d.b(this.f5499c, str)));
                        }
                    } else if (b0.b.a(context, str) != 0) {
                        hashSet.add(Integer.valueOf(d.b(this.f5499c, str)));
                    }
                }
                if (!hashSet.isEmpty()) {
                    return d.o(hashSet).intValue();
                }
            }
            return 1;
        }
        return 0;
    }

    public final boolean b() {
        ArrayList arrayListF = d.f(this.f5497a, 37);
        boolean z10 = arrayListF != null && arrayListF.contains("android.permission.WRITE_CALENDAR");
        boolean z11 = arrayListF != null && arrayListF.contains("android.permission.READ_CALENDAR");
        if (z10 && z11) {
            return true;
        }
        if (!z10) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z11) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void c(int i10, String str) {
        if (this.f5499c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f5499c.getPackageName()));
        }
        this.f5499c.startActivityForResult(intent, i10);
        this.f5500d++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xi.r
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        int i12;
        int iCanScheduleExactAlarms;
        Activity activity = this.f5499c;
        boolean z10 = false;
        z10 = false;
        if (activity != null) {
            if (this.f5501e == null) {
                this.f5500d = 0;
                return false;
            }
            if (i10 == 209) {
                Context context = this.f5497a;
                String packageName = context.getPackageName();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    z10 = true;
                }
                i12 = 16;
                iCanScheduleExactAlarms = z10;
            } else if (i10 == 210) {
                i12 = 22;
                iCanScheduleExactAlarms = Environment.isExternalStorageManager();
            } else if (i10 == 211) {
                i12 = 23;
                iCanScheduleExactAlarms = Settings.canDrawOverlays(activity);
            } else if (i10 == 212) {
                i12 = 24;
                iCanScheduleExactAlarms = activity.getPackageManager().canRequestPackageInstalls();
            } else if (i10 == 213) {
                i12 = 27;
                iCanScheduleExactAlarms = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
            } else if (i10 == 214) {
                i12 = 34;
                iCanScheduleExactAlarms = Build.VERSION.SDK_INT >= 31 ? ((AlarmManager) activity.getSystemService(NotificationCompat.CATEGORY_ALARM)).canScheduleExactAlarms() : true;
            }
            this.f5501e.put(Integer.valueOf(i12), Integer.valueOf(iCanScheduleExactAlarms));
            int i13 = this.f5500d - 1;
            this.f5500d = i13;
            a aVar = this.f5498b;
            if (aVar != null && i13 == 0) {
                aVar.f5493b.a(this.f5501e);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xi.t
    public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        int i11;
        int i12 = 8;
        if (i10 != 24) {
            this.f5500d = 0;
            return false;
        }
        if (this.f5501e == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            this.f5500d = 0;
            Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        List listAsList = Arrays.asList(strArr);
        int iIndexOf = listAsList.indexOf("android.permission.WRITE_CALENDAR");
        if (iIndexOf >= 0) {
            int iP = d.p(this.f5499c, "android.permission.WRITE_CALENDAR", iArr[iIndexOf]);
            this.f5501e.put(36, Integer.valueOf(iP));
            int iIndexOf2 = listAsList.indexOf("android.permission.READ_CALENDAR");
            if (iIndexOf2 >= 0) {
                int iP2 = d.p(this.f5499c, "android.permission.READ_CALENDAR", iArr[iIndexOf2]);
                Integer numValueOf = Integer.valueOf(iP);
                Integer numValueOf2 = Integer.valueOf(iP2);
                HashSet hashSet = new HashSet();
                hashSet.add(numValueOf);
                hashSet.add(numValueOf2);
                Integer numO = d.o(hashSet);
                this.f5501e.put(37, numO);
                this.f5501e.put(0, numO);
            }
        }
        int i13 = 0;
        while (i13 < strArr.length) {
            String str = strArr[i13];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                int i14 = -1;
                switch (str.hashCode()) {
                    case -2062386608:
                        if (str.equals("android.permission.READ_SMS")) {
                            i14 = 0;
                        }
                        break;
                    case -1928411001:
                        if (str.equals("android.permission.READ_CALENDAR")) {
                            i14 = 1;
                        }
                        break;
                    case -1925850455:
                        if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                            i14 = 2;
                        }
                        break;
                    case -1921431796:
                        if (str.equals("android.permission.READ_CALL_LOG")) {
                            i14 = 3;
                        }
                        break;
                    case -1888586689:
                        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                            i14 = 4;
                        }
                        break;
                    case -1813079487:
                        if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                            i14 = 5;
                        }
                        break;
                    case -1783097621:
                        if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                            i14 = 6;
                        }
                        break;
                    case -1561629405:
                        if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                            i14 = 7;
                        }
                        break;
                    case -1479758289:
                        if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                            i14 = i12;
                        }
                        break;
                    case -1238066820:
                        if (str.equals("android.permission.BODY_SENSORS")) {
                            i14 = 9;
                        }
                        break;
                    case -1164582768:
                        if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                            i14 = 10;
                        }
                        break;
                    case -909527021:
                        if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                            i14 = 11;
                        }
                        break;
                    case -895679497:
                        if (str.equals("android.permission.RECEIVE_MMS")) {
                            i14 = 12;
                        }
                        break;
                    case -895673731:
                        if (str.equals("android.permission.RECEIVE_SMS")) {
                            i14 = 13;
                        }
                        break;
                    case -798669607:
                        if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                            i14 = 14;
                        }
                        break;
                    case -406040016:
                        if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                            i14 = 15;
                        }
                        break;
                    case -63024214:
                        if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                            i14 = 16;
                        }
                        break;
                    case -5573545:
                        if (str.equals("android.permission.READ_PHONE_STATE")) {
                            i14 = 17;
                        }
                        break;
                    case 52602690:
                        if (str.equals("android.permission.SEND_SMS")) {
                            i14 = 18;
                        }
                        break;
                    case 112197485:
                        if (str.equals("android.permission.CALL_PHONE")) {
                            i14 = 19;
                        }
                        break;
                    case 175802396:
                        if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                            i14 = 20;
                        }
                        break;
                    case 214526995:
                        if (str.equals("android.permission.WRITE_CONTACTS")) {
                            i14 = 21;
                        }
                        break;
                    case 361658321:
                        if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                            i14 = 22;
                        }
                        break;
                    case 463403621:
                        if (str.equals("android.permission.CAMERA")) {
                            i14 = 23;
                        }
                        break;
                    case 603653886:
                        if (str.equals("android.permission.WRITE_CALENDAR")) {
                            i14 = 24;
                        }
                        break;
                    case 610633091:
                        if (str.equals("android.permission.WRITE_CALL_LOG")) {
                            i14 = 25;
                        }
                        break;
                    case 691260818:
                        if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                            i14 = 26;
                        }
                        break;
                    case 710297143:
                        if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                            i14 = 27;
                        }
                        break;
                    case 784519842:
                        if (str.equals("android.permission.USE_SIP")) {
                            i14 = 28;
                        }
                        break;
                    case 970694249:
                        if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                            i14 = 29;
                        }
                        break;
                    case 1166454870:
                        if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                            i14 = 30;
                        }
                        break;
                    case 1271781903:
                        if (str.equals("android.permission.GET_ACCOUNTS")) {
                            i14 = 31;
                        }
                        break;
                    case 1365911975:
                        if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            i14 = 32;
                        }
                        break;
                    case 1777263169:
                        if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                            i14 = 33;
                        }
                        break;
                    case 1780337063:
                        if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                            i14 = 34;
                        }
                        break;
                    case 1831139720:
                        if (str.equals("android.permission.RECORD_AUDIO")) {
                            i14 = 35;
                        }
                        break;
                    case 1977429404:
                        if (str.equals("android.permission.READ_CONTACTS")) {
                            i14 = 36;
                        }
                        break;
                    case 2024715147:
                        if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                            i14 = 37;
                        }
                        break;
                    case 2062356686:
                        if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                            i14 = 38;
                        }
                        break;
                    case 2114579147:
                        if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                            i14 = 39;
                        }
                        break;
                    case 2133799037:
                        if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                            i14 = 40;
                        }
                        break;
                }
                switch (i14) {
                    case 0:
                    case 8:
                    case 12:
                    case 13:
                    case 18:
                        i11 = 13;
                        break;
                    case 1:
                    case 24:
                        i11 = 0;
                        break;
                    case 2:
                        i11 = 17;
                        break;
                    case 3:
                    case 10:
                    case 17:
                    case 19:
                    case 25:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    case 40:
                        i11 = i12;
                        break;
                    case 4:
                    case 16:
                        i11 = 3;
                        break;
                    case 5:
                        i11 = 22;
                        break;
                    case 6:
                        i11 = 27;
                        break;
                    case 7:
                        i11 = 23;
                        break;
                    case 9:
                        i11 = 12;
                        break;
                    case 11:
                        i11 = 31;
                        break;
                    case 14:
                        i11 = 30;
                        break;
                    case 15:
                    case 32:
                        i11 = 15;
                        break;
                    case 20:
                        i11 = 9;
                        break;
                    case 21:
                    case 31:
                    case 36:
                        i11 = 2;
                        break;
                    case 22:
                        i11 = 35;
                        break;
                    case 23:
                        i11 = 1;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                        i11 = 33;
                        break;
                    case 27:
                        i11 = 32;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                        i11 = 34;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                        i11 = 29;
                        break;
                    case 33:
                        i11 = 24;
                        break;
                    case 34:
                        i11 = 19;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        i11 = 7;
                        break;
                    case 37:
                        i11 = 4;
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        i11 = 28;
                        break;
                    case 39:
                        i11 = 18;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                if (i11 != 20) {
                    int i15 = iArr[i13];
                    if (i11 == i12) {
                        Integer num = (Integer) this.f5501e.get(8);
                        Integer numValueOf3 = Integer.valueOf(d.p(this.f5499c, str, i15));
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(num);
                        hashSet2.add(numValueOf3);
                        this.f5501e.put(8, d.o(hashSet2));
                    } else if (i11 == 7) {
                        if (!this.f5501e.containsKey(7)) {
                            this.f5501e.put(7, Integer.valueOf(d.p(this.f5499c, str, i15)));
                        }
                        if (!this.f5501e.containsKey(14)) {
                            this.f5501e.put(14, Integer.valueOf(d.p(this.f5499c, str, i15)));
                        }
                    } else if (i11 == 4) {
                        int iP3 = d.p(this.f5499c, str, i15);
                        if (!this.f5501e.containsKey(4)) {
                            this.f5501e.put(4, Integer.valueOf(iP3));
                        }
                    } else if (i11 == 3) {
                        int iP4 = d.p(this.f5499c, str, i15);
                        if (!this.f5501e.containsKey(5)) {
                            this.f5501e.put(5, Integer.valueOf(iP4));
                        }
                        this.f5501e.put(Integer.valueOf(i11), Integer.valueOf(iP4));
                    } else if (i11 == 9 || i11 == 32) {
                        this.f5501e.put(Integer.valueOf(i11), Integer.valueOf(a(i11)));
                    } else if (!this.f5501e.containsKey(Integer.valueOf(i11))) {
                        this.f5501e.put(Integer.valueOf(i11), Integer.valueOf(d.p(this.f5499c, str, i15)));
                    }
                }
            }
            i13++;
            i12 = 8;
        }
        int length = this.f5500d - iArr.length;
        this.f5500d = length;
        a aVar = this.f5498b;
        if (aVar != null && length == 0) {
            aVar.f5493b.a(this.f5501e);
        }
        return true;
    }
}
