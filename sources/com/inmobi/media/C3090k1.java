package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3090k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3090k1 f23737a = new C3090k1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LinkedHashSet f23738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f23739c;

    public static final boolean a(C3090k1 c3090k1, Context context) {
        c3090k1.getClass();
        try {
            Object systemService = context.getSystemService("activity");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final /* synthetic */ String b() {
        return "k1";
    }

    public final void c() {
        f23739c = true;
    }

    public final void d() {
        f23739c = false;
    }

    public static final void a(C3090k1 c3090k1, boolean z2) {
        LinkedHashSet linkedHashSet;
        c3090k1.getClass();
        if (Uc.d() == null || (linkedHashSet = f23738b) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((Ce) ((InterfaceC3058i1) it.next())).a(z2);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Context context, InterfaceC3058i1 listener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(listener, "listener");
        if (f23738b == null) {
            f23738b = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new C3074j1(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f23738b;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }
}
