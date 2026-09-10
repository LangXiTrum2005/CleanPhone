package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.a;
import android.text.TextUtils;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundDispatcher implements WorkConstraintsCallback, ExecutionListener {
    public static final String l0 = Logger.e("SystemFgDispatcher");
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final WorkManagerImpl f8749Y;
    public final WorkManagerTaskExecutor Z;
    public final Object e0 = new Object();
    public String f0;
    public final LinkedHashMap g0;
    public final HashMap h0;
    public final HashSet i0;
    public final WorkConstraintsTracker j0;
    public SystemForegroundService k0;

    public interface Callback {
    }

    public SystemForegroundDispatcher(Context context) {
        this.X = context;
        WorkManagerImpl workManagerImplB = WorkManagerImpl.b(context);
        this.f8749Y = workManagerImplB;
        WorkManagerTaskExecutor workManagerTaskExecutor = workManagerImplB.d;
        this.Z = workManagerTaskExecutor;
        this.f0 = null;
        this.g0 = new LinkedHashMap();
        this.i0 = new HashSet();
        this.h0 = new HashMap();
        this.j0 = new WorkConstraintsTracker(context, workManagerTaskExecutor, this);
        workManagerImplB.f.a(this);
    }

    public static Intent a(Context context, String str, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.f8623a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.f8624b);
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.f8625c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.f8623a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.f8624b);
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.f8625c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.c().a(l0, a.C("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            WorkManagerImpl workManagerImpl = this.f8749Y;
            workManagerImpl.d.b(new StopWorkRunnable(workManagerImpl, str, true));
        }
    }

    public final void d(Intent intent) {
        int i2 = 0;
        final int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        final Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        Logger loggerC = Logger.c();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        loggerC.a(l0, a.i(intExtra2, ")", sb), new Throwable[0]);
        if (notification == null || this.k0 == null) {
            return;
        }
        ForegroundInfo foregroundInfo = new ForegroundInfo(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.g0;
        linkedHashMap.put(stringExtra, foregroundInfo);
        if (TextUtils.isEmpty(this.f0)) {
            this.f0 = stringExtra;
            this.k0.c(intExtra, intExtra2, notification);
            return;
        }
        final SystemForegroundService systemForegroundService = this.k0;
        systemForegroundService.f8751Y.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.2
            @Override // java.lang.Runnable
            public final void run() {
                SystemForegroundService.this.f0.notify(intExtra, notification);
            }
        });
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i2 |= ((ForegroundInfo) ((Map.Entry) it.next()).getValue()).f8624b;
        }
        ForegroundInfo foregroundInfo2 = (ForegroundInfo) linkedHashMap.get(this.f0);
        if (foregroundInfo2 != null) {
            this.k0.c(foregroundInfo2.f8623a, i2, foregroundInfo2.f8625c);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        Map.Entry entry;
        synchronized (this.e0) {
            try {
                WorkSpec workSpec = (WorkSpec) this.h0.remove(str);
                if (workSpec != null ? this.i0.remove(workSpec) : false) {
                    this.j0.b(this.i0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) this.g0.remove(str);
        if (str.equals(this.f0) && this.g0.size() > 0) {
            Iterator it = this.g0.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f0 = (String) entry.getKey();
            if (this.k0 != null) {
                ForegroundInfo foregroundInfo2 = (ForegroundInfo) entry.getValue();
                this.k0.c(foregroundInfo2.f8623a, foregroundInfo2.f8624b, foregroundInfo2.f8625c);
                this.k0.a(foregroundInfo2.f8623a);
            }
        }
        SystemForegroundService systemForegroundService = this.k0;
        if (foregroundInfo == null || systemForegroundService == null) {
            return;
        }
        Logger loggerC = Logger.c();
        String str2 = l0;
        int i2 = foregroundInfo.f8623a;
        int i3 = foregroundInfo.f8624b;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i2);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        loggerC.a(str2, a.i(i3, ")", sb), new Throwable[0]);
        systemForegroundService.a(foregroundInfo.f8623a);
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void f(List list) {
    }

    public final void g() {
        this.k0 = null;
        synchronized (this.e0) {
            this.j0.c();
        }
        this.f8749Y.f.d(this);
    }
}
