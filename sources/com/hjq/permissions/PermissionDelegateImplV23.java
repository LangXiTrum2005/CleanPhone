package com.hjq.permissions;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 23)
class PermissionDelegateImplV23 extends PermissionDelegateImplV21 {
    private static Intent getIgnoreBatteryPermissionIntent(@NonNull Context context) {
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(PermissionUtils.getPackageNameUri(context));
        if (!PermissionUtils.areActivityIntent(context, intent)) {
            intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        }
        return !PermissionUtils.areActivityIntent(context, intent) ? PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }

    private static Intent getNotDisturbPermissionIntent(@NonNull Context context) {
        Intent intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_DETAIL_SETTINGS");
        intent.setData(PermissionUtils.getPackageNameUri(context));
        if (PhoneRomUtils.isHarmonyOs() || PhoneRomUtils.isMagicOs()) {
            intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
        }
        return !PermissionUtils.areActivityIntent(context, intent) ? PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }

    private static Intent getSettingPermissionIntent(@NonNull Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(PermissionUtils.getPackageNameUri(context));
        return !PermissionUtils.areActivityIntent(context, intent) ? PermissionIntentManager.getApplicationDetailsIntent(context) : intent;
    }

    private static boolean isGrantedIgnoreBatteryPermission(@NonNull Context context) {
        return ((PowerManager) context.getSystemService(PowerManager.class)).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    private static boolean isGrantedNotDisturbPermission(@NonNull Context context) {
        return ((NotificationManager) context.getSystemService(NotificationManager.class)).isNotificationPolicyAccessGranted();
    }

    private static boolean isGrantedSettingPermission(@NonNull Context context) {
        if (AndroidVersion.isAndroid6()) {
            return Settings.System.canWrite(context);
        }
        return true;
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public Intent getPermissionIntent(@NonNull Context context, @NonNull String str) {
        if (PermissionUtils.equalsPermission(str, Permission.WRITE_SETTINGS)) {
            return getSettingPermissionIntent(context);
        }
        if (PermissionUtils.equalsPermission(str, Permission.ACCESS_NOTIFICATION_POLICY)) {
            return getNotDisturbPermissionIntent(context);
        }
        return PermissionUtils.equalsPermission(str, Permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS) ? getIgnoreBatteryPermissionIntent(context) : super.getPermissionIntent(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(@NonNull Context context, @NonNull String str) {
        if (!AndroidVersion.isAndroid13()) {
            if (PermissionUtils.equalsPermission(str, Permission.POST_NOTIFICATIONS)) {
                return super.isGrantedPermission(context, str);
            }
            if (PermissionUtils.equalsPermission(str, Permission.NEARBY_WIFI_DEVICES)) {
                return PermissionUtils.checkSelfPermission(context, Permission.ACCESS_FINE_LOCATION);
            }
            if (PermissionUtils.equalsPermission(str, Permission.BODY_SENSORS_BACKGROUND)) {
                return PermissionUtils.checkSelfPermission(context, Permission.BODY_SENSORS);
            }
            if (PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_IMAGES) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_VIDEO) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_AUDIO)) {
                return PermissionUtils.checkSelfPermission(context, Permission.READ_EXTERNAL_STORAGE);
            }
        }
        if (!AndroidVersion.isAndroid12()) {
            if (PermissionUtils.equalsPermission(str, Permission.BLUETOOTH_SCAN)) {
                return PermissionUtils.checkSelfPermission(context, Permission.ACCESS_FINE_LOCATION);
            }
            if (PermissionUtils.equalsPermission(str, Permission.BLUETOOTH_CONNECT) || PermissionUtils.equalsPermission(str, Permission.BLUETOOTH_ADVERTISE)) {
                return true;
            }
        }
        if (!AndroidVersion.isAndroid11() && PermissionUtils.equalsPermission(str, Permission.MANAGE_EXTERNAL_STORAGE)) {
            return PermissionUtils.checkSelfPermission(context, Permission.READ_EXTERNAL_STORAGE) && PermissionUtils.checkSelfPermission(context, Permission.WRITE_EXTERNAL_STORAGE);
        }
        if (!AndroidVersion.isAndroid10()) {
            if (PermissionUtils.equalsPermission(str, Permission.ACCESS_BACKGROUND_LOCATION)) {
                return PermissionUtils.checkSelfPermission(context, Permission.ACCESS_FINE_LOCATION);
            }
            if (PermissionUtils.equalsPermission(str, Permission.ACTIVITY_RECOGNITION)) {
                return true;
            }
            if (PermissionUtils.equalsPermission(str, Permission.ACCESS_MEDIA_LOCATION)) {
                return PermissionUtils.checkSelfPermission(context, Permission.READ_EXTERNAL_STORAGE);
            }
        }
        if (!AndroidVersion.isAndroid9() && PermissionUtils.equalsPermission(str, Permission.ACCEPT_HANDOVER)) {
            return true;
        }
        if (!AndroidVersion.isAndroid8()) {
            if (PermissionUtils.equalsPermission(str, Permission.ANSWER_PHONE_CALLS)) {
                return true;
            }
            if (PermissionUtils.equalsPermission(str, Permission.READ_PHONE_NUMBERS)) {
                return PermissionUtils.checkSelfPermission(context, Permission.READ_PHONE_STATE);
            }
        }
        if (PermissionUtils.equalsPermission(str, Permission.GET_INSTALLED_APPS) || PermissionUtils.equalsPermission(str, Permission.POST_NOTIFICATIONS)) {
            return super.isGrantedPermission(context, str);
        }
        if (!PermissionUtils.isSpecialPermission(str)) {
            return PermissionUtils.checkSelfPermission(context, str);
        }
        if (PermissionUtils.equalsPermission(str, Permission.WRITE_SETTINGS)) {
            return isGrantedSettingPermission(context);
        }
        if (PermissionUtils.equalsPermission(str, Permission.ACCESS_NOTIFICATION_POLICY)) {
            return isGrantedNotDisturbPermission(context);
        }
        return PermissionUtils.equalsPermission(str, Permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS) ? isGrantedIgnoreBatteryPermission(context) : super.isGrantedPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV21, com.hjq.permissions.PermissionDelegateImplV19, com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(@NonNull Activity activity, @NonNull String str) {
        if (!AndroidVersion.isAndroid13()) {
            if (PermissionUtils.equalsPermission(str, Permission.POST_NOTIFICATIONS)) {
                return super.isPermissionPermanentDenied(activity, str);
            }
            if (PermissionUtils.equalsPermission(str, Permission.NEARBY_WIFI_DEVICES)) {
                return (PermissionUtils.checkSelfPermission(activity, Permission.ACCESS_FINE_LOCATION) || PermissionUtils.shouldShowRequestPermissionRationale(activity, Permission.ACCESS_FINE_LOCATION)) ? false : true;
            }
            if (PermissionUtils.equalsPermission(str, Permission.BODY_SENSORS_BACKGROUND)) {
                return (PermissionUtils.checkSelfPermission(activity, Permission.BODY_SENSORS) || PermissionUtils.shouldShowRequestPermissionRationale(activity, Permission.BODY_SENSORS)) ? false : true;
            }
            if (PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_IMAGES) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_VIDEO) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_AUDIO)) {
                return (PermissionUtils.checkSelfPermission(activity, Permission.READ_EXTERNAL_STORAGE) || PermissionUtils.shouldShowRequestPermissionRationale(activity, Permission.READ_EXTERNAL_STORAGE)) ? false : true;
            }
        }
        if (!AndroidVersion.isAndroid12()) {
            if (PermissionUtils.equalsPermission(str, Permission.BLUETOOTH_SCAN)) {
                return (PermissionUtils.checkSelfPermission(activity, Permission.ACCESS_FINE_LOCATION) || PermissionUtils.shouldShowRequestPermissionRationale(activity, Permission.ACCESS_FINE_LOCATION)) ? false : true;
            }
            if (PermissionUtils.equalsPermission(str, Permission.BLUETOOTH_CONNECT) || PermissionUtils.equalsPermission(str, Permission.BLUETOOTH_ADVERTISE)) {
                return false;
            }
        }
        if (!AndroidVersion.isAndroid10()) {
            if (PermissionUtils.equalsPermission(str, Permission.ACCESS_BACKGROUND_LOCATION)) {
                return (PermissionUtils.checkSelfPermission(activity, Permission.ACCESS_FINE_LOCATION) || PermissionUtils.shouldShowRequestPermissionRationale(activity, Permission.ACCESS_FINE_LOCATION)) ? false : true;
            }
            if (PermissionUtils.equalsPermission(str, Permission.ACTIVITY_RECOGNITION)) {
                return false;
            }
            if (PermissionUtils.equalsPermission(str, Permission.ACCESS_MEDIA_LOCATION)) {
                return (PermissionUtils.checkSelfPermission(activity, Permission.READ_EXTERNAL_STORAGE) || PermissionUtils.shouldShowRequestPermissionRationale(activity, Permission.READ_EXTERNAL_STORAGE)) ? false : true;
            }
        }
        if (!AndroidVersion.isAndroid9() && PermissionUtils.equalsPermission(str, Permission.ACCEPT_HANDOVER)) {
            return false;
        }
        if (!AndroidVersion.isAndroid8()) {
            if (PermissionUtils.equalsPermission(str, Permission.ANSWER_PHONE_CALLS)) {
                return false;
            }
            if (PermissionUtils.equalsPermission(str, Permission.READ_PHONE_NUMBERS)) {
                return (PermissionUtils.checkSelfPermission(activity, Permission.READ_PHONE_STATE) || PermissionUtils.shouldShowRequestPermissionRationale(activity, Permission.READ_PHONE_STATE)) ? false : true;
            }
        }
        if (PermissionUtils.equalsPermission(str, Permission.GET_INSTALLED_APPS) || PermissionUtils.equalsPermission(str, Permission.POST_NOTIFICATIONS)) {
            return super.isPermissionPermanentDenied(activity, str);
        }
        return (PermissionUtils.isSpecialPermission(str) || PermissionUtils.checkSelfPermission(activity, str) || PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
    }
}
