package wb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import cc.d1;
import cc.e1;
import cc.j2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import xj.p;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f53150a = new d();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        n.f(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = v.f53866a;
        }
        ArrayList arrayListM0 = xj.n.m0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.W(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            d1 d1Var = new d1();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            d1Var.f6050a = str2;
            d1Var.f6051b = runningAppProcessInfo.pid;
            byte b10 = (byte) (d1Var.f6054e | 1);
            d1Var.f6052c = runningAppProcessInfo.importance;
            d1Var.f6054e = (byte) (b10 | 2);
            d1Var.f6053d = n.a(str2, str);
            d1Var.f6054e = (byte) (d1Var.f6054e | 4);
            arrayList2.add(d1Var.a());
        }
        return arrayList2;
    }

    public final j2 b(Context context) {
        Object next;
        String processName;
        n.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e1) ((j2) next)).f6069b != iMyPid);
        j2 j2Var = (j2) next;
        if (j2Var != null) {
            return j2Var;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            n.c(processName);
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        int i10 = (12 & 4) != 0 ? 0 : 0;
        n.f(processName, "processName");
        d1 d1Var = new d1();
        d1Var.f6050a = processName;
        d1Var.f6051b = iMyPid;
        byte b10 = (byte) (d1Var.f6054e | 1);
        d1Var.f6052c = i10;
        d1Var.f6053d = false;
        d1Var.f6054e = (byte) (((byte) (b10 | 2)) | 4);
        return d1Var.a();
    }
}
