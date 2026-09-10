package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/ProcessDetailsProvider;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessDetailsProvider {
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Intrinsics.f(context, "context");
        int i2 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = EmptyList.X;
        }
        ArrayList arrayListU = CollectionsKt.u(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListU) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String processName = runningAppProcessInfo.processName;
            Intrinsics.e(processName, "processName");
            arrayList2.add(new ProcessDetails(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static ProcessDetails b(Context context) {
        Object next;
        String myProcessName;
        Intrinsics.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ProcessDetails) next).f21093b != iMyPid);
        ProcessDetails processDetails = (ProcessDetails) next;
        if (processDetails != null) {
            return processDetails;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            myProcessName = Process.myProcessName();
            Intrinsics.e(myProcessName, "myProcessName(...)");
        } else if ((i2 < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
            myProcessName = "";
        }
        return new ProcessDetails(myProcessName, iMyPid, 0, false);
    }
}
