package com.hjq.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 19)
class PermissionDelegateImplV19 extends PermissionDelegateImplV18 {
    @Override // com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public Intent getPermissionIntent(@NonNull Context context, @NonNull String str) {
        if (PermissionUtils.equalsPermission(str, Permission.SYSTEM_ALERT_WINDOW)) {
            return WindowPermissionCompat.getPermissionIntent(context);
        }
        if (PermissionUtils.equalsPermission(str, Permission.GET_INSTALLED_APPS)) {
            return GetInstalledAppsPermissionCompat.getPermissionIntent(context);
        }
        if (PermissionUtils.equalsPermission(str, Permission.NOTIFICATION_SERVICE)) {
            return NotificationPermissionCompat.getPermissionIntent(context);
        }
        return (AndroidVersion.isAndroid13() || !PermissionUtils.equalsPermission(str, Permission.POST_NOTIFICATIONS)) ? super.getPermissionIntent(context, str) : NotificationPermissionCompat.getPermissionIntent(context);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(@NonNull Context context, @NonNull String str) {
        if (PermissionUtils.equalsPermission(str, Permission.SYSTEM_ALERT_WINDOW)) {
            return WindowPermissionCompat.isGrantedPermission(context);
        }
        if (PermissionUtils.equalsPermission(str, Permission.GET_INSTALLED_APPS)) {
            return GetInstalledAppsPermissionCompat.isGrantedPermission(context);
        }
        if (PermissionUtils.equalsPermission(str, Permission.NOTIFICATION_SERVICE)) {
            return NotificationPermissionCompat.isGrantedPermission(context);
        }
        return (AndroidVersion.isAndroid13() || !PermissionUtils.equalsPermission(str, Permission.POST_NOTIFICATIONS)) ? super.isGrantedPermission(context, str) : NotificationPermissionCompat.isGrantedPermission(context);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV18, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(@NonNull Activity activity, @NonNull String str) {
        if (PermissionUtils.equalsPermission(str, Permission.SYSTEM_ALERT_WINDOW)) {
            return false;
        }
        if (PermissionUtils.equalsPermission(str, Permission.GET_INSTALLED_APPS)) {
            return GetInstalledAppsPermissionCompat.isPermissionPermanentDenied(activity);
        }
        if (PermissionUtils.equalsPermission(str, Permission.NOTIFICATION_SERVICE)) {
            return false;
        }
        if (AndroidVersion.isAndroid13() || !PermissionUtils.equalsPermission(str, Permission.POST_NOTIFICATIONS)) {
            return super.isPermissionPermanentDenied(activity, str);
        }
        return false;
    }
}
