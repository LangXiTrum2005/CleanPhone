package com.inmobi.media;

import A.RunnableC0895i;
import android.content.Context;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Cb implements N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2932a7 f22744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3016f7 f22745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f22746c;
    public static TelemetryConfig d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static CrashConfig f22747e;
    public static final ReentrantLock f;
    public static final Bb g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReferenceQueue f22748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f22749i;
    public static final AtomicBoolean j;

    static {
        Cb cb = new Cb();
        f22744a = EnumC2932a7.ERROR;
        f22746c = new AtomicBoolean(false);
        f = new ReentrantLock();
        g = Bb.f22724a;
        f22748h = new ReferenceQueue();
        f22749i = new ConcurrentHashMap();
        j = new AtomicBoolean(false);
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("telemetry", Uc.b(), cb);
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        d = (TelemetryConfig) configA;
        Config configA2 = M2.a("crashReporting", Uc.b(), cb);
        Intrinsics.d(configA2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.CrashConfig");
        f22747e = (CrashConfig) configA2;
    }

    public static A5 a(String logType, String placementType, boolean z2) {
        Intrinsics.f(logType, "logType");
        Intrinsics.f(placementType, "placementType");
        Context contextD = Uc.d();
        if (contextD != null) {
            try {
                b();
                TelemetryConfig.LoggingConfig loggingConfig = d.getLoggingConfig();
                double dB = b(logType, placementType, loggingConfig);
                EnumC2932a7 logLevel = a(logType, placementType, loggingConfig);
                boolean z3 = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * ((long) 1000);
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                Intrinsics.f(logLevel, "logLevel");
                return new A5(contextD, dB, logLevel, z3, z2, maxNoOfEntries, expiry, false);
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
            }
        }
        return null;
    }

    public static void b() {
        if (f22745b == null && f.tryLock()) {
            try {
                if (f22745b == null && f22746c.get()) {
                    Context contextD = Uc.d();
                    if (contextD != null) {
                        TelemetryConfig.LoggingConfig loggingConfig = d.getLoggingConfig();
                        f22745b = new C3016f7(contextD, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * ((long) 1000), loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    C3016f7 c3016f7 = f22745b;
                    if (c3016f7 != null) {
                        D5.a(c3016f7);
                    }
                }
            } finally {
                f.unlock();
            }
        }
    }

    public static final void c() {
        WeakReference weakReference;
        InterfaceC3333z5 interfaceC3333z5;
        while (f22746c.get()) {
            Reference referenceRemove = f22748h.remove();
            ConcurrentHashMap concurrentHashMap = f22749i;
            if (CollectionsKt.o(concurrentHashMap.keySet(), referenceRemove)) {
                Pair pair = (Pair) concurrentHashMap.get(referenceRemove);
                if (pair != null && (weakReference = (WeakReference) pair.f43249Y) != null && (interfaceC3333z5 = (InterfaceC3333z5) weakReference.get()) != null) {
                    ((A5) interfaceC3333z5).a("ReferenceTracker", android.support.v4.media.a.r(new StringBuilder(" reference "), (String) pair.X, " reference is GCed."));
                }
                TypeIntrinsics.b(concurrentHashMap).remove(referenceRemove);
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((WeakReference) ((Pair) entry.getValue()).f43249Y).get() == null) {
                    f22749i.remove(entry.getKey());
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC2932a7 a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (Intrinsics.a(str2, "AB")) {
                        return AbstractC2949b7.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return AbstractC2949b7.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (Intrinsics.a(str2, "AB")) {
                        return AbstractC2949b7.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return AbstractC2949b7.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (Intrinsics.a(str2, "AB")) {
                        return AbstractC2949b7.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return AbstractC2949b7.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return AbstractC2949b7.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (Intrinsics.a(str2, "AB")) {
                        return AbstractC2949b7.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return AbstractC2949b7.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return AbstractC2949b7.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f22744a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (Intrinsics.a(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (Intrinsics.a(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (Intrinsics.a(str2, "AB")) {
                    return loggingConfig.getInt_native().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_native().getNonAb().getSamplePercent();
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (!str.equals("intHtml")) {
                    return 0.01d;
                }
                if (Intrinsics.a(str2, "AB")) {
                    return loggingConfig.getInt_html().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_html().getNonAb().getSamplePercent();
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static void a(Object obj, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(obj, "obj");
        try {
            if (d.getLoggingConfig().getEnabled()) {
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (interfaceC3333z5 != null) {
                    f22749i.put(new PhantomReference(obj, f22748h), new Pair(obj.toString(), new WeakReference(interfaceC3333z5)));
                    if (j.getAndSet(true)) {
                        return;
                    }
                    try {
                        AbstractC3112l7.f23770b.submit(new RunnableC0895i(0));
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        if (config instanceof TelemetryConfig) {
            d = (TelemetryConfig) config;
            C3016f7 c3016f7 = f22745b;
            if (c3016f7 != null) {
                c3016f7.g.set(true);
            }
            f22745b = null;
            Ie.f22893a.execute(new RunnableC0895i(1));
            return;
        }
        if (config instanceof CrashConfig) {
            f22747e = (CrashConfig) config;
        }
    }

    public static final void a() {
        b();
    }
}
