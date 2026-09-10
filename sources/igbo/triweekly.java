package igbo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: NavUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class triweekly {
    public static Intent attabal(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strDern = dern(activity);
        if (strDern == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strDern);
        try {
            return wireman(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static boolean beachfront(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static String dern(Activity activity) {
        try {
            return wireman(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public static void marial(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static Intent saneness(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strWireman = wireman(context, componentName);
        if (strWireman == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strWireman);
        return wireman(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String wireman(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
