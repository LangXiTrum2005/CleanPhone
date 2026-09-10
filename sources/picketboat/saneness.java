package picketboat;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import claque.taiyuan;
import igbo.formularize;
import igbo.polloi;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ContextCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class attabal {
        public static File attabal(Context context) {
            return context.getCodeCacheDir();
        }

        public static File dern(Context context) {
            return context.getNoBackupFilesDir();
        }

        public static Drawable saneness(Context context, int i) {
            return context.getDrawable(i);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class beachfront {
        public static Context attabal(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static Display dern(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Objects.toString(context);
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }

        public static String saneness(Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class competently {
        public static Intent attabal(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class dern {
        public static Context attabal(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static boolean dern(Context context) {
            return context.isDeviceProtectedStorage();
        }

        public static File saneness(Context context) {
            return context.getDataDir();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class marial {
        public static Executor attabal(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: picketboat.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContextCompat.java */
    public static class C0770saneness {
        public static int attabal(Context context, int i) {
            return context.getColor(i);
        }

        public static String dern(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }

        public static <T> T saneness(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static class wireman {
        public static Intent attabal(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, saneness.obtainAndCheckReceiverPermission(context), handler);
        }

        public static ComponentName saneness(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        technofreak.marial.wireman(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return polloi.saneness(context).attabal() ? 0 : -1;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? beachfront.attabal(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return dern.attabal(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            try {
                if (!file.exists()) {
                    if (file.mkdirs()) {
                        return file;
                    }
                    file.getPath();
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return beachfront.saneness(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return attabal.attabal(context);
    }

    public static int getColor(Context context, int i) {
        return C0770saneness.attabal(context, i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return lightstruck.impromptu.wireman(context.getResources(), i, context.getTheme());
    }

    public static Context getContextForLanguage(Context context) {
        taiyuan taiyuanVarAttabal = formularize.attabal(context);
        if (Build.VERSION.SDK_INT > 32 || taiyuanVarAttabal.marial()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        claque.beachfront.saneness(configuration, taiyuanVarAttabal);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return dern.saneness(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? beachfront.dern(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i) {
        return attabal.saneness(context, i);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? marial.attabal(context) : claque.competently.attabal(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return attabal.dern(context);
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) C0770saneness.saneness(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return C0770saneness.dern(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return dern.dern(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getApplicationContext().getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (picketboat.competently.saneness(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
            if (picketboat.competently.saneness(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            wireman.saneness(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return competently.attabal(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if (i5 >= 26) {
            return wireman.attabal(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        return ((i3 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
