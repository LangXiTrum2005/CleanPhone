package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.z4;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AppLovinExceptionHandler f9284e = new AppLovinExceptionHandler();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f9285a = new HashSet(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9286b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9287c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f9288d;

    private String a(Throwable th2, int i10) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i10, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f9284e;
    }

    public void addSdk(l lVar) {
        if (this.f9285a.contains(lVar)) {
            return;
        }
        this.f9285a.add(lVar);
    }

    public void enable() {
        if (this.f9286b.compareAndSet(false, true)) {
            this.f9288d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (this.f9287c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long jLongValue = 500;
        for (l lVar : this.f9285a) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", th2.toString());
            Integer num = (Integer) lVar.a(z4.M6);
            if (num.intValue() > 0) {
                mapHashMap.put("details", a(th2, num.intValue()));
            }
            lVar.E().d(f2.X0, mapHashMap);
            lVar.G().trackEventSynchronously(X3.i.f27789e0);
            jLongValue = ((Long) lVar.a(z4.f10247s3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9288d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
