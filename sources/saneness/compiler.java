package saneness;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class compiler {
    public static boolean attabal(Context context) {
        PowerManager powerManager;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Intrinsics.checkNotNullParameter(context, "<this>");
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        if (keyguardManager == null || (powerManager = (PowerManager) context.getSystemService(PowerManager.class)) == null || (activityManager = (ActivityManager) context.getSystemService(ActivityManager.class)) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (Process.myPid() == runningAppProcessInfo.pid) {
                if (!powerManager.isInteractive() || keyguardManager.isKeyguardLocked() || runningAppProcessInfo.importance != 100) {
                    break;
                }
                return false;
            }
        }
        return true;
    }
}
