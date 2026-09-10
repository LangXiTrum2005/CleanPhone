package igbo;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: ActivityCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends picketboat.saneness {

    /* JADX INFO: compiled from: ActivityCompat.java */
    public static class attabal {
        public static void attabal(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        public static boolean saneness(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    public static class dern {
        public static boolean attabal(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: igbo.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityCompat.java */
    public static class C0642saneness {
        public static boolean attabal(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    public interface wireman {
        void wireman(int i);
    }

    public static /* synthetic */ void attabal(Activity activity) {
        if (activity.isFinishing() || igbo.wireman.taiyuan(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void beachfront(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void competently(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void dern(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: igbo.attabal
                @Override // java.lang.Runnable
                public final void run() {
                    saneness.attabal(activity);
                }
            });
        }
    }

    public static boolean marial(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return dern.attabal(activity, str);
        }
        return i == 31 ? C0642saneness.attabal(activity, str) : attabal.saneness(activity, str);
    }

    public static void saneness(Activity activity) {
        activity.finishAffinity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void wireman(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof wireman) {
            ((wireman) activity).wireman(i);
        }
        attabal.attabal(activity, strArr, i);
    }
}
