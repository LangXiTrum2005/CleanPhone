package ud;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        kotlin.jvm.internal.n.f(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = xj.v.f53866a;
        }
        ArrayList arrayListM0 = xj.n.m0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String processName = runningAppProcessInfo.processName;
            kotlin.jvm.internal.n.e(processName, "processName");
            arrayList2.add(new e0(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.n.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static e0 b(Context context) {
        Object next;
        String processName;
        kotlin.jvm.internal.n.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e0) next).f52064b != iMyPid);
        e0 e0Var = (e0) next;
        if (e0Var != null) {
            return e0Var;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            kotlin.jvm.internal.n.e(processName, "myProcessName(...)");
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                if (p9.c.f48287i == null) {
                    p9.c.f48287i = Application.getProcessName();
                }
                processName = p9.c.f48287i;
                if (processName == null) {
                    processName = "";
                }
            }
        }
        return new e0(processName, iMyPid, 0, false);
    }
}
