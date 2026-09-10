package com.chartboost.sdk.impl;

import android.util.Log;
import com.chartboost.sdk.LoggingLevel;
import com.thinkup.core.common.n.mo;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final za f15712a = new za();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LoggingLevel f15713b = LoggingLevel.INTEGRATION;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f15714c = new ConcurrentHashMap();
    public static Boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f15715e;

    public enum a {
        DEBUG,
        ERROR,
        WARNING,
        INFO,
        VERBOSE,
        WTF;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f15720i = EnumEntriesKt.a(a());
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15721a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VERBOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.WTF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f15721a = iArr;
        }
    }

    public static final void a(String msg, Throwable th) {
        Intrinsics.f(msg, "msg");
        f15712a.a(a.DEBUG, msg, th);
    }

    public static final void b(String msg, Throwable th) {
        Intrinsics.f(msg, "msg");
        f15712a.a(a.ERROR, msg, th);
    }

    public static final void c(String msg, Throwable th) {
        Intrinsics.f(msg, "msg");
        f15712a.a(a.INFO, msg, th);
    }

    public static final void d(String msg, Throwable th) {
        Intrinsics.f(msg, "msg");
        f15712a.a(a.VERBOSE, msg, th);
    }

    public static final void e(String msg, Throwable th) {
        Intrinsics.f(msg, "msg");
        f15712a.a(a.WARNING, msg, th);
    }

    public static /* synthetic */ void a(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        a(str, th);
    }

    public static /* synthetic */ void b(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        b(str, th);
    }

    public static /* synthetic */ void c(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        c(str, th);
    }

    public static /* synthetic */ void d(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        d(str, th);
    }

    public static /* synthetic */ void e(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        e(str, th);
    }

    public final String a(int i2) {
        StackTraceElement stackTraceElementC = c(i2);
        if (stackTraceElementC == null) {
            return "";
        }
        String str = stackTraceElementC.getClassName() + ":" + stackTraceElementC.getMethodName() + ":" + stackTraceElementC.getLineNumber();
        ConcurrentHashMap concurrentHashMap = f15714c;
        Object objN = concurrentHashMap.get(str);
        if (objN == null) {
            if (concurrentHashMap.size() >= 1000) {
                Set setKeySet = concurrentHashMap.keySet();
                Intrinsics.e(setKeySet, "<get-keys>(...)");
                Iterator it = CollectionsKt.d0(setKeySet, 250).iterator();
                while (it.hasNext()) {
                    f15714c.remove((String) it.next());
                }
            }
            String className = stackTraceElementC.getClassName();
            Intrinsics.e(className, "getClassName(...)");
            objN = androidx.media3.extractor.text.ttml.a.n(StringsKt.Q('.', className, className), mo.ono, stackTraceElementC.getMethodName(), "():");
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, objN);
            if (objPutIfAbsent != null) {
                objN = objPutIfAbsent;
            }
        }
        Intrinsics.e(objN, "getOrPut(...)");
        return (String) objN;
    }

    public final String b(int i2) {
        StackTraceElement stackTraceElementC = c(i2);
        if (stackTraceElementC != null) {
            String className = stackTraceElementC.getClassName();
            Intrinsics.e(className, "getClassName(...)");
            String strN = androidx.media3.extractor.text.ttml.a.n(StringsKt.Q('.', className, className), mo.ono, stackTraceElementC.getMethodName(), "():");
            return strN == null ? "" : strN;
        }
        return "";
    }

    public final StackTraceElement c(int i2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > i2) {
            return stackTrace[i2];
        }
        return null;
    }

    public static /* synthetic */ String b(za zaVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8;
        }
        return zaVar.b(i2);
    }

    public static /* synthetic */ String a(za zaVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8;
        }
        return zaVar.a(i2);
    }

    public final boolean a() {
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (f15715e) {
            return false;
        }
        try {
            f15715e = true;
            qf qfVar = (qf) w3.f15454b.a().b().get();
            boolean z2 = qfVar != null ? qfVar.m : false;
            d = Boolean.valueOf(z2);
            return z2;
        } catch (Exception unused) {
            d = Boolean.FALSE;
            return false;
        } finally {
            f15715e = false;
        }
    }

    public final void a(a aVar, String str, Throwable th) {
        String strB;
        if (f15713b == LoggingLevel.ALL || f15713b == LoggingLevel.INTEGRATION) {
            if (a()) {
                strB = a(this, 0, 1, (Object) null);
            } else {
                strB = b(this, 0, 1, (Object) null);
            }
            String strD = android.support.v4.media.a.D(strB, " ", str);
            switch (b.f15721a[aVar.ordinal()]) {
                case 1:
                    Log.d("[ChartboostMonetization]", strD, th);
                    break;
                case 2:
                    Log.e("[ChartboostMonetization]", strD, th);
                    break;
                case 3:
                    Log.w("[ChartboostMonetization]", strD, th);
                    break;
                case 4:
                    Log.i("[ChartboostMonetization]", strD, th);
                    break;
                case 5:
                    Log.v("[ChartboostMonetization]", strD, th);
                    break;
                case 6:
                    Log.wtf("[ChartboostMonetization]", strD, th);
                    break;
            }
        }
    }
}
