package t7;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import cc.a2;
import com.applovin.impl.sdk.x;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.n;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f50553a = Process.myUid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f50554b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f50555c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f50556d = new x(19);

    public static final void a(ActivityManager activityManager) {
        if (v7.a.b(a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f50553a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        n.e(thread, "getMainLooper().thread");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        n.e(stackTrace, "stackTrace");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String string = jSONArray.toString();
                        if (!n.a(string, f50555c) && a2.z(thread)) {
                            f50555c = string;
                            android.support.v4.media.session.a.a(processErrorStateInfo.shortMsg, string).b();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            v7.a.a(a.class, th2);
        }
    }
}
