package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/ProcessDetailsProvider;", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessDetailsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProcessDetailsProvider f20290a = new ProcessDetailsProvider();

    public static CrashlyticsReport.Session.Event.Application.ProcessDetails a(ProcessDetailsProvider processDetailsProvider, String str, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        processDetailsProvider.getClass();
        CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builderA = CrashlyticsReport.Session.Event.Application.ProcessDetails.a();
        builderA.e(str);
        builderA.d(i2);
        builderA.c(i3);
        builderA.b(false);
        return builderA.a();
    }

    public static ArrayList b(Context context) {
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
            CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builderA = CrashlyticsReport.Session.Event.Application.ProcessDetails.a();
            builderA.e(runningAppProcessInfo.processName);
            builderA.d(runningAppProcessInfo.pid);
            builderA.c(runningAppProcessInfo.importance);
            builderA.b(Intrinsics.a(runningAppProcessInfo.processName, str));
            arrayList2.add(builderA.a());
        }
        return arrayList2;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails c(Context context) {
        Object next;
        String processName;
        Intrinsics.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = b(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CrashlyticsReport.Session.Event.Application.ProcessDetails) next).c() != iMyPid);
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) next;
        if (processDetails != null) {
            return processDetails;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            processName = Process.myProcessName();
            Intrinsics.c(processName);
        } else if (i2 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return a(this, processName, iMyPid, 0, 12);
    }
}
