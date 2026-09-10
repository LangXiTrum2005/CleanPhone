package com.facebook.internal.instrument.anrreport;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/instrument/anrreport/ANRDetector;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ANRDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16424a = Process.myUid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f16425b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f16426c = "";
    public static final Runnable d = ANRDetector$anrDetectorRunnable$1.X;

    public static final void a(ActivityManager activityManager) {
        if (CrashShieldHandler.b(ANRDetector.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f16424a) {
                        Looper mainLooper = Looper.getMainLooper();
                        Intrinsics.e(mainLooper, "Looper.getMainLooper()");
                        Thread thread = mainLooper.getThread();
                        Intrinsics.e(thread, "Looper.getMainLooper().thread");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String string = jSONArray.toString();
                        if (!Intrinsics.a(string, f16426c) && InstrumentUtility.c(thread)) {
                            f16426c = string;
                            InstrumentData.Builder.a(processErrorStateInfo.shortMsg, string).b();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(ANRDetector.class, th);
        }
    }
}
