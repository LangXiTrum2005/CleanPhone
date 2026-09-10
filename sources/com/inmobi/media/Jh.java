package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.I2;
import com.inmobi.media.Jh;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import org.json.JSONException;
import org.objectweb.asm.Opcodes;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.rotuma;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Jh {
    public static Jb b;
    public static final Ab a = Ab.ERROR;
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final Ih d = new Ih();
    public static final ReentrantLock e = new ReentrantLock();
    public static final Function1 f = new Function1() { // from class: adsuki.hardpan
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Jh.a((I2) obj);
        }
    };
    public static final ReferenceQueue g = new ReferenceQueue();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();
    public static final AtomicBoolean i = new AtomicBoolean(false);

    public static final Unit a(I2 it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case Opcodes.FCMPG /* 150 */:
                case Opcodes.DCMPL /* 151 */:
                case Opcodes.DCMPG /* 152 */:
                    Map map = it.c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = it.c.get("data");
                        Intrinsics.competently(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        a((Q9) obj);
                    }
                    break;
            }
        } else {
            a(i2);
            c.set(false);
            ((C3349xc) Ji.e.getValue()).a(f);
            b = null;
        }
        return Unit.f29295attabal;
    }

    public static void b() {
        if (b == null && e.tryLock()) {
            try {
                if (b == null && c.get()) {
                    Context context = Ji.a;
                    if (context != null) {
                        C2968i4 c2968i4 = Y3.a;
                        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                        TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) Y3.a.a(TelemetryConfig.class)).getLoggingConfig();
                        b = new Jb(context, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * ((long) 1000), loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    Jb jb = b;
                    if (jb != null) {
                        AbstractC3172q9.a(jb);
                    }
                }
            } finally {
                e.unlock();
            }
        }
    }

    public static final void c() throws InterruptedException {
        while (c.get()) {
            a();
        }
    }

    public static void a(Object obj, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        try {
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            if (((TelemetryConfig) Y3.a.a(TelemetryConfig.class)).getLoggingConfig().getEnabled()) {
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (interfaceC3072m9 != null) {
                    h.put(new PhantomReference(obj, g), new Pair(obj.toString(), new WeakReference(interfaceC3072m9)));
                    if (i.getAndSet(true)) {
                        return;
                    }
                    saran saranVar = Sb.a;
                    Runnable runnable = new Runnable() { // from class: adsuki.herdbook
                        @Override // java.lang.Runnable
                        public final void run() throws InterruptedException {
                            Jh.c();
                        }
                    };
                    Intrinsics.checkNotNullParameter("RemoteLoggerComponent", "tag");
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    try {
                        cutely.wireman(Sb.a, null, null, new Ob(runnable, null), 3, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e2) {
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (Intrinsics.wireman(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (Intrinsics.wireman(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (Intrinsics.wireman(str2, "AB")) {
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
                if (Intrinsics.wireman(str2, "AB")) {
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

    public static C3097n9 a(String logType, String placementType) {
        Intrinsics.checkNotNullParameter(logType, "logType");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Context context = Ji.a;
        if (context != null) {
            try {
                b();
                C2968i4 c2968i4 = Y3.a;
                Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) Y3.a.a(TelemetryConfig.class)).getLoggingConfig();
                double dB = b(logType, placementType, loggingConfig);
                Ab logLevel = a(logType, placementType, loggingConfig);
                boolean z = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * ((long) 1000);
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(logLevel, "logLevel");
                return new C3097n9(context, dB, logLevel, z, maxNoOfEntries, expiry);
            } catch (Exception e2) {
                taiyuan taiyuanVar = P9.a;
                AbstractC2973i9.a(e2);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Ab a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (Intrinsics.wireman(str2, "AB")) {
                        return Bb.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (Intrinsics.wireman(str2, "AB")) {
                        return Bb.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (Intrinsics.wireman(str2, "AB")) {
                        return Bb.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return Bb.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (Intrinsics.wireman(str2, "AB")) {
                        return Bb.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return Bb.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return a;
    }

    public static void a() throws InterruptedException {
        WeakReference weakReference;
        InterfaceC3072m9 interfaceC3072m9;
        Reference referenceRemove = g.remove();
        ConcurrentHashMap concurrentHashMap = h;
        if (CollectionsKt.permissivist(concurrentHashMap.keySet(), referenceRemove)) {
            Pair pair = (Pair) concurrentHashMap.get(referenceRemove);
            if (pair != null && (weakReference = (WeakReference) pair.getSecond()) != null && (interfaceC3072m9 = (InterfaceC3072m9) weakReference.get()) != null) {
                ((C3097n9) interfaceC3072m9).a("ReferenceTracker", " reference " + pair.getFirst() + " reference is GCed.");
            }
            rotuma.wireman(concurrentHashMap).remove(referenceRemove);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((WeakReference) ((Pair) entry.getValue()).getSecond()).get() == null) {
                h.remove(entry.getKey());
            }
        }
    }

    public static void a(Q9 incident) throws JSONException {
        Intrinsics.checkNotNullParameter(incident, "incident");
        if (!(incident instanceof T4) && !(incident instanceof Wn)) {
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
            C2968i4 c2968i5 = Y3.a;
            if (((CrashConfig) c2968i5.a(CrashConfig.class)).getAnr().getAppExitReason().getReportToLogs() && (incident instanceof C3388z1)) {
                Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
                Y9 y9 = new Y9(((CrashConfig) c2968i5.a(CrashConfig.class)).getAnr().getAppExitReason().getIncompleteLogThresholdTime());
                String message = incident.a;
                String str = incident.b;
                String exitData = str == null ? "" : str;
                int i2 = ((C3388z1) incident).g;
                long j = incident.c;
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(exitData, "exitData");
                saran saranVar = Sb.a;
                Rb.a(new X9(y9, j, message, i2, exitData, null));
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3172q9.a;
        ArrayList<Ei> arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.a;
        Iterator it = Lb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Ei((Gh) it.next()));
        }
        for (Ei ei : arrayList) {
            Ab logLevel = Ab.ERROR;
            String str2 = incident.a;
            long j2 = incident.c;
            String str3 = incident.b;
            if (str3 == null) {
                str3 = "";
            }
            String message2 = "TYPE - " + str2 + ", TIMESTAMP - " + j2 + ", PAYLOAD - " + str3;
            ei.getClass();
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("LOGGER CRASH", "tag");
            Intrinsics.checkNotNullParameter(message2, "message");
            ei.a.a(logLevel, "LOGGER CRASH", message2);
            if (incident instanceof T4) {
                ei.a.b();
            }
        }
    }

    public static void a(int i2) throws JSONException {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3172q9.a;
        ArrayList<Ei> arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.a;
        Iterator it = Lb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Ei((Gh) it.next()));
        }
        for (Ei ei : arrayList) {
            Ab logLevel = Ab.ERROR;
            String message = "SYSTEM SHUTDOWN RECEIVED - " + i2;
            ei.getClass();
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("LOGGER CRASH", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            ei.a.a(logLevel, "LOGGER CRASH", message);
            ei.a.b();
        }
        c.set(false);
        ((C3349xc) Ji.e.getValue()).a(f);
        b = null;
    }
}
