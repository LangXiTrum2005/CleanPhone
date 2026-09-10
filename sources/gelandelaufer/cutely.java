package gelandelaufer;

import amount.sealless;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProcessDetailsProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgelandelaufer/cutely;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lamount/sealless$marial$wireman$attabal$dern;", "wireman", "(Landroid/content/Context;)Ljava/util/List;", "marial", "(Landroid/content/Context;)Lamount/sealless$marial$wireman$attabal$dern;", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "saneness", "(Ljava/lang/String;IIZ)Lamount/sealless$marial$wireman$attabal$dern;", "beachfront", "()Ljava/lang/String;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final cutely f26651attabal = new cutely();

    public static /* synthetic */ sealless.marial.wireman.attabal.dern dern(cutely cutelyVar, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return cutelyVar.saneness(str, i, i2, z);
    }

    public final sealless.marial.wireman.attabal.dern attabal(String processName, int i, int i2) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return dern(this, processName, i, i2, false, 8, null);
    }

    public final String beachfront() {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i <= 33) {
            return (i < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        Intrinsics.checkNotNullExpressionValue(strMyProcessName, "{\n      Process.myProcessName()\n    }");
        return strMyProcessName;
    }

    public final sealless.marial.wireman.attabal.dern marial(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = wireman(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((sealless.marial.wireman.attabal.dern) next).dern() != iMyPid);
        sealless.marial.wireman.attabal.dern dernVar = (sealless.marial.wireman.attabal.dern) next;
        return dernVar == null ? dern(this, beachfront(), iMyPid, 0, false, 12, null) : dernVar;
    }

    public final sealless.marial.wireman.attabal.dern saneness(String processName, int pid, int importance, boolean isDefaultProcess) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        sealless.marial.wireman.attabal.dern dernVarAttabal = sealless.marial.wireman.attabal.dern.attabal().marial(processName).wireman(pid).dern(importance).saneness(isDefaultProcess).attabal();
        Intrinsics.checkNotNullExpressionValue(dernVarAttabal, "builder()\n      .setProc…ltProcess)\n      .build()");
        return dernVarAttabal;
    }

    public final List<sealless.marial.wireman.attabal.dern> wireman(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = adultoid.formularize();
        }
        List listTreadless = CollectionsKt.treadless(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listTreadless) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(sealless.marial.wireman.attabal.dern.attabal().marial(runningAppProcessInfo.processName).wireman(runningAppProcessInfo.pid).dern(runningAppProcessInfo.importance).saneness(Intrinsics.wireman(runningAppProcessInfo.processName, str)).attabal());
        }
        return arrayList2;
    }
}
